package yads;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d11 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f147991b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f147992a = f147991b;

    public final boolean a(int i10, String str) {
        Object objB;
        ConcurrentHashMap concurrentHashMap = this.f147992a;
        Object objValueOf = concurrentHashMap.get(str);
        if (objValueOf == null) {
            try {
                dr.i1.a aVar = dr.i1.f79460c;
                objB = dr.i1.b(Boolean.valueOf(InetAddress.getByName(str).isReachable(i10)));
            } catch (Throwable th2) {
                dr.i1.a aVar2 = dr.i1.f79460c;
                objB = dr.i1.b(dr.j1.a(th2));
            }
            if (dr.i1.i(objB)) {
                objB = null;
            }
            Boolean bool = (Boolean) objB;
            objValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, objValueOf);
            if (objPutIfAbsent != null) {
                objValueOf = objPutIfAbsent;
            }
        }
        return ((Boolean) objValueOf).booleanValue();
    }
}
