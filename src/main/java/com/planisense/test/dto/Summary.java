package com.planisense.test.dto;

public class Summary {
    private String entity;
    private long count;

    public Summary(String entity, long count) {
        this.entity = entity;
        this.count = count;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
