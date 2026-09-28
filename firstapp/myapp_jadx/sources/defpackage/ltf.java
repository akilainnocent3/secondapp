package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.edit.compose.EditSportsScreenKt$EditSportsScreen$6$1", f = "EditSportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ltf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ zsf a;
    public final /* synthetic */ scs b;
    public final /* synthetic */ vfb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltf(v1b v1bVar, zsf zsfVar, scs scsVar, vfb0 vfb0Var) {
        super(2, v1bVar);
        this.a = zsfVar;
        this.b = scsVar;
        this.c = vfb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ltf(v1bVar, this.a, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ltf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zsf zsfVar = this.a;
        zsfVar.y1(new vsf(null, zsfVar, this.b, this.c));
        return Unit.a;
    }
}
