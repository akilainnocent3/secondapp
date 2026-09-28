package com.sportybet.plugin.realsports.data;

import defpackage.fwv;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001c"}, d2 = {"Lcom/sportybet/plugin/realsports/data/ShareImageData;", "", "currency", "", "percent", "", "winnings", "", "country", "<init>", "(Ljava/lang/String;IDLjava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getPercent", "()I", "getWinnings", "()D", "getCountry", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ShareImageData {
    public static final int $stable = 0;
    private final String country;
    private final String currency;
    private final int percent;
    private final double winnings;

    public ShareImageData(String str, int i, double d, String str2) {
        str.getClass();
        str2.getClass();
        this.currency = str;
        this.percent = i;
        this.winnings = d;
        this.country = str2;
    }

    public static /* synthetic */ ShareImageData copy$default(ShareImageData shareImageData, String str, int i, double d, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shareImageData.currency;
        }
        if ((i2 & 2) != 0) {
            i = shareImageData.percent;
        }
        if ((i2 & 4) != 0) {
            d = shareImageData.winnings;
        }
        if ((i2 & 8) != 0) {
            str2 = shareImageData.country;
        }
        String str3 = str2;
        return shareImageData.copy(str, i, d, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPercent() {
        return this.percent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getWinnings() {
        return this.winnings;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final ShareImageData copy(String currency, int percent, double winnings, String country) {
        currency.getClass();
        country.getClass();
        return new ShareImageData(currency, percent, winnings, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareImageData)) {
            return false;
        }
        ShareImageData shareImageData = (ShareImageData) other;
        return Intrinsics.g(this.currency, shareImageData.currency) && this.percent == shareImageData.percent && Double.compare(this.winnings, shareImageData.winnings) == 0 && Intrinsics.g(this.country, shareImageData.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final double getWinnings() {
        return this.winnings;
    }

    public int hashCode() {
        return this.country.hashCode() + nrg0.a(gpp.a(this.percent, this.currency.hashCode() * 31, 31), 31, this.winnings);
    }

    public String toString() {
        String str = this.currency;
        int i = this.percent;
        double d = this.winnings;
        String str2 = this.country;
        StringBuilder sbA = ml5.a(i, "ShareImageData(currency=", str, ", percent=", ", winnings=");
        fwv.a(d, ", country=", str2, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
