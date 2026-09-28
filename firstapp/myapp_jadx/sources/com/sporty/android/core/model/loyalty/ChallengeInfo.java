package com.sporty.android.core.model.loyalty;

import kotlin.Metadata;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/loyalty/ChallengeInfo;", "", "challengeId", "", "topRanking", "", "<init>", "(JI)V", "getChallengeId", "()J", "getTopRanking", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChallengeInfo {
    private final long challengeId;
    private final int topRanking;

    public ChallengeInfo(long j, int i) {
        this.challengeId = j;
        this.topRanking = i;
    }

    public static /* synthetic */ ChallengeInfo copy$default(ChallengeInfo challengeInfo, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = challengeInfo.challengeId;
        }
        if ((i2 & 2) != 0) {
            i = challengeInfo.topRanking;
        }
        return challengeInfo.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getChallengeId() {
        return this.challengeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTopRanking() {
        return this.topRanking;
    }

    public final ChallengeInfo copy(long challengeId, int topRanking) {
        return new ChallengeInfo(challengeId, topRanking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeInfo)) {
            return false;
        }
        ChallengeInfo challengeInfo = (ChallengeInfo) other;
        return this.challengeId == challengeInfo.challengeId && this.topRanking == challengeInfo.topRanking;
    }

    public final long getChallengeId() {
        return this.challengeId;
    }

    public final int getTopRanking() {
        return this.topRanking;
    }

    public int hashCode() {
        return Integer.hashCode(this.topRanking) + (Long.hashCode(this.challengeId) * 31);
    }

    public String toString() {
        return "ChallengeInfo(challengeId=" + this.challengeId + ", topRanking=" + this.topRanking + Chyeyik.jOSnWWT;
    }
}
