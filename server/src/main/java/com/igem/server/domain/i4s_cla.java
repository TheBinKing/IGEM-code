package com.igem.server.domain;

public class i4s_cla {
    private String domain;

    private Integer i1Cla;

    private Integer i2Cla;

    private Integer i3Cla;

    private Integer i4Cla;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getI1Cla() {
        return i1Cla;
    }

    public void setI1Cla(Integer i1Cla) {
        this.i1Cla = i1Cla;
    }

    public Integer getI2Cla() {
        return i2Cla;
    }

    public void setI2Cla(Integer i2Cla) {
        this.i2Cla = i2Cla;
    }

    public Integer getI3Cla() {
        return i3Cla;
    }

    public void setI3Cla(Integer i3Cla) {
        this.i3Cla = i3Cla;
    }

    public Integer getI4Cla() {
        return i4Cla;
    }

    public void setI4Cla(Integer i4Cla) {
        this.i4Cla = i4Cla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", domain=").append(domain);
        sb.append(", i1Cla=").append(i1Cla);
        sb.append(", i2Cla=").append(i2Cla);
        sb.append(", i3Cla=").append(i3Cla);
        sb.append(", i4Cla=").append(i4Cla);
        sb.append("]");
        return sb.toString();
    }
}