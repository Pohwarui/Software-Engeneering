package com.tiancheng.homework.domain;

public class Person {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.idperson
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private Integer idperson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.name
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.sex
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.age
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.institutions
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String institutions;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.Qualifications
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String qualifications;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.photo
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    private String photo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.idperson
     *
     * @return the value of person.idperson
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public Integer getIdperson() {
        return idperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.idperson
     *
     * @param idperson the value for person.idperson
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setIdperson(Integer idperson) {
        this.idperson = idperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.name
     *
     * @return the value of person.name
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.name
     *
     * @param name the value for person.name
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.sex
     *
     * @return the value of person.sex
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.sex
     *
     * @param sex the value for person.sex
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.age
     *
     * @return the value of person.age
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.age
     *
     * @param age the value for person.age
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.institutions
     *
     * @return the value of person.institutions
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getInstitutions() {
        return institutions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.institutions
     *
     * @param institutions the value for person.institutions
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setInstitutions(String institutions) {
        this.institutions = institutions == null ? null : institutions.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.Qualifications
     *
     * @return the value of person.Qualifications
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getQualifications() {
        return qualifications;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.Qualifications
     *
     * @param qualifications the value for person.Qualifications
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setQualifications(String qualifications) {
        this.qualifications = qualifications == null ? null : qualifications.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.photo
     *
     * @return the value of person.photo
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.photo
     *
     * @param photo the value for person.photo
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}