package com.sporty.android.core.model.cashout;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rÊ\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/cashout/PostCashoutRequest;", "", "betId", "", "isPartial", "", "usedStake", "amount", "isFromFECalculation", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "getBetId", "()Ljava/lang/String;", "()Z", "getUsedStake", "getAmount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PostCashoutRequest {
    private final String amount;
    private final String betId;
    private final boolean isFromFECalculation;
    private final boolean isPartial;
    private final String usedStake;

    public PostCashoutRequest(String str, boolean z, String str2, String str3, boolean z2) {
        m.a(str, str2, str3);
        this.betId = str;
        this.isPartial = z;
        this.usedStake = str2;
        this.amount = str3;
        this.isFromFECalculation = z2;
    }

    public static /* synthetic */ PostCashoutRequest copy$default(PostCashoutRequest postCashoutRequest, String str, boolean z, String str2, String str3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postCashoutRequest.betId;
        }
        if ((i & 2) != 0) {
            z = postCashoutRequest.isPartial;
        }
        if ((i & 4) != 0) {
            str2 = postCashoutRequest.usedStake;
        }
        if ((i & 8) != 0) {
            str3 = postCashoutRequest.amount;
        }
        if ((i & 16) != 0) {
            z2 = postCashoutRequest.isFromFECalculation;
        }
        boolean z3 = z2;
        String str4 = str2;
        return postCashoutRequest.copy(str, z, str4, str3, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPartial() {
        return this.isPartial;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsedStake() {
        return this.usedStake;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsFromFECalculation() {
        return this.isFromFECalculation;
    }

    public final PostCashoutRequest copy(String betId, boolean isPartial, String usedStake, String amount, boolean isFromFECalculation) {
        betId.getClass();
        usedStake.getClass();
        amount.getClass();
        return new PostCashoutRequest(betId, isPartial, usedStake, amount, isFromFECalculation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostCashoutRequest)) {
            return false;
        }
        PostCashoutRequest postCashoutRequest = (PostCashoutRequest) other;
        return Intrinsics.g(this.betId, postCashoutRequest.betId) && this.isPartial == postCashoutRequest.isPartial && Intrinsics.g(this.usedStake, postCashoutRequest.usedStake) && Intrinsics.g(this.amount, postCashoutRequest.amount) && this.isFromFECalculation == postCashoutRequest.isFromFECalculation;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getBetId() {
        return this.betId;
    }

    public final String getUsedStake() {
        return this.usedStake;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFromFECalculation) + gmf0.a(gmf0.a(mtg0.a(this.betId.hashCode() * 31, 31, this.isPartial), 31, this.usedStake), 31, this.amount);
    }

    public final boolean isFromFECalculation() {
        return this.isFromFECalculation;
    }

    public final boolean isPartial() {
        return this.isPartial;
    }

    public String toString() {
        String str = this.betId;
        boolean z = this.isPartial;
        String str2 = this.usedStake;
        String str3 = this.amount;
        boolean z2 = this.isFromFECalculation;
        StringBuilder sbA = z620.a("PostCashoutRequest(betId=", str, ", isPartial=", ", usedStake=", z);
        hxa.c(sbA, str2, ", amount=", str3, ", isFromFECalculation=");
        return mq0.a(sbA, z2, ")");
    }
}
