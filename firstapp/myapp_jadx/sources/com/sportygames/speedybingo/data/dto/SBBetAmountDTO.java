package com.sportygames.speedybingo.data.dto;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBBetAmountDTO;", "", "maxAmount", "", "minAmount", "stepAmount", "defaultAmount", "preDefined", "", "<init>", "(DDDDLjava/util/List;)V", "getMaxAmount", "()D", "getMinAmount", "getStepAmount", "getDefaultAmount", "getPreDefined", "()Ljava/util/List;", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SBBetAmountDTO {
    public static final int $stable = 8;
    private final double defaultAmount;
    private final double maxAmount;
    private final double minAmount;
    private final List<Double> preDefined;
    private final double stepAmount;

    public SBBetAmountDTO(double d, double d2, double d3, double d4, List<Double> list) {
        list.getClass();
        this.maxAmount = d;
        this.minAmount = d2;
        this.stepAmount = d3;
        this.defaultAmount = d4;
        this.preDefined = list;
    }

    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final double getMinAmount() {
        return this.minAmount;
    }

    public final List<Double> getPreDefined() {
        return this.preDefined;
    }

    public final double getStepAmount() {
        return this.stepAmount;
    }
}
