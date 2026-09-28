package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ew20 {
    public final HashMap a;
    public final HashMap b;

    public static final class b {
        public final Class<?> a;
        public final Class<?> b;

        public b(Class<?> cls, Class<?> cls2) {
            this.a = cls;
            this.b = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a.equals(this.a) && bVar.b.equals(this.b);
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public final String toString() {
            return this.a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
        }
    }

    public ew20(a aVar) {
        this.a = new HashMap(aVar.a);
        this.b = new HashMap(aVar.b);
    }

    public static final class a {
        public final HashMap a;
        public final HashMap b;

        public a(ew20 ew20Var) {
            this.a = new HashMap(ew20Var.a);
            this.b = new HashMap(ew20Var.b);
        }

        public a() {
            this.a = new HashMap();
            this.b = new HashMap();
        }
    }
}
