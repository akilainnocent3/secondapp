package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.a3l0;
import defpackage.esl0;
import defpackage.kjl0;
import defpackage.u7l0;
import defpackage.v7l0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a3l0 {
    public final v7l0 a;
    public final TaskCompletionSource b;
    public final /* synthetic */ u7l0 c;

    public c(u7l0 u7l0Var, TaskCompletionSource taskCompletionSource) {
        v7l0 v7l0Var = new v7l0("OnRequestInstallCallback");
        this.c = u7l0Var;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.a = v7l0Var;
        this.b = taskCompletionSource;
    }

    public final void O(Bundle bundle) {
        esl0 esl0Var = this.c.a;
        if (esl0Var != null) {
            TaskCompletionSource taskCompletionSource = this.b;
            synchronized (esl0Var.f) {
                esl0Var.e.remove(taskCompletionSource);
            }
            esl0Var.a().post(new kjl0(esl0Var));
        }
        this.a.a("onGetLaunchReviewFlowInfo", new Object[0]);
        this.b.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
