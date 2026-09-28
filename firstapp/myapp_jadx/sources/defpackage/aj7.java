package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aj7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aj7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                vtw vtwVar = (vtw) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType.equals(AlertDialogCallbackType.Negative.a)) {
                    vtwVar.getClass();
                    vtwVar.a(m480.b.a);
                }
                return Unit.a;
            case 1:
                bw50 bw50Var = (bw50) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1(bw50Var.a);
                bw50Var.b.invoke(hq60VarH1);
                try {
                    int iB = l0b.b(hq60VarH1, AnalyticsParam.EVENT_PARAM_ID);
                    int iB2 = l0b.b(hq60VarH1, "start_time");
                    int iB3 = l0b.b(hq60VarH1, "url");
                    int iB4 = l0b.b(hq60VarH1, "method");
                    int iB5 = l0b.b(hq60VarH1, "original_body");
                    int iB6 = l0b.b(hq60VarH1, "encrypted_body");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList.add(new EncryptedRequest(hq60VarH1.getLong(iB), hq60VarH1.getLong(iB2), hq60VarH1.k1(iB3), hq60VarH1.k1(iB4), hq60VarH1.k1(iB5), hq60VarH1.k1(iB6)));
                    }
                    hq60VarH1.close();
                    return arrayList;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
            default:
                String str = (String) obj;
                str.getClass();
                ((y6p) obj2).invoke(new mvk.c(str));
                return Unit.a;
        }
    }
}
