package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xcw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xcw(Object obj, int i) {
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
                wd0 wd0Var = (wd0) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.k((((Number) wd0Var.d()).floatValue() * 0.3f) + 0.7f);
                a7lVar.v((((Number) wd0Var.d()).floatValue() * 0.3f) + 0.7f);
                break;
            default:
                jt40 jt40Var = (jt40) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                jt40Var.b = OtpData.RegisterBrazil.a((OtpData.RegisterBrazil) jt40Var.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
