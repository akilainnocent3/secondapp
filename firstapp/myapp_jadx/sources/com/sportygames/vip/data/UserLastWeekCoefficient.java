package com.sportygames.vip.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.itu;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/sportygames/vip/data/UserLastWeekCoefficient;", "", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "betId", "cashoutCoefficient", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserId", "getBetId", "getCashoutCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;)Lcom/sportygames/vip/data/UserLastWeekCoefficient;", "equals", "", "other", "hashCode", "", "toString", "", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserLastWeekCoefficient {
    public static final int $stable = 0;
    private final Long betId;
    private final Double cashoutCoefficient;
    private final Long id;
    private final Long userId;

    public UserLastWeekCoefficient(Long l, Long l2, Long l3, Double d) {
        this.id = l;
        this.userId = l2;
        this.betId = l3;
        this.cashoutCoefficient = d;
    }

    public static /* synthetic */ UserLastWeekCoefficient copy$default(UserLastWeekCoefficient userLastWeekCoefficient, Long l, Long l2, Long l3, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            l = userLastWeekCoefficient.id;
        }
        if ((i & 2) != 0) {
            l2 = userLastWeekCoefficient.userId;
        }
        if ((i & 4) != 0) {
            l3 = userLastWeekCoefficient.betId;
        }
        if ((i & 8) != 0) {
            d = userLastWeekCoefficient.cashoutCoefficient;
        }
        return userLastWeekCoefficient.copy(l, l2, l3, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final UserLastWeekCoefficient copy(Long id, Long userId, Long betId, Double cashoutCoefficient) {
        return new UserLastWeekCoefficient(id, userId, betId, cashoutCoefficient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserLastWeekCoefficient)) {
            return false;
        }
        UserLastWeekCoefficient userLastWeekCoefficient = (UserLastWeekCoefficient) other;
        return Intrinsics.g(this.id, userLastWeekCoefficient.id) && Intrinsics.g(this.userId, userLastWeekCoefficient.userId) && Intrinsics.g(this.betId, userLastWeekCoefficient.betId) && Intrinsics.g(this.cashoutCoefficient, userLastWeekCoefficient.cashoutCoefficient);
    }

    public final Long getBetId() {
        return this.betId;
    }

    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final Long getId() {
        return this.id;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.userId;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.betId;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d = this.cashoutCoefficient;
        return iHashCode3 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserLastWeekCoefficient(id=");
        sb.append(this.id);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", betId=");
        sb.append(this.betId);
        sb.append(", cashoutCoefficient=");
        return itu.a(sb, this.cashoutCoefficient, ')');
    }
}
