package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatus;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawTransferViewModel$checkTransferRestricted$1", f = "WithdrawTransferViewModel.kt", l = {211}, m = "invokeSuspend", v = 2)
public final class spj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ TransferStatus b;
    public final /* synthetic */ hqj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spj0(TransferStatus transferStatus, hqj0 hqj0Var, v1b<? super spj0> v1bVar) {
        super(2, v1bVar);
        this.b = transferStatus;
        this.c = hqj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new spj0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((spj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        hqj0 hqj0Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            csg0 csg0VarA = asg0.a(this.b);
            if ((csg0VarA instanceof csg0.b) && ((csg0.b) csg0VarA).a) {
                int i2 = hqj0.E0;
                ku90<a> ku90Var = hqj0Var.f;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.component_supporter__rejected);
                ResourceUiText resourceUiText2 = new ResourceUiText(R.string.component_supporter__transfer_to_friend_restricted_contact_cs_for_more_information);
                ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_functions__live_chat);
                ResourceUiText resourceUiText4 = new ResourceUiText(R.string.common_functions__ok);
                Integer num = new Integer(R.string.component_supporter__rejected);
                this.a = 1;
                obj = b.f(ku90Var, resourceUiText, null, resourceUiText2, resourceUiText3, resourceUiText4, null, num, this, 66);
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
        if (Intrinsics.g((AlertDialogCallbackType) obj, AlertDialogCallbackType.Positive.a)) {
            int i3 = hqj0.E0;
            b.c(hqj0Var.f, snb0.TRANSFER);
        }
        hqj0Var.x0.a(rpj0.e.a);
        return Unit.a;
    }
}
