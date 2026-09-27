package z5;

import java.util.UUID;
import u4.c1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i {
    static {
        g.c cVar = g.c.f160363a;
    }

    public static /* synthetic */ g a(c1 c1Var) {
        String string = UUID.randomUUID().toString();
        String str = c1Var.f138143a;
        if (str == null) {
            str = "";
        }
        return new g(string, str, new g.c.a());
    }
}
