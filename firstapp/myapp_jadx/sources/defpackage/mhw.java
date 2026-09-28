package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class mhw {
    public static final mhw a;
    public static final mhw b;
    public static final /* synthetic */ mhw[] c;

    static {
        mhw mhwVar = new mhw("SELECTION_ODDS", 0);
        a = mhwVar;
        mhw mhwVar2 = new mhw("TOTAL_ODDS", 1);
        b = mhwVar2;
        c = new mhw[]{mhwVar, mhwVar2};
    }

    public mhw() {
        throw null;
    }

    public static mhw valueOf(String str) {
        return (mhw) Enum.valueOf(mhw.class, str);
    }

    public static mhw[] values() {
        return (mhw[]) c.clone();
    }
}
