package com.sportygames.multilevel.common.model;

import com.google.gson.annotations.SerializedName;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.nrg0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, d2 = {"Lcom/sportygames/multilevel/common/model/LevelConfigDetailDto;", "", "level", "", "normalRounds", "bonusRounds", "bonusPercentage", "", "fbgCount", "fbgValue", "<init>", "(IIIDID)V", "getLevel", "()I", "getNormalRounds", "getBonusRounds", "getBonusPercentage", "()D", "getFbgCount", "getFbgValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LevelConfigDetailDto {
    public static final int $stable = 0;

    @SerializedName("bonusPercentage")
    private final double bonusPercentage;

    @SerializedName("bonusRounds")
    private final int bonusRounds;

    @SerializedName("fbgCount")
    private final int fbgCount;

    @SerializedName("fbgValue")
    private final double fbgValue;

    @SerializedName("level")
    private final int level;

    @SerializedName("normalRounds")
    private final int normalRounds;

    public LevelConfigDetailDto(int i, int i2, int i3, double d, int i4, double d2) {
        this.level = i;
        this.normalRounds = i2;
        this.bonusRounds = i3;
        this.bonusPercentage = d;
        this.fbgCount = i4;
        this.fbgValue = d2;
    }

    public static /* synthetic */ LevelConfigDetailDto copy$default(LevelConfigDetailDto levelConfigDetailDto, int i, int i2, int i3, double d, int i4, double d2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = levelConfigDetailDto.level;
        }
        if ((i5 & 2) != 0) {
            i2 = levelConfigDetailDto.normalRounds;
        }
        if ((i5 & 4) != 0) {
            i3 = levelConfigDetailDto.bonusRounds;
        }
        if ((i5 & 8) != 0) {
            d = levelConfigDetailDto.bonusPercentage;
        }
        if ((i5 & 16) != 0) {
            i4 = levelConfigDetailDto.fbgCount;
        }
        if ((i5 & 32) != 0) {
            d2 = levelConfigDetailDto.fbgValue;
        }
        int i6 = i4;
        double d3 = d;
        int i7 = i3;
        return levelConfigDetailDto.copy(i, i2, i7, d3, i6, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNormalRounds() {
        return this.normalRounds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBonusRounds() {
        return this.bonusRounds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getBonusPercentage() {
        return this.bonusPercentage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFbgCount() {
        return this.fbgCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getFbgValue() {
        return this.fbgValue;
    }

    public final LevelConfigDetailDto copy(int level, int normalRounds, int bonusRounds, double bonusPercentage, int fbgCount, double fbgValue) {
        return new LevelConfigDetailDto(level, normalRounds, bonusRounds, bonusPercentage, fbgCount, fbgValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LevelConfigDetailDto)) {
            return false;
        }
        LevelConfigDetailDto levelConfigDetailDto = (LevelConfigDetailDto) other;
        return this.level == levelConfigDetailDto.level && this.normalRounds == levelConfigDetailDto.normalRounds && this.bonusRounds == levelConfigDetailDto.bonusRounds && Double.compare(this.bonusPercentage, levelConfigDetailDto.bonusPercentage) == 0 && this.fbgCount == levelConfigDetailDto.fbgCount && Double.compare(this.fbgValue, levelConfigDetailDto.fbgValue) == 0;
    }

    public final double getBonusPercentage() {
        return this.bonusPercentage;
    }

    public final int getBonusRounds() {
        return this.bonusRounds;
    }

    public final int getFbgCount() {
        return this.fbgCount;
    }

    public final double getFbgValue() {
        return this.fbgValue;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getNormalRounds() {
        return this.normalRounds;
    }

    public int hashCode() {
        return Double.hashCode(this.fbgValue) + gpp.a(this.fbgCount, nrg0.a(gpp.a(this.bonusRounds, gpp.a(this.normalRounds, Integer.hashCode(this.level) * 31, 31), 31), 31, this.bonusPercentage), 31);
    }

    public String toString() {
        int i = this.level;
        int i2 = this.normalRounds;
        int i3 = this.bonusRounds;
        double d = this.bonusPercentage;
        int i4 = this.fbgCount;
        double d2 = this.fbgValue;
        StringBuilder sbA = dy5.a("LevelConfigDetailDto(level=", i, i2, ", normalRounds=", ", bonusRounds=");
        sbA.append(i3);
        sbA.append(", bonusPercentage=");
        sbA.append(d);
        sbA.append(", fbgCount=");
        sbA.append(i4);
        sbA.append(", fbgValue=");
        sbA.append(d2);
        sbA.append(")");
        return sbA.toString();
    }
}
