package com.sportybet.plugin.realsports.live.data;

import com.sporty.android.book.presentation.eventsorting.EventSortDirection;
import com.sporty.android.book.presentation.eventsorting.EventSortType;
import com.sporty.android.book.presentation.eventsorting.EventStreamType;
import defpackage.cwz;
import defpackage.gpp;
import defpackage.l48;
import defpackage.mtg0;
import defpackage.t3g;
import defpackage.zk1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003JU\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0014\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\rHÖ\u0081\u0004J\n\u0010)\u001a\u00020\u001dHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aÊ\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0000¨\u0006+"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/LiveHeaderData;", "", "hideQuickMarketTabs", "", "isLoadingOrEmpty", "sortType", "Lcom/sporty/android/book/presentation/eventsorting/EventSortType;", "sortDirection", "Lcom/sporty/android/book/presentation/eventsorting/EventSortDirection;", "selectedStreamTypes", "", "Lcom/sporty/android/book/presentation/eventsorting/EventStreamType;", "sportyTvCount", "", "sportyFmCount", "<init>", "(ZZLcom/sporty/android/book/presentation/eventsorting/EventSortType;Lcom/sporty/android/book/presentation/eventsorting/EventSortDirection;Ljava/util/Set;II)V", "getHideQuickMarketTabs", "()Z", "getSortType", "()Lcom/sporty/android/book/presentation/eventsorting/EventSortType;", "getSortDirection", "()Lcom/sporty/android/book/presentation/eventsorting/EventSortDirection;", "getSelectedStreamTypes", "()Ljava/util/Set;", "getSportyTvCount", "()I", "getSportyFmCount", "encodeSortingData", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Companion", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveHeaderData {
    private final boolean hideQuickMarketTabs;
    private final boolean isLoadingOrEmpty;
    private final Set<EventStreamType> selectedStreamTypes;
    private final EventSortDirection sortDirection;
    private final EventSortType sortType;
    private final int sportyFmCount;
    private final int sportyTvCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/LiveHeaderData$Companion;", "", "<init>", "()V", "decodeSortingData", "Lcom/sportybet/plugin/realsports/live/data/LiveHeaderData;", "data", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LiveHeaderData decodeSortingData(String data) {
            data.getClass();
            if (data.length() == 0) {
                return new LiveHeaderData(false, false, null, null, null, 0, 0, 127, null);
            }
            try {
                int i = 0;
                List listSplit$default = StringsKt__StringsKt.split$default(data, new String[]{"*"}, false, 0, 6, null);
                EventSortType eventSortTypeValueOf = EventSortType.valueOf((String) listSplit$default.get(0));
                EventSortDirection eventSortDirectionValueOf = EventSortDirection.valueOf((String) listSplit$default.get(1));
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(2), new String[]{","}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listSplit$default2) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(EventStreamType.valueOf((String) obj2));
                }
                return new LiveHeaderData(false, false, eventSortTypeValueOf, eventSortDirectionValueOf, CollectionsKt.E0(arrayList2), 0, 0, 99, null);
            } catch (Exception unused) {
                return new LiveHeaderData(false, false, null, null, null, 0, 0, 127, null);
            }
        }

        private Companion() {
        }
    }

    public LiveHeaderData(boolean z, boolean z2, EventSortType eventSortType, EventSortDirection eventSortDirection, Set set, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? true : z2, (i3 & 4) != 0 ? EventSortType.LEAGUE : eventSortType, (i3 & 8) != 0 ? EventSortDirection.ASCENDING : eventSortDirection, (i3 & 16) != 0 ? t3g.a : set, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveHeaderData copy$default(LiveHeaderData liveHeaderData, boolean z, boolean z2, EventSortType eventSortType, EventSortDirection eventSortDirection, Set set, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = liveHeaderData.hideQuickMarketTabs;
        }
        if ((i3 & 2) != 0) {
            z2 = liveHeaderData.isLoadingOrEmpty;
        }
        if ((i3 & 4) != 0) {
            eventSortType = liveHeaderData.sortType;
        }
        if ((i3 & 8) != 0) {
            eventSortDirection = liveHeaderData.sortDirection;
        }
        if ((i3 & 16) != 0) {
            set = liveHeaderData.selectedStreamTypes;
        }
        if ((i3 & 32) != 0) {
            i = liveHeaderData.sportyTvCount;
        }
        if ((i3 & 64) != 0) {
            i2 = liveHeaderData.sportyFmCount;
        }
        int i4 = i;
        int i5 = i2;
        Set set2 = set;
        EventSortType eventSortType2 = eventSortType;
        return liveHeaderData.copy(z, z2, eventSortType2, eventSortDirection, set2, i4, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHideQuickMarketTabs() {
        return this.hideQuickMarketTabs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoadingOrEmpty() {
        return this.isLoadingOrEmpty;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EventSortType getSortType() {
        return this.sortType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EventSortDirection getSortDirection() {
        return this.sortDirection;
    }

    public final Set<EventStreamType> component5() {
        return this.selectedStreamTypes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSportyTvCount() {
        return this.sportyTvCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSportyFmCount() {
        return this.sportyFmCount;
    }

    public final LiveHeaderData copy(boolean hideQuickMarketTabs, boolean isLoadingOrEmpty, EventSortType sortType, EventSortDirection sortDirection, Set<? extends EventStreamType> selectedStreamTypes, int sportyTvCount, int sportyFmCount) {
        sortType.getClass();
        sortDirection.getClass();
        selectedStreamTypes.getClass();
        return new LiveHeaderData(hideQuickMarketTabs, isLoadingOrEmpty, sortType, sortDirection, selectedStreamTypes, sportyTvCount, sportyFmCount);
    }

    public final String encodeSortingData() {
        return this.sortType.name() + "*" + this.sortDirection.name() + "*" + CollectionsKt.a0(this.selectedStreamTypes, ",", null, null, null, 62);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveHeaderData)) {
            return false;
        }
        LiveHeaderData liveHeaderData = (LiveHeaderData) other;
        return this.hideQuickMarketTabs == liveHeaderData.hideQuickMarketTabs && this.isLoadingOrEmpty == liveHeaderData.isLoadingOrEmpty && this.sortType == liveHeaderData.sortType && this.sortDirection == liveHeaderData.sortDirection && Intrinsics.g(this.selectedStreamTypes, liveHeaderData.selectedStreamTypes) && this.sportyTvCount == liveHeaderData.sportyTvCount && this.sportyFmCount == liveHeaderData.sportyFmCount;
    }

    public final boolean getHideQuickMarketTabs() {
        return this.hideQuickMarketTabs;
    }

    public final Set<EventStreamType> getSelectedStreamTypes() {
        return this.selectedStreamTypes;
    }

    public final EventSortDirection getSortDirection() {
        return this.sortDirection;
    }

    public final EventSortType getSortType() {
        return this.sortType;
    }

    public final int getSportyFmCount() {
        return this.sportyFmCount;
    }

    public final int getSportyTvCount() {
        return this.sportyTvCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.sportyFmCount) + gpp.a(this.sportyTvCount, (this.selectedStreamTypes.hashCode() + ((this.sortDirection.hashCode() + ((this.sortType.hashCode() + mtg0.a(Boolean.hashCode(this.hideQuickMarketTabs) * 31, 31, this.isLoadingOrEmpty)) * 31)) * 31)) * 31, 31);
    }

    public final boolean isLoadingOrEmpty() {
        return this.isLoadingOrEmpty;
    }

    public String toString() {
        boolean z = this.hideQuickMarketTabs;
        boolean z2 = this.isLoadingOrEmpty;
        EventSortType eventSortType = this.sortType;
        EventSortDirection eventSortDirection = this.sortDirection;
        Set<EventStreamType> set = this.selectedStreamTypes;
        int i = this.sportyTvCount;
        int i2 = this.sportyFmCount;
        StringBuilder sbA = cwz.a("LiveHeaderData(hideQuickMarketTabs=", ", isLoadingOrEmpty=", ", sortType=", z, z2);
        sbA.append(eventSortType);
        sbA.append(", sortDirection=");
        sbA.append(eventSortDirection);
        sbA.append(", selectedStreamTypes=");
        sbA.append(set);
        sbA.append(", sportyTvCount=");
        sbA.append(i);
        sbA.append(", sportyFmCount=");
        return zk1.a(i2, ")", sbA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveHeaderData(boolean z, boolean z2, EventSortType eventSortType, EventSortDirection eventSortDirection, Set<? extends EventStreamType> set, int i, int i2) {
        eventSortType.getClass();
        eventSortDirection.getClass();
        set.getClass();
        this.hideQuickMarketTabs = z;
        this.isLoadingOrEmpty = z2;
        this.sortType = eventSortType;
        this.sortDirection = eventSortDirection;
        this.selectedStreamTypes = set;
        this.sportyTvCount = i;
        this.sportyFmCount = i2;
    }

    public LiveHeaderData() {
        this(false, false, null, null, null, 0, 0, 127, null);
    }
}
