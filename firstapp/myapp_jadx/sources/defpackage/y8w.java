package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y8w {
    public Class<?> a;
    public Class<?> b;
    public Class<?> c;

    public y8w(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y8w.class != obj.getClass()) {
            return false;
        }
        y8w y8wVar = (y8w) obj;
        return this.a.equals(y8wVar.a) && this.b.equals(y8wVar.b) && erh0.b(this.c, y8wVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class<?> cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public y8w() {
    }
}
