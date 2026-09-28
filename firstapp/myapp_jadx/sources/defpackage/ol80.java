package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class ol80<T> implements myh {
    public final /* synthetic */ hl80 a;

    public ol80(hl80 hl80Var) {
        this.a = hl80Var;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ohp<Object>[] ohpVarArr = hl80.N;
        hl80 hl80Var = this.a;
        hl80Var.m0().w0.setImageDrawable(gr0.a(hl80Var.requireContext(), zBooleanValue ? R.drawable.cmn_ic_switch_dark_on : R.drawable.cmn_ic_switch_dark_off));
        return Unit.a;
    }
}
