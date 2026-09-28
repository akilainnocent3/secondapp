package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
public final class x9e0 {
    public final mpe0 a = hwr.b(new w9e0());

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"x9e0$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "database"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends String>> {
    }

    public final List<String> a(String str) {
        Object bVar;
        if (str == null) {
            return null;
        }
        Type type = new a().getType();
        try {
            zi50.a aVar = zi50.b;
            bVar = (List) ((eal) this.a.getValue()).f(str, type);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        return (List) (bVar instanceof zi50.b ? null : bVar);
    }

    public final String b(List<String> list) {
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
}
