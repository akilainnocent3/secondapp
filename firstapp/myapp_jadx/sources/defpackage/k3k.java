package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.bethistory.domain.GetBetHistoryUseCase$invoke$1", f = "GetBetHistoryUseCase.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class k3k extends tje0 implements Function2<myh<? super lk50<? extends wgq>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ku90 c;
    public final /* synthetic */ m3k d;

    public static final class a<T> implements myh {
        public final /* synthetic */ dq40<List<lxq>> a;
        public final /* synthetic */ myh<lk50<wgq>> b;
        public final /* synthetic */ m3k c;
        public final /* synthetic */ dq40<String> d;
        public final /* synthetic */ yp40 e;

        /* JADX INFO: renamed from: k3k$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.bethistory.domain.GetBetHistoryUseCase$invoke$1$2", f = "GetBetHistoryUseCase.kt", l = {82, HttpStatusCodesKt.HTTP_PROCESSING, 113, 115}, m = "emit", v = 2)
        public static final class C0750a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0750a(a<? super T> aVar, v1b<? super C0750a> v1bVar) {
                super(v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(dq40<List<lxq>> dq40Var, myh<? super lk50<wgq>> myhVar, m3k m3kVar, dq40<String> dq40Var2, yp40 yp40Var) {
            this.a = dq40Var;
            this.b = myhVar;
            this.c = m3kVar;
            this.d = dq40Var2;
            this.e = yp40Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
        
            if (r2.emit(r13, r0) == r1) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
        
            if (r2.emit(r13, r0) == r1) goto L55;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.lk50<defpackage.wgq> r13, defpackage.v1b<? super kotlin.Unit> r14) {
            /*
                Method dump skipped, instruction units count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k3k.a.emit(lk50, v1b):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.bethistory.domain.GetBetHistoryUseCase$invoke$1$invokeSuspend$$inlined$flatMapLatest$1", f = "GetBetHistoryUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super lk50<? extends wgq>>, akq, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ dq40 d;
        public final /* synthetic */ dq40 e;
        public final /* synthetic */ dq40 f;
        public final /* synthetic */ yp40 i;
        public final /* synthetic */ m3k v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, dq40 dq40Var, dq40 dq40Var2, dq40 dq40Var3, yp40 yp40Var, m3k m3kVar) {
            super(3, v1bVar);
            this.d = dq40Var;
            this.e = dq40Var2;
            this.f = dq40Var3;
            this.i = yp40Var;
            this.v = m3kVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends wgq>> myhVar, akq akqVar, v1b<? super Unit> v1bVar) {
            b bVar = new b(v1bVar, this.d, this.e, this.f, this.i, this.v);
            bVar.b = myhVar;
            bVar.c = akqVar;
            return bVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [T, ojq] */
        /* JADX WARN: Type inference failed for: r9v0, types: [T, m2g] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lyh lyhVarK;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                akq akqVar = (akq) this.c;
                boolean z = akqVar instanceof akq.b;
                m3k m3kVar = this.v;
                yp40 yp40Var = this.i;
                dq40 dq40Var = this.f;
                dq40 dq40Var2 = this.e;
                if (z) {
                    this.d.a = m2g.a;
                    dq40Var2.a = null;
                    ?? r1 = ((akq.b) akqVar).a;
                    dq40Var.a = r1;
                    yp40Var.a = false;
                    lyhVarK = k3k.k(m3kVar, dq40Var2, r1);
                } else {
                    if (!Intrinsics.g(akqVar, akq.a.a)) {
                        uhc.a();
                        return null;
                    }
                    ojq ojqVar = (ojq) dq40Var.a;
                    lyhVarK = (ojqVar == null || yp40Var.a) ? i2g.a : k3k.k(m3kVar, dq40Var2, ojqVar);
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, lyhVarK, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3k(ku90 ku90Var, m3k m3kVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = ku90Var;
        this.d = m3kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final yzh k(m3k m3kVar, dq40 dq40Var, ojq ojqVar) {
        pyp pypVar = m3kVar.b;
        return bm50.a(new n1i(pypVar.b.c(new oyp(pypVar, (String) dq40Var.a, Integer.valueOf(ojqVar.a), null)), m3kVar.a.k.a(), new l3k(m3kVar, null)));
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k3k k3kVar = new k3k(this.c, this.d, v1bVar);
        k3kVar.b = obj;
        return k3kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends wgq>> myhVar, v1b<? super Unit> v1bVar) {
        return ((k3k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, m2g] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            dq40 dq40VarA = j6w.a(obj);
            dq40VarA.a = m2g.a;
            dq40 dq40Var = new dq40();
            dq40 dq40Var2 = new dq40();
            yp40 yp40Var = new yp40();
            yp40Var.a = true;
            lyh lyhVarA = ozh.a(this.c, 0, pb5.c);
            m3k m3kVar = this.d;
            b77 b77VarF = r0i.f(lyhVarA, new b(null, dq40VarA, dq40Var, dq40Var2, yp40Var, m3kVar));
            a aVar = new a(dq40VarA, myhVar, m3kVar, dq40Var, yp40Var);
            this.b = null;
            this.a = 1;
            if (b77VarF.collect(aVar, this) == y5bVar) {
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
