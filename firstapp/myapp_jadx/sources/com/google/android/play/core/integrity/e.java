package com.google.android.play.core.integrity;

import android.app.Activity;
import defpackage.f78;
import defpackage.uf80;

/* JADX INFO: loaded from: classes4.dex */
final class e extends IntegrityDialogRequest {
    private final int a;
    private final Activity b;
    private final IntegrityDialogRequest.IntegrityResponse c;

    public /* synthetic */ e(int i, Activity activity, IntegrityDialogRequest.IntegrityResponse integrityResponse, d dVar) {
        this.a = i;
        this.b = activity;
        this.c = integrityResponse;
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest
    public final Activity activity() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityDialogRequest) {
            IntegrityDialogRequest integrityDialogRequest = (IntegrityDialogRequest) obj;
            if (this.a == integrityDialogRequest.typeCode() && this.b.equals(integrityDialogRequest.activity()) && this.c.equals(integrityDialogRequest.integrityResponse())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest
    public final IntegrityDialogRequest.IntegrityResponse integrityResponse() {
        return this.c;
    }

    public final String toString() {
        IntegrityDialogRequest.IntegrityResponse integrityResponse = this.c;
        String string = this.b.toString();
        String string2 = integrityResponse.toString();
        StringBuilder sb = new StringBuilder("IntegrityDialogRequest{typeCode=");
        f78.b(this.a, ", activity=", string, ", integrityResponse=", sb);
        return uf80.a(sb, string2, "}");
    }

    @Override // com.google.android.play.core.integrity.IntegrityDialogRequest
    public final int typeCode() {
        return this.a;
    }
}
