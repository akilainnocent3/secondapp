package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class sex {
    public static final m390<zn20> a(Context context, String str, Map<String, String> map) {
        map.getClass();
        return new m390<>(context, str, map.keySet(), null, b(null, new ym5(str, map), 1), 8);
    }

    public static rex b(o8e o8eVar, Function1 function1, int i) {
        Function1 pexVar = o8eVar;
        if ((i & 1) != 0) {
            pexVar = new pex();
        }
        if ((i & 2) != 0) {
            function1 = new qex();
        }
        return new rex(function1, pexVar, null);
    }
}
