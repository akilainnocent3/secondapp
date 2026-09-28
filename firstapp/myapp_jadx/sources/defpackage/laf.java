package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableLazyItemScopeImpl$draggableHandle$1$3", f = "DraggableLazyItemScope.kt", l = {80}, m = "invokeSuspend", v = 2)
public final class laf extends tje0 implements gaj<v5b, gly, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ v5b b;
    public /* synthetic */ long c;
    public final /* synthetic */ faf d;
    public final /* synthetic */ aq40 e;
    public final /* synthetic */ naf f;
    public final /* synthetic */ bq40 i;

    @c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableLazyItemScopeImpl$draggableHandle$1$3$1", f = "DraggableLazyItemScope.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ aq40 b;
        public final /* synthetic */ naf c;
        public final /* synthetic */ bq40 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(aq40 aq40Var, naf nafVar, bq40 bq40Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = aq40Var;
            this.c = nafVar;
            this.d = bq40Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
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
                float f = this.b.a;
                naf nafVar = this.c;
                float fFloatValue = (this.d.a / 2.0f) + (f - ((Number) nafVar.c.invoke()).floatValue());
                abf abfVar = nafVar.a;
                Integer num = nafVar.b;
                this.a = 1;
                if (abfVar.c(num, fFloatValue, this) == y5bVar) {
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
    public laf(faf fafVar, aq40 aq40Var, naf nafVar, bq40 bq40Var, v1b v1bVar) {
        super(3, v1bVar);
        this.d = fafVar;
        this.e = aq40Var;
        this.f = nafVar;
        this.i = bq40Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, gly glyVar, v1b<? super Unit> v1bVar) {
        long j = glyVar.a;
        naf nafVar = this.f;
        bq40 bq40Var = this.i;
        laf lafVar = new laf(this.d, this.e, nafVar, bq40Var, v1bVar);
        lafVar.b = v5bVar;
        lafVar.c = j;
        return lafVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = this.b;
        long j = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ej5.c(v5bVar, null, null, new a(this.e, this.f, this.i, null), 3);
            this.b = null;
            this.c = j;
            this.a = 1;
            if (new faf(3, this).invokeSuspend(Unit.a) == y5bVar) {
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
