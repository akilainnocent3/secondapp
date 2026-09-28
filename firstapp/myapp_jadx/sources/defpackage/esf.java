package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.edit.compose.EditPlayTimeControlScreenKt$EditPlayTimeControlScreen$1$1", f = "EditPlayTimeControlScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class esf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ suf a;
    public final /* synthetic */ cr10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esf(suf sufVar, cr10 cr10Var, String str, String str2, v1b<? super esf> v1bVar) {
        super(2, v1bVar);
        this.a = sufVar;
        this.b = cr10Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new esf(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((esf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        suf sufVar = this.a;
        sufVar.getClass();
        cr10 cr10Var = this.b;
        cr10Var.getClass();
        sufVar.y1(new quf(sufVar, cr10Var, this.c, this.d, null));
        return Unit.a;
    }
}
