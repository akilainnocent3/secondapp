package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.betslip.widget.header.BetSlipHeader;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m43 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m43(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0<Unit> function0 = ((BetSlipHeader) obj).P;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                t98 t98Var = (t98) obj;
                Object tag = view.getTag();
                if (!(tag instanceof Pair)) {
                    tag = null;
                }
                Pair pair = (Pair) tag;
                if (pair != null) {
                    t98Var.b.e(((Number) pair.a).intValue(), ((Number) pair.b).intValue());
                }
                break;
        }
    }
}
