package f0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f81907a = 2147483647L;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.p<Object, Object, Integer> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f81908g = new a();

        public a() {
            super(2);
        }

        @Override // ds.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj, Object obj2) {
            kotlin.jvm.internal.m0.p(obj, "<anonymous parameter 0>");
            kotlin.jvm.internal.m0.p(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<Object, Object> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f81909g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        public final Object invoke(Object it) {
            kotlin.jvm.internal.m0.p(it, "it");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends kotlin.jvm.internal.o0 implements ds.r<Boolean, Object, Object, Object, dr.w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f81910g = new c();

        public c() {
            super(4);
        }

        public final void a(boolean z10, Object obj, Object obj2, Object obj3) {
            kotlin.jvm.internal.m0.p(obj, "<anonymous parameter 1>");
            kotlin.jvm.internal.m0.p(obj2, "<anonymous parameter 2>");
        }

        @Override // ds.r
        public /* bridge */ /* synthetic */ dr.w2 invoke(Boolean bool, Object obj, Object obj2, Object obj3) {
            a(bool.booleanValue(), obj, obj2, obj3);
            return dr.w2.f79517a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d<K, V> extends f1<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ds.p<K, V, Integer> f81911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l<K, V> f81912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ds.r<Boolean, K, V, V, dr.w2> f81913c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i10, ds.p<? super K, ? super V, Integer> pVar, ds.l<? super K, ? extends V> lVar, ds.r<? super Boolean, ? super K, ? super V, ? super V, dr.w2> rVar) {
            super(i10);
            this.f81911a = pVar;
            this.f81912b = lVar;
            this.f81913c = rVar;
        }

        @Override // f0.f1
        public V create(K key) {
            kotlin.jvm.internal.m0.p(key, "key");
            return this.f81912b.invoke(key);
        }

        @Override // f0.f1
        public void entryRemoved(boolean z10, K key, V oldValue, V v10) {
            kotlin.jvm.internal.m0.p(key, "key");
            kotlin.jvm.internal.m0.p(oldValue, "oldValue");
            this.f81913c.invoke(Boolean.valueOf(z10), key, oldValue, v10);
        }

        @Override // f0.f1
        public int sizeOf(K key, V value) {
            kotlin.jvm.internal.m0.p(key, "key");
            kotlin.jvm.internal.m0.p(value, "value");
            return this.f81911a.invoke(key, value).intValue();
        }
    }

    @oy.l
    public static final <K, V> f1<K, V> a(int i10, @oy.l ds.p<? super K, ? super V, Integer> sizeOf, @oy.l ds.l<? super K, ? extends V> create, @oy.l ds.r<? super Boolean, ? super K, ? super V, ? super V, dr.w2> onEntryRemoved) {
        kotlin.jvm.internal.m0.p(sizeOf, "sizeOf");
        kotlin.jvm.internal.m0.p(create, "create");
        kotlin.jvm.internal.m0.p(onEntryRemoved, "onEntryRemoved");
        return new d(i10, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ f1 b(int i10, ds.p sizeOf, ds.l create, ds.r onEntryRemoved, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            sizeOf = a.f81908g;
        }
        if ((i11 & 4) != 0) {
            create = b.f81909g;
        }
        if ((i11 & 8) != 0) {
            onEntryRemoved = c.f81910g;
        }
        kotlin.jvm.internal.m0.p(sizeOf, "sizeOf");
        kotlin.jvm.internal.m0.p(create, "create");
        kotlin.jvm.internal.m0.p(onEntryRemoved, "onEntryRemoved");
        return new d(i10, sizeOf, create, onEntryRemoved);
    }
}
