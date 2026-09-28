package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.fragment.app.e;
import cn00.h;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.social.domain.entity.SocialMineType;
import com.sportybet.android.social.presentation.codeChat.room.CodeChatRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rmm implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                smm.d((Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                final cn00 cn00Var = (cn00) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarE = j.e(d.a.b, 1.0f);
                    kq00 kq00VarN0 = cn00Var.n0();
                    el00 el00Var = (el00) cn00Var.F.getValue();
                    bsi bsiVar = (bsi) cn00Var.G.getValue();
                    k130 k130Var = (k130) cn00Var.J.getValue();
                    boolean zA = aVar.A(cn00Var);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        cn00.a aVar2 = new cn00.a(0, cn00Var, cn00.class, "onNavigateHome", "onNavigateHome()V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    chp chpVar = (chp) objY;
                    boolean zA2 = aVar.A(cn00Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        cn00.i iVar = new cn00.i(0, cn00Var, cn00.class, "onNavigateSports", "onNavigateSports()V", 0);
                        aVar.r(iVar);
                        objY2 = iVar;
                    }
                    chp chpVar2 = (chp) objY2;
                    boolean zA3 = aVar.A(cn00Var);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        cn00.j jVar = new cn00.j(1, cn00Var, cn00.class, "onNavigateCodeHub", "onNavigateCodeHub(Lcom/sportybet/android/codehub/data/CodeHubTab;)V", 0);
                        aVar.r(jVar);
                        objY3 = jVar;
                    }
                    chp chpVar3 = (chp) objY3;
                    boolean zA4 = aVar.A(cn00Var);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        cn00.k kVar = new cn00.k(0, cn00Var, cn00.class, "onNavigateToSocialSearch", "onNavigateToSocialSearch()V", 0);
                        aVar.r(kVar);
                        objY4 = kVar;
                    }
                    chp chpVar4 = (chp) objY4;
                    boolean zA5 = aVar.A(cn00Var);
                    Object objY5 = aVar.y();
                    if (zA5 || objY5 == c0042a) {
                        cn00.l lVar = new cn00.l(1, cn00Var, cn00.class, "onDemandAccount", "onDemandAccount(Lcom/sportybet/android/social/domain/entity/SocialNetworkEvent;)V", 0);
                        aVar.r(lVar);
                        objY5 = lVar;
                    }
                    chp chpVar5 = (chp) objY5;
                    boolean zA6 = aVar.A(cn00Var);
                    Object objY6 = aVar.y();
                    if (zA6 || objY6 == c0042a) {
                        cn00.m mVar = new cn00.m(1, cn00Var, cn00.class, "onNavigateSocial", "onNavigateSocial(Ljava/lang/String;)V", 0);
                        aVar.r(mVar);
                        objY6 = mVar;
                    }
                    chp chpVar6 = (chp) objY6;
                    boolean zA7 = aVar.A(cn00Var);
                    Object objY7 = aVar.y();
                    if (zA7 || objY7 == c0042a) {
                        cn00.n nVar = new cn00.n(2, cn00Var, cn00.class, "onNavigateCreation", "onNavigateCreation(Ljava/lang/String;Ljava/lang/String;)V", 0);
                        aVar.r(nVar);
                        objY7 = nVar;
                    }
                    chp chpVar7 = (chp) objY7;
                    boolean zA8 = aVar.A(cn00Var);
                    Object objY8 = aVar.y();
                    if (zA8 || objY8 == c0042a) {
                        cn00.o oVar = new cn00.o(1, cn00Var, cn00.class, "onEditCode", "onEditCode(Lcom/sportybet/android/social/domain/entity/SocialCodeEvent$EditCode;)V", 0);
                        aVar.r(oVar);
                        objY8 = oVar;
                    }
                    chp chpVar8 = (chp) objY8;
                    boolean zA9 = aVar.A(cn00Var);
                    Object objY9 = aVar.y();
                    if (zA9 || objY9 == c0042a) {
                        cn00.p pVar = new cn00.p(1, cn00Var, cn00.class, "onAddCode", "onAddCode(Lcom/sportybet/android/social/domain/entity/SocialCodeEvent$AddCode;)V", 0);
                        aVar.r(pVar);
                        objY9 = pVar;
                    }
                    chp chpVar9 = (chp) objY9;
                    boolean zA10 = aVar.A(cn00Var);
                    Object objY10 = aVar.y();
                    if (zA10 || objY10 == c0042a) {
                        cn00.b bVar = new cn00.b(1, cn00Var, cn00.class, "onHighLiabilityCode", "onHighLiabilityCode(Lcom/sportybet/android/social/domain/entity/SocialCodeEvent$HighLiabilityCode;)V", 0);
                        aVar.r(bVar);
                        objY10 = bVar;
                    }
                    chp chpVar10 = (chp) objY10;
                    boolean zA11 = aVar.A(cn00Var);
                    Object objY11 = aVar.y();
                    if (zA11 || objY11 == c0042a) {
                        cn00.c cVar = new cn00.c(1, cn00Var, cn00.class, "onCodeStatistic", "onCodeStatistic(Lcom/sportybet/android/social/domain/entity/PersonalCodeViewState$CodeDetailState;)V", 0);
                        aVar.r(cVar);
                        objY11 = cVar;
                    }
                    chp chpVar11 = (chp) objY11;
                    boolean zA12 = aVar.A(cn00Var);
                    Object objY12 = aVar.y();
                    if (zA12 || objY12 == c0042a) {
                        cn00.d dVar = new cn00.d(0, cn00Var, cn00.class, "onShareMyBet", "onShareMyBet()V", 0);
                        aVar.r(dVar);
                        objY12 = dVar;
                    }
                    chp chpVar12 = (chp) objY12;
                    boolean zA13 = aVar.A(cn00Var);
                    Object objY13 = aVar.y();
                    if (zA13 || objY13 == c0042a) {
                        cn00.e eVar = new cn00.e(0, cn00Var, cn00.class, "onCheckBetHistory", "onCheckBetHistory()V", 0);
                        aVar.r(eVar);
                        objY13 = eVar;
                    }
                    chp chpVar13 = (chp) objY13;
                    boolean zA14 = aVar.A(cn00Var);
                    Object objY14 = aVar.y();
                    if (zA14 || objY14 == c0042a) {
                        cn00.f fVar = new cn00.f(0, cn00Var, cn00.class, "onEditAvatar", "onEditAvatar()V", 0);
                        aVar.r(fVar);
                        objY14 = fVar;
                    }
                    chp chpVar14 = (chp) objY14;
                    boolean zA15 = aVar.A(cn00Var);
                    Object objY15 = aVar.y();
                    if (zA15 || objY15 == c0042a) {
                        objY15 = new hz3(cn00Var, 2);
                        aVar.r(objY15);
                    }
                    Function0 function0 = (Function0) objY15;
                    Function0 function1 = (Function0) chpVar;
                    Function0 function2 = (Function0) chpVar2;
                    Function1 function3 = (Function1) chpVar3;
                    Function0 function4 = (Function0) chpVar4;
                    Function1 function5 = (Function1) chpVar5;
                    boolean zA16 = aVar.A(cn00Var);
                    Object objY16 = aVar.y();
                    if (zA16 || objY16 == c0042a) {
                        objY16 = new gaj() { // from class: zm00
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                String str = (String) obj4;
                                SocialMineType socialMineType = (SocialMineType) obj6;
                                str.getClass();
                                socialMineType.getClass();
                                rfa0 rfa0Var = rfa0.a;
                                cn00Var.r0(str, (CountryCodeName) obj5, socialMineType, rfa0Var);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY16);
                    }
                    gaj gajVar = (gaj) objY16;
                    boolean zA17 = aVar.A(cn00Var);
                    Object objY17 = aVar.y();
                    if (zA17 || objY17 == c0042a) {
                        objY17 = new gaj() { // from class: an00
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                String str = (String) obj4;
                                SocialMineType socialMineType = (SocialMineType) obj6;
                                str.getClass();
                                socialMineType.getClass();
                                rfa0 rfa0Var = rfa0.b;
                                cn00Var.r0(str, (CountryCodeName) obj5, socialMineType, rfa0Var);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY17);
                    }
                    gaj gajVar2 = (gaj) objY17;
                    Function1 function6 = (Function1) chpVar6;
                    Function2 function7 = (Function2) chpVar7;
                    boolean zA18 = aVar.A(cn00Var);
                    Object objY18 = aVar.y();
                    if (zA18 || objY18 == c0042a) {
                        objY18 = new kz3(cn00Var, i2);
                        aVar.r(objY18);
                    }
                    Function2 function8 = (Function2) objY18;
                    Function1 function9 = (Function1) chpVar8;
                    Function1 function10 = (Function1) chpVar9;
                    Function1 function11 = (Function1) chpVar10;
                    Function1 function12 = (Function1) chpVar11;
                    boolean zA19 = aVar.A(cn00Var);
                    Object objY19 = aVar.y();
                    if (zA19 || objY19 == c0042a) {
                        objY19 = new gaj() { // from class: bn00
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                String str = (String) obj4;
                                String str2 = (String) obj5;
                                BookingData bookingData = (BookingData) obj6;
                                str.getClass();
                                str2.getClass();
                                bookingData.getClass();
                                cn00 cn00Var2 = cn00Var;
                                ej5.c(ebs.a(cn00Var2.getLifecycle()), null, null, cn00Var2.new h(str, str2, bookingData, null), 3);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY19);
                    }
                    gaj gajVar3 = (gaj) objY19;
                    boolean zA20 = aVar.A(cn00Var);
                    Object objY20 = aVar.y();
                    if (zA20 || objY20 == c0042a) {
                        objY20 = new Function2() { // from class: sm00
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                String str = (String) obj4;
                                String str2 = (String) obj5;
                                str.getClass();
                                str2.getClass();
                                if (str.length() != 0 && str2.length() != 0) {
                                    xyd0 xyd0VarA = xyd0.a.a(str, str2, false, null);
                                    e activity = cn00Var.getActivity();
                                    if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                                        xyd0VarA.show(activity.getSupportFragmentManager(), "statisticsDialogFragment");
                                        Unit unit = Unit.a;
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY20);
                    }
                    Function2 function13 = (Function2) objY20;
                    boolean zA21 = aVar.A(cn00Var);
                    Object objY21 = aVar.y();
                    if (zA21 || objY21 == c0042a) {
                        objY21 = new Function0() { // from class: tm00
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                cn00Var.m0().d(wae.ME_GIFTS);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY21);
                    }
                    Function0 function14 = (Function0) objY21;
                    boolean zA22 = aVar.A(cn00Var);
                    Object objY22 = aVar.y();
                    if (zA22 || objY22 == c0042a) {
                        objY22 = new Function1() { // from class: um00
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                String str = (String) obj4;
                                str.getClass();
                                int i3 = CodeChatRoomActivity.f;
                                cn00 cn00Var2 = cn00Var;
                                Context contextRequireContext = cn00Var2.requireContext();
                                contextRequireContext.getClass();
                                Intent intent = new Intent(contextRequireContext, (Class<?>) CodeChatRoomActivity.class);
                                intent.putExtra("extra_booking_code", str);
                                cn00Var2.startActivity(intent);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY22);
                    }
                    eo00.a(dVarE, null, kq00VarN0, el00Var, bsiVar, k130Var, null, function0, function1, function2, function3, function4, function5, gajVar, gajVar2, function6, function7, function8, function9, function10, function11, function12, gajVar3, function13, function14, (Function1) objY22, (Function0) chpVar12, (Function0) chpVar13, (Function0) chpVar14, aVar, 37382);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rmm(cn00 cn00Var) {
        this.b = cn00Var;
    }
}
