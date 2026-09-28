package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hag<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, dhp {
    public final ez60<K, V> a;

    @c0d(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
    public static final class a extends ji50 implements Function2<wc80<? super Map.Entry<? extends K, ? extends V>>, v1b<? super Unit>, Object> {
        public hag b;
        public long[] c;
        public int d;
        public int e;
        public int f;
        public int i;
        public long v;
        public int w;
        public /* synthetic */ Object y;
        public final /* synthetic */ hag<K, V> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hag<K, V> hagVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.z = hagVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.z, v1bVar);
            aVar.y = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
            return ((a) create((wc80) obj, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004f  */
        /* JADX WARN: Code duplicated, block: B:20:0x0099 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x009b  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:22:0x009f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:14:0x0061). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:19:0x0096). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                y5b r1 = defpackage.y5b.a
                int r2 = r0.w
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L2c
                if (r2 != r5) goto L25
                int r2 = r0.i
                int r6 = r0.f
                long r7 = r0.v
                int r9 = r0.e
                int r10 = r0.d
                long[] r11 = r0.c
                hag r12 = r0.b
                java.lang.Object r13 = r0.y
                wc80 r13 = (defpackage.wc80) r13
                defpackage.uj50.b(r21)
                goto L96
            L25:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                r0 = 0
                return r0
            L2c:
                defpackage.uj50.b(r21)
                java.lang.Object r2 = r0.y
                wc80 r2 = (defpackage.wc80) r2
                hag<K, V> r6 = r0.z
                ez60<K, V> r7 = r6.a
                long[] r7 = r7.a
                int r8 = r7.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La4
                r9 = r3
            L3f:
                r10 = r7[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9f
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r12
                r12 = r6
                r6 = r13
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r7
                r10 = r8
                r7 = r18
            L61:
                if (r2 >= r6) goto L99
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L96
                int r3 = r9 << 3
                int r3 = r3 + r2
                eou r4 = new eou
                ez60<K, V> r14 = r12.a
                java.lang.Object[] r15 = r14.b
                r15 = r15[r3]
                java.lang.Object[] r14 = r14.c
                r3 = r14[r3]
                r4.<init>(r15, r3)
                r0.y = r13
                r0.b = r12
                r0.c = r11
                r0.d = r10
                r0.e = r9
                r0.v = r7
                r0.f = r6
                r0.i = r2
                r0.w = r5
                r13.b(r0, r4)
                y5b r0 = defpackage.y5b.a
                return r1
            L96:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L61
            L99:
                if (r6 != r4) goto La4
                r8 = r10
                r7 = r11
                r6 = r12
                r2 = r13
            L9f:
                if (r9 == r8) goto La4
                int r9 = r9 + 1
                goto L3f
            La4:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hag.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public hag(ez60<K, V> ez60Var) {
        ez60Var.getClass();
        this.a = ez60Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.g(this.a.d((K) entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!Intrinsics.g(this.a.d((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.e();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return zc80.a(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) e48.b(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return e48.a(this);
    }
}
