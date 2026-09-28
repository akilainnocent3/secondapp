package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.bfk0;
import defpackage.qdk0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bj extends bfk0 {
    final /* synthetic */ Context a;
    final /* synthetic */ bs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bs bsVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.a = context;
        Objects.requireNonNull(bsVar);
        this.b = bsVar;
    }

    @Override // defpackage.bfk0
    public final void b() {
        this.b.d.trySetResult(Integer.valueOf(qdk0.a(this.a)));
    }
}
