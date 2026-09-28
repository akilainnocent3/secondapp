package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.google.android.material.bottomsheet.c;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt46;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t46 extends c {
    public ComposeView a;
    public db6 b;
    public String c = "";
    public Function0<Unit> d = new l46(0);
    public Function0<Unit> e = new m46(0);
    public Function0<Unit> f;

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.BottomSheetStyle);
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        final b bVar = (b) dialogOnCreateDialog;
        Window window = bVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        bVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: k46
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View viewFindViewById = bVar.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundColor(0);
                }
                ViewParent parent = viewFindViewById != null ? viewFindViewById.getParent() : null;
                View view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    view.setBackgroundColor(0);
                }
            }
        });
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(211904741, new Function2() { // from class: i46
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t46 t46Var = this.a;
                    db6 db6Var = t46Var.b;
                    if (db6Var == null) {
                        aVar.N(-747708333);
                    } else {
                        aVar.N(-747708332);
                        kof0.a(48, pp8.b(-1678438275, new n46(db6Var, t46Var), aVar), aVar, false);
                    }
                    aVar.H();
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        this.a = composeView;
        Dialog dialog = getDialog();
        View decorView = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
        ViewGroup viewGroup2 = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup2 != null) {
            viewGroup2.setBackground(new ColorDrawable(0));
        }
        ComposeView composeView2 = this.a;
        if (composeView2 == null) {
            Intrinsics.n("composeView");
            throw null;
        }
        composeView2.setBackgroundColor(0);
        ComposeView composeView3 = this.a;
        if (composeView3 != null) {
            return composeView3;
        }
        Intrinsics.n("composeView");
        throw null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ComposeView composeView = this.a;
        if (composeView != null) {
            composeView.e();
        } else {
            Intrinsics.n("composeView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.d.invoke();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Object parent = requireView().getParent();
        parent.getClass();
        View view = (View) parent;
        BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(view);
        bottomSheetBehaviorC.L(3);
        bottomSheetBehaviorC.K(view.getHeight());
        bottomSheetBehaviorC.Z = false;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
    }
}
