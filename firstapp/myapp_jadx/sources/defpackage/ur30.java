package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sportybet.plugin.realsports.data.RSelection;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
public final class ur30 {
    public final mpe0 a = hwr.b(new tr30());

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"ur30$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/plugin/realsports/data/RSelection;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends RSelection>> {
    }

    public final String a(List<? extends RSelection> list) {
        Object bVar;
        if (list == null) {
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = ((eal) this.a.getValue()).j(list);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        return (String) (bVar instanceof zi50.b ? null : bVar);
    }

    public final List<RSelection> b(String str) {
        Object bVar;
        if (str == null) {
            return m2g.a;
        }
        Type type = new a().getType();
        try {
            zi50.a aVar = zi50.b;
            bVar = (List) ((eal) this.a.getValue()).f(str, type);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        List<RSelection> list = (List) bVar;
        return list == null ? m2g.a : list;
    }
}
