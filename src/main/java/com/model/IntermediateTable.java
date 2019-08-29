package com.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * intermediate_table
 * @author 
 */
@Data
@Table(name = "intermediate_table")
@Entity
public class IntermediateTable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 观测站名称
     */
    private String obName;

    /**
     * 观测站编号
     */
    private String obNum;

    /**
     * 国家站名称
     */
    private String countryName;

    /**
     * 国家站编号
     */
    private String countryNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObName() {
        return obName;
    }

    public void setObName(String obName) {
        this.obName = obName;
    }

    public String getObNum() {
        return obNum;
    }

    public void setObNum(String obNum) {
        this.obNum = obNum;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryNum() {
        return countryNum;
    }

    public void setCountryNum(String countryNum) {
        this.countryNum = countryNum;
    }

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
        IntermediateTable other = (IntermediateTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getObName() == null ? other.getObName() == null : this.getObName().equals(other.getObName()))
            && (this.getObNum() == null ? other.getObNum() == null : this.getObNum().equals(other.getObNum()))
            && (this.getCountryName() == null ? other.getCountryName() == null : this.getCountryName().equals(other.getCountryName()))
            && (this.getCountryNum() == null ? other.getCountryNum() == null : this.getCountryNum().equals(other.getCountryNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getObName() == null) ? 0 : getObName().hashCode());
        result = prime * result + ((getObNum() == null) ? 0 : getObNum().hashCode());
        result = prime * result + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        result = prime * result + ((getCountryNum() == null) ? 0 : getCountryNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", obName=").append(obName);
        sb.append(", obNum=").append(obNum);
        sb.append(", countryName=").append(countryName);
        sb.append(", countryNum=").append(countryNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}