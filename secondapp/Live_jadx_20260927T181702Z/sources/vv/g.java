package vv;

import dr.j1;
import kotlin.jvm.internal.j0;
import qv.z0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final z0 f141692a = new z0("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final z0 f141693b = new z0("ALREADY_LOCKED_BY_OWNER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f141694c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f141695d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f141696e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f141697f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f141698g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f141699h = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @rr.f(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {121}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    public static final class a<T> extends rr.d {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f141700s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f141701t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f141702u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f141703v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f141704w;

        public a(or.f<? super a> fVar) {
            super(fVar);
        }

        @Override // rr.a
        @oy.m
        public final Object invokeSuspend(@oy.l Object obj) {
            this.f141703v = obj;
            this.f141704w |= Integer.MIN_VALUE;
            return g.e(null, null, null, this);
        }
    }

    @oy.l
    public static final vv.a a(boolean z10) {
        return new f(z10);
    }

    public static /* synthetic */ vv.a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @oy.m
    public static final <T> Object e(@oy.l vv.a aVar, @oy.m Object obj, @oy.l ds.a<? extends T> aVar2, @oy.l or.f<? super T> fVar) {
        a aVar3;
        if (fVar instanceof a) {
            aVar3 = (a) fVar;
            int i10 = aVar3.f141704w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar3.f141704w = i10 - Integer.MIN_VALUE;
            } else {
                aVar3 = new a(fVar);
            }
        } else {
            aVar3 = new a(fVar);
        }
        Object obj2 = aVar3.f141703v;
        Object objL = qr.d.l();
        int i11 = aVar3.f141704w;
        if (i11 == 0) {
            j1.n(obj2);
            aVar3.f141700s = aVar;
            aVar3.f141701t = obj;
            aVar3.f141702u = aVar2;
            aVar3.f141704w = 1;
            if (aVar.c(obj, aVar3) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (ds.a) aVar3.f141702u;
            obj = aVar3.f141701t;
            aVar = (vv.a) aVar3.f141700s;
            j1.n(obj2);
        }
        try {
            return aVar2.invoke();
        } finally {
            j0.d(1);
            aVar.i(obj);
            j0.c(1);
        }
    }

    public static final <T> Object f(vv.a aVar, Object obj, ds.a<? extends T> aVar2, or.f<? super T> fVar) {
        j0.e(0);
        aVar.c(obj, fVar);
        j0.e(1);
        try {
            return aVar2.invoke();
        } finally {
            j0.d(1);
            aVar.i(obj);
            j0.c(1);
        }
    }

    public static /* synthetic */ Object g(vv.a aVar, Object obj, ds.a aVar2, or.f fVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        j0.e(0);
        aVar.c(obj, fVar);
        j0.e(1);
        try {
            return aVar2.invoke();
        } finally {
            j0.d(1);
            aVar.i(obj);
            j0.c(1);
        }
    }
}
