package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import defpackage.b1l0;
import defpackage.bmk0;
import defpackage.esl0;
import defpackage.tq50;
import defpackage.u7l0;
import defpackage.uq50;
import defpackage.v70;
import defpackage.v7l0;
import defpackage.xgl0;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements uq50 {
    public final u7l0 a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public b(u7l0 u7l0Var) {
        this.a = u7l0Var;
    }

    @Override // defpackage.uq50
    public final Task<ReviewInfo> a() {
        u7l0 u7l0Var = this.a;
        String str = u7l0Var.b;
        v7l0 v7l0Var = u7l0.c;
        v7l0Var.a("requestInAppReview (%s)", str);
        esl0 esl0Var = u7l0Var.a;
        if (esl0Var != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            esl0Var.a().post(new xgl0(esl0Var, taskCompletionSource, taskCompletionSource, new b1l0(u7l0Var, taskCompletionSource, taskCompletionSource)));
            return taskCompletionSource.getTask();
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", v7l0.c(v7l0Var.a, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = bmk0.a;
        return Tasks.forException(new tq50(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : v70.b((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) bmk0.b.get(-1), ")")), null, null)));
    }

    @Override // defpackage.uq50
    public final Task<Void> b(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.e()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this.b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }
}
