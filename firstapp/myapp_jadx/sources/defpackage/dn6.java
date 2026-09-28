package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldn6;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dn6 extends snl {
    public rdd0 f;
    public u350 i;
    public gj6 v;
    public hj6 w;
    public ij6 y;

    @c0d(c = "com.sportybet.android.cashoutphase3.presentation.ui.CashOutSuccessBottomSheetDialog$onCreateView$1$1$1$1", f = "CashOutSuccessBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return dn6.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            dn6 dn6Var = dn6.this;
            if (dn6Var.requireArguments().getBoolean("arg_show_rebet_option", false)) {
                rdd0 rdd0Var = dn6Var.f;
                if (rdd0Var == null) {
                    Intrinsics.n("sportyTrackingUseCase");
                    throw null;
                }
                rdd0Var.a(xxy.a, k00.d);
            }
            if (dn6Var.requireArguments().getBoolean("arg_show_sim_rebet_option", false)) {
                rdd0 rdd0Var2 = dn6Var.f;
                if (rdd0Var2 == null) {
                    Intrinsics.n("sportyTrackingUseCase");
                    throw null;
                }
                rdd0Var2.a(zxy.a, k00.d);
            }
            return Unit.a;
        }
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        final b bVar = (b) dialogOnCreateDialog;
        bVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xm6
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View viewFindViewById = bVar.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(viewFindViewById);
                bottomSheetBehaviorC.L(3);
                bottomSheetBehaviorC.Y = true;
            }
        });
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(-870066000, new ym6(this, 0), true));
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        gj6 gj6Var = this.v;
        if (gj6Var != null) {
            gj6Var.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
    }
}
