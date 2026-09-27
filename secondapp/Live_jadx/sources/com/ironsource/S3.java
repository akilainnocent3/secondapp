package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class S3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f60009a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IronSourceError f60010b = null;

    public void a(IronSourceError ironSourceError) {
        this.f60009a = false;
        this.f60010b = ironSourceError;
    }

    public boolean b() {
        return this.f60009a;
    }

    public void c() {
        this.f60009a = true;
        this.f60010b = null;
    }

    public String toString() {
        if (b()) {
            return "valid:" + this.f60009a;
        }
        return "valid:" + this.f60009a + ", IronSourceError:" + this.f60010b;
    }

    public IronSourceError a() {
        return this.f60010b;
    }
}
