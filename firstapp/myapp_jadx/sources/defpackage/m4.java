package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.sportynews.data.ArticleDetailItem;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        T t;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Collection) obj2).contains(obj));
            case 1:
                hc4 hc4Var = (hc4) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                hc4Var.b = OtpData.BioAuth.a((OtpData.BioAuth) hc4Var.B1(), oTPResult);
                return Unit.a;
            case 2:
                vx00 vx00Var = (vx00) obj2;
                ((use) obj).getClass();
                wwd0 wwd0Var = vx00Var.J;
                yav yavVar = new yav(0);
                wwd0Var.getClass();
                wwd0Var.k(null, yavVar);
                vx00Var.K = ej5.c(o8i0.d(vx00Var), null, null, new qy00(vx00Var, null), 3);
                return new sw00.g(vx00Var);
            default:
                csc0 csc0Var = (csc0) obj2;
                wwd0 wwd0Var2 = csc0Var.b;
                wwd0 wwd0Var3 = csc0Var.d;
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
                    do {
                        value4 = wwd0Var3.getValue();
                        ((Boolean) value4).getClass();
                    } while (!wwd0Var3.g(value4, Boolean.FALSE));
                    if (baseResponse.bizCode != 10000) {
                        do {
                            value5 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value5, dy0.c.a));
                    } else if (baseResponse.data != 0) {
                        do {
                            value7 = wwd0Var2.getValue();
                            t = baseResponse.data;
                            t.getClass();
                        } while (!wwd0Var2.g(value7, new dy0.a((ArticleDetailItem) t)));
                    } else {
                        do {
                            value6 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value6, dy0.b.a));
                    }
                } else if (lk50Var instanceof lk50.a) {
                    do {
                        value2 = wwd0Var3.getValue();
                        ((Boolean) value2).getClass();
                    } while (!wwd0Var3.g(value2, Boolean.FALSE));
                    do {
                        value3 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value3, dy0.c.a));
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    do {
                        value = wwd0Var3.getValue();
                        ((Boolean) value).getClass();
                    } while (!wwd0Var3.g(value, Boolean.TRUE));
                }
                return Unit.a;
        }
    }
}
