package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fem implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fem(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final dfm dfmVar = (dfm) obj;
                List<String> list = dfm.v2;
                dfmVar.T0.s0(0);
                dfmVar.i1.post(new Runnable() { // from class: uem
                    @Override // java.lang.Runnable
                    public final void run() {
                        List<String> list2 = dfm.v2;
                        ConsecutiveScrollerLayout consecutiveScrollerLayout = dfmVar.i1;
                        consecutiveScrollerLayout.D(consecutiveScrollerLayout.getChildAt(0));
                    }
                });
                return Unit.a;
            case 1:
                sp80 sp80Var = (sp80) obj;
                if (sp80Var.b == null) {
                    Intrinsics.n("dismissListener");
                    throw null;
                }
                Unit unit = Unit.a;
                sp80Var.dismiss();
                return Unit.a;
            default:
                Intent intent = new Intent("cashoutCall");
                intent.putExtra("betIndex", 2);
                Context context = ((ComposeView) obj).getContext();
                if (context != null) {
                    fdt.a(context).c(intent);
                }
                return Unit.a;
        }
    }
}
