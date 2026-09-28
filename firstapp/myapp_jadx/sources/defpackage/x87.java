package defpackage;

import android.view.animation.AnimationUtils;
import com.sportybet.android.gp.tz.R;
import com.sportygames.chat.remote.models.RainClaimInfoResponse;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.commons.remote.model.StatusChat;
import com.sportygames.commons.viewmodels.FbgData;
import com.sportygames.crash.models.RainUiAction;
import com.sportygames.sportyherov2.remote.models.RainTopicResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x87 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x87(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RainClaimInfoResponse rainClaimInfoResponse;
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj2;
                FbgData fbgData = (FbgData) obj;
                int i3 = ChatActivity.B0;
                if (fbgData.getShowFbg()) {
                    ha7 ha7Var = (ha7) chatActivity.a;
                    if (ha7Var != null) {
                        GiftToast giftToast = ha7Var.J;
                        String currency = fbgData.getCurrency();
                        String str = currency == null ? "" : currency;
                        Double price = fbgData.getPrice();
                        GiftToast.setToastText$default(giftToast, str, price != null ? price.doubleValue() : 0.0d, null, 4, null);
                    }
                    ha7 ha7Var2 = (ha7) chatActivity.a;
                    if (ha7Var2 != null) {
                        ha7Var2.J.setVisibility(0);
                    }
                    ha7 ha7Var3 = (ha7) chatActivity.a;
                    if (ha7Var3 != null) {
                        ha7Var3.J.startAnimation(AnimationUtils.loadAnimation(chatActivity, R.anim.fade_in_fade_out_toast));
                    }
                }
                break;
            case 1:
                fgb fgbVar = (fgb) obj2;
                LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                int i4 = fgb.b.b[loadingStateChat.getStatus().ordinal()];
                if (i4 == 1 || i4 == 2) {
                    gvi gviVar = fgbVar.z;
                    boolean z = gviVar != null && gviVar.W.getVisibility() == 0;
                    lw30 lw30VarI1 = fgbVar.i1();
                    RainTopicResponse rainTopicResponse = fgbVar.x1;
                    vv30 vv30Var = lw30VarI1.a;
                    ssw<RainUiAction> sswVar = lw30VarI1.A;
                    StatusChat status = loadingStateChat.getStatus();
                    int i5 = status == null ? -1 : lw30.a.a[status.ordinal()];
                    if (i5 == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                        if (hTTPResponse != null && (rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData()) != null) {
                            boolean zG = Intrinsics.g(rainClaimInfoResponse.getClaimCountLimit(), rainClaimInfoResponse.getClaimCount());
                            vv30Var.getClass();
                            ArrayList arrayList = new ArrayList();
                            if (zG) {
                                arrayList.add(RainUiAction.HideToasts.INSTANCE);
                                tv30[] tv30VarArr = tv30.a;
                                arrayList.add(new RainUiAction.SetCloudIcon(true, "active"));
                            } else {
                                tv30[] tv30VarArr2 = tv30.a;
                                arrayList.add(new RainUiAction.SetCloudIcon(true, "active"));
                                if (rainTopicResponse != null) {
                                    arrayList.add(!z ? RainUiAction.DeferActiveToastUntilMultiplierVisible.INSTANCE : new RainUiAction.ShowActiveToast(rainTopicResponse));
                                }
                            }
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                sswVar.m((RainUiAction) obj3);
                            }
                        }
                    } else if (i5 == 2) {
                        vv30Var.getClass();
                        Iterator it = b.k(RainUiAction.HideToasts.INSTANCE, new RainUiAction.SetCloudIcon(false, "")).iterator();
                        while (it.hasNext()) {
                            sswVar.m((RainUiAction) it.next());
                        }
                    }
                }
                break;
            default:
                ((Function1) obj2).invoke(new pvp.f(((Boolean) obj).booleanValue()));
                break;
        }
        return Unit.a;
    }
}
