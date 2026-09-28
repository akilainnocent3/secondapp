package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class lso {
    public static final lso a;
    public static final lso b;
    public static final lso c;
    public static final lso d;
    public static final lso e;
    public static final lso f;
    public static final /* synthetic */ lso[] i;

    static {
        lso lsoVar = new lso("COUNTER", 0);
        a = lsoVar;
        lso lsoVar2 = new lso("UP_DOWN_COUNTER", 1);
        b = lsoVar2;
        lso lsoVar3 = new lso("HISTOGRAM", 2);
        c = lsoVar3;
        lso lsoVar4 = new lso("OBSERVABLE_COUNTER", 3);
        lso lsoVar5 = new lso("OBSERVABLE_UP_DOWN_COUNTER", 4);
        d = lsoVar5;
        lso lsoVar6 = new lso("OBSERVABLE_GAUGE", 5);
        e = lsoVar6;
        lso lsoVar7 = new lso("GAUGE", 6);
        f = lsoVar7;
        i = new lso[]{lsoVar, lsoVar2, lsoVar3, lsoVar4, lsoVar5, lsoVar6, lsoVar7};
    }

    public lso() {
        throw null;
    }

    public static lso valueOf(String str) {
        return (lso) Enum.valueOf(lso.class, str);
    }

    public static lso[] values() {
        return (lso[]) i.clone();
    }
}
