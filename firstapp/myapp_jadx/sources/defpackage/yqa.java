package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoDialogKt$ConfirmAccountInfoDialog$3$1", f = "ConfirmAccountInfoDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yqa extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function2<osp, k00, Unit> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yqa(Function2<? super osp, ? super k00, Unit> function2, v1b<? super yqa> v1bVar) {
        super(2, v1bVar);
        this.a = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yqa(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yqa) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.invoke(osp.b.a, k00.c);
        return Unit.a;
    }
}
