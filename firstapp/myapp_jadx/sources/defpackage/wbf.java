package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableListScopeImpl$draggableHandle$2", f = "DraggableList.kt", l = {234}, m = "invokeSuspend", v = 2)
public final class wbf extends tje0 implements gaj<v5b, Float, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ v5b b;
    public /* synthetic */ float c;
    public final /* synthetic */ pbf d;
    public final /* synthetic */ ybf e;

    @c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableListScopeImpl$draggableHandle$2$1", f = "DraggableList.kt", l = {233}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ybf b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ybf ybfVar, float f, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ybfVar;
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
                ybf ybfVar = this.b;
                fcf fcfVar = ybfVar.a;
                int i2 = ybfVar.c;
                this.a = 1;
                if (fcfVar.a(this.c, i2, this) == y5bVar) {
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
    public wbf(pbf pbfVar, ybf ybfVar, v1b v1bVar) {
        super(3, v1bVar);
        this.d = pbfVar;
        this.e = ybfVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, Float f, v1b<? super Unit> v1bVar) {
        float fFloatValue = f.floatValue();
        wbf wbfVar = new wbf(this.d, this.e, v1bVar);
        wbfVar.b = v5bVar;
        wbfVar.c = fFloatValue;
        return wbfVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = this.b;
        float f = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new a(this.e, f, null), 3);
            Float f2 = new Float(f);
            this.b = null;
            this.c = f;
            this.a = 1;
            if (this.d.invoke(v5bVar, f2, this) == y5bVar) {
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
