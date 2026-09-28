package defpackage;

import android.content.Context;
import android.view.WindowManager;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ubm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ubm(Object obj, int i) {
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
                dfm dfmVar = (dfm) obj2;
                List<String> list = dfm.v2;
                try {
                    kks kksVar = kks.b;
                    Context contextRequireContext = dfmVar.requireContext();
                    kksVar.getClass();
                    contextRequireContext.getClass();
                    boolean z = contextRequireContext.getSharedPreferences("live_event", 0).getBoolean(kksVar.b("live_event_alert_dialog_showed"), false);
                    if (!z) {
                        vn20.f(contextRequireContext, "live_event", kksVar.b("live_event_alert_dialog_showed"), true, true);
                    }
                    if (!kksVar.a(contextRequireContext) || z) {
                        return null;
                    }
                    dfmVar.P0();
                    return null;
                } catch (WindowManager.BadTokenException unused) {
                    vn20.g("live_event", kks.b.b("live_event_alert_dialog_showed"), false, true);
                    return null;
                }
            case 1:
                v240 v240Var = (v240) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                v240Var.b = OtpData.Reactivate.a((OtpData.Reactivate) v240Var.B1(), oTPResult);
                return Unit.a;
            case 2:
                twd0 twd0Var = (twd0) obj2;
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                float[] fArrA = t58.a();
                t58.b(((Number) twd0Var.getValue()).floatValue(), ((Number) twd0Var.getValue()).floatValue(), ((Number) twd0Var.getValue()).floatValue(), fArrA);
                b90 b90VarA = c90.a();
                b90VarA.k(new u58(fArrA));
                lc6 lc6VarA = lzaVar.F1().a();
                try {
                    lc6VarA.s(pk40.b(0L, lzaVar.F1().d()), b90VarA);
                    lzaVar.b2();
                    return Unit.a;
                } finally {
                    lc6VarA.f();
                }
            default:
                List list2 = (List) obj2;
                mr5 mr5Var = (mr5) obj;
                mr5Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L)) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat)));
                long jD = mr5Var.a.d();
                return mr5Var.e(new bl80(new vu30(list2, null, jFloatToRawIntBits, Math.max(Float.intBitsToFloat((int) ((jD >> 32) & 2147483647L)), Float.intBitsToFloat((int) (jD & 2147483647L)))), 2));
        }
    }
}
