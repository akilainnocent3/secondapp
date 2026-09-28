package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.domain.usecase.ShouldShowUniqueCodeInfoSheetUseCase$invoke$1", f = "ShouldShowUniqueCodeInfoSheetUseCase.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class i990 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ j990 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i990(j990 j990Var, v1b<? super i990> v1bVar) {
        super(2, v1bVar);
        this.b = j990Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i990(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((i990) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        j990 j990Var = this.b;
        mgb0 mgb0Var = j990Var.a;
        y5b y5bVar = y5b.a;
        int i = this.a;
        boolean z = false;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = j990Var.b;
            this.a = 1;
            obj = m2lVar.a.getBoolean("show_unique_code_bottom_dialog", false, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (!((Boolean) obj).booleanValue() && mgb0Var.hasPersonalPage()) {
            AccountInfo accountInfoLastAccountInfo = mgb0Var.lastAccountInfo();
            if (accountInfoLastAccountInfo != null ? Intrinsics.g(accountInfoLastAccountInfo.isCreator(), Boolean.TRUE) : false) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
