package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
final class ai implements IntegrityManager {
    private final ar a;

    public ai(ar arVar) {
        this.a = arVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.a.c(integrityTokenRequest);
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<Integer> showDialog(IntegrityDialogRequest integrityDialogRequest) {
        return this.a.d(integrityDialogRequest);
    }
}
