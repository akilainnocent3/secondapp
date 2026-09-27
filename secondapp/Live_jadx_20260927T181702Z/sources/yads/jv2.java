package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jv2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn1 f151283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CustomizableMediaView f151284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on1 f151285d;

    public jv2(sn1 sn1Var, CustomizableMediaView customizableMediaView, on1 on1Var) {
        this.f151283b = sn1Var;
        this.f151284c = customizableMediaView;
        this.f151285d = on1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f151283b.b(this.f151284c, this.f151285d);
    }
}
