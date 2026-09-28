package com.sportygames.spin2win.model.local;

import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mq0;
import defpackage.qn4;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/sportygames/spin2win/model/local/BetList;", "", "bgColor", "", "betAmount", "winAmount", "tileText", "betTypeId", "betStatus", "isFbgApplied", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBgColor", "()Ljava/lang/String;", "setBgColor", "(Ljava/lang/String;)V", "getBetAmount", "setBetAmount", "getWinAmount", "setWinAmount", "getTileText", "setTileText", "getBetTypeId", "setBetTypeId", "getBetStatus", "setBetStatus", "()Z", "setFbgApplied", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetList {
    public static final int $stable = 8;
    private String betAmount;
    private String betStatus;
    private String betTypeId;
    private String bgColor;
    private boolean isFbgApplied;
    private String tileText;
    private String winAmount;

    public BetList(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        this.bgColor = str;
        this.betAmount = str2;
        this.winAmount = str3;
        this.tileText = str4;
        this.betTypeId = str5;
        this.betStatus = str6;
        this.isFbgApplied = z;
    }

    public static /* synthetic */ BetList copy$default(BetList betList, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betList.bgColor;
        }
        if ((i & 2) != 0) {
            str2 = betList.betAmount;
        }
        if ((i & 4) != 0) {
            str3 = betList.winAmount;
        }
        if ((i & 8) != 0) {
            str4 = betList.tileText;
        }
        if ((i & 16) != 0) {
            str5 = betList.betTypeId;
        }
        if ((i & 32) != 0) {
            str6 = betList.betStatus;
        }
        if ((i & 64) != 0) {
            z = betList.isFbgApplied;
        }
        String str7 = str6;
        boolean z2 = z;
        String str8 = str5;
        String str9 = str3;
        return betList.copy(str, str2, str9, str4, str8, str7, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWinAmount() {
        return this.winAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTileText() {
        return this.tileText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBetTypeId() {
        return this.betTypeId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBetStatus() {
        return this.betStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsFbgApplied() {
        return this.isFbgApplied;
    }

    public final BetList copy(String bgColor, String betAmount, String winAmount, String tileText, String betTypeId, String betStatus, boolean isFbgApplied) {
        qn4.b(bgColor, betAmount, winAmount, tileText, betTypeId);
        betStatus.getClass();
        return new BetList(bgColor, betAmount, winAmount, tileText, betTypeId, betStatus, isFbgApplied);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetList)) {
            return false;
        }
        BetList betList = (BetList) other;
        return Intrinsics.g(this.bgColor, betList.bgColor) && Intrinsics.g(this.betAmount, betList.betAmount) && Intrinsics.g(this.winAmount, betList.winAmount) && Intrinsics.g(this.tileText, betList.tileText) && Intrinsics.g(this.betTypeId, betList.betTypeId) && Intrinsics.g(this.betStatus, betList.betStatus) && this.isFbgApplied == betList.isFbgApplied;
    }

    public final String getBetAmount() {
        return this.betAmount;
    }

    public final String getBetStatus() {
        return this.betStatus;
    }

    public final String getBetTypeId() {
        return this.betTypeId;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getTileText() {
        return this.tileText;
    }

    public final String getWinAmount() {
        return this.winAmount;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFbgApplied) + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.bgColor.hashCode() * 31, 31, this.betAmount), 31, this.winAmount), 31, this.tileText), 31, this.betTypeId), 31, this.betStatus);
    }

    public final boolean isFbgApplied() {
        return this.isFbgApplied;
    }

    public final void setBetAmount(String str) {
        str.getClass();
        this.betAmount = str;
    }

    public final void setBetStatus(String str) {
        str.getClass();
        this.betStatus = str;
    }

    public final void setBetTypeId(String str) {
        str.getClass();
        this.betTypeId = str;
    }

    public final void setBgColor(String str) {
        str.getClass();
        this.bgColor = str;
    }

    public final void setFbgApplied(boolean z) {
        this.isFbgApplied = z;
    }

    public final void setTileText(String str) {
        str.getClass();
        this.tileText = str;
    }

    public final void setWinAmount(String str) {
        str.getClass();
        this.winAmount = str;
    }

    public String toString() {
        String str = this.bgColor;
        String str2 = this.betAmount;
        String str3 = this.winAmount;
        String str4 = this.tileText;
        String str5 = this.betTypeId;
        String str6 = this.betStatus;
        boolean z = this.isFbgApplied;
        StringBuilder sbA = ux5.a("BetList(bgColor=", str, ", betAmount=", str2, ", winAmount=");
        hxa.c(sbA, str3, ", tileText=", str4, ", betTypeId=");
        hxa.c(sbA, str5, ", betStatus=", str6, ", isFbgApplied=");
        return mq0.a(sbA, z, ")");
    }
}
