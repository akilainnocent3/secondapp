package com.sporty.android.core.model.oddsboost;

import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/oddsboost/OddsBoostResponse;", "", "periodId", "", "details", "", "Lcom/sporty/android/core/model/oddsboost/OddsBoostDetails;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPeriodId", "()Ljava/lang/String;", "getDetails", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OddsBoostResponse {
    private final List<OddsBoostDetails> details;
    private final String periodId;

    public /* synthetic */ OddsBoostResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OddsBoostResponse copy$default(OddsBoostResponse oddsBoostResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oddsBoostResponse.periodId;
        }
        if ((i & 2) != 0) {
            list = oddsBoostResponse.details;
        }
        return oddsBoostResponse.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPeriodId() {
        return this.periodId;
    }

    public final List<OddsBoostDetails> component2() {
        return this.details;
    }

    public final OddsBoostResponse copy(String periodId, List<OddsBoostDetails> details) {
        return new OddsBoostResponse(periodId, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OddsBoostResponse)) {
            return false;
        }
        OddsBoostResponse oddsBoostResponse = (OddsBoostResponse) other;
        return Intrinsics.g(this.periodId, oddsBoostResponse.periodId) && Intrinsics.g(this.details, oddsBoostResponse.details);
    }

    public final List<OddsBoostDetails> getDetails() {
        return this.details;
    }

    public final String getPeriodId() {
        return this.periodId;
    }

    public int hashCode() {
        String str = this.periodId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OddsBoostDetails> list = this.details;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return nf.b("OddsBoostResponse(periodId=", this.periodId, ", details=", ")", this.details);
    }

    public OddsBoostResponse(String str, List<OddsBoostDetails> list) {
        this.periodId = str;
        this.details = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OddsBoostResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
