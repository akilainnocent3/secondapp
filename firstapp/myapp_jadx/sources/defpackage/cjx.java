package defpackage;

import android.net.Uri;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public interface cjx extends Serializable {
    default List<nex> G0() {
        return m2g.a;
    }

    default List<pgx> O0() {
        tgx tgxVar = new tgx();
        tgxVar.b = getUri();
        Unit unit = Unit.a;
        return a.c(tgxVar.a());
    }

    default String b1(LinkedHashMap linkedHashMap) {
        Object bVar;
        String uri = getUri();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                zi50.a aVar = zi50.b;
                bVar = Uri.encode(new eal().j(entry.getValue()));
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (zi50.a(bVar) != null) {
                bVar = "";
            }
            String str = (String) bVar;
            String str2 = "{" + entry.getKey() + "}";
            str.getClass();
            uri = c.p(uri, str2, str, false);
        }
        return uri;
    }

    default String getLabel() {
        return "Route_".concat(getClass().getSimpleName());
    }

    default String getUri() {
        String label = getLabel();
        m2g.a.getClass();
        return !G0().isEmpty() ? tug.a(label, "?", CollectionsKt.a0(G0(), "&", null, null, new l8j(1), 30)) : label;
    }
}
