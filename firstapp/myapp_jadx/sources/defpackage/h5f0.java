package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface h5f0<T> extends q340 {
    public static final wg1 v = hoa.a.a(String.class, "camerax.core.target.name");
    public static final wg1 w = hoa.a.a(Class.class, "camerax.core.target.class");

    default String R() {
        return (String) d(v);
    }

    default String q(String str) {
        return (String) b(v, str);
    }
}
