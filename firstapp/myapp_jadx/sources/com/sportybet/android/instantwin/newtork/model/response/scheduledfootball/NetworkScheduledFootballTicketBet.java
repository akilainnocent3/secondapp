package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gpp;
import defpackage.ml5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0000¨\u0006\""}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketBet;", "", "betId", "", AnalyticsParam.EVENT_STATUS, "", "potWin", "", "subBets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketSubBet;", "<init>", "(Ljava/lang/String;IJLjava/util/List;)V", "getBetId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getStatus", "()I", "getPotWin", "()J", "getSubBets", "()Ljava/util/List;", "subbets", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballTicketBet {
    public static final int $stable = 8;

    @SerializedName("betId")
    private final String betId;

    @SerializedName("potWin")
    private final long potWin;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    @SerializedName("subbets")
    private final List<NetworkScheduledFootballTicketSubBet> subBets;

    public NetworkScheduledFootballTicketBet(String str, int i, long j, List<NetworkScheduledFootballTicketSubBet> list) {
        this.betId = str;
        this.status = i;
        this.potWin = j;
        this.subBets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballTicketBet copy$default(NetworkScheduledFootballTicketBet networkScheduledFootballTicketBet, String str, int i, long j, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkScheduledFootballTicketBet.betId;
        }
        if ((i2 & 2) != 0) {
            i = networkScheduledFootballTicketBet.status;
        }
        if ((i2 & 4) != 0) {
            j = networkScheduledFootballTicketBet.potWin;
        }
        if ((i2 & 8) != 0) {
            list = networkScheduledFootballTicketBet.subBets;
        }
        List list2 = list;
        return networkScheduledFootballTicketBet.copy(str, i, j, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPotWin() {
        return this.potWin;
    }

    public final List<NetworkScheduledFootballTicketSubBet> component4() {
        return this.subBets;
    }

    public final NetworkScheduledFootballTicketBet copy(String betId, int status, long potWin, List<NetworkScheduledFootballTicketSubBet> subBets) {
        return new NetworkScheduledFootballTicketBet(betId, status, potWin, subBets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballTicketBet)) {
            return false;
        }
        NetworkScheduledFootballTicketBet networkScheduledFootballTicketBet = (NetworkScheduledFootballTicketBet) other;
        return Intrinsics.g(this.betId, networkScheduledFootballTicketBet.betId) && this.status == networkScheduledFootballTicketBet.status && this.potWin == networkScheduledFootballTicketBet.potWin && Intrinsics.g(this.subBets, networkScheduledFootballTicketBet.subBets);
    }

    public final String getBetId() {
        return this.betId;
    }

    public final long getPotWin() {
        return this.potWin;
    }

    public final int getStatus() {
        return this.status;
    }

    public final List<NetworkScheduledFootballTicketSubBet> getSubBets() {
        return this.subBets;
    }

    public int hashCode() {
        String str = this.betId;
        int iA = f87.a(gpp.a(this.status, (str == null ? 0 : str.hashCode()) * 31, 31), this.potWin, 31);
        List<NetworkScheduledFootballTicketSubBet> list = this.subBets;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.betId;
        int i = this.status;
        long j = this.potWin;
        List<NetworkScheduledFootballTicketSubBet> list = this.subBets;
        StringBuilder sbA = ml5.a(i, "NetworkScheduledFootballTicketBet(betId=", str, ", status=", ", potWin=");
        sbA.append(j);
        sbA.append(", subBets=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }
}
