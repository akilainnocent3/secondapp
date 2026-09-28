package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.instantwin.presentation.legendsrace.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i64 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i64(Object obj, int i) {
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
                j64 j64Var = (j64) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                j64Var.b = OtpData.BioAuth.a((OtpData.BioAuth) j64Var.B1(), oTPResult);
                return Unit.a;
            case 1:
                lb80.e((pb80) obj, (String) obj2);
                return Unit.a;
            default:
                c cVar = (c) obj2;
                ((use) obj).getClass();
                cVar.y1(xlc0.a);
                return new mlc0(cVar);
        }
    }
}
