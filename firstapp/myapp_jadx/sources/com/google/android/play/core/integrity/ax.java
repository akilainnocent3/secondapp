package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import defpackage.afk0;
import defpackage.nm0;
import defpackage.odk0;
import defpackage.yek0;

/* JADX INFO: loaded from: classes4.dex */
final class ax extends yek0 {
    final TaskCompletionSource a;
    final odk0 b;
    private final afk0 c = new afk0("RequestDialogCallbackImpl");
    private final String d;
    private final t e;
    private final Activity f;

    public ax(Context context, t tVar, Activity activity, TaskCompletionSource taskCompletionSource, odk0 odk0Var) {
        this.d = context.getPackageName();
        this.e = tVar;
        this.a = taskCompletionSource;
        this.f = activity;
        this.b = odk0Var;
    }

    @Override // defpackage.zek0
    public final void b(Bundle bundle) {
        odk0 odk0Var = this.b;
        TaskCompletionSource taskCompletionSource = this.a;
        odk0Var.d(taskCompletionSource);
        String str = this.d;
        afk0 afk0Var = this.c;
        afk0Var.c("onRequestDialog(%s)", str);
        nm0 nm0VarA = this.e.a(bundle);
        if (nm0VarA != null) {
            taskCompletionSource.trySetException(nm0VarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            Object[] objArr = {str};
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", afk0.e(afk0Var.a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            taskCompletionSource.trySetResult(0);
            return;
        }
        Activity activity = this.f;
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new aw(this, odk0Var.a()));
        afk0Var.a("Starting dialog intent...", new Object[0]);
        activity.startActivityForResult(intent, 0);
    }
}
