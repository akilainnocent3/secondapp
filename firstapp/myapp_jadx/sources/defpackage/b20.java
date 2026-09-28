package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {1123}, m = "invokeSuspend")
public final class b20 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i20<Object> b;
    public final /* synthetic */ gaj<t00, n9f<Object>, v1b<? super Unit>, Object> c;

    @c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {1124}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<n9f<Object>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ gaj<t00, n9f<Object>, v1b<? super Unit>, Object> c;
        public final /* synthetic */ i20<Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i20 i20Var, v1b v1bVar, gaj gajVar) {
            super(2, v1bVar);
            this.c = gajVar;
            this.d = i20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, v1bVar, this.c);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(n9f<Object> n9fVar, v1b<? super Unit> v1bVar) {
            return ((a) create(n9fVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                n9f<Object> n9fVar = (n9f) this.b;
                i20.a aVar = this.d.n;
                this.a = 1;
                if (this.c.invoke(aVar, n9fVar, this) == y5bVar) {
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
    public b20(i20 i20Var, v1b v1bVar, gaj gajVar) {
        super(1, v1bVar);
        this.b = i20Var;
        this.c = gajVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new b20(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((b20) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        i20<Object> i20Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            z10 z10Var = new z10(i20Var, 0);
            a aVar = new a(i20Var, null, this.c);
            this.a = 1;
            if (androidx.compose.foundation.gestures.a.i(z10Var, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        n9f<Object> n9fVarB = i20Var.b();
        isw iswVar = i20Var.j;
        Object objC = n9fVarB.c(((t5a0) iswVar).j());
        if (objC != null) {
            if (Math.abs(((t5a0) iswVar).j() - i20Var.b().d(objC)) < 0.5f && i20Var.a.invoke(objC).booleanValue()) {
                ((x5a0) i20Var.h).setValue(objC);
                ((x5a0) i20Var.g).setValue(objC);
            }
        }
        return Unit.a;
    }
}
