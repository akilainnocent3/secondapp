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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llb4;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lb4 extends enl implements k9j {
    public final mpe0 f = hwr.b(new fb4(this, 0));

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        final zix zixVarA = bjx.a(new r8a(1, new gb4()));
        final yfx yfxVarA = NavHostFragment.a.a(this);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(-590819355, new Function2() { // from class: hb4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final lb4 lb4Var = this.a;
                    gc4 gc4VarValueOf = gc4.valueOf((String) lb4Var.f.getValue());
                    boolean zA = aVar.A(lb4Var);
                    final yfx yfxVar = yfxVarA;
                    boolean zA2 = zA | aVar.A(yfxVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA2 || objY == c0042a) {
                        objY = new Function0() { // from class: ib4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                if (lb4Var.isAdded()) {
                                    yfxVar.k();
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA3 = aVar.A(lb4Var) | aVar.A(yfxVar);
                    Object objY2 = aVar.y();
                    if (zA3 || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: jb4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                String str = (String) obj3;
                                str.getClass();
                                if (lb4Var.isAdded()) {
                                    yfx yfxVar2 = yfxVar;
                                    yfxVar2.getClass();
                                    yfx.i(yfxVar2, "bio_auth_verification_route/".concat(str), null, 4);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    Function1 function1 = (Function1) objY2;
                    boolean zA4 = aVar.A(lb4Var) | aVar.A(yfxVar);
                    final zix zixVar = zixVarA;
                    boolean zA5 = zA4 | aVar.A(zixVar);
                    Object objY3 = aVar.y();
                    if (zA5 || objY3 == c0042a) {
                        objY3 = new Function1() { // from class: kb4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                long jLongValue = ((Long) obj3).longValue();
                                if (lb4Var.isAdded()) {
                                    mo40.c(yfxVar, 1L, jLongValue, zixVar);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY3);
                    }
                    ac4.a(gc4VarValueOf, function0, function1, (Function1) objY3, null, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
