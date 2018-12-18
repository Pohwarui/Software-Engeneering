package com.tiancheng.homework.service;


import com.tiancheng.homework.domain.*;
import com.tiancheng.homework.domain.Process;
import com.tiancheng.homework.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
/* Dssign bu Pohwarui */
public class Service {

    /**  考生映射接口 **/
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

    private final  String nul = "";

    /**
     * 加入考生
     * @param examinee 考生信息
     * @return 加入是否成功
     */
    public boolean addExaminee(Examinee examinee) {
        try {
            examineeMapper.insert(examinee);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 加入考试
     * @param exam 考试信息
     * @return 考试加入是否成功
     */
    public boolean addExam(Exam exam) {
        try {
            examMapper.insert(exam);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 加入成绩
     * @param grade 成绩信息
     * @return 成绩加入是否成功
     */
    public boolean addGrade(Grade grade) {
        try {
            gradeMapper.insert(grade);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 加入学生
     * @param person 学生信息
     * @return 学生加入是否成功
     */
    public boolean addPerson(Person person) {
        try {
            personMapper.insert(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

/*
    public Examinee selectExamineeById(Integer id) {
       Examinee examinee;
        try {
            examinee = examineeMapper.selectByPrimaryKey(id);
        } catch(Exception e) {
            return null;
        }
        return examinee;
    }


    public <list>ExamineeExample selectByExample(Examinee examinee) {
        ExamineeExample examineeResponse = new ExamineeExample();
        ExamineeExample.Criteria criteria = examineeResponse.createCriteria();
        //根据ID查找
        if(!nul.equals(examinee.getIdExaminee())){
            criteria = criteria.andIdExamineeEqualTo(examinee.getIdExaminee());
        }
        try {
           examinee = examineeMapper.selectByExample(examinee);
       } catch(Exception e) {
           return null;
        }
        return examineeResponse;
    }

    public <list>ExamExample selectByExample(Exam exam) {
        ExamExample examResponse = new ExamExample();
        ExamExample.Criteria criteria = examResponse.createCriteria();
        //根据ID查找
        if(!nul.equals(exam.getExamID())){
            criteria = criteria.andExamIDEqualTo(exam.getExamID());
        }
        return examResponse;
    }

    public <list>GradeExample selectByExample(Grade grade) {
        GradeExample gradeResponse = new GradeExample();
        GradeExample.Criteria criteria = gradeResponse.createCriteria();
        //根据ID查找
        if(!nul.equals(grade.getIdExaminee())){
            criteria = criteria.andIdExamineeEqualTo(grade.getIdExaminee());
        }
        return gradeResponse;
    }

    public <list>PersonExample selectByExample(Person person) {
        PersonExample personResponse = new PersonExample();
        PersonExample.Criteria criteria = personResponse.createCriteria();
        //根据ID查找
        if(!nul.equals(person.getIdperson())){
            criteria = criteria.andIdpersonEqualTo(person.getIdperson());
        }
        return personResponse;
    }
*/

    /**
     * 根据准考证号搜索考生信息
     * @param id 准考证号
     * @return 考生信息
     */
    public Examinee getExamineeById(int id) {
        return examineeMapper.selectById(id);
    }

    /**
     *  获取考试新闻
     * @return 考试新闻
     */
    public List<News> getNews() {
        return newsMapper.selectAll();
    }

    /**
     * 获取日程安排
     * @return 日程安排
     */
    public List<Richeng> getRicheng() {
        return richengMapper.selectAll();
    }

    /**
     * 获取考生服务
     * @return 考生服务
     */
    public List<Server> getServer() {return serverMapper.selectAll();}

    /**
     * 获取报名流程
     * @return 报名流程
     */
    public List<Process> getProcess() {return processMapper.selectAll();}

    /**
     * 登陆
     * @param sn 学校编号
     * @param number 学号
     * @param password 密码
     * @return 是否登陆成功
     */
    public boolean login(String sn, String number, String password)  {
        String pwd = examineeMapper.selectLogin(sn, number);
        if(password.equals(pwd)) {
            return true;
        } else {
            return false;
        }
    }
}
