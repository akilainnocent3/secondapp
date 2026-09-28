package com.sportygames.crashInitiated.model.request;

import defpackage.w57;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0015\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0003Jd\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0006\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/sportygames/crashInitiated/model/request/BetData;", "", "betValue", "", "cashOutValue", "betCoeff", "isSingleBet", "", "onConfirmClick", "Lkotlin/Function1;", "", "onCancelClick", "Lkotlin/Function0;", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getBetValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCashOutValue", "setCashOutValue", "(Ljava/lang/Double;)V", "getBetCoeff", "setBetCoeff", "()Ljava/lang/Boolean;", "setSingleBet", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getOnConfirmClick", "()Lkotlin/jvm/functions/Function1;", "setOnConfirmClick", "(Lkotlin/jvm/functions/Function1;)V", "getOnCancelClick", "()Lkotlin/jvm/functions/Function0;", "setOnCancelClick", "(Lkotlin/jvm/functions/Function0;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/sportygames/crashInitiated/model/request/BetData;", "equals", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetData {
    public static final int $stable = 8;
    private Double betCoeff;
    private final Double betValue;
    private Double cashOutValue;
    private Boolean isSingleBet;
    private Function0<Unit> onCancelClick;
    private Function1<? super Boolean, Unit> onConfirmClick;

    public /* synthetic */ BetData(Double d, Double d2, Double d3, Boolean bool, Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? Boolean.TRUE : bool, function1, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetData copy$default(BetData betData, Double d, Double d2, Double d3, Boolean bool, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            d = betData.betValue;
        }
        if ((i & 2) != 0) {
            d2 = betData.cashOutValue;
        }
        if ((i & 4) != 0) {
            d3 = betData.betCoeff;
        }
        if ((i & 8) != 0) {
            bool = betData.isSingleBet;
        }
        if ((i & 16) != 0) {
            function1 = betData.onConfirmClick;
        }
        if ((i & 32) != 0) {
            function0 = betData.onCancelClick;
        }
        Function1 function2 = function1;
        Function0 function3 = function0;
        return betData.copy(d, d2, d3, bool, function2, function3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getBetValue() {
        return this.betValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getCashOutValue() {
        return this.cashOutValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getBetCoeff() {
        return this.betCoeff;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsSingleBet() {
        return this.isSingleBet;
    }

    public final Function1<Boolean, Unit> component5() {
        return this.onConfirmClick;
    }

    public final Function0<Unit> component6() {
        return this.onCancelClick;
    }

    public final BetData copy(Double betValue, Double cashOutValue, Double betCoeff, Boolean isSingleBet, Function1<? super Boolean, Unit> onConfirmClick, Function0<Unit> onCancelClick) {
        onConfirmClick.getClass();
        onCancelClick.getClass();
        return new BetData(betValue, cashOutValue, betCoeff, isSingleBet, onConfirmClick, onCancelClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetData)) {
            return false;
        }
        BetData betData = (BetData) other;
        return Intrinsics.g(this.betValue, betData.betValue) && Intrinsics.g(this.cashOutValue, betData.cashOutValue) && Intrinsics.g(this.betCoeff, betData.betCoeff) && Intrinsics.g(this.isSingleBet, betData.isSingleBet) && Intrinsics.g(this.onConfirmClick, betData.onConfirmClick) && Intrinsics.g(this.onCancelClick, betData.onCancelClick);
    }

    public final Double getBetCoeff() {
        return this.betCoeff;
    }

    public final Double getBetValue() {
        return this.betValue;
    }

    public final Double getCashOutValue() {
        return this.cashOutValue;
    }

    public final Function0<Unit> getOnCancelClick() {
        return this.onCancelClick;
    }

    public final Function1<Boolean, Unit> getOnConfirmClick() {
        return this.onConfirmClick;
    }

    public int hashCode() {
        Double d = this.betValue;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.cashOutValue;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.betCoeff;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.isSingleBet;
        return this.onCancelClick.hashCode() + w57.b((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.onConfirmClick);
    }

    public final Boolean isSingleBet() {
        return this.isSingleBet;
    }

    public final void setBetCoeff(Double d) {
        this.betCoeff = d;
    }

    public final void setCashOutValue(Double d) {
        this.cashOutValue = d;
    }

    public final void setOnCancelClick(Function0<Unit> function0) {
        function0.getClass();
        this.onCancelClick = function0;
    }

    public final void setOnConfirmClick(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.onConfirmClick = function1;
    }

    public final void setSingleBet(Boolean bool) {
        this.isSingleBet = bool;
    }

    public String toString() {
        return "BetData(betValue=" + this.betValue + ", cashOutValue=" + this.cashOutValue + ", betCoeff=" + this.betCoeff + ", isSingleBet=" + this.isSingleBet + ", onConfirmClick=" + this.onConfirmClick + ", onCancelClick=" + this.onCancelClick + ")";
    }

    public BetData(Double d, Double d2, Double d3, Boolean bool, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
        function1.getClass();
        function0.getClass();
        this.betValue = d;
        this.cashOutValue = d2;
        this.betCoeff = d3;
        this.isSingleBet = bool;
        this.onConfirmClick = function1;
        this.onCancelClick = function0;
    }
}
