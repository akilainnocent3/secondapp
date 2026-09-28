package defpackage;

import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dzr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dzr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new xyr((Function1) ((ytw) obj).getValue());
            case 1:
                m410 m410Var = (m410) obj;
                m410Var.g1 = false;
                m410Var.h1 = false;
                m410Var.S0();
                return Unit.a;
            case 2:
                ((Function1) obj).invoke(b.h.a.a);
                return Unit.a;
            default:
                eeh0 eeh0Var = (eeh0) obj;
                eeh0Var.dismiss();
                eeh0Var.a.b();
                return Unit.a;
        }
    }
}
