package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s68 implements nze {
    @Override // defpackage.nze
    public final double a(double d) {
        double d2 = d < 0.0d ? -d : d;
        return Math.copySign(d2 >= 0.04045d ? Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, d);
    }
}
