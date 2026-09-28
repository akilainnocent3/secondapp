package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jmn {
    public static final jmn a;
    public static final jmn b;
    public static final jmn c;
    public static final /* synthetic */ jmn[] d;

    static {
        jmn jmnVar = new jmn("Focused", 0);
        a = jmnVar;
        jmn jmnVar2 = new jmn("UnfocusedEmpty", 1);
        b = jmnVar2;
        jmn jmnVar3 = new jmn("UnfocusedNotEmpty", 2);
        c = jmnVar3;
        d = new jmn[]{jmnVar, jmnVar2, jmnVar3};
    }

    public jmn() {
        throw null;
    }

    public static jmn valueOf(String str) {
        return (jmn) Enum.valueOf(jmn.class, str);
    }

    public static jmn[] values() {
        return (jmn[]) d.clone();
    }
}
