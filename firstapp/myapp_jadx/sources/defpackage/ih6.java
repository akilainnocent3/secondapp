package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes4.dex */
public final class ih6 implements w420 {
    public final lk40 a;
    public final int b;
    public final int c;
    public final int d;

    public ih6(lk40 lk40Var, int i, int i2, int i3) {
        lk40Var.getClass();
        this.a = lk40Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        owoVar.getClass();
        asrVar.getClass();
        lk40 lk40Var = this.a;
        int iIntBitsToFloat = ((int) Float.intBitsToFloat((int) (lk40Var.c() >> 32))) - this.c;
        int i = this.d;
        int i2 = (((int) (j >> 32)) - ((int) (j2 >> 32))) - i;
        if (i2 < i) {
            i2 = i;
        }
        int iE = f.e(iIntBitsToFloat, i, i2);
        return (((long) (((int) lk40Var.d) + this.b)) & 4294967295L) | (((long) iE) << 32);
    }
}
