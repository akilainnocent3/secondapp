package defpackage;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vc0 implements r4w {
    public final Choreographer a;
    public final uc0 b;

    public static final class a extends qlr implements Function1<Throwable, Unit> {
        public final /* synthetic */ uc0 a;
        public final /* synthetic */ c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uc0 uc0Var, c cVar) {
            super(1);
            this.a = uc0Var;
            this.b = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            uc0 uc0Var = this.a;
            c cVar = this.b;
            synchronized (uc0Var.d) {
                uc0Var.f.remove(cVar);
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<Throwable, Unit> {
        public final /* synthetic */ c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.b = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            vc0.this.a.removeFrameCallback(this.b);
            return Unit.a;
        }
    }

    public static final class c implements Choreographer.FrameCallback {
        public final /* synthetic */ bc6 a;
        public final /* synthetic */ Function1<Long, R> b;

        public c(bc6 bc6Var, vc0 vc0Var, Function1 function1) {
            this.a = bc6Var;
            this.b = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object bVar;
            Function1<Long, R> function1 = this.b;
            try {
                zi50.a aVar = zi50.b;
                bVar = function1.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            this.a.resumeWith(bVar);
        }
    }

    public vc0(Choreographer choreographer, uc0 uc0Var) {
        this.a = choreographer;
        this.b = uc0Var;
    }

    @Override // defpackage.r4w
    public final <R> Object P(Function1<? super Long, ? extends R> function1, v1b<? super R> v1bVar) throws Throwable {
        uc0 uc0Var = this.b;
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        c cVar = new c(bc6Var, this, function1);
        if (Intrinsics.g(uc0Var.b, this.a)) {
            synchronized (uc0Var.d) {
                try {
                    uc0Var.f.add(cVar);
                    if (!uc0Var.w) {
                        uc0Var.w = true;
                        uc0Var.b.postFrameCallback(uc0Var.y);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            bc6Var.t(new a(uc0Var, cVar));
        } else {
            this.a.postFrameCallback(cVar);
            bc6Var.t(new b(cVar));
        }
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke(r, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
