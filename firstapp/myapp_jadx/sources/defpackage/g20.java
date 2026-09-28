package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {1170}, m = "invokeSuspend")
public final class g20 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i20<Object> b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ iaj<t00, n9f<Object>, Object, v1b<? super Unit>, Object> d;

    @c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {1172}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<Pair<? extends n9f<Object>, Object>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ iaj<t00, n9f<Object>, Object, v1b<? super Unit>, Object> c;
        public final /* synthetic */ i20<Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(iaj<? super t00, ? super n9f<Object>, Object, ? super v1b<? super Unit>, ? extends Object> iajVar, i20<Object> i20Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = iajVar;
            this.d = i20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends n9f<Object>, Object> pair, v1b<? super Unit> v1bVar) {
            return ((a) create(pair, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Pair pair = (Pair) this.b;
                n9f<Object> n9fVar = (n9f) pair.a;
                Object obj2 = pair.b;
                i20.a aVar = this.d.n;
                this.a = 1;
                if (this.c.d(aVar, n9fVar, obj2, this) == y5bVar) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public g20(i20<Object> i20Var, Object obj, iaj<? super t00, ? super n9f<Object>, Object, ? super v1b<? super Unit>, ? extends Object> iajVar, v1b<? super g20> v1bVar) {
        super(1, v1bVar);
        this.b = i20Var;
        this.c = obj;
        this.d = iajVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new g20(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((g20) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Object obj2 = this.c;
        final i20<Object> i20Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            ((x5a0) i20Var.l).setValue(obj2);
            Function0 function0 = new Function0() { // from class: f20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    i20 i20Var2 = i20Var;
                    return new Pair(i20Var2.b(), i20Var2.i.getValue());
                }
            };
            a aVar = new a(this.d, i20Var, null);
            this.a = 1;
            if (androidx.compose.foundation.gestures.a.i(function0, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (i20Var.a.invoke(obj2).booleanValue()) {
            i20Var.n.a(i20Var.b().d(obj2), ((t5a0) i20Var.k).j());
            ((x5a0) i20Var.h).setValue(obj2);
            ((x5a0) i20Var.g).setValue(obj2);
        }
        return Unit.a;
    }
}
