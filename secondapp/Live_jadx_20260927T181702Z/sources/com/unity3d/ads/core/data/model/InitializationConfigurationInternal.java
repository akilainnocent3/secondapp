package com.unity3d.ads.core.data.model;

import com.unity3d.ads.LogLevel;
import com.unity3d.ads.MediationInfo;
import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InitializationConfigurationInternal {

    @l
    private final Map<String, String> extras;

    @l
    private final String gameId;
    private final boolean isTestModeEnabled;

    @l
    private final LogLevel logLevel;

    @m
    private final MediationInfo mediationInfo;

    public InitializationConfigurationInternal(@l String gameId, boolean z10, @l LogLevel logLevel, @l Map<String, String> extras, @m MediationInfo mediationInfo) {
        m0.p(gameId, "gameId");
        m0.p(logLevel, "logLevel");
        m0.p(extras, "extras");
        this.gameId = gameId;
        this.isTestModeEnabled = z10;
        this.logLevel = logLevel;
        this.extras = extras;
        this.mediationInfo = mediationInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitializationConfigurationInternal copy$default(InitializationConfigurationInternal initializationConfigurationInternal, String str, boolean z10, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initializationConfigurationInternal.gameId;
        }
        if ((i10 & 2) != 0) {
            z10 = initializationConfigurationInternal.isTestModeEnabled;
        }
        if ((i10 & 4) != 0) {
            logLevel = initializationConfigurationInternal.logLevel;
        }
        if ((i10 & 8) != 0) {
            map = initializationConfigurationInternal.extras;
        }
        if ((i10 & 16) != 0) {
            mediationInfo = initializationConfigurationInternal.mediationInfo;
        }
        MediationInfo mediationInfo2 = mediationInfo;
        LogLevel logLevel2 = logLevel;
        return initializationConfigurationInternal.copy(str, z10, logLevel2, map, mediationInfo2);
    }

    @l
    public final String component1() {
        return this.gameId;
    }

    public final boolean component2() {
        return this.isTestModeEnabled;
    }

    @l
    public final LogLevel component3() {
        return this.logLevel;
    }

    @l
    public final Map<String, String> component4() {
        return this.extras;
    }

    @m
    public final MediationInfo component5() {
        return this.mediationInfo;
    }

    @l
    public final InitializationConfigurationInternal copy(@l String gameId, boolean z10, @l LogLevel logLevel, @l Map<String, String> extras, @m MediationInfo mediationInfo) {
        m0.p(gameId, "gameId");
        m0.p(logLevel, "logLevel");
        m0.p(extras, "extras");
        return new InitializationConfigurationInternal(gameId, z10, logLevel, extras, mediationInfo);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationConfigurationInternal)) {
            return false;
        }
        InitializationConfigurationInternal initializationConfigurationInternal = (InitializationConfigurationInternal) obj;
        return m0.g(this.gameId, initializationConfigurationInternal.gameId) && this.isTestModeEnabled == initializationConfigurationInternal.isTestModeEnabled && this.logLevel == initializationConfigurationInternal.logLevel && m0.g(this.extras, initializationConfigurationInternal.extras) && m0.g(this.mediationInfo, initializationConfigurationInternal.mediationInfo);
    }

    @l
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @l
    public final String getGameId() {
        return this.gameId;
    }

    @l
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    @m
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    public int hashCode() {
        int iHashCode = this.gameId.hashCode() * 31;
        boolean z10 = this.isTestModeEnabled;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iHashCode2 = (((((iHashCode + r10) * 31) + this.logLevel.hashCode()) * 31) + this.extras.hashCode()) * 31;
        MediationInfo mediationInfo = this.mediationInfo;
        return iHashCode2 + (mediationInfo == null ? 0 : mediationInfo.hashCode());
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    @l
    public String toString() {
        return "InitializationConfigurationInternal(gameId=" + this.gameId + ", isTestModeEnabled=" + this.isTestModeEnabled + ", logLevel=" + this.logLevel + ", extras=" + this.extras + ", mediationInfo=" + this.mediationInfo + ')';
    }

    public /* synthetic */ InitializationConfigurationInternal(String str, boolean z10, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i10, x xVar) {
        this(str, z10, (i10 & 4) != 0 ? LogLevel.INFO : logLevel, (i10 & 8) != 0 ? n1.z() : map, (i10 & 16) != 0 ? null : mediationInfo);
    }
}
