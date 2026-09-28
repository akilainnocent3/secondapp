package com.sportybet.plugin.realsports.data;

import defpackage.d830;
import defpackage.mq0;
import defpackage.yt5;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J/\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0013HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\u0002\b!Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006 "}, d2 = {"Lcom/sportybet/plugin/realsports/data/TimeFilterEventCountData;", "", "fixed", "", "Lcom/sportybet/plugin/realsports/data/TimeFilterEventCountData$Item;", "custom", "triggeredByRangeChange", "", "<init>", "(Ljava/util/List;Lcom/sportybet/plugin/realsports/data/TimeFilterEventCountData$Item;Z)V", "getFixed", "()Ljava/util/List;", "getCustom", "()Lcom/sportybet/plugin/realsports/data/TimeFilterEventCountData$Item;", "getTriggeredByRangeChange", "()Z", "getFixedCount", "", "dayId", "", "customCount", "getCustomCount", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "Item", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TimeFilterEventCountData {
    public static final int $stable = 8;
    private final Item custom;
    private final List<Item> fixed;
    private final boolean triggeredByRangeChange;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sportybet/plugin/realsports/data/TimeFilterEventCountData$Item;", "", "filterKey", "", "count", "", "<init>", "(Ljava/lang/String;I)V", "getFilterKey", "()Ljava/lang/String;", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final int count;
        private final String filterKey;

        public Item(String str, int i) {
            str.getClass();
            this.filterKey = str;
            this.count = i;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = item.filterKey;
            }
            if ((i2 & 2) != 0) {
                i = item.count;
            }
            return item.copy(str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFilterKey() {
            return this.filterKey;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final Item copy(String filterKey, int count) {
            filterKey.getClass();
            return new Item(filterKey, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.g(this.filterKey, item.filterKey) && this.count == item.count;
        }

        public final int getCount() {
            return this.count;
        }

        public final String getFilterKey() {
            return this.filterKey;
        }

        public int hashCode() {
            return Integer.hashCode(this.count) + (this.filterKey.hashCode() * 31);
        }

        public String toString() {
            return d830.a(this.count, "Item(filterKey=", this.filterKey, ", count=", ")");
        }
    }

    public TimeFilterEventCountData(List<Item> list, Item item, boolean z) {
        list.getClass();
        this.fixed = list;
        this.custom = item;
        this.triggeredByRangeChange = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeFilterEventCountData copy$default(TimeFilterEventCountData timeFilterEventCountData, List list, Item item, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = timeFilterEventCountData.fixed;
        }
        if ((i & 2) != 0) {
            item = timeFilterEventCountData.custom;
        }
        if ((i & 4) != 0) {
            z = timeFilterEventCountData.triggeredByRangeChange;
        }
        return timeFilterEventCountData.copy(list, item, z);
    }

    public final List<Item> component1() {
        return this.fixed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Item getCustom() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getTriggeredByRangeChange() {
        return this.triggeredByRangeChange;
    }

    public final TimeFilterEventCountData copy(List<Item> fixed, Item custom, boolean triggeredByRangeChange) {
        fixed.getClass();
        return new TimeFilterEventCountData(fixed, custom, triggeredByRangeChange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeFilterEventCountData)) {
            return false;
        }
        TimeFilterEventCountData timeFilterEventCountData = (TimeFilterEventCountData) other;
        return Intrinsics.g(this.fixed, timeFilterEventCountData.fixed) && Intrinsics.g(this.custom, timeFilterEventCountData.custom) && this.triggeredByRangeChange == timeFilterEventCountData.triggeredByRangeChange;
    }

    public final Item getCustom() {
        return this.custom;
    }

    public final int getCustomCount() {
        Item item = this.custom;
        if (item != null) {
            return item.getCount();
        }
        return 0;
    }

    public final List<Item> getFixed() {
        return this.fixed;
    }

    public final int getFixedCount(String dayId) {
        Object next;
        boolean zEqualsIgnoreCase;
        dayId.getClass();
        if (Intrinsics.g(dayId, "today")) {
            Calendar calendar = Calendar.getInstance();
            calendar.getClass();
            dayId = yt5.c(calendar);
        } else if (Intrinsics.g(dayId, "tomorrow")) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.getClass();
            dayId = yt5.c(yt5.a(calendar2, 1));
        }
        Iterator<T> it = this.fixed.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String filterKey = ((Item) next).getFilterKey();
            if (filterKey != null && dayId != null) {
                zEqualsIgnoreCase = filterKey.equalsIgnoreCase(dayId);
            } else if (filterKey != dayId) {
                if (filterKey != null && dayId != null && filterKey.length() == dayId.length()) {
                    int length = filterKey.length();
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            zEqualsIgnoreCase = true;
                        } else if (a.a(filterKey.charAt(i), dayId.charAt(i), true)) {
                            i++;
                        }
                    }
                }
                zEqualsIgnoreCase = false;
            } else {
                zEqualsIgnoreCase = true;
            }
        } while (!zEqualsIgnoreCase);
        Item item = (Item) next;
        if (item != null) {
            return item.getCount();
        }
        return 0;
    }

    public final boolean getTriggeredByRangeChange() {
        return this.triggeredByRangeChange;
    }

    public int hashCode() {
        int iHashCode = this.fixed.hashCode() * 31;
        Item item = this.custom;
        return Boolean.hashCode(this.triggeredByRangeChange) + ((iHashCode + (item == null ? 0 : item.hashCode())) * 31);
    }

    public String toString() {
        List<Item> list = this.fixed;
        Item item = this.custom;
        boolean z = this.triggeredByRangeChange;
        StringBuilder sb = new StringBuilder("TimeFilterEventCountData(fixed=");
        sb.append(list);
        sb.append(", custom=");
        sb.append(item);
        sb.append(", triggeredByRangeChange=");
        return mq0.a(sb, z, ")");
    }

    public /* synthetic */ TimeFilterEventCountData(List list, Item item, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, item, (i & 4) != 0 ? false : z);
    }
}
