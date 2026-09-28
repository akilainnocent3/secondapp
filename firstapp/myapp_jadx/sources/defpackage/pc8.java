package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.ugpay.deposit.CommonDepositActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pc8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pc8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                CommonDepositActivity commonDepositActivity = (CommonDepositActivity) obj2;
                List list = (List) obj;
                pc pcVar = commonDepositActivity.i;
                if (pcVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TabLayout tabLayout = pcVar.d;
                tabLayout.n();
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        tabLayout.setVisibility(tabLayout.getTabCount() < 2 ? 8 : 0);
                        return Unit.a;
                    }
                    wc8 wc8Var = (wc8) it.next();
                    TabLayout.g gVarL = tabLayout.l();
                    gVarL.e(commonDepositActivity.getCMSString(wc8Var.a, new Object[0]));
                    tabLayout.d(gVarL, false);
                }
                break;
            default:
                ytw ytwVar = (ytw) obj2;
                j5i j5iVar = (j5i) obj;
                j5iVar.getClass();
                if (!((Boolean) ytwVar.getValue()).booleanValue() && j5iVar.b()) {
                    ytwVar.setValue(Boolean.TRUE);
                }
                return Unit.a;
        }
    }
}
