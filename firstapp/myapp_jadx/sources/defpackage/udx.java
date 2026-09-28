package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.feature.payment.impl.security.nameupdate.presentation.viewmodel.NameUpdateResultPopupViewModel$setNameUpdateResultDialogHasShown$1", f = "NameUpdateResultPopupViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class udx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vdx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udx(vdx vdxVar, v1b<? super udx> v1bVar) {
        super(2, v1bVar);
        this.b = vdxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new udx(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((udx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = this.b.a;
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (m2lVar.a.putBoolean("key_name_update_result_dialog_has_shown", bool, this) == y5bVar) {
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
