package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class eaz implements gaj<Function2<? super a, ? super Integer, ? extends Unit>, a, Integer, Unit> {
    public final /* synthetic */ ijf0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ uni0 d;
    public final /* synthetic */ psw e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function2<a, Integer, Unit> i;
    public final /* synthetic */ Function2<a, Integer, Unit> v;
    public final /* synthetic */ Function2<a, Integer, Unit> w;
    public final /* synthetic */ lff0 y;
    public final /* synthetic */ qx80 z;

    public eaz(ijf0 ijf0Var, boolean z, boolean z2, uni0 uni0Var, psw pswVar, boolean z3, Function2 function2, Function2 function3, Function2 function4, lff0 lff0Var, qx80 qx80Var) {
        this.a = ijf0Var;
        this.b = z;
        this.c = z2;
        this.d = uni0Var;
        this.e = pswVar;
        this.f = z3;
        this.i = function2;
        this.v = function3;
        this.w = function4;
        this.y = lff0Var;
        this.z = qx80Var;
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
            String str = this.a.a.b;
            qx80 qx80Var = this.z;
            boolean z = this.b;
            boolean z2 = this.f;
            psw pswVar = this.e;
            lff0 lff0Var = this.y;
            t9z.a.c(str, function3, z, this.c, this.d, pswVar, z2, this.i, this.v, null, null, this.w, lff0Var, null, pp8.b(1409265477, new daz(z, z2, pswVar, lff0Var, qx80Var), aVar2), aVar2, (iIntValue << 3) & 112, 32768);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
