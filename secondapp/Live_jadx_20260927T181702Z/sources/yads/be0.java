package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class be0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl2 f147152a;

    public /* synthetic */ be0() {
        this(new zl2());
    }

    public final String a(String str, Map map) {
        Map mapO0 = fr.n1.o0(map, fr.m1.k(dr.v1.a("{CLIENT_TIME}", String.valueOf(System.currentTimeMillis()))));
        this.f147152a.getClass();
        String strZ2 = str;
        for (Map.Entry entry : mapO0.entrySet()) {
            strZ2 = cv.k0.z2(strZ2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strZ2;
    }

    public be0(zl2 zl2Var) {
        this.f147152a = zl2Var;
    }
}
