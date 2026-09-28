package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class eeh0 extends c {
    public final mpy a;

    public eeh0(mpy mpyVar) {
        this.a = mpyVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-1750004319, new Function2() { // from class: deh0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new v3a0();
                        aVar.r(objY);
                    }
                    v3a0 v3a0Var = (v3a0) objY;
                    eeh0 eeh0Var = this.a;
                    boolean zA = aVar.A(eeh0Var);
                    Object objY2 = aVar.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new n0d0(eeh0Var, i);
                        aVar.r(objY2);
                    }
                    Function0 function0 = (Function0) objY2;
                    boolean zA2 = aVar.A(eeh0Var);
                    Object objY3 = aVar.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new o0d0(eeh0Var, i);
                        aVar.r(objY3);
                    }
                    Function0 function1 = (Function0) objY3;
                    boolean zA3 = aVar.A(eeh0Var);
                    Object objY4 = aVar.y();
                    if (zA3 || objY4 == c0042a) {
                        objY4 = new dzr(eeh0Var, 3);
                        aVar.r(objY4);
                    }
                    jeh0.a(v3a0Var, function0, function1, (Function0) objY4, null, aVar, 6);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
