package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jcf extends h9f {
    public kcf O;
    public i3z P;
    public boolean Q;
    public gaj<? super v5b, ? super gly, ? super v1b<? super Unit>, ? extends Object> R;
    public gaj<? super v5b, ? super Float, ? super v1b<? super Unit>, ? extends Object> S;
    public boolean T;

    @c0d(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {312}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = jcf.this.new a(this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                v5b v5bVar = (v5b) this.b;
                gaj<? super v5b, ? super gly, ? super v1b<? super Unit>, ? extends Object> gajVar = jcf.this.R;
                gly glyVar = new gly(this.d);
                this.a = 1;
                if (gajVar.invoke(v5bVar, glyVar, this) == y5bVar) {
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

    @c0d(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {319}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = jcf.this.new b(this.d, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                v5b v5bVar = (v5b) this.b;
                jcf jcfVar = jcf.this;
                gaj<? super v5b, ? super Float, ? super v1b<? super Unit>, ? extends Object> gajVar = jcfVar.S;
                boolean z = jcfVar.T;
                long jF = exh0.f(z ? -1.0f : 1.0f, this.d);
                i3z i3zVar = jcfVar.P;
                y9f.a aVar = y9f.a;
                Float f = new Float(i3zVar == i3z.a ? exh0.c(jF) : exh0.b(jF));
                this.a = 1;
                if (gajVar.invoke(v5bVar, f, this) == y5bVar) {
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

    public jcf() {
        throw null;
    }

    @Override // defpackage.h9f
    public final Object t2(g9f.a aVar, g9f g9fVar) {
        kcf kcfVar = this.O;
        huw huwVar = huw.a;
        Object objB = kcfVar.b(new icf(aVar, this, null), g9fVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    @Override // defpackage.h9f
    public final void u2(long j) {
        if (!this.C || Intrinsics.g(this.R, y9f.a)) {
            return;
        }
        ej5.c(d2(), null, a6b.d, new a(j, null), 1);
    }

    @Override // defpackage.h9f
    public final void v2(long j) {
        if (!this.C || Intrinsics.g(this.S, y9f.b)) {
            return;
        }
        ej5.c(d2(), null, a6b.d, new b(j, null), 1);
    }

    @Override // defpackage.h9f
    public final boolean z2() {
        return this.Q;
    }
}
