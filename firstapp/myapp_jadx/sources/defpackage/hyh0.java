package defpackage;

import com.sportybet.android.account.mfa.Verify2FAFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.mfa.Verify2FAFragment$initViewModel$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "Verify2FAFragment.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class hyh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Verify2FAFragment b;
    public final /* synthetic */ Verify2FAFragment c;

    @c0d(c = "com.sportybet.android.account.mfa.Verify2FAFragment$initViewModel$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "Verify2FAFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Verify2FAFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, Verify2FAFragment verify2FAFragment) {
            super(2, v1bVar);
            this.b = verify2FAFragment;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.b);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Verify2FAFragment verify2FAFragment = this.b;
            ej5.c(v5bVar, null, null, new fyh0(null, verify2FAFragment), 3);
            ej5.c(v5bVar, null, null, new gyh0(null, verify2FAFragment), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyh0(Verify2FAFragment verify2FAFragment, v1b v1bVar, Verify2FAFragment verify2FAFragment2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = verify2FAFragment;
        this.c = verify2FAFragment2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new hyh0(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hyh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getViewLifecycleOwner().getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(null, this.c);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
