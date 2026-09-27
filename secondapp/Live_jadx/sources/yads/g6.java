package yads;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.exoplayer2.source.ads.a.InterfaceC0443a f149406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdPlaybackState f149407b = AdPlaybackState.f48672m;

    public g6(com.google.android.exoplayer2.source.ads.a.InterfaceC0443a interfaceC0443a) {
        this.f149406a = interfaceC0443a;
    }

    public final void a(AdPlaybackState adPlaybackState) {
        this.f149407b = adPlaybackState;
        com.google.android.exoplayer2.source.ads.a.InterfaceC0443a interfaceC0443a = this.f149406a;
        if (interfaceC0443a != null) {
            interfaceC0443a.a(adPlaybackState);
        }
    }
}
