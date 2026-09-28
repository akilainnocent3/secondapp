package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
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
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.pingpong.remote.models.FairnessResponse;
import com.sportygames.pingpong.remote.models.ProvablySettingRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class nv80 extends Dialog {
    public e a;
    public y720 b;
    public ibs c;
    public b410 d;
    public c410 e;
    public Boolean f;
    public g820 i;
    public String v;
    public boolean w;
    public String y;

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

    public final void a() {
        e eVar = this.a;
        if (eVar != null) {
            Object systemService = eVar.getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(b().f.getWindowToken(), 0);
        }
    }

    public final g820 b() {
        g820 g820Var = this.i;
        if (g820Var != null) {
            return g820Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final void c(boolean z) {
        if (z) {
            b().E.setChecked(true);
            b().A.setChecked(false);
        } else {
            b().E.setChecked(false);
            b().A.setChecked(true);
        }
    }

    public final void d(boolean z) {
        if (z) {
            b().i.setVisibility(8);
            return;
        }
        b().z.setVisibility(0);
        b().i.setVisibility(0);
        b().J.setImageDrawable(this.a.getDrawable(R.drawable.edit_pencil));
        b().f.setAlpha(0.5f);
        b().f.setFocusable(false);
        b().e.setVisibility(8);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        y720 y720Var = this.b;
        ssw<LoadingState<HTTPResponse<FairnessResponse>>> sswVar = y720Var.f;
        ibs ibsVar = this.c;
        sswVar.l(ibsVar);
        y720Var.i.l(ibsVar);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ibs ibsVar = this.c;
        y720 y720Var = this.b;
        e eVar = this.a;
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.pp_provably_fair_settings, (ViewGroup) null, false);
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
                                                                                            i2 = R.id.text;
                                                                                            TextView textView2 = (TextView) h5e.a(R.id.text, viewInflate);
                                                                                            if (textView2 != null) {
                                                                                                i2 = R.id.tick;
                                                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.tick, viewInflate);
                                                                                                if (appCompatImageView2 != null) {
                                                                                                    i2 = R.id.view;
                                                                                                    View viewA = h5e.a(R.id.view, viewInflate);
                                                                                                    if (viewA != null) {
                                                                                                        i2 = R.id.view1;
                                                                                                        View viewA2 = h5e.a(R.id.view1, viewInflate);
                                                                                                        if (viewA2 != null) {
                                                                                                            i2 = R.id.what_provably;
                                                                                                            TextView textView3 = (TextView) h5e.a(R.id.what_provably, viewInflate);
                                                                                                            if (textView3 != null) {
                                                                                                                this.i = new g820((ConstraintLayout) viewInflate, appCompatTextView, appCompatTextView2, floatingActionButton, appCompatImageView, editText, constraintLayout, appCompatTextView3, cardView, appCompatTextView4, constraintLayout2, appCompatRadioButton, appCompatTextView5, textView, constraintLayout3, appCompatRadioButton2, appCompatTextView6, appCompatTextView7, appCompatTextView8, textView2, appCompatImageView2, viewA, viewA2, textView3);
                                                                                                                setContentView(b().a);
                                                                                                                c(true);
                                                                                                                d(true);
                                                                                                                String string = eVar.getString(R.string.next_round);
                                                                                                                string.getClass();
                                                                                                                y720Var.y1(string);
                                                                                                                y720Var.f.f(ibsVar, new b(new Function1() { // from class: jv80
                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                        FairnessResponse fairnessResponse;
                                                                                                                        LoadingState loadingState = (LoadingState) obj;
                                                                                                                        int i3 = nv80.a.a[loadingState.getStatus().ordinal()];
                                                                                                                        if (i3 == 1) {
                                                                                                                            HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                                                                                                                            if (hTTPResponse != null && (fairnessResponse = (FairnessResponse) hTTPResponse.getData()) != null) {
                                                                                                                                nv80 nv80Var = this.a;
                                                                                                                                nv80Var.b().f.setText(fairnessResponse.getClientSeed());
                                                                                                                                nv80Var.b().G.setText(fairnessResponse.getServerSeed());
                                                                                                                                if (fairnessResponse.getClientSeed() != null) {
                                                                                                                                    nv80Var.v = fairnessResponse.getClientSeed();
                                                                                                                                }
                                                                                                                                if (fairnessResponse.getSeedRandom() != null) {
                                                                                                                                    nv80Var.c(fairnessResponse.getSeedRandom().booleanValue());
                                                                                                                                    nv80Var.d(fairnessResponse.getSeedRandom().booleanValue());
                                                                                                                                    nv80Var.w = fairnessResponse.getSeedRandom().booleanValue();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else if (i3 != 2 && i3 != 3) {
                                                                                                                            uhc.a();
                                                                                                                            return null;
                                                                                                                        }
                                                                                                                        return Unit.a;
                                                                                                                    }
                                                                                                                }));
                                                                                                                y720Var.i.f(ibsVar, new b(new iv80(this, i)));
                                                                                                                Boolean bool = this.f;
                                                                                                                if (bool == null || bool.equals(Boolean.FALSE)) {
                                                                                                                    b().z.setVisibility(8);
                                                                                                                    b().D.setVisibility(8);
                                                                                                                    b().b.setTag(eVar.getString(R.string.seed_info_cms));
                                                                                                                    b().w.getLayoutParams().height = (int) (((double) eVar.getResources().getDisplayMetrics().heightPixels) * 0.58d);
                                                                                                                } else {
                                                                                                                    b().z.setVisibility(0);
                                                                                                                    b().D.setVisibility(0);
                                                                                                                    b().b.setTag(eVar.getString(R.string.seed_info_cms));
                                                                                                                    b().w.getLayoutParams().height = (int) (((double) eVar.getResources().getDisplayMetrics().heightPixels) * 0.7d);
                                                                                                                }
                                                                                                                b().M.setPaintFlags(b().M.getPaintFlags() | 8);
                                                                                                                b().M.setOnClickListener(new View.OnClickListener() { // from class: xu80
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        nv80 nv80Var = this.a;
                                                                                                                        d6j0 d6j0Var = new d6j0(nv80Var.a);
                                                                                                                        d6j0Var.a();
                                                                                                                        d6j0Var.setOnDismissListener(new lv80());
                                                                                                                        nv80Var.dismiss();
                                                                                                                    }
                                                                                                                });
                                                                                                                b().d.setOnClickListener(new vi40(this, 1));
                                                                                                                b().J.setOnClickListener(new View.OnClickListener() { // from class: bv80
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        nv80 nv80Var = this.a;
                                                                                                                        if (nv80Var.b().e.getVisibility() == 8) {
                                                                                                                            nv80Var.b().e.setVisibility(0);
                                                                                                                            nv80Var.b().f.setAlpha(1.0f);
                                                                                                                            nv80Var.b().f.setFocusableInTouchMode(true);
                                                                                                                            nv80Var.b().f.setFocusable(true);
                                                                                                                            nv80Var.b().f.requestFocus();
                                                                                                                            nv80Var.b().J.setImageDrawable(nv80Var.a.getDrawable(R.drawable.tick));
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (((Boolean) nv80Var.d.invoke()).booleanValue()) {
                                                                                                                            nv80Var.e.invoke();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (!Intrinsics.g(nv80Var.v, nv80Var.b().f.getText().toString()) || nv80Var.w) {
                                                                                                                            nv80Var.b().f.clearFocus();
                                                                                                                            ProvablySettingRequest provablySettingRequest = new ProvablySettingRequest(false, nv80Var.b().f.getText().toString());
                                                                                                                            y720 y720Var2 = nv80Var.b;
                                                                                                                            y720Var2.getClass();
                                                                                                                            ej5.c(o8i0.d(y720Var2), null, null, new c820(y720Var2, provablySettingRequest, null), 3);
                                                                                                                        } else {
                                                                                                                            nv80Var.d(false);
                                                                                                                        }
                                                                                                                        nv80Var.y = nv80Var.b().f.getText().toString();
                                                                                                                        nv80Var.a();
                                                                                                                    }
                                                                                                                });
                                                                                                                b().e.setOnClickListener(new View.OnClickListener() { // from class: dv80
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        nv80 nv80Var = this.a;
                                                                                                                        nv80Var.b().e.setVisibility(8);
                                                                                                                        nv80Var.b().J.setImageDrawable(nv80Var.a.getDrawable(R.drawable.edit_pencil));
                                                                                                                        nv80Var.b().f.setAlpha(0.5f);
                                                                                                                        nv80Var.b().f.setFocusable(false);
                                                                                                                        nv80Var.b().f.setFocusableInTouchMode(false);
                                                                                                                        nv80Var.b().f.setText(nv80Var.y);
                                                                                                                        nv80Var.a();
                                                                                                                    }
                                                                                                                });
                                                                                                                b().E.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fv80
                                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                                                                                                        compoundButton.getClass();
                                                                                                                        if (z) {
                                                                                                                            nv80 nv80Var = this.a;
                                                                                                                            if (((Boolean) nv80Var.d.invoke()).booleanValue()) {
                                                                                                                                nv80Var.b().A.setChecked(false);
                                                                                                                                nv80Var.e.invoke();
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            ProvablySettingRequest provablySettingRequest = new ProvablySettingRequest(true, null);
                                                                                                                            y720 y720Var2 = nv80Var.b;
                                                                                                                            y720Var2.getClass();
                                                                                                                            ej5.c(o8i0.d(y720Var2), null, null, new c820(y720Var2, provablySettingRequest, null), 3);
                                                                                                                            nv80Var.a();
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                b().A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gv80
                                                                                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                                                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                                                                                                        compoundButton.getClass();
                                                                                                                        if (z) {
                                                                                                                            nv80 nv80Var = this.a;
                                                                                                                            nv80Var.y = nv80Var.b().f.getText().toString();
                                                                                                                            nv80Var.c(false);
                                                                                                                            nv80Var.b().z.setVisibility(0);
                                                                                                                            nv80Var.b().i.setVisibility(0);
                                                                                                                            nv80Var.b().e.setVisibility(0);
                                                                                                                            nv80Var.b().f.setAlpha(1.0f);
                                                                                                                            nv80Var.b().f.setFocusable(true);
                                                                                                                            nv80Var.b().f.setFocusableInTouchMode(true);
                                                                                                                            nv80Var.b().J.setImageDrawable(nv80Var.a.getDrawable(R.drawable.tick));
                                                                                                                            nv80Var.b().f.clearFocus();
                                                                                                                        }
                                                                                                                    }
                                                                                                                });
                                                                                                                op5.r(op5.a, kotlin.collections.b.f(b().I, b().C, b().M, b().c, b().b, b().F, b().B, b().v, b().H, b().y), null, 4);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
