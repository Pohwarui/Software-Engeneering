package com.tiancheng.homework.domain;

public class Process {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process.idprocess
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    private Integer idprocess;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process.path
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process.timevalue
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    private String timevalue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process.title
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    private String title;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process.idprocess
     *
     * @return the value of process.idprocess
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    public Integer getIdprocess() {
        return idprocess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process.idprocess
     *
     * @param idprocess the value for process.idprocess
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    public void setIdprocess(Integer idprocess) {
        this.idprocess = idprocess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process.path
     *
     * @return the value of process.path
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process.path
     *
     * @param path the value for process.path
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process.timevalue
     *
     * @return the value of process.timevalue
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    public String getTimevalue() {
        return timevalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process.timevalue
     *
     * @param timevalue the value for process.timevalue
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    public void setTimevalue(String timevalue) {
        this.timevalue = timevalue == null ? null : timevalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process.title
     *
     * @return the value of process.title
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process.title
     *
     * @param title the value for process.title
     *
     * @mbg.generated Sun Dec 16 20:59:44 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}