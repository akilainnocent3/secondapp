package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g8y implements ud {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g8y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        Object value;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                y9y y9yVar = (y9y) ((h8y) obj2).H.getValue();
                wwd0 wwd0Var = y9yVar.W;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, x8y.a((x8y) value, null, null, null, null, null, null, null, null, null, null, null, null, null, new d3b((ResourceUiText) y9yVar.F1()), 16383)));
                break;
            default:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if ("android.permission.POST_NOTIFICATIONS".equals(preMatchEventActivity.V1)) {
                    Boolean bool2 = preMatchEventActivity.W1;
                    if (bool2 == null || !bool2.equals(bool)) {
                        if (zBooleanValue) {
                            gym.a(preMatchEventActivity.E1(), l0y.a);
                        } else {
                            gym.a(preMatchEventActivity.E1(), k0y.a);
                        }
                    }
                    preMatchEventActivity.W1 = null;
                }
                ge00 ge00Var = preMatchEventActivity.Z1;
                if (ge00Var != null) {
                    ge00Var.a(zBooleanValue);
                }
                break;
        }
    }
}
