package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$confirmDeleteCode$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jcc extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super lyh<? extends lk50<? extends Unit>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$confirmDeleteCode$1$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Unit, v1b<? super lyh<? extends lk50.c<? extends Unit>>>, Object> {
        public final /* synthetic */ lk50<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lk50<Unit> lk50Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = lk50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, v1b<? super lyh<? extends lk50.c<? extends Unit>>> v1bVar) {
            return ((a) create(unit, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new gzh(this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcc(bdc bdcVar, v1b<? super jcc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jcc jccVar = new jcc(this.b, v1bVar);
        jccVar.a = obj;
        return jccVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super lyh<? extends lk50<? extends Unit>>> v1bVar) {
        return ((jcc) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(lk50Var instanceof lk50.c)) {
            return new gzh(lk50Var);
        }
        sbc sbcVar = this.b.i;
        sbcVar.getClass();
        return r0i.a(ozh.c(new or60(new acc(sbcVar, null)), sbcVar.h), new a(lk50Var, null));
    }
}
