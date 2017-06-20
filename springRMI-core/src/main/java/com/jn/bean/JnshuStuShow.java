package com.jn.bean;

import java.io.Serializable;

public class JnshuStuShow implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_stuShow.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_stuShow.counsellor
     *
     * @mbggenerated
     */
    private String counsellor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_stuShow.img
     *
     * @mbggenerated
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_stuShow.stu_desc
     *
     * @mbggenerated
     */
    private String stuDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jnshu_stuShow
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_stuShow.id
     *
     * @return the value of jnshu_stuShow.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_stuShow.id
     *
     * @param id the value for jnshu_stuShow.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_stuShow.counsellor
     *
     * @return the value of jnshu_stuShow.counsellor
     *
     * @mbggenerated
     */
    public String getCounsellor() {
        return counsellor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_stuShow.counsellor
     *
     * @param counsellor the value for jnshu_stuShow.counsellor
     *
     * @mbggenerated
     */
    public void setCounsellor(String counsellor) {
        this.counsellor = counsellor == null ? null : counsellor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_stuShow.img
     *
     * @return the value of jnshu_stuShow.img
     *
     * @mbggenerated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_stuShow.img
     *
     * @param img the value for jnshu_stuShow.img
     *
     * @mbggenerated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_stuShow.stu_desc
     *
     * @return the value of jnshu_stuShow.stu_desc
     *
     * @mbggenerated
     */
    public String getStuDesc() {
        return stuDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_stuShow.stu_desc
     *
     * @param stuDesc the value for jnshu_stuShow.stu_desc
     *
     * @mbggenerated
     */
    public void setStuDesc(String stuDesc) {
        this.stuDesc = stuDesc == null ? null : stuDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_stuShow
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        JnshuStuShow other = (JnshuStuShow) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCounsellor() == null ? other.getCounsellor() == null : this.getCounsellor().equals(other.getCounsellor()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getStuDesc() == null ? other.getStuDesc() == null : this.getStuDesc().equals(other.getStuDesc()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_stuShow
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCounsellor() == null) ? 0 : getCounsellor().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getStuDesc() == null) ? 0 : getStuDesc().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_stuShow
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", counsellor=").append(counsellor);
        sb.append(", img=").append(img);
        sb.append(", stuDesc=").append(stuDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}