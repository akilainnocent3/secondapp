package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.afk0;
import defpackage.nm0;
import defpackage.odk0;
import defpackage.wek0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class aq extends wek0 {
    final /* synthetic */ ar a;
    private final afk0 b;
    private final TaskCompletionSource c;

    public aq(ar arVar, TaskCompletionSource taskCompletionSource) {
        Objects.requireNonNull(arVar);
        this.a = arVar;
        this.b = new afk0("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }

    @Override // defpackage.xek0
    public final void b(Bundle bundle) {
        ar arVar = this.a;
        odk0 odk0Var = arVar.a;
        TaskCompletionSource taskCompletionSource = this.c;
        odk0Var.d(taskCompletionSource);
        this.b.c("onRequestIntegrityToken", new Object[0]);
        nm0 nm0VarA = arVar.f.a(bundle);
        if (nm0VarA != null) {
            taskCompletionSource.trySetException(nm0VarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            taskCompletionSource.trySetException(new IntegrityServiceException(-100, false, null));
            return;
        }
        long j = bundle.getLong("request.token.sid");
        ap apVar = new ap(this, arVar.c, j);
        a aVar = new a();
        aVar.c(string);
        aVar.a(apVar);
        aVar.b(j);
        taskCompletionSource.trySetResult(aVar.d());
    }
}
