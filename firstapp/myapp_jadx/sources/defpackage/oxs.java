package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class oxs<D> {
    public qxs.a a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
