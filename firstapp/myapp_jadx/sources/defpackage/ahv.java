package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initUserCertStatusObserver$1", f = "MeViewModel.kt", l = {230}, m = "invokeSuspend", v = 2)
public final class ahv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initUserCertStatusObserver$1$1", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
        public /* synthetic */ int a;
        public final /* synthetic */ rhv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rhv rhvVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = rhvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
            return ((a) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (i == 310 || i == 320) {
                this.b.y1(osp.i.a, k00.d);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahv(rhv rhvVar, v1b<? super ahv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ahv(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ahv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rhv rhvVar = this.b;
            lyh<Integer> lyhVar = rhvVar.K;
            a aVar = new a(rhvVar, null);
            this.a = 1;
            if (kzh.b(lyhVar, aVar, this) == y5bVar) {
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
