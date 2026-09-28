package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ny3 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        tcf tcfVar = (tcf) obj;
        tcfVar.getClass();
        float fC = yw90.c(tcfVar.d()) / 2.0f;
        lc6 lc6VarA = tcfVar.F1().a();
        for (tg6 tg6Var : qy3.c) {
            b90 b90VarA = c90.a();
            b90VarA.m(tg6Var.c);
            Paint paint = b90VarA.a;
            paint.setAntiAlias(true);
            paint.setMaskFilter(new BlurMaskFilter(tcfVar.C1(tg6Var.b), BlurMaskFilter.Blur.NORMAL));
            long jR1 = tcfVar.R1();
            float fC1 = tcfVar.C1(1.0f);
            float fC2 = tcfVar.C1(tg6Var.a);
            lc6VarA.t(fC, gly.f(jR1, (((long) Float.floatToRawIntBits(fC1)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L)), b90VarA);
        }
        return Unit.a;
    }
}
