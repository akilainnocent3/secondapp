package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dt20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dt20(Object obj, int i) {
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
                et20 et20Var = (et20) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                et20Var.b = OtpData.PrimaryPhone.a((OtpData.PrimaryPhone) et20Var.B1(), oTPResult);
                break;
            default:
                osw oswVar = (osw) obj2;
                urr urrVar = (urr) obj;
                urrVar.getClass();
                int iA = (int) (urrVar.a() >> 32);
                if (oswVar.D() == 0 || oswVar.D() < iA) {
                    oswVar.k(iA);
                }
                break;
        }
        return Unit.a;
    }
}
