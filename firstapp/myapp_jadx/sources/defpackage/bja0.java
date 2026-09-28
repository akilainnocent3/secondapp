package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbja0;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bja0 extends h3m {
    public Function1<? super String, Unit> f;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final String string;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("arg_social_username")) == null) {
            string = "";
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return j8a0.c(contextRequireContext, new op8(-107552729, new Function2() { // from class: aja0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final bja0 bja0Var = this;
                    boolean zA = aVar.A(bja0Var);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function1() { // from class: yia0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                String str = (String) obj3;
                                str.getClass();
                                bja0 bja0Var2 = bja0Var;
                                Function1<? super String, Unit> function1 = bja0Var2.f;
                                if (function1 != null) {
                                    function1.invoke(str);
                                }
                                bja0Var2.dismiss();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function1 function1 = (Function1) objY;
                    boolean zA2 = aVar.A(bja0Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: zia0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                bja0Var.dismiss();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    vaa0.b(string, function1, (Function0) objY2, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.d
    public final void show(FragmentManager fragmentManager, String str) {
        fragmentManager.getClass();
        if (fragmentManager.K || fragmentManager.V()) {
            return;
        }
        super.show(fragmentManager, str);
    }
}
