package com.sportygames.vip.data;

import com.twilio.voice.EventKeys;
import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sportygames/vip/data/LastHeroStandingWinnerSocketResponse;", "", "giftAmount", "", EventKeys.ERROR_MESSAGE, "", "<init>", "(DLjava/lang/String;)V", "getGiftAmount", "()D", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LastHeroStandingWinnerSocketResponse {
    public static final int $stable = 0;
    private final double giftAmount;
    private final String message;

    public LastHeroStandingWinnerSocketResponse(double d, String str) {
        str.getClass();
        this.giftAmount = d;
        this.message = str;
    }

    public static /* synthetic */ LastHeroStandingWinnerSocketResponse copy$default(LastHeroStandingWinnerSocketResponse lastHeroStandingWinnerSocketResponse, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = lastHeroStandingWinnerSocketResponse.giftAmount;
        }
        if ((i & 2) != 0) {
            str = lastHeroStandingWinnerSocketResponse.message;
        }
        return lastHeroStandingWinnerSocketResponse.copy(d, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final LastHeroStandingWinnerSocketResponse copy(double giftAmount, String message) {
        message.getClass();
        return new LastHeroStandingWinnerSocketResponse(giftAmount, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastHeroStandingWinnerSocketResponse)) {
            return false;
        }
        LastHeroStandingWinnerSocketResponse lastHeroStandingWinnerSocketResponse = (LastHeroStandingWinnerSocketResponse) other;
        return Double.compare(this.giftAmount, lastHeroStandingWinnerSocketResponse.giftAmount) == 0 && Intrinsics.g(this.message, lastHeroStandingWinnerSocketResponse.message);
    }

    public final double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (Double.hashCode(this.giftAmount) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LastHeroStandingWinnerSocketResponse(giftAmount=");
        sb.append(this.giftAmount);
        sb.append(", message=");
        return j26.a(sb, this.message, ')');
    }
}
