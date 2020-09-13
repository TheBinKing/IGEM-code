package com.igem.server.dto;

public class i3w_100Dto {
    private String domain;

    private Integer i3dzdCla;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getI3dzdCla() {
        return i3dzdCla;
    }

    public void setI3dzdCla(Integer i3dzdCla) {
        this.i3dzdCla = i3dzdCla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", domain=").append(domain);
        sb.append(", i3dzdCla=").append(i3dzdCla);
        sb.append("]");
        return sb.toString();
    }
}