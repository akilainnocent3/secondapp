package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class l4l0 extends thl0 implements nkl0 {
    private static final l4l0 zzd;
    private iil0 zzb = ell0.e;

    static {
        l4l0 l4l0Var = new l4l0();
        zzd = l4l0Var;
        thl0.n(l4l0.class, l4l0Var);
    }

    @Override // defpackage.thl0
    public final Object p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new gll0(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new l4l0();
        }
        if (i2 == 4) {
            return new j4l0(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
