package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import dr.w2;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import nv.i;
import nv.o0;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int i10);

    @l
    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    @m
    String getGameId();

    @m
    Object getGatewayCache(@l f<? super ByteString> fVar);

    @l
    ByteString getGatewayState();

    @l
    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    @m
    InitializationConfigurationInternal getInitializationConfiguration();

    @m
    InitializationException getInitializationError();

    @l
    InitializationState getInitializationState();

    @l
    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    @l
    i<InitializationState> getObserveInitializationState();

    @l
    o0<SessionChange> getOnChange();

    @m
    Object getPrivacy(@l f<? super ByteString> fVar);

    @m
    Object getPrivacyFsm(@l f<? super ByteString> fVar);

    @l
    List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides();

    @l
    List<AdFormatOuterClass.AdFormat> getScarEligibleFormats();

    @l
    SessionCountersOuterClass.SessionCounters getSessionCounters();

    @l
    ByteString getSessionId();

    @l
    ByteString getSessionToken();

    boolean getShouldInitialize();

    @l
    TokenCounters getTokenCounters();

    @m
    String getUnityInstallationId();

    @m
    String getUnityMegaSessionId();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    @m
    Object persistNativeConfiguration(@l f<? super w2> fVar);

    void resetTokenCounters();

    void setGameId(@m String str);

    @m
    Object setGatewayCache(@l ByteString byteString, @l f<? super w2> fVar);

    void setGatewayState(@l ByteString byteString);

    void setGatewayUrl(@l String str);

    void setInitializationConfiguration(@m InitializationConfigurationInternal initializationConfigurationInternal);

    void setInitializationError(@m InitializationException initializationException);

    void setInitializationState(@l InitializationState initializationState);

    void setNativeConfiguration(@l NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    @m
    Object setPrivacy(@l ByteString byteString, @l f<? super w2> fVar);

    @m
    Object setPrivacyFsm(@l ByteString byteString, @l f<? super w2> fVar);

    void setRequestUrlOverrides(@l List<InitializationResponseOuterClass.RequestUrlOverride> list);

    void setSessionCounters(@l SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(@l ByteString byteString);

    void setShouldInitialize(boolean z10);

    void setTokenCounters(@l TokenCounters tokenCounters);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static /* synthetic */ void getInitializationConfiguration$annotations() {
        }
    }
}
