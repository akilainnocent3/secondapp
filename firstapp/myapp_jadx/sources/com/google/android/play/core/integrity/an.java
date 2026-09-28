package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.bfk0;
import defpackage.pdk0;
import defpackage.vek0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class an extends bfk0 {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Long b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ IntegrityTokenRequest d;
    final /* synthetic */ ar e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ar arVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.a = bArr;
        this.b = l;
        this.c = taskCompletionSource2;
        this.d = integrityTokenRequest;
        Objects.requireNonNull(arVar);
        this.e = arVar;
    }

    @Override // defpackage.bfk0
    public final void a(Exception exc) {
        if (exc instanceof pdk0) {
            super.a(new IntegrityServiceException(-9, false, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.bfk0
    public final void b() {
        try {
            ar arVar = this.e;
            ((vek0) arVar.a.n).i(ar.a(arVar, this.a, this.b), new aq(arVar, this.c));
        } catch (RemoteException e) {
            this.e.b.b(e, "requestIntegrityToken(%s)", this.d);
            this.c.trySetException(new IntegrityServiceException(-100, false, e));
        }
    }
}
