package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ge5 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
            default:
                mr5 mr5Var = (mr5) obj;
                mr5Var.getClass();
                final Paint paint = c90.a().a;
                paint.setAntiAlias(true);
                paint.setColor(Color.parseColor("#DDE0E0E0"));
                paint.setMaskFilter(new BlurMaskFilter(30.0f, BlurMaskFilter.Blur.NORMAL));
                return mr5Var.e(new Function1() { // from class: uh10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        tcf tcfVar = (tcf) obj2;
                        tcfVar.getClass();
                        i40.c(tcfVar.F1().a()).drawRect(0.0f, 0.0f, Float.intBitsToFloat((int) (tcfVar.d() >> 32)), Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)), paint);
                        return Unit.a;
                    }
                });
        }
    }
}
