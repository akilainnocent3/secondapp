package com.unity3d.ads.core.data.model.exception;

import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GatewayException extends UnityAdsNetworkException {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String GATEWAY_RESPONSE_DEPTH_INITIALIZATION = "initialization";

    @l
    public static final String GATEWAY_RESPONSE_DEPTH_UNIVERSAL = "universal";

    @m
    private final ErrorOuterClass.PublicErrorCode errorCode;

    @l
    private final String message;

    @l
    private final String reason;

    @m
    private final String reasonDebug;

    @m
    private final Throwable throwable;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ GatewayException(String str, Throwable th2, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? "gateway" : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : publicErrorCode);
    }

    public static /* synthetic */ GatewayException copy$default(GatewayException gatewayException, String str, Throwable th2, String str2, String str3, ErrorOuterClass.PublicErrorCode publicErrorCode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gatewayException.getMessage();
        }
        if ((i10 & 2) != 0) {
            th2 = gatewayException.throwable;
        }
        if ((i10 & 4) != 0) {
            str2 = gatewayException.reason;
        }
        if ((i10 & 8) != 0) {
            str3 = gatewayException.reasonDebug;
        }
        if ((i10 & 16) != 0) {
            publicErrorCode = gatewayException.errorCode;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode2 = publicErrorCode;
        String str4 = str2;
        return gatewayException.copy(str, th2, str4, str3, publicErrorCode2);
    }

    @l
    public final String component1() {
        return getMessage();
    }

    @m
    public final Throwable component2() {
        return this.throwable;
    }

    @l
    public final String component3() {
        return this.reason;
    }

    @m
    public final String component4() {
        return this.reasonDebug;
    }

    @m
    public final ErrorOuterClass.PublicErrorCode component5() {
        return this.errorCode;
    }

    @l
    public final GatewayException copy(@l String message, @m Throwable th2, @l String reason, @m String str, @m ErrorOuterClass.PublicErrorCode publicErrorCode) {
        m0.p(message, "message");
        m0.p(reason, "reason");
        return new GatewayException(message, th2, reason, str, publicErrorCode);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GatewayException)) {
            return false;
        }
        GatewayException gatewayException = (GatewayException) obj;
        return m0.g(getMessage(), gatewayException.getMessage()) && m0.g(this.throwable, gatewayException.throwable) && m0.g(this.reason, gatewayException.reason) && m0.g(this.reasonDebug, gatewayException.reasonDebug) && this.errorCode == gatewayException.errorCode;
    }

    @m
    public final ErrorOuterClass.PublicErrorCode getErrorCode() {
        return this.errorCode;
    }

    @Override // com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException, java.lang.Throwable
    @l
    public String getMessage() {
        return this.message;
    }

    @l
    public final String getReason() {
        return this.reason;
    }

    @m
    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    @m
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Throwable th2 = this.throwable;
        int iHashCode2 = (((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31) + this.reason.hashCode()) * 31;
        String str = this.reasonDebug;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ErrorOuterClass.PublicErrorCode publicErrorCode = this.errorCode;
        return iHashCode3 + (publicErrorCode != null ? publicErrorCode.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @l
    public String toString() {
        return "GatewayException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ", errorCode=" + this.errorCode + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GatewayException(@l String message, @m Throwable th2, @l String reason, @m String str, @m ErrorOuterClass.PublicErrorCode publicErrorCode) {
        super(message, null, null, null, null, null, null, 126, null);
        m0.p(message, "message");
        m0.p(reason, "reason");
        this.message = message;
        this.throwable = th2;
        this.reason = reason;
        this.reasonDebug = str;
        this.errorCode = publicErrorCode;
    }
}
