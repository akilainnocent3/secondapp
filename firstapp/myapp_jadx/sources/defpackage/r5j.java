package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                SharedPreferences sharedPreferences = u6jVar.J;
                if ((sharedPreferences == null || !sharedPreferences.getBoolean("MUSIC", true)) && (u6jVar.t0().N.getValue() == khp.b || u6jVar.t0().N.getValue() == khp.f)) {
                    r750.c(u6jVar.v0(), u6jVar.getString(R.string.sg_fruit_hunt_knife_direction));
                }
                break;
            default:
                InstantWinFooterLayout instantWinFooterLayout = (InstantWinFooterLayout) obj;
                BigDecimal bigDecimal = InstantWinFooterLayout.B;
                seo seoVar = instantWinFooterLayout.c;
                ibs ibsVarB = ll5.b(instantWinFooterLayout);
                if (ibsVarB != null) {
                    ej5.c(ebs.a(ibsVarB.getLifecycle()), null, null, new dfo(instantWinFooterLayout, seoVar, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
