package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.ironsrc.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f53449f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f53450a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.e f53451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.b f53452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.devicevolume.d f53453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f53454e;

    public i(com.iab.omid.library.ironsrc.devicevolume.e eVar, com.iab.omid.library.ironsrc.devicevolume.b bVar) {
        this.f53451b = eVar;
        this.f53452c = bVar;
    }

    private c a() {
        if (this.f53454e == null) {
            this.f53454e = c.c();
        }
        return this.f53454e;
    }

    public static i c() {
        if (f53449f == null) {
            f53449f = new i(new com.iab.omid.library.ironsrc.devicevolume.e(), new com.iab.omid.library.ironsrc.devicevolume.b());
        }
        return f53449f;
    }

    public float b() {
        return this.f53450a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f53453d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f53453d.d();
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.c
    public void a(float f10) {
        this.f53450a = f10;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f53453d = this.f53451b.a(new Handler(), context, this.f53452c.a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
