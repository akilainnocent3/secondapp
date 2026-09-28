package defpackage;

import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aba implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ i060 d;
    public final /* synthetic */ long e;

    public /* synthetic */ aba(float f, float f2, long j, i060 i060Var, long j2) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i060Var;
        this.e = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tcf tcfVar = (tcf) obj;
        tcfVar.getClass();
        float fC1 = tcfVar.C1(this.a);
        float fC2 = tcfVar.C1(this.b);
        long j = this.c;
        float fC3 = tcfVar.C1(j7f.c(j));
        float fC4 = tcfVar.C1(j7f.d(j));
        lc6 lc6VarA = tcfVar.F1().a();
        Paint paint = c90.a().a;
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setShadowLayer(fC1, fC3, fC4, r58.l(this.e));
        b90 b90VarA = c90.a();
        b90VarA.a.set(paint);
        b9z b9zVarA = this.d.a(tcfVar.d(), tcfVar.getLayoutDirection(), tcfVar);
        if (b9zVarA instanceof b9z.b) {
            float f = 0.0f - fC2;
            lc6VarA.v(f, f, Float.intBitsToFloat((int) (tcfVar.d() >> 32)) + fC2, Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) + fC2, b90VarA);
        } else if (b9zVarA instanceof b9z.c) {
            lz50 lz50Var = ((b9z.c) b9zVarA).a;
            float f2 = lz50Var.a;
            long j2 = lz50Var.e;
            lc6VarA.l(f2 - fC2, lz50Var.b - fC2, lz50Var.c + fC2, lz50Var.d + fC2, Float.intBitsToFloat((int) (j2 >> 32)) + fC2, Float.intBitsToFloat((int) (4294967295L & j2)) + fC2, b90VarA);
        } else {
            if (!(b9zVarA instanceof b9z.a)) {
                uhc.a();
                return null;
            }
            lc6VarA.m(((b9z.a) b9zVarA).a, b90VarA);
        }
        return Unit.a;
    }
}
