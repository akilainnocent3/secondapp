package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ntr {
    public static final Object a(mzo mzoVar) {
        Object objG = mzoVar.g();
        esr esrVar = objG instanceof esr ? (esr) objG : null;
        if (esrVar != null) {
            return esrVar.Y0();
        }
        return null;
    }

    public static final int b(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }
}
