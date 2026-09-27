package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tp.c f76364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, sp.b> f76365b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sp.b f76366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d<n> f76367d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f76368b;

        public a(Activity activity) {
            this.f76368b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.f76366c.show(this.f76368b);
        }
    }

    public l(d<n> dVar) {
        this.f76367d = dVar;
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void a(Context context, String str, sp.e eVar, tp.b bVar) {
        this.f76364a.a(context, str, eVar, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void b(Context context, List<sp.e> list, tp.b bVar) {
        this.f76364a.b(context, list, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void c(Context context, boolean z10, tp.b bVar) {
        this.f76364a.c(context, z10, bVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Activity activity, String str, String str2) {
        sp.b bVar = this.f76365b.get(str2);
        if (bVar != null) {
            this.f76366c = bVar;
            m.a(new a(activity));
            return;
        }
        this.f76367d.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
