package com.jn.bean;

import java.io.Serializable;

public class JnshuFeature implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_feature.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_feature.feature
     *
     * @mbggenerated
     */
    private String feature;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_feature.feature_desc
     *
     * @mbggenerated
     */
    private String featureDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jnshu_feature.img
     *
     * @mbggenerated
     */
    private String img;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jnshu_feature
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_feature.id
     *
     * @return the value of jnshu_feature.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_feature.id
     *
     * @param id the value for jnshu_feature.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_feature.feature
     *
     * @return the value of jnshu_feature.feature
     *
     * @mbggenerated
     */
    public String getFeature() {
        return feature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_feature.feature
     *
     * @param feature the value for jnshu_feature.feature
     *
     * @mbggenerated
     */
    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_feature.feature_desc
     *
     * @return the value of jnshu_feature.feature_desc
     *
     * @mbggenerated
     */
    public String getFeatureDesc() {
        return featureDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_feature.feature_desc
     *
     * @param featureDesc the value for jnshu_feature.feature_desc
     *
     * @mbggenerated
     */
    public void setFeatureDesc(String featureDesc) {
        this.featureDesc = featureDesc == null ? null : featureDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jnshu_feature.img
     *
     * @return the value of jnshu_feature.img
     *
     * @mbggenerated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jnshu_feature.img
     *
     * @param img the value for jnshu_feature.img
     *
     * @mbggenerated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_feature
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
        JnshuFeature other = (JnshuFeature) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFeature() == null ? other.getFeature() == null : this.getFeature().equals(other.getFeature()))
            && (this.getFeatureDesc() == null ? other.getFeatureDesc() == null : this.getFeatureDesc().equals(other.getFeatureDesc()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_feature
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFeature() == null) ? 0 : getFeature().hashCode());
        result = prime * result + ((getFeatureDesc() == null) ? 0 : getFeatureDesc().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_feature
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
        sb.append(", feature=").append(feature);
        sb.append(", featureDesc=").append(featureDesc);
        sb.append(", img=").append(img);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}