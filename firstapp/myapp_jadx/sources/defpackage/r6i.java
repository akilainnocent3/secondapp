package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r6i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6i(Object obj, int i) {
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
                z7a0.b bVar = (z7a0.b) obj;
                bVar.getClass();
                ((Function1) obj2).invoke(new b6i.c(bVar.a, bVar.b, bVar.d, bVar.e, bVar.f, bVar.g));
                break;
            default:
                iw40 iw40Var = (iw40) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                iw40Var.b = OtpData.Register.a((OtpData.Register) iw40Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
