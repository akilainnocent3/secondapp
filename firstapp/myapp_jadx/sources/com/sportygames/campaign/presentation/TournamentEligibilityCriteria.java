package com.sportygames.campaign.presentation;

import defpackage.itu;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/sportygames/campaign/presentation/TournamentEligibilityCriteria;", "", "pointsCriteriaField", "", "minimumThreshold", "", "minimumStakeCriteria", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getPointsCriteriaField", "()Ljava/lang/String;", "getMinimumThreshold", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinimumStakeCriteria", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportygames/campaign/presentation/TournamentEligibilityCriteria;", "equals", "", "other", "hashCode", "", "toString", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentEligibilityCriteria {
    public static final int $stable = 0;
    private final Double minimumStakeCriteria;
    private final Double minimumThreshold;
    private final String pointsCriteriaField;

    public TournamentEligibilityCriteria(String str, Double d, Double d2) {
        this.pointsCriteriaField = str;
        this.minimumThreshold = d;
        this.minimumStakeCriteria = d2;
    }

    public static /* synthetic */ TournamentEligibilityCriteria copy$default(TournamentEligibilityCriteria tournamentEligibilityCriteria, String str, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tournamentEligibilityCriteria.pointsCriteriaField;
        }
        if ((i & 2) != 0) {
            d = tournamentEligibilityCriteria.minimumThreshold;
        }
        if ((i & 4) != 0) {
            d2 = tournamentEligibilityCriteria.minimumStakeCriteria;
        }
        return tournamentEligibilityCriteria.copy(str, d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPointsCriteriaField() {
        return this.pointsCriteriaField;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getMinimumThreshold() {
        return this.minimumThreshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getMinimumStakeCriteria() {
        return this.minimumStakeCriteria;
    }

    public final TournamentEligibilityCriteria copy(String pointsCriteriaField, Double minimumThreshold, Double minimumStakeCriteria) {
        return new TournamentEligibilityCriteria(pointsCriteriaField, minimumThreshold, minimumStakeCriteria);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentEligibilityCriteria)) {
            return false;
        }
        TournamentEligibilityCriteria tournamentEligibilityCriteria = (TournamentEligibilityCriteria) other;
        return Intrinsics.g(this.pointsCriteriaField, tournamentEligibilityCriteria.pointsCriteriaField) && Intrinsics.g(this.minimumThreshold, tournamentEligibilityCriteria.minimumThreshold) && Intrinsics.g(this.minimumStakeCriteria, tournamentEligibilityCriteria.minimumStakeCriteria);
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

    public int hashCode() {
        String str = this.pointsCriteriaField;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.minimumThreshold;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.minimumStakeCriteria;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TournamentEligibilityCriteria(pointsCriteriaField=");
        sb.append(this.pointsCriteriaField);
        sb.append(", minimumThreshold=");
        sb.append(this.minimumThreshold);
        sb.append(", minimumStakeCriteria=");
        return itu.a(sb, this.minimumStakeCriteria, ')');
    }

    public /* synthetic */ TournamentEligibilityCriteria(String str, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, d, d2);
    }
}
