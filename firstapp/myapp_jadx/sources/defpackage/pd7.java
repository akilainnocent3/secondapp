package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pd7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pd7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wwd0 wwd0Var;
        int i;
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                td7 td7Var = (td7) obj2;
                String str = (String) obj;
                qrr qrrVar = td7Var.a;
                qrrVar.getClass();
                if (!Intrinsics.g(qrrVar.A.getText().toString(), str)) {
                    qrr qrrVar2 = td7Var.a;
                    qrrVar2.getClass();
                    qrrVar2.A.setText(str);
                }
                qrr qrrVar3 = td7Var.a;
                qrrVar3.getClass();
                int length = qrrVar3.A.length();
                if (length >= td7Var.e) {
                    qrr qrrVar4 = td7Var.a;
                    qrrVar4.getClass();
                    qrrVar4.I.setText(td7Var.getString(R.string.live_chat_max_text_length, Integer.valueOf(length), Integer.valueOf(td7Var.d)));
                    wwd0Var = td7Var.m0().i;
                    i = 0;
                } else {
                    wwd0Var = td7Var.m0().i;
                    i = 4;
                }
                kd2.a(i, wwd0Var, null);
                break;
            case 1:
                ocu ocuVar = (ocu) obj2;
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null) {
                    ej5.c(o8i0.d(ocuVar), null, null, new cdu(baseResponse, ocuVar, null), 3);
                } else {
                    ej5.c(o8i0.d(ocuVar), null, null, new ddu(ocuVar, null), 3);
                    Unit unit = Unit.a;
                }
                break;
            default:
                ((ylb0) obj2).L3();
                break;
        }
        return Unit.a;
    }
}
