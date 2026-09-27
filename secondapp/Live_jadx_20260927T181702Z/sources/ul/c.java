package ul;

import java.util.Iterator;
import java.util.Set;
import zj.l;
import zj.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f139586b;

    public c(Set<f> set, d dVar) {
        this.f139585a = c(set);
        this.f139586b = dVar;
    }

    public static /* synthetic */ i a(zj.i iVar) {
        return new c(iVar.d(f.class), d.a());
    }

    public static zj.g<i> b() {
        return zj.g.f(i.class).b(w.p(f.class)).f(new l() { // from class: ul.b
            @Override // zj.l
            public final Object a(zj.i iVar) {
                return c.a(iVar);
            }
        }).d();
    }

    public static String c(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // ul.i
    public String getUserAgent() {
        if (this.f139586b.b().isEmpty()) {
            return this.f139585a;
        }
        return this.f139585a + ' ' + c(this.f139586b.b());
    }
}
