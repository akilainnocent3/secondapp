package androidx.work;

import dr.z0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final /* synthetic */ <T> boolean a(e eVar, String key) {
        m0.p(eVar, "<this>");
        m0.p(key, "key");
        m0.y(4, "T");
        return eVar.C(key, Object.class);
    }

    @oy.l
    public static final e b(@oy.l z0<String, ? extends Object>... pairs) throws Throwable {
        m0.p(pairs, "pairs");
        e.a aVar = new e.a();
        int length = pairs.length;
        int i10 = 0;
        while (i10 < length) {
            z0<String, ? extends Object> z0Var = pairs[i10];
            i10++;
            aVar.b(z0Var.j(), z0Var.k());
        }
        e eVarA = aVar.a();
        m0.o(eVarA, "dataBuilder.build()");
        return eVarA;
    }
}
