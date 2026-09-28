package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class faz implements Function2<a, Integer, Unit> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ uni0 C;
    public final /* synthetic */ psw D;
    public final /* synthetic */ Function2<a, Integer, Unit> E;
    public final /* synthetic */ Function2<a, Integer, Unit> F;
    public final /* synthetic */ qx80 G;
    public final /* synthetic */ d a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ lff0 d;
    public final /* synthetic */ ijf0 e;
    public final /* synthetic */ Function1<ijf0, Unit> f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ imf0 v;
    public final /* synthetic */ gop w;
    public final /* synthetic */ tnp y;
    public final /* synthetic */ boolean z;

    public faz(d dVar, Function2 function2, boolean z, lff0 lff0Var, ijf0 ijf0Var, Function1 function1, boolean z2, imf0 imf0Var, gop gopVar, tnp tnpVar, boolean z3, int i, int i2, uni0 uni0Var, psw pswVar, Function2 function3, Function2 function4, qx80 qx80Var) {
        this.a = dVar;
        this.b = function2;
        this.c = z;
        this.d = lff0Var;
        this.e = ijf0Var;
        this.f = function1;
        this.i = z2;
        this.v = imf0Var;
        this.w = gopVar;
        this.y = tnpVar;
        this.z = z3;
        this.A = i;
        this.B = i2;
        this.C = uni0Var;
        this.D = pswVar;
        this.E = function3;
        this.F = function4;
        this.G = qx80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Function2<a, Integer, Unit> function2 = this.b;
            d dVarJ = d.a.b;
            if (function2 != null) {
                aVar2.N(-1901539802);
                Object objY = aVar2.y();
                if (objY == a.C0041a.a) {
                    objY = new caz();
                    aVar2.r(objY);
                }
                dVarJ = h.j(xa80.b(dVarJ, true, (Function1) objY), 0.0f, wgf0.f(aVar2), 0.0f, 0.0f, 13);
                aVar2.H();
            } else {
                aVar2.N(-1901156115);
                aVar2.H();
            }
            d dVarN = this.a.n(dVarJ);
            String strA = xae0.a(R.string.default_error_message, aVar2);
            boolean z = this.c;
            if (z) {
                dVarN = xa80.b(dVarN, false, new rtk(strA, 1));
            }
            d dVarA = j.a(dVarN, 280.0f, 56.0f);
            lff0 lff0Var = this.d;
            soa0 soa0Var = new soa0(z ? lff0Var.j : lff0Var.i);
            Function2<a, Integer, Unit> function3 = this.F;
            qx80 qx80Var = this.G;
            ijf0 ijf0Var = this.e;
            boolean z2 = this.i;
            boolean z3 = this.z;
            uni0 uni0Var = this.C;
            psw pswVar = this.D;
            ab2.a(ijf0Var, this.f, dVarA, z2, false, this.v, this.w, this.y, z3, this.A, this.B, uni0Var, null, pswVar, soa0Var, pp8.b(674541106, new eaz(ijf0Var, z2, z3, uni0Var, pswVar, this.c, this.b, this.E, function3, lff0Var, qx80Var), aVar2), aVar2, 0, 196608, 4096);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
