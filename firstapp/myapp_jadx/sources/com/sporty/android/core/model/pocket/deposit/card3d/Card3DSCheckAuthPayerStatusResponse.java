package com.sporty.android.core.model.pocket.deposit.card3d;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0013¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSCheckAuthPayerStatusResponse;", "", "authenticated", "", "<init>", "(Ljava/lang/Boolean;)V", "getAuthenticated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/sporty/android/core/model/pocket/deposit/card3d/Card3DSCheckAuthPayerStatusResponse;", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Card3DSCheckAuthPayerStatusResponse {
    private final Boolean authenticated;

    public Card3DSCheckAuthPayerStatusResponse(Boolean bool) {
        this.authenticated = bool;
    }

    public static /* synthetic */ Card3DSCheckAuthPayerStatusResponse copy$default(Card3DSCheckAuthPayerStatusResponse card3DSCheckAuthPayerStatusResponse, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = card3DSCheckAuthPayerStatusResponse.authenticated;
        }
        return card3DSCheckAuthPayerStatusResponse.copy(bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAuthenticated() {
        return this.authenticated;
    }

    public final Card3DSCheckAuthPayerStatusResponse copy(Boolean authenticated) {
        return new Card3DSCheckAuthPayerStatusResponse(authenticated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Card3DSCheckAuthPayerStatusResponse) && Intrinsics.g(this.authenticated, ((Card3DSCheckAuthPayerStatusResponse) other).authenticated);
    }

    public final Boolean getAuthenticated() {
        return this.authenticated;
    }

    public int hashCode() {
        Boolean bool = this.authenticated;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "Card3DSCheckAuthPayerStatusResponse(authenticated=" + this.authenticated + ")";
    }
}
