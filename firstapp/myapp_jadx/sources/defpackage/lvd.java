package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositConfirmCompletedViewModel$verifyContinuationResumed$1", f = "DepositConfirmCompletedViewModel.kt", l = {144}, m = "invokeSuspend", v = 2)
public final class lvd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jvd b;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositConfirmCompletedViewModel$verifyContinuationResumed$1$receivedLoadingState$1", f = "DepositConfirmCompletedViewModel.kt", l = {145}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super tzs>, Object> {
        public int a;
        public final /* synthetic */ jvd b;

        /* JADX INFO: renamed from: lvd$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositConfirmCompletedViewModel$verifyContinuationResumed$1$receivedLoadingState$1$1", f = "DepositConfirmCompletedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0839a extends tje0 implements Function2<tzs, v1b<? super Boolean>, Object> {
            public /* synthetic */ Object a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0839a c0839a = new C0839a(2, v1bVar);
                c0839a.a = obj;
                return c0839a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(tzs tzsVar, v1b<? super Boolean> v1bVar) {
                return ((C0839a) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                tzs tzsVar = (tzs) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(Intrinsics.g(tzsVar, tzs.b.a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jvd jvdVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = jvdVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super tzs> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            wwd0 wwd0Var = this.b.B;
            C0839a c0839a = new C0839a(2, null);
            this.a = 1;
            Object objB = s0i.b(wwd0Var, c0839a, this);
            return objB == y5bVar ? y5bVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvd(jvd jvdVar, v1b<? super lvd> v1bVar) {
        super(2, v1bVar);
        this.b = jvdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lvd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lvd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        jvd jvdVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            long j = jvd.F;
            a aVar = new a(jvdVar, null);
            this.a = 1;
            obj = vxf0.d(j, aVar, this);
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
        if (((tzs) obj) == null) {
            jvdVar.w.a(Unit.a);
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_DEPOSIT);
            aVar2.n("Confirm deposit: continuation timeout, dismissing dialog", new Object[0]);
        }
        return Unit.a;
    }
}
