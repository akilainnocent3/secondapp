package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.sportypin.WithdrawalPinActivity;
import com.sportybet.android.user.ChangeLocationActivity;
import com.sportybet.android.user.ChangeUserInfoActivity;
import com.sportybet.android.user.LineTextViewPanel;
import com.sportybet.android.user.avatar.ChangeAvatarActivity;
import com.sportybet.android.user.avatar.avatarview.AvatarView;
import com.sportybet.android.user.kyc.banner.KYCBanner;
import com.sportybet.android.user.verifiedinfo.VerifiedInfoActivity;
import com.sportybet.android.widget.LoadingView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002"}, d2 = {"Ld030;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Lvym;", "Lk9j;", "<init>", "()V", "Lqaf0;", "sectionState", "Loaf0;", "dialogState", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d030 extends w0m implements View.OnClickListener, vym, k9j {
    public static final /* synthetic */ ohp<Object>[] S = {new d630(0, d030.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragProfileBinding;")};
    public nsm A;
    public nel B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public Boolean Q;
    public ee<Intent> R;
    public final i6i0 f = g5e.a(a.a);
    public final q8i0 i;
    public final q8i0 v;
    public final q8i0 w;
    public y8j y;
    public psm z;

    public static final /* synthetic */ class a extends saj implements Function1<View, oui> {
        public static final a a = new a(1, oui.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragProfileBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final oui invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.avatar;
            if (((AvatarView) h5e.a(R.id.avatar, view2)) != null) {
                i = R.id.avatar_bar;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.avatar_bar, view2);
                if (constraintLayout != null) {
                    i = R.id.back_icon;
                    ImageButton imageButton = (ImageButton) h5e.a(R.id.back_icon, view2);
                    if (imageButton != null) {
                        i = R.id.back_title;
                        if (((TextView) h5e.a(R.id.back_title, view2)) != null) {
                            i = R.id.compose_footer;
                            ComposeView composeView = (ComposeView) h5e.a(R.id.compose_footer, view2);
                            if (composeView != null) {
                                i = R.id.email_non_editable;
                                LineTextViewPanel lineTextViewPanel = (LineTextViewPanel) h5e.a(R.id.email_non_editable, view2);
                                if (lineTextViewPanel != null) {
                                    i = R.id.first_name;
                                    LineTextViewPanel lineTextViewPanel2 = (LineTextViewPanel) h5e.a(R.id.first_name, view2);
                                    if (lineTextViewPanel2 != null) {
                                        i = R.id.home;
                                        ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, view2);
                                        if (imageButton2 != null) {
                                            i = R.id.item_footer;
                                            if (((LinearLayout) h5e.a(R.id.item_footer, view2)) != null) {
                                                i = R.id.kyc_banner;
                                                KYCBanner kYCBanner = (KYCBanner) h5e.a(R.id.kyc_banner, view2);
                                                if (kYCBanner != null) {
                                                    i = R.id.kyc_banner_layout;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.kyc_banner_layout, view2);
                                                    if (constraintLayout2 != null) {
                                                        i = R.id.language;
                                                        LineTextViewPanel lineTextViewPanel3 = (LineTextViewPanel) h5e.a(R.id.language, view2);
                                                        if (lineTextViewPanel3 != null) {
                                                            i = R.id.last_name;
                                                            LineTextViewPanel lineTextViewPanel4 = (LineTextViewPanel) h5e.a(R.id.last_name, view2);
                                                            if (lineTextViewPanel4 != null) {
                                                                i = R.id.loading;
                                                                LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, view2);
                                                                if (loadingView != null) {
                                                                    i = R.id.location;
                                                                    LineTextViewPanel lineTextViewPanel5 = (LineTextViewPanel) h5e.a(R.id.location, view2);
                                                                    if (lineTextViewPanel5 != null) {
                                                                        i = R.id.my_social;
                                                                        ComposeView composeView2 = (ComposeView) h5e.a(R.id.my_social, view2);
                                                                        if (composeView2 != null) {
                                                                            i = R.id.profile_content;
                                                                            ScrollView scrollView = (ScrollView) h5e.a(R.id.profile_content, view2);
                                                                            if (scrollView != null) {
                                                                                i = R.id.profile_dialog_compose_view;
                                                                                ComposeView composeView3 = (ComposeView) h5e.a(R.id.profile_dialog_compose_view, view2);
                                                                                if (composeView3 != null) {
                                                                                    i = R.id.profile_dob_compose_view;
                                                                                    ComposeView composeView4 = (ComposeView) h5e.a(R.id.profile_dob_compose_view, view2);
                                                                                    if (composeView4 != null) {
                                                                                        i = R.id.profile_icon_change;
                                                                                        if (((TextView) h5e.a(R.id.profile_icon_change, view2)) != null) {
                                                                                            i = R.id.profile_loading_bar;
                                                                                            LoadingView loadingView2 = (LoadingView) h5e.a(R.id.profile_loading_bar, view2);
                                                                                            if (loadingView2 != null) {
                                                                                                i = R.id.profile_nin_compose_view;
                                                                                                ComposeView composeView5 = (ComposeView) h5e.a(R.id.profile_nin_compose_view, view2);
                                                                                                if (composeView5 != null) {
                                                                                                    i = R.id.profile_phone_number_compose_view;
                                                                                                    ComposeView composeView6 = (ComposeView) h5e.a(R.id.profile_phone_number_compose_view, view2);
                                                                                                    if (composeView6 != null) {
                                                                                                        i = R.id.profile_telegram_compose_view;
                                                                                                        ComposeView composeView7 = (ComposeView) h5e.a(R.id.profile_telegram_compose_view, view2);
                                                                                                        if (composeView7 != null) {
                                                                                                            i = R.id.profile_verified_email_compose_view;
                                                                                                            ComposeView composeView8 = (ComposeView) h5e.a(R.id.profile_verified_email_compose_view, view2);
                                                                                                            if (composeView8 != null) {
                                                                                                                i = R.id.red_dot;
                                                                                                                ImageView imageView = (ImageView) h5e.a(R.id.red_dot, view2);
                                                                                                                if (imageView != null) {
                                                                                                                    i = R.id.title_bar;
                                                                                                                    if (((RelativeLayout) h5e.a(R.id.title_bar, view2)) != null) {
                                                                                                                        i = R.id.title_line;
                                                                                                                        View viewA = h5e.a(R.id.title_line, view2);
                                                                                                                        if (viewA != null) {
                                                                                                                            i = R.id.user_account;
                                                                                                                            TextView textView = (TextView) h5e.a(R.id.user_account, view2);
                                                                                                                            if (textView != null) {
                                                                                                                                i = R.id.user_name;
                                                                                                                                LineTextViewPanel lineTextViewPanel6 = (LineTextViewPanel) h5e.a(R.id.user_name, view2);
                                                                                                                                if (lineTextViewPanel6 != null) {
                                                                                                                                    i = R.id.verified_info;
                                                                                                                                    LineTextViewPanel lineTextViewPanel7 = (LineTextViewPanel) h5e.a(R.id.verified_info, view2);
                                                                                                                                    if (lineTextViewPanel7 != null) {
                                                                                                                                        return new oui((RelativeLayout) view2, constraintLayout, imageButton, composeView, lineTextViewPanel, lineTextViewPanel2, imageButton2, kYCBanner, constraintLayout2, lineTextViewPanel3, lineTextViewPanel4, loadingView, lineTextViewPanel5, composeView2, scrollView, composeView3, composeView4, loadingView2, composeView5, composeView6, composeView7, composeView8, imageView, viewA, textView, lineTextViewPanel6, lineTextViewPanel7);
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
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    @c0d(c = "com.sportybet.feature.profile.ProfileFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "ProfileFragment.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ d030 b;
        public final /* synthetic */ d030 c;

        @c0d(c = "com.sportybet.feature.profile.ProfileFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "ProfileFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ d030 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, d030 d030Var) {
                super(2, v1bVar);
                this.b = d030Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(v1bVar, this.b);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ohp<Object>[] ohpVarArr = d030.S;
                d030 d030Var = this.b;
                ej5.c(v5bVar, null, null, new f030(null, d030Var), 3);
                ej5.c(v5bVar, null, null, new e030(null, d030Var), 3);
                ej5.c(v5bVar, null, null, new n030(null, d030Var), 3);
                ej5.c(v5bVar, null, null, new g030(null, d030Var), 3);
                ej5.c(v5bVar, null, null, new h030(null, d030Var), 3);
                ej5.c(v5bVar, null, null, new p030(null, d030Var), 3);
                ej5.c(v5bVar, null, null, new o030(null, d030Var), 3);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d030 d030Var, v1b v1bVar, d030 d030Var2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = d030Var;
            this.c = d030Var2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new b(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getViewLifecycleOwner().getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ ifb a;

        public c(ifb ifbVar) {
            this.a = ifbVar;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? d030.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class e extends qlr implements Function0<Fragment> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return d030.this;
        }
    }

    public static final class f extends qlr implements Function0<w8i0> {
        public final /* synthetic */ e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
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

    public static final class i extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? d030.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class j extends qlr implements Function0<Fragment> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return d030.this;
        }
    }

    public static final class k extends qlr implements Function0<w8i0> {
        public final /* synthetic */ j a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.a = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class l extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class m extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ttr ttrVar) {
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

    public static final class n extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? d030.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class o extends qlr implements Function0<Fragment> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return d030.this;
        }
    }

    public static final class p extends qlr implements Function0<w8i0> {
        public final /* synthetic */ o a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.a = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class q extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class r extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ttr ttrVar) {
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

    public d030() {
        j jVar = new j();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new k(jVar));
        this.i = new q8i0(jq40.a(a230.class), new l(ttrVarA), new n(ttrVarA), new m(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new p(new o()));
        this.v = new q8i0(jq40.a(tz00.class), new q(ttrVarA2), new d(ttrVarA2), new r(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new f(new e()));
        this.w = new q8i0(jq40.a(vaf0.class), new g(ttrVarA3), new i(ttrVarA3), new h(ttrVarA3));
        this.C = "";
        this.D = "";
        this.E = "";
        this.I = "";
    }

    public static String p0(String str) {
        return oxc.a(str, ", ", a8b.c().b);
    }

    public static final void u0(d030 d030Var, ActivityResult activityResult) {
        String stringExtra;
        Collection collectionT0;
        String stringExtra2;
        HashMap map;
        Object serializableExtra;
        activityResult.getClass();
        Intent intent = activityResult.b;
        int intExtra = intent != null ? intent.getIntExtra("requestCode", 0) : 0;
        int i2 = activityResult.a;
        if (intExtra == 1100 || intExtra == 1200) {
            if ((i2 == 2100 || i2 == 2400) && intent != null) {
                d030Var.m0(d030Var.q0(intent));
                return;
            }
            return;
        }
        if (intExtra == 1300) {
            if (i2 != 2100 || intent == null) {
                return;
            }
            d030Var.m0(d030Var.q0(intent));
            return;
        }
        String str = "";
        switch (intExtra) {
            case 1:
                if (i2 == -1) {
                    String stringExtra3 = intent != null ? intent.getStringExtra("save_value") : null;
                    stringExtra3.getClass();
                    d030Var.D = stringExtra3;
                    d030Var.n0().f.setRightText(d030Var.D);
                    d030Var.requireActivity().setResult(-1);
                }
                break;
            case 2:
                if (i2 == -1) {
                    if (intent != null && (stringExtra = intent.getStringExtra("save_value")) != null) {
                        str = stringExtra;
                    }
                    d030Var.E = str;
                    d030Var.n0().z.setRightText(d030Var.E);
                    d030Var.requireActivity().setResult(-1);
                }
                break;
            case 3:
                if (i2 == -1) {
                    d030Var.F = intent != null ? intent.getStringExtra("save_value") : null;
                    d030Var.requireActivity().setResult(-1);
                }
                break;
            case 4:
                if (i2 == -1) {
                    d030Var.G = intent != null ? intent.getStringExtra("save_value") : null;
                    d030Var.n0().O.setRightText(d030Var.G);
                    d030Var.n0().N.setText(d030Var.G);
                    d030Var.n0().N.setVisibility(0);
                    d030Var.requireActivity().setResult(-1);
                    soh.c.a.getAccountHelper().saveNickName(d030Var.G);
                }
                break;
            case 5:
                if (i2 == -1) {
                    d030Var.H = soh.c.a.getAccountHelper().getAvatarPath();
                    d030Var.requireActivity().setResult(-1);
                }
                break;
            case 6:
                if (i2 == -1) {
                    if (intent != null && (stringExtra2 = intent.getStringExtra("save_value")) != null) {
                        str = stringExtra2;
                    }
                    d030Var.n0().B.setRightText(p0(kotlin.text.c.p(str, ",", ", ", false)));
                    if (a8b.c().r()) {
                        List listH = new Regex(",").h(str);
                        if (listH.isEmpty()) {
                            collectionT0 = m2g.a;
                        } else {
                            ListIterator listIterator = listH.listIterator(listH.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    collectionT0 = m2g.a;
                                } else if (((String) listIterator.previous()).length() != 0) {
                                    collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                                }
                            }
                        }
                        String[] strArr = (String[]) collectionT0.toArray(new String[0]);
                        d030Var.I = strArr[0];
                        d030Var.J = strArr[1];
                    } else {
                        d030Var.I = str;
                        d030Var.J = null;
                    }
                    d030Var.requireActivity().setResult(-1);
                }
                break;
            case 7:
                if (i2 == -1) {
                    if (intent != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializableExtra = intent.getSerializableExtra("data", HashMap.class);
                        } else {
                            Object serializableExtra2 = intent.getSerializableExtra("data");
                            if (!(serializableExtra2 instanceof HashMap)) {
                                serializableExtra2 = null;
                            }
                            serializableExtra = (HashMap) serializableExtra2;
                        }
                        map = (HashMap) serializableExtra;
                    } else {
                        map = null;
                    }
                    if (map != null) {
                        vaf0 vaf0VarR0 = d030Var.r0();
                        ej5.c(o8i0.d(vaf0VarR0), null, null, new raf0(map, vaf0VarR0, null), 3);
                    }
                }
                break;
        }
    }

    public final void m0(String str) {
        if (this.P) {
            Intent intent = new Intent(requireContext(), (Class<?>) VerifiedInfoActivity.class);
            intent.putExtra("EXTRA_VERIFY_TOKEN", str);
            yrh0.s(requireContext(), intent, true);
            this.P = false;
        }
    }

    public final oui n0() {
        return (oui) this.f.a(this, S[0]);
    }

    public final psm o0() {
        psm psmVar = this.z;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    @Override // defpackage.w0m, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: sz20
            @Override // defpackage.ud
            public final void a(Object obj) {
                d030.u0(this.a, (ActivityResult) obj);
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.R = eeVarRegisterForActivityResult;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        iny onBackPressedDispatcher;
        view.getClass();
        if (view.equals(n0().c)) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.d();
            return;
        }
        if (view.equals(n0().O)) {
            Intent intent = new Intent(requireContext(), (Class<?>) ChangeUserInfoActivity.class);
            intent.putExtra("title_property", 0);
            intent.putExtra("key_name", this.G);
            intent.putExtra("requestCode", 4);
            ee<Intent> eeVar = this.R;
            if (eeVar != null) {
                eeVar.b(intent);
                return;
            } else {
                Intrinsics.n("activityResultLauncher");
                throw null;
            }
        }
        if (view.equals(n0().f)) {
            Intent intent2 = new Intent(requireContext(), (Class<?>) ChangeUserInfoActivity.class);
            intent2.putExtra("title_property", 1);
            intent2.putExtra("key_name", this.D);
            intent2.putExtra("requestCode", 1);
            ee<Intent> eeVar2 = this.R;
            if (eeVar2 != null) {
                eeVar2.b(intent2);
                return;
            } else {
                Intrinsics.n("activityResultLauncher");
                throw null;
            }
        }
        if (view.equals(n0().b)) {
            Intent intent3 = new Intent(requireContext(), (Class<?>) ChangeAvatarActivity.class);
            intent3.putExtra("prev_avatar", this.H);
            intent3.putExtra("requestCode", 5);
            ee<Intent> eeVar3 = this.R;
            if (eeVar3 == null) {
                Intrinsics.n("activityResultLauncher");
                throw null;
            }
            eeVar3.b(intent3);
            a230 a230VarS0 = s0();
            zu7.a aVar = zu7.a;
            ej5.c(zu7.a(), null, null, new x130(a230VarS0, null), 3);
            return;
        }
        if (view.equals(n0().z)) {
            Intent intent4 = new Intent(requireContext(), (Class<?>) ChangeUserInfoActivity.class);
            intent4.putExtra("title_property", 2);
            intent4.putExtra("key_name", this.E);
            intent4.putExtra("requestCode", 2);
            ee<Intent> eeVar4 = this.R;
            if (eeVar4 != null) {
                eeVar4.b(intent4);
                return;
            } else {
                Intrinsics.n("activityResultLauncher");
                throw null;
            }
        }
        if (view.equals(n0().B)) {
            Intent intent5 = new Intent(requireContext(), (Class<?>) ChangeLocationActivity.class);
            intent5.putExtra("state", this.I);
            intent5.putExtra("area", this.J);
            intent5.putExtra("requestCode", 6);
            ee<Intent> eeVar5 = this.R;
            if (eeVar5 != null) {
                eeVar5.b(intent5);
                return;
            } else {
                Intrinsics.n("activityResultLauncher");
                throw null;
            }
        }
        if (view.equals(n0().P)) {
            Boolean bool = this.Q;
            if (bool == null) {
                zyf0.c(1, sn5.d(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
                return;
            }
            if (bool.equals(Boolean.TRUE)) {
                this.P = true;
                m0("");
                return;
            }
            WithdrawalPinStatusInfo withdrawalPinStatusInfoD = ((tz00) this.v.getValue()).b.d();
            if (withdrawalPinStatusInfoD == null) {
                return;
            }
            this.P = true;
            if (withdrawalPinStatusInfoD.getSportyPinStatus() == SportyPinStatus.Disabled) {
                androidx.fragment.app.e eVarRequireActivity = requireActivity();
                eVarRequireActivity.getClass();
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                k8d0.a(eVarRequireActivity, childFragmentManager, false, null, 24);
                return;
            }
            Intent intent6 = new Intent(requireContext(), (Class<?>) WithdrawalPinActivity.class);
            intent6.putExtra("option", this.O);
            intent6.putExtra("EXTRA_TITLE", "Sporty PIN");
            intent6.putExtra("REQUEST_CODE", 1300);
            intent6.putExtra("isWithdrawing", false);
            intent6.putExtra("EXTRA_VERIFIED_USER", true);
            intent6.putExtra("requestCode", 1300);
            ee<Intent> eeVar6 = this.R;
            if (eeVar6 != null) {
                eeVar6.b(intent6);
            } else {
                Intrinsics.n("activityResultLauncher");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (a8b.c().w()) {
            tz00 tz00Var = (tz00) this.v.getValue();
            tz00Var.z.y1().G(new vz00(tz00Var));
        }
        a230 a230VarS0 = s0();
        kzh.d(new g1i(a230VarS0.e.a(pu0.c.a), new p130(a230VarS0, null)), o8i0.d(a230VarS0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Intent intent = requireActivity().getIntent();
        int i2 = 0;
        String str = "";
        if (intent != null) {
            String stringExtra = intent.getStringExtra("account_number");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.C = stringExtra;
            String stringExtra2 = intent.getStringExtra("first_name");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.D = stringExtra2;
            String stringExtra3 = intent.getStringExtra("last_name");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.E = stringExtra3;
            intent.getStringExtra("date_of_birth");
            this.F = intent.getStringExtra("email");
            this.G = intent.getStringExtra("user_name");
            this.H = intent.getStringExtra("avatar");
            String stringExtra4 = intent.getStringExtra("state");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            this.I = stringExtra4;
            this.J = intent.getStringExtra("area");
            intent.getStringExtra("phone");
            this.L = true;
            intent.getBooleanExtra("editableLastName", true);
            this.N = intent.getBooleanExtra("editableFirstName", true);
            this.M = intent.getBooleanExtra("editableFirstName", true);
            this.K = intent.getBooleanExtra("auto_open_email_edit", false);
            intent.removeExtra("auto_open_email_edit");
        }
        if (TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.F)) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.n("email or phone number is empty", new Object[0]);
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        int color = requireContext().getColor(R.color.brand_quaternary);
        ImageButton imageButton = n0().c;
        imageButton.setOnClickListener(this);
        Drawable drawableA = gr0.a(requireContext(), R.drawable.ic_action_bar_back);
        if (drawableA != null) {
            drawableA.mutate();
            drawableA.setTint(-1);
        }
        imageButton.setImageDrawable(drawableA);
        y8j y8jVar = this.y;
        if (y8jVar == null) {
            Intrinsics.n("fullStoryCommonManager");
            throw null;
        }
        y8jVar.d(n0().N, "fs-mask");
        n0().b.setOnClickListener(this);
        LineTextViewPanel lineTextViewPanel = n0().O;
        lineTextViewPanel.setRightTextFsPrivacyRule("fs-mask");
        lineTextViewPanel.setOnClickListener(this);
        if (!TextUtils.isEmpty(this.G)) {
            lineTextViewPanel.setRightColor(color);
            lineTextViewPanel.setRightText(this.G);
        }
        LineTextViewPanel lineTextViewPanel2 = n0().f;
        lineTextViewPanel2.setRightTextFsPrivacyRule("fs-mask");
        lineTextViewPanel2.setOnClickListener(this);
        LineTextViewPanel lineTextViewPanel3 = n0().z;
        lineTextViewPanel3.setRightTextFsPrivacyRule("fs-mask");
        lineTextViewPanel3.setOnClickListener(this);
        LineTextViewPanel lineTextViewPanel4 = n0().B;
        lineTextViewPanel4.setRightTextFsPrivacyRule("fs-mask");
        lineTextViewPanel4.setOnClickListener(this);
        if (TextUtils.isEmpty(this.I)) {
            lineTextViewPanel4.setRightColor(color);
            lineTextViewPanel4.setRightText(a8b.c().b);
        } else {
            lineTextViewPanel4.setRightColor(color);
            boolean zIsEmpty = TextUtils.isEmpty(this.J);
            String str2 = this.I;
            if (zIsEmpty) {
                lineTextViewPanel4.setRightText(p0(str2));
            } else {
                lineTextViewPanel4.setRightText(p0(str2 + ", " + this.J));
            }
        }
        n0().P.setOnClickListener(this);
        n0().y.setOnClickListener(this);
        ypi.a(n0().d, new vz20(this, i2));
        final LoadingView loadingView = n0().A;
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: wz20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = d030.S;
                loadingView.K();
                d030 d030Var = this;
                if (d030Var.o0().r()) {
                    a230 a230VarS0 = d030Var.s0();
                    ej5.c(o8i0.d(a230VarS0), null, null, new r130(a230VarS0, null), 3);
                    a230 a230VarS1 = d030Var.s0();
                    ej5.c(o8i0.d(a230VarS1), null, null, new q130(a230VarS1, null), 3);
                }
            }
        });
        n0().G.setOnClickListener(new View.OnClickListener() { // from class: xz20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = d030.S;
                d030 d030Var = this.a;
                d030Var.n0().G.K();
                a230 a230VarS0 = d030Var.s0();
                kzh.d(new g1i(a230VarS0.e.a(pu0.c.a), new p130(a230VarS0, null)), o8i0.d(a230VarS0));
            }
        });
        oui ouiVarN0 = n0();
        TextView textView = ouiVarN0.N;
        ConstraintLayout constraintLayout = ouiVarN0.w;
        View view2 = ouiVarN0.M;
        LineTextViewPanel lineTextViewPanel5 = ouiVarN0.e;
        String str3 = this.G;
        if (str3 != null && str3.length() > 0) {
            str = this.G;
        } else if (o0().b0()) {
            str = this.F;
        }
        textView.setText(str);
        CharSequence text = textView.getText();
        text.getClass();
        textView.setVisibility(text.length() > 0 ? 0 : 8);
        ouiVarN0.P.setVisibility(o0().W() ? 0 : 8);
        lineTextViewPanel5.setVisibility(o0().b0() ? 0 : 8);
        ouiVarN0.K.setVisibility(!o0().b0() ? 0 : 8);
        if (o0().b0()) {
            lineTextViewPanel5.setLineTextEditable(this.F, false, 8);
            lineTextViewPanel5.setRightTextCheckedIndicator();
        }
        if (o0().r() && o0().V()) {
            ouiVarN0.B.setVisibility(8);
            view2.setVisibility(0);
            constraintLayout.setVisibility(0);
        } else {
            view2.setVisibility(8);
            constraintLayout.setVisibility(8);
        }
        v0();
        n0().i.setOnClickListener(new yz20());
        n0().C.setVisibility(qq1.a(s0().w, BOConfigParam.IsEnableCreateSocialPage, false) ? 0 : 8);
        if (o0().O()) {
            n0().F.setVisibility(8);
            n0().z.setLeftText(R.string.wap_profile__lastname__ZA);
        }
        c8i0.o(n0().B, o0().u());
        if (a8b.c().w()) {
            ((tz00) this.v.getValue()).b.f(getViewLifecycleOwner(), new c(new ifb(this, 2)));
        }
        if (o0().r()) {
            a230 a230VarS0 = s0();
            ej5.c(o8i0.d(a230VarS0), null, null, new r130(a230VarS0, null), 3);
            a230 a230VarS1 = s0();
            ej5.c(o8i0.d(a230VarS1), null, null, new q130(a230VarS1, null), 3);
        }
        s9s.b bVar = s9s.b.a;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new b(this, null, this), 3);
    }

    public final String q0(Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_VERIFY_TOKEN");
        if (stringExtra != null) {
            return stringExtra;
        }
        if (this.B != null) {
            return nel.a(String.valueOf(intent.getStringExtra("EXTRA_FINGERPRINT_TOKEN")));
        }
        Intrinsics.n("hashFingerprintTokenUseCase");
        throw null;
    }

    public final vaf0 r0() {
        return (vaf0) this.w.getValue();
    }

    public final a230 s0() {
        return (a230) this.i.getValue();
    }

    public final void t0(EmailChangeConfigResponse emailChangeConfigResponse, boolean z) {
        if (z) {
            if (emailChangeConfigResponse.getMainSwitchEnabled()) {
                s0().x1(hz20.a.a);
                return;
            }
            return;
        }
        Intent intent = new Intent(requireContext(), (Class<?>) ChangeUserInfoActivity.class);
        intent.putExtra("title_property", 5);
        intent.putExtra("key_name", this.F);
        intent.putExtra("requestCode", 3);
        ee<Intent> eeVar = this.R;
        if (eeVar != null) {
            eeVar.b(intent);
        } else {
            Intrinsics.n("activityResultLauncher");
            throw null;
        }
    }

    public final void v0() {
        int color = requireContext().getColor(R.color.brand_quaternary);
        if (!TextUtils.isEmpty(this.D)) {
            n0().f.setRightColor(color);
            n0().f.setRightText(this.D);
        }
        LineTextViewPanel lineTextViewPanel = n0().f;
        String str = this.D;
        boolean z = this.N;
        lineTextViewPanel.setLineTextEditable(str, z, 8);
        if (z) {
            lineTextViewPanel.setOnClickListener(this);
        } else {
            lineTextViewPanel.setOnClickListener(null);
        }
        if (!TextUtils.isEmpty(this.E)) {
            n0().z.setRightColor(color);
            n0().z.setRightText(this.E);
        }
        LineTextViewPanel lineTextViewPanel2 = n0().z;
        String str2 = this.E;
        boolean z2 = this.M;
        lineTextViewPanel2.setLineTextEditable(str2, z2, 8);
        if (z2) {
            lineTextViewPanel2.setOnClickListener(this);
        } else {
            lineTextViewPanel2.setOnClickListener(null);
        }
    }
}
