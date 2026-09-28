package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class mjs {
    public static final mjs a;
    public static final mjs b;
    public static final /* synthetic */ mjs[] c;

    static {
        mjs mjsVar = new mjs("MATCH_TRACKER", 0);
        a = mjsVar;
        mjs mjsVar2 = new mjs("STATISTICS", 1);
        b = mjsVar2;
        c = new mjs[]{mjsVar, mjsVar2};
    }

    public mjs() {
        throw null;
    }

    public static mjs valueOf(String str) {
        return (mjs) Enum.valueOf(mjs.class, str);
    }

    public static mjs[] values() {
        return (mjs[]) c.clone();
    }
}
