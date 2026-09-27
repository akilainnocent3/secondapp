package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a implements PreloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f68489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68490b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68491c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f68489a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.f68491c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f68489a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f68489a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f68489a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f68489a.get().onPreloadSucceed();
    }

    public void a(boolean z10) {
        this.f68491c = z10;
    }
}
