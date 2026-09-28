package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.deposit.DepositAlertConfigDto;
import com.sporty.android.core.model.pocket.deposit.PlaceholderValuesDto;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getDepositDropAlertConfig$2", f = "PocketRepositoryImpl.kt", l = {1249}, m = "invokeSuspend", v = 2)
public final class vs10 extends tje0 implements Function1<v1b<? super kod>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ms10 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs10(int i, v1b v1bVar, ms10 ms10Var, Integer num, String str) {
        super(1, v1bVar);
        this.c = num;
        this.d = i;
        this.e = str;
        this.f = ms10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        String str = this.e;
        return new vs10(this.d, v1bVar, this.f, this.c, str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super kod> v1bVar) {
        return ((vs10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        StringUiText stringUiText;
        ms10 ms10Var = this.f;
        HashMap<String, god> map = ms10Var.W;
        y5b y5bVar = y5b.a;
        int i = this.b;
        String strP = null;
        if (i == 0) {
            uj50.b(obj);
            String str3 = this.e;
            Integer num = this.c;
            int i2 = this.d;
            String strA = num != null ? i2 + "_" + num : str3 != null ? vga.a(i2, "_", str3) : String.valueOf(i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (map.get(strA) != null) {
                god godVar = map.get(strA);
                if (jCurrentTimeMillis - (godVar != null ? godVar.b : 0L) < ms10Var.V) {
                    god godVar2 = map.get(strA);
                    return godVar2 != null ? godVar2.a : kod.g;
                }
            }
            pr10 pr10Var = ms10Var.a;
            this.a = strA;
            this.b = 1;
            obj = pr10Var.K(i2, str3, num, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            str = strA;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.a;
            uj50.b(obj);
        }
        DepositAlertConfigDto depositAlertConfigDto = (DepositAlertConfigDto) n52.b((BaseResponse) obj);
        depositAlertConfigDto.getClass();
        PlaceholderValuesDto placeholderValues = depositAlertConfigDto.getPlaceholderValues();
        if (placeholderValues == null || (str2 = (String) placeholderValues.get((Object) "estimated_end_time")) == null) {
            str2 = "";
        } else {
            if (StringsKt.U(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
        }
        String str4 = str2;
        Integer payChannelId = depositAlertConfigDto.getPayChannelId();
        Boolean displayAlert = depositAlertConfigDto.getDisplayAlert();
        Boolean bool = Boolean.TRUE;
        boolean zG = Intrinsics.g(displayAlert, bool);
        boolean zG2 = Intrinsics.g(depositAlertConfigDto.getDisplayCreditDelaysHint(), bool);
        boolean zG3 = Intrinsics.g(depositAlertConfigDto.getDisplayMaintenanceAlert(), bool);
        String alertContent = depositAlertConfigDto.getAlertContent();
        PlaceholderValuesDto placeholderValues2 = depositAlertConfigDto.getPlaceholderValues();
        if (alertContent != null && !StringsKt.U(alertContent)) {
            strP = alertContent;
        }
        if (strP != null) {
            if (placeholderValues2 != null) {
                for (Map.Entry<String, String> entry : placeholderValues2.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    String strA2 = tug.a("${", key, "}");
                    if (Intrinsics.g(key, "estimated_end_time")) {
                        value = hod.a(value);
                    }
                    strP = c.p(strP, strA2, value, false);
                }
            }
            stringUiText = new StringUiText(strP);
        } else {
            stringUiText = vch0.a;
        }
        kod kodVar = new kod(payChannelId, zG, zG2, zG3, stringUiText, str4);
        map.put(str, new god(kodVar, System.currentTimeMillis()));
        return kodVar;
    }
}
