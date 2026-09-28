package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class sed implements flx {
    public final zpz a;

    public sed(zpz zpzVar) {
        i3z i3zVar = i3z.a;
        this.a = zpzVar;
    }

    @Override // defpackage.flx
    public final Object X1(long j, long j2, v1b<? super exh0> v1bVar) {
        i3z i3zVar = i3z.a;
        i3z i3zVar2 = i3z.a;
        return new exh0(exh0.a(0.0f, 0.0f, 1, j2));
    }

    @Override // defpackage.flx
    public final long h0(int i, long j) {
        i3z i3zVar = i3z.a;
        if (i != 1) {
            return 0L;
        }
        zpz zpzVar = this.a;
        if (Math.abs(zpzVar.l()) <= 1.0E-6d) {
            return 0L;
        }
        float fL = zpzVar.l() * zpzVar.o();
        float fN = ((zpzVar.m().n() + zpzVar.m().j()) * (-Math.signum(zpzVar.l()))) + fL;
        if (zpzVar.l() > 0.0f) {
            fN = fL;
            fL = fN;
        }
        float f = -zpzVar.k.a(-f.d(Float.intBitsToFloat((int) (j >> 32)), fL, fN));
        i3z i3zVar2 = i3z.a;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // defpackage.flx
    public final long w0(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        i3z i3zVar = i3z.a;
        if (Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
