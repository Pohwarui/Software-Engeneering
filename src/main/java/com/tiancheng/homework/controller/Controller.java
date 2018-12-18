package com.tiancheng.homework.controller;

import com.tiancheng.homework.domain.*;
import com.tiancheng.homework.domain.Process;
import com.tiancheng.homework.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("uem")
public class Controller {

    /**  Service层映射接口 **/
    @Autowired
    private Service service;

    /**
     * 加入考生
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("addExaminee")
    public boolean addExaminee(HttpServletRequest request, HttpServletResponse response){

        Examinee examinee = new Examinee();
        examinee.setName(name);

        service.addExaminee(examinee);

        return true;
    }

    /**
     * 加入考试
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("addExam")
    public boolean addExam(HttpServletRequest  request, HttpServletResponse response){
        String name = request.getParameter("name");

        Exam exam = new Exam();
        exam.setName(name);

        service.addExam(exam);

        return true;
    }

    /**
     * 加入成绩
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("addGrade")
    public boolean addGrade(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");

        Grade grade = new Grade();
        grade.setName(name);

        service.addGrade(grade);

        return true;
    }

    /**
     * 加入学生
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("addPerson")
    public boolean addPerson(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");

        Person person = new Person();
        person.setName(name);

        service.addPerson(person);

        return true;
    }
/*
    @RequestMapping("selectByExample")
    public ExamineeExample selectExamineeById(Examinee id) {
        return service.selectByExample(id);
    }

    @RequestMapping("selectByExample")
    public ExamExample selectExamById(Exam id) {
        return service.selectByExample(id);
    }

    @RequestMapping("selectByExample")
    public GradeExample selectGradeById(Grade id) {
        return service.selectByExample(id);
    }

    @RequestMapping("selectByExample")
    public PersonExample selectExamineeById(Person id) {
        return service.selectByExample(id);
    }*/

    /**
     * 
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("getSingleExamineeInfo")
    @ResponseBody
    public Examinee getSingleExamineeInfo(HttpServletRequest request, HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));

        int id = 1;
        Examinee examinee = service.getExamineeById(id);
        if(examinee != null) {
            return examinee;
        } else {
            return null;
        }
    }

    /**
     * 加入考生
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("getAllServerInfo")
    @ResponseBody
    public List<Server> getServerInfo(HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));
        List<Server> server = service.getServer();
        if(server != null) {
            return server;
        } else {
            return null;
        }
    }

    /**
     * 加入考生
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("getAllNewsInfo")
    @ResponseBody
    public List<News> getNewsInfo(HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));
        List<News> news = service.getNews();
        if(news != null) {
            return news;
        } else {
            return null;
        }
    }

    /**
     * 加入考生
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("getAllRichengInfo")
    @ResponseBody
    public List<Richeng> getRichengInfo(HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));
        List<Richeng> richeng = service.getRicheng();
        if(richeng != null) {
            return richeng;
        } else {
            return null;
        }
    }

    /**
     * 加入考生
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("getAllProcessInfo")
    @ResponseBody
    public List<Process> getProcessInfo(HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));
        List<Process> process = service.getProcess();
        if(process != null) {
            return process;
        } else {
            return null;
        }
    }

    /**
     * 加入考生
     * @param request
     * @param response
     * @return 加入是否成功
     */
    @RequestMapping("login")
    @ResponseBody
    public boolean login(HttpServletRequest request, HttpServletResponse response) {
       /* String sn = request.getParameter("sn");
        String pwd = request.getParameter("pwd");*/
       String sn = "1";
       String number = "123";
       String password = "123";

       return service.login(sn, number, password);
    }
}
