package com.sportygames.vip.data;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.org0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/sportygames/vip/data/LastHeroStandingWinner;", "", "avatar", "", "nickName", "currency", "fbgAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getAvatar", "()Ljava/lang/String;", "getNickName", "getCurrency", "getFbgAmount", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LastHeroStandingWinner {
    public static final int $stable = 0;
    private final String avatar;
    private final String currency;
    private final double fbgAmount;
    private final String nickName;

    public LastHeroStandingWinner(String str, String str2, String str3, double d) {
        m.a(str, str2, str3);
        this.avatar = str;
        this.nickName = str2;
        this.currency = str3;
        this.fbgAmount = d;
    }

    public static /* synthetic */ LastHeroStandingWinner copy$default(LastHeroStandingWinner lastHeroStandingWinner, String str, String str2, String str3, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lastHeroStandingWinner.avatar;
        }
        if ((i & 2) != 0) {
            str2 = lastHeroStandingWinner.nickName;
        }
        if ((i & 4) != 0) {
            str3 = lastHeroStandingWinner.currency;
        }
        if ((i & 8) != 0) {
            d = lastHeroStandingWinner.fbgAmount;
        }
        String str4 = str3;
        return lastHeroStandingWinner.copy(str, str2, str4, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getFbgAmount() {
        return this.fbgAmount;
    }

    public final LastHeroStandingWinner copy(String avatar, String nickName, String currency, double fbgAmount) {
        avatar.getClass();
        nickName.getClass();
        currency.getClass();
        return new LastHeroStandingWinner(avatar, nickName, currency, fbgAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastHeroStandingWinner)) {
            return false;
        }
        LastHeroStandingWinner lastHeroStandingWinner = (LastHeroStandingWinner) other;
        return Intrinsics.g(this.avatar, lastHeroStandingWinner.avatar) && Intrinsics.g(this.nickName, lastHeroStandingWinner.nickName) && Intrinsics.g(this.currency, lastHeroStandingWinner.currency) && Double.compare(this.fbgAmount, lastHeroStandingWinner.fbgAmount) == 0;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getFbgAmount() {
        return this.fbgAmount;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public int hashCode() {
        return Double.hashCode(this.fbgAmount) + gmf0.a(gmf0.a(this.avatar.hashCode() * 31, 31, this.nickName), 31, this.currency);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LastHeroStandingWinner(avatar=");
        sb.append(this.avatar);
        sb.append(", nickName=");
        sb.append(this.nickName);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", fbgAmount=");
        return org0.a(sb, this.fbgAmount, ')');
    }
}
