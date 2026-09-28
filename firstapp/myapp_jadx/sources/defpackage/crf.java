package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.confirmation.compose.EditPlayTimeConfirmationScreenKt$EditPlayTimeConfirmationScreen$1$1", f = "EditPlayTimeConfirmationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class crf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ mrf a;
    public final /* synthetic */ cr10 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crf(mrf mrfVar, cr10 cr10Var, int i, v1b<? super crf> v1bVar) {
        super(2, v1bVar);
        this.a = mrfVar;
        this.b = cr10Var;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new crf(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((crf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mrf mrfVar = this.a;
        mrfVar.getClass();
        cr10 cr10Var = this.b;
        cr10Var.getClass();
        mrfVar.y1(new krf(mrfVar, cr10Var, this.c, null));
        return Unit.a;
    }
}
