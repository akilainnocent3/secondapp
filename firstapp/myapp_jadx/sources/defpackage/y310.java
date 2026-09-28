package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y310 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y310(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                m410 m410Var = (m410) obj;
                if (m410Var.a1()) {
                    m410Var.z0 = m410.a.c;
                    m410Var.i1();
                } else {
                    e activity = m410Var.getActivity();
                    if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a)) {
                        m410Var.v1();
                    }
                }
                break;
            default:
                zih0 zih0Var = (zih0) obj;
                sih0 sih0Var = zih0Var.b;
                jqu jquVarB = lqu.b(sih0Var.c);
                if (jquVarB == null) {
                    jquVarB = jqu.a;
                }
                gqs gqsVar = zih0Var.g;
                if (gqsVar != null) {
                    gqsVar.b(jquVarB);
                }
                sih0Var.c.setVisibility(8);
                break;
        }
        return Unit.a;
    }
}
