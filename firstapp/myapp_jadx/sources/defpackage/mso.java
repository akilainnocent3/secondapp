package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class mso {
    public static final mso a;
    public static final mso b;
    public static final /* synthetic */ mso[] c;

    static {
        mso msoVar = new mso("LONG", 0);
        a = msoVar;
        mso msoVar2 = new mso("DOUBLE", 1);
        b = msoVar2;
        c = new mso[]{msoVar, msoVar2};
    }

    public mso() {
        throw null;
    }

    public static mso valueOf(String str) {
        return (mso) Enum.valueOf(mso.class, str);
    }

    public static mso[] values() {
        return (mso[]) c.clone();
    }
}
