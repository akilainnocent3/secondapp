package com.sporty.android.core.model.cashout;

import defpackage.cwz;
import defpackage.mq0;
import defpackage.mtg0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/cashout/EventInfoTrackingWidgetEnabledConfigs;", "", "liveMatchTrackerWidgetDisplayEnabled", "", "stvWidgetDisplayEnabled", "statsWidgetDisplayEnabled", "<init>", "(ZZZ)V", "getLiveMatchTrackerWidgetDisplayEnabled", "()Z", "getStvWidgetDisplayEnabled", "getStatsWidgetDisplayEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventInfoTrackingWidgetEnabledConfigs {
    private final boolean liveMatchTrackerWidgetDisplayEnabled;
    private final boolean statsWidgetDisplayEnabled;
    private final boolean stvWidgetDisplayEnabled;

    public EventInfoTrackingWidgetEnabledConfigs(boolean z, boolean z2, boolean z3) {
        this.liveMatchTrackerWidgetDisplayEnabled = z;
        this.stvWidgetDisplayEnabled = z2;
        this.statsWidgetDisplayEnabled = z3;
    }

    public static /* synthetic */ EventInfoTrackingWidgetEnabledConfigs copy$default(EventInfoTrackingWidgetEnabledConfigs eventInfoTrackingWidgetEnabledConfigs, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = eventInfoTrackingWidgetEnabledConfigs.liveMatchTrackerWidgetDisplayEnabled;
        }
        if ((i & 2) != 0) {
            z2 = eventInfoTrackingWidgetEnabledConfigs.stvWidgetDisplayEnabled;
        }
        if ((i & 4) != 0) {
            z3 = eventInfoTrackingWidgetEnabledConfigs.statsWidgetDisplayEnabled;
        }
        return eventInfoTrackingWidgetEnabledConfigs.copy(z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLiveMatchTrackerWidgetDisplayEnabled() {
        return this.liveMatchTrackerWidgetDisplayEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getStvWidgetDisplayEnabled() {
        return this.stvWidgetDisplayEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getStatsWidgetDisplayEnabled() {
        return this.statsWidgetDisplayEnabled;
    }

    public final EventInfoTrackingWidgetEnabledConfigs copy(boolean liveMatchTrackerWidgetDisplayEnabled, boolean stvWidgetDisplayEnabled, boolean statsWidgetDisplayEnabled) {
        return new EventInfoTrackingWidgetEnabledConfigs(liveMatchTrackerWidgetDisplayEnabled, stvWidgetDisplayEnabled, statsWidgetDisplayEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventInfoTrackingWidgetEnabledConfigs)) {
            return false;
        }
        EventInfoTrackingWidgetEnabledConfigs eventInfoTrackingWidgetEnabledConfigs = (EventInfoTrackingWidgetEnabledConfigs) other;
        return this.liveMatchTrackerWidgetDisplayEnabled == eventInfoTrackingWidgetEnabledConfigs.liveMatchTrackerWidgetDisplayEnabled && this.stvWidgetDisplayEnabled == eventInfoTrackingWidgetEnabledConfigs.stvWidgetDisplayEnabled && this.statsWidgetDisplayEnabled == eventInfoTrackingWidgetEnabledConfigs.statsWidgetDisplayEnabled;
    }

    public final boolean getLiveMatchTrackerWidgetDisplayEnabled() {
        return this.liveMatchTrackerWidgetDisplayEnabled;
    }

    public final boolean getStatsWidgetDisplayEnabled() {
        return this.statsWidgetDisplayEnabled;
    }

    public final boolean getStvWidgetDisplayEnabled() {
        return this.stvWidgetDisplayEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.statsWidgetDisplayEnabled) + mtg0.a(Boolean.hashCode(this.liveMatchTrackerWidgetDisplayEnabled) * 31, 31, this.stvWidgetDisplayEnabled);
    }

    public String toString() {
        boolean z = this.liveMatchTrackerWidgetDisplayEnabled;
        boolean z2 = this.stvWidgetDisplayEnabled;
        return mq0.a(cwz.a("EventInfoTrackingWidgetEnabledConfigs(liveMatchTrackerWidgetDisplayEnabled=", ", stvWidgetDisplayEnabled=", ", statsWidgetDisplayEnabled=", z, z2), this.statsWidgetDisplayEnabled, ")");
    }
}
