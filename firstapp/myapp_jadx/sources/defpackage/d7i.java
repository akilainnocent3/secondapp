package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.kyc.domain.phonemigrate.PhoneMigrateEvent;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d7i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d7i(Object obj, int i) {
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
                final Function0 function0 = (Function0) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szr.h(szrVar, "follow_code_empty_guidance", new op8(1268229952, new gaj() { // from class: i7i
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        a aVar = (a) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        ((gwr) obj3).getClass();
                        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            r7i.e(0, aVar, function0, true);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true), 2);
                return Unit.a;
            case 1:
                ytw ytwVar = (ytw) obj2;
                ((mmd) obj).getClass();
                int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (((gly) ytwVar.getValue()).a >> 32));
                return new iwo((((long) ((int) Float.intBitsToFloat((int) (((gly) ytwVar.getValue()).a & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32));
            case 2:
                return m410.e1((m410) obj2, (String) obj);
            default:
                RegistrationKYCWebViewActivity registrationKYCWebViewActivity = (RegistrationKYCWebViewActivity) obj2;
                PhoneMigrateEvent phoneMigrateEvent = (PhoneMigrateEvent) obj;
                RegistrationKYCWebViewActivity.b bVar = RegistrationKYCWebViewActivity.y;
                phoneMigrateEvent.getClass();
                if (phoneMigrateEvent instanceof PhoneMigrateEvent.DepositTransferSuccess) {
                    ((WebViewActivity) registrationKYCWebViewActivity).accountHelper.logout();
                }
                return Unit.a;
        }
    }
}
