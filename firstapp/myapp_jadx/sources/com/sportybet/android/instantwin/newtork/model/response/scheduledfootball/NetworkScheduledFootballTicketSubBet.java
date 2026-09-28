package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.appsflyer.internal.x;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.at6;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JY\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\nHÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R%\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R%\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dÊ\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0000¨\u0006+"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketSubBet;", "", "subBetId", "", "stake", "", "potWin", "wht", "bonus", AnalyticsParam.EVENT_STATUS, "", "selections", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketSelection;", "<init>", "(Ljava/lang/String;JJJJILjava/util/List;)V", "getSubBetId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "subbetId", "getStake", "()J", "getPotWin", "getWht", "getBonus", "getStatus", "()I", "getSelections", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballTicketSubBet {
    public static final int $stable = 8;

    @SerializedName("bonus")
    private final long bonus;

    @SerializedName("potWin")
    private final long potWin;

    @SerializedName("selections")
    private final List<NetworkScheduledFootballTicketSelection> selections;

    @SerializedName("stake")
    private final long stake;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    @SerializedName("subbetId")
    private final String subBetId;

    @SerializedName("wht")
    private final long wht;

    public NetworkScheduledFootballTicketSubBet(String str, long j, long j2, long j3, long j4, int i, List<NetworkScheduledFootballTicketSelection> list) {
        this.subBetId = str;
        this.stake = j;
        this.potWin = j2;
        this.wht = j3;
        this.bonus = j4;
        this.status = i;
        this.selections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballTicketSubBet copy$default(NetworkScheduledFootballTicketSubBet networkScheduledFootballTicketSubBet, String str, long j, long j2, long j3, long j4, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkScheduledFootballTicketSubBet.subBetId;
        }
        if ((i2 & 2) != 0) {
            j = networkScheduledFootballTicketSubBet.stake;
        }
        if ((i2 & 4) != 0) {
            j2 = networkScheduledFootballTicketSubBet.potWin;
        }
        if ((i2 & 8) != 0) {
            j3 = networkScheduledFootballTicketSubBet.wht;
        }
        if ((i2 & 16) != 0) {
            j4 = networkScheduledFootballTicketSubBet.bonus;
        }
        if ((i2 & 32) != 0) {
            i = networkScheduledFootballTicketSubBet.status;
        }
        if ((i2 & 64) != 0) {
            list = networkScheduledFootballTicketSubBet.selections;
        }
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        return networkScheduledFootballTicketSubBet.copy(str, j, j7, j6, j5, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubBetId() {
        return this.subBetId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStake() {
        return this.stake;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPotWin() {
        return this.potWin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getWht() {
        return this.wht;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBonus() {
        return this.bonus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final List<NetworkScheduledFootballTicketSelection> component7() {
        return this.selections;
    }

    public final NetworkScheduledFootballTicketSubBet copy(String subBetId, long stake, long potWin, long wht, long bonus, int status, List<NetworkScheduledFootballTicketSelection> selections) {
        return new NetworkScheduledFootballTicketSubBet(subBetId, stake, potWin, wht, bonus, status, selections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballTicketSubBet)) {
            return false;
        }
        NetworkScheduledFootballTicketSubBet networkScheduledFootballTicketSubBet = (NetworkScheduledFootballTicketSubBet) other;
        return Intrinsics.g(this.subBetId, networkScheduledFootballTicketSubBet.subBetId) && this.stake == networkScheduledFootballTicketSubBet.stake && this.potWin == networkScheduledFootballTicketSubBet.potWin && this.wht == networkScheduledFootballTicketSubBet.wht && this.bonus == networkScheduledFootballTicketSubBet.bonus && this.status == networkScheduledFootballTicketSubBet.status && Intrinsics.g(this.selections, networkScheduledFootballTicketSubBet.selections);
    }

    public final long getBonus() {
        return this.bonus;
    }

    public final long getPotWin() {
        return this.potWin;
    }

    public final List<NetworkScheduledFootballTicketSelection> getSelections() {
        return this.selections;
    }

    public final long getStake() {
        return this.stake;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getSubBetId() {
        return this.subBetId;
    }

    public final long getWht() {
        return this.wht;
    }

    public int hashCode() {
        String str = this.subBetId;
        int iA = gpp.a(this.status, f87.a(f87.a(f87.a(f87.a((str == null ? 0 : str.hashCode()) * 31, this.stake, 31), this.potWin, 31), this.wht, 31), this.bonus, 31), 31);
        List<NetworkScheduledFootballTicketSelection> list = this.selections;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.subBetId;
        long j = this.stake;
        long j2 = this.potWin;
        long j3 = this.wht;
        long j4 = this.bonus;
        int i = this.status;
        List<NetworkScheduledFootballTicketSelection> list = this.selections;
        StringBuilder sbA = x.a(j, "NetworkScheduledFootballTicketSubBet(subBetId=", str, ", stake=");
        g41.a(j2, ", potWin=", ", wht=", sbA);
        sbA.append(j3);
        g41.a(j4, ", bonus=", ", status=", sbA);
        return at6.b(sbA, i, ", selections=", list, ")");
    }
}
