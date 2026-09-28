package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y490 implements flx {
    public final /* synthetic */ j590 a;
    public final /* synthetic */ Function1<Float, Unit> b;

    public y490(j590 j590Var, Function1 function1) {
        i3z i3zVar = i3z.a;
        this.a = j590Var;
        this.b = function1;
    }

    @Override // defpackage.flx
    public final Object X1(long j, long j2, v1b<? super exh0> v1bVar) {
        i3z i3zVar = i3z.a;
        this.b.invoke(new Float(exh0.c(j2)));
        return new exh0(j2);
    }

    public final long a(float f) {
        i3z i3zVar = i3z.a;
        i3z i3zVar2 = i3z.a;
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // defpackage.flx
    public final long h0(int i, long j) {
        i3z i3zVar = i3z.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        return a(this.a.e.d(fIntBitsToFloat));
    }

    @Override // defpackage.flx
    public final Object k1(long j, v1b<? super exh0> v1bVar) {
        i3z i3zVar = i3z.a;
        float fC = exh0.c(j);
        j590 j590Var = this.a;
        float fG = j590Var.e.g();
        float f = j590Var.e.e().f();
        if (fC >= 0.0f || fG <= f) {
            j = 0;
        } else {
            this.b.invoke(new Float(fC));
        }
        return new exh0(j);
    }

    @Override // defpackage.flx
    public final long w0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        c20<k590> c20Var = this.a.e;
        i3z i3zVar = i3z.a;
        return a(c20Var.d(Float.intBitsToFloat((int) (4294967295L & j2))));
    }
}
