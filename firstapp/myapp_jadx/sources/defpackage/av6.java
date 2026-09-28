package defpackage;

import android.content.Context;
import android.view.animation.AnimationUtils;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.BetChipContainer;
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
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class av6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ av6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PromotionGiftsResponse promotionGiftsResponse;
        List<GiftItem> entityList;
        GiftItem giftItem;
        String currency;
        List<GiftItem> entityList2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                KonfettiView konfettiView = new KonfettiView(context);
                ((ytw) obj2).setValue(konfettiView);
                return konfettiView;
            case 1:
                ((Function1) obj2).invoke(new vo60.a(((Boolean) obj).booleanValue()));
                return Unit.a;
            default:
                b8b0 b8b0Var = (b8b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = b8b0.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        b8b0Var.h0 = promotionGiftsResponse;
                        if (b8b0Var.j0 == 1) {
                            b8b0Var.J0();
                        }
                        PromotionGiftsResponse promotionGiftsResponse2 = b8b0Var.h0;
                        if (promotionGiftsResponse2 == null || (entityList2 = promotionGiftsResponse2.getEntityList()) == null || !entityList2.isEmpty() || b8b0Var.j0 != 1) {
                            PromotionGiftsResponse promotionGiftsResponse3 = b8b0Var.h0;
                            if (promotionGiftsResponse3 != null && (entityList = promotionGiftsResponse3.getEntityList()) != null && (!entityList.isEmpty()) && b8b0Var.j0 == 1) {
                                PromotionGiftsResponse promotionGiftsResponse4 = b8b0Var.h0;
                                List<GiftItem> entityList3 = promotionGiftsResponse4 != null ? promotionGiftsResponse4.getEntityList() : null;
                                if (entityList3 != null && !entityList3.isEmpty()) {
                                    PromotionGiftsResponse promotionGiftsResponse5 = b8b0Var.h0;
                                    List<GiftItem> entityList4 = promotionGiftsResponse5 != null ? promotionGiftsResponse5.getEntityList() : null;
                                    if (entityList4 == null) {
                                        entityList4 = m2g.a;
                                    }
                                    entityList4.getClass();
                                    Iterator<T> it = entityList4.iterator();
                                    double curBal = 0.0d;
                                    while (it.hasNext()) {
                                        curBal += ((GiftItem) it.next()).getCurBal();
                                    }
                                    PromotionGiftsResponse promotionGiftsResponse6 = b8b0Var.h0;
                                    List<GiftItem> entityList5 = promotionGiftsResponse6 != null ? promotionGiftsResponse6.getEntityList() : null;
                                    if (entityList5 != null && (giftItem = entityList5.get(0)) != null && (currency = giftItem.getCurrency()) != null) {
                                        op5.a.getClass();
                                        String strI = op5.i(currency);
                                        dcb0 dcb0Var = (dcb0) b8b0Var.b;
                                        if (dcb0Var != null) {
                                            GiftToast.setToastText$default(dcb0Var.E, strI, curBal, null, 4, null);
                                        }
                                        dcb0 dcb0Var2 = (dcb0) b8b0Var.b;
                                        if (dcb0Var2 != null) {
                                            dcb0Var2.E.setClickable(true);
                                        }
                                        jbh.a.j(new FbgData(true, Double.valueOf(curBal), currency));
                                    }
                                    dcb0 dcb0Var3 = (dcb0) b8b0Var.b;
                                    if (dcb0Var3 != null) {
                                        dcb0Var3.E.setVisibility(0);
                                    }
                                    dcb0 dcb0Var4 = (dcb0) b8b0Var.b;
                                    if (dcb0Var4 != null) {
                                        dcb0Var4.E.startAnimation(AnimationUtils.loadAnimation(b8b0Var.getContext(), R.anim.fade_in_fade_out_toast));
                                    }
                                }
                                ej5.c(ebs.a(b8b0Var.getLifecycle()), null, null, new c8b0(b8b0Var, null), 3);
                                b8b0Var.j0 = 0;
                            }
                        } else {
                            b8b0Var.j0 = 0;
                        }
                        PromotionGiftsResponse promotionGiftsResponse7 = b8b0Var.h0;
                        List<GiftItem> entityList6 = promotionGiftsResponse7 != null ? promotionGiftsResponse7.getEntityList() : null;
                        if (entityList6 == null || entityList6.isEmpty()) {
                            dcb0 dcb0Var5 = (dcb0) b8b0Var.b;
                            if (dcb0Var5 != null) {
                                dcb0Var5.d.F(b8b0Var.Y);
                            }
                        } else {
                            dcb0 dcb0Var6 = (dcb0) b8b0Var.b;
                            if (dcb0Var6 != null) {
                                BetChipContainer betChipContainer = dcb0Var6.d;
                                ArrayList<Double> arrayList = b8b0Var.Y;
                                ArrayList<Double> arrayList2 = new ArrayList<>();
                                arrayList2.add(Double.valueOf(-1.0d));
                                if (arrayList != null) {
                                    arrayList2.addAll(arrayList);
                                }
                                betChipContainer.F(arrayList2);
                            }
                        }
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    if (b8b0Var.j0 == 1) {
                        b8b0Var.J0();
                    }
                    b8b0Var.j0 = 0;
                }
                return Unit.a;
        }
    }
}
