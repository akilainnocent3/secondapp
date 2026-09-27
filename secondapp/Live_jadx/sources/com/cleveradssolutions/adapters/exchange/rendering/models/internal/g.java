package com.cleveradssolutions.adapters.exchange.rendering.models.internal;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f42242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f42243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42244c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        CLOSE_AD,
        OTHER,
        VIDEO_CONTROLS
    }

    public g(View view, a aVar, String str) {
        this.f42242a = new WeakReference(view);
        this.f42243b = aVar;
        this.f42244c = str;
    }

    public a a() {
        return this.f42243b;
    }

    public View b() {
        return (View) this.f42242a.get();
    }

    public String c() {
        return this.f42244c;
    }
}
