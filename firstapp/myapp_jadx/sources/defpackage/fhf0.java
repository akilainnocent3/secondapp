package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fhf0 implements gaj<Function2<? super a, ? super Integer, ? extends Unit>, a, Integer, Unit> {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ uni0 d;
    public final /* synthetic */ psw e;
    public final /* synthetic */ Function2<a, Integer, Unit> f;
    public final /* synthetic */ Function2<a, Integer, Unit> i;
    public final /* synthetic */ qx80 v;
    public final /* synthetic */ lff0 w;

    public fhf0(psw pswVar, qx80 qx80Var, lff0 lff0Var, uni0 uni0Var, String str, Function2 function2, Function2 function3, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = uni0Var;
        this.e = pswVar;
        this.f = function2;
        this.i = function3;
        this.v = qx80Var;
        this.w = lff0Var;
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
            uff0.a.b(this.a, function3, this.b, this.c, this.d, this.e, this.f, null, this.i, this.v, this.w, null, null, aVar2, (iIntValue << 3) & 112, 100663296, 196608);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
