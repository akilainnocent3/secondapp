package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {91}, m = "invokeSuspend")
public final class k760 extends tje0 implements Function2<ez20<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dey<Object> c;

    public static final class a implements kfy<Object> {
        public final /* synthetic */ ez20<Object> a;
        public final /* synthetic */ AtomicReference<pse> b;

        public a(ez20<Object> ez20Var, AtomicReference<pse> atomicReference) {
            this.a = ez20Var;
            this.b = atomicReference;
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            this.a.k(null);
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            this.a.k(th);
        }

        @Override // defpackage.kfy
        public final void onNext(Object obj) {
            try {
                ez20<Object> ez20Var = this.a;
                Object objC = ez20Var.c(obj);
                if (objC instanceof h77.b) {
                    Object obj2 = ((h77) dj5.a(e.a, new q77(ez20Var, obj, null))).a;
                } else {
                    Unit unit = Unit.a;
                }
            } catch (InterruptedException unused) {
            }
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            AtomicReference<pse> atomicReference;
            do {
                atomicReference = this.b;
                if (atomicReference.compareAndSet(null, pseVar)) {
                    return;
                }
            } while (atomicReference.get() == null);
            pseVar.dispose();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k760(dey<Object> deyVar, v1b<? super k760> v1bVar) {
        super(2, v1bVar);
        this.c = deyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k760 k760Var = new k760(this.c, v1bVar);
        k760Var.b = obj;
        return k760Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<Object> ez20Var, v1b<? super Unit> v1bVar) {
        return ((k760) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ez20 ez20Var = (ez20) this.b;
            AtomicReference atomicReference = new AtomicReference();
            this.c.a(new a(ez20Var, atomicReference));
            one oneVar = new one(atomicReference, 2);
            this.a = 1;
            if (az20.a(ez20Var, oneVar, this) == y5bVar) {
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
