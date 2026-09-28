package com.google.android.play.core.integrity;

import android.app.Activity;
import defpackage.bmy;
import defpackage.ib5;

/* JADX INFO: loaded from: classes4.dex */
final class c extends IntegrityDialogRequest.Builder {
    private int a;
    private Activity b;
    private IntegrityDialogRequest.IntegrityResponse c;
    private byte d;

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.Builder
    public final IntegrityDialogRequest build() {
        Activity activity;
        IntegrityDialogRequest.IntegrityResponse integrityResponse;
        d dVar = null;
        if (this.d == 1 && (activity = this.b) != null && (integrityResponse = this.c) != null) {
            return new e(this.a, activity, integrityResponse, dVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" typeCode");
        }
        if (this.b == null) {
            sb.append(" activity");
        }
        if (this.c == null) {
            sb.append(" integrityResponse");
        }
        ib5.a("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.Builder
    public final IntegrityDialogRequest.Builder setActivity(Activity activity) {
        if (activity != null) {
            this.b = activity;
            return this;
        }
        bmy.a("Null activity");
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.Builder
    public final IntegrityDialogRequest.Builder setIntegrityResponse(IntegrityDialogRequest.IntegrityResponse integrityResponse) {
        if (integrityResponse != null) {
            this.c = integrityResponse;
            return this;
        }
        bmy.a("Null integrityResponse");
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest.Builder
    public final IntegrityDialogRequest.Builder setTypeCode(int i) {
        this.a = i;
        this.d = (byte) 1;
        return this;
    }
}
