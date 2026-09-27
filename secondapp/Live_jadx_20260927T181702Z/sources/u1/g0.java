package u1;

import android.os.PersistableBundle;
import dr.z0;
import java.util.Map;
import k.t0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n13579#2,2:156\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n35#1:156,2\n*E\n"})
public final class g0 {
    @t0(21)
    @oy.l
    public static final PersistableBundle a() {
        return e0.a(0);
    }

    @t0(21)
    @oy.l
    public static final PersistableBundle b(@oy.l z0<String, ? extends Object>... z0VarArr) {
        PersistableBundle persistableBundleA = e0.a(z0VarArr.length);
        for (z0<String, ? extends Object> z0Var : z0VarArr) {
            e0.b(persistableBundleA, z0Var.d(), z0Var.g());
        }
        return persistableBundleA;
    }

    @t0(21)
    @oy.l
    public static final PersistableBundle c(@oy.l Map<String, ? extends Object> map) {
        PersistableBundle persistableBundleA = e0.a(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            e0.b(persistableBundleA, entry.getKey(), entry.getValue());
        }
        return persistableBundleA;
    }
}
