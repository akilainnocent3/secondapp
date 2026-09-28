package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bd7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bd7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                td7 td7Var = (td7) obj2;
                CountryCodeName countryCodeName = (CountryCodeName) obj;
                if (td7Var.m0().w.d() == c7i0.MyCountry) {
                    mpe0 mpe0Var = ljs.a;
                    qrr qrrVar = td7Var.a;
                    qrrVar.getClass();
                    ljs.d(qrrVar.w, countryCodeName);
                }
                mpe0 mpe0Var2 = ljs.a;
                qrr qrrVar2 = td7Var.a;
                qrrVar2.getClass();
                ljs.d(qrrVar2.F.b, countryCodeName);
                break;
            case 1:
                Function1 function1 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() > 0) {
                    function1.invoke(str);
                }
                break;
            default:
                ku90<spg0> ku90Var = ((hqj0) obj2).v;
                if (((AlertDialogCallbackType) obj) instanceof AlertDialogCallbackType.Positive) {
                    int i2 = hqj0.E0;
                    vpg0.a(ku90Var);
                } else {
                    int i3 = hqj0.E0;
                    vpg0.b(ku90Var, aqg0.e.c);
                }
                break;
        }
        return Unit.a;
    }
}
