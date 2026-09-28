package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPageContentDto;", "", "promotion", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionDto;", "howToDeposit", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankHowToDepositDto;", "<init>", "(Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionDto;Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankHowToDepositDto;)V", "getPromotion", "()Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankPromotionDto;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHowToDeposit", "()Lcom/sporty/android/core/model/pocket/deposit/sportybank/OneTimeBankHowToDepositDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneTimeBankPageContentDto {

    @SerializedName("howToDeposit")
    private final OneTimeBankHowToDepositDto howToDeposit;

    @SerializedName("promotion")
    private final OneTimeBankPromotionDto promotion;

    public /* synthetic */ OneTimeBankPageContentDto(OneTimeBankPromotionDto oneTimeBankPromotionDto, OneTimeBankHowToDepositDto oneTimeBankHowToDepositDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneTimeBankPromotionDto, (i & 2) != 0 ? null : oneTimeBankHowToDepositDto);
    }

    public static /* synthetic */ OneTimeBankPageContentDto copy$default(OneTimeBankPageContentDto oneTimeBankPageContentDto, OneTimeBankPromotionDto oneTimeBankPromotionDto, OneTimeBankHowToDepositDto oneTimeBankHowToDepositDto, int i, Object obj) {
        if ((i & 1) != 0) {
            oneTimeBankPromotionDto = oneTimeBankPageContentDto.promotion;
        }
        if ((i & 2) != 0) {
            oneTimeBankHowToDepositDto = oneTimeBankPageContentDto.howToDeposit;
        }
        return oneTimeBankPageContentDto.copy(oneTimeBankPromotionDto, oneTimeBankHowToDepositDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OneTimeBankPromotionDto getPromotion() {
        return this.promotion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OneTimeBankHowToDepositDto getHowToDeposit() {
        return this.howToDeposit;
    }

    public final OneTimeBankPageContentDto copy(OneTimeBankPromotionDto promotion, OneTimeBankHowToDepositDto howToDeposit) {
        return new OneTimeBankPageContentDto(promotion, howToDeposit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeBankPageContentDto)) {
            return false;
        }
        OneTimeBankPageContentDto oneTimeBankPageContentDto = (OneTimeBankPageContentDto) other;
        return Intrinsics.g(this.promotion, oneTimeBankPageContentDto.promotion) && Intrinsics.g(this.howToDeposit, oneTimeBankPageContentDto.howToDeposit);
    }

    public final OneTimeBankHowToDepositDto getHowToDeposit() {
        return this.howToDeposit;
    }

    public final OneTimeBankPromotionDto getPromotion() {
        return this.promotion;
    }

    public int hashCode() {
        OneTimeBankPromotionDto oneTimeBankPromotionDto = this.promotion;
        int iHashCode = (oneTimeBankPromotionDto == null ? 0 : oneTimeBankPromotionDto.hashCode()) * 31;
        OneTimeBankHowToDepositDto oneTimeBankHowToDepositDto = this.howToDeposit;
        return iHashCode + (oneTimeBankHowToDepositDto != null ? oneTimeBankHowToDepositDto.hashCode() : 0);
    }

    public String toString() {
        return "OneTimeBankPageContentDto(promotion=" + this.promotion + ", howToDeposit=" + this.howToDeposit + ")";
    }

    public OneTimeBankPageContentDto(OneTimeBankPromotionDto oneTimeBankPromotionDto, OneTimeBankHowToDepositDto oneTimeBankHowToDepositDto) {
        this.promotion = oneTimeBankPromotionDto;
        this.howToDeposit = oneTimeBankHowToDepositDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OneTimeBankPageContentDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
