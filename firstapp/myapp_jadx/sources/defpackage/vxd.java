package defpackage;

import android.os.Bundle;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vxd extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        rxd rxdVar = (rxd) this.receiver;
        kvi kviVar = rxdVar.b0;
        if (kviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        lop.b(kviVar.f, Boolean.FALSE);
        new Bundle().putString("title", sn5.d(rxdVar, R.string.common_helps__title_t_and_c, new Object[0]));
        rxdVar.F0().d(wae.TERMS_AND_CONDITIONS);
        return Unit.a;
    }
}
