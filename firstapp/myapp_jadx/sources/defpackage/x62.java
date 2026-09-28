package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x62 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) obj;
                bc6 bc6Var = ((tng0.d) ((tng0) obj2)).b;
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
                fgb fgbVar = (fgb) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = fgb.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    gvi gviVar = fgbVar.z;
                    if (gviVar != null) {
                        gviVar.Y.N();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    PromotionGiftsResponse promotionGiftsResponse = hTTPResponse != null ? (PromotionGiftsResponse) hTTPResponse.getData() : null;
                    fgbVar.Q0 = promotionGiftsResponse;
                    List<GiftItem> entityList = promotionGiftsResponse != null ? promotionGiftsResponse.getEntityList() : null;
                    if (entityList == null || entityList.isEmpty()) {
                        fgbVar.R0().N1(false);
                        fgbVar.S0().N1(false);
                    } else {
                        fgbVar.R0().N1(true);
                        fgbVar.S0().N1(true);
                    }
                    PromotionGiftsResponse promotionGiftsResponse2 = fgbVar.Q0;
                    List<GiftItem> entityList2 = promotionGiftsResponse2 != null ? promotionGiftsResponse2.getEntityList() : null;
                    fgbVar.O0 = !(entityList2 == null || entityList2.isEmpty());
                } else if (i2 == 3) {
                    gvi gviVar2 = fgbVar.z;
                    if (gviVar2 != null) {
                        gviVar2.Y.N();
                    }
                    fgbVar.O0 = false;
                    fgbVar.R0().N1(false);
                    fgbVar.S0().N1(false);
                }
                return Unit.a;
            case 2:
                return Boolean.valueOf(Intrinsics.g(((g7q) obj).a(), (String) obj2));
            default:
                xkj0 xkj0Var = (xkj0) obj2;
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    WithDrawInfo withDrawInfo = (WithDrawInfo) ((BaseResponse) ((lk50.c) lk50Var).a).data;
                    if (withDrawInfo != null) {
                        if (withDrawInfo.hasInfo) {
                            BigDecimal bigDecimalB = p54.b(new BigDecimal(withDrawInfo.maxWithdrawAmount));
                            mmj0 mmj0VarO1 = xkj0Var.O1();
                            mmj0VarO1.getClass();
                            bigDecimalB.getClass();
                            f0l f0lVarC = mmj0VarO1.c();
                            f0lVarC.getClass();
                            f0lVarC.e = bigDecimalB;
                            qxd0<rrj0> qxd0VarN2 = xkj0Var.n2();
                            if (qxd0VarN2 != null) {
                                qxd0VarN2.a(new rrj0(new ResourceUiText(R.string.common_functions__withdrawable_balance_label, a.c(xkj0Var.b.f())), new StringUiText(bjb0.Y(bigDecimalB))));
                            }
                            xkj0Var.R = new rkj0(xkj0Var, withDrawInfo);
                        } else {
                            qxd0<rrj0> qxd0VarN3 = xkj0Var.n2();
                            if (qxd0VarN3 != null) {
                                qxd0VarN3.a(null);
                            }
                        }
                    }
                } else if (!(lk50Var instanceof lk50.a) && !(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
        }
    }
}
