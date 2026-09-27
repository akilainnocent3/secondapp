package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f65456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f65457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f65458c;

    public a a() {
        return this.f65456a;
    }

    public boolean b() {
        return this.f65457b;
    }

    public boolean c() {
        return this.f65458c;
    }

    public void a(a aVar) {
        this.f65456a = aVar;
        b(false);
    }

    public void b(boolean z10) {
        this.f65458c = z10;
    }

    public void a(Exception exc) {
        a(new a(exc));
    }

    public void a(boolean z10) {
        this.f65457b = z10;
    }
}
