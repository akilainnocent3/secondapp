package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.fruithunt.network.models.FruitItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xee implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xee(Object obj, int i) {
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
                yee yeeVar = (yee) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                yeeVar.b = OtpData.DeviceLogout.a((OtpData.DeviceLogout) yeeVar.B1(), oTPResult);
                break;
            case 1:
                final u6j u6jVar = (u6j) obj2;
                final FruitItem fruitItem = (FruitItem) u6jVar.p0.e((String) obj, FruitItem.class);
                u6jVar.n0(new Function0() { // from class: e7j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        FruitItem fruitItem2 = fruitItem;
                        fruitItem2.getClass();
                        List<FruitItem.FruitRecord> topicRecordVO = fruitItem2.getTopicRecordVO();
                        u6j u6jVar2 = u6jVar;
                        if (topicRecordVO != null && !topicRecordVO.isEmpty()) {
                            int i2 = 0;
                            if (!((Boolean) u6jVar2.t0().z.getValue()).booleanValue()) {
                                u6jVar2.i0 = true;
                                u6jVar2.A0 = true;
                                u6jVar2.X0(true);
                                u6jVar2.o0(new q5j(u6jVar2, i2));
                                r750.d(u6jVar2.t0(), new w6e(u6jVar2, 1));
                                o8j o8jVarT0 = u6jVar2.t0();
                                ej5.c(o8i0.d(o8jVarT0), null, null, new s8j(o8jVarT0, true, null), 3);
                            }
                            r750.a(u6jVar2.t0(), new z5j(i2, u6jVar2, fruitItem2.getTopicRecordVO().get(0)));
                        } else if (Intrinsics.g(fruitItem2.isBlocked(), Boolean.TRUE)) {
                            u6jVar2.j0();
                            u6jVar2.S0(u6jVar2.getActivity(), new ResultWrapper.GenericError(8002, null));
                        }
                        return Unit.a;
                    }
                });
                break;
            case 2:
                lu10 lu10Var = (lu10) obj2;
                ((View) obj).getClass();
                s820 s820Var = (s820) lu10Var.b;
                if (s820Var != null) {
                    s820Var.d.setClickable(false);
                }
                s820 s820Var2 = (s820) lu10Var.b;
                if (s820Var2 != null) {
                    s820Var2.d.setAlpha(0.5f);
                }
                fb7.b.j(Boolean.TRUE);
                break;
            default:
                foa0 foa0Var = (foa0) obj2;
                foa0Var.C1();
                foa0Var.c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                break;
        }
        return Unit.a;
    }
}
