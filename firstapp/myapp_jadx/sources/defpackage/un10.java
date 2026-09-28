package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class un10 {
    public static final void a(final phx phxVar, final d dVar, a aVar, final int i) {
        phxVar.getClass();
        dVar.getClass();
        b bVarI = aVar.i(-770803520);
        int i2 = (bVarI.A(phxVar) ? 4 : 2) | i | (bVarI.M(dVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            fn10 fn10Var = fn10.INSTANCE;
            boolean zA = bVarI.A(phxVar);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function1() { // from class: in10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ghx ghxVar = (ghx) obj;
                        ghxVar.getClass();
                        final phx phxVar2 = phxVar;
                        op8 op8Var = new op8(-1232108462, new iaj() { // from class: ln10
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a aVar2 = (a) obj4;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ((ifx) obj3).getClass();
                                w8i0 w8i0VarA = zdt.a(aVar2);
                                if (w8i0VarA == null) {
                                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                cn10 cn10Var = (cn10) p8i0.a(jq40.a(cn10.class), w8i0VarA, null, cll.a(w8i0VarA, aVar2), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar2);
                                er10 er10Var = (er10) wyh.c(cn10Var.b, aVar2, 0, 7).getValue();
                                boolean zA2 = aVar2.A(cn10Var);
                                Object objY2 = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA2 || objY2 == c0042a) {
                                    pn10 pn10Var = new pn10(1, cn10Var, cn10.class, "onFeatureSelected", "onFeatureSelected(Lcom/sportybet/feature/playtimecontrol/main/model/PlaytimeControlFeature;)V", 0);
                                    aVar2.r(pn10Var);
                                    objY2 = pn10Var;
                                }
                                Function1 function1 = (Function1) ((chp) objY2);
                                boolean zA3 = aVar2.A(cn10Var);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    qn10 qn10Var = new qn10(1, cn10Var, cn10.class, "onSetupClick", "onSetupClick(Lcom/sportybet/feature/playtimecontrol/main/model/PlaytimeControlFeature;)Lkotlinx/coroutines/Job;", 8);
                                    aVar2.r(qn10Var);
                                    objY3 = qn10Var;
                                }
                                Function1 function2 = (Function1) objY3;
                                boolean zA4 = aVar2.A(cn10Var);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    rn10 rn10Var = new rn10(0, cn10Var, cn10.class, "onRemoveTimeOutClicked", "onRemoveTimeOutClicked()Lkotlinx/coroutines/Job;", 8);
                                    aVar2.r(rn10Var);
                                    objY4 = rn10Var;
                                }
                                Function0 function0 = (Function0) objY4;
                                boolean zA5 = aVar2.A(cn10Var);
                                Object objY5 = aVar2.y();
                                if (zA5 || objY5 == c0042a) {
                                    sn10 sn10Var = new sn10(1, cn10Var, cn10.class, "onAdjustTimeOutClicked", "onAdjustTimeOutClicked(Lcom/sportybet/feature/playtimecontrol/main/model/PlaytimeControlFeature;)Lkotlinx/coroutines/Job;", 8);
                                    aVar2.r(sn10Var);
                                    objY5 = sn10Var;
                                }
                                xm10.e(er10Var, function1, function2, function0, (Function1) objY5, aVar2, 0);
                                Context context = (Context) aVar2.O(AndroidCompositionLocals_androidKt.b);
                                Object objY6 = aVar2.y();
                                if (objY6 == c0042a) {
                                    objY6 = m.b(Boolean.FALSE);
                                    aVar2.r(objY6);
                                }
                                final ytw ytwVar = (ytw) objY6;
                                Unit unit = Unit.a;
                                boolean zA6 = aVar2.A(cn10Var);
                                final phx phxVar3 = phxVar2;
                                boolean zA7 = zA6 | aVar2.A(phxVar3) | aVar2.A(context);
                                Object objY7 = aVar2.y();
                                if (zA7 || objY7 == c0042a) {
                                    tn10 tn10Var = new tn10(cn10Var, phxVar3, context, ytwVar, null);
                                    aVar2.r(tn10Var);
                                    objY7 = tn10Var;
                                }
                                xvf.e(aVar2, unit, (Function2) objY7);
                                if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                                    aVar2.N(-949939920);
                                    aVar2.H();
                                    return unit;
                                }
                                aVar2.N(-950734667);
                                String strA = cb40.a(R.string.common_functions__remove, new Object[0], aVar2);
                                String strA2 = cb40.a(R.string.playtime_control__are_you_sure_you_want_to_remove_this_time_out_period, new Object[0], aVar2);
                                String strA3 = cb40.a(R.string.common_functions__yes, new Object[0], aVar2);
                                String strA4 = cb40.a(R.string.common_functions__no, new Object[0], aVar2);
                                boolean zA8 = aVar2.A(phxVar3);
                                Object objY8 = aVar2.y();
                                if (zA8 || objY8 == c0042a) {
                                    objY8 = new Function0() { // from class: nn10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ytwVar.setValue(Boolean.FALSE);
                                            yfx.h(phxVar3, hn10.INSTANCE, bjx.a(new r8a(1, new kkx())), 4);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY8);
                                }
                                Function0 function3 = (Function0) objY8;
                                Object objY9 = aVar2.y();
                                if (objY9 == c0042a) {
                                    objY9 = new on10(ytwVar, 0);
                                    aVar2.r(objY9);
                                }
                                nzj.d(strA, strA2, null, null, strA3, strA4, null, null, null, null, null, function3, (Function0) objY9, null, aVar2, 0, 3072, 20380);
                                aVar2.H();
                                return unit;
                            }
                        }, true);
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        m2g m2gVar = m2g.a;
                        hhx.a(ghxVar, jq40.a(fn10.class), o2gVar, m2gVar, null, null, null, null, op8Var);
                        hhx.a(ghxVar, jq40.a(dn10.class), o2gVar, m2gVar, null, null, null, null, new op8(-65179482, new iaj() { // from class: mn10
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                ifx ifxVar = (ifx) obj3;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ifxVar.getClass();
                                dn10 dn10Var = (dn10) mfx.a(ifxVar, jq40.a(dn10.class));
                                String str = dn10Var.a;
                                String str2 = dn10Var.b;
                                String str3 = dn10Var.c;
                                isf.a(cr10.valueOf(str), str2, str3, phxVar2, null, (a) obj4, 0);
                                return Unit.a;
                            }
                        }, true));
                        hhx.a(ghxVar, jq40.a(hn10.class), o2gVar, m2gVar, null, null, null, null, yj9.a);
                        hhx.a(ghxVar, jq40.a(en10.class), o2gVar, m2gVar, null, null, null, null, new op8(-2000666760, new iaj() { // from class: kn10
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                ifx ifxVar = (ifx) obj3;
                                ((Integer) obj5).getClass();
                                ((pf0) obj2).getClass();
                                ifxVar.getClass();
                                en10 en10Var = (en10) mfx.a(ifxVar, jq40.a(en10.class));
                                String str = en10Var.a;
                                int i3 = en10Var.b;
                                frf.b(cr10.valueOf(str), i3, phxVar2, null, (a) obj4, 0);
                                return Unit.a;
                            }
                        }, true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            uix.b(phxVar, fn10Var, dVar, null, null, null, null, null, null, (Function1) objY, bVarI, (i2 & 14) | 48 | ((i2 << 3) & 896), 2040);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar, i) { // from class: jn10
                public final /* synthetic */ d b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    un10.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
