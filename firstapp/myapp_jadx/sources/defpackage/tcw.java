package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tcw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tcw(Object obj, int i) {
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
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((Function1) obj2).invoke(eb9.b(urrVar));
                break;
            default:
                dt40 dt40Var = (dt40) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                dt40Var.b = OtpData.RegisterBrazil.a((OtpData.RegisterBrazil) dt40Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
