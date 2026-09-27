package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.mmadbridge.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f53584f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f53585a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.e f53586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.b f53587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.devicevolume.d f53588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f53589e;

    public i(com.iab.omid.library.mmadbridge.devicevolume.e eVar, com.iab.omid.library.mmadbridge.devicevolume.b bVar) {
        this.f53586b = eVar;
        this.f53587c = bVar;
    }

    private c a() {
        if (this.f53589e == null) {
            this.f53589e = c.c();
        }
        return this.f53589e;
    }

    public static i c() {
        if (f53584f == null) {
            f53584f = new i(new com.iab.omid.library.mmadbridge.devicevolume.e(), new com.iab.omid.library.mmadbridge.devicevolume.b());
        }
        return f53584f;
    }

    public float b() {
        return this.f53585a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f53588d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f53588d.d();
    }

    @Override // com.iab.omid.library.mmadbridge.devicevolume.c
    public void a(float f10) {
        this.f53585a = f10;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f53588d = this.f53586b.a(new Handler(), context, this.f53587c.a(), this);
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
