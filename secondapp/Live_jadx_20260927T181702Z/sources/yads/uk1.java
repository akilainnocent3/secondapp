package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uk1 implements sk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f156481b;

    public uk1(boolean z10, boolean z11) {
        this.f156480a = (z10 || z11) ? 1 : 0;
    }

    @Override // yads.sk1
    public final int a() {
        if (this.f156481b == null) {
            this.f156481b = new MediaCodecList(this.f156480a).getCodecInfos();
        }
        return this.f156481b.length;
    }

    @Override // yads.sk1
    public final boolean b() {
        return true;
    }

    @Override // yads.sk1
    public final MediaCodecInfo a(int i10) {
        if (this.f156481b == null) {
            this.f156481b = new MediaCodecList(this.f156480a).getCodecInfos();
        }
        return this.f156481b[i10];
    }

    @Override // yads.sk1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // yads.sk1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
