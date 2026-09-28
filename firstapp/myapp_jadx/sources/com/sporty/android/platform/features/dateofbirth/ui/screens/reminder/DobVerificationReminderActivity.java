package com.sporty.android.platform.features.dateofbirth.ui.screens.reminder;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.core.model.dateofbirth.DobVerificationReminderData;
import com.sportybet.android.gp.tz.R;
import defpackage.azm;
import defpackage.bb40;
import defpackage.iql;
import defpackage.k9j;
import defpackage.mxe;
import defpackage.op8;
import defpackage.pwx;
import defpackage.uxo;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/platform/features/dateofbirth/ui/screens/reminder/DobVerificationReminderActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lk9j;", "Lbb40;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DobVerificationReminderActivity extends iql implements zux, pwx, k9j, bb40 {
    public static final /* synthetic */ int c = 0;
    public azm b;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DobVerificationReminderData dobVerificationReminderData;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (dobVerificationReminderData = (DobVerificationReminderData) ((Parcelable) uxo.a(intent, "dob_verification_reminder_data", DobVerificationReminderData.class))) == null) {
            dobVerificationReminderData = new DobVerificationReminderData(getCMSString(R.string.dob_verification__birthday_verification, new Object[0]), getCMSString(R.string.dob_verification__birthday_verification_reminder_description, new Object[0]));
        }
        zn8.a(this, new op8(2075308526, new mxe(dobVerificationReminderData, this), true));
    }
}
