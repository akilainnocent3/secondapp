package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR3\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarketLayout;", "", "mode", "", "parameterMap", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getMode", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getParameterMap", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingMarketLayout {
    public static final int $stable = 8;

    @SerializedName("mode")
    private final String mode;

    @SerializedName("parameterMap")
    private final Map<String, String> parameterMap;

    public NetworkInstantRacingMarketLayout(String str, Map<String, String> map) {
        this.mode = str;
        this.parameterMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingMarketLayout copy$default(NetworkInstantRacingMarketLayout networkInstantRacingMarketLayout, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantRacingMarketLayout.mode;
        }
        if ((i & 2) != 0) {
            map = networkInstantRacingMarketLayout.parameterMap;
        }
        return networkInstantRacingMarketLayout.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    public final Map<String, String> component2() {
        return this.parameterMap;
    }

    public final NetworkInstantRacingMarketLayout copy(String mode, Map<String, String> parameterMap) {
        return new NetworkInstantRacingMarketLayout(mode, parameterMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingMarketLayout)) {
            return false;
        }
        NetworkInstantRacingMarketLayout networkInstantRacingMarketLayout = (NetworkInstantRacingMarketLayout) other;
        return Intrinsics.g(this.mode, networkInstantRacingMarketLayout.mode) && Intrinsics.g(this.parameterMap, networkInstantRacingMarketLayout.parameterMap);
    }

    public final String getMode() {
        return this.mode;
    }

    public final Map<String, String> getParameterMap() {
        return this.parameterMap;
    }

    public int hashCode() {
        String str = this.mode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.parameterMap;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "NetworkInstantRacingMarketLayout(mode=" + this.mode + ", parameterMap=" + this.parameterMap + ")";
    }
}
