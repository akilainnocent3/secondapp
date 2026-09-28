package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class i3e0 implements flx {
    public final /* synthetic */ ved a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ Function0<Unit> c;

    public i3e0(ved vedVar, Function0 function0, Function0 function1) {
        this.a = vedVar;
        this.b = function0;
        this.c = function1;
    }

    @Override // defpackage.flx
    public final long h0(int i, long j) {
        int i2 = (int) (j >> 32);
        boolean z = Float.intBitsToFloat(i2) < -70.0f;
        boolean z2 = Float.intBitsToFloat(i2) > 70.0f;
        ved vedVar = this.a;
        boolean z3 = vedVar.k() == 0;
        boolean z4 = vedVar.k() == vedVar.n() - 1;
        boolean z5 = vedVar.l() == 0.0f;
        if (z5 && z2 && z3) {
            this.b.invoke();
            return 0L;
        }
        if (!z5 || !z || !z4) {
            return 0L;
        }
        this.c.invoke();
        return 0L;
    }
}
