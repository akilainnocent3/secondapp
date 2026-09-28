package com.google.android.play.core.integrity;

import defpackage.bmy;
import defpackage.ib5;

/* JADX INFO: loaded from: classes4.dex */
final class f extends IntegrityTokenRequest.Builder {
    private String a;
    private Long b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.a;
        g gVar = null;
        if (str != null) {
            return new h(str, this.b, gVar);
        }
        ib5.a("Missing required properties: nonce");
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        bmy.a("Null nonce");
        return null;
    }
}
