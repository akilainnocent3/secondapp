package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Market;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ekf {
    public static final /* synthetic */ int a = 0;

    public static final boolean a(Selection selection, mjf mjfVar) {
        ckf ckfVar = null;
        if (selection != null) {
            Market market = selection.b;
            String str = market != null ? market.id : null;
            if (!Intrinsics.g(str, "60200") && !Intrinsics.g(str, "60100")) {
                if (rlc.b(selection)) {
                    ckfVar = ckf.d;
                } else if (yay.e(market) != null) {
                    ckfVar = ckf.c;
                } else if (qvy.c(selection)) {
                    ckfVar = ckf.e;
                }
            }
        }
        return (ckfVar == null || mjfVar == null || mjfVar.d(ckfVar)) ? false : true;
    }
}
