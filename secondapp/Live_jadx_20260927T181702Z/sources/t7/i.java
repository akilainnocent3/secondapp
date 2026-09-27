package t7;

import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i {
    @oy.l
    public static final h a(@oy.l String name, @oy.l ds.l<? super androidx.navigation.e, w2> builder) {
        kotlin.jvm.internal.m0.p(name, "name");
        kotlin.jvm.internal.m0.p(builder, "builder");
        androidx.navigation.e eVar = new androidx.navigation.e();
        builder.invoke(eVar);
        return new h(name, eVar.a());
    }
}
