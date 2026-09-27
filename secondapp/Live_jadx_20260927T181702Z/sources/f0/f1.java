package f0;

import com.ironsource.G5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n59#2,5:357\n59#2,5:362\n45#2,5:382\n45#2,5:390\n26#3,2:367\n26#3,2:370\n26#3,2:373\n26#3,2:376\n26#3,2:379\n26#3,2:387\n26#3,2:395\n26#3,2:398\n26#3,2:401\n26#3,2:404\n26#3,2:407\n26#3,2:410\n26#3,2:413\n26#3,2:416\n26#3,2:421\n26#4:369\n26#4:372\n26#4:375\n26#4:378\n26#4:381\n26#4:389\n26#4:397\n26#4:400\n26#4:403\n26#4:406\n26#4:409\n26#4:412\n26#4:415\n26#4:418\n26#4:423\n1855#5,2:419\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n62#1:357,5\n83#1:362,5\n170#1:382,5\n245#1:390,5\n85#1:367,2\n96#1:370,2\n113#1:373,2\n140#1:376,2\n169#1:379,2\n198#1:387,2\n267#1:395,2\n274#1:398,2\n277#1:401,2\n280#1:404,2\n283#1:407,2\n286#1:410,2\n289#1:413,2\n298#1:416,2\n306#1:421,2\n85#1:369\n96#1:372\n113#1:375\n140#1:378\n169#1:381\n198#1:389\n267#1:397\n274#1:400\n277#1:403\n280#1:406\n283#1:409\n286#1:412\n289#1:415\n298#1:418\n306#1:423\n300#1:419,2\n*E\n"})
public class f1<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @oy.l
    private final g0.b lock;

    @oy.l
    private final g0.d<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public f1(@k.e0(from = 1, to = 2147483647L) int i10) {
        this.maxSize = i10;
        if (!(i10 > 0)) {
            g0.f.c("maxSize <= 0");
        }
        this.map = new g0.d<>(0, 0.75f);
        this.lock = new g0.b();
    }

    public final int a(K k10, V v10) {
        int iSizeOf = sizeOf(k10, v10);
        if (!(iSizeOf >= 0)) {
            g0.f.d("Negative size: " + k10 + G5.T + v10);
        }
        return iSizeOf;
    }

    @oy.m
    public V create(@oy.l K key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.createCount;
        }
        return i10;
    }

    public void entryRemoved(boolean z10, @oy.l K key, @oy.l V oldValue, @oy.m V v10) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @oy.m
    public final V get(@oy.l K key) {
        V v10;
        kotlin.jvm.internal.m0.p(key, "key");
        synchronized (this.lock) {
            V vA = this.map.a(key);
            if (vA != null) {
                this.hitCount++;
                return vA;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v10 = (V) this.map.d(key, vCreate);
                    if (v10 != null) {
                        this.map.d(key, v10);
                    } else {
                        this.size += a(key, vCreate);
                        dr.w2 w2Var = dr.w2.f79517a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v10 != null) {
                entryRemoved(false, key, vCreate, v10);
                return v10;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.missCount;
        }
        return i10;
    }

    @oy.m
    public final V put(@oy.l K key, @oy.l V value) {
        V vD;
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += a(key, value);
                vD = this.map.d(key, value);
                if (vD != null) {
                    this.size -= a(key, vD);
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vD != null) {
            entryRemoved(false, key, vD, value);
        }
        trimToSize(this.maxSize);
        return vD;
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    @oy.m
    public final V remove(@oy.l K key) {
        V vE;
        kotlin.jvm.internal.m0.p(key, "key");
        synchronized (this.lock) {
            try {
                vE = this.map.e(key);
                if (vE != null) {
                    this.size -= a(key, vE);
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vE != null) {
            entryRemoved(false, key, vE, null);
        }
        return vE;
    }

    public void resize(@k.e0(from = 1, to = 2147483647L) int i10) {
        if (!(i10 > 0)) {
            g0.f.c("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i10;
            dr.w2 w2Var = dr.w2.f79517a;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    public int sizeOf(@oy.l K key, @oy.l V value) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oy.l
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.b().size());
            Iterator<T> it = this.map.b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @oy.l
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void trimToSize(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (!(this.size >= 0 && (!this.map.c() || this.size == 0))) {
                        g0.f.d("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.size <= i10 || this.map.c()) {
                        break;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) fr.r0.J2(this.map.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.map.e((K) key);
                    this.size -= a(key, value);
                    this.evictionCount++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
