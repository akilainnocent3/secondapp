package com.sporty.android.core.model.oddsboost;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\u0002\b\u0013¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/oddsboost/OddsBoostRtpRatioResponse;", "", "ratios", "", "Lcom/sporty/android/core/model/oddsboost/OddsBoostRtpRatio;", "<init>", "(Ljava/util/List;)V", "getRatios", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OddsBoostRtpRatioResponse {
    private final List<OddsBoostRtpRatio> ratios;

    public /* synthetic */ OddsBoostRtpRatioResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OddsBoostRtpRatioResponse copy$default(OddsBoostRtpRatioResponse oddsBoostRtpRatioResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oddsBoostRtpRatioResponse.ratios;
        }
        return oddsBoostRtpRatioResponse.copy(list);
    }

    public final List<OddsBoostRtpRatio> component1() {
        return this.ratios;
    }

    public final OddsBoostRtpRatioResponse copy(List<OddsBoostRtpRatio> ratios) {
        return new OddsBoostRtpRatioResponse(ratios);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OddsBoostRtpRatioResponse) && Intrinsics.g(this.ratios, ((OddsBoostRtpRatioResponse) other).ratios);
    }

    public final List<OddsBoostRtpRatio> getRatios() {
        return this.ratios;
    }

    public int hashCode() {
        List<OddsBoostRtpRatio> list = this.ratios;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return p.a("OddsBoostRtpRatioResponse(ratios=", ")", this.ratios);
    }

    public OddsBoostRtpRatioResponse(List<OddsBoostRtpRatio> list) {
        this.ratios = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OddsBoostRtpRatioResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
