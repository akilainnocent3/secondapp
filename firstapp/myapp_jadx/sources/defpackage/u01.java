package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1", f = "AsyncPagingDataDiffer.kt", l = {40}, m = "invokeSuspend")
public final class u01 extends tje0 implements Function2<myh<? super y78>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ v01 d;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh<y78> a;
        public final /* synthetic */ v01 b;

        /* JADX INFO: renamed from: u01$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1", f = "AsyncPagingDataDiffer.kt", l = {224, 225, 229}, m = "emit")
        public static final class C1156a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public Object d;
            public Object e;
            public myh f;

            public C1156a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, v01 v01Var) {
            this.b = v01Var;
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r9, defpackage.v1b<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof u01.a.C1156a
                if (r0 == 0) goto L13
                r0 = r10
                u01$a$a r0 = (u01.a.C1156a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                u01$a$a r0 = new u01$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 3
                r4 = 1
                r5 = 2
                r6 = 0
                if (r2 == 0) goto L52
                if (r2 == r4) goto L41
                if (r2 == r5) goto L35
                if (r2 != r3) goto L2f
                defpackage.uj50.b(r10)
                goto L9f
            L2f:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r6
            L35:
                java.lang.Object r8 = r0.e
                myh r8 = (defpackage.myh) r8
                java.lang.Object r9 = r0.d
                y78 r9 = (defpackage.y78) r9
                defpackage.uj50.b(r10)
                goto L91
            L41:
                myh r8 = r0.f
                java.lang.Object r9 = r0.e
                y78 r9 = (defpackage.y78) r9
                java.lang.Object r2 = r0.d
                u01$a r2 = (u01.a) r2
                defpackage.uj50.b(r10)
                r7 = r2
                r2 = r8
                r8 = r7
                goto L78
            L52:
                defpackage.uj50.b(r10)
                y78 r9 = (defpackage.y78) r9
                v01 r10 = r8.b
                wwd0 r10 = r10.e
                java.lang.Object r10 = r10.getValue()
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                myh<y78> r2 = r8.a
                if (r10 == 0) goto L92
                r0.d = r8
                r0.e = r9
                r0.f = r2
                r0.b = r4
                java.lang.Object r10 = defpackage.lal.c(r0)
                if (r10 != r1) goto L78
                goto L9e
            L78:
                v01 r8 = r8.b
                wwd0 r8 = r8.e
                q01 r10 = new q01
                r10.<init>(r5, r6)
                r0.d = r9
                r0.e = r2
                r0.f = r6
                r0.b = r5
                java.lang.Object r8 = defpackage.s0i.d(r8, r10, r0)
                if (r8 != r1) goto L90
                goto L9e
            L90:
                r8 = r2
            L91:
                r2 = r8
            L92:
                r0.d = r6
                r0.e = r6
                r0.b = r3
                java.lang.Object r8 = r2.emit(r9, r0)
                if (r8 != r1) goto L9f
            L9e:
                return r1
            L9f:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: u01.a.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u01(lyh lyhVar, v1b v1bVar, v01 v01Var) {
        super(2, v1bVar);
        this.c = lyhVar;
        this.d = v01Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u01 u01Var = new u01(this.c, v1bVar, this.d);
        u01Var.b = obj;
        return u01Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super y78> myhVar, v1b<? super Unit> v1bVar) {
        return ((u01) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a((myh) this.b, this.d);
            this.a = 1;
            if (this.c.collect(aVar, this) == y5bVar) {
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
