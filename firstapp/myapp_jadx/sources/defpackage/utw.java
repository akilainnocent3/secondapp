package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class utw<E> extends si80<E> implements jhp {
    public final stw<E> b;

    public static final class a implements Iterator<E>, dhp {
        public int a = -1;
        public final vc80 b;
        public final /* synthetic */ utw<E> c;

        /* JADX INFO: renamed from: utw$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
        public static final class C1179a extends ji50 implements Function2<wc80<? super E>, v1b<? super Unit>, Object> {
            public final /* synthetic */ utw<E> A;
            public final /* synthetic */ a B;
            public a b;
            public utw c;
            public long[] d;
            public int e;
            public int f;
            public int i;
            public int v;
            public long w;
            public int y;
            public /* synthetic */ Object z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1179a(utw<E> utwVar, a aVar, v1b<? super C1179a> v1bVar) {
                super(2, v1bVar);
                this.A = utwVar;
                this.B = aVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1179a c1179a = new C1179a(this.A, this.B, v1bVar);
                c1179a.z = obj;
                return c1179a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
                return ((C1179a) create((wc80) obj, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0053  */
            /* JADX WARN: Code duplicated, block: B:20:0x0099 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x009b  */
            /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:22:0x00a1). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0066). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:19:0x0096). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    r21 = this;
                    r0 = r21
                    y5b r1 = defpackage.y5b.a
                    int r2 = r0.y
                    r3 = 0
                    r4 = 8
                    r5 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r5) goto L27
                    int r2 = r0.v
                    int r6 = r0.i
                    long r7 = r0.w
                    int r9 = r0.f
                    int r10 = r0.e
                    long[] r11 = r0.d
                    utw r12 = r0.c
                    utw$a r13 = r0.b
                    java.lang.Object r14 = r0.z
                    wc80 r14 = (defpackage.wc80) r14
                    defpackage.uj50.b(r22)
                    goto L96
                L27:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r0)
                    r0 = 0
                    return r0
                L2e:
                    defpackage.uj50.b(r22)
                    java.lang.Object r2 = r0.z
                    wc80 r2 = (defpackage.wc80) r2
                    utw<E> r6 = r0.A
                    stw<E> r7 = r6.b
                    long[] r7 = r7.a
                    int r8 = r7.length
                    int r8 = r8 + (-2)
                    if (r8 < 0) goto La6
                    utw$a r9 = r0.B
                    r10 = r3
                L43:
                    r11 = r7[r10]
                    long r13 = ~r11
                    r15 = 7
                    long r13 = r13 << r15
                    long r13 = r13 & r11
                    r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r13 = r13 & r15
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 == 0) goto La1
                    int r13 = r10 - r8
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    int r13 = 8 - r13
                    r14 = r2
                    r2 = r3
                    r19 = r11
                    r12 = r6
                    r11 = r7
                    r6 = r13
                    r13 = r9
                    r9 = r10
                    r10 = r8
                    r7 = r19
                L66:
                    if (r2 >= r6) goto L99
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r7
                    r17 = 128(0x80, double:6.3E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto L96
                    int r3 = r9 << 3
                    int r3 = r3 + r2
                    r13.a = r3
                    stw<E> r4 = r12.b
                    java.lang.Object[] r4 = r4.b
                    r3 = r4[r3]
                    r0.z = r14
                    r0.b = r13
                    r0.c = r12
                    r0.d = r11
                    r0.e = r10
                    r0.f = r9
                    r0.w = r7
                    r0.i = r6
                    r0.v = r2
                    r0.y = r5
                    r14.b(r0, r3)
                    y5b r0 = defpackage.y5b.a
                    return r1
                L96:
                    long r7 = r7 >> r4
                    int r2 = r2 + r5
                    goto L66
                L99:
                    if (r6 != r4) goto La6
                    r8 = r10
                    r7 = r11
                    r6 = r12
                    r2 = r14
                    r10 = r9
                    r9 = r13
                La1:
                    if (r10 == r8) goto La6
                    int r10 = r10 + 1
                    goto L43
                La6:
                    kotlin.Unit r0 = kotlin.Unit.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: utw.a.C1179a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(utw<E> utwVar) {
            this.c = utwVar;
            this.b = zc80.a(new C1179a(utwVar, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.a;
            if (i != -1) {
                this.c.b.m(i);
                this.a = -1;
            }
        }
    }

    public utw(stw<E> stwVar) {
        super(stwVar);
        this.b = stwVar;
    }

    @Override // defpackage.si80, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.b.d(e);
    }

    @Override // defpackage.si80, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        stw<E> stwVar = this.b;
        int i = stwVar.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            stwVar.k((E) it.next());
        }
        return i != stwVar.d;
    }

    @Override // defpackage.si80, java.util.Set, java.util.Collection
    public final void clear() {
        this.b.e();
    }

    @Override // defpackage.si80, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // defpackage.si80, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.l(obj);
    }

    @Override // defpackage.si80, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        collection.getClass();
        stw<E> stwVar = this.b;
        int i = stwVar.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            stwVar.i((E) it.next());
        }
        return i != stwVar.d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:5:0x0014->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[EDGE_INSN: B:24:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0053], SYNTHETIC] */
    @Override // defpackage.si80, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        stw<E> stwVar = this.b;
        Object[] objArr = stwVar.b;
        int i = stwVar.d;
        long[] jArr = stwVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.M(collection, objArr[i5])) {
                                stwVar.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != stwVar.d;
    }
}
