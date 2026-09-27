package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.inmobi.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f53314f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f53315a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.e f53316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.b f53317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.devicevolume.d f53318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f53319e;

    public i(com.iab.omid.library.inmobi.devicevolume.e eVar, com.iab.omid.library.inmobi.devicevolume.b bVar) {
        this.f53316b = eVar;
        this.f53317c = bVar;
    }

    private c a() {
        if (this.f53319e == null) {
            this.f53319e = c.c();
        }
        return this.f53319e;
    }

    public static i c() {
        if (f53314f == null) {
            f53314f = new i(new com.iab.omid.library.inmobi.devicevolume.e(), new com.iab.omid.library.inmobi.devicevolume.b());
        }
        return f53314f;
    }

    public float b() {
        return this.f53315a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f53318d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f53318d.c();
    }

    @Override // com.iab.omid.library.inmobi.devicevolume.c
    public void a(float f10) {
        this.f53315a = f10;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f53318d = this.f53316b.a(new Handler(), context, this.f53317c.a(), this);
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
