package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ypi {
    public static final void a(ComposeView composeView, Function0<Unit> function0) {
        final koi koiVarB = b(function0);
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setTag(R.id.view_tree_lifecycle_owner, ll5.b(composeView));
        composeView.setTag(R.id.view_tree_view_model_store_owner, tl5.b(composeView));
        composeView.setTag(R.id.view_tree_saved_state_registry_owner, ydx.a(composeView));
        composeView.setContent(new op8(-1275995665, new Function2() { // from class: wpi
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final koi koiVar = koiVarB;
                    or0.a(null, false, false, null, pp8.b(-2056264186, new Function2() { // from class: xpi
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
    }

    public static final koi b(Function0<Unit> function0) {
        StringUiText stringUiText = vch0.a;
        return new koi(new ResourceUiText(R.string.main_footer__back_to_top), "scroll_to_top", function0);
    }
}
