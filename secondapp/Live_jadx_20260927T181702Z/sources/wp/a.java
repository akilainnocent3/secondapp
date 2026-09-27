package wp;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> implements sp.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f143691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f143692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sp.d f143693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vp.a f143694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f143695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.d f143696f;

    public a(Context context, sp.d dVar, vp.a aVar, com.unity3d.scar.adapter.common.d dVar2) {
        this.f143692b = context;
        this.f143693c = dVar;
        this.f143694d = aVar;
        this.f143696f = dVar2;
    }

    @Override // sp.a
    public void a(sp.c cVar) {
        AdRequest adRequestB = this.f143694d.b(this.f143693c.a());
        if (cVar != null) {
            this.f143695e.a(cVar);
        }
        b(adRequestB, cVar);
    }

    public abstract void b(AdRequest adRequest, sp.c cVar);

    public void c(T t10) {
        this.f143691a = t10;
    }
}
