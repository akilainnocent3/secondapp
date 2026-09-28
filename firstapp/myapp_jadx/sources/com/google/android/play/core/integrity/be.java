package com.google.android.play.core.integrity;

import android.text.TextUtils;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes4.dex */
final class be implements StandardIntegrityManager {
    private final bs a;
    private final by b;

    public be(bs bsVar, by byVar) {
        this.a = bsVar;
        this.b = byVar;
    }

    public static /* synthetic */ Task a(be beVar, StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l) {
        long jB = prepareIntegrityTokenRequest.b();
        long jLongValue = l.longValue();
        prepareIntegrityTokenRequest.a();
        return Tasks.forResult(new bx(beVar.b, jB, jLongValue, 0));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        prepareIntegrityTokenRequest.c();
        if (TextUtils.isEmpty(null)) {
            bs bsVar = this.a;
            long jB = prepareIntegrityTokenRequest.b();
            prepareIntegrityTokenRequest.a();
            return bsVar.f(jB, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.bd
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return be.a(this.a, prepareIntegrityTokenRequest, (Long) obj);
                }
            });
        }
        try {
            by byVar = this.b;
            long jB2 = prepareIntegrityTokenRequest.b();
            prepareIntegrityTokenRequest.c();
            long j = Long.parseLong(null);
            prepareIntegrityTokenRequest.a();
            return Tasks.forResult(new bx(byVar, jB2, j, 0));
        } catch (NumberFormatException e) {
            return Tasks.forException(e);
        }
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<Integer> showDialog(StandardIntegrityManager.StandardIntegrityDialogRequest standardIntegrityDialogRequest) {
        return this.a.e(standardIntegrityDialogRequest);
    }
}
