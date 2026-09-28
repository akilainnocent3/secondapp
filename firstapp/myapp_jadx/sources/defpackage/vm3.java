package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vm3 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List listK;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xm3.e((UiText) obj3, (a) obj, qj40.a(1));
                break;
            default:
                x7c0 x7c0Var = (x7c0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (((Boolean) ((x5a0) x7c0Var.c1().k0).getValue()).booleanValue()) {
                        op5 op5Var = op5.a;
                        listK = b.k(new a7a0(op5.c(op5Var, "xmas_snow_4:sg_game_name", "https://s.sporty.net/common/main/res/ebd8b2d93dcb89c1c4d3fa4d80ab4cc3.webp"), 0.2f, 23.0f, ht.a.a), new a7a0(op5.c(op5Var, "xmas_snow_5:sg_game_name", "https://s.sporty.net/common/main/res/35f7370f2d849c5fa43dcb1586fe5a8.webp"), 0.2f, 28.0f, ht.a.c));
                    } else {
                        listK = m2g.a;
                    }
                    c7a0.a(listK, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vm3(x7c0 x7c0Var) {
        this.b = x7c0Var;
    }
}
