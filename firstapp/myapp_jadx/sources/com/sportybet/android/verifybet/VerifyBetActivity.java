package com.sportybet.android.verifybet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.verifybet.VerifyBetActivity;
import com.sportybet.android.widget.ProgressButton;
import com.twilio.voice.EventKeys;
import defpackage.bmy;
import defpackage.ce;
import defpackage.cq40;
import defpackage.cyb;
import defpackage.df;
import defpackage.ee;
import defpackage.gbn;
import defpackage.h5e;
import defpackage.haj;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.myh0;
import defpackage.nyh0;
import defpackage.paj;
import defpackage.pyh0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rks;
import defpackage.sks;
import defpackage.tyh0;
import defpackage.ud;
import defpackage.v8i0;
import defpackage.x6m;
import defpackage.y75;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/verifybet/VerifyBetActivity;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class VerifyBetActivity extends x6m {
    public static final /* synthetic */ int f = 0;
    public df b;
    public final q8i0 c = new q8i0(jq40.a(tyh0.class), new c(), new b(), new d());
    public gbn d;
    public ee<Intent> e;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements lfy, paj {
        public final /* synthetic */ myh0 a;

        public a(myh0 myh0Var) {
            this.a = myh0Var;
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return VerifyBetActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return VerifyBetActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return VerifyBetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_verify_bet, (ViewGroup) null, false);
        int i = R.id.back_icon;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back_icon, viewInflate);
        if (imageButton != null) {
            i = R.id.back_title;
            TextView textView = (TextView) h5e.a(R.id.back_title, viewInflate);
            if (textView != null) {
                i = R.id.btn_verify_code;
                ProgressButton progressButton = (ProgressButton) h5e.a(R.id.btn_verify_code, viewInflate);
                if (progressButton != null) {
                    i = R.id.close_invalid;
                    ImageView imageView = (ImageView) h5e.a(R.id.close_invalid, viewInflate);
                    if (imageView != null) {
                        i = R.id.hint_content_1;
                        TextView textView2 = (TextView) h5e.a(R.id.hint_content_1, viewInflate);
                        if (textView2 != null) {
                            i = R.id.hint_content_2;
                            TextView textView3 = (TextView) h5e.a(R.id.hint_content_2, viewInflate);
                            if (textView3 != null) {
                                i = R.id.hint_image;
                                ImageView imageView2 = (ImageView) h5e.a(R.id.hint_image, viewInflate);
                                if (imageView2 != null) {
                                    i = R.id.hint_title;
                                    TextView textView4 = (TextView) h5e.a(R.id.hint_title, viewInflate);
                                    if (textView4 != null) {
                                        i = R.id.home_icon;
                                        ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home_icon, viewInflate);
                                        if (imageButton2 != null) {
                                            i = R.id.ic_invalid;
                                            if (((ImageView) h5e.a(R.id.ic_invalid, viewInflate)) != null) {
                                                i = R.id.input_error;
                                                TextView textView5 = (TextView) h5e.a(R.id.input_error, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.invalid_container;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.invalid_container, viewInflate);
                                                    if (constraintLayout != null) {
                                                        i = R.id.invalid_content_1;
                                                        if (((TextView) h5e.a(R.id.invalid_content_1, viewInflate)) != null) {
                                                            i = R.id.invalid_content_2;
                                                            if (((TextView) h5e.a(R.id.invalid_content_2, viewInflate)) != null) {
                                                                i = R.id.invalid_title;
                                                                if (((TextView) h5e.a(R.id.invalid_title, viewInflate)) != null) {
                                                                    i = R.id.title_bar;
                                                                    if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                                                        i = R.id.verify_code_input;
                                                                        ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.verify_code_input, viewInflate);
                                                                        if (clearEditText != null) {
                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                                            this.b = new df(constraintLayout2, imageButton, textView, progressButton, imageView, textView2, textView3, imageView2, textView4, imageButton2, textView5, constraintLayout, clearEditText);
                                                                            setContentView(constraintLayout2);
                                                                            df dfVar = this.b;
                                                                            if (dfVar == null) {
                                                                                Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                            ProgressButton progressButton2 = dfVar.d;
                                                                            ClearEditText clearEditText2 = dfVar.B;
                                                                            dfVar.y.setOnClickListener(new nyh0());
                                                                            dfVar.c.setText(getCMSString(R.string.verify_bet__verify_bet, new Object[0]));
                                                                            progressButton2.setLoadingText(getCMSString(R.string.common_functions__submitting, new Object[0]));
                                                                            dfVar.w.setText(getCMSString(R.string.verify_bet__intro_title, new Object[0]));
                                                                            dfVar.f.setText(getCMSString(R.string.verify_bet__intro_content_1, new Object[0]));
                                                                            dfVar.i.setText(getCMSString(R.string.verify_bet__intro_content_2, new Object[0]));
                                                                            progressButton2.setOnClickListener(new pyh0(new cq40(), this, dfVar));
                                                                            dfVar.b.setOnClickListener(new View.OnClickListener() { // from class: oyh0
                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view) {
                                                                                    int i2 = VerifyBetActivity.f;
                                                                                    this.a.finish();
                                                                                }
                                                                            });
                                                                            progressButton2.setEnabled(false);
                                                                            clearEditText2.setErrorView(dfVar.z);
                                                                            clearEditText2.setTextChangedListener(new rks(dfVar));
                                                                            int i2 = 1;
                                                                            dfVar.e.setOnClickListener(new sks(dfVar, i2));
                                                                            gbn gbnVar = this.d;
                                                                            if (gbnVar == null) {
                                                                                Intrinsics.n("imageService");
                                                                                throw null;
                                                                            }
                                                                            gbnVar.a(getCMSString(R.string.verify_bet__hint_image_url, new Object[0]), dfVar.v);
                                                                            String stringExtra = getIntent().getStringExtra(EventKeys.ERROR_CODE);
                                                                            if (stringExtra != null) {
                                                                                clearEditText2.setText(stringExtra);
                                                                                getAccountHelper().demandAccount(this, new y75(this, String.valueOf(clearEditText2.getText()), i2));
                                                                                Unit unit = Unit.a;
                                                                            }
                                                                            df dfVar2 = this.b;
                                                                            if (dfVar2 == null) {
                                                                                Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                            ((tyh0) this.c.getValue()).f.f(this, new a(new myh0(dfVar2, this)));
                                                                            this.e = registerForActivityResult(new ce(), new ud() { // from class: lyh0
                                                                                @Override // defpackage.ud
                                                                                public final void a(Object obj) {
                                                                                    ActivityResult activityResult = (ActivityResult) obj;
                                                                                    int i3 = VerifyBetActivity.f;
                                                                                    activityResult.getClass();
                                                                                    if (activityResult.a == 1) {
                                                                                        df dfVar3 = this.a.b;
                                                                                        if (dfVar3 != null) {
                                                                                            dfVar3.B.setText("");
                                                                                        } else {
                                                                                            Intrinsics.n("binding");
                                                                                            throw null;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            });
                                                                            return;
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
        bmy.a(siPCzPFw.eTKbQGHQr.concat(viewInflate.getResources().getResourceName(i)));
    }
}
