package com.muse.build;

public class Red {
    private String name;
    private int id;

    public Red(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static RedBuilder builder() {
        return new RedBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static class RedBuilder {
        private String name;
        private int id;

        public RedBuilder name(String name) {
            this.name = name;
            return this;
        }

        public RedBuilder id(int id) {
            this.id = id;
            return this;
        }

        public Red build(){
            return new Red(name, id);
        }
    }
}
