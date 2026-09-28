package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$watchVipUiSlidesThenFetchElite$job$1", f = "SportyHeroCompose.kt", l = {2922}, m = "invokeSuspend", v = 1)
public final class cvb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qub0 c;

    @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$watchVipUiSlidesThenFetchElite$job$1$1", f = "SportyHeroCompose.kt", l = {2924, 2925}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ qub0 b;

        /* JADX INFO: renamed from: cvb0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$watchVipUiSlidesThenFetchElite$job$1$1$2", f = "SportyHeroCompose.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C0465a extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
            public /* synthetic */ boolean a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0465a c0465a = new C0465a(2, v1bVar);
                c0465a.a = ((Boolean) obj).booleanValue();
                return c0465a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C0465a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                boolean z = this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qub0 qub0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = qub0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (defpackage.hkd.b(r1, r5) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 0
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r4) goto L11
                defpackage.uj50.b(r6)
                goto L42
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r2
            L17:
                defpackage.uj50.b(r6)
                goto L35
            L1b:
                defpackage.uj50.b(r6)
                bvb0 r6 = new bvb0
                r6.<init>()
                or60 r6 = defpackage.n95.c(r6)
                cvb0$a$a r1 = new cvb0$a$a
                r1.<init>(r4, r2)
                r5.a = r3
                java.lang.Object r6 = defpackage.s0i.b(r6, r1, r5)
                if (r6 != r0) goto L35
                goto L41
            L35:
                qub0 r6 = r5.b
                long r1 = r6.s3
                r5.a = r4
                java.lang.Object r5 = defpackage.hkd.b(r1, r5)
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: cvb0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvb0(qub0 qub0Var, v1b<? super cvb0> v1bVar) {
        super(2, v1bVar);
        this.c = qub0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cvb0 cvb0Var = new cvb0(this.c, v1bVar);
        cvb0Var.b = obj;
        return cvb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cvb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        c9p.b bVar = c9p.b.a;
        qub0 qub0Var = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                long j = qub0Var.t3;
                a aVar = new a(qub0Var, null);
                this.b = v5bVar;
                this.a = 1;
                obj = vxf0.c(j, aVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (qub0Var.q3 == v5bVar.getCoroutineContext().get(bVar)) {
                qub0Var.q3 = null;
            }
            if (!w5b.e(v5bVar) || !qub0Var.isAdded() || qub0Var.isRemoving()) {
                return Unit.a;
            }
            qub0Var.a4();
            return Unit.a;
        } catch (Throwable th) {
            if (qub0Var.q3 == v5bVar.getCoroutineContext().get(bVar)) {
                qub0Var.q3 = null;
            }
            throw th;
        }
    }
}
