package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
public final class jp70 extends tje0 implements Function2<tp70, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ aq40 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp70(aq40 aq40Var, float f, v1b<? super jp70> v1bVar) {
        super(2, v1bVar);
        this.b = aq40Var;
        this.c = f;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jp70 jp70Var = new jp70(this.b, this.c, v1bVar);
        jp70Var.a = obj;
        return jp70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tp70 tp70Var, v1b<? super Unit> v1bVar) {
        return ((jp70) create(tp70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.a = ((tp70) this.a).e(this.c);
        return Unit.a;
    }
}
