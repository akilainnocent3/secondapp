package rr;

import java.lang.reflect.Method;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final j f127475a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f127476b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public static a f127477c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @cs.g
        @oy.m
        public final Method f127478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @cs.g
        @oy.m
        public final Method f127479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @cs.g
        @oy.m
        public final Method f127480c;

        public a(@oy.m Method method, @oy.m Method method2, @oy.m Method method3) {
            this.f127478a = method;
            this.f127479b = method2;
            this.f127480c = method3;
        }
    }

    public final a a(rr.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f127477c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f127476b;
            f127477c = aVar3;
            return aVar3;
        }
    }

    @oy.m
    public final String b(@oy.l rr.a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        m0.p(continuation, "continuation");
        a aVarA = f127477c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f127476b && (method = aVarA.f127478a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f127479b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f127480c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
