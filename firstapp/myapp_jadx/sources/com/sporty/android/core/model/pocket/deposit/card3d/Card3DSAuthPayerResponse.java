package com.sporty.android.core.model.pocket.deposit.card3d;

import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0011¨\u0006\u0010"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSAuthPayerResponse;", "", "redirectResponseUrl", "", "<init>", "(Ljava/lang/String;)V", "getRedirectResponseUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Card3DSAuthPayerResponse {
    private final String redirectResponseUrl;

    public Card3DSAuthPayerResponse(String str) {
        this.redirectResponseUrl = str;
    }

    public static /* synthetic */ Card3DSAuthPayerResponse copy$default(Card3DSAuthPayerResponse card3DSAuthPayerResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = card3DSAuthPayerResponse.redirectResponseUrl;
        }
        return card3DSAuthPayerResponse.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRedirectResponseUrl() {
        return this.redirectResponseUrl;
    }

    public final Card3DSAuthPayerResponse copy(String redirectResponseUrl) {
        return new Card3DSAuthPayerResponse(redirectResponseUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Card3DSAuthPayerResponse) && Intrinsics.g(this.redirectResponseUrl, ((Card3DSAuthPayerResponse) other).redirectResponseUrl);
    }

    public final String getRedirectResponseUrl() {
        return this.redirectResponseUrl;
    }

    public int hashCode() {
        String str = this.redirectResponseUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return tug.a("Card3DSAuthPayerResponse(redirectResponseUrl=", this.redirectResponseUrl, ")");
    }
}
