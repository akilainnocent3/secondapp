package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum qil0 {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(lfl0.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class a;

    static {
        jfl0 jfl0Var = lfl0.b;
    }

    qil0(Class cls) {
        this.a = cls;
    }
}
