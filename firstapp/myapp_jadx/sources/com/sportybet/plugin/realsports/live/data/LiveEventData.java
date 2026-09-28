package com.sportybet.plugin.realsports.live.data;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.realsports.data.Event;
import defpackage.l48;
import defpackage.mq0;
import defpackage.mvs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/LiveEventData;", "Lcom/sportybet/plugin/realsports/live/data/LiveSectionData;", "Lmvs;", "viewType", "Lcom/sportybet/plugin/realsports/data/Event;", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "", "showBoostSign", "<init>", "(Lmvs;Lcom/sportybet/plugin/realsports/data/Event;Z)V", "component1", "()Lmvs;", "component2", "()Lcom/sportybet/plugin/realsports/data/Event;", "component3", "()Z", "copy", "(Lmvs;Lcom/sportybet/plugin/realsports/data/Event;Z)Lcom/sportybet/plugin/realsports/live/data/LiveEventData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmvs;", "getViewType", "Lcom/sportybet/plugin/realsports/data/Event;", "getEvent", "Z", "getShowBoostSign", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveEventData implements LiveSectionData {
    private final Event event;
    private final boolean showBoostSign;
    private final mvs viewType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/LiveEventData$Companion;", "", "<init>", "()V", "sorter", "", "data", "Lcom/sportybet/plugin/realsports/live/data/LiveEventData;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x003a A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:3:0x0008, B:5:0x000c, B:8:0x0013, B:10:0x0022, B:12:0x002d, B:15:0x003e, B:17:0x0042, B:20:0x0049, B:21:0x0068, B:23:0x006e, B:24:0x0080, B:14:0x003a), top: B:29:0x0008 }] */
        public final int sorter(LiveEventData data) {
            int i;
            data.getClass();
            Event event = data.getEvent();
            try {
                String str = event.period;
                if (str == null || str.length() == 0) {
                    i = 0;
                } else {
                    String str2 = event.period;
                    str2.getClass();
                    i = Integer.parseInt(str2) * 100000;
                }
                if (c.l(event.matchStatus, "HT", true)) {
                    i += 50000;
                } else {
                    String str3 = event.matchStatus;
                    str3.getClass();
                    if (StringsKt.M(str3, "break", true)) {
                        i += 50000;
                    }
                }
                String str4 = event.playedSeconds;
                if (str4 != null && str4.length() != 0) {
                    String str5 = event.playedSeconds;
                    str5.getClass();
                    List listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{":"}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList(l48.r(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                    }
                    return (((Number) arrayList.get(0)).intValue() * 60) + ((Number) arrayList.get(1)).intValue() + i;
                }
                return i;
            } catch (Exception unused) {
                return 0;
            }
        }

        private Companion() {
        }
    }

    public LiveEventData(mvs mvsVar, Event event, boolean z) {
        mvsVar.getClass();
        event.getClass();
        this.viewType = mvsVar;
        this.event = event;
        this.showBoostSign = z;
    }

    public static /* synthetic */ LiveEventData copy$default(LiveEventData liveEventData, mvs mvsVar, Event event, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            mvsVar = liveEventData.viewType;
        }
        if ((i & 2) != 0) {
            event = liveEventData.event;
        }
        if ((i & 4) != 0) {
            z = liveEventData.showBoostSign;
        }
        return liveEventData.copy(mvsVar, event, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final mvs getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowBoostSign() {
        return this.showBoostSign;
    }

    public final LiveEventData copy(mvs viewType, Event event, boolean showBoostSign) {
        viewType.getClass();
        event.getClass();
        return new LiveEventData(viewType, event, showBoostSign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveEventData)) {
            return false;
        }
        LiveEventData liveEventData = (LiveEventData) other;
        return this.viewType == liveEventData.viewType && Intrinsics.g(this.event, liveEventData.event) && this.showBoostSign == liveEventData.showBoostSign;
    }

    public final Event getEvent() {
        return this.event;
    }

    public final boolean getShowBoostSign() {
        return this.showBoostSign;
    }

    @Override // com.sportybet.plugin.realsports.live.data.LiveSectionData
    public mvs getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showBoostSign) + ((this.event.hashCode() + (this.viewType.hashCode() * 31)) * 31);
    }

    public String toString() {
        mvs mvsVar = this.viewType;
        Event event = this.event;
        boolean z = this.showBoostSign;
        StringBuilder sb = new StringBuilder("LiveEventData(viewType=");
        sb.append(mvsVar);
        sb.append(", event=");
        sb.append(event);
        sb.append(", showBoostSign=");
        return mq0.a(sb, z, ")");
    }
}
