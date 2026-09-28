package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l94 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l94(Object obj, int i) {
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
                m94 m94Var = (m94) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                m94Var.b = OtpData.BioAuth.a((OtpData.BioAuth) m94Var.B1(), oTPResult);
                break;
            default:
                jxo jxoVar = (jxo) obj;
                long j = jxoVar.a;
                ((ytw) obj2).setValue(jxoVar);
                break;
        }
        return Unit.a;
    }
}
