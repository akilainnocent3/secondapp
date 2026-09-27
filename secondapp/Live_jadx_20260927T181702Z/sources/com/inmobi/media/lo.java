package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class lo extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f56952a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f56952a = true;
        super.destroy();
    }
}
