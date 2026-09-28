package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lcl {
    public static final lcl a;
    public static final lcl b;
    public static final lcl c;
    public static final /* synthetic */ lcl[] d;

    static {
        lcl lclVar = new lcl("Cursor", 0);
        a = lclVar;
        lcl lclVar2 = new lcl("SelectionStart", 1);
        b = lclVar2;
        lcl lclVar3 = new lcl("SelectionEnd", 2);
        c = lclVar3;
        d = new lcl[]{lclVar, lclVar2, lclVar3};
    }

    public lcl() {
        throw null;
    }

    public static lcl valueOf(String str) {
        return (lcl) Enum.valueOf(lcl.class, str);
    }

    public static lcl[] values() {
        return (lcl[]) d.clone();
    }
}
