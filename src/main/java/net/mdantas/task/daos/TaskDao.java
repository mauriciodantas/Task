package net.mdantas.task.daos;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import net.mdantas.task.models.Task;

public class TaskDao
{

   @Inject
   private EntityManager manager;

   public List<Task> all()
   {
      return manager.createQuery("select t from Task t", Task.class).getResultList();
   }

   public void save(Task task)
   {
	  manager.getTransaction().begin();
      manager.persist(task);
      manager.getTransaction().commit();
   }

   public Task findById(Integer id)
   {
      return manager.find(Task.class, id);
   }

   public void remove(Task task)
   {  manager.getTransaction().begin();
      manager.remove(task);
      manager.getTransaction().commit();;
   }

   public void update(Task task)
   {
	  manager.getTransaction().begin();
      manager.merge(task);
      manager.getTransaction().commit();
      
   }

}
