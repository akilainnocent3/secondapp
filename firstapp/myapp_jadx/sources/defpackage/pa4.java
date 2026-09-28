package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.navigation.fragment.NavHostFragment;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpa4;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pa4 extends dnl implements k9j {
    public azm f;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        final long j = arguments != null ? arguments.getLong("bio_auth_verified_successful_date") : 0L;
        final zix zixVarA = bjx.a(new r8a(1, new la4()));
        final yfx yfxVarA = NavHostFragment.a.a(this);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(752957896, new Function2() { // from class: ma4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strG = bwf0.a.g(j);
                    final pa4 pa4Var = this;
                    boolean zA = aVar.A(pa4Var);
                    final yfx yfxVar = yfxVarA;
                    boolean zA2 = zA | aVar.A(yfxVar);
                    final zix zixVar = zixVarA;
                    boolean zA3 = zA2 | aVar.A(zixVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA3 || objY == c0042a) {
                        objY = new Function1() { // from class: na4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                String str = (String) obj3;
                                str.getClass();
                                Date dateA = pwf0.a(str, "dd/MM/yyyy HH:mm", false, owf0.b);
                                if (dateA != null) {
                                    long time = dateA.getTime();
                                    if (pa4Var.isAdded()) {
                                        mo40.c(yfxVar, 1L, time, zixVar);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function1 function1 = (Function1) objY;
                    boolean zA4 = aVar.A(pa4Var);
                    Object objY2 = aVar.y();
                    if (zA4 || objY2 == c0042a) {
                        objY2 = new oa4(pa4Var, i);
                        aVar.r(objY2);
                    }
                    xa4.a(strG, function1, (Function0) objY2, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
