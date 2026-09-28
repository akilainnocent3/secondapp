package defpackage;

import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.feature.inappreview.c;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxSuccessActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a7i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((u7i) obj).x1(false);
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(c.a.a);
                return Unit.a;
            case 2:
                return RegistrationKYCWebViewActivity.G1((RegistrationKYCWebViewActivity) obj);
            default:
                int i2 = TxSuccessActivity.A;
                ((TxSuccessActivity) obj).z1().d(wae.HOME);
                return Unit.a;
        }
    }
}
