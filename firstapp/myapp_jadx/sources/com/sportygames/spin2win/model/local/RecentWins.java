package com.sportygames.spin2win.model.local;

import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/sportygames/spin2win/model/local/RecentWins;", "", "name", "", "amount", "", "time", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTime", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/sportygames/spin2win/model/local/RecentWins;", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentWins {
    public static final int $stable = 0;
    private final Double amount;
    private final String name;
    private final String time;

    public /* synthetic */ RecentWins(String str, Double d, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Double.valueOf(0.0d) : d, (i & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ RecentWins copy$default(RecentWins recentWins, String str, Double d, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentWins.name;
        }
        if ((i & 2) != 0) {
            d = recentWins.amount;
        }
        if ((i & 4) != 0) {
            str2 = recentWins.time;
        }
        return recentWins.copy(str, d, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    public final RecentWins copy(String name, Double amount, String time) {
        return new RecentWins(name, amount, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentWins)) {
            return false;
        }
        RecentWins recentWins = (RecentWins) other;
        return Intrinsics.g(this.name, recentWins.name) && Intrinsics.g(this.amount, recentWins.amount) && Intrinsics.g(this.time, recentWins.time);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.amount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.time;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        Double d = this.amount;
        String str2 = this.time;
        StringBuilder sb = new StringBuilder("RecentWins(name=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(d);
        sb.append(", time=");
        return uf80.a(sb, str2, ")");
    }

    public RecentWins(String str, Double d, String str2) {
        this.name = str;
        this.amount = d;
        this.time = str2;
    }

    public RecentWins() {
        this(null, null, null, 7, null);
    }
}
