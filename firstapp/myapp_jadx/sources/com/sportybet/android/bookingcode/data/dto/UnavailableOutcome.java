package com.sportybet.android.bookingcode.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.domain.model.SelectionId;
import defpackage.hxa;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0003JK\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/bookingcode/data/dto/UnavailableOutcome;", "Lcom/sportybet/plugin/realsports/betslip/domain/model/SelectionId;", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", "outcomeId", "specifier", "childSelections", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEventId", "()Ljava/lang/String;", "getMarketId", "getOutcomeId", "getSpecifier", "getChildSelections", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UnavailableOutcome implements SelectionId<UnavailableOutcome> {
    public static final int $stable = 8;
    private final List<UnavailableOutcome> childSelections;
    private final String eventId;
    private final String marketId;
    private final String outcomeId;
    private final String specifier;

    public /* synthetic */ UnavailableOutcome(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnavailableOutcome copy$default(UnavailableOutcome unavailableOutcome, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unavailableOutcome.eventId;
        }
        if ((i & 2) != 0) {
            str2 = unavailableOutcome.marketId;
        }
        if ((i & 4) != 0) {
            str3 = unavailableOutcome.outcomeId;
        }
        if ((i & 8) != 0) {
            str4 = unavailableOutcome.specifier;
        }
        if ((i & 16) != 0) {
            list = unavailableOutcome.childSelections;
        }
        List list2 = list;
        String str5 = str3;
        return unavailableOutcome.copy(str, str2, str5, str4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    public final List<UnavailableOutcome> component5() {
        return this.childSelections;
    }

    public final UnavailableOutcome copy(String eventId, String marketId, String outcomeId, String specifier, List<UnavailableOutcome> childSelections) {
        return new UnavailableOutcome(eventId, marketId, outcomeId, specifier, childSelections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnavailableOutcome)) {
            return false;
        }
        UnavailableOutcome unavailableOutcome = (UnavailableOutcome) other;
        return Intrinsics.g(this.eventId, unavailableOutcome.eventId) && Intrinsics.g(this.marketId, unavailableOutcome.marketId) && Intrinsics.g(this.outcomeId, unavailableOutcome.outcomeId) && Intrinsics.g(this.specifier, unavailableOutcome.specifier) && Intrinsics.g(this.childSelections, unavailableOutcome.childSelections);
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public List<UnavailableOutcome> getChildSelections() {
        return this.childSelections;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public String getEventId() {
        return this.eventId;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public String getMarketId() {
        return this.marketId;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public String getOutcomeId() {
        return this.outcomeId;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public String getSpecifier() {
        return this.specifier;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.outcomeId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.specifier;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<UnavailableOutcome> list = this.childSelections;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.marketId;
        String str3 = this.outcomeId;
        String str4 = this.specifier;
        List<UnavailableOutcome> list = this.childSelections;
        StringBuilder sbA = ux5.a("UnavailableOutcome(eventId=", str, ", marketId=", str2, ", outcomeId=");
        hxa.c(sbA, str3, ", specifier=", str4, ", childSelections=");
        return ng1.a(sbA, list, ")");
    }

    public UnavailableOutcome(String str, String str2, String str3, String str4, List<UnavailableOutcome> list) {
        this.eventId = str;
        this.marketId = str2;
        this.outcomeId = str3;
        this.specifier = str4;
        this.childSelections = list;
    }
}
