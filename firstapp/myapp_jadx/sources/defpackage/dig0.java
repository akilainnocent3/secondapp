package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldig0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dig0 extends Fragment {
    public Function1<? super Long, Unit> a;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new op8(206762216, new Function2() { // from class: big0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final dig0 dig0Var = this.a;
                    String str = dig0Var.c;
                    String str2 = dig0Var.e;
                    String str3 = dig0Var.d;
                    boolean zA = aVar.A(dig0Var);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: cig0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                dig0 dig0Var2 = dig0Var;
                                Function1<? super Long, Unit> function1 = dig0Var2.a;
                                if (function1 != null) {
                                    function1.invoke(Long.valueOf(dig0Var2.b));
                                }
                                if (!dig0Var2.isRemoving()) {
                                    dig0Var2.getParentFragmentManager().Y();
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    hig0.c(str, str2, str3, (Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
