package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tl6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tl6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = CashOutLoadingButton.R;
                return ((Context) obj).getDrawable(R.drawable.bg_filled_brand_secondary_2_radius);
            default:
                rqa rqaVar = (rqa) obj;
                ohp<Object>[] ohpVarArr = rqa.z;
                ((ara) rqaVar.w.getValue()).x1(osp.a.a, k00.c);
                Function0<Unit> function0 = rqaVar.v;
                if (function0 != null) {
                    function0.invoke();
                }
                rqaVar.m0();
                return Unit.a;
        }
    }
}
