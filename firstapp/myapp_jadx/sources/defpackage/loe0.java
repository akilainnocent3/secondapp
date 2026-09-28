package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lloe0;", "Landroidx/fragment/app/d;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class loe0 extends z4m {
    public final q8i0 A;
    public final q8i0 B;
    public Snackbar C;
    public gbn f;
    public psm i;
    public b700 v;
    public d900 w;
    public bme y;
    public doe0 z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[aoe0.b.a.values().length];
            try {
                aoe0.b.a.C0082a c0082a = aoe0.b.a.b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                aoe0.b.a.C0082a c0082a2 = aoe0.b.a.b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                aoe0.b.a.C0082a c0082a3 = aoe0.b.a.b;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return loe0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return loe0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return loe0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<w8i0> {
        public final /* synthetic */ hoe0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(hoe0 hoe0Var) {
            super(0);
            this.a = hoe0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
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

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? loe0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public loe0() {
        ttr ttrVarA = hwr.a(a1s.c, new e(new hoe0(this)));
        this.A = new q8i0(jq40.a(xne0.class), new f(ttrVarA), new h(ttrVarA), new g(ttrVarA));
        this.B = new q8i0(jq40.a(au7.class), new b(), new d(), new c());
    }

    public final xne0 m0() {
        return (xne0) this.A.getValue();
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_switch_payment_item_v2, (ViewGroup) null, false);
        int i = R.id.add_icon_image_view;
        if (((AppCompatImageView) h5e.a(R.id.add_icon_image_view, viewInflate)) != null) {
            i = R.id.add_new_btn;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.add_new_btn, viewInflate);
            if (constraintLayout != null) {
                i = R.id.add_new_text;
                TextView textView = (TextView) h5e.a(R.id.add_new_text, viewInflate);
                if (textView != null) {
                    i = R.id.change_default_btn;
                    TextView textView2 = (TextView) h5e.a(R.id.change_default_btn, viewInflate);
                    if (textView2 != null) {
                        i = R.id.change_default_cancel_btn;
                        TextView textView3 = (TextView) h5e.a(R.id.change_default_cancel_btn, viewInflate);
                        if (textView3 != null) {
                            i = R.id.change_default_header_group;
                            Group group = (Group) h5e.a(R.id.change_default_header_group, viewInflate);
                            if (group != null) {
                                i = R.id.change_default_save_btn;
                                TextView textView4 = (TextView) h5e.a(R.id.change_default_save_btn, viewInflate);
                                if (textView4 != null) {
                                    i = R.id.change_default_title_text;
                                    if (((TextView) h5e.a(R.id.change_default_title_text, viewInflate)) != null) {
                                        i = R.id.check_image_view;
                                        if (((AppCompatImageView) h5e.a(R.id.check_image_view, viewInflate)) != null) {
                                            i = R.id.choose_number_header_group;
                                            Group group2 = (Group) h5e.a(R.id.choose_number_header_group, viewInflate);
                                            if (group2 != null) {
                                                i = R.id.choose_title_text;
                                                TextView textView5 = (TextView) h5e.a(R.id.choose_title_text, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.guideline_begin;
                                                    if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                                                        i = R.id.guideline_end;
                                                        if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                                            i = R.id.header_container;
                                                            if (((ConstraintLayout) h5e.a(R.id.header_container, viewInflate)) != null) {
                                                                i = R.id.loading_mask;
                                                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.loading_mask, viewInflate);
                                                                if (frameLayout != null) {
                                                                    i = R.id.newFeatureAlertView;
                                                                    BubbleView bubbleView = (BubbleView) h5e.a(R.id.newFeatureAlertView, viewInflate);
                                                                    if (bubbleView != null) {
                                                                        i = R.id.recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, viewInflate);
                                                                        if (recyclerView != null) {
                                                                            this.y = new bme((ConstraintLayout) viewInflate, constraintLayout, textView, textView2, textView3, group, textView4, group2, textView5, frameLayout, bubbleView, recyclerView);
                                                                            Dialog dialog = new Dialog(requireContext(), R.style.BottomDialog);
                                                                            int i2 = 1;
                                                                            dialog.requestWindowFeature(1);
                                                                            bme bmeVar = this.y;
                                                                            if (bmeVar == null) {
                                                                                Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                            dialog.setContentView(bmeVar.a);
                                                                            Window window = dialog.getWindow();
                                                                            if (window != null) {
                                                                                window.setBackgroundDrawable(new ColorDrawable(0));
                                                                                window.setWindowAnimations(R.style.AnimBottom);
                                                                            }
                                                                            dialog.setCanceledOnTouchOutside(true);
                                                                            bme bmeVar2 = this.y;
                                                                            if (bmeVar2 == null) {
                                                                                Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                            RecyclerView recyclerView2 = bmeVar2.A;
                                                                            BubbleView bubbleView2 = bmeVar2.z;
                                                                            Bundle arguments = getArguments();
                                                                            String string = arguments != null ? arguments.getString("ARG_TITLE_TEXT_STRING") : null;
                                                                            Bundle arguments2 = getArguments();
                                                                            String string2 = arguments2 != null ? arguments2.getString("ARG_ADD_NEW_BTN_TEXT_STRING") : null;
                                                                            Bundle arguments3 = getArguments();
                                                                            boolean z = arguments3 != null ? arguments3.getBoolean("ARG_ADD_NEW_BTN_ENABLED") : true;
                                                                            Bundle arguments4 = getArguments();
                                                                            String string3 = arguments4 != null ? arguments4.getString("ARG_NEW_FEATURE_HINT_TITLE_TEXT_STRING") : null;
                                                                            Bundle arguments5 = getArguments();
                                                                            String string4 = arguments5 != null ? arguments5.getString("ARG_NEW_FEATURE_HINT_CONTENT_TEXT_STRING") : null;
                                                                            TextView textView6 = bmeVar2.w;
                                                                            if (string == null) {
                                                                                string = sn5.d(this, R.string.page_payment__choose_number, new Object[0]);
                                                                            }
                                                                            textView6.setText(string);
                                                                            TextView textView7 = bmeVar2.c;
                                                                            if (string2 == null) {
                                                                                string2 = sn5.d(this, R.string.page_payment__add_new, new Object[0]);
                                                                            }
                                                                            textView7.setText(string2);
                                                                            if (string3 != null) {
                                                                                bubbleView2.setTitle(string3);
                                                                            }
                                                                            if (string4 != null) {
                                                                                bubbleView2.setDescription(string4);
                                                                            }
                                                                            bubbleView2.setOnClickedClose(new Function0() { // from class: ioe0
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    loe0 loe0Var = this.a;
                                                                                    Bundle arguments6 = loe0Var.getArguments();
                                                                                    String string5 = arguments6 != null ? arguments6.getString("ARG_NEW_FEATURE_HINT_PREF_KEY") : null;
                                                                                    if (string5 != null && !StringsKt.U(string5)) {
                                                                                        ej5.c(ebs.a(loe0Var.getLifecycle()), null, null, new moe0(loe0Var, string5, null), 3);
                                                                                    }
                                                                                    return Unit.a;
                                                                                }
                                                                            });
                                                                            psm psmVar = this.i;
                                                                            if (psmVar == null) {
                                                                                Intrinsics.n("countryManager");
                                                                                throw null;
                                                                            }
                                                                            int i3 = 2;
                                                                            doe0 doe0Var = new doe0(psmVar.M(), new jaf(this, i3), new cc20(this, i2), new joe0(this));
                                                                            this.z = doe0Var;
                                                                            recyclerView2.setAdapter(doe0Var);
                                                                            recyclerView2.setItemAnimator(null);
                                                                            bmeVar2.e.setOnClickListener(new im60(this, i2));
                                                                            bmeVar2.i.setOnClickListener(new View.OnClickListener() { // from class: koe0
                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    Object next;
                                                                                    loe0 loe0Var = this.a;
                                                                                    Iterator<T> it = ((wne0) loe0Var.m0().c.getValue()).a.iterator();
                                                                                    do {
                                                                                        if (!it.hasNext()) {
                                                                                            next = null;
                                                                                            break;
                                                                                        }
                                                                                        next = it.next();
                                                                                    } while (!((aoe0) next).b());
                                                                                    aoe0 aoe0Var = (aoe0) next;
                                                                                    if (aoe0Var != null) {
                                                                                        loe0Var.m0().d.a(new vne0.d(aoe0Var));
                                                                                    }
                                                                                }
                                                                            });
                                                                            bmeVar2.y.setOnClickListener(new e440());
                                                                            bme bmeVar3 = this.y;
                                                                            if (bmeVar3 == null) {
                                                                                Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                            ConstraintLayout constraintLayout2 = bmeVar3.b;
                                                                            bmeVar3.c.setTextColor(requireContext().getColor(z ? R.color.text_type1_primary : R.color.text_disable_type1_primary));
                                                                            fta ftaVar = new fta(this, i3);
                                                                            if (z) {
                                                                                constraintLayout2.setOnClickListener(new y7i0(ftaVar));
                                                                            } else {
                                                                                constraintLayout2.setOnClickListener(null);
                                                                            }
                                                                            constraintLayout2.setTag(Boolean.valueOf(z));
                                                                            xne0 xne0VarM0 = m0();
                                                                            g1i g1iVar = new g1i(xne0VarM0.c, new ooe0(this, null));
                                                                            s9s lifecycle = getLifecycle();
                                                                            lifecycle.getClass();
                                                                            s9s.b bVar = s9s.b.d;
                                                                            arr.a(g1iVar, lifecycle, bVar);
                                                                            g1i g1iVar2 = new g1i(xne0VarM0.e, new poe0(this, xne0VarM0, null));
                                                                            s9s lifecycle2 = getLifecycle();
                                                                            lifecycle2.getClass();
                                                                            arr.a(g1iVar2, lifecycle2, bVar);
                                                                            Bundle arguments6 = getArguments();
                                                                            String string5 = arguments6 != null ? arguments6.getString("ARG_NEW_FEATURE_HINT_PREF_KEY") : null;
                                                                            if (string5 == null || StringsKt.U(string5)) {
                                                                                return dialog;
                                                                            }
                                                                            b700 b700Var = this.v;
                                                                            if (b700Var == null) {
                                                                                Intrinsics.n("paymentDataStore");
                                                                                throw null;
                                                                            }
                                                                            g1i g1iVar3 = new g1i(b700Var.needShow(string5), new qoe0(this, null));
                                                                            s9s lifecycle3 = getLifecycle();
                                                                            lifecycle3.getClass();
                                                                            arr.a(g1iVar3, lifecycle3, bVar);
                                                                            return dialog;
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
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        m0().x1();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        wwd0 wwd0Var = m0().f;
        Boolean bool = Boolean.TRUE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }
}
