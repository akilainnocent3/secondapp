package com.sportybet.feature.luckynumber.placebet.data.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\nHÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\u0002\b$Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0002¨\u0006#"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNDrawLotteryDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "categoryIsoCode", "gameType", "bonusRange", "bonusBallDrumType", "bonusBallNumber", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getName", "getCategoryIsoCode", "getGameType", "getBonusRange", "getBonusBallDrumType", "getBonusBallNumber", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNDrawLotteryDTO {
    public static final int $stable = 0;
    private final String bonusBallDrumType;
    private final int bonusBallNumber;
    private final String bonusRange;
    private final String categoryIsoCode;
    private final String gameType;
    private final String id;
    private final String name;

    public LNDrawLotteryDTO(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        this.id = str;
        this.name = str2;
        this.categoryIsoCode = str3;
        this.gameType = str4;
        this.bonusRange = str5;
        this.bonusBallDrumType = str6;
        this.bonusBallNumber = i;
    }

    public static /* synthetic */ LNDrawLotteryDTO copy$default(LNDrawLotteryDTO lNDrawLotteryDTO, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lNDrawLotteryDTO.id;
        }
        if ((i2 & 2) != 0) {
            str2 = lNDrawLotteryDTO.name;
        }
        if ((i2 & 4) != 0) {
            str3 = lNDrawLotteryDTO.categoryIsoCode;
        }
        if ((i2 & 8) != 0) {
            str4 = lNDrawLotteryDTO.gameType;
        }
        if ((i2 & 16) != 0) {
            str5 = lNDrawLotteryDTO.bonusRange;
        }
        if ((i2 & 32) != 0) {
            str6 = lNDrawLotteryDTO.bonusBallDrumType;
        }
        if ((i2 & 64) != 0) {
            i = lNDrawLotteryDTO.bonusBallNumber;
        }
        String str7 = str6;
        int i3 = i;
        String str8 = str5;
        String str9 = str3;
        return lNDrawLotteryDTO.copy(str, str2, str9, str4, str8, str7, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategoryIsoCode() {
        return this.categoryIsoCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGameType() {
        return this.gameType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBonusRange() {
        return this.bonusRange;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBonusBallDrumType() {
        return this.bonusBallDrumType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBonusBallNumber() {
        return this.bonusBallNumber;
    }

    public final LNDrawLotteryDTO copy(String id, String name, String categoryIsoCode, String gameType, String bonusRange, String bonusBallDrumType, int bonusBallNumber) {
        qn4.b(id, name, categoryIsoCode, gameType, bonusRange);
        bonusBallDrumType.getClass();
        return new LNDrawLotteryDTO(id, name, categoryIsoCode, gameType, bonusRange, bonusBallDrumType, bonusBallNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNDrawLotteryDTO)) {
            return false;
        }
        LNDrawLotteryDTO lNDrawLotteryDTO = (LNDrawLotteryDTO) other;
        return Intrinsics.g(this.id, lNDrawLotteryDTO.id) && Intrinsics.g(this.name, lNDrawLotteryDTO.name) && Intrinsics.g(this.categoryIsoCode, lNDrawLotteryDTO.categoryIsoCode) && Intrinsics.g(this.gameType, lNDrawLotteryDTO.gameType) && Intrinsics.g(this.bonusRange, lNDrawLotteryDTO.bonusRange) && Intrinsics.g(this.bonusBallDrumType, lNDrawLotteryDTO.bonusBallDrumType) && this.bonusBallNumber == lNDrawLotteryDTO.bonusBallNumber;
    }

    public final String getBonusBallDrumType() {
        return this.bonusBallDrumType;
    }

    public final int getBonusBallNumber() {
        return this.bonusBallNumber;
    }

    public final String getBonusRange() {
        return this.bonusRange;
    }

    public final String getCategoryIsoCode() {
        return this.categoryIsoCode;
    }

    public final String getGameType() {
        return this.gameType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Integer.hashCode(this.bonusBallNumber) + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.id.hashCode() * 31, 31, this.name), 31, this.categoryIsoCode), 31, this.gameType), 31, this.bonusRange), 31, this.bonusBallDrumType);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.categoryIsoCode;
        String str4 = this.gameType;
        String str5 = this.bonusRange;
        String str6 = this.bonusBallDrumType;
        int i = this.bonusBallNumber;
        StringBuilder sbA = ux5.a("LNDrawLotteryDTO(id=", str, ", name=", str2, ", categoryIsoCode=");
        hxa.c(sbA, str3, ", gameType=", str4, ", bonusRange=");
        hxa.c(sbA, str5, ", bonusBallDrumType=", str6, ", bonusBallNumber=");
        return zk1.a(i, ")", sbA);
    }
}
