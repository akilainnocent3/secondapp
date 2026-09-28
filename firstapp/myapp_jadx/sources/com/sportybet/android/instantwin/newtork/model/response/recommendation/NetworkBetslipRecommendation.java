package com.sportybet.android.instantwin.newtork.model.response.recommendation;

import com.appsflyer.internal.p;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R-\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0014"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/recommendation/NetworkBetslipRecommendation;", "", "selections", "", "Lcom/sportybet/android/instantwin/newtork/model/response/recommendation/NetworkBetslipRecommendationSelection;", "<init>", "(Ljava/util/List;)V", "getSelections", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkBetslipRecommendation {
    public static final int $stable = 8;

    @SerializedName("selections")
    private final List<NetworkBetslipRecommendationSelection> selections;

    public NetworkBetslipRecommendation(List<NetworkBetslipRecommendationSelection> list) {
        this.selections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkBetslipRecommendation copy$default(NetworkBetslipRecommendation networkBetslipRecommendation, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = networkBetslipRecommendation.selections;
        }
        return networkBetslipRecommendation.copy(list);
    }

    public final List<NetworkBetslipRecommendationSelection> component1() {
        return this.selections;
    }

    public final NetworkBetslipRecommendation copy(List<NetworkBetslipRecommendationSelection> selections) {
        return new NetworkBetslipRecommendation(selections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NetworkBetslipRecommendation) && Intrinsics.g(this.selections, ((NetworkBetslipRecommendation) other).selections);
    }

    public final List<NetworkBetslipRecommendationSelection> getSelections() {
        return this.selections;
    }

    public int hashCode() {
        List<NetworkBetslipRecommendationSelection> list = this.selections;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return p.a("NetworkBetslipRecommendation(selections=", ")", this.selections);
    }
}
