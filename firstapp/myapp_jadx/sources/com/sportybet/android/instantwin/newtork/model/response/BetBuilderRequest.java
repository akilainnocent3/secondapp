package com.sportybet.android.instantwin.newtork.model.response;

/* JADX INFO: loaded from: classes5.dex */
public class BetBuilderRequest implements Comparable<BetBuilderRequest> {
    public String lookupKey;
    public String marketId;
    public String outcomeId;

    public BetBuilderRequest(String str, String str2, String str3) {
        this.marketId = str;
        this.outcomeId = str2;
        this.lookupKey = str3;
    }

    @Override // java.lang.Comparable
    public int compareTo(BetBuilderRequest betBuilderRequest) {
        return this.outcomeId.compareTo(betBuilderRequest.outcomeId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BetBuilderRequest betBuilderRequest = (BetBuilderRequest) obj;
            if (this.marketId.equals(betBuilderRequest.marketId) && this.outcomeId.equals(betBuilderRequest.outcomeId) && this.lookupKey.equals(betBuilderRequest.lookupKey)) {
                return true;
            }
        }
        return false;
    }
}
