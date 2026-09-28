package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fpd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fpd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                jpd jpdVar = (jpd) obj;
                fqd fqdVarP0 = jpdVar.P0();
                ej5.c(o8i0.d(fqdVarP0), null, null, new mpd(fqdVarP0, null), 3);
                ivi iviVar = jpdVar.g0;
                if (iviVar != null) {
                    c8i0.g(iviVar.b);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
            default:
                ((Function1) obj).invoke(b.h.a);
                return Unit.a;
        }
    }
}
