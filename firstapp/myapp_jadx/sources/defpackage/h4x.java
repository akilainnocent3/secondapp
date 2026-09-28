package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.feature.notificationcenter.db.NCDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class h4x implements cym {
    public final sen a;
    public final m2l b;
    public final NCDatabase c;
    public final k5b d;

    @c0d(c = "com.sportybet.feature.notificationcenter.NCUseCase$2", f = "NCUseCase.kt", l = {48, 48}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ mgb0 b;
        public final /* synthetic */ h4x c;
        public final /* synthetic */ dq40<String> d;

        /* JADX INFO: renamed from: h4x$a$a, reason: collision with other inner class name */
        public static final class C0622a<T> implements myh {
            public final /* synthetic */ dq40<String> a;
            public final /* synthetic */ h4x b;

            /* JADX INFO: renamed from: h4x$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.notificationcenter.NCUseCase$2$1", f = "NCUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C0623a extends x1b {
                public String a;
                public /* synthetic */ Object b;
                public final /* synthetic */ C0622a<T> c;
                public int d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0623a(C0622a<? super T> c0622a, v1b<? super C0623a> v1bVar) {
                    super(v1bVar);
                    this.c = c0622a;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.b = obj;
                    this.d |= Integer.MIN_VALUE;
                    return this.c.emit(null, this);
                }
            }

            public C0622a(dq40<String> dq40Var, h4x h4xVar) {
                this.a = dq40Var;
                this.b = h4xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v1, types: [T] */
            @Override // defpackage.myh
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, v1b<? super Unit> v1bVar) {
                C0623a c0623a;
                if (v1bVar instanceof C0623a) {
                    c0623a = (C0623a) v1bVar;
                    int i = c0623a.d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0623a.d = i - Integer.MIN_VALUE;
                    } else {
                        c0623a = new C0623a(this, v1bVar);
                    }
                } else {
                    c0623a = new C0623a(this, v1bVar);
                }
                Object obj = c0623a.b;
                Object obj2 = y5b.a;
                int i2 = c0623a.d;
                dq40<String> dq40Var = this.a;
                if (i2 == 0) {
                    uj50.b(obj);
                    if (dq40Var.a != null) {
                        c0623a.a = str;
                        c0623a.d = 1;
                        h4x h4xVar = this.b;
                        Object objB = qv50.b(h4xVar.c, new k4x(h4xVar, null), c0623a);
                        if (objB != obj2) {
                            objB = Unit.a;
                        }
                        if (objB == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (T) c0623a.a;
                    uj50.b(obj);
                }
                dq40Var.a = (T) str;
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mgb0 mgb0Var, h4x h4xVar, dq40<String> dq40Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = mgb0Var;
            this.c = h4xVar;
            this.d = dq40Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (((defpackage.uwd0) r7).collect(r1, r6) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                h4x r3 = r6.c
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L1d
                if (r1 == r5) goto L19
                if (r1 == r4) goto L15
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L15:
                defpackage.uj50.b(r7)
                goto L49
            L19:
                defpackage.uj50.b(r7)
                goto L37
            L1d:
                defpackage.uj50.b(r7)
                mgb0 r7 = r6.b
                lyh r7 = r7.getLanguageFlow()
                zu7$a r1 = defpackage.zu7.a
                k5b r1 = r3.d
                v5b r1 = defpackage.zu7.b(r1)
                r6.a = r5
                java.lang.Object r7 = defpackage.e1i.f(r7, r1, r6)
                if (r7 != r0) goto L37
                goto L48
            L37:
                uwd0 r7 = (defpackage.uwd0) r7
                h4x$a$a r1 = new h4x$a$a
                dq40<java.lang.String> r5 = r6.d
                r1.<init>(r5, r3)
                r6.a = r4
                java.lang.Object r6 = r7.collect(r1, r6)
                if (r6 != r0) goto L49
            L48:
                return r0
            L49:
                defpackage.fkd.a()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: h4x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h4x(sen senVar, m2l m2lVar, NCDatabase nCDatabase, mgb0 mgb0Var, uqm uqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        senVar.getClass();
        m2lVar.getClass();
        nCDatabase.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        this.a = senVar;
        this.b = m2lVar;
        this.c = nCDatabase;
        this.d = k5bVar;
        uqmVar.addLogoutEventListener(new fjt() { // from class: g4x
            @Override // defpackage.fjt
            public final void p() {
                zu7.a aVar = zu7.a;
                h4x h4xVar = this.a;
                k5b k5bVar2 = h4xVar.d;
                ej5.c(zu7.b(k5bVar2), null, null, new j4x(h4xVar, null), 3);
            }
        });
        dq40 dq40Var = new dq40();
        zu7.a aVar = zu7.a;
        ej5.c(zu7.b(k5bVar), null, null, new a(mgb0Var, this, dq40Var, null), 3);
    }

    @Override // defpackage.cym
    public final zed.h a() {
        m2l m2lVar = this.b;
        m2lVar.getClass();
        return (zed.h) m2lVar.a.getBooleanByFlow("notification_center_any_unread", false);
    }
}
