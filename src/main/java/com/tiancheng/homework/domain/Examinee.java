package com.tiancheng.homework.domain;

public class Examinee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examinee.idExaminee
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private Integer idExaminee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examinee.idperson
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private Integer idperson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examinee.name
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examinee.age
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examinee.sex
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examinee.photo
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column examinee.institutions
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String institutions;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examinee.idExaminee
     *
     * @return the value of examinee.idExaminee
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public Integer getIdExaminee() {
        return idExaminee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examinee.idExaminee
     *
     * @param idExaminee the value for examinee.idExaminee
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setIdExaminee(Integer idExaminee) {
        this.idExaminee = idExaminee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examinee.idperson
     *
     * @return the value of examinee.idperson
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public Integer getIdperson() {
        return idperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examinee.idperson
     *
     * @param idperson the value for examinee.idperson
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setIdperson(Integer idperson) {
        this.idperson = idperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examinee.name
     *
     * @return the value of examinee.name
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examinee.name
     *
     * @param name the value for examinee.name
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examinee.age
     *
     * @return the value of examinee.age
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examinee.age
     *
     * @param age the value for examinee.age
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examinee.sex
     *
     * @return the value of examinee.sex
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examinee.sex
     *
     * @param sex the value for examinee.sex
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examinee.photo
     *
     * @return the value of examinee.photo
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examinee.photo
     *
     * @param photo the value for examinee.photo
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column examinee.institutions
     *
     * @return the value of examinee.institutions
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getInstitutions() {
        return institutions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column examinee.institutions
     *
     * @param institutions the value for examinee.institutions
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setInstitutions(String institutions) {
        this.institutions = institutions == null ? null : institutions.trim();
    }
}