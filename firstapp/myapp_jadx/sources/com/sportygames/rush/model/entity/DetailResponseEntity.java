package com.sportygames.rush.model.entity;

import defpackage.ffp;
import defpackage.hib0;
import defpackage.nrg0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0019\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\rHÆ\u0003Js\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lcom/sportygames/rush/model/entity/DetailResponseEntity;", "", "defaultAmount", "", "minAmount", "maxAmount", "maxPayout", "minUserCoefficient", "maxUserCoefficient", "desiredRTP", "defaultUserCoefficient", "autoBetChips", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(DDDDDDDDLjava/util/ArrayList;)V", "getDefaultAmount", "()D", "setDefaultAmount", "(D)V", "getMinAmount", "getMaxAmount", "getMaxPayout", "getMinUserCoefficient", "getMaxUserCoefficient", "getDesiredRTP", "getDefaultUserCoefficient", "getAutoBetChips", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailResponseEntity {
    public static final int $stable = 8;
    private final ArrayList<Double> autoBetChips;
    private double defaultAmount;
    private final double defaultUserCoefficient;
    private final double desiredRTP;
    private final double maxAmount;
    private final double maxPayout;
    private final double maxUserCoefficient;
    private final double minAmount;
    private final double minUserCoefficient;

    public DetailResponseEntity(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, ArrayList<Double> arrayList) {
        arrayList.getClass();
        this.defaultAmount = d;
        this.minAmount = d2;
        this.maxAmount = d3;
        this.maxPayout = d4;
        this.minUserCoefficient = d5;
        this.maxUserCoefficient = d6;
        this.desiredRTP = d7;
        this.defaultUserCoefficient = d8;
        this.autoBetChips = arrayList;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMaxPayout() {
        return this.maxPayout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMinUserCoefficient() {
        return this.minUserCoefficient;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getMaxUserCoefficient() {
        return this.maxUserCoefficient;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getDesiredRTP() {
        return this.desiredRTP;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getDefaultUserCoefficient() {
        return this.defaultUserCoefficient;
    }

    public final ArrayList<Double> component9() {
        return this.autoBetChips;
    }

    public final DetailResponseEntity copy(double defaultAmount, double minAmount, double maxAmount, double maxPayout, double minUserCoefficient, double maxUserCoefficient, double desiredRTP, double defaultUserCoefficient, ArrayList<Double> autoBetChips) {
        autoBetChips.getClass();
        return new DetailResponseEntity(defaultAmount, minAmount, maxAmount, maxPayout, minUserCoefficient, maxUserCoefficient, desiredRTP, defaultUserCoefficient, autoBetChips);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailResponseEntity)) {
            return false;
        }
        DetailResponseEntity detailResponseEntity = (DetailResponseEntity) other;
        return Double.compare(this.defaultAmount, detailResponseEntity.defaultAmount) == 0 && Double.compare(this.minAmount, detailResponseEntity.minAmount) == 0 && Double.compare(this.maxAmount, detailResponseEntity.maxAmount) == 0 && Double.compare(this.maxPayout, detailResponseEntity.maxPayout) == 0 && Double.compare(this.minUserCoefficient, detailResponseEntity.minUserCoefficient) == 0 && Double.compare(this.maxUserCoefficient, detailResponseEntity.maxUserCoefficient) == 0 && Double.compare(this.desiredRTP, detailResponseEntity.desiredRTP) == 0 && Double.compare(this.defaultUserCoefficient, detailResponseEntity.defaultUserCoefficient) == 0 && Intrinsics.g(this.autoBetChips, detailResponseEntity.autoBetChips);
    }

    public final ArrayList<Double> getAutoBetChips() {
        return this.autoBetChips;
    }

    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    public final double getDefaultUserCoefficient() {
        return this.defaultUserCoefficient;
    }

    public final double getDesiredRTP() {
        return this.desiredRTP;
    }

    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final double getMaxPayout() {
        return this.maxPayout;
    }

    public final double getMaxUserCoefficient() {
        return this.maxUserCoefficient;
    }

    public final double getMinAmount() {
        return this.minAmount;
    }

    public final double getMinUserCoefficient() {
        return this.minUserCoefficient;
    }

    public int hashCode() {
        return this.autoBetChips.hashCode() + nrg0.a(nrg0.a(nrg0.a(nrg0.a(nrg0.a(nrg0.a(nrg0.a(Double.hashCode(this.defaultAmount) * 31, 31, this.minAmount), 31, this.maxAmount), 31, this.maxPayout), 31, this.minUserCoefficient), 31, this.maxUserCoefficient), 31, this.desiredRTP), 31, this.defaultUserCoefficient);
    }

    public final void setDefaultAmount(double d) {
        this.defaultAmount = d;
    }

    public String toString() {
        double d = this.defaultAmount;
        double d2 = this.minAmount;
        double d3 = this.maxAmount;
        double d4 = this.maxPayout;
        double d5 = this.minUserCoefficient;
        double d6 = this.maxUserCoefficient;
        double d7 = this.desiredRTP;
        double d8 = this.defaultUserCoefficient;
        ArrayList<Double> arrayList = this.autoBetChips;
        StringBuilder sbA = ffp.a(d, "DetailResponseEntity(defaultAmount=", ", minAmount=");
        sbA.append(d2);
        hib0.b(d3, ", maxAmount=", ", maxPayout=", sbA);
        sbA.append(d4);
        hib0.b(d5, ", minUserCoefficient=", ", maxUserCoefficient=", sbA);
        sbA.append(d6);
        hib0.b(d7, ", desiredRTP=", ", defaultUserCoefficient=", sbA);
        sbA.append(d8);
        sbA.append(", autoBetChips=");
        sbA.append(arrayList);
        sbA.append(")");
        return sbA.toString();
    }
}
