package patterns;

import java.io.Serializable;

public class T extends Alfa implements Serializable {
    private String name = null;
    private P p = null;

    private T() {

    }

    public P getP() {
        return p;
    }

    public String getName() {
        return name;
    }

    private void setP(P p) {
        this.p = p;
    }

    private void setName(String name) {
        this.name = name;
    }
    public static TBuilder builder(){

        return new TBuilder();
    }

    public static class TBuilder {
        private T t = null;

        public TBuilder () {
            t = new T();
        }

        public T build() {
            return this.t;
        }

        public TBuilder setP(P p) {
            this.t.setP(p);
            return this;
        }

        public TBuilder setName(String name) {
            this.t.setName(name);
            return this;
        }



    }
}
