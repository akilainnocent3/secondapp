package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.b;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sa4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sa4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    odd0.d(null, cb40.a(R.string.biometrics_authentication__biometrics_authentication, new Object[0], aVar), 0L, null, null, null, pp8.b(1254150896, new gaj() { // from class: wa4
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            a aVar2 = (a) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ((e160) obj4).getClass();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                c6n.a(function0, g3w.h(d.a.b, "home"), false, null, null, ys8.a, aVar2, 1572912, 60);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 1572864, 61);
                } else {
                    aVar.G();
                }
                break;
            default:
                final pr40 pr40Var = (pr40) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    final ytw ytwVarC = wyh.c(pr40Var.m0().N, aVar2, 0, 7);
                    final ytw ytwVarC2 = wyh.c(pr40Var.m0().R, aVar2, 0, 7);
                    vob0.a(6, pp8.b(-973540877, new Function2() { // from class: nr40
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar3 = (a) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                b bVar = (b) ytwVarC.getValue();
                                final pr40 pr40Var2 = pr40Var;
                                final twd0 twd0Var = ytwVarC2;
                                c.a(bVar, pp8.b(798024364, new Function2() { // from class: or40
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj6, Object obj7) {
                                        a aVar4 = (a) obj6;
                                        int iIntValue4 = ((Integer) obj7).intValue();
                                        if (aVar4.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            sq30 sq30Var = (sq30) twd0Var.getValue();
                                            pr40 pr40Var3 = pr40Var2;
                                            zr40 zr40VarM0 = pr40Var3.m0();
                                            boolean zA = aVar4.A(zr40VarM0);
                                            Object objY = aVar4.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA || objY == c0042a) {
                                                pr40.a aVar5 = new pr40.a(1, zr40VarM0, zr40.class, "handleEvent", "handleEvent(Lcom/sportygames/refscall/presentation/RCEvent;)V", 0);
                                                aVar4.r(aVar5);
                                                objY = aVar5;
                                            }
                                            Function1 function1 = (Function1) ((chp) objY);
                                            boolean zA2 = aVar4.A(pr40Var3);
                                            Object objY2 = aVar4.y();
                                            if (zA2 || objY2 == c0042a) {
                                                objY2 = new j0d(pr40Var3, 1);
                                                aVar4.r(objY2);
                                            }
                                            mq30.a(sq30Var, function1, (Function0) objY2, aVar4, 0);
                                        } else {
                                            aVar4.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar3), aVar3, 48);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar2), aVar2);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
