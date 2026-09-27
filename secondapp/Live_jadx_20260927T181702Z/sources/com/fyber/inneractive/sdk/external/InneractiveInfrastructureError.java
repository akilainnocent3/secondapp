package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.network.t;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class InneractiveInfrastructureError extends InneractiveError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveErrorCode f44585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f44586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f44587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Exception f44588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f44589e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar) {
        this(inneractiveErrorCode, iVar, null);
    }

    public void addReportedError(t tVar) {
        this.f44589e.add(tVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f44585a);
        if (this.f44587c != null) {
            sb2.append(" : ");
            sb2.append(this.f44587c);
        }
        return sb2.toString();
    }

    public Throwable getCause() {
        Exception exc = this.f44588d;
        return exc == null ? this.f44587c : exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f44585a;
    }

    public i getFyberMarketplaceAdLoadFailureReason() {
        return this.f44586b;
    }

    public boolean isErrorAlreadyReported(t tVar) {
        return this.f44589e.contains(tVar);
    }

    public void setCause(Exception exc) {
        this.f44588d = exc;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar, Throwable th2) {
        this.f44589e = new ArrayList();
        this.f44585a = inneractiveErrorCode;
        this.f44586b = iVar;
        this.f44587c = th2;
    }
}
