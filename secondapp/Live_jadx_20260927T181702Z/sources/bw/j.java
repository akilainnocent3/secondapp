package bw;

import java.util.Iterator;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<f>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f22010c;

        public a(f fVar) {
            this.f22010c = fVar;
            this.f22009b = fVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f22010c;
            int iE = fVar.e();
            int i10 = this.f22009b;
            this.f22009b = i10 - 1;
            return fVar.d(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22009b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements Iterator<String>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f22012c;

        public b(f fVar) {
            this.f22012c = fVar;
            this.f22011b = fVar.e();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f22012c;
            int iE = fVar.e();
            int i10 = this.f22011b;
            this.f22011b = i10 - 1;
            return fVar.f(iE - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22011b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,17:1\n293#2,8:18\n*E\n"})
    public static final class c implements Iterable<f>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f22013b;

        public c(f fVar) {
            this.f22013b = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a(this.f22013b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,17:1\n309#2,8:18\n*E\n"})
    public static final class d implements Iterable<String>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f22014b;

        public d(f fVar) {
            this.f22014b = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f22014b);
        }
    }

    @oy.l
    public static final Iterable<f> a(@oy.l f fVar) {
        m0.p(fVar, "<this>");
        return new c(fVar);
    }

    @oy.l
    public static final Iterable<String> c(@oy.l f fVar) {
        m0.p(fVar, "<this>");
        return new d(fVar);
    }

    @zv.g
    public static /* synthetic */ void b(f fVar) {
    }

    @zv.g
    public static /* synthetic */ void d(f fVar) {
    }
}
