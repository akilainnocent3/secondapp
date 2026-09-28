package com.google.android.play.core.review;

import android.app.PendingIntent;
import defpackage.bmy;
import defpackage.he;
import defpackage.mq0;

/* JADX INFO: loaded from: classes4.dex */
final class zza extends ReviewInfo {
    public final PendingIntent a;
    public final boolean b;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            bmy.a("Null pendingIntent");
            throw null;
        }
        this.a = pendingIntent;
        this.b = z;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewInfo)) {
            return false;
        }
        ReviewInfo reviewInfo = (ReviewInfo) obj;
        return this.a.equals(reviewInfo.a()) && this.b == reviewInfo.e();
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return mq0.a(he.a("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp="), this.b, "}");
    }
}
