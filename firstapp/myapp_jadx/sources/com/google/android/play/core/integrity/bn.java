package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.rek0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class bn extends rek0 {
    final TaskCompletionSource a;
    final /* synthetic */ bs b;

    public bn(bs bsVar, TaskCompletionSource taskCompletionSource) {
        Objects.requireNonNull(bsVar);
        this.b = bsVar;
        this.a = taskCompletionSource;
    }

    @Override // defpackage.sek0
    public final void b(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.sek0
    public void c(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.sek0
    public final void d(Bundle bundle) {
        this.b.a.d(this.a);
    }

    @Override // defpackage.sek0
    public void e(Bundle bundle) {
        this.b.a.d(this.a);
    }
}
