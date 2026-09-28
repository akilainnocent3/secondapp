package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.m2g;
import defpackage.mtg0;
import defpackage.ng1;
import defpackage.uqe0;
import defpackage.uts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0014\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cÊ\u0001\f\b(\u0012\b\b)\u0012\u0004\b\u0003\u0010\u0000¨\u0006'"}, d2 = {"Lcom/sportybet/plugin/realsports/data/OutrightDisplayData;", "", "viewType", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "name", "isExpanded", "", "tournaments", "", "Lcom/sportybet/plugin/realsports/data/OutrightTournament;", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getViewType", "()I", "setViewType", "(I)V", "getEventId", "()Ljava/lang/String;", "setEventId", "(Ljava/lang/String;)V", "getName", "setName", "()Z", "setExpanded", "(Z)V", "getTournaments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OutrightDisplayData {
    public static final int $stable = 8;
    private String eventId;
    private boolean isExpanded;
    private String name;
    private final List<OutrightTournament> tournaments;
    private int viewType;

    public OutrightDisplayData(int i, String str, String str2, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OutrightDisplayData copy$default(OutrightDisplayData outrightDisplayData, int i, String str, String str2, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = outrightDisplayData.viewType;
        }
        if ((i2 & 2) != 0) {
            str = outrightDisplayData.eventId;
        }
        if ((i2 & 4) != 0) {
            str2 = outrightDisplayData.name;
        }
        if ((i2 & 8) != 0) {
            z = outrightDisplayData.isExpanded;
        }
        if ((i2 & 16) != 0) {
            list = outrightDisplayData.tournaments;
        }
        List list2 = list;
        String str3 = str2;
        return outrightDisplayData.copy(i, str, str3, z, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final List<OutrightTournament> component5() {
        return this.tournaments;
    }

    public final OutrightDisplayData copy(int viewType, String eventId, String name, boolean isExpanded, List<OutrightTournament> tournaments) {
        eventId.getClass();
        name.getClass();
        tournaments.getClass();
        return new OutrightDisplayData(viewType, eventId, name, isExpanded, tournaments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutrightDisplayData)) {
            return false;
        }
        OutrightDisplayData outrightDisplayData = (OutrightDisplayData) other;
        return this.viewType == outrightDisplayData.viewType && Intrinsics.g(this.eventId, outrightDisplayData.eventId) && Intrinsics.g(this.name, outrightDisplayData.name) && this.isExpanded == outrightDisplayData.isExpanded && Intrinsics.g(this.tournaments, outrightDisplayData.tournaments);
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getName() {
        return this.name;
    }

    public final List<OutrightTournament> getTournaments() {
        return this.tournaments;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return this.tournaments.hashCode() + mtg0.a(gmf0.a(gmf0.a(Integer.hashCode(this.viewType) * 31, 31, this.eventId), 31, this.name), 31, this.isExpanded);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setEventId(String str) {
        str.getClass();
        this.eventId = str;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final void setName(String str) {
        str.getClass();
        this.name = str;
    }

    public final void setViewType(int i) {
        this.viewType = i;
    }

    public String toString() {
        int i = this.viewType;
        String str = this.eventId;
        String str2 = this.name;
        boolean z = this.isExpanded;
        List<OutrightTournament> list = this.tournaments;
        StringBuilder sbA = uqe0.a(i, "OutrightDisplayData(viewType=", ", eventId=", str, ", name=");
        uts.b(str2, ", isExpanded=", ", tournaments=", sbA, z);
        return ng1.a(sbA, list, ")");
    }

    public OutrightDisplayData(int i, String str, String str2, boolean z, List<OutrightTournament> list) {
        bt6.a(str, str2, list);
        this.viewType = i;
        this.eventId = str;
        this.name = str2;
        this.isExpanded = z;
        this.tournaments = list;
    }

    public OutrightDisplayData() {
        this(0, null, null, false, null, 31, null);
    }
}
