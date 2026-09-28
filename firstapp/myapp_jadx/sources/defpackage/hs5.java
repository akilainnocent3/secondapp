package defpackage;

import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend")
public final class hs5 extends tje0 implements Function2<myh<? super xmz<Object>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ls5<Object> c;

    @c0d(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<IndexedValue<? extends xmz<Object>>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndexedValue<? extends xmz<Object>> indexedValue, v1b<? super Boolean> v1bVar) {
            return ((a) create(indexedValue, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(((IndexedValue) this.a) != null);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ bq40 a;
        public final /* synthetic */ myh<xmz<T>> b;

        @c0d(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", l = {105}, m = "emit")
        public static final class a extends x1b {
            public b a;
            public IndexedValue b;
            public /* synthetic */ Object c;
            public final /* synthetic */ b<T> d;
            public int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, v1b<? super a> v1bVar) {
                super(v1bVar);
                this.d = bVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return this.d.emit(null, this);
            }
        }

        public b(myh myhVar, bq40 bq40Var) {
            this.a = bq40Var;
            this.b = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(IndexedValue<? extends xmz<T>> indexedValue, v1b<? super Unit> v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, v1bVar);
                }
            } else {
                aVar = new a(this, v1bVar);
            }
            Object obj = aVar.c;
            y5b y5bVar = y5b.a;
            int i2 = aVar.e;
            if (i2 == 0) {
                uj50.b(obj);
                indexedValue.getClass();
                if (indexedValue.a > this.a.a) {
                    T t = indexedValue.b;
                    aVar.a = this;
                    aVar.b = indexedValue;
                    aVar.e = 1;
                    if (this.b.emit(t, aVar) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            indexedValue = aVar.b;
            this = aVar.a;
            uj50.b(obj);
            this.a.a = indexedValue.a;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs5(ls5<Object> ls5Var, v1b<? super hs5> v1bVar) {
        super(2, v1bVar);
        this.c = ls5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hs5 hs5Var = new hs5(this.c, v1bVar);
        hs5Var.b = obj;
        return hs5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super xmz<Object>> myhVar, v1b<? super Unit> v1bVar) {
        return ((hs5) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = (myh) this.b;
            bq40 bq40Var = new bq40();
            bq40Var.a = Integer.MIN_VALUE;
            k0i k0iVar = new k0i(this.c.c, new a(2, null));
            b bVar = new b(myhVar, bq40Var);
            this.a = 1;
            if (k0iVar.collect(bVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
