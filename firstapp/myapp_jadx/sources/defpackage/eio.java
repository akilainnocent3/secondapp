package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leio;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eio extends btl {
    public final mpe0 f = hwr.b(new bio(this, 0));
    public azm i;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(-2002507603, new Function2() { // from class: aio
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit unit;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final eio eioVar = this.a;
                    final InstantWinPromotionDialogInput instantWinPromotionDialogInput = (InstantWinPromotionDialogInput) eioVar.f.getValue();
                    if (instantWinPromotionDialogInput == null) {
                        aVar.N(391776521);
                        aVar.H();
                        unit = null;
                    } else {
                        aVar.N(391776522);
                        boolean zA = aVar.A(eioVar) | aVar.A(instantWinPromotionDialogInput);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new Function0() { // from class: cio
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    eio eioVar2 = eioVar;
                                    azm azmVar = eioVar2.i;
                                    if (azmVar == null) {
                                        Intrinsics.n("router");
                                        throw null;
                                    }
                                    azm.c(azmVar, instantWinPromotionDialogInput.d, null, null, 6);
                                    eioVar2.requireActivity().finish();
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        }
                        Function0 function0 = (Function0) objY;
                        boolean zA2 = aVar.A(eioVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new dio(eioVar, i);
                            aVar.r(objY2);
                        }
                        cjo.a(instantWinPromotionDialogInput, function0, (Function0) objY2, aVar, 8, 0);
                        aVar.H();
                        unit = Unit.a;
                    }
                    if (unit == null) {
                        eioVar.dismiss();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        Object parent = view.getParent();
        parent.getClass();
        View view2 = (View) parent;
        view2.setBackgroundTintMode(PorterDuff.Mode.CLEAR);
        view2.setBackgroundTintList(ColorStateList.valueOf(0));
        view2.setBackgroundColor(0);
    }
}
