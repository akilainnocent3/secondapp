package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfm60;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fm60 extends Fragment {
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public Function1<? super Boolean, Unit> e = new dm60();
    public ss80 f;
    public boolean i;
    public int v;
    public int w;

    public static final class a {
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ bq40 a;
        public final /* synthetic */ bq40 b;
        public final /* synthetic */ fm60 c;

        public b(bq40 bq40Var, bq40 bq40Var2, fm60 fm60Var) {
            this.a = bq40Var;
            this.b = bq40Var2;
            this.c = fm60Var;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            bq40 bq40Var = this.a;
            int i = bq40Var.a;
            fm60 fm60Var = this.c;
            if (i == 0) {
                ss80 ss80Var = fm60Var.f;
                if (ss80Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                int lineCount = ss80Var.i.getLineCount();
                bq40 bq40Var2 = this.b;
                bq40Var2.a = lineCount;
                ss80 ss80Var2 = fm60Var.f;
                if (ss80Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = ss80Var2.i.getLayoutParams();
                layoutParams.getClass();
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ss80 ss80Var3 = fm60Var.f;
                if (ss80Var3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = ss80Var3.f.getLayoutParams();
                layoutParams3.getClass();
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ss80 ss80Var4 = fm60Var.f;
                if (ss80Var4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams5 = ss80Var4.b.getLayoutParams();
                layoutParams5.getClass();
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                ss80 ss80Var5 = fm60Var.f;
                if (ss80Var5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams7 = ss80Var5.e.getLayoutParams();
                layoutParams7.getClass();
                ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                int i2 = bq40Var2.a;
                if (i2 == 1) {
                    layoutParams2.S = 0.58f;
                    layoutParams6.S = 0.42f;
                    layoutParams8.S = 0.42f;
                    layoutParams4.S = 0.16f;
                }
                if (i2 == 2) {
                    layoutParams2.S = 0.67f;
                    layoutParams6.S = 0.33f;
                    layoutParams8.S = 0.33f;
                    layoutParams4.S = 0.18f;
                }
                if (i2 == 3) {
                    layoutParams2.S = 0.7f;
                    layoutParams6.S = 0.3f;
                    layoutParams8.S = 0.3f;
                    layoutParams4.S = 0.2f;
                }
                if (i2 == 4) {
                    layoutParams2.S = 0.7f;
                    layoutParams6.S = 0.3f;
                    layoutParams8.S = 0.3f;
                    layoutParams4.S = 0.2f;
                }
                ss80 ss80Var6 = fm60Var.f;
                if (ss80Var6 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ss80Var6.i.setLayoutParams(layoutParams2);
                bq40Var.a = 1;
            }
            ss80 ss80Var7 = fm60Var.f;
            if (ss80Var7 != null) {
                ss80Var7.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.sh_confirm_dailog, viewGroup, false);
        int i = R.id.button_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.button_layout, viewInflate);
        if (constraintLayout != null) {
            i = R.id.cancel_button;
            TextView textView = (TextView) h5e.a(R.id.cancel_button, viewInflate);
            if (textView != null) {
                i = R.id.confirm_button;
                TextView textView2 = (TextView) h5e.a(R.id.confirm_button, viewInflate);
                if (textView2 != null) {
                    i = R.id.confirm_layout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.confirm_layout, viewInflate);
                    if (constraintLayout2 != null) {
                        i = R.id.dialog_content;
                        CardView cardView = (CardView) h5e.a(R.id.dialog_content, viewInflate);
                        if (cardView != null) {
                            i = R.id.message_text;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.message_text, viewInflate);
                            if (appCompatTextView != null) {
                                this.f = new ss80((ConstraintLayout) viewInflate, constraintLayout, textView, textView2, constraintLayout2, cardView, appCompatTextView);
                                constraintLayout2.setOnClickListener(new qp6(this, 1));
                                ss80 ss80Var = this.f;
                                if (ss80Var == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ConstraintLayout constraintLayout3 = ss80Var.a;
                                constraintLayout3.getClass();
                                return constraintLayout3;
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        try {
            ss80 ss80Var = this.f;
            if (ss80Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ss80Var.i.setText(this.a);
            ss80 ss80Var2 = this.f;
            if (ss80Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            CharSequence text = ss80Var2.i.getText();
            text.getClass();
            StringsKt.X(text).size();
            bq40 bq40Var = new bq40();
            bq40 bq40Var2 = new bq40();
            ss80 ss80Var3 = this.f;
            if (ss80Var3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ss80Var3.i.getViewTreeObserver().addOnGlobalLayoutListener(new b(bq40Var2, bq40Var, this));
            ss80 ss80Var4 = this.f;
            if (ss80Var4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ss80Var4.c.setText(this.d);
            ss80 ss80Var5 = this.f;
            if (ss80Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ss80Var5.d.setText(this.c);
            ss80 ss80Var6 = this.f;
            if (ss80Var6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            if (ss80Var6.c.getText().equals(getResources().getString(R.string.new_round))) {
                ss80 ss80Var7 = this.f;
                if (ss80Var7 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = ss80Var7.b.getLayoutParams();
                layoutParams.getClass();
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.R = 0.4f;
                ss80 ss80Var8 = this.f;
                if (ss80Var8 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ss80Var8.b.setLayoutParams(layoutParams2);
                ss80 ss80Var9 = this.f;
                if (ss80Var9 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = ss80Var9.e.getLayoutParams();
                layoutParams3.getClass();
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.R = 0.6f;
                ss80 ss80Var10 = this.f;
                if (ss80Var10 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ss80Var10.e.setLayoutParams(layoutParams4);
            }
            ss80 ss80Var11 = this.f;
            if (ss80Var11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ss80Var11.b.setOnClickListener(new View.OnClickListener() { // from class: cm60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    fm60 fm60Var = this.a;
                    fm60Var.e.invoke(Boolean.FALSE);
                    String str = fm60Var.b;
                    ss80 ss80Var12 = fm60Var.f;
                    if (ss80Var12 != null) {
                        wz.a("popup_action", "Sporty Hero", str, ss80Var12.c.getText().toString());
                    } else {
                        Intrinsics.n("binding");
                        throw null;
                    }
                }
            });
            if (Build.VERSION.SDK_INT <= 25) {
                ss80 ss80Var12 = this.f;
                if (ss80Var12 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ss80Var12.d.setTextSize(16.0f);
                ss80 ss80Var13 = this.f;
                if (ss80Var13 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ss80Var13.c.setTextSize(16.0f);
            }
            int i = this.v;
            if (i != 0) {
                ss80 ss80Var14 = this.f;
                if (ss80Var14 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ss80Var14.b.setBackgroundColor(i);
            }
            int i2 = this.w;
            if (i2 != 0) {
                ss80 ss80Var15 = this.f;
                if (ss80Var15 != null) {
                    ss80Var15.e.setBackgroundColor(i2);
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
