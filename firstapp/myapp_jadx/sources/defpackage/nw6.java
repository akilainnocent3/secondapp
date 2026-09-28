package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend")
public final class nw6 extends tje0 implements Function2<tk10, v1b<?>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2<tk10, v1b<?>, Object> c;
    public final /* synthetic */ ow6 d;

    public static final class a implements tk10 {
        public final /* synthetic */ tk10 a;
        public final /* synthetic */ tk10 b;
        public final /* synthetic */ AtomicReference c;
        public final /* synthetic */ ow6 d;

        public a(tk10 tk10Var, AtomicReference atomicReference, ow6 ow6Var) {
            this.b = tk10Var;
            this.c = atomicReference;
            this.d = ow6Var;
            this.a = tk10Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.sk10
        public final void a(p6s p6sVar, x1b x1bVar) {
            kw6 kw6Var;
            if (x1bVar instanceof kw6) {
                kw6Var = (kw6) x1bVar;
                int i = kw6Var.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    kw6Var.c = i - Integer.MIN_VALUE;
                } else {
                    kw6Var = new kw6(this, x1bVar);
                }
            } else {
                kw6Var = new kw6(this, x1bVar);
            }
            Object obj = kw6Var.a;
            y5b y5bVar = y5b.a;
            int i2 = kw6Var.c;
            if (i2 == 0) {
                uj50.b(obj);
                mw6 mw6Var = new mw6(this.d, p6sVar, this.b, null);
                kw6Var.c = 1;
                if (w5b.d(new ug80(lw6.a, this.c, mw6Var, null), kw6Var) == y5bVar) {
                    return;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                uj50.b(obj);
            }
            fkd.a();
        }

        @Override // defpackage.v5b
        public final CoroutineContext getCoroutineContext() {
            return this.a.getCoroutineContext();
        }

        @Override // defpackage.sk10
        public final View getView() {
            return this.a.getView();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nw6(Function2<? super tk10, ? super v1b<?>, ? extends Object> function2, ow6 ow6Var, v1b<? super nw6> v1bVar) {
        super(2, v1bVar);
        this.c = function2;
        this.d = ow6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nw6 nw6Var = new nw6(this.c, this.d, v1bVar);
        nw6Var.b = obj;
        return nw6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tk10 tk10Var, v1b<?> v1bVar) {
        ((nw6) create(tk10Var, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a((tk10) this.b, new AtomicReference(null), this.d);
            this.a = 1;
            if (this.c.invoke(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fkd.a();
        return null;
    }
}
