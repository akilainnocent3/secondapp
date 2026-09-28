package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzz implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zzz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                vn20.f(((c000) obj).getContext(), "sportybet", "PAYMENT_LIMIT_REACHED", true, true);
                break;
            default:
                ((ytw) obj).setValue(Boolean.FALSE);
                break;
        }
        return Unit.a;
    }
}
