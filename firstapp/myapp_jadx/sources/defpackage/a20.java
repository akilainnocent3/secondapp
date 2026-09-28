package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {518}, m = "invokeSuspend")
public final class a20 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c20<Object> b;
    public final /* synthetic */ gaj<s00, m9f<Object>, v1b<? super Unit>, Object> c;

    @c0d(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {519}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<m9f<Object>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ gaj<s00, m9f<Object>, v1b<? super Unit>, Object> c;
        public final /* synthetic */ c20<Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c20 c20Var, v1b v1bVar, gaj gajVar) {
            super(2, v1bVar);
            this.c = gajVar;
            this.d = c20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, v1bVar, this.c);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(m9f<Object> m9fVar, v1b<? super Unit> v1bVar) {
            return ((a) create(m9fVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                m9f<Object> m9fVar = (m9f) this.b;
                h20 h20Var = this.d.n;
                this.a = 1;
                if (this.c.invoke(h20Var, m9fVar, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(c20 c20Var, v1b v1bVar, gaj gajVar) {
        super(1, v1bVar);
        this.b = c20Var;
        this.c = gajVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new a20(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((a20) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            c20<Object> c20Var = this.b;
            y10 y10Var = new y10(c20Var, 0);
            a aVar = new a(c20Var, null, this.c);
            this.a = 1;
            if (androidx.compose.material3.internal.a.b(y10Var, aVar, this) == y5bVar) {
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
