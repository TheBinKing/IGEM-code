package com.igem.server.dto;

public class i3w_typDto {
    private Integer qryCla;

    private String domain;

    public Integer getQryCla() {
        return qryCla;
    }

    public void setQryCla(Integer qryCla) {
        this.qryCla = qryCla;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qryCla=").append(qryCla);
        sb.append(", domain=").append(domain);
        sb.append("]");
        return sb.toString();
    }
}