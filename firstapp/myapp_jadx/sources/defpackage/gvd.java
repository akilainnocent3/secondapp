package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgvd;", "Lcom/google/android/material/bottomsheet/c;", "Lk9j;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gvd extends tpl implements k9j {
    public final q8i0 f;
    public com.sporty.android.common.uievent.e i;

    public static final class a extends cny {
        public a() {
            super(true);
        }

        @Override // defpackage.cny
        public final void b() {
            jvd jvdVarM0 = gvd.this.m0();
            ivd.a aVar = ivd.a.a;
            aVar.getClass();
            jvdVarM0.c.a(aVar);
            ej5.c(o8i0.d(jvdVarM0), null, null, new lvd(jvdVarM0, null), 3);
        }
    }

    public static final class b extends qlr implements Function0<w8i0> {
        public final /* synthetic */ xud a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xud xudVar) {
            super(0);
            this.a = xudVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? gvd.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public gvd() {
        ttr ttrVarA = hwr.a(a1s.c, new b(new xud(this)));
        this.f = new q8i0(jq40.a(jvd.class), new c(ttrVarA), new e(ttrVarA), new d(ttrVarA));
    }

    public final jvd m0() {
        return (jvd) this.f.getValue();
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        setStyle(0, R.style.BottomSheetDialogTheme);
        setCancelable(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (m0().E.a.getValue() == null) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_DEPOSIT);
            aVar.n("Confirm deposit dialog: no content, dismissing", new Object[0]);
            dismissAllowingStateLoss();
            return new View(requireContext());
        }
        jvd jvdVarM0 = m0();
        t700 t700Var = t700.a;
        k00[] k00VarArr = {k00.c};
        t700Var.getClass();
        rdd0 rdd0Var = jvdVarM0.b;
        psm psmVar = jvdVarM0.a;
        k00[] k00VarArr2 = (k00[]) Arrays.copyOf(k00VarArr, 1);
        rdd0Var.getClass();
        psmVar.getClass();
        if (psmVar.x()) {
            rdd0Var.a(t700Var, (k00[]) Arrays.copyOf(k00VarArr2, k00VarArr2.length));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(1336481645, new Function2() { // from class: wud
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final gvd gvdVar = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(1060069980, new Function2() { // from class: yud
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar3 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 0;
                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final gvd gvdVar2 = gvdVar;
                                ytw ytwVarC = wyh.c(gvdVar2.m0().E, aVar3, 0, 7);
                                ytw ytwVarB = wyh.b(gvdVar2.m0().C, tzs.a.a, aVar3, 48, 14);
                                ld00 ld00Var = (ld00) ytwVarC.getValue();
                                if (ld00Var == null) {
                                    aVar3.N(-349313820);
                                    aVar3.H();
                                } else {
                                    aVar3.N(-349313819);
                                    UiText uiText = ld00Var.a;
                                    UiText uiText2 = ld00Var.b;
                                    UiText uiText3 = ld00Var.c;
                                    UiText uiText4 = ld00Var.d;
                                    UiText uiText5 = ld00Var.e;
                                    UiText uiText6 = ld00Var.f;
                                    boolean zA = aVar3.A(gvdVar2);
                                    Object objY = aVar3.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zA || objY == c0042a) {
                                        objY = new Function0() { // from class: zud
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                jvd jvdVarM1 = gvdVar2.m0();
                                                ivd.b bVar = ivd.b.a;
                                                bVar.getClass();
                                                jvdVarM1.c.a(bVar);
                                                ej5.c(o8i0.d(jvdVarM1), null, null, new lvd(jvdVarM1, null), 3);
                                                return Unit.a;
                                            }
                                        };
                                        aVar3.r(objY);
                                    }
                                    Function0 function0 = (Function0) objY;
                                    boolean zA2 = aVar3.A(gvdVar2);
                                    Object objY2 = aVar3.y();
                                    if (zA2 || objY2 == c0042a) {
                                        objY2 = new Function0() { // from class: avd
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                jvd jvdVarM1 = gvdVar2.m0();
                                                ej5.c(o8i0.d(jvdVarM1), null, null, new kvd(jvdVarM1, null), 3);
                                                jvdVarM1.b.a(new jnd("bill_prompt_failure", "secondary", "common_functions__dial_ussd_to_top_up"), k00.d);
                                                return Unit.a;
                                            }
                                        };
                                        aVar3.r(objY2);
                                    }
                                    Function0 function1 = (Function0) objY2;
                                    boolean zA3 = aVar3.A(gvdVar2);
                                    Object objY3 = aVar3.y();
                                    if (zA3 || objY3 == c0042a) {
                                        objY3 = new bvd(gvdVar2, i);
                                        aVar3.r(objY3);
                                    }
                                    wv0.a(null, uiText, uiText2, uiText3, uiText4, uiText5, uiText6, function0, function1, (Function0) objY3, Intrinsics.g(ytwVarB.getValue(), tzs.b.a), aVar3, 0);
                                    aVar3.H();
                                }
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
        return composeView;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bVar.c.a(this, new a());
        }
        View viewFindViewById = bVar != null ? bVar.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(viewFindViewById);
            bottomSheetBehaviorC.L(3);
            bottomSheetBehaviorC.Y = true;
            bottomSheetBehaviorC.J(false);
            bottomSheetBehaviorC.Z = false;
            bottomSheetBehaviorC.I(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        jvd jvdVarM0 = m0();
        g1i g1iVar = new g1i(jvdVarM0.f, new cvd(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(jvdVarM0.y, new dvd(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(jvdVarM0.A, new evd(this, null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(jvdVarM0.v, new fvd(this, view, null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
    }
}
