package com.igem.server.domain;

public class i30w_3w {
    private String domain;

    private Integer qryCla;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getQryCla() {
        return qryCla;
    }

    public void setQryCla(Integer qryCla) {
        this.qryCla = qryCla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", domain=").append(domain);
        sb.append(", qryCla=").append(qryCla);
        sb.append("]");
        return sb.toString();
    }
}