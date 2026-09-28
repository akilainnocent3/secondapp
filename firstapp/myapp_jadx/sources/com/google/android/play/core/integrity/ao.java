package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.bfk0;
import defpackage.odk0;
import defpackage.vek0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ao extends bfk0 {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ ar e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(ar arVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        Objects.requireNonNull(arVar);
        this.e = arVar;
    }

    @Override // defpackage.bfk0
    public final void b() {
        try {
            ar arVar = this.e;
            odk0 odk0Var = arVar.a;
            ((vek0) odk0Var.n).c(this.a, arVar.e.a(this.b, this.c, odk0Var));
        } catch (RemoteException e) {
            this.e.b.b(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new IntegrityServiceException(-100, false, e));
        }
    }
}
