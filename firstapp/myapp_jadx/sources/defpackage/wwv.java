package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wwv {
    public static final wwv a;
    public static final wwv b;
    public static final wwv c;
    public static final wwv d;
    public static final wwv e;
    public static final wwv f;
    public static final /* synthetic */ wwv[] i;

    static {
        wwv wwvVar = new wwv("Ongoing", 0);
        a = wwvVar;
        wwv wwvVar2 = new wwv("CanStart", 1);
        b = wwvVar2;
        wwv wwvVar3 = new wwv("Conflicted", 2);
        c = wwvVar3;
        wwv wwvVar4 = new wwv("Upcoming", 3);
        d = wwvVar4;
        wwv wwvVar5 = new wwv("Completed", 4);
        e = wwvVar5;
        wwv wwvVar6 = new wwv("Expired", 5);
        f = wwvVar6;
        i = new wwv[]{wwvVar, wwvVar2, wwvVar3, wwvVar4, wwvVar5, wwvVar6};
    }

    public wwv() {
        throw null;
    }

    public static wwv valueOf(String str) {
        return (wwv) Enum.valueOf(wwv.class, str);
    }

    public static wwv[] values() {
        return (wwv[]) i.clone();
    }
}
