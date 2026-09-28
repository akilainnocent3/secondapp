package com.sporty.android.core.model.account.telegram;

import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003JH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/sporty/android/core/model/account/telegram/TelegramBindingPreCheckResponse;", "", "actionType", "", "reachThreshold", "", "waitTimeInDays", "allowToBind", "suspendedUntil", "", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getActionType", "()I", "getReachThreshold", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWaitTimeInDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAllowToBind", "getSuspendedUntil", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sporty/android/core/model/account/telegram/TelegramBindingPreCheckResponse;", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TelegramBindingPreCheckResponse {
    private final int actionType;
    private final Boolean allowToBind;
    private final Boolean reachThreshold;
    private final String suspendedUntil;
    private final Integer waitTimeInDays;

    public /* synthetic */ TelegramBindingPreCheckResponse(int i, Boolean bool, Integer num, Boolean bool2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TelegramBindingActionType.Bind.getValue() : i, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : str);
    }

    public static /* synthetic */ TelegramBindingPreCheckResponse copy$default(TelegramBindingPreCheckResponse telegramBindingPreCheckResponse, int i, Boolean bool, Integer num, Boolean bool2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = telegramBindingPreCheckResponse.actionType;
        }
        if ((i2 & 2) != 0) {
            bool = telegramBindingPreCheckResponse.reachThreshold;
        }
        if ((i2 & 4) != 0) {
            num = telegramBindingPreCheckResponse.waitTimeInDays;
        }
        if ((i2 & 8) != 0) {
            bool2 = telegramBindingPreCheckResponse.allowToBind;
        }
        if ((i2 & 16) != 0) {
            str = telegramBindingPreCheckResponse.suspendedUntil;
        }
        String str2 = str;
        Integer num2 = num;
        return telegramBindingPreCheckResponse.copy(i, bool, num2, bool2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActionType() {
        return this.actionType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getReachThreshold() {
        return this.reachThreshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getWaitTimeInDays() {
        return this.waitTimeInDays;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getAllowToBind() {
        return this.allowToBind;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuspendedUntil() {
        return this.suspendedUntil;
    }

    public final TelegramBindingPreCheckResponse copy(int actionType, Boolean reachThreshold, Integer waitTimeInDays, Boolean allowToBind, String suspendedUntil) {
        return new TelegramBindingPreCheckResponse(actionType, reachThreshold, waitTimeInDays, allowToBind, suspendedUntil);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelegramBindingPreCheckResponse)) {
            return false;
        }
        TelegramBindingPreCheckResponse telegramBindingPreCheckResponse = (TelegramBindingPreCheckResponse) other;
        return this.actionType == telegramBindingPreCheckResponse.actionType && Intrinsics.g(this.reachThreshold, telegramBindingPreCheckResponse.reachThreshold) && Intrinsics.g(this.waitTimeInDays, telegramBindingPreCheckResponse.waitTimeInDays) && Intrinsics.g(this.allowToBind, telegramBindingPreCheckResponse.allowToBind) && Intrinsics.g(this.suspendedUntil, telegramBindingPreCheckResponse.suspendedUntil);
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final Boolean getAllowToBind() {
        return this.allowToBind;
    }

    public final Boolean getReachThreshold() {
        return this.reachThreshold;
    }

    public final String getSuspendedUntil() {
        return this.suspendedUntil;
    }

    public final Integer getWaitTimeInDays() {
        return this.waitTimeInDays;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.actionType) * 31;
        Boolean bool = this.reachThreshold;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.waitTimeInDays;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.allowToBind;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.suspendedUntil;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = this.actionType;
        Boolean bool = this.reachThreshold;
        Integer num = this.waitTimeInDays;
        Boolean bool2 = this.allowToBind;
        String str = this.suspendedUntil;
        StringBuilder sb = new StringBuilder("TelegramBindingPreCheckResponse(actionType=");
        sb.append(i);
        sb.append(", reachThreshold=");
        sb.append(bool);
        sb.append(", waitTimeInDays=");
        sb.append(num);
        sb.append(", allowToBind=");
        sb.append(bool2);
        sb.append(", suspendedUntil=");
        return uf80.a(sb, str, ")");
    }

    public TelegramBindingPreCheckResponse(int i, Boolean bool, Integer num, Boolean bool2, String str) {
        this.actionType = i;
        this.reachThreshold = bool;
        this.waitTimeInDays = num;
        this.allowToBind = bool2;
        this.suspendedUntil = str;
    }

    public TelegramBindingPreCheckResponse() {
        this(0, null, null, null, null, 31, null);
    }
}
