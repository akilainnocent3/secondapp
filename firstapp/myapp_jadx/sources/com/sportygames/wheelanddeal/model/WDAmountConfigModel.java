package com.sportygames.wheelanddeal.model;

import defpackage.xdp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDAmountConfigModel;", "", "Lxdp;", "betAmount", "Lcom/sportygames/wheelanddeal/model/WDAutoSpinConfigModel;", "autoSpin", "<init>", "(Lxdp;Lcom/sportygames/wheelanddeal/model/WDAutoSpinConfigModel;)V", "component1", "()Lxdp;", "component2", "()Lcom/sportygames/wheelanddeal/model/WDAutoSpinConfigModel;", "copy", "(Lxdp;Lcom/sportygames/wheelanddeal/model/WDAutoSpinConfigModel;)Lcom/sportygames/wheelanddeal/model/WDAmountConfigModel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxdp;", "getBetAmount", "Lcom/sportygames/wheelanddeal/model/WDAutoSpinConfigModel;", "getAutoSpin", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDAmountConfigModel {
    public static final int $stable = 8;
    private final WDAutoSpinConfigModel autoSpin;
    private final xdp betAmount;

    public WDAmountConfigModel(xdp xdpVar, WDAutoSpinConfigModel wDAutoSpinConfigModel) {
        xdpVar.getClass();
        wDAutoSpinConfigModel.getClass();
        this.betAmount = xdpVar;
        this.autoSpin = wDAutoSpinConfigModel;
    }

    public static /* synthetic */ WDAmountConfigModel copy$default(WDAmountConfigModel wDAmountConfigModel, xdp xdpVar, WDAutoSpinConfigModel wDAutoSpinConfigModel, int i, Object obj) {
        if ((i & 1) != 0) {
            xdpVar = wDAmountConfigModel.betAmount;
        }
        if ((i & 2) != 0) {
            wDAutoSpinConfigModel = wDAmountConfigModel.autoSpin;
        }
        return wDAmountConfigModel.copy(xdpVar, wDAutoSpinConfigModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final xdp getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WDAutoSpinConfigModel getAutoSpin() {
        return this.autoSpin;
    }

    public final WDAmountConfigModel copy(xdp betAmount, WDAutoSpinConfigModel autoSpin) {
        betAmount.getClass();
        autoSpin.getClass();
        return new WDAmountConfigModel(betAmount, autoSpin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDAmountConfigModel)) {
            return false;
        }
        WDAmountConfigModel wDAmountConfigModel = (WDAmountConfigModel) other;
        return Intrinsics.g(this.betAmount, wDAmountConfigModel.betAmount) && Intrinsics.g(this.autoSpin, wDAmountConfigModel.autoSpin);
    }

    public final WDAutoSpinConfigModel getAutoSpin() {
        return this.autoSpin;
    }

    public final xdp getBetAmount() {
        return this.betAmount;
    }

    public int hashCode() {
        return this.autoSpin.hashCode() + (this.betAmount.a.hashCode() * 31);
    }

    public String toString() {
        return "WDAmountConfigModel(betAmount=" + this.betAmount + ", autoSpin=" + this.autoSpin + ')';
    }
}
