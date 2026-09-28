package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvld;", "Lh7v;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vld extends qpl {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-315547429, new Function2() { // from class: sld
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final vld vldVar = this.a;
                    or0.a(null, false, false, null, pp8.b(-729387406, new Function2() { // from class: tld
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                String strA = cb40.a(R.string.bet_history__delete_mode_tutorial_hint, new Object[0], aVar2);
                                List listK = b.k(new ezg0(cb40.a(R.string.bet_history__swipe_delete_hint_img_1, new Object[0], aVar2), cb40.a(R.string.bet_history__press_and_hold_a_ticket, new Object[0], aVar2)), new ezg0(cb40.a(R.string.bet_history__swipe_delete_hint_img_2, new Object[0], aVar2), cb40.a(R.string.bet_history__swipe_left_to_delete_it, new Object[0], aVar2)));
                                vld vldVar2 = vldVar;
                                boolean zA = aVar2.A(vldVar2);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new dvn(vldVar2, i);
                                    aVar2.r(objY);
                                }
                                bzg0.b(strA, listK, (Function0) objY, null, "delete_history_tutorial", "bet_history__swipe_delete_feature_hint", 3.0f, aVar2, 14352384, 24);
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

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        getParentFragmentManager().m0("REQUEST_KEY_SHOW_DELETE_HISTORY_TUTORIAL_DIALOG", new Bundle(0));
    }
}
