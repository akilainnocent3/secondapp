package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class htw<E> extends d3z<E> implements jhp {
    public final gtw<E> b;

    public static final class a implements Iterator<E>, dhp {
        public int a = -1;
        public final vc80 b;
        public final /* synthetic */ htw<E> c;

        /* JADX INFO: renamed from: htw$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
        public static final class C0654a extends ji50 implements Function2<wc80<? super E>, v1b<? super Unit>, Object> {
            public a b;
            public htw c;
            public long[] d;
            public int e;
            public int f;
            public /* synthetic */ Object i;
            public final /* synthetic */ htw<E> v;
            public final /* synthetic */ a w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0654a(htw<E> htwVar, a aVar, v1b<? super C0654a> v1bVar) {
                super(2, v1bVar);
                this.v = htwVar;
                this.w = aVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0654a c0654a = new C0654a(this.v, this.w, v1bVar);
                c0654a.i = obj;
                return c0654a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
                return ((C0654a) create((wc80) obj, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                wc80 wc80Var;
                htw<E> htwVar;
                long[] jArr;
                int i;
                a aVar;
                y5b y5bVar = y5b.a;
                int i2 = this.f;
                if (i2 == 0) {
                    uj50.b(obj);
                    wc80Var = (wc80) this.i;
                    htwVar = this.v;
                    gtw<E> gtwVar = htwVar.b;
                    jArr = gtwVar.c;
                    i = gtwVar.e;
                    aVar = this.w;
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.e;
                    jArr = this.d;
                    htwVar = this.c;
                    aVar = this.b;
                    wc80Var = (wc80) this.i;
                    uj50.b(obj);
                }
                if (i == Integer.MAX_VALUE) {
                    return Unit.a;
                }
                int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                aVar.a = i;
                Object obj2 = htwVar.b.b[i];
                this.i = wc80Var;
                this.b = aVar;
                this.c = htwVar;
                this.d = jArr;
                this.e = i3;
                this.f = 1;
                wc80Var.b(this, obj2);
                return y5bVar;
            }
        }

        public a(htw<E> htwVar) {
            this.c = htwVar;
            this.b = zc80.a(new C0654a(htwVar, this, null));
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
                this.c.b.h(i);
                this.a = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htw(gtw<E> gtwVar) {
        super(gtwVar);
        gtwVar.getClass();
        this.b = gtwVar;
    }

    @Override // defpackage.d3z, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.b.b(e);
    }

    @Override // defpackage.d3z, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        Collection<? extends E> collection2 = collection;
        gtw<E> gtwVar = this.b;
        gtwVar.getClass();
        collection2.getClass();
        int i = gtwVar.g;
        for (Object obj : collection2) {
            int iD = gtwVar.d((E) obj);
            gtwVar.b[iD] = obj;
            long[] jArr = gtwVar.c;
            int i2 = gtwVar.d;
            jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            gtwVar.d = iD;
            if (gtwVar.e == Integer.MAX_VALUE) {
                gtwVar.e = iD;
            }
        }
        return i != gtwVar.g;
    }

    @Override // defpackage.d3z, java.util.Set, java.util.Collection
    public final void clear() {
        this.b.c();
    }

    @Override // defpackage.d3z, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // defpackage.d3z, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.g(obj);
    }

    @Override // defpackage.d3z, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        Collection<? extends Object> collection2 = collection;
        gtw<E> gtwVar = this.b;
        gtwVar.getClass();
        collection2.getClass();
        int i = gtwVar.g;
        Iterator<T> it = collection2.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = gtwVar.f;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = gtwVar.a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (Intrinsics.g(gtwVar.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                gtwVar.h(iNumberOfTrailingZeros);
            }
        }
        return i != gtwVar.g;
    }

    @Override // defpackage.d3z, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.b.i(collection);
    }
}
