package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.sportyherov2.remote.models.FairnessResponse;
import com.sportygames.sportyherov2.remote.models.ProvablySettingRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ov80 extends Dialog {
    public e a;
    public c28 b;
    public ibs c;
    public ehq d;
    public fhq e;
    public Boolean f;
    public f730 i;
    public String v;
    public boolean w;
    public String y;
    public c6j0 z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
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

    public final f730 a() {
        f730 f730Var = this.i;
        if (f730Var != null) {
            return f730Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final void b(boolean z) {
        if (z) {
            a().E.setChecked(true);
            a().A.setChecked(false);
        } else {
            a().E.setChecked(false);
            a().A.setChecked(true);
        }
    }

    public final void c(boolean z) {
        if (z) {
            a().i.setVisibility(8);
            return;
        }
        a().z.setVisibility(0);
        a().i.setVisibility(0);
        a().K.setImageDrawable(this.a.getDrawable(R.drawable.edit_pencil));
        a().f.setAlpha(0.5f);
        a().f.setFocusable(false);
        a().e.setVisibility(8);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c28 c28Var = this.b;
        ssw<LoadingState<HTTPResponse<FairnessResponse>>> sswVar = c28Var.i;
        ibs ibsVar = this.c;
        sswVar.l(ibsVar);
        c28Var.v.l(ibsVar);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ibs ibsVar = this.c;
        e eVar = this.a;
        c28 c28Var = this.b;
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.provably_fair_settings_v2, (ViewGroup) null, false);
        int i2 = R.id.client_seed_image;
        if (((AppCompatImageView) h5e.a(R.id.client_seed_image, viewInflate)) != null) {
            i2 = R.id.client_seed_sec_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.client_seed_sec_text, viewInflate);
            if (appCompatTextView != null) {
                i2 = R.id.client_seed_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.client_seed_text, viewInflate);
                if (appCompatTextView2 != null) {
                    i2 = R.id.close;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) h5e.a(R.id.close, viewInflate);
                    if (floatingActionButton != null) {
                        i2 = R.id.cross;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.cross, viewInflate);
                        if (appCompatImageView != null) {
                            i2 = R.id.current;
                            EditText editText = (EditText) h5e.a(R.id.current, viewInflate);
                            if (editText != null) {
                                i2 = R.id.current_colon;
                                if (((AppCompatTextView) h5e.a(R.id.current_colon, viewInflate)) != null) {
                                    i2 = R.id.current_layout;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.current_layout, viewInflate);
                                    if (constraintLayout != null) {
                                        i2 = R.id.current_text;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.current_text, viewInflate);
                                        if (appCompatTextView3 != null) {
                                            i2 = R.id.game_limit_container;
                                            CardView cardView = (CardView) h5e.a(R.id.game_limit_container, viewInflate);
                                            if (cardView != null) {
                                                i2 = R.id.generated_text;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.generated_text, viewInflate);
                                                if (appCompatTextView4 != null) {
                                                    i2 = R.id.manual_layout;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.manual_layout, viewInflate);
                                                    if (constraintLayout2 != null) {
                                                        i2 = R.id.manual_radio;
                                                        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) h5e.a(R.id.manual_radio, viewInflate);
                                                        if (appCompatRadioButton != null) {
                                                            i2 = R.id.manual_text;
                                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) h5e.a(R.id.manual_text, viewInflate);
                                                            if (appCompatTextView5 != null) {
                                                                i2 = R.id.provably_fair_text;
                                                                TextView textView = (TextView) h5e.a(R.id.provably_fair_text, viewInflate);
                                                                if (textView != null) {
                                                                    i2 = R.id.random_layout;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.random_layout, viewInflate);
                                                                    if (constraintLayout3 != null) {
                                                                        i2 = R.id.random_radio;
                                                                        AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) h5e.a(R.id.random_radio, viewInflate);
                                                                        if (appCompatRadioButton2 != null) {
                                                                            i2 = R.id.random_text;
                                                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) h5e.a(R.id.random_text, viewInflate);
                                                                            if (appCompatTextView6 != null) {
                                                                                i2 = R.id.server_seed;
                                                                                AppCompatTextView appCompatTextView7 = (AppCompatTextView) h5e.a(R.id.server_seed, viewInflate);
                                                                                if (appCompatTextView7 != null) {
                                                                                    i2 = R.id.server_seed_image;
                                                                                    if (((AppCompatImageView) h5e.a(R.id.server_seed_image, viewInflate)) != null) {
                                                                                        i2 = R.id.server_seed_text;
                                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) h5e.a(R.id.server_seed_text, viewInflate);
                                                                                        if (appCompatTextView8 != null) {
                                                                                            i2 = R.id.spacer;
                                                                                            View viewA = h5e.a(R.id.spacer, viewInflate);
                                                                                            if (viewA != null) {
                                                                                                i2 = R.id.text;
                                                                                                TextView textView2 = (TextView) h5e.a(R.id.text, viewInflate);
                                                                                                if (textView2 != null) {
                                                                                                    i2 = R.id.tick;
                                                                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.tick, viewInflate);
                                                                                                    if (appCompatImageView2 != null) {
                                                                                                        i2 = R.id.view;
                                                                                                        View viewA2 = h5e.a(R.id.view, viewInflate);
                                                                                                        if (viewA2 != null) {
                                                                                                            i2 = R.id.view1;
                                                                                                            View viewA3 = h5e.a(R.id.view1, viewInflate);
                                                                                                            if (viewA3 != null) {
                                                                                                                i2 = R.id.what_provably;
                                                                                                                TextView textView3 = (TextView) h5e.a(R.id.what_provably, viewInflate);
                                                                                                                if (textView3 != null) {
                                                                                                                    this.i = new f730((ConstraintLayout) viewInflate, appCompatTextView, appCompatTextView2, floatingActionButton, appCompatImageView, editText, constraintLayout, appCompatTextView3, cardView, appCompatTextView4, constraintLayout2, appCompatRadioButton, appCompatTextView5, textView, constraintLayout3, appCompatRadioButton2, appCompatTextView6, appCompatTextView7, appCompatTextView8, viewA, textView2, appCompatImageView2, viewA2, viewA3, textView3);
                                                                                                                    setContentView(a().a);
                                                                                                                    a().z.setPadding(0, 0, 0, 0);
                                                                                                                    int i3 = 1;
                                                                                                                    b(true);
                                                                                                                    c(true);
                                                                                                                    String string = eVar.getString(R.string.next_round);
                                                                                                                    string.getClass();
                                                                                                                    c28Var.y1(string);
                                                                                                                    c28Var.i.f(ibsVar, new b(new Function1() { // from class: hv80
                                                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                                                        public final Object invoke(Object obj) {
                                                                                                                            FairnessResponse fairnessResponse;
                                                                                                                            LoadingState loadingState = (LoadingState) obj;
                                                                                                                            int i4 = ov80.a.a[loadingState.getStatus().ordinal()];
                                                                                                                            if (i4 == 1) {
                                                                                                                                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                                                                                                                                if (hTTPResponse != null && (fairnessResponse = (FairnessResponse) hTTPResponse.getData()) != null) {
                                                                                                                                    ov80 ov80Var = this.a;
                                                                                                                                    ov80Var.a().f.setText(fairnessResponse.getClientSeed());
                                                                                                                                    ov80Var.a().G.setText(fairnessResponse.getServerSeed());
                                                                                                                                    if (fairnessResponse.getClientSeed() != null) {
                                                                                                                                        ov80Var.v = fairnessResponse.getClientSeed();
                                                                                                                                    }
                                                                                                                                    if (fairnessResponse.getSeedRandom() != null) {
                                                                                                                                        ov80Var.b(fairnessResponse.getSeedRandom().booleanValue());
                                                                                                                                        ov80Var.c(fairnessResponse.getSeedRandom().booleanValue());
                                                                                                                                        ov80Var.w = fairnessResponse.getSeedRandom().booleanValue();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else if (i4 != 2 && i4 != 3) {
                                                                                                                                uhc.a();
                                                                                                                                return null;
                                                                                                                            }
                                                                                                                            return Unit.a;
                                                                                                                        }
                                                                                                                    }));
                                                                                                                    c28Var.v.f(ibsVar, new b(new uer(this, i3)));
                                                                                                                    if (Intrinsics.g(this.f, Boolean.FALSE)) {
                                                                                                                        a().z.setVisibility(8);
                                                                                                                        a().D.setVisibility(8);
                                                                                                                        a().I.setVisibility(0);
                                                                                                                        a().b.setTag(eVar.getString(R.string.seed_info_v2_revamp_cms));
                                                                                                                        ViewGroup.LayoutParams layoutParams = a().w.getLayoutParams();
                                                                                                                        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                                                                                                                        if (layoutParams2 != null) {
                                                                                                                            layoutParams2.S = 0.64f;
                                                                                                                        }
                                                                                                                        a().w.setLayoutParams(layoutParams2);
                                                                                                                        ViewGroup.LayoutParams layoutParams3 = a().I.getLayoutParams();
                                                                                                                        ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
                                                                                                                        if (layoutParams4 != null) {
                                                                                                                            layoutParams4.S = 0.07f;
                                                                                                                        }
                                                                                                                        a().I.setLayoutParams(layoutParams4);
                                                                                                                    } else {
                                                                                                                        a().z.setVisibility(0);
                                                                                                                        a().D.setVisibility(0);
                                                                                                                        a().I.setVisibility(8);
                                                                                                                        a().b.setTag(eVar.getString(R.string.seed_info_revamp_cms));
                                                                                                                        ViewGroup.LayoutParams layoutParams5 = a().w.getLayoutParams();
                                                                                                                        ConstraintLayout.LayoutParams layoutParams6 = layoutParams5 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams5 : null;
                                                                                                                        if (layoutParams6 != null) {
                                                                                                                            layoutParams6.S = 0.71f;
                                                                                                                        }
                                                                                                                        a().w.setLayoutParams(layoutParams6);
                                                                                                                    }
                                                                                                                    a().N.setPaintFlags(a().N.getPaintFlags() | 8);
                                                                                                                    a().N.setOnClickListener(new wu80(this, i));
                                                                                                                    a().d.setOnClickListener(new View.OnClickListener() { // from class: av80
                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                        public final void onClick(View view) {
                                                                                                                            this.a.dismiss();
                                                                                                                            wz.a("popup_action", "Sporty Hero", "provably fair setting", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                                                                                                                        }
                                                                                                                    });
                                                                                                                    a().K.setOnClickListener(new wi40(this, i3));
                                                                                                                    a().E.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cv80
                                                                                                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                                                                                                            compoundButton.getClass();
                                                                                                                            if (z) {
                                                                                                                                ov80 ov80Var = this.a;
                                                                                                                                if (((Boolean) ov80Var.d.invoke()).booleanValue()) {
                                                                                                                                    ov80Var.a().A.setChecked(false);
                                                                                                                                    ov80Var.e.invoke();
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                ProvablySettingRequest provablySettingRequest = new ProvablySettingRequest(true, null);
                                                                                                                                c28 c28Var2 = ov80Var.b;
                                                                                                                                c28Var2.getClass();
                                                                                                                                ej5.c(o8i0.d(c28Var2), null, null, new k28(c28Var2, provablySettingRequest, null), 3);
                                                                                                                                ov80Var.a().i.setVisibility(8);
                                                                                                                                ov80Var.a().z.setPadding(0, 0, 0, 0);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    a().A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ev80
                                                                                                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                                                                                                            compoundButton.getClass();
                                                                                                                            if (z) {
                                                                                                                                ov80 ov80Var = this.a;
                                                                                                                                ov80Var.y = ov80Var.a().f.getText().toString();
                                                                                                                                ov80Var.b(false);
                                                                                                                                ov80Var.a().z.setVisibility(0);
                                                                                                                                ov80Var.a().i.setVisibility(0);
                                                                                                                                ov80Var.a().e.setVisibility(0);
                                                                                                                                ov80Var.a().f.setAlpha(1.0f);
                                                                                                                                ov80Var.a().f.setFocusable(true);
                                                                                                                                ov80Var.a().f.setFocusableInTouchMode(true);
                                                                                                                                ov80Var.a().K.setImageDrawable(ov80Var.a.getDrawable(R.drawable.tick));
                                                                                                                                ov80Var.a().f.clearFocus();
                                                                                                                                ov80Var.a().z.setPadding(0, 0, 0, 50);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    });
                                                                                                                    a().e.setOnClickListener(new wmm(this, i3));
                                                                                                                    op5.r(op5.a, kotlin.collections.b.f(a().J, a().C, a().N, a().c, a().b, a().F, a().B, a().v, a().H, a().y), null, 4);
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
    }

    @Override // android.app.Dialog
    public final void onStop() {
        c6j0 c6j0Var;
        super.onStop();
        c6j0 c6j0Var2 = this.z;
        if (c6j0Var2 == null || !c6j0Var2.isShowing() || (c6j0Var = this.z) == null) {
            return;
        }
        c6j0Var.dismiss();
    }
}
