package com.sporty.android.core.model.autobet;

import defpackage.bt6;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ka1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/sporty/android/core/model/autobet/AutoBetRequest;", "", "stake", "", "orderType", "", "minOdds", "", "maxOdds", "selections", "", "Lcom/sporty/android/core/model/autobet/AutoBetRequestSelection;", "<init>", "(JILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getStake", "()J", "getOrderType", "()I", "getMinOdds", "()Ljava/lang/String;", "getMaxOdds", "getSelections", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AutoBetRequest {
    private final String maxOdds;
    private final String minOdds;
    private final int orderType;
    private final List<AutoBetRequestSelection> selections;
    private final long stake;

    public AutoBetRequest(long j, int i, String str, String str2, List<AutoBetRequestSelection> list) {
        bt6.a(str, str2, list);
        this.stake = j;
        this.orderType = i;
        this.minOdds = str;
        this.maxOdds = str2;
        this.selections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoBetRequest copy$default(AutoBetRequest autoBetRequest, long j, int i, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = autoBetRequest.stake;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = autoBetRequest.orderType;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = autoBetRequest.minOdds;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = autoBetRequest.maxOdds;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            list = autoBetRequest.selections;
        }
        return autoBetRequest.copy(j2, i3, str3, str4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStake() {
        return this.stake;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinOdds() {
        return this.minOdds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxOdds() {
        return this.maxOdds;
    }

    public final List<AutoBetRequestSelection> component5() {
        return this.selections;
    }

    public final AutoBetRequest copy(long stake, int orderType, String minOdds, String maxOdds, List<AutoBetRequestSelection> selections) {
        minOdds.getClass();
        maxOdds.getClass();
        selections.getClass();
        return new AutoBetRequest(stake, orderType, minOdds, maxOdds, selections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoBetRequest)) {
            return false;
        }
        AutoBetRequest autoBetRequest = (AutoBetRequest) other;
        return this.stake == autoBetRequest.stake && this.orderType == autoBetRequest.orderType && Intrinsics.g(this.minOdds, autoBetRequest.minOdds) && Intrinsics.g(this.maxOdds, autoBetRequest.maxOdds) && Intrinsics.g(this.selections, autoBetRequest.selections);
    }

    public final String getMaxOdds() {
        return this.maxOdds;
    }

    public final String getMinOdds() {
        return this.minOdds;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public final List<AutoBetRequestSelection> getSelections() {
        return this.selections;
    }

    public final long getStake() {
        return this.stake;
    }

    public int hashCode() {
        return this.selections.hashCode() + gmf0.a(gmf0.a(gpp.a(this.orderType, Long.hashCode(this.stake) * 31, 31), 31, this.minOdds), 31, this.maxOdds);
    }

    public String toString() {
        long j = this.stake;
        int i = this.orderType;
        String str = this.minOdds;
        String str2 = this.maxOdds;
        List<AutoBetRequestSelection> list = this.selections;
        StringBuilder sb = new StringBuilder("AutoBetRequest(stake=");
        sb.append(j);
        sb.append(", orderType=");
        sb.append(i);
        hxa.c(sb, ", minOdds=", str, ", maxOdds=", str2);
        return ka1.a(sb, ", selections=", list, ")");
    }
}
