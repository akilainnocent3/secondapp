package com.sportybet.android.social.data.remote.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/AliasCodeCreation;", "", AnalyticsParam.EVENT_PARAM_ID, "", "reachLimit", "", "<init>", "(IZ)V", "getId", "()I", "getReachLimit", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AliasCodeCreation {
    public static final int $stable = 0;
    private final int id;
    private final boolean reachLimit;

    public AliasCodeCreation(int i, boolean z) {
        this.id = i;
        this.reachLimit = z;
    }

    public static /* synthetic */ AliasCodeCreation copy$default(AliasCodeCreation aliasCodeCreation, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aliasCodeCreation.id;
        }
        if ((i2 & 2) != 0) {
            z = aliasCodeCreation.reachLimit;
        }
        return aliasCodeCreation.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getReachLimit() {
        return this.reachLimit;
    }

    public final AliasCodeCreation copy(int id, boolean reachLimit) {
        return new AliasCodeCreation(id, reachLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliasCodeCreation)) {
            return false;
        }
        AliasCodeCreation aliasCodeCreation = (AliasCodeCreation) other;
        return this.id == aliasCodeCreation.id && this.reachLimit == aliasCodeCreation.reachLimit;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getReachLimit() {
        return this.reachLimit;
    }

    public int hashCode() {
        return Boolean.hashCode(this.reachLimit) + (Integer.hashCode(this.id) * 31);
    }

    public String toString() {
        return "AliasCodeCreation(id=" + this.id + ", reachLimit=" + this.reachLimit + ")";
    }
}
