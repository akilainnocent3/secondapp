package com.iab.omid.library.chartboost.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.chartboost.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.chartboost.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f53038f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f53039a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.devicevolume.e f53040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.devicevolume.b f53041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.chartboost.devicevolume.d f53042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f53043e;

    public i(com.iab.omid.library.chartboost.devicevolume.e eVar, com.iab.omid.library.chartboost.devicevolume.b bVar) {
        this.f53040b = eVar;
        this.f53041c = bVar;
    }

    private c a() {
        if (this.f53043e == null) {
            this.f53043e = c.c();
        }
        return this.f53043e;
    }

    public static i c() {
        if (f53038f == null) {
            f53038f = new i(new com.iab.omid.library.chartboost.devicevolume.e(), new com.iab.omid.library.chartboost.devicevolume.b());
        }
        return f53038f;
    }

    public float b() {
        return this.f53039a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f53042d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f53042d.c();
    }

    @Override // com.iab.omid.library.chartboost.devicevolume.c
    public void a(float f10) {
        this.f53039a = f10;
        Iterator<com.iab.omid.library.chartboost.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f53042d = this.f53040b.a(new Handler(), context, this.f53041c.a(), this);
    }

    @Override // com.iab.omid.library.chartboost.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
