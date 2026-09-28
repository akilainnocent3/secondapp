package defpackage;

import android.graphics.drawable.Icon;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.gift.gift.presentation.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class osk implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ osk(v5b v5bVar, zpz zpzVar) {
        this.b = zpzVar;
        this.c = v5bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final zpz zpzVar = (zpz) obj4;
                final v5b v5bVar = (v5b) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z = zpzVar.k() == 0;
                    d.a aVar2 = d.a.b;
                    d dVarH = g3w.h(aVar2, "valid_gift");
                    boolean zA = aVar.A(v5bVar) | aVar.M(zpzVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: yrk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ej5.c(v5bVar, null, null, new h.b(zpzVar, null), 3);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    w1f0.b(z, (Function0) objY, dVarH, false, pp8.b(149931760, new zrk(zpzVar), aVar), 0L, 0L, aVar, 24960, 488);
                    boolean z2 = zpzVar.k() == 1;
                    d dVarH2 = g3w.h(aVar2, "gift_used_expired");
                    boolean zA2 = aVar.A(v5bVar) | aVar.M(zpzVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: ask
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ej5.c(v5bVar, null, null, new h.c(zpzVar, null), 3);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    w1f0.b(z2, (Function0) objY2, dVarH2, false, pp8.b(17635431, new Function2() { // from class: bsk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            imf0 imf0Var;
                            a aVar3 = (a) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                String strA = cb40.a(R.string.gift__used_expired, new Object[0], aVar3);
                                if (zpzVar.k() == 1) {
                                    aVar3.N(1391284629);
                                    imf0Var = ((ijb0) aVar3.O(kjb0.a)).i;
                                    aVar3.H();
                                } else {
                                    aVar3.N(1391360021);
                                    imf0Var = ((ijb0) aVar3.O(kjb0.a)).j;
                                    aVar3.H();
                                }
                                lkf0.d(strA, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar3, 0, 0, 131070);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), 0L, 0L, aVar, 24960, 488);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((hef0) obj4).b((Icon) obj3, (a) obj, qj40.a(49));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ osk(hef0 hef0Var, Icon icon, int i) {
        this.b = hef0Var;
        this.c = icon;
    }
}
