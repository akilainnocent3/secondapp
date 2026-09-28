package com.sportybet.plugin.realsports.data;

import com.appsflyer.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sportybet/plugin/realsports/data/SportsEventNum;", "", "num", "", "sportId", "", "<init>", "(ILjava/lang/String;)V", "getNum", "()I", "getSportId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportsEventNum {
    public static final int $stable = 0;
    private final int num;
    private final String sportId;

    public SportsEventNum(int i, String str) {
        str.getClass();
        this.num = i;
        this.sportId = str;
    }

    public static /* synthetic */ SportsEventNum copy$default(SportsEventNum sportsEventNum, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportsEventNum.num;
        }
        if ((i2 & 2) != 0) {
            str = sportsEventNum.sportId;
        }
        return sportsEventNum.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNum() {
        return this.num;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    public final SportsEventNum copy(int num, String sportId) {
        sportId.getClass();
        return new SportsEventNum(num, sportId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsEventNum)) {
            return false;
        }
        SportsEventNum sportsEventNum = (SportsEventNum) other;
        return this.num == sportsEventNum.num && Intrinsics.g(this.sportId, sportsEventNum.sportId);
    }

    public final int getNum() {
        return this.num;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        return this.sportId.hashCode() + (Integer.hashCode(this.num) * 31);
    }

    public String toString() {
        return h.a(this.num, "SportsEventNum(num=", ", sportId=", this.sportId, ")");
    }
}
