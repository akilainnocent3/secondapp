package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.afk0;
import defpackage.nm0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bq extends bn {
    final /* synthetic */ bs c;
    private final afk0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(bs bsVar, TaskCompletionSource taskCompletionSource) {
        super(bsVar, taskCompletionSource);
        Objects.requireNonNull(bsVar);
        this.c = bsVar;
        this.d = new afk0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bn, defpackage.sek0
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.d.c("onWarmUpExpressIntegrityToken", new Object[0]);
        nm0 nm0VarA = this.c.f.a(bundle);
        TaskCompletionSource taskCompletionSource = this.a;
        if (nm0VarA != null) {
            taskCompletionSource.trySetException(nm0VarA);
        } else {
            taskCompletionSource.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
