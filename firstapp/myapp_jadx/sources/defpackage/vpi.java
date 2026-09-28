package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vpi {
    public static final ComposeView a(ViewGroup viewGroup, c12 c12Var) {
        viewGroup.getClass();
        final koi koiVarB = ypi.b(c12Var);
        Context context = viewGroup.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setTag(R.id.view_tree_lifecycle_owner, ll5.b(viewGroup));
        composeView.setTag(R.id.view_tree_view_model_store_owner, tl5.b(viewGroup));
        composeView.setTag(R.id.view_tree_saved_state_registry_owner, ydx.a(viewGroup));
        composeView.setContent(new op8(663291532, new Function2() { // from class: tpi
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final koi koiVar = koiVarB;
                    or0.a(null, false, false, null, pp8.b(-1276141163, new Function2() { // from class: upi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                lpi.a(koiVar, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
