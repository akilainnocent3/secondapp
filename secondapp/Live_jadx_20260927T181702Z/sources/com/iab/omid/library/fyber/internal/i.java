package com.iab.omid.library.fyber.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.fyber.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.fyber.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f53173f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f53174a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.e f53175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.b f53176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.fyber.devicevolume.d f53177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f53178e;

    public i(com.iab.omid.library.fyber.devicevolume.e eVar, com.iab.omid.library.fyber.devicevolume.b bVar) {
        this.f53175b = eVar;
        this.f53176c = bVar;
    }

    private c a() {
        if (this.f53178e == null) {
            this.f53178e = c.c();
        }
        return this.f53178e;
    }

    public static i c() {
        if (f53173f == null) {
            f53173f = new i(new com.iab.omid.library.fyber.devicevolume.e(), new com.iab.omid.library.fyber.devicevolume.b());
        }
        return f53173f;
    }

    public float b() {
        return this.f53174a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f53177d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f53177d.d();
    }

    @Override // com.iab.omid.library.fyber.devicevolume.c
    public void a(float f10) {
        this.f53174a = f10;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f53177d = this.f53175b.a(new Handler(), context, this.f53176c.a(), this);
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
