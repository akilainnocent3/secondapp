package com.sportybet.android.social.presentation.creation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.domain.entity.MySocialCreationSource;
import com.sportybet.android.widget.ProgressButton;
import defpackage.a1s;
import defpackage.bmy;
import defpackage.c6b;
import defpackage.c8i0;
import defpackage.cyb;
import defpackage.d1x;
import defpackage.d630;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.g5e;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.hxl;
import defpackage.i6i0;
import defpackage.iel;
import defpackage.jq40;
import defpackage.k00;
import defpackage.k9j;
import defpackage.m2g;
import defpackage.o0x;
import defpackage.ohp;
import defpackage.p0x;
import defpackage.pwi;
import defpackage.q0x;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r0b;
import defpackage.r0x;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.s0x;
import defpackage.saj;
import defpackage.th50;
import defpackage.ttr;
import defpackage.v0x;
import defpackage.v8i0;
import defpackage.w8i0;
import defpackage.yfx;
import defpackage.zi50;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/social/presentation/creation/a;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a extends hxl implements k9j {
    public boolean A;
    public List<String> B;
    public String C;
    public rdd0 f;
    public final i6i0 i = g5e.a(b.a);
    public yfx v;
    public final q8i0 w;
    public MySocialCreationSource y;
    public String z;
    public static final /* synthetic */ ohp<Object>[] E = {new d630(0, a.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentMySocialCreationBinding;")};
    public static final C0351a D = new C0351a();

    /* JADX INFO: renamed from: com.sportybet.android.social.presentation.creation.a$a, reason: collision with other inner class name */
    public static final class C0351a {
    }

    public static final /* synthetic */ class b extends saj implements Function1<View, pwi> {
        public static final b a = new b(1, pwi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentMySocialCreationBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final pwi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.btn_create;
            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.btn_create, view2);
            if (progressButton != null) {
                i = R.id.close;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.close, view2);
                if (appCompatImageView != null) {
                    i = R.id.condition_char_container;
                    if (((LinearLayout) h5e.a(R.id.condition_char_container, view2)) != null) {
                        i = R.id.condition_length_container;
                        if (((LinearLayout) h5e.a(R.id.condition_length_container, view2)) != null) {
                            i = R.id.content_scroll;
                            if (((NestedScrollView) h5e.a(R.id.content_scroll, view2)) != null) {
                                i = R.id.et_username;
                                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.et_username, view2);
                                if (clearEditText != null) {
                                    i = R.id.iv_condition_char;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.iv_condition_char, view2);
                                    if (appCompatImageView2 != null) {
                                        i = R.id.iv_condition_length;
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.iv_condition_length, view2);
                                        if (appCompatImageView3 != null) {
                                            i = R.id.suggested_usernames_chip_group;
                                            FlexboxLayout flexboxLayout = (FlexboxLayout) h5e.a(R.id.suggested_usernames_chip_group, view2);
                                            if (flexboxLayout != null) {
                                                i = R.id.title;
                                                if (((AppCompatTextView) h5e.a(R.id.title, view2)) != null) {
                                                    i = R.id.tool_bar;
                                                    if (((ConstraintLayout) h5e.a(R.id.tool_bar, view2)) != null) {
                                                        i = R.id.tv_condition_char;
                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.tv_condition_char, view2);
                                                        if (appCompatTextView != null) {
                                                            i = R.id.tv_condition_length;
                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.tv_condition_length, view2);
                                                            if (appCompatTextView2 != null) {
                                                                i = R.id.tv_note;
                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.tv_note, view2);
                                                                if (appCompatTextView3 != null) {
                                                                    i = R.id.tv_recommended_username;
                                                                    if (((AppCompatTextView) h5e.a(R.id.tv_recommended_username, view2)) != null) {
                                                                        i = R.id.tv_subtitle;
                                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.tv_subtitle, view2);
                                                                        if (appCompatTextView4 != null) {
                                                                            i = R.id.tv_title;
                                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) h5e.a(R.id.tv_title, view2);
                                                                            if (appCompatTextView5 != null) {
                                                                                i = R.id.tv_username_taken_message;
                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) h5e.a(R.id.tv_username_taken_message, view2);
                                                                                if (appCompatTextView6 != null) {
                                                                                    i = R.id.tv_verify_name;
                                                                                    if (((AppCompatTextView) h5e.a(R.id.tv_verify_name, view2)) != null) {
                                                                                        i = R.id.username_suggestions_container;
                                                                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.username_suggestions_container, view2);
                                                                                        if (linearLayout != null) {
                                                                                            return new pwi((LinearLayout) view2, progressButton, appCompatImageView, clearEditText, appCompatImageView2, appCompatImageView3, flexboxLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, linearLayout);
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
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return a.this;
        }
    }

    public static final class d extends qlr implements Function0<w8i0> {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
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

    public static final class g extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? a.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public a() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.w = new q8i0(jq40.a(d1x.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
        this.y = MySocialCreationSource.SocialCreation.a;
        this.z = "";
        this.B = m2g.a;
    }

    public final pwi m0() {
        return (pwi) this.i.a(this, E[0]);
    }

    public final d1x n0() {
        return (d1x) this.w.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o0(String str, boolean z, List list) {
        pwi pwiVarM0 = m0();
        AppCompatTextView appCompatTextView = pwiVarM0.B;
        FlexboxLayout flexboxLayout = pwiVarM0.i;
        appCompatTextView.setVisibility(z ? 0 : 8);
        pwiVarM0.C.setVisibility(!list.isEmpty() ? 0 : 8);
        if (list.isEmpty()) {
            flexboxLayout.removeAllViews();
            this.B = m2g.a;
            this.C = null;
            return;
        }
        boolean zG = Intrinsics.g(this.B, list);
        boolean z2 = true;
        if (!zG) {
            flexboxLayout.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final String str2 = (String) it.next();
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                boolean zG2 = Intrinsics.g(str2, str);
                final q0x q0xVar = new q0x(this, list);
                str2.getClass();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(contextRequireContext);
                appCompatTextView2.setText(str2);
                appCompatTextView2.setSelected(zG2);
                appCompatTextView2.setClickable(z2);
                appCompatTextView2.setFocusable(z2);
                appCompatTextView2.setGravity(17);
                appCompatTextView2.setMinHeight(r0b.a(contextRequireContext, 37));
                appCompatTextView2.setPadding(r0b.a(contextRequireContext, 14), r0b.a(contextRequireContext, 7), r0b.a(contextRequireContext, 14), r0b.a(contextRequireContext, 7));
                appCompatTextView2.setTextAppearance(R.style.B2_R);
                appCompatTextView2.setBackgroundResource(R.drawable.bg_my_social_username_suggestion_chip);
                ColorStateList colorStateListA = th50.a(R.color.text_my_social_username_suggestion_chip, contextRequireContext.getTheme(), contextRequireContext.getResources());
                if (colorStateListA == null) {
                    colorStateListA = th50.a(R.color.text_type1_primary, contextRequireContext.getTheme(), contextRequireContext.getResources());
                }
                appCompatTextView2.setTextColor(colorStateListA);
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, r0b.a(contextRequireContext, 8), r0b.a(contextRequireContext, 8));
                appCompatTextView2.setLayoutParams(layoutParams);
                appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: nqh0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        q0xVar.invoke(str2);
                    }
                });
                flexboxLayout.addView(appCompatTextView2);
                z2 = true;
            }
            this.B = list;
        }
        if (zG && Intrinsics.g(this.C, str)) {
            return;
        }
        FlexboxLayout flexboxLayout2 = m0().i;
        int childCount = flexboxLayout2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = flexboxLayout2.getChildAt(i);
            childAt.setSelected((childAt instanceof TextView) && Intrinsics.g(((TextView) childAt).getText().toString(), str));
        }
        this.C = str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.B = m2g.a;
        this.C = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object bVar;
        view.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = NavHostFragment.a.a(this);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        this.v = (yfx) bVar;
        pwi pwiVarM0 = m0();
        int i = 0;
        c8i0.a(pwiVarM0.c, new o0x(this, i));
        ClearEditText clearEditText = pwiVarM0.d;
        InputFilter[] filters = clearEditText.getFilters();
        filters.getClass();
        r0x r0xVar = new r0x();
        int length = filters.length;
        Object[] objArrCopyOf = Arrays.copyOf(filters, length + 1);
        objArrCopyOf[length] = r0xVar;
        clearEditText.setFilters((InputFilter[]) objArrCopyOf);
        clearEditText.addTextChangedListener(new s0x(this));
        c8i0.a(pwiVarM0.b, new p0x(i, this, pwiVarM0));
        ej5.c(ebs.a(getLifecycle()), null, null, new c6b(new v0x(this, null), m0(), null), 3);
        p0(com.sportybet.android.social.presentation.creation.b.C0352b.a);
    }

    public final void p0(com.sportybet.android.social.presentation.creation.b bVar) {
        rdd0 rdd0Var = this.f;
        if (rdd0Var != null) {
            rdd0Var.a(bVar, k00.d);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }
}
