package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yvg0 {
    public final mw0<owh> a = new mw0<>(16, false);
    public final mw0<q590> b = new mw0<>(16, false);
    public final q590 c = new q590();
    public final q15 d;
    public final q590 e;
    public final a f;
    public final b g;

    public class a extends q120 {
        @Override // defpackage.q120
        public final Object c() {
            return new owh(16, 0);
        }
    }

    public class b extends q120 {
        @Override // defpackage.q120
        public final Object c() {
            return new q590(16, 0);
        }
    }

    public yvg0() {
        q15 q15Var = new q15();
        q15Var.a = new boolean[16];
        this.d = q15Var;
        this.e = new q590();
        this.f = new a();
        this.g = new b();
    }

    public static boolean a(int i, int i2, float[] fArr, short[] sArr) {
        int i3 = sArr[((i2 + i) - 1) % i2] << 1;
        int i4 = sArr[i] << 1;
        int i5 = sArr[(i + 1) % i2] << 1;
        return !b(fArr[i3], fArr[i3 + 1], fArr[i4], fArr[i4 + 1], fArr[i5], fArr[i5 + 1]);
    }

    public static boolean b(float f, float f2, float f3, float f4, float f5, float f6) {
        return hxa.a(f4, f2, f5, hxa.a(f2, f6, f3, (f6 - f4) * f)) >= 0.0f;
    }

    public static int c(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f3 - f;
        float f8 = f4 - f2;
        return ((f7 * f2) + ((f5 * f8) - (f6 * f7))) - (f * f8) >= 0.0f ? 1 : -1;
    }
}
