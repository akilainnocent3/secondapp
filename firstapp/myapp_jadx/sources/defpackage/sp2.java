package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class sp2 extends cz1 {
    public final String a;
    public final ComposeView b;

    static {
        int i = ComposeView.z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp2(Context context, String str) {
        super(new ComposeView(context, null, 6, 0));
        context.getClass();
        str.getClass();
        this.a = str;
        View view = this.itemView;
        view.getClass();
        ComposeView composeView = (ComposeView) view;
        this.b = composeView;
        composeView.setViewCompositionStrategy(u6i0.c.a);
    }

    @Override // defpackage.cz1
    public final void a(int i) {
        this.b.setContent(new op8(-1750318448, new Function2() { // from class: rp2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sp2 sp2Var = this.a;
                    View view = sp2Var.itemView;
                    view.getClass();
                    String strC = sn5.c(view, R.string.bet_history__bet_history_retained_hint_content, sp2Var.a);
                    StringUiText stringUiText = vch0.a;
                    pp2.a(new StringUiText(strC), false, 0.0f, null, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
