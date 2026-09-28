package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.patron.UserPhone;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$setPhoneDefault$1", f = "DepositMomoViewModel.kt", l = {617}, m = "invokeSuspend", v = 2)
public final class m2e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r2e b;
    public final /* synthetic */ UserPhone c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2e(r2e r2eVar, UserPhone userPhone, String str, v1b<? super m2e> v1bVar) {
        super(2, v1bVar);
        this.b = r2eVar;
        this.c = userPhone;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m2e(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m2e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        r2e r2eVar = this.b;
        wwd0 wwd0Var = r2eVar.U;
        y5b y5bVar = y5b.a;
        int i = this.a;
        UserPhone userPhone = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                wne0 wne0Var = (wne0) wwd0Var.getValue();
                List<aoe0> list = ((wne0) wwd0Var.getValue()).a;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                for (aoe0 aoe0Var : list) {
                    arrayList.add(boe0.a(aoe0Var, Boolean.valueOf(Intrinsics.g(aoe0Var.getId(), this.d)), Boolean.TRUE));
                }
                wne0 wne0VarA = wne0.a(wne0Var, arrayList, true, true, 4);
                wwd0Var.getClass();
                wwd0Var.k(null, wne0VarA);
                lyz lyzVar = r2eVar.s0;
                String phoneCountryCode = userPhone.getPhoneCountryCode();
                String phone = userPhone.getPhone();
                this.a = 1;
                obj = lyzVar.t(phoneCountryCode, phone, this);
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
            if (!((BaseResponse) obj).isSuccessful()) {
                throw new Throwable("Set default failed");
            }
            wwd0 wwd0Var2 = r2eVar.L0;
            wwd0Var2.getClass();
            wwd0Var2.k(null, userPhone);
            ku90<spg0> ku90Var = r2eVar.v;
            int i2 = vpg0.a;
            ku90Var.getClass();
            ku90Var.a(spg0.a.a);
            ku90<a> ku90Var2 = r2eVar.f;
            Object[] objArr = {"+" + userPhone.getPhoneCountryCode() + " " + vtu.a(userPhone.getPhone())};
            StringUiText stringUiText = vch0.a;
            b.i(ku90Var2, new ResourceUiText(R.string.page_payment__successfully_set_vphone_as_the_default_number, ay0.S(objArr)), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            wne0 wne0VarA2 = wne0.a((wne0) wwd0Var.getValue(), null, false, false, 13);
            wwd0Var.getClass();
            wwd0Var.k(null, wne0VarA2);
            return Unit.a;
        } catch (Throwable th) {
            itf0.a.e(th);
            ku90<a> ku90Var3 = r2eVar.f;
            StringUiText stringUiText2 = vch0.a;
            b.i(ku90Var3, new ResourceUiText(R.string.page_payment__failed_to_change_default_number_please_try_again), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
    }
}
