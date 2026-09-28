package defpackage;

import com.sportybet.plugin.realsports.autobet.widget.AutoBetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class exe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ exe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(ywe.h.a);
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(bri0.h.a);
                return Unit.a;
            default:
                int i2 = AutoBetActivity.f;
                azm azmVar = ((AutoBetActivity) obj).c;
                if (azmVar != null) {
                    azmVar.d(wae.DEPOSIT);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
        }
    }
}
