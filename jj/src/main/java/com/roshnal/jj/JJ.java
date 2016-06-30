package com.roshnal.jj;

import java.util.HashMap;

public class JJ {
    private static final int TYPE_NONE = 0;
    private static final int TYPE_JSON = 1;
    private static final int TYPE_OBJECT = 2;

    private Object object;
    private String json;

    private int type = TYPE_NONE;

    public JJ(Object object) {
        this.setObject(object);
        this.setType(TYPE_OBJECT);
    }

    public JJ(String json) {
        this.setJson(json);
        this.setType(TYPE_JSON);
    }

    private void setType(int type) {
        this.type = type;
    }

    private int getType() {
        return type;
    }

    private Object getObject() {
        return object;
    }

    private void setObject(Object object) {
        this.object = object;
    }

    private String getJson() {
        return json;
    }

    private void setJson(String json) {
        this.json = json;
    }

    public String[] get() {
        return null;
    }

    public String get(String key) {
        return null;
    }

    public String get(String... keys) {
        return null;
    }

    public String getR(String... keys) {
        return null;
    }

    public int getInt(String key) {
        return 0;
    }

    public int[] getInts(String... keys) {
        return null;
    }

    public int getIntR(String... keys) {
        return 0;
    }

    public boolean getBoolean(String key) {
        return false;
    }

    public boolean[] getBooleans(String... keys) {
        return null;
    }

    public boolean getBooleanR(String... keys) {
        return false;
    }

    public HashMap<String, String> toMap() {
        return null;
    }

    public String[] keys() {
        return null;
    }

    public String[] values() {
        return null;
    }

    public boolean exists(String key) {
        return false;
    }

    public String json() {
        return getType() == TYPE_JSON? getJson() : new Parser().toJson(getObject());
    }

    public Object object() {
        return getType() == TYPE_OBJECT? getObject() : new Parser().toObject(getJson());
    }
}
