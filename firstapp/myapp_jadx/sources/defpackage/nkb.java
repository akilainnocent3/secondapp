package defpackage;

import com.sportybet.android.home.MainActivity;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.viewmodels.FbgData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nkb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nkb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PromotionGiftsResponse promotionGiftsResponse;
        List<GiftItem> entityList;
        GiftItem giftItem;
        String currency;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zqy zqyVar = (zqy) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = enb.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        hvi hviVar = zqyVar.a;
                        ytw<Boolean> ytwVar = zqyVar.W;
                        if (hviVar != null) {
                            hviVar.E.P();
                        }
                        List<GiftItem> entityList2 = promotionGiftsResponse.getEntityList();
                        entityList2.getClass();
                        ArrayList arrayList = (ArrayList) entityList2;
                        p48.A(arrayList, new amb());
                        PromotionGiftsResponse promotionGiftsResponseCopy$default = PromotionGiftsResponse.copy$default(promotionGiftsResponse, arrayList, 0, 0, 0, 14, null);
                        zqyVar.g0 = promotionGiftsResponseCopy$default;
                        List<GiftItem> entityList3 = promotionGiftsResponseCopy$default != null ? promotionGiftsResponseCopy$default.getEntityList() : null;
                        if (entityList3 == null || entityList3.isEmpty()) {
                            ((x5a0) zqyVar.p0().H).setValue(Boolean.FALSE);
                        } else {
                            ((x5a0) zqyVar.p0().H).setValue(Boolean.TRUE);
                        }
                        PromotionGiftsResponse promotionGiftsResponse2 = zqyVar.g0;
                        List<GiftItem> entityList4 = promotionGiftsResponse2 != null ? promotionGiftsResponse2.getEntityList() : null;
                        if (entityList4 != null) {
                            entityList4.isEmpty();
                        }
                        if (zqyVar.l0) {
                            zqyVar.O0();
                        }
                        PromotionGiftsResponse promotionGiftsResponse3 = zqyVar.g0;
                        if (promotionGiftsResponse3 == null || (entityList = promotionGiftsResponse3.getEntityList()) == null || !(!entityList.isEmpty()) || !zqyVar.l0) {
                            zqyVar.l0 = false;
                        } else {
                            x5a0 x5a0Var = (x5a0) ytwVar;
                            x5a0Var.setValue(Boolean.TRUE);
                            PromotionGiftsResponse promotionGiftsResponse4 = zqyVar.g0;
                            List<GiftItem> entityList5 = promotionGiftsResponse4 != null ? promotionGiftsResponse4.getEntityList() : null;
                            if (entityList5 == null) {
                                entityList5 = m2g.a;
                            }
                            entityList5.getClass();
                            Iterator<T> it = entityList5.iterator();
                            double curBal = 0.0d;
                            while (it.hasNext()) {
                                curBal += ((GiftItem) it.next()).getCurBal();
                            }
                            PromotionGiftsResponse promotionGiftsResponse5 = zqyVar.g0;
                            List<GiftItem> entityList6 = promotionGiftsResponse5 != null ? promotionGiftsResponse5.getEntityList() : null;
                            if (entityList6 != null && (giftItem = entityList6.get(0)) != null && (currency = giftItem.getCurrency()) != null) {
                                hvi hviVar2 = zqyVar.a;
                                if (hviVar2 != null) {
                                    GiftToast giftToast = hviVar2.y;
                                    op5.a.getClass();
                                    giftToast.setToastText(op5.i(currency), curBal, Boolean.FALSE);
                                }
                                hvi hviVar3 = zqyVar.a;
                                if (hviVar3 != null) {
                                    hviVar3.y.setClickable(true);
                                }
                                ssw<FbgData> sswVar = jbh.a;
                                Double dValueOf = Double.valueOf(curBal);
                                op5.a.getClass();
                                sswVar.j(new FbgData(true, dValueOf, op5.i(currency)));
                            }
                            zqyVar.l0 = false;
                            ((Boolean) x5a0Var.getValue()).getClass();
                            ej5.c(ebs.a(zqyVar.getLifecycle()), null, null, new ynb(zqyVar, null), 3);
                        }
                    }
                } else if (i2 == 3) {
                    hvi hviVar4 = zqyVar.a;
                    if (hviVar4 != null) {
                        hviVar4.E.P();
                    }
                    ((x5a0) zqyVar.p0().H).setValue(Boolean.FALSE);
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj2;
                int i3 = MainActivity.m0;
                if (((Boolean) obj).booleanValue()) {
                    mainActivity.getOnBackPressedDispatcher().d();
                }
                break;
        }
        return Unit.a;
    }
}
