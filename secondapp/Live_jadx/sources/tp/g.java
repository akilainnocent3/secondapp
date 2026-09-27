package tp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, T> f137133a = new ConcurrentHashMap();

    public T a(String str) {
        return this.f137133a.get(str);
    }

    public void b(String str, T t10) {
        this.f137133a.put(str, t10);
    }
}
