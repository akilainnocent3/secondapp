package com.sportygames.commons.models;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/sportygames/commons/models/EligibilityCriteria;", "", "pointsCriteriaField", "", "pointsMultiplier", "", "minimumThreshold", "minimumStakeCriteria", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getPointsCriteriaField", "()Ljava/lang/String;", "getPointsMultiplier", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinimumThreshold", "getMinimumStakeCriteria", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportygames/commons/models/EligibilityCriteria;", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EligibilityCriteria {
    public static final int $stable = 0;
    private final Double minimumStakeCriteria;
    private final Double minimumThreshold;
    private final String pointsCriteriaField;
    private final Double pointsMultiplier;

    public EligibilityCriteria(String str, Double d, Double d2, Double d3) {
        this.pointsCriteriaField = str;
        this.pointsMultiplier = d;
        this.minimumThreshold = d2;
        this.minimumStakeCriteria = d3;
    }

    public static /* synthetic */ EligibilityCriteria copy$default(EligibilityCriteria eligibilityCriteria, String str, Double d, Double d2, Double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eligibilityCriteria.pointsCriteriaField;
        }
        if ((i & 2) != 0) {
            d = eligibilityCriteria.pointsMultiplier;
        }
        if ((i & 4) != 0) {
            d2 = eligibilityCriteria.minimumThreshold;
        }
        if ((i & 8) != 0) {
            d3 = eligibilityCriteria.minimumStakeCriteria;
        }
        return eligibilityCriteria.copy(str, d, d2, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPointsCriteriaField() {
        return this.pointsCriteriaField;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getPointsMultiplier() {
        return this.pointsMultiplier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getMinimumThreshold() {
        return this.minimumThreshold;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getMinimumStakeCriteria() {
        return this.minimumStakeCriteria;
    }

    public final EligibilityCriteria copy(String pointsCriteriaField, Double pointsMultiplier, Double minimumThreshold, Double minimumStakeCriteria) {
        return new EligibilityCriteria(pointsCriteriaField, pointsMultiplier, minimumThreshold, minimumStakeCriteria);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EligibilityCriteria)) {
            return false;
        }
        EligibilityCriteria eligibilityCriteria = (EligibilityCriteria) other;
        return Intrinsics.g(this.pointsCriteriaField, eligibilityCriteria.pointsCriteriaField) && Intrinsics.g(this.pointsMultiplier, eligibilityCriteria.pointsMultiplier) && Intrinsics.g(this.minimumThreshold, eligibilityCriteria.minimumThreshold) && Intrinsics.g(this.minimumStakeCriteria, eligibilityCriteria.minimumStakeCriteria);
    }

    public final Double getMinimumStakeCriteria() {
        return this.minimumStakeCriteria;
    }

    public final Double getMinimumThreshold() {
        return this.minimumThreshold;
    }

    public final String getPointsCriteriaField() {
        return this.pointsCriteriaField;
    }

    public final Double getPointsMultiplier() {
        return this.pointsMultiplier;
    }

    public int hashCode() {
        String str = this.pointsCriteriaField;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.pointsMultiplier;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.minimumThreshold;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.minimumStakeCriteria;
        return iHashCode3 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        return "EligibilityCriteria(pointsCriteriaField=" + this.pointsCriteriaField + ", pointsMultiplier=" + this.pointsMultiplier + ", minimumThreshold=" + this.minimumThreshold + ", minimumStakeCriteria=" + this.minimumStakeCriteria + ")";
    }
}
