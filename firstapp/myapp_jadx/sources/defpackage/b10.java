package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
public final class b10 extends tje0 implements gaj<v5b, Float, v1b<? super Unit>, Object> {
    public /* synthetic */ v5b a;
    public /* synthetic */ float b;
    public final /* synthetic */ c20<Object> c;

    @c0d(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {177}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ c20<Object> b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c20<Object> c20Var, float f, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = c20Var;
            this.c = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
                this.a = 1;
                if (this.b.j(this.c, this) == y5bVar) {
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
    public b10(c20<Object> c20Var, v1b<? super b10> v1bVar) {
        super(3, v1bVar);
        this.c = c20Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, Float f, v1b<? super Unit> v1bVar) {
        float fFloatValue = f.floatValue();
        b10 b10Var = new b10(this.c, v1bVar);
        b10Var.a = v5bVar;
        b10Var.b = fFloatValue;
        return b10Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ej5.c(this.a, null, null, new a(this.c, this.b, null), 3);
        return Unit.a;
    }
}
