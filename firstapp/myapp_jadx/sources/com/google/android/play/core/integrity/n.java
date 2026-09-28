package com.google.android.play.core.integrity;

import android.app.Activity;
import defpackage.f78;
import defpackage.uf80;

/* JADX INFO: loaded from: classes4.dex */
final class n extends StandardIntegrityManager.StandardIntegrityDialogRequest {
    private final int a;
    private final Activity b;
    private final StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse c;

    public /* synthetic */ n(int i, Activity activity, StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse standardIntegrityResponse, m mVar) {
        this.a = i;
        this.b = activity;
        this.c = standardIntegrityResponse;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest
    public final Activity activity() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.StandardIntegrityDialogRequest) {
            StandardIntegrityManager.StandardIntegrityDialogRequest standardIntegrityDialogRequest = (StandardIntegrityManager.StandardIntegrityDialogRequest) obj;
            if (this.a == standardIntegrityDialogRequest.typeCode() && this.b.equals(standardIntegrityDialogRequest.activity()) && this.c.equals(standardIntegrityDialogRequest.standardIntegrityResponse())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest
    public final StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse standardIntegrityResponse() {
        return this.c;
    }

    public final String toString() {
        StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse standardIntegrityResponse = this.c;
        String string = this.b.toString();
        String string2 = standardIntegrityResponse.toString();
        StringBuilder sb = new StringBuilder("StandardIntegrityDialogRequest{typeCode=");
        f78.b(this.a, ", activity=", string, ", standardIntegrityResponse=", sb);
        return uf80.a(sb, string2, "}");
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest
    public final int typeCode() {
        return this.a;
    }
}
