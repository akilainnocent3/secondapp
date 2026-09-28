package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sportybet.android.user.kyc.KYCActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dif implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dif(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yhf yhfVar = (yhf) obj2;
                KYCReminder.Details details = (KYCReminder.Details) obj;
                e eVarRequireActivity = yhfVar.requireActivity();
                KYCActivity.Companion companion = KYCActivity.E;
                e eVarRequireActivity2 = yhfVar.requireActivity();
                eVarRequireActivity2.getClass();
                yrh0.s(eVarRequireActivity, companion.newInstanceForBankAccountVerification(eVarRequireActivity2, details != null ? details.getAssetId() : null), true);
                break;
            default:
                ((b) obj2).a();
                ((Function0) obj).invoke();
                break;
        }
        return Unit.a;
    }
}
