package com.jn.bean;

import java.io.Serializable;

public class JnshuCareer implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_career.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_career.career_title
     *
     * @mbggenerated
     */
    private String careerTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_career.career_desc
     *
     * @mbggenerated
     */
    private String careerDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_career.barrier
     *
     * @mbggenerated
     */
    private String barrier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_career.difficulty
     *
     * @mbggenerated
     */
    private String difficulty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_career.growth_cycle
     *
     * @mbggenerated
     */
    private String growthCycle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_career.scarcity
     *
     * @mbggenerated
     */
    private String scarcity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_career.learners_number
     *
     * @mbggenerated
     */
    private String learnersNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jnshu_career
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_career.id
     *
     * @return the value of jnshu_career.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_career.id
     *
     * @param id the value for jnshu_career.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_career.career_title
     *
     * @return the value of jnshu_career.career_title
     *
     * @mbggenerated
     */
    public String getCareerTitle() {
        return careerTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_career.career_title
     *
     * @param careerTitle the value for jnshu_career.career_title
     *
     * @mbggenerated
     */
    public void setCareerTitle(String careerTitle) {
        this.careerTitle = careerTitle == null ? null : careerTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_career.career_desc
     *
     * @return the value of jnshu_career.career_desc
     *
     * @mbggenerated
     */
    public String getCareerDesc() {
        return careerDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_career.career_desc
     *
     * @param careerDesc the value for jnshu_career.career_desc
     *
     * @mbggenerated
     */
    public void setCareerDesc(String careerDesc) {
        this.careerDesc = careerDesc == null ? null : careerDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_career.barrier
     *
     * @return the value of jnshu_career.barrier
     *
     * @mbggenerated
     */
    public String getBarrier() {
        return barrier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_career.barrier
     *
     * @param barrier the value for jnshu_career.barrier
     *
     * @mbggenerated
     */
    public void setBarrier(String barrier) {
        this.barrier = barrier == null ? null : barrier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_career.difficulty
     *
     * @return the value of jnshu_career.difficulty
     *
     * @mbggenerated
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_career.difficulty
     *
     * @param difficulty the value for jnshu_career.difficulty
     *
     * @mbggenerated
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty == null ? null : difficulty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_career.growth_cycle
     *
     * @return the value of jnshu_career.growth_cycle
     *
     * @mbggenerated
     */
    public String getGrowthCycle() {
        return growthCycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_career.growth_cycle
     *
     * @param growthCycle the value for jnshu_career.growth_cycle
     *
     * @mbggenerated
     */
    public void setGrowthCycle(String growthCycle) {
        this.growthCycle = growthCycle == null ? null : growthCycle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_career.scarcity
     *
     * @return the value of jnshu_career.scarcity
     *
     * @mbggenerated
     */
    public String getScarcity() {
        return scarcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_career.scarcity
     *
     * @param scarcity the value for jnshu_career.scarcity
     *
     * @mbggenerated
     */
    public void setScarcity(String scarcity) {
        this.scarcity = scarcity == null ? null : scarcity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_career.learners_number
     *
     * @return the value of jnshu_career.learners_number
     *
     * @mbggenerated
     */
    public String getLearnersNumber() {
        return learnersNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_career.learners_number
     *
     * @param learnersNumber the value for jnshu_career.learners_number
     *
     * @mbggenerated
     */
    public void setLearnersNumber(String learnersNumber) {
        this.learnersNumber = learnersNumber == null ? null : learnersNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_career
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
        JnshuCareer other = (JnshuCareer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCareerTitle() == null ? other.getCareerTitle() == null : this.getCareerTitle().equals(other.getCareerTitle()))
            && (this.getCareerDesc() == null ? other.getCareerDesc() == null : this.getCareerDesc().equals(other.getCareerDesc()))
            && (this.getBarrier() == null ? other.getBarrier() == null : this.getBarrier().equals(other.getBarrier()))
            && (this.getDifficulty() == null ? other.getDifficulty() == null : this.getDifficulty().equals(other.getDifficulty()))
            && (this.getGrowthCycle() == null ? other.getGrowthCycle() == null : this.getGrowthCycle().equals(other.getGrowthCycle()))
            && (this.getScarcity() == null ? other.getScarcity() == null : this.getScarcity().equals(other.getScarcity()))
            && (this.getLearnersNumber() == null ? other.getLearnersNumber() == null : this.getLearnersNumber().equals(other.getLearnersNumber()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_career
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCareerTitle() == null) ? 0 : getCareerTitle().hashCode());
        result = prime * result + ((getCareerDesc() == null) ? 0 : getCareerDesc().hashCode());
        result = prime * result + ((getBarrier() == null) ? 0 : getBarrier().hashCode());
        result = prime * result + ((getDifficulty() == null) ? 0 : getDifficulty().hashCode());
        result = prime * result + ((getGrowthCycle() == null) ? 0 : getGrowthCycle().hashCode());
        result = prime * result + ((getScarcity() == null) ? 0 : getScarcity().hashCode());
        result = prime * result + ((getLearnersNumber() == null) ? 0 : getLearnersNumber().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_career
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
        sb.append(", careerTitle=").append(careerTitle);
        sb.append(", careerDesc=").append(careerDesc);
        sb.append(", barrier=").append(barrier);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", growthCycle=").append(growthCycle);
        sb.append(", scarcity=").append(scarcity);
        sb.append(", learnersNumber=").append(learnersNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}