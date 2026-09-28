package defpackage;

import com.sportybet.android.globalpay.pixBtg.depositQrCode.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lld implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lld(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                old oldVar = (old) obj;
                ot50 ot50Var = (ot50) zma.a(oldVar, ut50.a);
                ua0 ua0Var = oldVar.J;
                if (ot50Var == null) {
                    if (ua0Var != null) {
                        oldVar.q2(ua0Var);
                    }
                    oldVar.J = null;
                } else if (ua0Var == null) {
                    nld nldVar = new nld(oldVar);
                    mld mldVar = new mld(oldVar, 0);
                    psw pswVar = oldVar.F;
                    boolean z = oldVar.G;
                    float f = oldVar.H;
                    gzg0<Float> gzg0Var = vt50.a;
                    ua0 ua0Var2 = new ua0(pswVar, z, f, nldVar, mldVar);
                    oldVar.p2(ua0Var2);
                    oldVar.J = ua0Var2;
                }
                break;
            default:
                ((Function1) obj).invoke(a.j.a);
                break;
        }
        return Unit.a;
    }
}
