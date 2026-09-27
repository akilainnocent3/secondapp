package yc;

import ad.e;
import ad.f;
import ad.h;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a implements ed.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f159153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f159154b;

    public a(gd.a aVar, cd.a aVar2) {
        gd.b.f86434b.f86435a = aVar;
        cd.b.f22977b.f22978a = aVar2;
    }

    public void authenticate() {
        jd.c.f99785a.execute(new b(this));
    }

    public void destroy() {
        this.f159154b = null;
        this.f159153a.destroy();
    }

    public String getOdt() {
        c cVar = this.f159154b;
        return cVar != null ? cVar.f159156a : "";
    }

    public boolean isAuthenticated() {
        return this.f159153a.h();
    }

    public boolean isConnected() {
        return this.f159153a.a();
    }

    @Override // ed.b
    public void onCredentialsRequestFailed(String str) {
        this.f159153a.onCredentialsRequestFailed(str);
    }

    @Override // ed.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f159153a.onCredentialsRequestSuccess(str, str2);
    }

    public a(Context context, gd.a aVar, boolean z10, ed.a aVar2) {
        this(aVar, null);
        this.f159153a = new h(new e(context), false, z10, aVar2, this);
    }
}
