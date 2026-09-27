package aq;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> implements sp.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f20335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f20336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sp.d f20337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zp.a f20338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f20339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.d f20340f;

    public a(Context context, sp.d dVar, zp.a aVar, com.unity3d.scar.adapter.common.d dVar2) {
        this.f20336b = context;
        this.f20337c = dVar;
        this.f20338d = aVar;
        this.f20340f = dVar2;
    }

    @Override // sp.a
    public void a(sp.c cVar) {
        AdRequest adRequestB = this.f20338d.b(this.f20337c.a());
        if (cVar != null) {
            this.f20339e.a(cVar);
        }
        b(adRequestB, cVar);
    }

    public abstract void b(AdRequest adRequest, sp.c cVar);

    public void c(T t10) {
        this.f20335a = t10;
    }
}
