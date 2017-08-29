package net.mdantas.task.controllers;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import net.mdantas.task.daos.TaskDao;
import net.mdantas.task.models.Estado;
import net.mdantas.task.models.Task;

@Model
public class TaskController
{
	
	private List<Task> taskList;
	private Task task;

	@Inject
	private TaskDao taskDao;
	
	@PostConstruct
	private void init(){
		this.taskList = taskDao.all();
		this.task = new Task();
	}
	
	public String remover(Task task){
		taskDao.remove(task);
		return "/task/list?faces-redirect=true";
	}
	
	public String salvar(){
		taskDao.save(task);
		return "/task/list?faces-redirect=true";
	}
	
	public String concluir(Task task){
		task.setEstado(Estado.CONCLUIDA);
		taskDao.save(task);
		return "/task/list?faces-redirect=true";
	}
	
	public void alterar(Task task){
		this.task = task;
	}
	
	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
	
	

}