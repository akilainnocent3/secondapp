package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.crash.models.ToastType;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w62 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0120  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fgb fgbVar;
        List<GiftItem> entityList;
        Object value;
        z83 z83Var;
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) obj;
                bc6 bc6Var = ((tng0.g) ((tng0) obj2)).e;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(tradeAdditionalResult);
                } else {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                }
                return Unit.a;
            case 1:
                fgb fgbVar2 = (fgb) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i4 = fgb.b.a[loadingState.getStatus().ordinal()];
                if (i4 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    fgbVar2.Q0 = hTTPResponse != null ? (PromotionGiftsResponse) hTTPResponse.getData() : null;
                    if (fgbVar2.x1()) {
                        Object value2 = ((x5a0) fgbVar2.R0().T).getValue();
                        z83 z83Var2 = z83.c;
                        if (value2 != z83Var2 && ((x5a0) fgbVar2.S0().T).getValue() != z83Var2) {
                            Object value3 = ((x5a0) fgbVar2.R0().T).getValue();
                            z83 z83Var3 = z83.b;
                            if (value3 != z83Var3 && ((x5a0) fgbVar2.S0().T).getValue() != z83Var3) {
                                fgbVar2.J0();
                            }
                        }
                        fgbVar2.E0();
                    } else {
                        fgbVar2.J0();
                    }
                    ((x5a0) fgbVar2.f1().e).setValue(Boolean.TRUE);
                    PromotionGiftsResponse promotionGiftsResponse = fgbVar2.Q0;
                    if (promotionGiftsResponse == null || (entityList = promotionGiftsResponse.getEntityList()) == null) {
                        fgbVar = fgbVar2;
                    } else {
                        ArrayList<GiftItem> arrayList = new ArrayList<>(entityList);
                        fgbVar2.g1 = arrayList;
                        if (arrayList.isEmpty()) {
                            fgbVar = fgbVar2;
                            fgbVar.O0 = false;
                            fgbVar.R0().N1(false);
                            fgbVar.S0().N1(false);
                        } else {
                            ArrayList<GiftItem> arrayList2 = fgbVar2.g1;
                            ArrayList arrayList3 = new ArrayList();
                            int size = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size) {
                                GiftItem giftItem = arrayList2.get(i5);
                                i5++;
                                if (!fgbVar2.f1().f.contains(giftItem.getGiftId())) {
                                    arrayList3.add(giftItem);
                                }
                            }
                            fgbVar2.f1().f.clear();
                            LinkedHashSet linkedHashSet = fgbVar2.f1().f;
                            ArrayList<GiftItem> arrayList4 = fgbVar2.g1;
                            ArrayList arrayList5 = new ArrayList(l48.r(arrayList4, 10));
                            int size2 = arrayList4.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                GiftItem giftItem2 = arrayList4.get(i6);
                                i6++;
                                arrayList5.add(giftItem2.getGiftId());
                            }
                            linkedHashSet.addAll(arrayList5);
                            boolean z = (fgbVar2.f1().i || arrayList3.isEmpty()) ? false : true;
                            wwd0 wwd0Var = fgbVar2.f1().v;
                            Boolean boolValueOf = Boolean.valueOf(z);
                            wwd0Var.getClass();
                            wwd0Var.k(null, boolValueOf);
                            fgbVar2.f1().i = false;
                            Boolean boolD = fgbVar2.f1().d.d();
                            if ((boolD != null ? boolD.booleanValue() : false) || fgbVar2.getLifecycle().b().compareTo(s9s.b.e) < 0) {
                                fgbVar = fgbVar2;
                            } else {
                                ArrayList<GiftItem> arrayList6 = fgbVar2.g1;
                                arrayList6.getClass();
                                int size3 = arrayList6.size();
                                double curBal = 0.0d;
                                int i7 = 0;
                                while (i7 < size3) {
                                    GiftItem giftItem3 = arrayList6.get(i7);
                                    i7++;
                                    curBal += giftItem3.getCurBal();
                                }
                                op5 op5Var = op5.a;
                                String currency = arrayList6.get(0).getCurrency();
                                op5Var.getClass();
                                fgbVar = fgbVar2;
                                fgbVar.L0(ToastType.GIFT_FBG, new ehb(fgbVar, op5.i(currency), curBal, null));
                            }
                            fgbVar.R0().N1(true);
                            fgbVar.S0().N1(true);
                            fgbVar.O0 = true;
                        }
                    }
                    if (fgbVar.d1().A && fgbVar.k2()) {
                        fuj fujVarD1 = fgbVar.d1();
                        String str = fgbVar.y0;
                        Locale locale = Locale.ROOT;
                        String lowerCase = str.toLowerCase(locale);
                        lowerCase.getClass();
                        GameDetails gameDetails = fgbVar.i;
                        String name = gameDetails != null ? gameDetails.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        String strF = krh0.f(name);
                        String country = SportyGamesManager.getInstance().getCountry();
                        String lowerCase2 = (country != null ? country : "").toLowerCase(locale);
                        lowerCase2.getClass();
                        fujVarD1.C1(lowerCase, strF, lowerCase2);
                        loa0 loa0VarK1 = fgbVar.k1();
                        String lowerCase3 = fgbVar.y0.toLowerCase(locale);
                        lowerCase3.getClass();
                        loa0VarK1.z1(lowerCase3, fgbVar.w0);
                    }
                } else if (i4 == 2) {
                    fgbVar2.E0();
                    ((x5a0) fgbVar2.f1().e).setValue(Boolean.FALSE);
                } else if (i4 == 3) {
                    if (fgbVar2.x1()) {
                        Object value4 = ((x5a0) fgbVar2.R0().T).getValue();
                        z83 z83Var4 = z83.c;
                        if (value4 == z83Var4 || ((x5a0) fgbVar2.S0().T).getValue() == z83Var4) {
                            fgbVar2.E0();
                        } else {
                            value = ((x5a0) fgbVar2.R0().T).getValue();
                            z83Var = z83.b;
                            if (value != z83Var || ((x5a0) fgbVar2.S0().T).getValue() == z83Var) {
                                fgbVar2.E0();
                            } else {
                                fgbVar2.J0();
                            }
                        }
                    } else {
                        value = ((x5a0) fgbVar2.R0().T).getValue();
                        z83Var = z83.b;
                        if (value != z83Var) {
                            fgbVar2.E0();
                        } else {
                            fgbVar2.E0();
                        }
                    }
                    ((x5a0) fgbVar2.f1().e).setValue(Boolean.TRUE);
                    fgbVar2.O0 = false;
                }
                return Unit.a;
            default:
                String str2 = (String) obj2;
                qcn qcnVar = (qcn) obj;
                if (qcnVar == null) {
                    return qcnVar;
                }
                ArrayList arrayList7 = new ArrayList(qcnVar);
                if (arrayList7.isEmpty()) {
                    return qcnVar;
                }
                int size4 = arrayList7.size();
                while (i3 < size4) {
                    Object obj3 = arrayList7.get(i3);
                    i3++;
                    if (Intrinsics.g(((g7q) obj3).a(), str2)) {
                        p48.A(arrayList7, new x62(str2, i2));
                        return a4h.f(arrayList7);
                    }
                }
                return qcnVar;
        }
    }
}
