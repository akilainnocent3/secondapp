package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0018\u0012\b\b\u0004\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMarketLayout;", "", "mode", "", "parameters", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getMode", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getParameters", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballMarketLayout {
    public static final int $stable = 8;

    @SerializedName("mode")
    private final String mode;

    @SerializedName("parameters")
    private final List<String> parameters;

    public NetworkScheduledFootballMarketLayout(String str, List<String> list) {
        this.mode = str;
        this.parameters = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballMarketLayout copy$default(NetworkScheduledFootballMarketLayout networkScheduledFootballMarketLayout, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkScheduledFootballMarketLayout.mode;
        }
        if ((i & 2) != 0) {
            list = networkScheduledFootballMarketLayout.parameters;
        }
        return networkScheduledFootballMarketLayout.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    public final List<String> component2() {
        return this.parameters;
    }

    public final NetworkScheduledFootballMarketLayout copy(String mode, List<String> parameters) {
        return new NetworkScheduledFootballMarketLayout(mode, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballMarketLayout)) {
            return false;
        }
        NetworkScheduledFootballMarketLayout networkScheduledFootballMarketLayout = (NetworkScheduledFootballMarketLayout) other;
        return Intrinsics.g(this.mode, networkScheduledFootballMarketLayout.mode) && Intrinsics.g(this.parameters, networkScheduledFootballMarketLayout.parameters);
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<String> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        String str = this.mode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.parameters;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return nf.b("NetworkScheduledFootballMarketLayout(mode=", this.mode, ", parameters=", ")", this.parameters);
    }
}
