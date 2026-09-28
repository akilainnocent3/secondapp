package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxea0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xea0 extends g3m {
    public psm f;
    public azm i;
    public mgb0 v;
    public yfx w;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        this.w = NavHostFragment.a.a(this);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(-921683321, new Function2() { // from class: uea0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final xea0 xea0Var = this.a;
                    or0.a(null, false, false, null, pp8.b(-956146480, new Function2() { // from class: vea0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final xea0 xea0Var2 = xea0Var;
                                boolean zA = aVar2.A(xea0Var2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new n3a(xea0Var2, 5);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(xea0Var2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new s4j(xea0Var2, i);
                                    aVar2.r(objY2);
                                }
                                Function0 function1 = (Function0) objY2;
                                boolean zA3 = aVar2.A(xea0Var2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new Function1() { // from class: wea0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            Boolean boolIsCreator;
                                            String str = (String) obj5;
                                            str.getClass();
                                            SocialRouter$PersonalSocial socialRouter$PersonalSocial = SocialRouter$PersonalSocial.a;
                                            xea0 xea0Var3 = xea0Var2;
                                            psm psmVar = xea0Var3.f;
                                            if (psmVar == null) {
                                                Intrinsics.n("countryManager");
                                                throw null;
                                            }
                                            CountryCodeName countryCode = psmVar.getCountryCode();
                                            psm psmVar2 = xea0Var3.f;
                                            if (psmVar2 == null) {
                                                Intrinsics.n("countryManager");
                                                throw null;
                                            }
                                            CountryCodeName countryCode2 = psmVar2.getCountryCode();
                                            psm psmVar3 = xea0Var3.f;
                                            if (psmVar3 == null) {
                                                Intrinsics.n("countryManager");
                                                throw null;
                                            }
                                            CountryCodeName countryCode3 = psmVar3.getCountryCode();
                                            mgb0 mgb0Var = xea0Var3.v;
                                            if (mgb0Var == null) {
                                                Intrinsics.n("accountStorage");
                                                throw null;
                                            }
                                            AccountInfo accountInfoLastAccountInfo = mgb0Var.lastAccountInfo();
                                            SocialRouter$PersonalSocial.Data data = new SocialRouter$PersonalSocial.Data(str, false, null, null, false, false, countryCode, countryCode2, countryCode3, null, 0, 0, false, null, (accountInfoLastAccountInfo == null || (boolIsCreator = accountInfoLastAccountInfo.isCreator()) == null) ? false : boolIsCreator.booleanValue(), null, 48702, null);
                                            socialRouter$PersonalSocial.getClass();
                                            xnu xnuVarA = ej0.a(SocialRouter$PersonalSocial.a(data));
                                            yfx yfxVar = xea0Var3.w;
                                            if (yfxVar != null) {
                                                wix.a(yfxVar, socialRouter$PersonalSocial, xnuVarA);
                                                return Unit.a;
                                            }
                                            Intrinsics.n("navController");
                                            throw null;
                                        }
                                    };
                                    aVar2.r(objY3);
                                }
                                hfa0.c(null, function0, function1, (Function1) objY3, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
