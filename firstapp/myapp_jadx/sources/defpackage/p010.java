package defpackage;

import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p010 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p010(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m410 m410Var = (m410) obj2;
                if (((Boolean) obj).booleanValue()) {
                    m410Var.q0();
                }
                return Unit.a;
            default:
                return RegistrationKYCWebViewActivity.I1((RegistrationKYCWebViewActivity) obj2, (RegistrationKYC$Result) obj);
        }
    }
}
