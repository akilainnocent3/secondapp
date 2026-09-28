package defpackage;

import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;
import com.sportybet.feature.kyc.confirmAccountInfo.d;
import com.sportybet.feature.kyc.confirmAccountInfo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lqa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lqa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ConfirmAccountInfoActivity.a aVar = ConfirmAccountInfoActivity.d;
                ((cny) obj).getClass();
                ((f) ((ConfirmAccountInfoActivity) obj2).c.getValue()).x1(d.b.a);
                break;
            case 1:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                ssw<String> sswVar = ((fuj) obj2).b;
                String str = f1e0Var.c;
                if (str == null) {
                    str = "";
                }
                sswVar.j(str);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                ((a1b0) obj2).t0(str2);
                break;
        }
        return Unit.a;
    }
}
