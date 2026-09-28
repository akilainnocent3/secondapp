package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.itf0;
import defpackage.nrg0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010$\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J]\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0014\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u00020\bHÖ\u0081\u0004J\n\u00103\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bÊ\u0001\f\b5\u0012\b\b6\u0012\u0004\b\u0003\u0010\u0000¨\u00064"}, d2 = {"Lcom/sportybet/plugin/realsports/data/SocketOutcomeMessage;", "", AnalyticsParam.EVENT_PARAM_ID, "", "odds", "probability", "", "isActive", "", "desc", AnalyticsParam.EVENT_STATUS, "flag", "oddsChangesFlag", "<init>", "(Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;III)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getOdds", "setOdds", "getProbability", "()D", "setProbability", "(D)V", "()I", "setActive", "(I)V", "getDesc", "setDesc", "getStatus", "setStatus", "getFlag", "setFlag", "getOddsChangesFlag", "setOddsChangesFlag", "create", "s", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocketOutcomeMessage {
    public static final int $stable = 8;
    private String desc;
    private int flag;
    private String id;
    private int isActive;
    private String odds;
    private int oddsChangesFlag;
    private double probability;
    private int status;

    public /* synthetic */ SocketOutcomeMessage(String str, String str2, double d, int i, String str3, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? 0.0d : d, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? null : str3, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0 : i4);
    }

    public static /* synthetic */ SocketOutcomeMessage copy$default(SocketOutcomeMessage socketOutcomeMessage, String str, String str2, double d, int i, String str3, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = socketOutcomeMessage.id;
        }
        if ((i5 & 2) != 0) {
            str2 = socketOutcomeMessage.odds;
        }
        if ((i5 & 4) != 0) {
            d = socketOutcomeMessage.probability;
        }
        if ((i5 & 8) != 0) {
            i = socketOutcomeMessage.isActive;
        }
        if ((i5 & 16) != 0) {
            str3 = socketOutcomeMessage.desc;
        }
        if ((i5 & 32) != 0) {
            i2 = socketOutcomeMessage.status;
        }
        if ((i5 & 64) != 0) {
            i3 = socketOutcomeMessage.flag;
        }
        if ((i5 & 128) != 0) {
            i4 = socketOutcomeMessage.oddsChangesFlag;
        }
        int i6 = i4;
        int i7 = i2;
        int i8 = i;
        double d2 = d;
        return socketOutcomeMessage.copy(str, str2, d2, i8, str3, i7, i3, i6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOddsChangesFlag() {
        return this.oddsChangesFlag;
    }

    public final SocketOutcomeMessage copy(String id, String odds, double probability, int isActive, String desc, int status, int flag, int oddsChangesFlag) {
        odds.getClass();
        return new SocketOutcomeMessage(id, odds, probability, isActive, desc, status, flag, oddsChangesFlag);
    }

    public final SocketOutcomeMessage create(String s) {
        SocketOutcomeMessage socketOutcomeMessage = new SocketOutcomeMessage(null, null, 0.0d, 0, null, 0, 0, 0, 255, null);
        if (s != null) {
            try {
                List listSplit$default = StringsKt__StringsKt.split$default(s, new String[]{"#"}, false, 0, 6, null);
                socketOutcomeMessage.id = (String) listSplit$default.get(0);
                socketOutcomeMessage.desc = (String) listSplit$default.get(1);
                socketOutcomeMessage.odds = (String) listSplit$default.get(2);
                socketOutcomeMessage.isActive = Integer.parseInt((String) listSplit$default.get(3));
                if (listSplit$default.size() > 6 && Double.parseDouble((String) listSplit$default.get(6)) > 1.0E-4d) {
                    socketOutcomeMessage.probability = Double.parseDouble((String) listSplit$default.get(6));
                    return socketOutcomeMessage;
                }
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.p(e, "Failed to update outcome", new Object[0]);
                return socketOutcomeMessage;
            }
        }
        return socketOutcomeMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocketOutcomeMessage)) {
            return false;
        }
        SocketOutcomeMessage socketOutcomeMessage = (SocketOutcomeMessage) other;
        return Intrinsics.g(this.id, socketOutcomeMessage.id) && Intrinsics.g(this.odds, socketOutcomeMessage.odds) && Double.compare(this.probability, socketOutcomeMessage.probability) == 0 && this.isActive == socketOutcomeMessage.isActive && Intrinsics.g(this.desc, socketOutcomeMessage.desc) && this.status == socketOutcomeMessage.status && this.flag == socketOutcomeMessage.flag && this.oddsChangesFlag == socketOutcomeMessage.oddsChangesFlag;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final int getOddsChangesFlag() {
        return this.oddsChangesFlag;
    }

    public final double getProbability() {
        return this.probability;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.id;
        int iA = gpp.a(this.isActive, nrg0.a(gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.odds), 31, this.probability), 31);
        String str2 = this.desc;
        return Integer.hashCode(this.oddsChangesFlag) + gpp.a(this.flag, gpp.a(this.status, (iA + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31);
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i) {
        this.isActive = i;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setFlag(int i) {
        this.flag = i;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setOdds(String str) {
        str.getClass();
        this.odds = str;
    }

    public final void setOddsChangesFlag(int i) {
        this.oddsChangesFlag = i;
    }

    public final void setProbability(double d) {
        this.probability = d;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.odds;
        double d = this.probability;
        int i = this.isActive;
        String str3 = this.desc;
        int i2 = this.status;
        int i3 = this.flag;
        int i4 = this.oddsChangesFlag;
        StringBuilder sbA = ux5.a("SocketOutcomeMessage(id=", str, ", odds=", str2, ", probability=");
        sbA.append(d);
        sbA.append(", isActive=");
        sbA.append(i);
        sbA.append(", desc=");
        sbA.append(str3);
        sbA.append(", status=");
        sbA.append(i2);
        sbA.append(", flag=");
        sbA.append(i3);
        sbA.append(", oddsChangesFlag=");
        sbA.append(i4);
        sbA.append(")");
        return sbA.toString();
    }

    public SocketOutcomeMessage(String str, String str2, double d, int i, String str3, int i2, int i3, int i4) {
        str2.getClass();
        this.id = str;
        this.odds = str2;
        this.probability = d;
        this.isActive = i;
        this.desc = str3;
        this.status = i2;
        this.flag = i3;
        this.oddsChangesFlag = i4;
    }

    public SocketOutcomeMessage() {
        this(null, null, 0.0d, 0, null, 0, 0, 0, 255, null);
    }
}
