package vu;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class s<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final ConcurrentHashMap<String, Integer> f141667a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final AtomicInteger f141668b = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends o0 implements ds.l<String, Integer> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s<K, V> f141669g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s<K, V> sVar) {
            super(1);
            this.f141669g = sVar;
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@oy.l String it) {
            m0.p(it, "it");
            return Integer.valueOf(this.f141669g.f141668b.getAndIncrement());
        }
    }

    public abstract int b(@oy.l ConcurrentHashMap<String, Integer> concurrentHashMap, @oy.l String str, @oy.l ds.l<? super String, Integer> lVar);

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public final <T extends V, KK extends K> n<K, V, T> c(@oy.l ns.d<KK> kClass) {
        m0.p(kClass, "kClass");
        return new n<>(kClass, d(kClass));
    }

    public final <T extends K> int d(@oy.l ns.d<T> kClass) {
        m0.p(kClass, "kClass");
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f141667a;
        String strY = kClass.y();
        m0.m(strY);
        return b(concurrentHashMap, strY, new a(this));
    }

    @oy.l
    public final Collection<Integer> e() {
        Collection<Integer> collectionValues = this.f141667a.values();
        m0.o(collectionValues, "idPerType.values");
        return collectionValues;
    }
}
