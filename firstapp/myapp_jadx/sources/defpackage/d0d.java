package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportybet.feature.debugscreen.impl.DebugScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d0d implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final DebugScreenActivity debugScreenActivity = (DebugScreenActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = DebugScreenActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final hjx hjxVarA = tix.a(new vkx[0], aVar);
                    Object objY = aVar.y();
                    if (objY == a.C0041a.a) {
                        objY = m.b(null);
                        aVar.r(objY);
                    }
                    final ytw ytwVar = (ytw) objY;
                    o0z.a(null, null, null, null, null, pp8.b(188370639, new Function2() { // from class: e0d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            int i3 = DebugScreenActivity.b;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final hjx hjxVar = hjxVarA;
                                DebugScreenActivity debugScreenActivity2 = debugScreenActivity;
                                final ytw ytwVar2 = ytwVar;
                                hy60.a(null, pp8.b(-430540397, new ra4(hjxVar, debugScreenActivity2, ytwVar2), aVar2), null, null, null, 0, ((lib0) aVar2.O(oib0.a)).i0, 0L, null, pp8.b(-783209250, new gaj() { // from class: f0d
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                        tmz tmzVar = (tmz) obj6;
                                        a aVar3 = (a) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        int i4 = DebugScreenActivity.b;
                                        tmzVar.getClass();
                                        if ((iIntValue3 & 6) == 0) {
                                            iIntValue3 |= aVar3.M(tmzVar) ? 4 : 2;
                                        }
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                            d dVarE = h.e(j.e(d.a.b, 1.0f), tmzVar);
                                            Object objY2 = aVar3.y();
                                            if (objY2 == a.C0041a.a) {
                                                final ytw ytwVar3 = ytwVar2;
                                                objY2 = new Function1() { // from class: g0d
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj9) {
                                                        int i5 = DebugScreenActivity.b;
                                                        ytwVar3.setValue((k1g0) obj9);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar3.r(objY2);
                                            }
                                            y1d.a(dVarE, hjxVar, null, (Function1) objY2, aVar3, 3136);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 805306416, 445);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                hor.b((ior) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ d0d(DebugScreenActivity debugScreenActivity) {
        this.b = debugScreenActivity;
    }
}
