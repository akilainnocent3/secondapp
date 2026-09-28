package com.sportygames.spin2win.model.local;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/sportygames/spin2win/model/local/Payouts;", "", "betCategory", "", "payoutMultiplier", "betTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBetCategory", "()Ljava/lang/String;", "getPayoutMultiplier", "getBetTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Payouts {
    public static final int $stable = 0;
    private final String betCategory;
    private final String betTitle;
    private final String payoutMultiplier;

    public Payouts(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.betCategory = str;
        this.payoutMultiplier = str2;
        this.betTitle = str3;
    }

    public static /* synthetic */ Payouts copy$default(Payouts payouts, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payouts.betCategory;
        }
        if ((i & 2) != 0) {
            str2 = payouts.payoutMultiplier;
        }
        if ((i & 4) != 0) {
            str3 = payouts.betTitle;
        }
        return payouts.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetCategory() {
        return this.betCategory;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayoutMultiplier() {
        return this.payoutMultiplier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBetTitle() {
        return this.betTitle;
    }

    public final Payouts copy(String betCategory, String payoutMultiplier, String betTitle) {
        betCategory.getClass();
        payoutMultiplier.getClass();
        betTitle.getClass();
        return new Payouts(betCategory, payoutMultiplier, betTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payouts)) {
            return false;
        }
        Payouts payouts = (Payouts) other;
        return Intrinsics.g(this.betCategory, payouts.betCategory) && Intrinsics.g(this.payoutMultiplier, payouts.payoutMultiplier) && Intrinsics.g(this.betTitle, payouts.betTitle);
    }

    public final String getBetCategory() {
        return this.betCategory;
    }

    public final String getBetTitle() {
        return this.betTitle;
    }

    public final String getPayoutMultiplier() {
        return this.payoutMultiplier;
    }

    public int hashCode() {
        return this.betTitle.hashCode() + gmf0.a(this.betCategory.hashCode() * 31, 31, this.payoutMultiplier);
    }

    public String toString() {
        String str = this.betCategory;
        String str2 = this.payoutMultiplier;
        return uf80.a(ux5.a("Payouts(betCategory=", str, ", payoutMultiplier=", str2, ", betTitle="), this.betTitle, ")");
    }
}
