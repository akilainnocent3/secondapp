package defpackage;

import android.text.Editable;
import androidx.compose.runtime.a;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.patron.FavoriteMarket;
import com.sporty.android.core.model.patron.FavoriteMarketItem;
import com.sporty.android.core.model.patron.FavoriteSummary;
import com.sporty.android.platform.features.userfeedback.UserFeedbackActivity;
import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment;
import com.sportybet.android.globalpay.pixBtg.deposit.f;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import com.sportybet.plugin.realsports.data.MyFavoriteSport;
import com.sportybet.plugin.realsports.data.MySelectedMarket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tvw implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tvw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                uvw uvwVar = (uvw) obj3;
                hqc hqcVar = (hqc) obj;
                hqc hqcVar2 = (hqc) obj2;
                pzw pzwVar = uvwVar.z;
                if ((hqcVar instanceof lqc) || (hqcVar2 instanceof lqc)) {
                    return new lqc();
                }
                if (!(hqcVar instanceof nqc) || !(hqcVar2 instanceof nqc)) {
                    return new kqc();
                }
                List list = (List) ((nqc) hqcVar).a;
                List<FavoriteMarket> list2 = ((FavoriteSummary) ((nqc) hqcVar2).a).markets;
                ArrayList arrayList = pzwVar.c;
                arrayList.clear();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    if (list2.size() > 0) {
                        for (FavoriteMarket favoriteMarket : list2) {
                            MySelectedMarket mySelectedMarket = (MySelectedMarket) linkedHashMap.get(favoriteMarket.sportId);
                            if (mySelectedMarket == null) {
                                MySelectedMarket mySelectedMarket2 = new MySelectedMarket();
                                mySelectedMarket2.sportId = favoriteMarket.sportId;
                                mySelectedMarket2.marketIds = new ArrayList();
                                Iterator<FavoriteMarketItem> it = favoriteMarket.markets.iterator();
                                while (it.hasNext()) {
                                    mySelectedMarket2.marketIds.add(it.next().id);
                                }
                                linkedHashMap.put(favoriteMarket.sportId, mySelectedMarket2);
                            } else {
                                Iterator<FavoriteMarketItem> it2 = favoriteMarket.markets.iterator();
                                while (it2.hasNext()) {
                                    mySelectedMarket.marketIds.add(it2.next().id);
                                }
                            }
                        }
                    }
                    break;
                } catch (Exception unused) {
                }
                pzwVar.a = linkedHashMap;
                if (arrayList.size() == 0) {
                    arrayList.addAll(list);
                }
                if (arrayList.size() > 0) {
                    uvwVar.i.a(((MyFavoriteSport) arrayList.get(0)).id);
                }
                return new nqc(pzwVar);
            case 1:
                final PixBtgDepositFragment pixBtgDepositFragment = (PixBtgDepositFragment) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pixBtgDepositFragment.D1(6, pp8.b(407479384, new gaj() { // from class: g710
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            f.c cVar = (f.c) obj4;
                            a aVar2 = (a) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ohp<Object>[] ohpVarArr2 = PixBtgDepositFragment.m0;
                            cVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar2.M(cVar) : aVar2.A(cVar) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                uf00<af10> uf00Var = cVar.d;
                                Integer num = cVar.e;
                                s610 s610Var = cVar.f;
                                final PixBtgDepositFragment pixBtgDepositFragment2 = pixBtgDepositFragment;
                                boolean zA = aVar2.A(pixBtgDepositFragment2);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new Function1() { // from class: j710
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            boolean z;
                                            uf00<af10> uf00Var2;
                                            Integer num2;
                                            final af10 af10Var = (af10) obj7;
                                            ohp<Object>[] ohpVarArr3 = PixBtgDepositFragment.m0;
                                            af10Var.getClass();
                                            PixBtgDepositFragment pixBtgDepositFragment3 = pixBtgDepositFragment2;
                                            g gVarF1 = pixBtgDepositFragment3.F1();
                                            int i3 = af10Var.a;
                                            f.c cVarZ1 = gVarF1.z1();
                                            if (cVarZ1 == null || (num2 = cVarZ1.e) == null || num2.intValue() != i3) {
                                                f.c cVarZ2 = gVarF1.z1();
                                                if (cVarZ2 != null && (uf00Var2 = cVarZ2.d) != null && !uf00Var2.isEmpty()) {
                                                    Iterator<af10> it3 = uf00Var2.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            z = false;
                                                            break;
                                                        }
                                                        if (it3.next().c) {
                                                            z = true;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    z = false;
                                                    break;
                                                }
                                                gVarF1.I1(new Function1() { // from class: q810
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj8) {
                                                        f.c cVar2 = (f.c) obj8;
                                                        cVar2.getClass();
                                                        return f.c.a(cVar2, null, 0.0d, null, null, Integer.valueOf(af10Var.a), null, null, null, 239);
                                                    }
                                                });
                                                gVarF1.I.a(new gnd(i3, z), k00.d);
                                                if (i3 == 100) {
                                                    gVarF1.J.a("target_chip_clicked");
                                                }
                                            }
                                            pixBtgDepositFragment3.E1().b.setText(String.valueOf(i3));
                                            ClearEditText clearEditText = pixBtgDepositFragment3.E1().b;
                                            Editable text = pixBtgDepositFragment3.E1().b.getText();
                                            clearEditText.setSelection(text != null ? text.length() : 0);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                ze10.a(uf00Var, num, s610Var, null, (Function1) objY, aVar2, 512);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            case 2:
                vad0 vad0Var = (vad0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gvi gviVar = vad0Var.z;
                    if (gviVar != null) {
                        gviVar.v0.setVisibility(0);
                    }
                    vad0Var.q3(0, aVar2);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                final UserFeedbackActivity userFeedbackActivity = (UserFeedbackActivity) obj3;
                a aVar3 = (a) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i3 = UserFeedbackActivity.d;
                if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zA = aVar3.A(userFeedbackActivity);
                    Object objY = aVar3.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new k9s(userFeedbackActivity, i2);
                        aVar3.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar3.A(userFeedbackActivity);
                    Object objY2 = aVar3.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: uoh0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                UserFeedbackActivity userFeedbackActivity2 = userFeedbackActivity;
                                azm azmVar = userFeedbackActivity2.b;
                                if (azmVar == null) {
                                    Intrinsics.n("iRouter");
                                    throw null;
                                }
                                azmVar.d(wae.HOME);
                                userFeedbackActivity2.finish();
                                return Unit.a;
                            }
                        };
                        aVar3.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar3.A(userFeedbackActivity);
                    Object objY3 = aVar3.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function1() { // from class: voh0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                snb0 snb0Var = (snb0) obj4;
                                int i4 = UserFeedbackActivity.d;
                                snb0Var.getClass();
                                UserFeedbackActivity userFeedbackActivity2 = userFeedbackActivity;
                                d0n d0nVar = userFeedbackActivity2.c;
                                if (d0nVar != null) {
                                    d0nVar.b(userFeedbackActivity2, snb0Var);
                                    return Unit.a;
                                }
                                Intrinsics.n("utils");
                                throw null;
                            }
                        };
                        aVar3.r(objY3);
                    }
                    eph0.a(null, function0, function1, (Function1) objY3, aVar3, 0);
                } else {
                    aVar3.G();
                }
                return Unit.a;
        }
    }
}
