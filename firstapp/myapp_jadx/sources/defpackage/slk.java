package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class slk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ slk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(jkk.a.a);
                break;
            case 1:
                ((Function1) obj).invoke(x8u.h.a);
                break;
            default:
                fgb fgbVar = (fgb) obj;
                fgbVar.u0(fgbVar.S0());
                break;
        }
        return Unit.a;
    }
}
