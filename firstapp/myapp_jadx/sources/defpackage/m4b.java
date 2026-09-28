package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m4b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m4b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tsr tsrVarF = pkd.f((t4b) obj);
                if (!tsrVarF.I) {
                    xsr.a(tsrVarF).c(tsrVarF);
                }
                break;
            default:
                ((kab0) obj).r0(null);
                break;
        }
        return Unit.a;
    }
}
