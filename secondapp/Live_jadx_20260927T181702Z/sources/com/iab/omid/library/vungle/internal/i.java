package com.iab.omid.library.vungle.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.walking.TreeWalker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.vungle.devicevolume.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static i f54166f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54167a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.e f54168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.b f54169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.devicevolume.d f54170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f54171e;

    public i(com.iab.omid.library.vungle.devicevolume.e eVar, com.iab.omid.library.vungle.devicevolume.b bVar) {
        this.f54168b = eVar;
        this.f54169c = bVar;
    }

    private c a() {
        if (this.f54171e == null) {
            this.f54171e = c.c();
        }
        return this.f54171e;
    }

    public static i c() {
        if (f54166f == null) {
            f54166f = new i(new com.iab.omid.library.vungle.devicevolume.e(), new com.iab.omid.library.vungle.devicevolume.b());
        }
        return f54166f;
    }

    public float b() {
        return this.f54167a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f54170d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f54170d.c();
    }

    @Override // com.iab.omid.library.vungle.devicevolume.c
    public void a(float f10) {
        this.f54167a = f10;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f54170d = this.f54168b.a(new Handler(), context, this.f54169c.a(), this);
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
