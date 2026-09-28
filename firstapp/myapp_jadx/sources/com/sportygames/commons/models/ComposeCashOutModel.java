package com.sportygames.commons.models;

import defpackage.lng;
import defpackage.mtg0;
import defpackage.ux5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/sportygames/commons/models/ComposeCashOutModel;", "", "cashout1Text", "", "cashout2Text", "showCashout1", "", "showCashout2", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getCashout1Text", "()Ljava/lang/String;", "getCashout2Text", "getShowCashout1", "()Z", "getShowCashout2", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ComposeCashOutModel {
    public static final int $stable = 0;
    private final String cashout1Text;
    private final String cashout2Text;
    private final boolean showCashout1;
    private final boolean showCashout2;

    public /* synthetic */ ComposeCashOutModel(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public static /* synthetic */ ComposeCashOutModel copy$default(ComposeCashOutModel composeCashOutModel, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = composeCashOutModel.cashout1Text;
        }
        if ((i & 2) != 0) {
            str2 = composeCashOutModel.cashout2Text;
        }
        if ((i & 4) != 0) {
            z = composeCashOutModel.showCashout1;
        }
        if ((i & 8) != 0) {
            z2 = composeCashOutModel.showCashout2;
        }
        return composeCashOutModel.copy(str, str2, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCashout1Text() {
        return this.cashout1Text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCashout2Text() {
        return this.cashout2Text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowCashout1() {
        return this.showCashout1;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowCashout2() {
        return this.showCashout2;
    }

    public final ComposeCashOutModel copy(String cashout1Text, String cashout2Text, boolean showCashout1, boolean showCashout2) {
        return new ComposeCashOutModel(cashout1Text, cashout2Text, showCashout1, showCashout2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeCashOutModel)) {
            return false;
        }
        ComposeCashOutModel composeCashOutModel = (ComposeCashOutModel) other;
        return Intrinsics.g(this.cashout1Text, composeCashOutModel.cashout1Text) && Intrinsics.g(this.cashout2Text, composeCashOutModel.cashout2Text) && this.showCashout1 == composeCashOutModel.showCashout1 && this.showCashout2 == composeCashOutModel.showCashout2;
    }

    public final String getCashout1Text() {
        return this.cashout1Text;
    }

    public final String getCashout2Text() {
        return this.cashout2Text;
    }

    public final boolean getShowCashout1() {
        return this.showCashout1;
    }

    public final boolean getShowCashout2() {
        return this.showCashout2;
    }

    public int hashCode() {
        String str = this.cashout1Text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cashout2Text;
        return Boolean.hashCode(this.showCashout2) + mtg0.a((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.showCashout1);
    }

    public String toString() {
        String str = this.cashout1Text;
        String str2 = this.cashout2Text;
        return lng.a(", showCashout2=", ")", ux5.a("ComposeCashOutModel(cashout1Text=", str, ", cashout2Text=", str2, ", showCashout1="), this.showCashout1, this.showCashout2);
    }

    public ComposeCashOutModel(String str, String str2, boolean z, boolean z2) {
        this.cashout1Text = str;
        this.cashout2Text = str2;
        this.showCashout1 = z;
        this.showCashout2 = z2;
    }

    public ComposeCashOutModel() {
        this(null, null, false, false, 15, null);
    }
}
