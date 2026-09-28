package com.sportybet.android.virtual.presentation.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import defpackage.ag5;
import defpackage.bg5;
import defpackage.bmy;
import defpackage.cg5;
import defpackage.cyb;
import defpackage.d0i;
import defpackage.ebs;
import defpackage.eg5;
import defpackage.ej5;
import defpackage.enj;
import defpackage.fc4;
import defpackage.fg5;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.jq40;
import defpackage.jqc;
import defpackage.mpe0;
import defpackage.n1i;
import defpackage.oke;
import defpackage.onl;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rf5;
import defpackage.s9s;
import defpackage.sn5;
import defpackage.tbn;
import defpackage.v8i0;
import defpackage.wwd0;
import defpackage.xf5;
import defpackage.yf5;
import defpackage.yy50;
import defpackage.zf5;
import defpackage.zvi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/virtual/presentation/dialog/BuildAndGoRunningPageDialog;", "Lcom/google/android/material/bottomsheet/c;", "Lenj;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BuildAndGoRunningPageDialog extends onl implements enj {
    public zvi f;
    public FrameLayout i;
    public boolean v;
    public boolean w;
    public final mpe0 y = hwr.b(new xf5(this, 0));
    public final q8i0 z = new q8i0(jq40.a(f.class), new a(), new c(), new b());

    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BuildAndGoRunningPageDialog.this.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BuildAndGoRunningPageDialog.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BuildAndGoRunningPageDialog.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // defpackage.enj
    public final void D() {
        Object value;
        eg5.d dVar;
        boolean z;
        wwd0 wwd0Var = n0().E;
        do {
            value = wwd0Var.getValue();
            dVar = eg5.d.a;
            z = ((fg5) value).b;
            dVar.getClass();
        } while (!wwd0Var.g(value, new fg5(dVar, z)));
    }

    @Override // defpackage.enj
    public final void P() {
        if (((Boolean) this.y.getValue()).booleanValue()) {
            if (n0().A1(this.v)) {
                return;
            }
            dismiss();
        } else {
            n0().A1(false);
            this.w = true;
            dismiss();
        }
    }

    @Override // defpackage.enj
    public final void c0() {
        Object value;
        eg5.b bVar;
        boolean z;
        wwd0 wwd0Var = n0().E;
        do {
            value = wwd0Var.getValue();
            bVar = eg5.b.a;
            z = ((fg5) value).b;
            bVar.getClass();
        } while (!wwd0Var.g(value, new fg5(bVar, z)));
    }

    public final FrameLayout m0() {
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            return frameLayout;
        }
        Dialog dialog = getDialog();
        FrameLayout frameLayout2 = dialog != null ? (FrameLayout) dialog.findViewById(R.id.design_bottom_sheet) : null;
        this.i = frameLayout2;
        if (frameLayout2 != null) {
            frameLayout2.setBackgroundResource(R.drawable.bg_bng_history_list);
        }
        return this.i;
    }

    public final f n0() {
        return (f) this.z.getValue();
    }

    public final void o0() {
        Object value;
        eg5.c cVar;
        wwd0 wwd0Var = n0().E;
        do {
            value = wwd0Var.getValue();
            cVar = eg5.c.a;
            ((fg5) value).getClass();
            cVar.getClass();
        } while (!wwd0Var.g(value, new fg5(cVar, false)));
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(childFragmentManager, childFragmentManager);
        aVarA.f(R.id.fragment_container, new rf5(), null);
        if (aVarA.i) {
            ib5.a("This transaction is already being added to the back stack");
        } else {
            aVarA.j = false;
            aVarA.t.D(aVarA, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_iwqk_build_and_go_running_page, (ViewGroup) null, false);
        int i = R.id.build_and_go_logo;
        ImageView imageView = (ImageView) h5e.a(R.id.build_and_go_logo, viewInflate);
        if (imageView != null) {
            i = R.id.close;
            ImageView imageView2 = (ImageView) h5e.a(R.id.close, viewInflate);
            if (imageView2 != null) {
                i = R.id.compose_fast_bet_flow;
                ComposeView composeView = (ComposeView) h5e.a(R.id.compose_fast_bet_flow, viewInflate);
                if (composeView != null) {
                    i = R.id.drag_handler;
                    View viewA = h5e.a(R.id.drag_handler, viewInflate);
                    if (viewA != null) {
                        i = R.id.fragment_container;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) h5e.a(R.id.fragment_container, viewInflate);
                        if (fragmentContainerView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.f = new zvi(constraintLayout, imageView, imageView2, composeView, viewA, fragmentContainerView);
                            constraintLayout.getClass();
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        yy50.a.m(new jqc());
        this.f = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (this.w) {
            this.w = false;
            getParentFragmentManager().m0("request_open_build_and_go_entry_sheet", Bundle.EMPTY);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        zvi zviVar = this.f;
        int i = 0;
        if (zviVar != null) {
            zviVar.c.setOnClickListener(new yf5(this, i));
        }
        zvi zviVar2 = this.f;
        if (zviVar2 != null) {
            ImageView imageView = zviVar2.b;
            String strD = sn5.d(this, R.string.page_virtual__build_and_go_logo, new Object[0]);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            tbn.a(imageView, strD, false);
        }
        o0();
        n1i n1iVar = new n1i(n0().f.q(), n0().f.w(), new ag5(3, null));
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new zf5(viewLifecycleOwner, n1iVar, null, this), 3);
        d0i d0iVarA = fc4.a(n0().F, 1);
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ej5.c(ebs.a(viewLifecycleOwner2.getLifecycle()), null, null, new bg5(viewLifecycleOwner2, d0iVarA, null, this), 3);
        wwd0 wwd0Var = n0().E;
        ibs viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        ej5.c(ebs.a(viewLifecycleOwner3.getLifecycle()), null, null, new cg5(viewLifecycleOwner3, wwd0Var, null, this), 3);
    }
}
