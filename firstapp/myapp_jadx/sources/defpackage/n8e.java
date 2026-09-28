package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.deposit.presentation.model.event.InsufficientFundsCallbackType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class n8e {
    public static void a(z7e z7eVar, Fragment fragment) {
        final FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        if (z7eVar instanceof z7e.g) {
            if (childFragmentManager != null) {
                z7e.g gVar = (z7e.g) z7eVar;
                ResourceUiText resourceUiText = gVar.a;
                ResourceUiText resourceUiText2 = gVar.b;
                ResourceUiText resourceUiText3 = gVar.c;
                ResourceUiText resourceUiText4 = gVar.d;
                ResourceUiText resourceUiText5 = gVar.e;
                final i8e i8eVar = new i8e(gVar);
                childFragmentManager.n0("REQUEST_KEY_INSUFFICIENT_FUNDS_BOTTOM_SHEET", fragment, new qxi() { // from class: xto
                    @Override // defpackage.qxi
                    public final void a(String str, Bundle bundle) {
                        bundle.getClass();
                        Object obj = (InsufficientFundsCallbackType) ((Parcelable) rj5.a(bundle, "RESULT_KEY_INSUFFICIENT_FUNDS_BOTTOM_SHEET", InsufficientFundsCallbackType.class));
                        if (obj == null) {
                            obj = InsufficientFundsCallbackType.Cancel.a;
                        }
                        i8eVar.invoke(obj);
                        FragmentManager fragmentManager = childFragmentManager;
                        fragmentManager.g("REQUEST_KEY_INSUFFICIENT_FUNDS_BOTTOM_SHEET");
                        fragmentManager.f("RESULT_KEY_INSUFFICIENT_FUNDS_BOTTOM_SHEET");
                    }
                });
                yto ytoVar = new yto();
                ytoVar.setArguments(vj5.a(new Pair("ARG_TITLE", resourceUiText), new Pair("ARG_MESSAGE", resourceUiText2), new Pair("ARG_CHECK_BOX_UI_TEXT", resourceUiText3), new Pair("ARG_POSITIVE_TEXT", resourceUiText4), new Pair("ARG_NEGATIVE_TEXT", resourceUiText5), new Pair("ARG_CANCELABLE", Boolean.TRUE)));
                ytoVar.show(childFragmentManager, "InsufficientFundsBottomSheetFragment");
                return;
            }
            return;
        }
        boolean z = z7eVar instanceof z7e.e;
        int i = 0;
        u6i0.a aVar = u6i0.a.a;
        if (z) {
            if (context == null) {
                Function0<Unit> function0 = ((z7e.e) z7eVar).c;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            final z7e.e eVar = (z7e.e) z7eVar;
            boolean z2 = eVar.a;
            final b bVar = new b(context, R.style.BottomSheetDialogTheme);
            bVar.setCancelable(z2);
            ComposeView composeView = new ComposeView(context, null, 6, 0);
            composeView.setViewCompositionStrategy(aVar);
            composeView.setContent(new op8(-1046214442, new Function2() { // from class: j8e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final z7e.e eVar2 = eVar;
                        final b bVar2 = bVar;
                        o0z.a(null, null, null, null, null, pp8.b(-1322626107, new Function2() { // from class: l8e
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    op8 op8Var = eVar2.b;
                                    b bVar3 = bVar2;
                                    boolean zA = aVar3.A(bVar3);
                                    Object objY = aVar3.y();
                                    if (zA || objY == a.C0041a.a) {
                                        m8e m8eVar = new m8e(0, bVar3, b.class, "dismiss", "dismiss()V", 0);
                                        aVar3.r(m8eVar);
                                        objY = m8eVar;
                                    }
                                    op8Var.invoke((chp) objY, aVar3, 0);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 196608);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, true));
            bVar.setContentView(composeView);
            if (z2) {
                bVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: k8e
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        Function0<Unit> function1 = eVar.c;
                        if (function1 != null) {
                            function1.invoke();
                        }
                    }
                });
            }
            bVar.show();
            return;
        }
        if (z7eVar instanceof z7e.i) {
            if (context == null) {
                bc6 bc6Var = ((z7e.i) z7eVar).g;
                l600 l600Var = l600.c;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar2 = zi50.b;
                    bc6Var.resumeWith(l600Var);
                    return;
                } else {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_COMMON);
                    aVar3.n("Continuation not active, resume not perform.", new Object[0]);
                    return;
                }
            }
            z7e.i iVar = (z7e.i) z7eVar;
            final ResourceUiText resourceUiText6 = iVar.a;
            final UiText uiText = iVar.b;
            final ResourceUiText resourceUiText7 = iVar.c;
            final ResourceUiText resourceUiText8 = iVar.d;
            final kyf0 kyf0Var = iVar.e;
            final n67 n67Var = iVar.f;
            final g8e g8eVar = new g8e(z7eVar);
            kyf0Var.getClass();
            n67Var.getClass();
            final b bVar2 = new b(context, R.style.BottomSheetDialogTheme);
            bVar2.setCancelable(true);
            ComposeView composeView2 = new ComposeView(context, null, 6, 0);
            composeView2.setViewCompositionStrategy(aVar);
            composeView2.setContent(new op8(1056124335, new Function2() { // from class: w800
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final ResourceUiText resourceUiText9 = resourceUiText6;
                        final UiText uiText2 = uiText;
                        final ResourceUiText resourceUiText10 = resourceUiText7;
                        final n67 n67Var2 = n67Var;
                        final b bVar3 = bVar2;
                        final g8e g8eVar2 = g8eVar;
                        final ResourceUiText resourceUiText11 = resourceUiText8;
                        final kyf0 kyf0Var2 = kyf0Var;
                        o0z.a(null, null, null, null, null, pp8.b(-594857378, new Function2() { // from class: y800
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar5 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    final b bVar4 = bVar3;
                                    boolean zA = aVar5.A(bVar4);
                                    final g8e g8eVar3 = g8eVar2;
                                    boolean zM = zA | aVar5.M(g8eVar3);
                                    Object objY = aVar5.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zM || objY == c0042a) {
                                        objY = new Function0() { // from class: z800
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                l600 l600Var2 = l600.a;
                                                bVar4.dismiss();
                                                g8eVar3.invoke(l600Var2);
                                                return Unit.a;
                                            }
                                        };
                                        aVar5.r(objY);
                                    }
                                    cr20 cr20Var = new cr20(resourceUiText10, n67Var2, (Function0) objY);
                                    boolean zA2 = aVar5.A(bVar4) | aVar5.M(g8eVar3);
                                    Object objY2 = aVar5.y();
                                    if (zA2 || objY2 == c0042a) {
                                        objY2 = new i1h(1, bVar4, g8eVar3);
                                        aVar5.r(objY2);
                                    }
                                    s280 s280Var = new s280(resourceUiText11, null, (Function0) objY2);
                                    boolean zA3 = aVar5.A(bVar4) | aVar5.M(g8eVar3);
                                    Object objY3 = aVar5.y();
                                    if (zA3 || objY3 == c0042a) {
                                        objY3 = new Function0() { // from class: a900
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                l600 l600Var2 = l600.c;
                                                bVar4.dismiss();
                                                g8eVar3.invoke(l600Var2);
                                                return Unit.a;
                                            }
                                        };
                                        aVar5.r(objY3);
                                    }
                                    t600.b(null, resourceUiText9, uiText2, cr20Var, s280Var, (Function0) objY3, kyf0Var2, aVar5, 2134016);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar4), aVar4, 196608);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, true));
            bVar2.setContentView(composeView2);
            bVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: x800
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    g8eVar.invoke(l600.c);
                }
            });
            bVar2.show();
            return;
        }
        if (z7eVar instanceof z7e.h) {
            if (context == null) {
                bc6 bc6Var2 = ((z7e.h) z7eVar).j;
                Unit unit = Unit.a;
                if (bc6Var2.p() instanceof bzx) {
                    zi50.a aVar4 = zi50.b;
                    bc6Var2.resumeWith(unit);
                    return;
                } else {
                    itf0.a aVar5 = itf0.a;
                    aVar5.q(MyLog.TAG_COMMON);
                    aVar5.n("Continuation not active, resume not perform.", new Object[0]);
                    return;
                }
            }
            z7e.h hVar = (z7e.h) z7eVar;
            final UiText uiText2 = hVar.a;
            final UiText uiText3 = hVar.b;
            final kyf0 kyf0Var2 = hVar.c;
            final UiText uiText4 = hVar.d;
            final n67 n67Var2 = hVar.e;
            final Function1<v1b<? super Unit>, Object> function1 = hVar.f;
            final UiText uiText5 = hVar.g;
            final n67 n67Var3 = hVar.h;
            final Function1<v1b<? super Unit>, Object> function2 = hVar.i;
            final h8e h8eVar = new h8e(z7eVar, i);
            uiText2.getClass();
            uiText3.getClass();
            kyf0Var2.getClass();
            uiText4.getClass();
            n67Var2.getClass();
            function1.getClass();
            n67Var3.getClass();
            final b bVar3 = new b(context, R.style.BottomSheetDialogTheme);
            bVar3.setCancelable(true);
            ComposeView composeView3 = new ComposeView(context, null, 6, 0);
            composeView3.setViewCompositionStrategy(aVar);
            composeView3.setContent(new op8(1121045765, new Function2() { // from class: y500
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar6 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar6.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final UiText uiText6 = uiText4;
                        final n67 n67Var4 = n67Var2;
                        final Function1 function3 = function1;
                        final UiText uiText7 = uiText5;
                        final UiText uiText8 = uiText2;
                        final UiText uiText9 = uiText3;
                        final b bVar4 = bVar3;
                        final h8e h8eVar2 = h8eVar;
                        final kyf0 kyf0Var3 = kyf0Var2;
                        final n67 n67Var5 = n67Var3;
                        final Function1 function4 = function2;
                        o0z.a(null, null, null, null, null, pp8.b(177419956, new Function2() { // from class: a600
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                s280 s280Var;
                                a aVar7 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    Object objY = aVar7.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (objY == c0042a) {
                                        objY = xvf.i(e.a, aVar7);
                                        aVar7.r(objY);
                                    }
                                    final v5b v5bVar = (v5b) objY;
                                    boolean zA = aVar7.A(v5bVar);
                                    final Function1 function5 = function3;
                                    boolean zA2 = zA | aVar7.A(function5);
                                    Object objY2 = aVar7.y();
                                    if (zA2 || objY2 == c0042a) {
                                        objY2 = new Function0() { // from class: b600
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                ej5.c(v5bVar, null, null, new d600(function5, null), 3);
                                                return Unit.a;
                                            }
                                        };
                                        aVar7.r(objY2);
                                    }
                                    cr20 cr20Var = new cr20(uiText6, n67Var4, mla.d((Function0) objY2, aVar7, 0));
                                    UiText uiText10 = uiText7;
                                    if (uiText10 == null) {
                                        aVar7.N(-1586178947);
                                        aVar7.H();
                                        s280Var = null;
                                    } else {
                                        aVar7.N(-1586178946);
                                        boolean zA3 = aVar7.A(v5bVar);
                                        Function1 function6 = function4;
                                        boolean zA4 = zA3 | aVar7.A(function6);
                                        Object objY3 = aVar7.y();
                                        if (zA4 || objY3 == c0042a) {
                                            objY3 = new hzg(v5bVar, function6);
                                            aVar7.r(objY3);
                                        }
                                        s280 s280Var2 = new s280(uiText10, n67Var5, mla.d((Function0) objY3, aVar7, 0));
                                        aVar7.H();
                                        s280Var = s280Var2;
                                    }
                                    final b bVar5 = bVar4;
                                    boolean zA5 = aVar7.A(bVar5);
                                    final h8e h8eVar3 = h8eVar2;
                                    boolean zM = zA5 | aVar7.M(h8eVar3);
                                    Object objY4 = aVar7.y();
                                    if (zM || objY4 == c0042a) {
                                        objY4 = new Function0() { // from class: c600
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                bVar5.dismiss();
                                                h8eVar3.invoke();
                                                return Unit.a;
                                            }
                                        };
                                        aVar7.r(objY4);
                                    }
                                    t600.b(null, uiText8, uiText9, cr20Var, s280Var, (Function0) objY4, kyf0Var3, aVar7, 2134016);
                                } else {
                                    aVar7.G();
                                }
                                return Unit.a;
                            }
                        }, aVar6), aVar6, 196608);
                    } else {
                        aVar6.G();
                    }
                    return Unit.a;
                }
            }, true));
            bVar3.setContentView(composeView3);
            bVar3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: z500
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    h8eVar.invoke();
                }
            });
            bVar3.show();
        }
    }
}
