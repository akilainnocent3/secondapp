package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ocl {
    public static final ocl a;
    public static final ocl b;
    public static final ocl c;
    public static final /* synthetic */ ocl[] d;

    static {
        ocl oclVar = new ocl("None", 0);
        a = oclVar;
        ocl oclVar2 = new ocl("Selection", 1);
        b = oclVar2;
        ocl oclVar3 = new ocl("Cursor", 2);
        c = oclVar3;
        d = new ocl[]{oclVar, oclVar2, oclVar3};
    }

    public ocl() {
        throw null;
    }

    public static ocl valueOf(String str) {
        return (ocl) Enum.valueOf(ocl.class, str);
    }

    public static ocl[] values() {
        return (ocl[]) d.clone();
    }
}
