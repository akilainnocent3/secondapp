package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsne0;", "Landroidx/fragment/app/d;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sne0 extends y4m {
    public gbn f;
    public ame i;
    public nne0 v;
    public final q8i0 w;

    public static final class a extends qlr implements Function0<w8i0> {
        public final /* synthetic */ pne0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pne0 pne0Var) {
            super(0);
            this.a = pne0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ttr ttrVar) {
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

    public static final class d extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? sne0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public sne0() {
        ttr ttrVarA = hwr.a(a1s.c, new a(new pne0(this)));
        this.w = new q8i0(jq40.a(xne0.class), new b(ttrVarA), new d(ttrVarA), new c(ttrVarA));
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_switch_payment_item, (ViewGroup) null, false);
        int i = R.id.add_new_button;
        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.add_new_button, viewInflate);
        if (linearLayout != null) {
            i = R.id.edit;
            TextView textView = (TextView) h5e.a(R.id.edit, viewInflate);
            if (textView != null) {
                i = R.id.loading_mask;
                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.loading_mask, viewInflate);
                if (frameLayout != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, viewInflate);
                    if (recyclerView != null) {
                        this.i = new ame((ConstraintLayout) viewInflate, linearLayout, textView, frameLayout, recyclerView);
                        Dialog dialog = new Dialog(requireContext(), R.style.BottomDialog);
                        int i2 = 1;
                        dialog.requestWindowFeature(1);
                        ame ameVar = this.i;
                        if (ameVar == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        dialog.setContentView(ameVar.a);
                        Window window = dialog.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(new ColorDrawable(0));
                            window.setWindowAnimations(R.style.AnimBottom);
                        }
                        dialog.setCanceledOnTouchOutside(true);
                        ame ameVar2 = this.i;
                        if (ameVar2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        RecyclerView recyclerView2 = ameVar2.e;
                        gbn gbnVar = this.f;
                        if (gbnVar == null) {
                            Intrinsics.n("imageService");
                            throw null;
                        }
                        nne0 nne0Var = new nne0(gbnVar, new rb20(this, 2));
                        this.v = nne0Var;
                        recyclerView2.setAdapter(nne0Var);
                        recyclerView2.setItemAnimator(null);
                        ameVar2.c.setOnClickListener(new View.OnClickListener() { // from class: one0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ((xne0) this.a.w.getValue()).A1();
                            }
                        });
                        ameVar2.b.setOnClickListener(new avj(this, i2));
                        ameVar2.d.setOnClickListener(new e440());
                        xne0 xne0Var = (xne0) this.w.getValue();
                        g1i g1iVar = new g1i(xne0Var.c, new qne0(this, null));
                        s9s lifecycle = getLifecycle();
                        lifecycle.getClass();
                        s9s.b bVar = s9s.b.d;
                        arr.a(g1iVar, lifecycle, bVar);
                        g1i g1iVar2 = new g1i(xne0Var.e, new rne0(this, null));
                        s9s lifecycle2 = getLifecycle();
                        lifecycle2.getClass();
                        arr.a(g1iVar2, lifecycle2, bVar);
                        return dialog;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
