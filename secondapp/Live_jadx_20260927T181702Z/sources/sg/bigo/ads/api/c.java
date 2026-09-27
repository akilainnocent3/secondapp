package sg.bigo.ads.api;

import sg.bigo.ads.api.b;
import sg.bigo.ads.api.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<ARB extends c, AR extends b> {
    private long mActivatedTime;
    private int mAge;
    private int mGender;
    protected String mServerBidPayload;
    protected String mSlotId;
    private String mWatermark;

    public AR build() {
        AR ar2 = (AR) createAdRequest();
        if (ar2 != null) {
            int i10 = this.mAge;
            int i11 = this.mGender;
            long j10 = this.mActivatedTime;
            ar2.f132720d = i10;
            ar2.f132721e = i11;
            ar2.f132722f = j10;
            ar2.f132723g = this.mWatermark;
        }
        return ar2;
    }

    public abstract AR createAdRequest();

    public ARB withActivatedTime(long j10) {
        this.mActivatedTime = j10;
        return this;
    }

    public ARB withAge(int i10) {
        this.mAge = i10;
        return this;
    }

    public final ARB withBid(String str) {
        this.mServerBidPayload = str;
        return this;
    }

    public ARB withGender(int i10) {
        this.mGender = i10;
        return this;
    }

    public final ARB withSlotId(String str) {
        this.mSlotId = str;
        return this;
    }

    public ARB withWatermark(String str) {
        this.mWatermark = str;
        return this;
    }
}
