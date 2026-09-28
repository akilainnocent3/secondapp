package defpackage;

import com.sporty.android.platform.features.dateofbirth.ui.screens.reminder.DobVerificationReminderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bja implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bja(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            default:
                DobVerificationReminderActivity dobVerificationReminderActivity = (DobVerificationReminderActivity) obj;
                azm azmVar = dobVerificationReminderActivity.b;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.DOB_VERIFICATION);
                dobVerificationReminderActivity.finish();
                return Unit.a;
        }
    }
}
