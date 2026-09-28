package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {170}, m = "invokeSuspend")
public final class l6w extends tje0 implements Function2<v5b, v1b<? super k6w.a>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tb5 c;

    @c0d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", l = {166}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                v5bVar = (v5b) this.b;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v5bVar = (v5b) this.b;
                uj50.b(obj);
            }
            while (i9p.h(v5bVar.getCoroutineContext())) {
                fwc fwcVar = new fwc(1);
                this.b = v5bVar;
                this.a = 1;
                if (t4w.a(getContext()).P(fwcVar, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6w(tb5 tb5Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = tb5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l6w l6wVar = new l6w(this.c, v1bVar);
        l6wVar.b = obj;
        return l6wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super k6w.a> v1bVar) {
        return ((l6w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        c9p c9pVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jvd0 jvd0VarC = ej5.c((v5b) this.b, null, null, new a(2, null), 3);
            try {
                tb5 tb5Var = this.c;
                this.b = jvd0VarC;
                this.a = 1;
                Object objA = tb5Var.a(this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                obj = objA;
                c9pVar = jvd0VarC;
            } catch (Throwable th2) {
                th = th2;
                c9pVar = jvd0VarC;
                c9pVar.cancel((CancellationException) null);
                throw th;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9pVar = (c9p) this.b;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                c9pVar.cancel((CancellationException) null);
                throw th;
            }
        }
        k6w.a aVar = (k6w.a) obj;
        c9pVar.cancel((CancellationException) null);
        return aVar;
    }
}
