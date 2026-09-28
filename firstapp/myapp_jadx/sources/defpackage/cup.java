package defpackage;

import com.sporty.android.core.model.patron.KYCReminder;

/* JADX INFO: loaded from: classes5.dex */
public final class cup {
    public final uqm a;

    public cup(uqm uqmVar) {
        uqmVar.getClass();
        this.a = uqmVar;
    }

    public final String a(KYCReminder kYCReminder) {
        String userId = this.a.getUserId();
        String reminderId = kYCReminder.getReminderId();
        KYCReminder.Details details = kYCReminder.getDetails();
        return userId + "KYC_REMINDER_INTERACTION_" + reminderId + ":" + (details != null ? details.getSubmissionId() : null);
    }
}
