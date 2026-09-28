package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class aaz implements gaj<Function2<? super a, ? super Integer, ? extends Unit>, a, Integer, Unit> {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ uni0 d;
    public final /* synthetic */ psw e;
    public final /* synthetic */ Function2<a, Integer, Unit> f;
    public final /* synthetic */ Function2<a, Integer, Unit> i;
    public final /* synthetic */ lff0 v;
    public final /* synthetic */ qx80 w;

    public aaz(psw pswVar, qx80 qx80Var, lff0 lff0Var, uni0 uni0Var, String str, Function2 function2, Function2 function3, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = uni0Var;
        this.e = pswVar;
        this.f = function2;
        this.i = function3;
        this.v = lff0Var;
        this.w = qx80Var;
    }

    @Override // defpackage.gaj
    public final Unit invoke(Function2<? super a, ? super Integer, ? extends Unit> function2, a aVar, Integer num) {
        Function2<? super a, ? super Integer, ? extends Unit> function3 = function2;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.A(function3) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            qx80 qx80Var = this.w;
            int i = iIntValue;
            boolean z = this.b;
            psw pswVar = this.e;
            lff0 lff0Var = this.v;
            t9z.a.c(this.a, function3, z, this.c, this.d, pswVar, false, this.f, this.i, null, null, null, lff0Var, null, pp8.b(-656940872, new z9z(z, pswVar, lff0Var, qx80Var), aVar2), aVar2, (i << 3) & 112, 32768);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
