package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.patron.VerifyCodeStatus;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawTransferViewModel$clickVerifyingEnableButton$1", f = "WithdrawTransferViewModel.kt", l = {251, 469}, m = "invokeSuspend", v = 2)
public final class upj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public hqj0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hqj0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upj0(hqj0 hqj0Var, v1b<? super upj0> v1bVar) {
        super(2, v1bVar);
        this.e = hqj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        upj0 upj0Var = new upj0(this.e, v1bVar);
        upj0Var.d = obj;
        return upj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((upj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object bVar;
        Object obj2;
        hqj0 hqj0Var;
        UiText stringUiText;
        hqj0 hqj0Var2 = this.e;
        wwd0 wwd0Var = hqj0Var2.n0;
        wwd0 wwd0Var2 = hqj0Var2.G;
        y5b y5bVar = y5b.a;
        int i = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                int i2 = hqj0.E0;
                wwd0Var2.setValue(tzs.b.a);
                wwd0Var.setValue(c330.b.a);
                zi50.a aVar = zi50.b;
                lyz lyzVar = hqj0Var2.i0;
                this.d = null;
                this.c = 1;
                obj = lyzVar.p0(this);
                if (obj == y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hqj0Var = this.b;
                obj2 = this.a;
                uj50.b(obj);
            }
            int i3 = hqj0.E0;
            vpg0.d(hqj0Var.v);
            bVar = obj2;
            if (zi50.a(bVar) != null) {
                int i4 = hqj0.E0;
                b.i(hqj0Var2.f, vch0.b, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            return Unit.a;
            bVar = (BaseResponse) obj;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        c330.a aVar4 = new c330.a(null, ((TransferStatus) hqj0Var2.A0.a.getValue()).isVerificationAllPassed());
        wwd0Var.getClass();
        wwd0Var.k(null, aVar4);
        wwd0Var2.setValue(tzs.a.a);
        if (!(bVar instanceof zi50.b)) {
            BaseResponse baseResponse = (BaseResponse) bVar;
            if (baseResponse.bizCode != 10000) {
                ku90<a> ku90Var = hqj0Var2.f;
                String str = baseResponse.message;
                if (str != null) {
                    StringUiText stringUiText2 = vch0.a;
                    stringUiText = new StringUiText(str);
                } else {
                    stringUiText = vch0.b;
                }
                b.i(ku90Var, stringUiText, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            this.d = null;
            this.a = bVar;
            this.b = hqj0Var2;
            this.c = 2;
            bc6 bc6Var = new bc6(1, yzo.b(this));
            bc6Var.q();
            ku90<rpj0> ku90Var2 = hqj0Var2.x0;
            VerifyCodeStatus verifyCodeStatus = (VerifyCodeStatus) baseResponse.data;
            ku90Var2.a(new rpj0.f(verifyCodeStatus != null ? verifyCodeStatus.getRemainMsgNum() : null, bc6Var));
            Object objO = bc6Var.o();
            y5b y5bVar2 = y5b.a;
            if (objO != y5bVar) {
                obj2 = bVar;
                hqj0Var = hqj0Var2;
                int i5 = hqj0.E0;
                vpg0.d(hqj0Var.v);
                bVar = obj2;
            }
            return y5bVar;
        }
        if (zi50.a(bVar) != null) {
            int i6 = hqj0.E0;
            b.i(hqj0Var2.f, vch0.b, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        return Unit.a;
    }
}
