package com.sporty.android.core.model.loyalty;

import defpackage.gmf0;
import defpackage.kya0;
import defpackage.t160;
import defpackage.uf80;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003Je\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006'"}, d2 = {"Lcom/sporty/android/core/model/loyalty/RewardShowOffConfig;", "", "enable", "", "currency", "", "minAmount", "Ljava/math/BigDecimal;", "platformList", "", "text", "hashtagList", "url", "<init>", "(ZLjava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getEnable", "()Z", "getCurrency", "()Ljava/lang/String;", "getMinAmount", "()Ljava/math/BigDecimal;", "getPlatformList", "()Ljava/util/List;", "getText", "getHashtagList", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RewardShowOffConfig {
    private final String currency;
    private final boolean enable;
    private final List<String> hashtagList;
    private final BigDecimal minAmount;
    private final List<String> platformList;
    private final String text;
    private final String url;

    public RewardShowOffConfig(boolean z, String str, BigDecimal bigDecimal, List<String> list, String str2, List<String> list2, String str3) {
        str.getClass();
        this.enable = z;
        this.currency = str;
        this.minAmount = bigDecimal;
        this.platformList = list;
        this.text = str2;
        this.hashtagList = list2;
        this.url = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RewardShowOffConfig copy$default(RewardShowOffConfig rewardShowOffConfig, boolean z, String str, BigDecimal bigDecimal, List list, String str2, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rewardShowOffConfig.enable;
        }
        if ((i & 2) != 0) {
            str = rewardShowOffConfig.currency;
        }
        if ((i & 4) != 0) {
            bigDecimal = rewardShowOffConfig.minAmount;
        }
        if ((i & 8) != 0) {
            list = rewardShowOffConfig.platformList;
        }
        if ((i & 16) != 0) {
            str2 = rewardShowOffConfig.text;
        }
        if ((i & 32) != 0) {
            list2 = rewardShowOffConfig.hashtagList;
        }
        if ((i & 64) != 0) {
            str3 = rewardShowOffConfig.url;
        }
        List list3 = list2;
        String str4 = str3;
        String str5 = str2;
        BigDecimal bigDecimal2 = bigDecimal;
        return rewardShowOffConfig.copy(z, str, bigDecimal2, list, str5, list3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public final List<String> component4() {
        return this.platformList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<String> component6() {
        return this.hashtagList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final RewardShowOffConfig copy(boolean enable, String currency, BigDecimal minAmount, List<String> platformList, String text, List<String> hashtagList, String url) {
        currency.getClass();
        return new RewardShowOffConfig(enable, currency, minAmount, platformList, text, hashtagList, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardShowOffConfig)) {
            return false;
        }
        RewardShowOffConfig rewardShowOffConfig = (RewardShowOffConfig) other;
        return this.enable == rewardShowOffConfig.enable && Intrinsics.g(this.currency, rewardShowOffConfig.currency) && Intrinsics.g(this.minAmount, rewardShowOffConfig.minAmount) && Intrinsics.g(this.platformList, rewardShowOffConfig.platformList) && Intrinsics.g(this.text, rewardShowOffConfig.text) && Intrinsics.g(this.hashtagList, rewardShowOffConfig.hashtagList) && Intrinsics.g(this.url, rewardShowOffConfig.url);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final List<String> getHashtagList() {
        return this.hashtagList;
    }

    public final BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public final List<String> getPlatformList() {
        return this.platformList;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iA = gmf0.a(Boolean.hashCode(this.enable) * 31, 31, this.currency);
        BigDecimal bigDecimal = this.minAmount;
        int iHashCode = (iA + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        List<String> list = this.platformList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list2 = this.hashtagList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.url;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enable;
        String str = this.currency;
        BigDecimal bigDecimal = this.minAmount;
        List<String> list = this.platformList;
        String str2 = this.text;
        List<String> list2 = this.hashtagList;
        String str3 = this.url;
        StringBuilder sbA = t160.a("RewardShowOffConfig(enable=", ", currency=", str, ", minAmount=", z);
        sbA.append(bigDecimal);
        sbA.append(", platformList=");
        sbA.append(list);
        sbA.append(", text=");
        kya0.b(str2, ", hashtagList=", ", url=", sbA, list2);
        return uf80.a(sbA, str3, ")");
    }
}
