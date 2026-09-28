package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.widgets.SpecificCountryMobileEditText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.kyc.phonemigration.PhoneMigrateParams;
import com.sporty.android.platform.features.kyc.domain.phonemigrate.PhoneMigrateEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.api.model.BindNewPhoneResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lpj;", "Lp12;", "Lzux;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pj extends rll implements zux {
    public bc6 E;
    public ee<f0i0> F;
    public q900 f;
    public gbn i;
    public d0n v;
    public com.sporty.android.common.uievent.e w;
    public zui y;
    public final q8i0 z = new q8i0(jq40.a(dk.class), new b(), new d(), new c());
    public final q8i0 A = new q8i0(jq40.a(au7.class), new e(), new g(), new f());
    public final mpe0 B = hwr.b(new ij(this, 0));
    public final mpe0 C = hwr.b(new jj(this, 0));
    public final mpe0 D = hwr.b(new Function0() { // from class: kj
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return pj.n0(this.a);
        }
    });

    public static final class a {
        public static final void a(d7i d7iVar, FragmentManager fragmentManager, String str, Bundle bundle) {
            Object obj;
            bundle.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                obj = (Parcelable) bundle.getParcelable("RESULT_KEY_MIGRATE_PHONE", PhoneMigrateEvent.class);
            } else {
                Parcelable parcelable = bundle.getParcelable("RESULT_KEY_MIGRATE_PHONE");
                if (!(parcelable instanceof PhoneMigrateEvent)) {
                    parcelable = null;
                }
                obj = (PhoneMigrateEvent) parcelable;
            }
            Object obj2 = (PhoneMigrateEvent) obj;
            if (obj2 == null) {
                obj2 = PhoneMigrateEvent.Cancel.a;
            }
            d7iVar.invoke(obj2);
            fragmentManager.g("REQUEST_KEY_MIGRATE_PHONE");
            fragmentManager.f("RESULT_KEY_MIGRATE_PHONE");
        }

        public static final void b(Function1 function1, FragmentManager fragmentManager, String str, Bundle bundle) {
            bundle.getClass();
            BindNewPhoneResult bindNewPhoneResult = Build.VERSION.SDK_INT >= 33 ? (BindNewPhoneResult) bundle.getParcelable("RESULT_KEY_ADD_NEW_MOBILE_NUMBER", BindNewPhoneResult.class) : (BindNewPhoneResult) bundle.getParcelable("RESULT_KEY_ADD_NEW_MOBILE_NUMBER");
            if (bindNewPhoneResult == null) {
                bindNewPhoneResult = BindNewPhoneResult.Canceled.a;
            }
            function1.invoke(bindNewPhoneResult);
            fragmentManager.g("REQUEST_KEY_ADD_NEW_MOBILE_NUMBER");
            fragmentManager.f("RESULT_KEY_ADD_NEW_MOBILE_NUMBER");
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return pj.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return pj.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return pj.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return pj.this.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return pj.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return pj.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final j6c m0(pj pjVar) {
        Object serializable;
        Bundle arguments = pjVar.getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("ARG_CAPTCHA_ACTION", j6c.class);
            } else {
                Object serializable2 = arguments.getSerializable("ARG_CAPTCHA_ACTION");
                if (!(serializable2 instanceof j6c)) {
                    serializable2 = null;
                }
                serializable = (j6c) serializable2;
            }
            j6c j6cVar = (j6c) serializable;
            if (j6cVar != null) {
                return j6cVar;
            }
        }
        return j6c.INITIAL;
    }

    public static final bag n0(pj pjVar) {
        Object serializable;
        Bundle arguments = pjVar.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = arguments.getSerializable("ARG_ENTRANCE", bag.class);
        } else {
            Object serializable2 = arguments.getSerializable("ARG_ENTRANCE");
            serializable = (bag) (serializable2 instanceof bag ? serializable2 : null);
        }
        return (bag) serializable;
    }

    public static final PhoneMigrateParams p0(pj pjVar) {
        Parcelable parcelable;
        Bundle arguments = pjVar.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) arguments.getParcelable("ARG_PHONE_MIGRATE_PARAMS", PhoneMigrateParams.class);
        } else {
            Parcelable parcelable2 = arguments.getParcelable("ARG_PHONE_MIGRATE_PARAMS");
            parcelable = (PhoneMigrateParams) (parcelable2 instanceof PhoneMigrateParams ? parcelable2 : null);
        }
        return (PhoneMigrateParams) parcelable;
    }

    public final dk o0() {
        return (dk) this.z.getValue();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q900 q900Var = this.f;
        if (q900Var == null) {
            Intrinsics.n("paymentSecurityUtil");
            throw null;
        }
        ee<f0i0> eeVarRegisterForActivityResult = registerForActivityResult(q900Var.b(p900.a.C0964a.a), new ud() { // from class: hj
            @Override // defpackage.ud
            public final void a(Object obj) {
                l800 l800Var = (l800) obj;
                l800Var.getClass();
                bc6 bc6Var = this.a.E;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar = zi50.b;
                        bc6Var.resumeWith(l800Var);
                    } else {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_COMMON);
                        aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.F = eeVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        int iL;
        PhoneMigrateParams phoneMigrateParams;
        Parcelable parcelable;
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.fragment_add_new_mobile_number, (ViewGroup) null, false);
        int i2 = R.id.add_btn;
        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.add_btn, viewInflate);
        if (progressButton != null) {
            i2 = R.id.back_btn;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.back_btn, viewInflate);
            if (appCompatImageView != null) {
                i2 = R.id.bottom_pad_view;
                View viewA = h5e.a(R.id.bottom_pad_view, viewInflate);
                if (viewA != null) {
                    i2 = R.id.content_barrier;
                    if (((Barrier) h5e.a(R.id.content_barrier, viewInflate)) != null) {
                        i2 = R.id.desc_text_view;
                        TextView textView = (TextView) h5e.a(R.id.desc_text_view, viewInflate);
                        if (textView != null) {
                            i2 = R.id.guideline_begin;
                            if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                                i2 = R.id.guideline_end;
                                if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                    i2 = R.id.image_view;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.image_view, viewInflate);
                                    if (appCompatImageView2 != null) {
                                        i2 = R.id.mobile_edit_text;
                                        SpecificCountryMobileEditText specificCountryMobileEditText = (SpecificCountryMobileEditText) h5e.a(R.id.mobile_edit_text, viewInflate);
                                        if (specificCountryMobileEditText != null) {
                                            i2 = R.id.scroll_view;
                                            ScrollView scrollView = (ScrollView) h5e.a(R.id.scroll_view, viewInflate);
                                            if (scrollView != null) {
                                                i2 = R.id.section_cm;
                                                ComposeView composeView = (ComposeView) h5e.a(R.id.section_cm, viewInflate);
                                                if (composeView != null) {
                                                    i2 = R.id.section_default;
                                                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.section_default, viewInflate);
                                                    if (linearLayout != null) {
                                                        i2 = R.id.title_text_view;
                                                        if (((TextView) h5e.a(R.id.title_text_view, viewInflate)) != null) {
                                                            this.y = new zui((FrameLayout) viewInflate, progressButton, appCompatImageView, viewA, textView, appCompatImageView2, specificCountryMobileEditText, scrollView, composeView, linearLayout);
                                                            Dialog dialog = new Dialog(requireContext(), R.style.AppTheme);
                                                            dialog.requestWindowFeature(1);
                                                            zui zuiVar = this.y;
                                                            if (zuiVar == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            dialog.setContentView(zuiVar.a);
                                                            Window window = dialog.getWindow();
                                                            if (window != null) {
                                                                zui zuiVar2 = this.y;
                                                                if (zuiVar2 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                FrameLayout frameLayout = zuiVar2.a;
                                                                frameLayout.getClass();
                                                                window.setWindowAnimations(android.R.style.Animation.Activity);
                                                                WindowManager.LayoutParams attributes = window.getAttributes();
                                                                attributes.gravity = 16;
                                                                attributes.width = -1;
                                                                attributes.height = -1;
                                                                window.setAttributes(attributes);
                                                                if (Build.VERSION.SDK_INT >= 35) {
                                                                    ulf.a(window, requireContext().getColor(R.color.colorPrimaryDark), requireContext().getColor(R.color.background_general_primary), requireContext().getColor(R.color.absolute_type3), true, frameLayout);
                                                                }
                                                            }
                                                            PhoneMigrateParams phoneMigrateParams2 = (PhoneMigrateParams) this.C.getValue();
                                                            if (phoneMigrateParams2 != null) {
                                                                o0().e = phoneMigrateParams2;
                                                            }
                                                            o0().f = (bag) this.D.getValue();
                                                            zui zuiVar3 = this.y;
                                                            if (zuiVar3 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            ComposeView composeView2 = zuiVar3.w;
                                                            AppCompatImageView appCompatImageView3 = zuiVar3.c;
                                                            appCompatImageView3.setOnClickListener(new lj(this, 0));
                                                            boolean zV = o0().b.v();
                                                            mpe0 mpe0Var = this.B;
                                                            if (!zV || ((j6c) mpe0Var.getValue()) == j6c.MigratePhone) {
                                                                gbn gbnVar = this.i;
                                                                if (gbnVar == null) {
                                                                    Intrinsics.n("imageService");
                                                                    throw null;
                                                                }
                                                                zui zuiVar4 = this.y;
                                                                if (zuiVar4 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                gbnVar.a("https://s.sporty.net/cms/ig_add_number_8d3c76bfc5.png", zuiVar4.f);
                                                            } else {
                                                                zuiVar3.y.setVisibility(8);
                                                                composeView2.setVisibility(0);
                                                                mla.i(composeView2, xp8.b);
                                                                appCompatImageView3.setImageResource(R.drawable.cmn_ic_close_gray);
                                                                ViewGroup.LayoutParams layoutParams = appCompatImageView3.getLayoutParams();
                                                                FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                                                                if (layoutParams2 != null) {
                                                                    layoutParams2.gravity = 8388661;
                                                                }
                                                                zuiVar3.b.setButtonText(R.string.common_functions__next);
                                                            }
                                                            zui zuiVar5 = this.y;
                                                            if (zuiVar5 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            zuiVar5.i.setCallingCode(o0().b.M());
                                                            zui zuiVar6 = this.y;
                                                            if (zuiVar6 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            g1i g1iVar = new g1i(zuiVar6.i.getTextStateFlow(), new rj(this, null));
                                                            s9s lifecycle = getLifecycle();
                                                            lifecycle.getClass();
                                                            s9s.b bVar = s9s.b.d;
                                                            arr.a(g1iVar, lifecycle, bVar);
                                                            zui zuiVar7 = this.y;
                                                            if (zuiVar7 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            SpecificCountryMobileEditText specificCountryMobileEditText2 = zuiVar7.i;
                                                            psm psmVar = o0().b;
                                                            int i3 = dk.b.a[psmVar.getCountryCode().ordinal()];
                                                            if (i3 != 1) {
                                                                iL = i3 != 2 ? 10 : 9;
                                                            } else {
                                                                iL = psmVar.l();
                                                            }
                                                            specificCountryMobileEditText2.setMaxLength(iL);
                                                            zui zuiVar8 = this.y;
                                                            if (zuiVar8 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            g1i g1iVar2 = new g1i(new tj(zuiVar8.i.getFocusedStateFlow()), new sj(this, null));
                                                            s9s lifecycle2 = getLifecycle();
                                                            lifecycle2.getClass();
                                                            arr.a(g1iVar2, lifecycle2, bVar);
                                                            Bundle arguments = getArguments();
                                                            if (arguments != null) {
                                                                if (Build.VERSION.SDK_INT >= 33) {
                                                                    parcelable = (Parcelable) arguments.getParcelable("ARG_PHONE_MIGRATE_PARAMS", PhoneMigrateParams.class);
                                                                } else {
                                                                    Parcelable parcelable2 = arguments.getParcelable("ARG_PHONE_MIGRATE_PARAMS");
                                                                    if (!(parcelable2 instanceof PhoneMigrateParams)) {
                                                                        parcelable2 = null;
                                                                    }
                                                                    parcelable = (PhoneMigrateParams) parcelable2;
                                                                }
                                                                phoneMigrateParams = (PhoneMigrateParams) parcelable;
                                                            } else {
                                                                phoneMigrateParams = null;
                                                            }
                                                            if (phoneMigrateParams != null) {
                                                                zui zuiVar9 = this.y;
                                                                if (zuiVar9 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                zuiVar9.i.setText(phoneMigrateParams.getKycFailedUserPhone());
                                                                zui zuiVar10 = this.y;
                                                                if (zuiVar10 == null) {
                                                                    Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                zuiVar10.i.setEnabled(false);
                                                            }
                                                            zui zuiVar11 = this.y;
                                                            if (zuiVar11 == null) {
                                                                Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                            zuiVar11.b.setOnClickListener(new mj(this, i));
                                                            j6c j6cVar = (j6c) mpe0Var.getValue();
                                                            j6c j6cVar2 = j6c.MigratePhone;
                                                            q8i0 q8i0Var = this.A;
                                                            if (j6cVar == j6cVar2) {
                                                                ((au7) q8i0Var.getValue()).x1((j6c) mpe0Var.getValue());
                                                            } else {
                                                                ((au7) q8i0Var.getValue()).x1(j6c.BIND_PHONE_NEW);
                                                            }
                                                            dk dkVarO0 = o0();
                                                            Bundle arguments2 = getArguments();
                                                            dkVarO0.B = arguments2 != null ? arguments2.getString("ARG_PRIMARY_OTP_VERIFY_TOKEN") : null;
                                                            g1i g1iVar3 = new g1i(dkVarO0.A, new uj(this, null));
                                                            s9s lifecycle3 = getLifecycle();
                                                            lifecycle3.getClass();
                                                            arr.a(g1iVar3, lifecycle3, bVar);
                                                            g1i g1iVar4 = new g1i(dkVarO0.D, new vj(this, null));
                                                            s9s lifecycle4 = getLifecycle();
                                                            lifecycle4.getClass();
                                                            arr.a(g1iVar4, lifecycle4, bVar);
                                                            g1i g1iVar5 = new g1i(dkVarO0.F, new wj(this, null));
                                                            s9s lifecycle5 = getLifecycle();
                                                            lifecycle5.getClass();
                                                            arr.a(g1iVar5, lifecycle5, bVar);
                                                            g1i g1iVar6 = new g1i(dkVarO0.H, new xj(this, null));
                                                            s9s lifecycle6 = getLifecycle();
                                                            lifecycle6.getClass();
                                                            arr.a(g1iVar6, lifecycle6, bVar);
                                                            g1i g1iVar7 = new g1i(dkVarO0.J, new yj(this, null));
                                                            s9s lifecycle7 = getLifecycle();
                                                            lifecycle7.getClass();
                                                            arr.a(g1iVar7, lifecycle7, bVar);
                                                            g1i g1iVar8 = new g1i(dkVarO0.w, new zj(this, null));
                                                            s9s lifecycle8 = getLifecycle();
                                                            lifecycle8.getClass();
                                                            arr.a(g1iVar8, lifecycle8, bVar);
                                                            g1i g1iVar9 = new g1i(o0().z, new qj(this, null));
                                                            s9s lifecycle9 = getLifecycle();
                                                            lifecycle9.getClass();
                                                            arr.a(g1iVar9, lifecycle9, bVar);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.sporty.android.common.uievent.e eVar = this.w;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        eVar.a();
        super.onDestroy();
    }
}
