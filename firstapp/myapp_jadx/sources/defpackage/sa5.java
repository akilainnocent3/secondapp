package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sa5 {
    public static final una a = new una(new ra5(0));
    public static final a b = new a();

    public static final class a implements qa5 {
        @Override // defpackage.qa5
        public final float a(float f, float f2, float f3) {
            float fAbs = Math.abs((f2 + f) - f);
            float f4 = (0.3f * f3) - (0.0f * fAbs);
            float f5 = f3 - f4;
            if ((fAbs <= f3) && f5 < fAbs) {
                f4 = f3 - fAbs;
            }
            return f - f4;
        }
    }
}
