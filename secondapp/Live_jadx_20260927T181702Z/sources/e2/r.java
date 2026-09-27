package e2;

import android.util.LruCache;
import dr.w2;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$1\n*L\n1#1,54:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.o0 implements ds.p<Object, Object, Integer> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f79825g = new a();

        public a() {
            super(2);
        }

        @Override // ds.p
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@oy.l Object obj, @oy.l Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$2\n*L\n1#1,54:1\n*E\n"})
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<Object, Object> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f79826g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        public final Object invoke(@oy.l Object obj) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$4\n*L\n1#1,54:1\n*E\n"})
    public static final class d<K, V> extends LruCache<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ds.p<K, V, Integer> f79828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l<K, V> f79829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ds.r<Boolean, K, V, V, w2> f79830c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i10, ds.p<? super K, ? super V, Integer> pVar, ds.l<? super K, ? extends V> lVar, ds.r<? super Boolean, ? super K, ? super V, ? super V, w2> rVar) {
            super(i10);
            this.f79828a = pVar;
            this.f79829b = lVar;
            this.f79830c = rVar;
        }

        @Override // android.util.LruCache
        @oy.m
        public V create(@oy.l K k10) {
            return this.f79829b.invoke(k10);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z10, @oy.l K k10, @oy.l V v10, @oy.m V v11) {
            this.f79830c.invoke(Boolean.valueOf(z10), k10, v10, v11);
        }

        @Override // android.util.LruCache
        public int sizeOf(@oy.l K k10, @oy.l V v10) {
            return this.f79828a.invoke(k10, v10).intValue();
        }
    }

    @oy.l
    public static final <K, V> LruCache<K, V> a(int i10, @oy.l ds.p<? super K, ? super V, Integer> pVar, @oy.l ds.l<? super K, ? extends V> lVar, @oy.l ds.r<? super Boolean, ? super K, ? super V, ? super V, w2> rVar) {
        return new d(i10, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache b(int i10, ds.p pVar, ds.l lVar, ds.r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = a.f79825g;
        }
        if ((i11 & 4) != 0) {
            lVar = b.f79826g;
        }
        if ((i11 & 8) != 0) {
            rVar = c.f79827g;
        }
        return new d(i10, pVar, lVar, rVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$3\n*L\n1#1,54:1\n*E\n"})
    public static final class c extends kotlin.jvm.internal.o0 implements ds.r<Boolean, Object, Object, Object, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f79827g = new c();

        public c() {
            super(4);
        }

        @Override // ds.r
        public /* bridge */ /* synthetic */ w2 invoke(Boolean bool, Object obj, Object obj2, Object obj3) {
            a(bool.booleanValue(), obj, obj2, obj3);
            return w2.f79517a;
        }

        public final void a(boolean z10, @oy.l Object obj, @oy.l Object obj2, @oy.m Object obj3) {
        }
    }
}
