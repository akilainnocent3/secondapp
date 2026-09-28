package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.sporty.android.core.model.dateofbirth.DobVerificationReminderData;
import com.sporty.android.platform.features.dateofbirth.ui.screens.reminder.DobVerificationReminderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gr00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gr00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                DobVerificationReminderData dobVerificationReminderData = (DobVerificationReminderData) obj;
                dobVerificationReminderData.getClass();
                int i2 = DobVerificationReminderActivity.c;
                Intent intent = new Intent(activity, (Class<?>) DobVerificationReminderActivity.class);
                intent.putExtra("dob_verification_reminder_data", dobVerificationReminderData);
                yrh0.s(activity, intent, true);
                return Unit.a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                mke mkeVar = ((nn40) obj2).r0;
                if (mkeVar == null) {
                    return null;
                }
                mkeVar.S0(iIntValue);
                return Unit.a;
        }
    }
}
