package com.sportygames.chat.remote.models;

import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import defpackage.pe4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/sportygames/chat/remote/models/ClaimRainRequest;", "", "rainId", "", "<init>", "(I)V", "getRainId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ClaimRainRequest {
    public static final int $stable = 0;
    private final int rainId;

    public ClaimRainRequest(int i) {
        this.rainId = i;
    }

    public static /* synthetic */ ClaimRainRequest copy$default(ClaimRainRequest claimRainRequest, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = claimRainRequest.rainId;
        }
        return claimRainRequest.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRainId() {
        return this.rainId;
    }

    public final ClaimRainRequest copy(int rainId) {
        return new ClaimRainRequest(rainId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClaimRainRequest) && this.rainId == ((ClaimRainRequest) other).rainId;
    }

    public final int getRainId() {
        return this.rainId;
    }

    public int hashCode() {
        return Integer.hashCode(this.rainId);
    }

    public String toString() {
        return pe4.b(this.rainId, jbkEboCkTqmGf.PzNTadzdP, ")");
    }
}
