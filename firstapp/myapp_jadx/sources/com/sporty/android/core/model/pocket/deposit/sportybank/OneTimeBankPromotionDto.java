package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R'\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionDto;", "", "enabled", "", "banner", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionBannerDto;", "content", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionContentDto;", "<init>", "(Ljava/lang/Boolean;Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionBannerDto;Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionContentDto;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Lcom/google/gson/annotations/SerializedName;", "value", "getBanner", "()Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionBannerDto;", "getContent", "()Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionContentDto;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionBannerDto;Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionContentDto;)Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionDto;", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneTimeBankPromotionDto {

    @SerializedName("banner")
    private final OneTimeBankPromotionBannerDto banner;

    @SerializedName("content")
    private final OneTimeBankPromotionContentDto content;

    @SerializedName("enabled")
    private final Boolean enabled;

    public /* synthetic */ OneTimeBankPromotionDto(Boolean bool, OneTimeBankPromotionBannerDto oneTimeBankPromotionBannerDto, OneTimeBankPromotionContentDto oneTimeBankPromotionContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : oneTimeBankPromotionBannerDto, (i & 4) != 0 ? null : oneTimeBankPromotionContentDto);
    }

    public static /* synthetic */ OneTimeBankPromotionDto copy$default(OneTimeBankPromotionDto oneTimeBankPromotionDto, Boolean bool, OneTimeBankPromotionBannerDto oneTimeBankPromotionBannerDto, OneTimeBankPromotionContentDto oneTimeBankPromotionContentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = oneTimeBankPromotionDto.enabled;
        }
        if ((i & 2) != 0) {
            oneTimeBankPromotionBannerDto = oneTimeBankPromotionDto.banner;
        }
        if ((i & 4) != 0) {
            oneTimeBankPromotionContentDto = oneTimeBankPromotionDto.content;
        }
        return oneTimeBankPromotionDto.copy(bool, oneTimeBankPromotionBannerDto, oneTimeBankPromotionContentDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OneTimeBankPromotionBannerDto getBanner() {
        return this.banner;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OneTimeBankPromotionContentDto getContent() {
        return this.content;
    }

    public final OneTimeBankPromotionDto copy(Boolean enabled, OneTimeBankPromotionBannerDto banner, OneTimeBankPromotionContentDto content) {
        return new OneTimeBankPromotionDto(enabled, banner, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeBankPromotionDto)) {
            return false;
        }
        OneTimeBankPromotionDto oneTimeBankPromotionDto = (OneTimeBankPromotionDto) other;
        return Intrinsics.g(this.enabled, oneTimeBankPromotionDto.enabled) && Intrinsics.g(this.banner, oneTimeBankPromotionDto.banner) && Intrinsics.g(this.content, oneTimeBankPromotionDto.content);
    }

    public final OneTimeBankPromotionBannerDto getBanner() {
        return this.banner;
    }

    public final OneTimeBankPromotionContentDto getContent() {
        return this.content;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        OneTimeBankPromotionBannerDto oneTimeBankPromotionBannerDto = this.banner;
        int iHashCode2 = (iHashCode + (oneTimeBankPromotionBannerDto == null ? 0 : oneTimeBankPromotionBannerDto.hashCode())) * 31;
        OneTimeBankPromotionContentDto oneTimeBankPromotionContentDto = this.content;
        return iHashCode2 + (oneTimeBankPromotionContentDto != null ? oneTimeBankPromotionContentDto.hashCode() : 0);
    }

    public String toString() {
        return "OneTimeBankPromotionDto(enabled=" + this.enabled + ", banner=" + this.banner + ", content=" + this.content + ")";
    }

    public OneTimeBankPromotionDto(Boolean bool, OneTimeBankPromotionBannerDto oneTimeBankPromotionBannerDto, OneTimeBankPromotionContentDto oneTimeBankPromotionContentDto) {
        this.enabled = bool;
        this.banner = oneTimeBankPromotionBannerDto;
        this.content = oneTimeBankPromotionContentDto;
    }

    public OneTimeBankPromotionDto() {
        this(null, null, null, 7, null);
    }
}
