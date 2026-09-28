package com.sportygames.commons.viewmodels;

import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sportygames/commons/viewmodels/FbgData;", "", "showFbg", "", "price", "", "currency", "", "<init>", "(ZLjava/lang/Double;Ljava/lang/String;)V", "getShowFbg", "()Z", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ZLjava/lang/Double;Ljava/lang/String;)Lcom/sportygames/commons/viewmodels/FbgData;", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FbgData {
    public static final int $stable = 0;
    private final String currency;
    private final Double price;
    private final boolean showFbg;

    public FbgData(boolean z, Double d, String str) {
        this.showFbg = z;
        this.price = d;
        this.currency = str;
    }

    public static /* synthetic */ FbgData copy$default(FbgData fbgData, boolean z, Double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fbgData.showFbg;
        }
        if ((i & 2) != 0) {
            d = fbgData.price;
        }
        if ((i & 4) != 0) {
            str = fbgData.currency;
        }
        return fbgData.copy(z, d, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowFbg() {
        return this.showFbg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final FbgData copy(boolean showFbg, Double price, String currency) {
        return new FbgData(showFbg, price, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FbgData)) {
            return false;
        }
        FbgData fbgData = (FbgData) other;
        return this.showFbg == fbgData.showFbg && Intrinsics.g(this.price, fbgData.price) && Intrinsics.g(this.currency, fbgData.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final boolean getShowFbg() {
        return this.showFbg;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showFbg) * 31;
        Double d = this.price;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.currency;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.showFbg;
        Double d = this.price;
        String str = this.currency;
        StringBuilder sb = new StringBuilder("FbgData(showFbg=");
        sb.append(z);
        sb.append(", price=");
        sb.append(d);
        sb.append(", currency=");
        return uf80.a(sb, str, ")");
    }
}
