package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.sportyherov2.remote.models.RainStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class dj8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dj8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                long jT = urrVar.T(0L);
                ((ytw) obj2).setValue(new iwo((((long) ((int) Float.intBitsToFloat((int) (jT >> 32)))) << 32) | (4294967295L & ((long) ((int) Float.intBitsToFloat((int) (jT & 4294967295L)))))));
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                String str = (String) obj;
                if (Intrinsics.g(str, AnalyticsEvent.BI_TRACKING_KIND_ERROR)) {
                    break;
                } else {
                    try {
                        RainStatusResponse rainStatusResponse = (RainStatusResponse) new eal().e(str, RainStatusResponse.class);
                        if (rainStatusResponse != null) {
                            q1c0Var.o2 = 4;
                            Integer id = rainStatusResponse.getId();
                            q1c0Var.p2 = id != null ? id.intValue() : 0;
                            Double freeBetValue = rainStatusResponse.getFreeBetValue();
                            q1c0Var.q2 = freeBetValue != null ? freeBetValue.doubleValue() : 0.0d;
                            String endTime = rainStatusResponse.getEndTime();
                            if (endTime == null) {
                                endTime = "";
                            }
                            q1c0Var.j3(k94.f(endTime));
                        }
                        break;
                    } catch (Exception unused) {
                    }
                }
                break;
        }
        return Unit.a;
    }
}
