package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
public final class awr extends tje0 implements Function2<tp70, v1b<? super Unit>, Object> {
    public final /* synthetic */ zvr a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awr(zvr zvrVar, int i, v1b v1bVar) {
        super(2, v1bVar);
        this.a = zvrVar;
        this.b = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new awr(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tp70 tp70Var, v1b<? super Unit> v1bVar) {
        return ((awr) create(tp70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zvr zvrVar = this.a;
        mvr mvrVar = zvrVar.d;
        int iD = ((u5a0) mvrVar.a).D();
        int i = this.b;
        if (iD != i || ((u5a0) mvrVar.b).D() != 0) {
            LazyLayoutItemAnimator<hvr> lazyLayoutItemAnimator = zvrVar.m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.b = null;
            lazyLayoutItemAnimator.c = -1;
            pdd pddVar = zvrVar.a;
        }
        mvrVar.a(i, 0);
        mvrVar.d = null;
        y250 y250Var = zvrVar.j;
        if (y250Var != null) {
            y250Var.d();
        }
        return Unit.a;
    }
}
