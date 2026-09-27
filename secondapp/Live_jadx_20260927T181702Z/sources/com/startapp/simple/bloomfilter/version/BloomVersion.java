package com.startapp.simple.bloomfilter.version;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import e8.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum BloomVersion {
    ZERO("0", 1, 720),
    THREE("3.0", 1, 720) { // from class: com.startapp.simple.bloomfilter.version.BloomVersion.1
        @Override // com.startapp.simple.bloomfilter.version.BloomVersion
        public String substringFromBloom(String str) {
            int length = str.length();
            return length > 20 ? str.substring(0, length - 20) : str;
        }
    },
    FOUR("4", 3, a.f80547h),
    FIVE(CampaignEx.CLICKMODE_ON, 3, 1000000);

    private final int numberOfHashes;
    private final int sizeOfBucket;
    private final String version;

    public int getNumberOfHashes() {
        return this.numberOfHashes;
    }

    public int getSizeOfBucket() {
        return this.sizeOfBucket;
    }

    public String getVersion() {
        return this.version;
    }

    BloomVersion(String str, int i10, int i11) {
        this.version = str;
        this.numberOfHashes = i10;
        this.sizeOfBucket = i11;
    }

    public String substringFromBloom(String str) {
        return str;
    }
}
