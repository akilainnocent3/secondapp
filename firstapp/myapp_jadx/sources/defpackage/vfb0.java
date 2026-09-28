package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum vfb0 {
    REAL_SPORT(1),
    /* JADX INFO: Fake field, exist only in values array */
    VIRTUAL(2),
    CASINO(3);

    public final int a;

    vfb0(int i) {
        this.a = i;
    }

    public final aoj a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return aoj.REAL;
        }
        if (iOrdinal == 1) {
            return aoj.VIRTUAL;
        }
        if (iOrdinal == 2) {
            return aoj.CASINO;
        }
        uhc.a();
        return null;
    }
}
