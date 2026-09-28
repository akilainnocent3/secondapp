package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lj84;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j84 extends bnl implements k9j {
    public azm f;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        itf0.a aVar = itf0.a;
        ifx ifxVarE = NavHostFragment.a.a(this).e();
        aVar.a("BioAuthSettingsFragment onCreateView: " + (ifxVarE != null ? ifxVarE.b : null), new Object[0]);
        final zix zixVarA = bjx.a(new r8a(1, new e84()));
        final yfx yfxVarA = NavHostFragment.a.a(this);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(-70393583, new Function2() { // from class: f84
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final j84 j84Var = this.a;
                    boolean zA = aVar2.A(j84Var);
                    final yfx yfxVar = yfxVarA;
                    boolean zA2 = zA | aVar2.A(yfxVar);
                    final zix zixVar = zixVarA;
                    boolean zA3 = zA2 | aVar2.A(zixVar);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA3 || objY == c0042a) {
                        objY = new Function1() { // from class: g84
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                gc4 gc4Var = (gc4) obj3;
                                gc4Var.getClass();
                                if (j84Var.isAdded()) {
                                    nb4.a(yfxVar, gc4Var, zixVar);
                                }
                                return Unit.a;
                            }
                        };
                        aVar2.r(objY);
                    }
                    Function1 function1 = (Function1) objY;
                    boolean zA4 = aVar2.A(j84Var) | aVar2.A(yfxVar);
                    Object objY2 = aVar2.y();
                    if (zA4 || objY2 == c0042a) {
                        objY2 = new h84(i, j84Var, yfxVar);
                        aVar2.r(objY2);
                    }
                    Function0 function0 = (Function0) objY2;
                    boolean zA5 = aVar2.A(j84Var);
                    Object objY3 = aVar2.y();
                    if (zA5 || objY3 == c0042a) {
                        objY3 = new i84(j84Var, i);
                        aVar2.r(objY3);
                    }
                    c94.a(function1, function0, (Function0) objY3, null, aVar2, 0);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
