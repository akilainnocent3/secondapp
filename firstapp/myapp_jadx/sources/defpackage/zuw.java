package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006²\u0006\u0012\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lzuw;", "StateCompose", "Lm12;", "<init>", "()V", "stateUI", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class zuw<StateCompose> extends m12 {
    public abstract void m0(Object obj, a aVar);

    public abstract avw<StateCompose> n0();

    public void o0(id90 id90Var) {
        id90Var.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(-399711623, new Function2() { // from class: xuw
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zuw zuwVar = this.a;
                    Object value = wyh.c(zuwVar.n0().b, aVar, 0, 7).getValue();
                    if (value == null) {
                        aVar.N(2135446837);
                    } else {
                        aVar.N(2135446838);
                        zuwVar.m0(value, aVar);
                    }
                    aVar.H();
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new yuw(this, null), 3);
    }
}
