package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes4.dex */
public final class brh implements l730 {
    public final vqh a;
    public final xqh b;
    public final wqh c;
    public final arh d;
    public final yqh e;
    public final uqh f;
    public final zqh g;

    public brh(vqh vqhVar, xqh xqhVar, wqh wqhVar, arh arhVar, yqh yqhVar, uqh uqhVar, zqh zqhVar) {
        this.a = vqhVar;
        this.b = xqhVar;
        this.c = wqhVar;
        this.d = arhVar;
        this.e = yqhVar;
        this.f = uqhVar;
        this.g = zqhVar;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new rqh((yoh) this.a.get(), (n730) this.b.get(), (sph) this.c.get(), (n730) this.d.get(), (RemoteConfigManager) this.e.get(), (bpa) this.f.get(), (SessionManager) this.g.get());
    }
}
