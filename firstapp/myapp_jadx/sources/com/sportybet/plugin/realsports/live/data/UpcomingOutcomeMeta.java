package com.sportybet.plugin.realsports.live.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.Selection;
import defpackage.mq0;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001a"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/UpcomingOutcomeMeta;", "", "selection", "Lcom/sportybet/plugin/realsports/betslip/Selection;", AnalyticsParam.EVENT_PARAM_IS_CHECKED, "", "canUpdate", "<init>", "(Lcom/sportybet/plugin/realsports/betslip/Selection;ZZ)V", "getSelection", "()Lcom/sportybet/plugin/realsports/betslip/Selection;", "()Z", "setChecked", "(Z)V", "getCanUpdate", "setCanUpdate", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UpcomingOutcomeMeta {
    public static final int $stable = 8;
    private boolean canUpdate;
    private boolean isChecked;
    private final Selection selection;

    public /* synthetic */ UpcomingOutcomeMeta(Selection selection, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(selection, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public static /* synthetic */ UpcomingOutcomeMeta copy$default(UpcomingOutcomeMeta upcomingOutcomeMeta, Selection selection, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            selection = upcomingOutcomeMeta.selection;
        }
        if ((i & 2) != 0) {
            z = upcomingOutcomeMeta.isChecked;
        }
        if ((i & 4) != 0) {
            z2 = upcomingOutcomeMeta.canUpdate;
        }
        return upcomingOutcomeMeta.copy(selection, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Selection getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanUpdate() {
        return this.canUpdate;
    }

    public final UpcomingOutcomeMeta copy(Selection selection, boolean isChecked, boolean canUpdate) {
        selection.getClass();
        return new UpcomingOutcomeMeta(selection, isChecked, canUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcomingOutcomeMeta)) {
            return false;
        }
        UpcomingOutcomeMeta upcomingOutcomeMeta = (UpcomingOutcomeMeta) other;
        return Intrinsics.g(this.selection, upcomingOutcomeMeta.selection) && this.isChecked == upcomingOutcomeMeta.isChecked && this.canUpdate == upcomingOutcomeMeta.canUpdate;
    }

    public final boolean getCanUpdate() {
        return this.canUpdate;
    }

    public final Selection getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return Boolean.hashCode(this.canUpdate) + mtg0.a(this.selection.hashCode() * 31, 31, this.isChecked);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setCanUpdate(boolean z) {
        this.canUpdate = z;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public String toString() {
        Selection selection = this.selection;
        boolean z = this.isChecked;
        boolean z2 = this.canUpdate;
        StringBuilder sb = new StringBuilder("UpcomingOutcomeMeta(selection=");
        sb.append(selection);
        sb.append(", isChecked=");
        sb.append(z);
        sb.append(", canUpdate=");
        return mq0.a(sb, z2, ")");
    }

    public UpcomingOutcomeMeta(Selection selection, boolean z, boolean z2) {
        selection.getClass();
        this.selection = selection;
        this.isChecked = z;
        this.canUpdate = z2;
    }
}
