package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Y extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdRequestStatus f55794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f55795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InMobiAdRequestStatus status, V adFetchError) {
        super(status.getMessage());
        kotlin.jvm.internal.m0.p(status, "status");
        kotlin.jvm.internal.m0.p(adFetchError, "adFetchError");
        this.f55794a = status;
        this.f55795b = adFetchError;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdFetchFailureException(statusCode=" + this.f55794a.getStatusCode() + ", statusMessage=" + this.f55794a.getMessage() + ", adFetchError=" + this.f55795b + gi.j.f86771d;
    }
}
