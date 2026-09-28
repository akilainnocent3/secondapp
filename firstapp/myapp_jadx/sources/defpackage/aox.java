package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {178}, m = "invokeSuspend")
public final class aox extends tje0 implements Function2<ez20<? super rxa>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lxa c;
    public final /* synthetic */ box d;

    public static final class a extends qlr implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.invoke();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<rxa, Unit> {
        public final /* synthetic */ jvd0 a;
        public final /* synthetic */ ez20<rxa> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jvd0 jvd0Var, ez20 ez20Var) {
            super(1);
            this.a = jvd0Var;
            this.b = ez20Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(rxa rxaVar) {
            rxa rxaVar2 = rxaVar;
            rxaVar2.getClass();
            this.a.cancel((CancellationException) null);
            this.b.c(rxaVar2);
            return Unit.a;
        }
    }

    @c0d(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", l = {149}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ box b;
        public final /* synthetic */ ez20<rxa> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(box boxVar, ez20<? super rxa> ez20Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = boxVar;
            this.c = ez20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            jgt.e().a(quj0.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
            this.c.c(new rxa.b(7));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aox(lxa lxaVar, box boxVar, v1b<? super aox> v1bVar) {
        super(2, v1bVar);
        this.c = lxaVar;
        this.d = boxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        aox aoxVar = new aox(this.c, this.d, v1bVar);
        aoxVar.b = obj;
        return aoxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super rxa> ez20Var, v1b<? super Unit> v1bVar) {
        return ((aox) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Function0 vfnVar;
        box boxVar = this.d;
        ConnectivityManager connectivityManager = boxVar.a;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ez20 ez20Var = (ez20) this.b;
            NetworkRequest networkRequestA = this.c.a();
            if (networkRequestA == null) {
                ez20Var.d().k(null);
                return Unit.a;
            }
            b bVar = new b(ej5.c(ez20Var, null, null, new c(boxVar, ez20Var, null), 3), ez20Var);
            if (Build.VERSION.SDK_INT >= 30) {
                vfnVar = k390.a.a(connectivityManager, networkRequestA, bVar);
            } else {
                int i2 = wfn.b;
                wfn wfnVar = new wfn(bVar);
                yp40 yp40Var = new yp40();
                try {
                    jgt.e().a(quj0.a, "NetworkRequestConstraintController register callback");
                    connectivityManager.registerNetworkCallback(networkRequestA, wfnVar);
                    yp40Var.a = true;
                } catch (RuntimeException e) {
                    if (!kotlin.text.c.k(e.getClass().getName(), "TooManyRequestsException", false)) {
                        throw e;
                    }
                    jgt.e().b(quj0.a, "NetworkRequestConstraintController couldn't register callback", e);
                    bVar.invoke(new rxa.b(7));
                }
                vfnVar = new vfn(yp40Var, connectivityManager, wfnVar);
            }
            a aVar = new a(vfnVar);
            this.a = 1;
            if (az20.a(ez20Var, aVar, this) == y5bVar) {
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
