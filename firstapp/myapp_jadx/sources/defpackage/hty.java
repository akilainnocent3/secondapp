package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hty implements Function0 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ ity b;
    public final /* synthetic */ nty c;

    public /* synthetic */ hty(Function0 function0, ity ityVar, nty ntyVar) {
        this.a = function0;
        this.b = ityVar;
        this.c = ntyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function0 = this.a;
        if (function0 != null) {
            function0.invoke();
        } else {
            nty ntyVar = this.c;
            ntyVar.getClass();
            if (ntyVar.equals(nty.c.a)) {
                ety etyVar = this.b.e;
                avy avyVar = avy.a;
                etyVar.a();
            }
        }
        return Unit.a;
    }
}
