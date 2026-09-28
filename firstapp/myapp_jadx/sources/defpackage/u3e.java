package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu3e;", "Landroidx/fragment/app/d;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u3e extends zpl {
    public gbn f;
    public lke i;
    public final q8i0 v = new q8i0(jq40.a(qpg0.class), new a(), new c(), new b());
    public final q8i0 w = new q8i0(jq40.a(tud.class), new d(), new f(), new e());

    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return u3e.this.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return u3e.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return u3e.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return u3e.this.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return u3e.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return u3e.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public final tud m0() {
        return (tud) this.w.getValue();
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_deposit_new_card, (ViewGroup) null, false);
        int i2 = R.id.ad_text_view;
        if (((TextView) h5e.a(R.id.ad_text_view, viewInflate)) != null) {
            i2 = R.id.card_image_container;
            FlexboxLayout flexboxLayout = (FlexboxLayout) h5e.a(R.id.card_image_container, viewInflate);
            if (flexboxLayout != null) {
                i2 = R.id.close;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.close, viewInflate);
                if (appCompatImageView != null) {
                    i2 = R.id.deposit_amount_quick_adding_buttons;
                    AmountQuickAddingButtonGroup amountQuickAddingButtonGroup = (AmountQuickAddingButtonGroup) h5e.a(R.id.deposit_amount_quick_adding_buttons, viewInflate);
                    if (amountQuickAddingButtonGroup != null) {
                        i2 = R.id.deposit_with_new_card_layout;
                        View viewA = h5e.a(R.id.deposit_with_new_card_layout, viewInflate);
                        if (viewA != null) {
                            zrr zrrVarA = zrr.a(viewA);
                            i2 = R.id.guideline_begin;
                            if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                                i2 = R.id.guideline_end;
                                if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                    i2 = R.id.next;
                                    ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                    if (progressButton != null) {
                                        this.i = new lke((ConstraintLayout) viewInflate, flexboxLayout, appCompatImageView, amountQuickAddingButtonGroup, zrrVarA, progressButton);
                                        Dialog dialog = new Dialog(requireContext(), R.style.BottomDialog);
                                        int i3 = 1;
                                        dialog.requestWindowFeature(1);
                                        lke lkeVar = this.i;
                                        if (lkeVar == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        dialog.setContentView(lkeVar.a);
                                        Window window = dialog.getWindow();
                                        if (window != null) {
                                            window.setBackgroundDrawable(new ColorDrawable(0));
                                            window.setWindowAnimations(R.style.AnimBottom);
                                            WindowManager.LayoutParams attributes = window.getAttributes();
                                            attributes.gravity = 16;
                                            attributes.width = -1;
                                            attributes.height = -2;
                                            window.setAttributes(attributes);
                                        }
                                        lke lkeVar2 = this.i;
                                        if (lkeVar2 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        lkeVar2.c.setOnClickListener(new View.OnClickListener() { // from class: u2e
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                u3e u3eVar = this.a;
                                                u3eVar.m0().P1("");
                                                u3eVar.m0().N1("");
                                                u3eVar.m0().R1("");
                                                view.getClass();
                                                c8i0.g(view);
                                                u3eVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        lke lkeVar3 = this.i;
                                        if (lkeVar3 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        cr0.c(lkeVar3.e);
                                        lke lkeVar4 = this.i;
                                        if (lkeVar4 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        zrr zrrVar = lkeVar4.e;
                                        TextView textView = zrrVar.b;
                                        ImageView imageView = zrrVar.D;
                                        CombEditText combEditText = zrrVar.z;
                                        CombEditText combEditText2 = zrrVar.i;
                                        ClearEditText clearEditText = zrrVar.c;
                                        textView.setText(sn5.d(this, R.string.common_functions__amount_label, m0().d.f()));
                                        zrrVar.e.setText(sn5.d(this, R.string.common_functions__balance_label, m0().d.f()));
                                        combEditText2.setTextChangedListener(new CombEditText.d() { // from class: y2e
                                            @Override // com.sporty.android.common_ui.widgets.CombEditText.d
                                            public final void l(CharSequence charSequence) {
                                                this.a.m0().P1(StringsKt.t0(charSequence.toString()).toString());
                                            }
                                        });
                                        ResourceUiText resourceUiText = m0().B0;
                                        Context contextRequireContext = requireContext();
                                        contextRequireContext.getClass();
                                        combEditText2.setEditHint(resourceUiText.e(contextRequireContext));
                                        combEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: z2e
                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                this.a.m0().Q1(z);
                                            }
                                        });
                                        combEditText.setTextChangedListener(new CombEditText.d() { // from class: a3e
                                            @Override // com.sporty.android.common_ui.widgets.CombEditText.d
                                            public final void l(CharSequence charSequence) {
                                                this.a.m0().N1(StringsKt.t0(charSequence.toString()).toString());
                                            }
                                        });
                                        combEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: b3e
                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                this.a.m0().O1(z);
                                            }
                                        });
                                        zrrVar.w.setTextChangedListener(new CombEditText.d() { // from class: c3e
                                            @Override // com.sporty.android.common_ui.widgets.CombEditText.d
                                            public final void l(CharSequence charSequence) {
                                                this.a.m0().R1(StringsKt.t0(charSequence.toString()).toString());
                                            }
                                        });
                                        zrrVar.C.setOnClickListener(new View.OnClickListener() { // from class: d3e
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                this.a.m0().Y1();
                                            }
                                        });
                                        imageView.setOnClickListener(new View.OnClickListener() { // from class: e3e
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                wwd0 wwd0Var = this.a.m0().b1;
                                                wwd0Var.k(null, Boolean.valueOf(!((Boolean) wwd0Var.getValue()).booleanValue()));
                                            }
                                        });
                                        zrrVar.B.setOnClickListener(new yf5(this, i3));
                                        imageView.setVisibility(0);
                                        zrrVar.E.setVisibility(0);
                                        clearEditText.setKeyListener(DigitsKeyListener.getInstance(".0123456789"));
                                        clearEditText.setRawInputType(8194);
                                        clearEditText.setFilters(new InputFilter[]{new nqy()});
                                        clearEditText.setTextChangedListener(new ClearEditText.b() { // from class: v2e
                                            @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
                                            public final void l(CharSequence charSequence) {
                                                this.a.m0().x1(StringsKt.t0(charSequence.toString()).toString());
                                            }
                                        });
                                        lke lkeVar5 = this.i;
                                        if (lkeVar5 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        lkeVar5.f.setOnClickListener(new View.OnClickListener() { // from class: w2e
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                u3e u3eVar = this.a;
                                                tud tudVarM0 = u3eVar.m0();
                                                ej5.c(o8i0.d(tudVarM0), null, null, new htd(tudVarM0, null), 3);
                                                view.getClass();
                                                c8i0.g(view);
                                                if (!u3eVar.m0().P0.a() || u3eVar.m0().U0.b()) {
                                                    return;
                                                }
                                                u3eVar.dismissAllowingStateLoss();
                                            }
                                        });
                                        lke lkeVar6 = this.i;
                                        if (lkeVar6 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        lkeVar6.d.setupOnClickListener(new x2e(this, i));
                                        tud tudVarM0 = m0();
                                        g1i g1iVar = new g1i((lyh) tudVarM0.M.getValue(), new k3e(this, null));
                                        s9s lifecycle = getLifecycle();
                                        lifecycle.getClass();
                                        s9s.b bVar = s9s.b.d;
                                        arr.a(g1iVar, lifecycle, bVar);
                                        g1i g1iVar2 = new g1i(tudVarM0.Q0, new l3e(this, null));
                                        s9s lifecycle2 = getLifecycle();
                                        lifecycle2.getClass();
                                        arr.a(g1iVar2, lifecycle2, bVar);
                                        g1i g1iVar3 = new g1i(tudVarM0.S0, new m3e(this, null));
                                        s9s lifecycle3 = getLifecycle();
                                        lifecycle3.getClass();
                                        arr.a(g1iVar3, lifecycle3, bVar);
                                        g1i g1iVar4 = new g1i(tudVarM0.V0, new n3e(this, null));
                                        s9s lifecycle4 = getLifecycle();
                                        lifecycle4.getClass();
                                        arr.a(g1iVar4, lifecycle4, bVar);
                                        g1i g1iVar5 = new g1i(tudVarM0.X0, new o3e(this, null));
                                        s9s lifecycle5 = getLifecycle();
                                        lifecycle5.getClass();
                                        arr.a(g1iVar5, lifecycle5, bVar);
                                        g1i g1iVar6 = new g1i(tudVarM0.Z0, new p3e(this, null));
                                        s9s lifecycle6 = getLifecycle();
                                        lifecycle6.getClass();
                                        arr.a(g1iVar6, lifecycle6, bVar);
                                        g1i g1iVar7 = new g1i(tudVarM0.c1, new q3e(this, null));
                                        s9s lifecycle7 = getLifecycle();
                                        lifecycle7.getClass();
                                        arr.a(g1iVar7, lifecycle7, bVar);
                                        g1i g1iVar8 = new g1i(tudVarM0.d1, new r3e(this, null));
                                        s9s lifecycle8 = getLifecycle();
                                        lifecycle8.getClass();
                                        arr.a(g1iVar8, lifecycle8, bVar);
                                        g1i g1iVar9 = new g1i(tudVarM0.T, new s3e(this, null));
                                        s9s lifecycle9 = getLifecycle();
                                        lifecycle9.getClass();
                                        arr.a(g1iVar9, lifecycle9, bVar);
                                        g1i g1iVar10 = new g1i(tudVarM0.H1(), new g3e(this, tudVarM0, null));
                                        s9s lifecycle10 = getLifecycle();
                                        lifecycle10.getClass();
                                        arr.a(g1iVar10, lifecycle10, bVar);
                                        g1i g1iVar11 = new g1i(tudVarM0.N0, new h3e(this, null));
                                        s9s lifecycle11 = getLifecycle();
                                        lifecycle11.getClass();
                                        arr.a(g1iVar11, lifecycle11, bVar);
                                        g1i g1iVar12 = new g1i(new t3e(tudVarM0.e1), new i3e(this, null));
                                        s9s lifecycle12 = getLifecycle();
                                        lifecycle12.getClass();
                                        arr.a(g1iVar12, lifecycle12, bVar);
                                        g1i g1iVar13 = new g1i(tudVarM0.k0, new j3e(this, null));
                                        s9s lifecycle13 = getLifecycle();
                                        lifecycle13.getClass();
                                        arr.a(g1iVar13, lifecycle13, bVar);
                                        g1i g1iVar14 = new g1i(((qpg0) this.v.getValue()).y, new f3e(this, null));
                                        s9s lifecycle14 = getLifecycle();
                                        lifecycle14.getClass();
                                        arr.a(g1iVar14, lifecycle14, bVar);
                                        return dialog;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
