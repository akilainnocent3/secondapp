package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ghf0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ uni0 A;
    public final /* synthetic */ psw B;
    public final /* synthetic */ Function2<a, Integer, Unit> C;
    public final /* synthetic */ Function2<a, Integer, Unit> D;
    public final /* synthetic */ qx80 E;
    public final /* synthetic */ d a;
    public final /* synthetic */ lff0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1<String, Unit> d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ imf0 f;
    public final /* synthetic */ gop i;
    public final /* synthetic */ tnp v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public ghf0(int i, int i2, tnp tnpVar, gop gopVar, psw pswVar, qx80 qx80Var, lff0 lff0Var, imf0 imf0Var, uni0 uni0Var, d dVar, String str, Function1 function1, Function2 function2, Function2 function3, boolean z, boolean z2) {
        this.a = dVar;
        this.b = lff0Var;
        this.c = str;
        this.d = function1;
        this.e = z;
        this.f = imf0Var;
        this.i = gopVar;
        this.v = tnpVar;
        this.w = z2;
        this.y = i;
        this.z = i2;
        this.A = uni0Var;
        this.B = pswVar;
        this.C = function2;
        this.D = function3;
        this.E = qx80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            xae0.a(R.string.default_error_message, aVar2);
            d dVarA = j.a(this.a, 280.0f, 56.0f);
            lff0 lff0Var = this.b;
            soa0 soa0Var = new soa0(lff0Var.i);
            Function2<a, Integer, Unit> function2 = this.D;
            qx80 qx80Var = this.E;
            psw pswVar = this.B;
            uni0 uni0Var = this.A;
            String str = this.c;
            Function2<a, Integer, Unit> function3 = this.C;
            boolean z = this.e;
            boolean z2 = this.w;
            ab2.b(str, this.d, dVarA, z, false, this.f, this.i, this.v, z2, this.y, this.z, uni0Var, null, pswVar, soa0Var, pp8.b(1451491557, new fhf0(pswVar, qx80Var, lff0Var, uni0Var, str, function3, function2, z, z2), aVar2), aVar2, 0, 196608, 4096);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
