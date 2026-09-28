package defpackage;

import android.view.animation.AnimationUtils;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.viewmodels.FbgData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j2j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j2j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PromotionGiftsResponse promotionGiftsResponse;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final n2j n2jVar = (n2j) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState == null) {
                    return Unit.a;
                }
                int i2 = n2j.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    n2jVar.C0();
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    List<GiftItem> listR0 = n2j.r0((hTTPResponse == null || (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) == null) ? null : promotionGiftsResponse.getEntityList());
                    n2jVar.c0 = listR0;
                    if (listR0 == null || listR0.isEmpty()) {
                        n2jVar.e0 = false;
                        n2jVar.C0();
                    } else {
                        n2jVar.e0 = true;
                        if (!n2jVar.b0) {
                            final List<GiftItem> list = n2jVar.c0;
                            if (list == null || list.isEmpty()) {
                                n2jVar.C0();
                            } else {
                                n2jVar.b0 = true;
                                Iterator<T> it = list.iterator();
                                final double curBal = 0.0d;
                                while (it.hasNext()) {
                                    curBal += ((GiftItem) it.next()).getCurBal();
                                }
                                r750.d(n2jVar.t0(), new Function0() { // from class: b1j
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        n2j n2jVar2 = n2jVar;
                                        djh djhVar = n2jVar2.b;
                                        List list2 = list;
                                        double d = curBal;
                                        if (djhVar != null) {
                                            GiftToast giftToast = djhVar.B;
                                            op5 op5Var = op5.a;
                                            String currency = ((GiftItem) list2.get(0)).getCurrency();
                                            op5Var.getClass();
                                            GiftToast.setToastText$default(giftToast, op5.i(currency), d, null, 4, null);
                                        }
                                        djh djhVar2 = n2jVar2.b;
                                        if (djhVar2 != null) {
                                            djhVar2.B.setVisibility(0);
                                        }
                                        djh djhVar3 = n2jVar2.b;
                                        if (djhVar3 != null) {
                                            djhVar3.B.setClickable(true);
                                        }
                                        ssw<FbgData> sswVar = jbh.a;
                                        Double dValueOf = Double.valueOf(d);
                                        op5 op5Var2 = op5.a;
                                        String currency2 = ((GiftItem) list2.get(0)).getCurrency();
                                        op5Var2.getClass();
                                        sswVar.j(new FbgData(true, dValueOf, op5.i(currency2)));
                                        djh djhVar4 = n2jVar2.b;
                                        if (djhVar4 != null) {
                                            djhVar4.B.startAnimation(AnimationUtils.loadAnimation(n2jVar2.getActivity(), R.anim.fade_in_fade_out_toast));
                                        }
                                        return Unit.a;
                                    }
                                });
                                ej5.c(o8i0.d(n2jVar.t0()), null, null, new q3j(n2jVar, null), 3);
                            }
                        }
                    }
                }
                return Unit.a;
            default:
                xdx xdxVar = (xdx) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                xdxVar.b = OtpData.NameUpdate.a((OtpData.NameUpdate) xdxVar.B1(), oTPResult);
                return Unit.a;
        }
    }
}
