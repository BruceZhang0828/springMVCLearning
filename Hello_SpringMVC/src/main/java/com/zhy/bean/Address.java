package com.zhy.bean;

/**
 * @ClassName: Address
 * @Description: TODO 留下注释吧
 * @Date: 2020/5/9 15:57
 * @Version: 1.0
 **/
public class Address {

    private String province;
    private String city;
    private String town;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
