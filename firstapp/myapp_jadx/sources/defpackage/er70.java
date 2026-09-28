package defpackage;

import androidx.compose.foundation.gestures.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {532}, m = "invokeSuspend")
public final class er70 extends tje0 implements Function2<gly, v1b<? super gly>, Object> {
    public int a;
    public /* synthetic */ long b;
    public final /* synthetic */ br70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er70(br70 br70Var, v1b<? super er70> v1bVar) {
        super(2, v1bVar);
        this.c = br70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        er70 er70Var = new er70(this.c, v1bVar);
        er70Var.b = ((gly) obj).a;
        return er70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(gly glyVar, v1b<? super gly> v1bVar) {
        long j = glyVar.a;
        er70 er70Var = new er70(this.c, v1bVar);
        er70Var.b = j;
        return er70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        long j = this.b;
        wr70 wr70Var = this.c.T;
        this.a = 1;
        Object objB = b.b(wr70Var, j, this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
