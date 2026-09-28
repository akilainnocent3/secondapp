package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.withdraw.WithdrawAlertConfigDto;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getWithdrawDropAlertConfig$2", f = "PocketRepositoryImpl.kt", l = {1216}, m = "invokeSuspend", v = 2)
public final class qt10 extends tje0 implements Function1<v1b<? super qhj0>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ iw1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ms10 f;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt10(iw1 iw1Var, int i, String str, ms10 ms10Var, int i2, v1b<? super qt10> v1bVar) {
        super(1, v1bVar);
        this.c = iw1Var;
        this.d = i;
        this.e = str;
        this.f = ms10Var;
        this.i = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new qt10(this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super qhj0> v1bVar) {
        return ((qt10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strA;
        String str;
        ms10 ms10Var = this.f;
        HashMap<String, chj0> map = ms10Var.U;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            iw1 iw1Var = this.c;
            iw1.a aVar = iw1Var instanceof iw1.a ? (iw1.a) iw1Var : null;
            String str2 = aVar != null ? aVar.a : null;
            iw1.b bVar = iw1Var instanceof iw1.b ? (iw1.b) iw1Var : null;
            Integer num = bVar != null ? new Integer(bVar.a) : null;
            int i2 = this.d;
            if (num != null) {
                strA = i2 + "_" + num;
            } else if (str2 != null) {
                strA = vga.a(i2, "_", str2);
            } else {
                String str3 = this.e;
                strA = str3 != null ? vga.a(i2, "_", str3) : String.valueOf(i2);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (map.get(strA) != null) {
                chj0 chj0Var = map.get(strA);
                if (jCurrentTimeMillis - (chj0Var != null ? chj0Var.b : 0L) < ms10Var.T) {
                    chj0 chj0Var2 = map.get(strA);
                    return chj0Var2 != null ? chj0Var2.a : qhj0.d;
                }
            }
            pr10 pr10Var = ms10Var.a;
            this.a = strA;
            this.b = 1;
            Object objD0 = pr10Var.d0(this.i, this.d, this.e, str2, num, this);
            if (objD0 == y5bVar) {
                return y5bVar;
            }
            String str4 = strA;
            obj = objD0;
            str = str4;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.a;
            uj50.b(obj);
        }
        WithdrawAlertConfigDto withdrawAlertConfigDto = (WithdrawAlertConfigDto) n52.b((BaseResponse) obj);
        withdrawAlertConfigDto.getClass();
        Boolean displayAlert = withdrawAlertConfigDto.getDisplayAlert();
        Boolean bool = Boolean.TRUE;
        boolean zG = Intrinsics.g(displayAlert, bool);
        boolean zG2 = Intrinsics.g(withdrawAlertConfigDto.getDisplayCreditDelaysHint(), bool);
        String alertContent = withdrawAlertConfigDto.getAlertContent();
        qhj0 qhj0Var = new qhj0(zG, zG2, alertContent != null ? new StringUiText(alertContent) : vch0.a);
        map.put(str, new chj0(qhj0Var, System.currentTimeMillis()));
        return qhj0Var;
    }
}
