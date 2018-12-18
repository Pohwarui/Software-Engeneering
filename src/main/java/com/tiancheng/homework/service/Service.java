package com.tiancheng.homework.service;


import com.tiancheng.homework.domain.*;
import com.tiancheng.homework.domain.Process;
import com.tiancheng.homework.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private ExamineeMapper examineeMapper;
    @Autowired
    private ExamMapper examMapper;
    @Autowired
    private GradeMapper gradeMapper;
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private NewsMapper newsMapper;
    @Autowired
    private RichengMapper richengMapper;
    @Autowired
    private ServerMapper serverMapper;
    @Autowired
    private ProcessMapper processMapper;


    public boolean addExaminee(Examinee examinee) {
        try {
            examineeMapper.insert(examinee);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean addExam(Exam exam) {
        try {
            examMapper.insert(exam);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean addGrade(Grade grade) {
        try {
            gradeMapper.insert(grade);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public boolean addPerson(Person person) {
        try {
            personMapper.insert(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


//    public Examinee selectExamineeById(Integer id) {
//        Examinee examinee;
//        try {
//            examinee = examineeMapper.selectByPrimaryKey(id);
//        } catch(Exception e) {
//            return null;
//        }
//        return examinee;
//    }

    public <list>ExamineeExample selectByExample(Examinee examinee) {
        ExamineeExample examinee_response = new ExamineeExample();
        ExamineeExample.Criteria criteria = examinee_response.createCriteria();
        //根据ID查找
        if(!examinee.getIdExaminee().equals("")){
            criteria = criteria.andIdExamineeEqualTo(examinee.getIdExaminee());
        }
//        try {
//            examinee = examineeMapper.selectByExample(examinee);
//        } catch(Exception e) {
//            return null;
//        }
        return examinee_response;
    }

    public <list>ExamExample selectByExample(Exam exam) {
        ExamExample exam_response = new ExamExample();
        ExamExample.Criteria criteria = exam_response.createCriteria();
        //根据ID查找
        if(!exam.getExamID().equals("")){
            criteria = criteria.andExamIDEqualTo(exam.getExamID());
        }
        return exam_response;
    }

    public <list>GradeExample selectByExample(Grade grade) {
        GradeExample grade_response = new GradeExample();
        GradeExample.Criteria criteria = grade_response.createCriteria();
        //根据ID查找
        if(!grade.getIdExaminee().equals("")){
            criteria = criteria.andIdExamineeEqualTo(grade.getIdExaminee());
        }
        return grade_response;
    }

    public <list>PersonExample selectByExample(Person person) {
        PersonExample person_response = new PersonExample();
        PersonExample.Criteria criteria = person_response.createCriteria();
        //根据ID查找
        if(!person.getIdperson().equals("")){
            criteria = criteria.andIdpersonEqualTo(person.getIdperson());
        }
        return person_response;
    }

    public Examinee getExamineeById(int id) {
        return examineeMapper.selectById(id);
    }

    public List<News> getNews() {
        return newsMapper.selectAll();
    }


    public List<Richeng> getRicheng() {
        return richengMapper.selectAll();
    }

    public List<Server> getServer() {return serverMapper.selectAll();}

    public List<Process> getProcess() {return processMapper.selectAll();}

    public
}
