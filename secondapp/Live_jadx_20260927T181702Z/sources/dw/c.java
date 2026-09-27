package dw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    @cs.j(name = "throwSubtypeNotRegistered")
    @oy.l
    public static final Void a(@oy.m String str, @oy.l ns.d<?> baseClass) {
        String str2;
        kotlin.jvm.internal.m0.p(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.K() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + kj.e.f102543c;
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.K() + "' has to be sealed and '@Serializable'.";
        }
        throw new zv.c0(str2);
    }

    @cs.j(name = "throwSubtypeNotRegistered")
    @oy.l
    public static final Void b(@oy.l ns.d<?> subClass, @oy.l ns.d<?> baseClass) {
        kotlin.jvm.internal.m0.p(subClass, "subClass");
        kotlin.jvm.internal.m0.p(baseClass, "baseClass");
        String strK = subClass.K();
        if (strK == null) {
            strK = String.valueOf(subClass);
        }
        a(strK, baseClass);
        throw new dr.e0();
    }
}
