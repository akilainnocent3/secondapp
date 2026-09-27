package ah;

import java.util.UUID;
import re.x2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n {
    static {
        l.b bVar = l.b.f5268a;
    }

    public static /* synthetic */ l a(x2 x2Var) {
        String string = UUID.randomUUID().toString();
        String str = x2Var.f127027b;
        if (str == null) {
            str = "";
        }
        return new l(string, str, new l.b.a());
    }
}
