package ul;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d f139587b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<f> f139588a = new HashSet();

    public static d a() {
        d dVar;
        d dVar2 = f139587b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f139587b;
                if (dVar == null) {
                    dVar = new d();
                    f139587b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f139588a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f139588a);
        }
        return setUnmodifiableSet;
    }

    public void c(String str, String str2) {
        synchronized (this.f139588a) {
            this.f139588a.add(f.a(str, str2));
        }
    }
}
