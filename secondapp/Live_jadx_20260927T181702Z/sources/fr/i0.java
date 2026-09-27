package fr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class i0 extends h0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    public static final class a<T> implements Iterable<T>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.a<Iterator<T>> f85117b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ds.a<? extends Iterator<? extends T>> aVar) {
            this.f85117b = aVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f85117b.invoke();
        }
    }

    @ur.f
    public static final <T> Iterable<T> c0(ds.a<? extends Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.m0.p(iterator, "iterator");
        return new a(iterator);
    }

    @dr.f1
    public static <T> int d0(@oy.l Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    @dr.f1
    @oy.m
    public static final <T> Integer e0(@oy.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @oy.l
    public static <T> List<T> f0(@oy.l Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, it.next());
        }
        return arrayList;
    }

    @oy.l
    public static final <T, R> dr.z0<List<T>, List<R>> g0(@oy.l Iterable<? extends dr.z0<? extends T, ? extends R>> iterable) {
        kotlin.jvm.internal.m0.p(iterable, "<this>");
        int iD0 = d0(iterable, 10);
        ArrayList arrayList = new ArrayList(iD0);
        ArrayList arrayList2 = new ArrayList(iD0);
        for (dr.z0<? extends T, ? extends R> z0Var : iterable) {
            arrayList.add(z0Var.j());
            arrayList2.add(z0Var.k());
        }
        return dr.v1.a(arrayList, arrayList2);
    }
}
