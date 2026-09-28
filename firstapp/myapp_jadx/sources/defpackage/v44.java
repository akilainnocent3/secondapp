package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class v44 {
    public static v44 b;
    public final mpe0 a;

    public v44(final Context context) {
        this.a = hwr.b(new Function0() { // from class: u44
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map<Integer, Integer> map = w44.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), context.getString(((Number) entry.getValue()).intValue()));
                }
                return linkedHashMap;
            }
        });
    }
}
