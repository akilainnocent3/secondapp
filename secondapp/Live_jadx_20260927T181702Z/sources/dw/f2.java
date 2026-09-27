package dw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n37#3,2:192\n1797#4,3:194\n*S KotlinDebug\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n74#1:192,2\n160#1:194,3\n*E\n"})
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final bw.f[] f79553a = new bw.f[0];

    @oy.l
    public static final Set<String> a(@oy.l bw.f fVar) {
        kotlin.jvm.internal.m0.p(fVar, "<this>");
        if (fVar instanceof n) {
            return ((n) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.e());
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            hashSet.add(fVar.f(i10));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dr.f1
    @oy.l
    public static final <T> zv.e<T> b(@oy.l zv.e<?> eVar) {
        kotlin.jvm.internal.m0.p(eVar, "<this>");
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dr.f1
    @oy.l
    public static final <T> zv.j<T> c(@oy.l zv.j<?> jVar) {
        kotlin.jvm.internal.m0.p(jVar, "<this>");
        return jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dr.f1
    @oy.l
    public static final <T> zv.d0<T> d(@oy.l zv.d0<?> d0Var) {
        kotlin.jvm.internal.m0.p(d0Var, "<this>");
        return d0Var;
    }

    @oy.l
    public static final bw.f[] e(@oy.m List<? extends bw.f> list) {
        bw.f[] fVarArr;
        List<? extends bw.f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (bw.f[]) list.toArray(new bw.f[0])) == null) ? f79553a : fVarArr;
    }

    public static final <T, K> int f(@oy.l Iterable<? extends T> iterable, @oy.l ds.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        kotlin.jvm.internal.m0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            int i10 = iHashCode * 31;
            K kInvoke = selector.invoke(it.next());
            iHashCode = i10 + (kInvoke != null ? kInvoke.hashCode() : 0);
        }
        return iHashCode;
    }

    @oy.l
    public static final ns.d<Object> g(@oy.l ns.s sVar) {
        kotlin.jvm.internal.m0.p(sVar, "<this>");
        ns.g gVarN = sVar.n();
        if (gVarN instanceof ns.d) {
            return (ns.d) gVarN;
        }
        if (!(gVarN instanceof ns.t)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + gVarN);
        }
        throw new IllegalArgumentException("Captured type parameter " + gVarN + " from generic non-reified function. Such functionality cannot be supported because " + gVarN + " is erased, either specify serializer explicitly or make calling function inline with reified " + gVarN + kj.e.f102543c);
    }

    @oy.l
    public static final String h(@oy.l String className) {
        kotlin.jvm.internal.m0.p(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    @oy.l
    public static final String i(@oy.l ns.d<?> dVar) {
        kotlin.jvm.internal.m0.p(dVar, "<this>");
        String strK = dVar.K();
        if (strK == null) {
            strK = "<local class name not available>";
        }
        return h(strK);
    }

    @oy.l
    public static final Void j(@oy.l ns.d<?> dVar) {
        kotlin.jvm.internal.m0.p(dVar, "<this>");
        throw new zv.c0(i(dVar));
    }

    @oy.l
    public static final ns.s k(@oy.l ns.u uVar) {
        kotlin.jvm.internal.m0.p(uVar, "<this>");
        ns.s sVarG = uVar.g();
        if (sVarG != null) {
            return sVarG;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + uVar.g()).toString());
    }
}
