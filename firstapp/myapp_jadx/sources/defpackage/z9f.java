package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableKt$longPressDraggable$4$1$1$1$1$1", f = "Draggable.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class z9f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ psw b;
    public final /* synthetic */ i9f.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9f(psw pswVar, i9f.b bVar, v1b<? super z9f> v1bVar) {
        super(2, v1bVar);
        this.b = pswVar;
        this.c = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z9f(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z9f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            psw pswVar = this.b;
            if (pswVar != null) {
                i9f.a aVar = new i9f.a(this.c);
                this.a = 1;
                obj = pswVar.a(aVar, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        return Unit.a;
    }
}
