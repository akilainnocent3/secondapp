package defpackage;

import android.util.Base64;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d02 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                g02 g02Var = (g02) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = m.b(Boolean.FALSE);
                        aVar.r(objY);
                    }
                    ytw ytwVar = (ytw) objY;
                    ytw ytwVarB = wyh.b(g02Var.P0().i0, null, aVar, 48, 14);
                    z7e z7eVar = (z7e) ytwVarB.getValue();
                    boolean zM = aVar.M(ytwVarB);
                    Object objY2 = aVar.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new h02(ytwVarB, ytwVar, null);
                        aVar.r(objY2);
                    }
                    xvf.e(aVar, z7eVar, (Function2) objY2);
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        aVar.N(552206879);
                        z7e z7eVar2 = (z7e) ytwVarB.getValue();
                        z7e.k kVar = z7eVar2 instanceof z7e.k ? (z7e.k) z7eVar2 : null;
                        if (kVar == null) {
                            aVar.N(-61455934);
                            aVar.H();
                        } else {
                            aVar.N(-61455933);
                            g02Var.P0().d0.b();
                            boolean zA = aVar.A(g02Var);
                            Object objY3 = aVar.y();
                            if (zA || objY3 == c0042a) {
                                objY3 = new f02(0, g02Var, ytwVar);
                                aVar.r(objY3);
                            }
                            byte[] bArrDecode = Base64.decode(kVar.b, 2);
                            bArrDecode.getClass();
                            z7e.k kVar2 = kVar;
                            o4w.a(kVar2.c, 0, aVar, null, new String(bArrDecode, Charsets.UTF_8), (Function0) objY3, false);
                            aVar.H();
                        }
                        aVar.H();
                    } else {
                        aVar.N(-60803941);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                lfj0.b((qcn) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ d02(g02 g02Var) {
        this.b = g02Var;
    }
}
