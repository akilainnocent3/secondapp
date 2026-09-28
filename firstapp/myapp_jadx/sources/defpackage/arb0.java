package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class arb0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ arb0(qub0 qub0Var) {
        this.b = qub0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strB;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                qub0 qub0Var = (qub0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    gvi gviVar = qub0Var.z;
                    if (gviVar != null) {
                        gviVar.v0.setVisibility(0);
                    }
                    boolean zA = yju.a("mx");
                    if (zA) {
                        op5.a.getClass();
                        strB = op5.b("hero_bg_webp_mx:sg_sporty_hero", "https://s.sporty.net/cms/Sporty_hero_MX_BG_3_4114458af4_44f65f708a.webp", null);
                    } else {
                        op5.a.getClass();
                        strB = op5.b("hero_bg_webp:sg_sporty_hero", "https://s.sporty.net/common/main/res/1b657d2b1d4dfa3c03b3a1b33f4f959b.webp", null);
                    }
                    qub0Var.n3(0, aVar, strB, ((MultiplierResponse) ((x5a0) qub0Var.R0().b).getValue()).getMessageType(), zA, ((Boolean) ((x5a0) qub0Var.G2).getValue()).booleanValue());
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                k0k0.c((String) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ arb0(String str, int i) {
        this.b = str;
    }
}
