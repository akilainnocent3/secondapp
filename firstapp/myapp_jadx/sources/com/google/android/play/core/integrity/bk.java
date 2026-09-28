package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.qek0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class bk extends br {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bs bsVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bsVar, taskCompletionSource);
        this.a = j;
        this.b = taskCompletionSource2;
        Objects.requireNonNull(bsVar);
        this.c = bsVar;
    }

    @Override // defpackage.bfk0
    public final void b() {
        bs bsVar = this.c;
        if (bs.m(bsVar)) {
            a(new StandardIntegrityException(-2, false, null));
            return;
        }
        if (bs.l(bsVar, 0)) {
            a(new StandardIntegrityException(-14, false, null));
            return;
        }
        try {
            ((qek0) bsVar.a.n).m(bs.b(bsVar, this.a, 0), new bq(bsVar, this.b));
        } catch (RemoteException e) {
            this.c.b.b(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.a));
            this.b.trySetException(new StandardIntegrityException(-100, false, e));
        }
    }
}
