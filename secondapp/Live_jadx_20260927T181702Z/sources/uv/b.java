package uv;

import dr.j1;
import dr.w2;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import nv.i;
import nv.j;
import oy.l;
import oy.m;
import rr.d;
import rr.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b<T> implements i<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f139780c = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final Stream<T> f139781b;
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @f(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {22}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    public static final class a extends d {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f139782s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f139783t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f139784u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f139785v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b<T> f139786w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f139787x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, or.f<? super a> fVar) {
            super(fVar);
            this.f139786w = bVar;
        }

        @Override // rr.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f139785v = obj;
            this.f139787x |= Integer.MIN_VALUE;
            return this.f139786w.collect(null, this);
        }
    }

    public b(@l Stream<T> stream) {
        this.f139781b = stream;
    }

    private final /* synthetic */ int c() {
        return this.consumed$volatile;
    }

    private final /* synthetic */ void f(int i10) {
        this.consumed$volatile = i10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // nv.i
    @m
    public Object collect(@l j<? super T> jVar, @l or.f<? super w2> fVar) throws Throwable {
        a aVar;
        b<T> bVar;
        j jVar2;
        Iterator it;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f139787x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f139787x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, fVar);
            }
        } else {
            aVar = new a(this, fVar);
        }
        Object obj = aVar.f139785v;
        Object objL = qr.d.l();
        int i11 = aVar.f139787x;
        if (i11 == 0) {
            j1.n(obj);
            if (!f139780c.compareAndSet(this, 0, 1)) {
                throw new IllegalStateException("Stream.consumeAsFlow can be collected only once");
            }
            try {
                jVar2 = jVar;
                it = this.f139781b.iterator();
                bVar = this;
            } catch (Throwable th2) {
                th = th2;
                bVar = this;
                bVar.f139781b.close();
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) aVar.f139784u;
            j jVar3 = (j) aVar.f139783t;
            bVar = (b) aVar.f139782s;
            try {
                j1.n(obj);
                jVar2 = jVar3;
            } catch (Throwable th3) {
                th = th3;
                bVar.f139781b.close();
                throw th;
            }
        }
        while (it.hasNext()) {
            Object next = it.next();
            aVar.f139782s = bVar;
            aVar.f139783t = jVar2;
            aVar.f139784u = it;
            aVar.f139787x = 1;
            if (jVar2.emit(next, aVar) == objL) {
                return objL;
            }
        }
        bVar.f139781b.close();
        return w2.f79517a;
    }
}
