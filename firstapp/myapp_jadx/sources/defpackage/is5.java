package defpackage;

import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {76}, m = "invokeSuspend")
public final class is5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lyh<xmz<Object>> b;
    public final /* synthetic */ ls5<Object> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ ls5<T> a;

        /* JADX INFO: renamed from: is5$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.CachedPageEventFlow$job$1$1", f = "CachedPageEventFlow.kt", l = {77, 78}, m = "emit")
        public static final class C0694a extends x1b {
            public a a;
            public IndexedValue b;
            public /* synthetic */ Object c;
            public final /* synthetic */ a<T> d;
            public int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0694a(a<? super T> aVar, v1b<? super C0694a> v1bVar) {
                super(v1bVar);
                this.d = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return this.d.emit(null, this);
            }
        }

        public a(ls5<T> ls5Var) {
            this.a = ls5Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        
            if (r6.b(r7, r0) == r1) goto L21;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(kotlin.collections.IndexedValue<? extends defpackage.xmz<T>> r7, defpackage.v1b<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof is5.a.C0694a
                if (r0 == 0) goto L13
                r0 = r8
                is5$a$a r0 = (is5.a.C0694a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                is5$a$a r0 = new is5$a$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.c
                y5b r1 = defpackage.y5b.a
                int r2 = r0.e
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L31
                if (r2 != r4) goto L2b
                defpackage.uj50.b(r8)
                goto L5e
            L2b:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L31:
                kotlin.collections.IndexedValue r7 = r0.b
                is5$a r6 = r0.a
                defpackage.uj50.b(r8)
                goto L4d
            L39:
                defpackage.uj50.b(r8)
                ls5<T> r8 = r6.a
                b390 r8 = r8.b
                r0.a = r6
                r0.b = r7
                r0.e = r5
                java.lang.Object r8 = r8.emit(r7, r0)
                if (r8 != r1) goto L4d
                goto L5d
            L4d:
                ls5<T> r6 = r6.a
                puh<T> r6 = r6.a
                r0.a = r3
                r0.b = r3
                r0.e = r4
                java.lang.Object r6 = r6.b(r7, r0)
                if (r6 != r1) goto L5e
            L5d:
                return r1
            L5e:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: is5.a.emit(kotlin.collections.IndexedValue, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public is5(lyh<? extends xmz<Object>> lyhVar, ls5<Object> ls5Var, v1b<? super is5> v1bVar) {
        super(2, v1bVar);
        this.b = lyhVar;
        this.c = ls5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new is5(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((is5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(this.c);
            this.a = 1;
            Object objCollect = this.b.collect(new j1i(aVar, new bq40()), this);
            if (objCollect != y5b.a) {
                objCollect = Unit.a;
            }
            if (objCollect == obj2) {
                return obj2;
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
