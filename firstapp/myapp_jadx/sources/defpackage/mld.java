package defpackage;

import com.sportybet.android.globalpay.pixBtg.depositQrCode.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mld implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mld(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        nt50 nt50Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ot50 ot50Var = (ot50) zma.a((old) obj, ut50.a);
                return (ot50Var == null || (nt50Var = ot50Var.b) == null) ? pt50.a : nt50Var;
            default:
                ((Function1) obj).invoke(a.i.a);
                return Unit.a;
        }
    }
}
