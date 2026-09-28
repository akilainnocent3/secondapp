package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bx implements StandardIntegrityManager.StandardIntegrityTokenProvider {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ by c;

    public bx(by byVar, long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        Objects.requireNonNull(byVar);
        this.c = byVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
    public final Task<StandardIntegrityManager.StandardIntegrityToken> request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.c.a.d(standardIntegrityTokenRequest, this.a, this.b, 0);
    }
}
