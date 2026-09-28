package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.e;
import com.sportybet.android.social.presentation.creation.MySocialCreationActivity;
import com.sportybet.android.social.presentation.creation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o0x implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0x(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                a.C0351a c0351a = a.D;
                ((AppCompatImageView) obj).getClass();
                yfx yfxVar = aVar.v;
                if (yfxVar != null) {
                    wix.c(yfxVar, aVar.getActivity());
                } else {
                    e activity = aVar.getActivity();
                    if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                        MySocialCreationActivity mySocialCreationActivity = (MySocialCreationActivity) (!(activity instanceof MySocialCreationActivity) ? null : activity);
                        if (mySocialCreationActivity != null) {
                            wc.a(mySocialCreationActivity);
                        } else {
                            activity.getSupportFragmentManager().Y();
                        }
                        Unit unit = Unit.a;
                    }
                }
                return Unit.a;
            case 1:
                j040 j040Var = (j040) obj2;
                jxo jxoVar = (jxo) obj;
                ((t5a0) j040Var.g).A((int) (jxoVar.a >> 32));
                ((t5a0) j040Var.h).A((int) (jxoVar.a & 4294967295L));
                return Unit.a;
            default:
                String str = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM an_test_variant_override WHERE campaign_code = ?");
                try {
                    hq60VarH1.L(1, str);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
        }
    }
}
