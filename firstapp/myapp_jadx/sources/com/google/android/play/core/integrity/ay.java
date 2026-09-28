package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.iek0;
import defpackage.odk0;

/* JADX INFO: loaded from: classes4.dex */
final class ay {
    private final iek0 a;
    private final iek0 b;

    public ay(iek0 iek0Var, iek0 iek0Var2) {
        this.a = iek0Var;
        this.b = iek0Var2;
    }

    public final ax a(Activity activity, TaskCompletionSource taskCompletionSource, odk0 odk0Var) {
        Context context = (Context) this.a.a();
        context.getClass();
        t tVar = (t) this.b.a();
        tVar.getClass();
        activity.getClass();
        odk0Var.getClass();
        return new ax(context, tVar, activity, taskCompletionSource, odk0Var);
    }
}
