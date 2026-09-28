package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tew implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tew(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final MultiMakerActivity multiMakerActivity = (MultiMakerActivity) obj;
                kid0 kid0Var = multiMakerActivity.f;
                String str = lobGSRIlnSGJY.ztQlrVMtiKRHKEX;
                if (kid0Var == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                int iC = wc.c(multiMakerActivity) - kid0Var.y.a.getHeight();
                kid0 kid0Var2 = multiMakerActivity.f;
                if (kid0Var2 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                final sky skyVar = new sky(multiMakerActivity, (iC - kid0Var2.w.getHeight()) - kid0Var.e.getHeight());
                skyVar.d = new Function0() { // from class: hew
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kid0 kid0Var3 = multiMakerActivity.f;
                        if (kid0Var3 != null) {
                            kid0Var3.e.E();
                            return Unit.a;
                        }
                        Intrinsics.n("binding");
                        throw null;
                    }
                };
                skyVar.e = new gaj() { // from class: iew
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        mhw mhwVar = (mhw) obj2;
                        lhw lhwVar = (lhw) obj3;
                        UiText uiText = (UiText) obj4;
                        int i2 = MultiMakerActivity.E;
                        mhwVar.getClass();
                        lhwVar.getClass();
                        uiText.getClass();
                        MultiMakerActivity multiMakerActivity2 = multiMakerActivity;
                        kid0 kid0Var3 = multiMakerActivity2.f;
                        if (kid0Var3 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        kid0Var3.e.H(uiText);
                        tjw tjwVarZ1 = multiMakerActivity2.z1();
                        ej5.c(o8i0.d(tjwVarZ1), null, null, new riw(tjwVarZ1, mhwVar, lhwVar, null), 3);
                        return Unit.a;
                    }
                };
                skyVar.f = new jew(multiMakerActivity, 0);
                pid0 pid0Var = skyVar.b;
                pid0Var.a.setOnClickListener(new View.OnClickListener() { // from class: mky
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sky skyVar2 = skyVar;
                        ((PopupWindow) skyVar2.c.getValue()).dismiss();
                        skyVar2.d.invoke();
                    }
                });
                pid0Var.c.setOnClickListener(new View.OnClickListener() { // from class: nky
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sky skyVar2 = skyVar;
                        ((PopupWindow) skyVar2.c.getValue()).dismiss();
                        skyVar2.d.invoke();
                    }
                });
                pid0Var.b.setOnClickListener(new View.OnClickListener() { // from class: oky
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        lhw lhwVar;
                        UiText uiText;
                        sky skyVar2 = skyVar;
                        mhw mhwVarA = skyVar2.a();
                        wwd0 wwd0Var = skyVar2.g;
                        int iOrdinal = mhwVarA.ordinal();
                        if (iOrdinal == 0) {
                            lhwVar = ((ohw) wwd0Var.getValue()).c;
                        } else {
                            if (iOrdinal != 1) {
                                uhc.a();
                                return;
                            }
                            lhwVar = ((ohw) wwd0Var.getValue()).d;
                        }
                        int iOrdinal2 = skyVar2.a().ordinal();
                        if (iOrdinal2 == 0) {
                            uiText = ((ohw) wwd0Var.getValue()).e;
                        } else {
                            if (iOrdinal2 != 1) {
                                uhc.a();
                                return;
                            }
                            uiText = ((ohw) wwd0Var.getValue()).f;
                        }
                        skyVar2.e.invoke(skyVar2.a(), lhwVar, uiText);
                        ((PopupWindow) skyVar2.c.getValue()).dismiss();
                        skyVar2.d.invoke();
                    }
                });
                y8j fullStoryCommonManager = multiMakerActivity.getFullStoryCommonManager();
                ConstraintLayout constraintLayout = pid0Var.a;
                constraintLayout.getClass();
                fullStoryCommonManager.d(constraintLayout, "fs-unmask");
                return skyVar;
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                ((fd90) obj).a.v4(true);
                return Unit.a;
        }
    }
}
