package defpackage;

import com.google.protobuf.Reader;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
public class jpu extends ipu {
    public static int a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Reader.READ_DONE;
    }

    public static <K, V> Map<K, V> b(Pair<? extends K, ? extends V> pair) {
        pair.getClass();
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.a, pair.b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
