package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bht implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bht(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.b.a);
                f00 f00Var = vgb0.a;
                vgb0.a(qUnCRF.jSeajHdGYqBQ);
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(vc60.i.a);
                return Unit.a;
            default:
                zwa0 zwa0Var = (zwa0) obj;
                dhj0.a aVar = zwa0Var.C;
                w9e w9eVar = zwa0Var.a;
                aVar.getClass();
                w9eVar.getClass();
                return new dhj0(aVar.a, aVar.b, w9eVar);
        }
    }
}
