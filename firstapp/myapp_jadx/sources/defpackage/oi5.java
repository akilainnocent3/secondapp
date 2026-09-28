package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoViewModel$entrySheetState$1", f = "BuildAndGoViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class oi5 extends tje0 implements Function2<myh<? super md5>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f c;

    @c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoViewModel$entrySheetState$1$1", f = "BuildAndGoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements jaj<ni5, lk50<? extends Sports>, lk50<? extends Round>, Long, v1b<? super md5>, Object> {
        public /* synthetic */ ni5 a;
        public /* synthetic */ lk50 b;
        public /* synthetic */ lk50 c;
        public /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ dq40<ld5> f;
        public final /* synthetic */ f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, dq40<ld5> dq40Var, f fVar, v1b<? super a> v1bVar) {
            super(5, v1bVar);
            this.e = j;
            this.f = dq40Var;
            this.i = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            T aVar;
            ni5 ni5Var = this.a;
            lk50 lk50Var = this.b;
            lk50 lk50Var2 = this.c;
            long j = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            jh10 jh10Var = ni5Var.f;
            boolean z = jh10Var instanceof jh10.d;
            dq40<ld5> dq40Var = this.f;
            if (!z && !(jh10Var instanceof jh10.a) && j == this.e) {
                Sports sports = (Sports) bm50.i(lk50Var);
                Round round = (Round) bm50.i(lk50Var2);
                if ((lk50Var instanceof lk50.b) || (lk50Var2 instanceof lk50.b)) {
                    aVar = ld5.c.a;
                } else {
                    aVar = (sports == null || !sports.getActive() || round == null) ? ld5.b.a : new ld5.a(sports, py9.a(round));
                }
                dq40Var.a = aVar;
            }
            return new md5(ni5Var.e, ni5Var.i, dq40Var.a);
        }

        @Override // defpackage.jaj
        public final Object l(ni5 ni5Var, lk50<? extends Sports> lk50Var, lk50<? extends Round> lk50Var2, Long l, v1b<? super md5> v1bVar) {
            long jLongValue = l.longValue();
            dq40<ld5> dq40Var = this.f;
            f fVar = this.i;
            a aVar = new a(this.e, dq40Var, fVar, v1bVar);
            aVar.a = ni5Var;
            aVar.b = lk50Var;
            aVar.c = lk50Var2;
            aVar.d = jLongValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    public static final /* synthetic */ class b implements myh, paj {
        public final /* synthetic */ myh<md5> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(myh<? super md5> myhVar) {
            this.a = myhVar;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return new saj(2, this.a, myh.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            return this.a.emit((md5) obj, v1bVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof myh) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi5(f fVar, v1b<? super oi5> v1bVar) {
        super(2, v1bVar);
        this.c = fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oi5 oi5Var = new oi5(this.c, v1bVar);
        oi5Var.b = obj;
        return oi5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super md5> myhVar, v1b<? super Unit> v1bVar) {
        return ((oi5) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [T, ld5$c] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        f fVar = this.c;
        je5 je5Var = fVar.f;
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            long jLongValue = ((Number) fVar.F.getValue()).longValue();
            dq40 dq40Var = new dq40();
            dq40Var.a = ld5.c.a;
            lyh lyhVarB = uzh.b(r1i.b(fVar.I, je5Var.q(), je5Var.w(), fVar.F, new a(jLongValue, dq40Var, fVar, null)));
            b bVar = new b(myhVar);
            this.b = null;
            this.a = 1;
            if (lyhVarB.collect(bVar, this) == y5bVar) {
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
