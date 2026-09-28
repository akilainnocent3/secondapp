package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.widget.ClearEditText;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liws;", "Lm12;", "Landroid/view/View$OnClickListener;", "Landroid/text/TextWatcher;", "Landroid/widget/TextView$OnEditorActionListener;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iws extends cvl implements View.OnClickListener, TextWatcher, TextView.OnEditorActionListener {
    public psm B;
    public jrm C;
    public wsm D;
    public lq1 E;
    public com.sporty.android.common.uievent.e F;
    public iym G;
    public cwi H;
    public final q8i0 I;
    public final q8i0 J;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? iws.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return iws.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
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

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? iws.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class g extends qlr implements Function0<Fragment> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return iws.this;
        }
    }

    public static final class h extends qlr implements Function0<w8i0> {
        public final /* synthetic */ g a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.a = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class i extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
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

    public iws() {
        this.z = false;
        this.A = false;
        b bVar = new b();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new c(bVar));
        this.I = new q8i0(jq40.a(mz7.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new h(new g()));
        this.J = new q8i0(jq40.a(rws.class), new i(ttrVarA2), new a(ttrVarA2), new j(ttrVarA2));
    }

    public final void n0() {
        cwi cwiVar = this.H;
        if (cwiVar != null) {
            lop.b(cwiVar.c, Boolean.FALSE);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void o0() {
        n0();
        cwi cwiVar = this.H;
        if (cwiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        String strValueOf = String.valueOf(cwiVar.c.getText());
        if (!TextUtils.isEmpty(strValueOf)) {
            p0();
            rws.y1((rws) this.J.getValue(), strValueOf, g08.LOAD_CODE_FROM_CODEHUB, null, 28);
            return;
        }
        zyf0.c(0, sn5.d(this, R.string.common_feedback__something_went_wrong_please_try_again, new Object[0]));
        wsm wsmVar = this.D;
        if (wsmVar != null) {
            wsmVar.g("share code incorrect", "Booking Code Panel", new Exception("share code empty "), null);
        } else {
            Intrinsics.n("crashlyticsHelper");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.booking_loading_btn) {
            o0();
            return;
        }
        if ((numValueOf == null || numValueOf.intValue() != R.id.booking_title) && (numValueOf == null || numValueOf.intValue() != R.id.booking_title_info)) {
            n0();
            return;
        }
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(requireContext());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        androidx.appcompat.app.b.a title = aVar.setTitle(sn5.b(contextRequireContext, R.string.component_betslip__what_is_booking_code, new Object[0]));
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        String strB = sn5.b(contextRequireContext2, R.string.component_betslip__a_booking_code_enable_you_to_book_tip, new Object[0]);
        AlertController.b bVar = title.a;
        bVar.f = strB;
        bVar.k = true;
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        title.c(sn5.b(contextRequireContext3, R.string.common_functions__ok, new Object[0]), null);
        title.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_load_code, viewGroup, false);
        int i2 = R.id.booking_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.booking_container, viewInflate);
        if (constraintLayout != null) {
            i2 = R.id.booking_edit_text;
            ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.booking_edit_text, viewInflate);
            if (clearEditText != null) {
                i2 = R.id.booking_error_text;
                TextView textView = (TextView) h5e.a(R.id.booking_error_text, viewInflate);
                if (textView != null) {
                    i2 = R.id.booking_loading_btn;
                    ProgressButton progressButton = (ProgressButton) h5e.a(R.id.booking_loading_btn, viewInflate);
                    if (progressButton != null) {
                        i2 = R.id.booking_title;
                        TextView textView2 = (TextView) h5e.a(R.id.booking_title, viewInflate);
                        if (textView2 != null) {
                            i2 = R.id.booking_title_info;
                            ImageView imageView = (ImageView) h5e.a(R.id.booking_title_info, viewInflate);
                            if (imageView != null) {
                                i2 = R.id.description_view;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.description_view, viewInflate);
                                if (constraintLayout2 != null) {
                                    i2 = R.id.description_view_int;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.description_view_int, viewInflate);
                                    if (constraintLayout3 != null) {
                                        i2 = R.id.img_int_1;
                                        ImageView imageView2 = (ImageView) h5e.a(R.id.img_int_1, viewInflate);
                                        if (imageView2 != null) {
                                            i2 = R.id.img_int_2;
                                            ImageView imageView3 = (ImageView) h5e.a(R.id.img_int_2, viewInflate);
                                            if (imageView3 != null) {
                                                i2 = R.id.img_int_3;
                                                ImageView imageView4 = (ImageView) h5e.a(R.id.img_int_3, viewInflate);
                                                if (imageView4 != null) {
                                                    i2 = R.id.line01;
                                                    if (((TextView) h5e.a(R.id.line01, viewInflate)) != null) {
                                                        i2 = R.id.line02;
                                                        if (((TextView) h5e.a(R.id.line02, viewInflate)) != null) {
                                                            i2 = R.id.line022;
                                                            if (((TextView) h5e.a(R.id.line022, viewInflate)) != null) {
                                                                i2 = R.id.line03;
                                                                if (((TextView) h5e.a(R.id.line03, viewInflate)) != null) {
                                                                    i2 = R.id.line04;
                                                                    if (((TextView) h5e.a(R.id.line04, viewInflate)) != null) {
                                                                        i2 = R.id.line042;
                                                                        if (((TextView) h5e.a(R.id.line042, viewInflate)) != null) {
                                                                            i2 = R.id.line33;
                                                                            if (((TextView) h5e.a(R.id.line33, viewInflate)) != null) {
                                                                                i2 = R.id.load_code_instruct;
                                                                                if (((ImageView) h5e.a(R.id.load_code_instruct, viewInflate)) != null) {
                                                                                    i2 = R.id.load_code_panel;
                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.load_code_panel, viewInflate);
                                                                                    if (constraintLayout4 != null) {
                                                                                        i2 = R.id.load_tip_text;
                                                                                        TextView textView3 = (TextView) h5e.a(R.id.load_tip_text, viewInflate);
                                                                                        if (textView3 != null) {
                                                                                            i2 = R.id.loading_view;
                                                                                            LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.loading_view, viewInflate);
                                                                                            if (loadingViewNew != null) {
                                                                                                i2 = R.id.recent_code_view;
                                                                                                ComposeView composeView = (ComposeView) h5e.a(R.id.recent_code_view, viewInflate);
                                                                                                if (composeView != null) {
                                                                                                    i2 = R.id.txt_label_1;
                                                                                                    TextView textView4 = (TextView) h5e.a(R.id.txt_label_1, viewInflate);
                                                                                                    if (textView4 != null) {
                                                                                                        i2 = R.id.txt_label_2;
                                                                                                        TextView textView5 = (TextView) h5e.a(R.id.txt_label_2, viewInflate);
                                                                                                        if (textView5 != null) {
                                                                                                            i2 = R.id.txt_label_3;
                                                                                                            TextView textView6 = (TextView) h5e.a(R.id.txt_label_3, viewInflate);
                                                                                                            if (textView6 != null) {
                                                                                                                i2 = R.id.txt_label_4;
                                                                                                                TextView textView7 = (TextView) h5e.a(R.id.txt_label_4, viewInflate);
                                                                                                                if (textView7 != null) {
                                                                                                                    i2 = R.id.txt_label_5;
                                                                                                                    TextView textView8 = (TextView) h5e.a(R.id.txt_label_5, viewInflate);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i2 = R.id.txt_label_6;
                                                                                                                        TextView textView9 = (TextView) h5e.a(R.id.txt_label_6, viewInflate);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i2 = R.id.txt_number_1;
                                                                                                                            if (((TextView) h5e.a(R.id.txt_number_1, viewInflate)) != null) {
                                                                                                                                i2 = R.id.txt_number_2;
                                                                                                                                if (((TextView) h5e.a(R.id.txt_number_2, viewInflate)) != null) {
                                                                                                                                    i2 = R.id.txt_number_3;
                                                                                                                                    if (((TextView) h5e.a(R.id.txt_number_3, viewInflate)) != null) {
                                                                                                                                        i2 = R.id.txt_recent_code_label;
                                                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.txt_recent_code_label, viewInflate);
                                                                                                                                        if (textView10 != null) {
                                                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) viewInflate;
                                                                                                                                            this.H = new cwi(constraintLayout5, constraintLayout, clearEditText, textView, progressButton, textView2, imageView, constraintLayout2, constraintLayout3, imageView2, imageView3, imageView4, constraintLayout4, textView3, loadingViewNew, composeView, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
                                                                                                                                            constraintLayout5.getClass();
                                                                                                                                            return constraintLayout5;
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 6) {
            return false;
        }
        o0();
        n0();
        return true;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        n0();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        cwi cwiVar = this.H;
        if (cwiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        cwiVar.e.setEnabled(!TextUtils.isEmpty(charSequence));
        p0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        cwi cwiVar = this.H;
        if (cwiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ClearEditText clearEditText = cwiVar.c;
        ProgressButton progressButton = cwiVar.e;
        cwiVar.f.setOnClickListener(this);
        cwiVar.i.setOnClickListener(this);
        cwiVar.B.setOnClickListener(this);
        clearEditText.setText("");
        clearEditText.addTextChangedListener(this);
        clearEditText.setOnEditorActionListener(this);
        clearEditText.setErrorView(cwiVar.d);
        lq1 lq1Var = this.E;
        if (lq1Var == null) {
            Intrinsics.n("boConfigSource");
            throw null;
        }
        final String strI = qq1.i(lq1Var, BOConfigParam.CodeHubCustomCodeSeparator, "_");
        cwi cwiVar2 = this.H;
        if (cwiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        cwiVar2.c.setFilters(new InputFilter[]{new InputFilter() { // from class: xvs
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                charSequence.getClass();
                StringBuilder sb = new StringBuilder();
                int length = charSequence.length();
                for (int i6 = 0; i6 < length; i6++) {
                    char cCharAt = charSequence.charAt(i6);
                    if (Character.isLetterOrDigit(cCharAt) || cCharAt == strI.charAt(0)) {
                        sb.append(cCharAt);
                    }
                }
                return sb;
            }
        }});
        progressButton.setOnClickListener(this);
        progressButton.setEnabled(false);
        progressButton.setButtonText(R.string.common_functions__load);
        progressButton.setLoadingText("");
        progressButton.setTextSize(12.0f);
        cwiVar.E.setViewCompositionStrategy(u6i0.c.a);
        cwiVar.C.setText("*".concat(sn5.d(this, R.string.page_load_code__odds_or_availabilities_may_change, new Object[0])));
        cwiVar.F.setText(nae0.a(sn5.d(this, R.string.page_load_code__load_events_allows_you_to_enter_a_booking_code_and_load_your_betslip_with_pre_selected_selections_etc, new Object[0])));
        cwiVar.G.setText(getText(R.string.page_load_code__you_can_get_a_booking_code_in_a_number_of_ways));
        cwiVar.H.setText(nae0.a(sn5.d(this, R.string.page_load_code__pick_your_selections_and_tap_the_sharing_icon_in_the_betslip_etc, new Object[0])));
        cwiVar.I.setText(nae0.a(sn5.d(this, R.string.page_load_code__after_placing_a_bet_this_will_give_you_a_booking_code_to_share_with_friends_to_place_the_same_bet, new Object[0])));
        cwiVar.J.setText(nae0.a(sn5.d(this, R.string.page_load_code__in_your_open_bets_you_can_share_the_booking_code_in_your_open_bets, new Object[0])));
        String strD = sn5.d(this, R.string.page_load_code__now_just_share_your_code_to_increase_the_fun_and_show_your_friends_who_the_real_ace_is_vemojis, new Object[0]);
        boolean zIsEmpty = TextUtils.isEmpty(strD);
        TextView textView = cwiVar.K;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(String.format(strD, Arrays.copyOf(new Object[]{"⚽ 🥅🏅"}, 1)));
        }
        String strD2 = sn5.d(this, R.string.page_load_code__loadcode_1, new Object[0]);
        String strD3 = sn5.d(this, R.string.page_load_code__loadcode_2, new Object[0]);
        String strD4 = sn5.d(this, R.string.page_load_code__loadcode_3, new Object[0]);
        sh8.a().a(strD2, cwiVar.y);
        sh8.a().a(strD3, cwiVar.z);
        sh8.a().a(strD4, cwiVar.A);
        cwi cwiVar3 = this.H;
        if (cwiVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        q8i0 q8i0Var = this.I;
        kzh.d(new g1i(((mz7) q8i0Var.getValue()).R, new dws(cwiVar3, this, null)), ebs.a(getLifecycle()));
        kzh.d(((mz7) q8i0Var.getValue()).i.d(pu0.c.a), zu7.a());
        q8i0 q8i0Var2 = this.J;
        g1i g1iVar = new g1i(((rws) q8i0Var2.getValue()).e, new ews(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(((rws) q8i0Var2.getValue()).i, new fws(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(((rws) q8i0Var2.getValue()).w, new gws(this, null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(((rws) q8i0Var2.getValue()).z, new hws(this, null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
    }

    public final void p0() {
        cwi cwiVar = this.H;
        if (cwiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = cwiVar.b;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        ClearEditText clearEditText = cwiVar.c;
        if (zIsEmpty) {
            clearEditText.setError((String) null);
            constraintLayout.setActivated(false);
        } else {
            clearEditText.setError("");
            constraintLayout.setActivated(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
