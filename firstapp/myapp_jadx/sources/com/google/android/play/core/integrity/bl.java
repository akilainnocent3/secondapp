package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.qek0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bl extends br {
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ bs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bs bsVar, TaskCompletionSource taskCompletionSource, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bsVar, taskCompletionSource);
        this.a = standardIntegrityTokenRequest;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
        Objects.requireNonNull(bsVar);
        this.e = bsVar;
    }

    @Override // defpackage.bfk0
    public final void b() {
        bs bsVar = this.e;
        if (bs.m(bsVar)) {
            a(new StandardIntegrityException(-2, false, null));
            return;
        }
        if (bs.l(bsVar, 0)) {
            a(new StandardIntegrityException(-14, false, null));
            return;
        }
        try {
            qek0 qek0Var = (qek0) bsVar.a.n;
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = this.a;
            long j = this.b;
            qek0Var.w(bs.a(bsVar, standardIntegrityTokenRequest, j, this.c, 0), new bp(bsVar, this.d, j));
        } catch (RemoteException e) {
            bs bsVar2 = this.e;
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest2 = this.a;
            bsVar2.b.b(e, "requestExpressIntegrityToken(%s, %s, %s)", standardIntegrityTokenRequest2.requestHash(), standardIntegrityTokenRequest2.verdictOptOut(), Long.valueOf(this.b));
            this.d.trySetException(new StandardIntegrityException(-100, false, e));
        }
    }
}
