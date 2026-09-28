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
public final class baz implements Function2<a, Integer, Unit> {
    public final /* synthetic */ int A;
    public final /* synthetic */ uni0 B;
    public final /* synthetic */ psw C;
    public final /* synthetic */ Function2<a, Integer, Unit> D;
    public final /* synthetic */ qx80 E;
    public final /* synthetic */ d a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ lff0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function1<String, Unit> e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ imf0 i;
    public final /* synthetic */ gop v;
    public final /* synthetic */ tnp w;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    public baz(int i, int i2, tnp tnpVar, gop gopVar, psw pswVar, qx80 qx80Var, lff0 lff0Var, imf0 imf0Var, uni0 uni0Var, d dVar, String str, Function1 function1, Function2 function2, Function2 function3, boolean z, boolean z2) {
        this.a = dVar;
        this.b = function2;
        this.c = lff0Var;
        this.d = str;
        this.e = function1;
        this.f = z;
        this.i = imf0Var;
        this.v = gopVar;
        this.w = tnpVar;
        this.y = z2;
        this.z = i;
        this.A = i2;
        this.B = uni0Var;
        this.C = pswVar;
        this.D = function3;
        this.E = qx80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Function2<a, Integer, Unit> function2 = this.b;
            d dVarJ = d.a.b;
            if (function2 != null) {
                aVar2.N(-903490605);
                Object objY = aVar2.y();
                if (objY == a.C0041a.a) {
                    objY = new b6g(1);
                    aVar2.r(objY);
                }
                dVarJ = h.j(xa80.b(dVarJ, true, (Function1) objY), 0.0f, wgf0.f(aVar2), 0.0f, 0.0f, 13);
                aVar2.H();
            } else {
                aVar2.N(-903106918);
                aVar2.H();
            }
            d dVarN = this.a.n(dVarJ);
            xae0.a(R.string.default_error_message, aVar2);
            d dVarA = j.a(dVarN, 280.0f, 56.0f);
            lff0 lff0Var = this.c;
            soa0 soa0Var = new soa0(lff0Var.i);
            Function2<a, Integer, Unit> function3 = this.D;
            qx80 qx80Var = this.E;
            psw pswVar = this.C;
            uni0 uni0Var = this.B;
            String str = this.d;
            Function2<a, Integer, Unit> function4 = this.b;
            boolean z = this.f;
            boolean z2 = this.y;
            ab2.b(str, this.e, dVarA, z, false, this.i, this.v, this.w, z2, this.z, this.A, uni0Var, null, pswVar, soa0Var, pp8.b(-1189274459, new aaz(pswVar, qx80Var, lff0Var, uni0Var, str, function4, function3, z, z2), aVar2), aVar2, 0, 196608, 4096);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
