package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class lqu {
    public static final void a(final int i, final op8 op8Var, a aVar, final boolean z) {
        b bVarI = aVar.i(-534039207);
        int i2 = i | 2;
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                z = doc.a(bVarI);
            } else {
                bVarI.G();
            }
            bVarI.Y();
            hna.a(vh60.a.a(z ? q58.b : q58.a), pp8.b(1089652889, new psb0(op8Var, i3), bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var, z) { // from class: iof0
                public final /* synthetic */ boolean a;
                public final /* synthetic */ op8 b;

                {
                    this.a = z;
                    this.b = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lqu.a(qj40.a(49), this.b, (a) obj, this.a);
                    return Unit.a;
                }
            };
        }
    }

    public static final jqu b(BubbleView bubbleView) {
        bubbleView.getClass();
        Object tag = bubbleView.getTag(R.id.hint_popup_tag);
        if (tag instanceof jqu) {
            return (jqu) tag;
        }
        return null;
    }

    public static final void c(BubbleView bubbleView, jqu jquVar, Function0 function0) {
        bubbleView.getClass();
        bubbleView.setTag(R.id.hint_popup_tag, jquVar);
        int iOrdinal = jquVar.ordinal();
        if (iOrdinal == 0) {
            bubbleView.setTitle(sn5.c(bubbleView, R.string.component_betslip__early_goal_tip_title, new Object[0]));
            gby.a(bubbleView.getDescriptionView(), new kqu(0, function0, bubbleView));
        } else if (iOrdinal != 1) {
            uhc.a();
        } else {
            bubbleView.setTitle(sn5.c(bubbleView, R.string.component_betslip__dc_1up_tip_title, new Object[0]));
            bubbleView.setDescription(sn5.c(bubbleView, R.string.component_betslip__dc_1up_tip_desc, new Object[0]));
        }
    }
}
