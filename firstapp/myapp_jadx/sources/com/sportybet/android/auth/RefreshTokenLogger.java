package com.sportybet.android.auth;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hce0;
import defpackage.itf0;
import defpackage.k00;
import defpackage.rdd0;
import defpackage.tom;
import defpackage.wq40;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\fJ#\u0010\u000f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\fJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0012J!\u0010\u0017\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/sportybet/android/auth/RefreshTokenLogger;", "", "<init>", "()V", "Lrdd0;", "sportyTrackingUseCase", "()Lrdd0;", "", AnalyticsParam.EVENT_PATH, "oldAccessToken", "", "logAuthenticatorRefreshStart", "(Ljava/lang/String;Ljava/lang/String;)V", "newAccessToken", "logAuthenticatorRefreshResult", "logTokenRenewed", "refreshToken", "logSameTokenEchoed", "(Ljava/lang/String;)V", "logNoUsableTokenPair", "logTokenRevoked", "", AnalyticsEvent.BI_TRACKING_KIND_ERROR, "logTransientError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/sportybet/android/auth/SportyTrackingUseCaseEntryPointDelegate;", "sportyTrackingUseCaseDelegate", "Lcom/sportybet/android/auth/SportyTrackingUseCaseEntryPointDelegate;", "getSportyTrackingUseCaseDelegate$africa_bet_android", "()Lcom/sportybet/android/auth/SportyTrackingUseCaseEntryPointDelegate;", "setSportyTrackingUseCaseDelegate$africa_bet_android", "(Lcom/sportybet/android/auth/SportyTrackingUseCaseEntryPointDelegate;)V", "getSportyTrackingUseCaseDelegate$africa_bet_android$annotations", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RefreshTokenLogger {
    public static final int $stable = 0;
    public static final RefreshTokenLogger INSTANCE = new RefreshTokenLogger();
    private static SportyTrackingUseCaseEntryPointDelegate sportyTrackingUseCaseDelegate = new SportyTrackingUseCaseEntryPointDelegateImpl();

    private RefreshTokenLogger() {
    }

    public static /* synthetic */ void getSportyTrackingUseCaseDelegate$africa_bet_android$annotations() {
    }

    public static final void logAuthenticatorRefreshResult(String path, String newAccessToken) {
        path.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_REFRESH_TOKEN);
        aVar.a("refreshAccessToken() out, path %s, newAccessToken: %s", path, newAccessToken);
    }

    public static final void logAuthenticatorRefreshStart(String path, String oldAccessToken) {
        path.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_REFRESH_TOKEN);
        aVar.a("refreshAccessToken() in, path %s, oldAccessToken: %s", path, oldAccessToken);
    }

    public static final void logNoUsableTokenPair(String refreshToken) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_REFRESH_TOKEN);
        aVar.n("refreshAccessToken succeeded with no usable token pair, refreshToken: %s", refreshToken);
        INSTANCE.sportyTrackingUseCase().a(new wq40("no_usable_token_pair", null), k00.d);
    }

    public static final void logSameTokenEchoed(String refreshToken) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_REFRESH_TOKEN);
        aVar.n("refreshAccessToken returned the same accessToken, treating as transient, refreshToken: %s", refreshToken);
        INSTANCE.sportyTrackingUseCase().a(new wq40("same_token_echoed", null), k00.d);
    }

    public static final void logTokenRenewed(String oldAccessToken, String newAccessToken) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_REFRESH_TOKEN);
        aVar.a("renew accessToken, old: %s, new: %s", oldAccessToken, newAccessToken);
    }

    public static final void logTokenRevoked(String refreshToken) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_REFRESH_TOKEN);
        aVar.n("403 error when refreshing access token, refreshToken: %s", refreshToken);
    }

    public static final void logTransientError(String refreshToken, Throwable error) {
        error.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_REFRESH_TOKEN);
        aVar.p(error, "transient error refreshing access token, refreshToken: %s", refreshToken);
        INSTANCE.sportyTrackingUseCase().a(new wq40("transient_error", error instanceof tom ? hce0.a(((tom) error).a, "http_") : error.getClass().getSimpleName()), k00.d);
    }

    private final rdd0 sportyTrackingUseCase() {
        return sportyTrackingUseCaseDelegate.getSportyTrackingUseCase();
    }

    public final SportyTrackingUseCaseEntryPointDelegate getSportyTrackingUseCaseDelegate$africa_bet_android() {
        return sportyTrackingUseCaseDelegate;
    }

    public final void setSportyTrackingUseCaseDelegate$africa_bet_android(SportyTrackingUseCaseEntryPointDelegate sportyTrackingUseCaseEntryPointDelegate) {
        sportyTrackingUseCaseEntryPointDelegate.getClass();
        sportyTrackingUseCaseDelegate = sportyTrackingUseCaseEntryPointDelegate;
    }
}
