package com.sportybet.android.bethistory.presentation.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.c;
import com.sportybet.android.gp.tz.R;
import defpackage.a93;
import defpackage.b93;
import defpackage.bmy;
import defpackage.bxg0;
import defpackage.c93;
import defpackage.d93;
import defpackage.f93;
import defpackage.h5e;
import defpackage.px2;
import defpackage.qm2;
import defpackage.uhc;
import defpackage.yie;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/bethistory/presentation/dialog/a;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a extends c {
    public yie a;
    public qm2 b = qm2.b;
    public BetDialogResult c;

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            yie yieVar = this.a;
            yieVar.getClass();
            AppCompatImageView appCompatImageView = yieVar.v;
            yie yieVar2 = this.a;
            yieVar2.getClass();
            bxg0 bxg0Var = new bxg0(appCompatImageView, yieVar2.w, px2.c);
            yie yieVar3 = this.a;
            yieVar3.getClass();
            AppCompatImageView appCompatImageView2 = yieVar3.A;
            yie yieVar4 = this.a;
            yieVar4.getClass();
            bxg0 bxg0Var2 = new bxg0(appCompatImageView2, yieVar4.B, px2.d);
            yie yieVar5 = this.a;
            yieVar5.getClass();
            AppCompatImageView appCompatImageView3 = yieVar5.E;
            yie yieVar6 = this.a;
            yieVar6.getClass();
            List<bxg0> listK = b.k(bxg0Var, bxg0Var2, new bxg0(appCompatImageView3, yieVar6.F, px2.e));
            yie yieVar7 = this.a;
            yieVar7.getClass();
            for (View view : b.k(yieVar7.i, yieVar7.z, yieVar7.D, yieVar7.c, yieVar7.d)) {
                view.getClass();
                view.setVisibility(0);
            }
            for (bxg0 bxg0Var3 : listK) {
                A a = bxg0Var3.a;
                a.getClass();
                B b = bxg0Var3.b;
                b.getClass();
                px2 px2Var = (px2) bxg0Var3.c;
                ((AppCompatImageView) a).setImageResource(px2Var.a);
                ((TextView) b).setText(px2Var.b);
            }
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            yie yieVar8 = this.a;
            yieVar8.getClass();
            Pair pair = new Pair(yieVar8.w, f93.SETTLED);
            yie yieVar9 = this.a;
            yieVar9.getClass();
            Pair pair2 = new Pair(yieVar9.B, f93.UNSETTLED);
            yie yieVar10 = this.a;
            yieVar10.getClass();
            List<Pair> listK2 = b.k(pair, pair2, new Pair(yieVar10.F, f93.ALL));
            yie yieVar11 = this.a;
            yieVar11.getClass();
            for (View view2 : b.k(yieVar11.i, yieVar11.z, yieVar11.D, yieVar11.c, yieVar11.d)) {
                view2.getClass();
                view2.setVisibility(0);
            }
            for (AppCompatImageView appCompatImageView4 : b.k(yieVar11.v, yieVar11.A, yieVar11.E)) {
                appCompatImageView4.getClass();
                appCompatImageView4.setVisibility(8);
            }
            for (Pair pair3 : listK2) {
                A a2 = pair3.a;
                a2.getClass();
                ((TextView) a2).setText(((f93) pair3.b).a);
            }
            yieVar11.e.setVisibility(8);
            yieVar11.b.setVisibility(8);
        }
        m0();
    }

    public final void m0() {
        boolean zG;
        boolean zG2;
        boolean zG3;
        yie yieVar = this.a;
        yieVar.getClass();
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            zG = Intrinsics.g(this.c, BetDialogResult.Won.a);
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            zG = Intrinsics.g(this.c, BetDialogResult.Settled.a);
        }
        int iOrdinal2 = this.b.ordinal();
        if (iOrdinal2 == 0) {
            zG2 = Intrinsics.g(this.c, BetDialogResult.Lost.a);
        } else {
            if (iOrdinal2 != 1) {
                uhc.a();
                return;
            }
            zG2 = Intrinsics.g(this.c, BetDialogResult.Unsettled.a);
        }
        int iOrdinal3 = this.b.ordinal();
        if (iOrdinal3 == 0) {
            zG3 = Intrinsics.g(this.c, BetDialogResult.Void.a);
        } else {
            if (iOrdinal3 != 1) {
                uhc.a();
                return;
            }
            zG3 = this.c == null;
        }
        yieVar.f.setVisibility(zG ? 0 : 8);
        yieVar.y.setVisibility(zG2 ? 0 : 8);
        yieVar.C.setVisibility(zG3 ? 0 : 8);
        yieVar.b.setTextColor(requireContext().getColor(this.c != null ? R.color.text_brand_sub_primary_d_base : R.color.text_disabled_action));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_bet_status_and_result, viewGroup, false);
        int i = R.id.clearButton;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.clearButton, viewInflate);
        if (appCompatTextView != null) {
            i = R.id.divider;
            View viewA = h5e.a(R.id.divider, viewInflate);
            if (viewA != null) {
                i = R.id.divider2;
                View viewA2 = h5e.a(R.id.divider2, viewInflate);
                if (viewA2 != null) {
                    i = R.id.divider3;
                    View viewA3 = h5e.a(R.id.divider3, viewInflate);
                    if (viewA3 != null) {
                        i = R.id.option1Checked;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.option1Checked, viewInflate);
                        if (appCompatImageView != null) {
                            i = R.id.option1Container;
                            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.option1Container, viewInflate);
                            if (linearLayout != null) {
                                i = R.id.option1Icon;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.option1Icon, viewInflate);
                                if (appCompatImageView2 != null) {
                                    i = R.id.option1Label;
                                    TextView textView = (TextView) h5e.a(R.id.option1Label, viewInflate);
                                    if (textView != null) {
                                        i = R.id.option2Checked;
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.option2Checked, viewInflate);
                                        if (appCompatImageView3 != null) {
                                            i = R.id.option2Container;
                                            LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.option2Container, viewInflate);
                                            if (linearLayout2 != null) {
                                                i = R.id.option2Icon;
                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.option2Icon, viewInflate);
                                                if (appCompatImageView4 != null) {
                                                    i = R.id.option2Label;
                                                    TextView textView2 = (TextView) h5e.a(R.id.option2Label, viewInflate);
                                                    if (textView2 != null) {
                                                        i = R.id.option3Checked;
                                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.option3Checked, viewInflate);
                                                        if (appCompatImageView5 != null) {
                                                            i = R.id.option3Container;
                                                            LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.option3Container, viewInflate);
                                                            if (linearLayout3 != null) {
                                                                i = R.id.option3Icon;
                                                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) h5e.a(R.id.option3Icon, viewInflate);
                                                                if (appCompatImageView6 != null) {
                                                                    i = R.id.option3Label;
                                                                    TextView textView3 = (TextView) h5e.a(R.id.option3Label, viewInflate);
                                                                    if (textView3 != null) {
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                        this.a = new yie(constraintLayout, appCompatTextView, viewA, viewA2, viewA3, appCompatImageView, linearLayout, appCompatImageView2, textView, appCompatImageView3, linearLayout2, appCompatImageView4, textView2, appCompatImageView5, linearLayout3, appCompatImageView6, textView3);
                                                                        constraintLayout.getClass();
                                                                        return constraintLayout;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
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
        super.onDestroyView();
        this.a = null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        View viewFindViewById = bVar != null ? bVar.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(viewFindViewById);
            bottomSheetBehaviorC.L(3);
            bottomSheetBehaviorC.Y = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        yie yieVar = this.a;
        yieVar.getClass();
        int i = 0;
        yieVar.i.setOnClickListener(new a93(this, i));
        yie yieVar2 = this.a;
        yieVar2.getClass();
        yieVar2.z.setOnClickListener(new b93(this, i));
        yie yieVar3 = this.a;
        yieVar3.getClass();
        yieVar3.D.setOnClickListener(new c93(this, i));
        yie yieVar4 = this.a;
        yieVar4.getClass();
        yieVar4.b.setOnClickListener(new d93(this, i));
        j0();
    }
}
