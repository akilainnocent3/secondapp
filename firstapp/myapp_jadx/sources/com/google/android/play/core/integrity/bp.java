package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.afk0;
import defpackage.nm0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bp extends bn {
    final /* synthetic */ bs c;
    private final afk0 d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(bs bsVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bsVar, taskCompletionSource);
        Objects.requireNonNull(bsVar);
        this.c = bsVar;
        this.d = new afk0("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    @Override // com.google.android.play.core.integrity.bn, defpackage.sek0
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.d.c("onRequestExpressIntegrityToken", new Object[0]);
        bs bsVar = this.c;
        nm0 nm0VarA = bsVar.f.a(bundle);
        if (nm0VarA != null) {
            this.a.trySetException(nm0VarA);
            return;
        }
        long j = bundle.getLong("request.token.sid");
        bo boVar = new bo(this, bsVar.c, j);
        TaskCompletionSource taskCompletionSource = this.a;
        b bVar = new b();
        bVar.c(bundle.getString("token"));
        bVar.a(boVar);
        bVar.b(j);
        taskCompletionSource.trySetResult(bVar.d());
    }
}
