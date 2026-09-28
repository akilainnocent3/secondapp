package defpackage;

import androidx.compose.runtime.a;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.feature.loyal.LoyalJoinDialogActivity;
import dn6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ym6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ym6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.a;
        Object obj3 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                final dn6 dn6Var = (dn6) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-111264671, new Function2() { // from class: zm6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            int i3 = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                Unit unit = Unit.a;
                                final dn6 dn6Var2 = dn6Var;
                                boolean zA = aVar2.A(dn6Var2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = dn6Var2.new a(null);
                                    aVar2.r(objY);
                                }
                                xvf.e(aVar2, unit, (Function2) objY);
                                String string = dn6Var2.requireArguments().getString("arg_amount");
                                String str2 = string == null ? "" : string;
                                String string2 = dn6Var2.requireArguments().getString("arg_success_text");
                                String str3 = string2 != null ? string2 : "";
                                int i4 = dn6Var2.requireArguments().getInt(TEFcJcMqR.LPCDkxcQzM, -1);
                                boolean z = dn6Var2.requireArguments().getBoolean("arg_show_rebet_option", false);
                                boolean z2 = dn6Var2.requireArguments().getBoolean("arg_show_sim_rebet_option", false);
                                String string3 = dn6Var2.requireArguments().getString("arg_partial_left_text");
                                boolean zA2 = aVar2.A(dn6Var2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new an6(dn6Var2, 0);
                                    aVar2.r(objY2);
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zA3 = aVar2.A(dn6Var2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new bn6(dn6Var2, i3);
                                    aVar2.r(objY3);
                                }
                                Function0 function1 = (Function0) objY3;
                                boolean zA4 = aVar2.A(dn6Var2);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    objY4 = new Function0() { // from class: cn6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            dn6 dn6Var3 = dn6Var2;
                                            rdd0 rdd0Var = dn6Var3.f;
                                            if (rdd0Var == null) {
                                                Intrinsics.n("sportyTrackingUseCase");
                                                throw null;
                                            }
                                            rdd0Var.a(yxy.a, k00.d);
                                            dn6Var3.v = null;
                                            ij6 ij6Var = dn6Var3.y;
                                            if (ij6Var != null) {
                                                ij6Var.invoke();
                                            }
                                            dn6Var3.dismissAllowingStateLoss();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY4);
                                }
                                jn6.a(str2, str3, i4, z, function0, function1, z2, (Function0) objY4, string3, aVar2, 0, 0);
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
                LoyalJoinDialogActivity loyalJoinDialogActivity = (LoyalJoinDialogActivity) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i3 = LoyalJoinDialogActivity.b;
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (loyalJoinDialogActivity.getCountryManager().r()) {
                        str = xib0.LOYAL_JOIN_INT;
                    } else {
                        str = loyalJoinDialogActivity.getCountryManager().getCountryCode() == CountryCodeName.GHANA ? xib0.LOYAL_JOIN_GH : xib0.LOYAL_JOIN;
                    }
                    boolean zA = aVar2.A(loyalJoinDialogActivity);
                    Object objY = aVar2.y();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new ora(loyalJoinDialogActivity, i2);
                        aVar2.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar2.A(loyalJoinDialogActivity);
                    Object objY2 = aVar2.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new an6(loyalJoinDialogActivity, i2);
                        aVar2.r(objY2);
                    }
                    wpt.b(0, aVar2, str, function0, (Function0) objY2);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
