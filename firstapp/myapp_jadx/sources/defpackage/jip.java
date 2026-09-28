package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.kepay.deposit.KeDepositActivity;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jip implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jip(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                KeDepositActivity keDepositActivity = (KeDepositActivity) obj2;
                z200 z200Var = (z200) obj;
                int i2 = KeDepositActivity.y;
                boolean zA = z200Var.a(keDepositActivity.w);
                List<y200> list = z200Var.a;
                if (!zA) {
                    if (!list.isEmpty()) {
                        boolean z = false;
                        boolean z2 = false;
                        for (y200 y200Var : list) {
                            if (y200Var instanceof a300.f) {
                                z = true;
                            }
                            if (y200Var instanceof a300.i) {
                                z2 = true;
                            }
                        }
                        if (z) {
                            TabLayout tabLayout = keDepositActivity.b;
                            TabLayout.g gVarL = tabLayout.l();
                            gVarL.e(keDepositActivity.getCMSString(R.string.common_payment_providers__mobile_money, new Object[0]));
                            gVarL.a = "mobilemoney";
                            tabLayout.d(gVarL, true);
                        }
                        if (z2) {
                            TabLayout tabLayout2 = keDepositActivity.b;
                            TabLayout.g gVarL2 = tabLayout2.l();
                            gVarL2.e(keDepositActivity.getCMSString(R.string.page_payment__paybill, new Object[0]));
                            gVarL2.a = "paybill";
                            tabLayout2.d(gVarL2, !z);
                        }
                        keDepositActivity.b.setVisibility((z && z2) ? 0 : 8);
                    }
                    keDepositActivity.w = z200Var;
                }
                return null;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PreMatchSportActivity preMatchSportActivity = PreMatchSportActivity.this;
                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                jk20 jk20VarI1 = preMatchSportActivity.I1();
                hjd0 hjd0Var = preMatchSportActivity.b;
                if (hjd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                RecyclerView.o layoutManager = hjd0Var.N.getLayoutManager();
                jk20VarI1.w = layoutManager != null ? layoutManager.w0() : null;
                if (!zBooleanValue) {
                    jk20VarI1.i++;
                }
                jk20VarI1.B1();
                return Unit.a;
            default:
                String str = (String) obj;
                str.getClass();
                ((b8b0) obj2).t0(str);
                return Unit.a;
        }
    }
}
