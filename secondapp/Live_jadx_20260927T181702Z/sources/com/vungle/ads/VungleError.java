package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class VungleError extends Exception {
    private final int code;

    @l
    private final String errorMessage;

    @m
    private LogEntry logEntry;

    @l
    private final Sdk.SDKError.Reason loggableReason;

    public /* synthetic */ VungleError(Sdk.SDKError.Reason reason, String str, x xVar) {
        this(reason, str);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        VungleError vungleError = (VungleError) obj;
        return this.loggableReason == vungleError.loggableReason && m0.g(this.errorMessage, vungleError.errorMessage) && m0.g(this.logEntry, vungleError.logEntry);
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // java.lang.Throwable
    @m
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iHashCode = ((this.loggableReason.hashCode() * 31) + this.errorMessage.hashCode()) * 31;
        LogEntry logEntry = this.logEntry;
        return iHashCode + (logEntry != null ? logEntry.hashCode() : 0);
    }

    @l
    public final VungleError logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        AnalyticsClient.INSTANCE.logError$vungle_ads_release(this.loggableReason, this.errorMessage, this.logEntry);
    }

    @l
    public final VungleError setLogEntry$vungle_ads_release(@m LogEntry logEntry) {
        this.logEntry = logEntry;
        return this;
    }

    private VungleError(Sdk.SDKError.Reason reason, String str) {
        super(str);
        this.loggableReason = reason;
        this.errorMessage = str;
        this.code = reason.getNumber();
    }
}
