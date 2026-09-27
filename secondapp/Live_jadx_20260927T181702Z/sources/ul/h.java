package ul;

import android.content.Context;
import zj.l;
import zj.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        String a(T t10);
    }

    public static zj.g<?> b(String str, String str2) {
        return zj.g.o(f.a(str, str2), f.class);
    }

    public static zj.g<?> c(final String str, final a<Context> aVar) {
        return zj.g.q(f.class).b(w.l(Context.class)).f(new l() { // from class: ul.g
            @Override // zj.l
            public final Object a(zj.i iVar) {
                return f.a(str, aVar.a((Context) iVar.a(Context.class)));
            }
        }).d();
    }
}
