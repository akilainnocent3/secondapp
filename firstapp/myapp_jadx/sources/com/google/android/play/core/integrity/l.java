package com.google.android.play.core.integrity;

import android.app.Activity;
import defpackage.bmy;
import defpackage.ib5;

/* JADX INFO: loaded from: classes4.dex */
final class l extends StandardIntegrityManager.StandardIntegrityDialogRequest.Builder {
    private int a;
    private Activity b;
    private StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse c;
    private byte d;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityDialogRequest build() {
        Activity activity;
        StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse standardIntegrityResponse;
        m mVar = null;
        if (this.d == 1 && (activity = this.b) != null && (standardIntegrityResponse = this.c) != null) {
            return new n(this.a, activity, standardIntegrityResponse, mVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" typeCode");
        }
        if (this.b == null) {
            sb.append(" activity");
        }
        if (this.c == null) {
            sb.append(" standardIntegrityResponse");
        }
        ib5.a("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityDialogRequest.Builder setActivity(Activity activity) {
        if (activity != null) {
            this.b = activity;
            return this;
        }
        bmy.a("Null activity");
        return null;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityDialogRequest.Builder setStandardIntegrityResponse(StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse standardIntegrityResponse) {
        if (standardIntegrityResponse != null) {
            this.c = standardIntegrityResponse;
            return this;
        }
        bmy.a("Null standardIntegrityResponse");
        return null;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityDialogRequest.Builder setTypeCode(int i) {
        this.a = i;
        this.d = (byte) 1;
        return this;
    }
}
