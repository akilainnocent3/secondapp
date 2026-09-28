package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.ForceUpdateFragment$initViewModel$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "ForceUpdateFragment.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class kti extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jti b;
    public final /* synthetic */ jti c;

    @c0d(c = "com.sportybet.android.update.ForceUpdateFragment$initViewModel$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "ForceUpdateFragment.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ jti c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, jti jtiVar) {
            super(2, v1bVar);
            this.c = jtiVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.c);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            ohp<Object>[] ohpVarArr = jti.z;
            jti jtiVar = this.c;
            wwd0 wwd0Var = ((y1i0) jtiVar.w.getValue()).a.n;
            lti ltiVar = new lti(jtiVar);
            this.b = null;
            this.a = 1;
            wwd0Var.collect(ltiVar, this);
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kti(jti jtiVar, v1b v1bVar, jti jtiVar2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = jtiVar;
        this.c = jtiVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new kti(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kti) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
