package com.sportygames.pingpong.components;

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
import defpackage.bmy;
import defpackage.bq40;
import defpackage.d820;
import defpackage.em60;
import defpackage.fvj;
import defpackage.h5e;
import defpackage.pp6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sportygames/pingpong/components/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends Fragment {
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public Function1<? super Boolean, Unit> e = new em60();
    public Function0<Unit> f;
    public d820 i;
    public boolean v;
    public int w;
    public int y;

    /* JADX INFO: renamed from: com.sportygames.pingpong.components.a$a, reason: collision with other inner class name */
    public static final class C0444a {
        public static a a(String str, String str2, String str3, String str4, String str5, Function1 function1, Function0 function0, int i, int i2) {
            str3.getClass();
            a aVar = new a();
            aVar.a = str2;
            aVar.b = "one tap bet";
            aVar.c = str4;
            aVar.d = str5;
            aVar.e = function1;
            aVar.f = function0;
            aVar.w = i;
            aVar.y = i2;
            aVar.v = false;
            return aVar;
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ bq40 a;
        public final /* synthetic */ bq40 b;
        public final /* synthetic */ a c;

        public b(bq40 bq40Var, bq40 bq40Var2, a aVar) {
            this.a = bq40Var;
            this.b = bq40Var2;
            this.c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            bq40 bq40Var = this.a;
            int i = bq40Var.a;
            a aVar = this.c;
            if (i == 0) {
                d820 d820Var = aVar.i;
                if (d820Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                int lineCount = d820Var.i.getLineCount();
                bq40 bq40Var2 = this.b;
                bq40Var2.a = lineCount;
                d820 d820Var2 = aVar.i;
                if (d820Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = d820Var2.i.getLayoutParams();
                layoutParams.getClass();
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                d820 d820Var3 = aVar.i;
                if (d820Var3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = d820Var3.f.getLayoutParams();
                layoutParams3.getClass();
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                d820 d820Var4 = aVar.i;
                if (d820Var4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams5 = d820Var4.b.getLayoutParams();
                layoutParams5.getClass();
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                d820 d820Var5 = aVar.i;
                if (d820Var5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams7 = d820Var5.e.getLayoutParams();
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
                d820 d820Var6 = aVar.i;
                if (d820Var6 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                d820Var6.i.setLayoutParams(layoutParams2);
                bq40Var.a = 1;
            }
            d820 d820Var7 = aVar.i;
            if (d820Var7 != null) {
                d820Var7.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.pp_confirm_dailog, viewGroup, false);
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
                                this.i = new d820((ConstraintLayout) viewInflate, constraintLayout, textView, textView2, constraintLayout2, cardView, appCompatTextView);
                                constraintLayout2.setOnClickListener(new pp6(this, 1));
                                d820 d820Var = this.i;
                                if (d820Var == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ConstraintLayout constraintLayout3 = d820Var.a;
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
            d820 d820Var = this.i;
            if (d820Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            d820Var.i.setText(this.a);
            d820 d820Var2 = this.i;
            if (d820Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            CharSequence text = d820Var2.i.getText();
            text.getClass();
            StringsKt.X(text).size();
            bq40 bq40Var = new bq40();
            bq40 bq40Var2 = new bq40();
            d820 d820Var3 = this.i;
            if (d820Var3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            d820Var3.i.getViewTreeObserver().addOnGlobalLayoutListener(new b(bq40Var2, bq40Var, this));
            d820 d820Var4 = this.i;
            if (d820Var4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            d820Var4.c.setText(this.d);
            d820 d820Var5 = this.i;
            if (d820Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            d820Var5.d.setText(this.c);
            d820 d820Var6 = this.i;
            if (d820Var6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            if (d820Var6.c.getText().equals(getResources().getString(R.string.new_round))) {
                d820 d820Var7 = this.i;
                if (d820Var7 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = d820Var7.b.getLayoutParams();
                layoutParams.getClass();
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.R = 0.4f;
                d820 d820Var8 = this.i;
                if (d820Var8 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                d820Var8.b.setLayoutParams(layoutParams2);
                d820 d820Var9 = this.i;
                if (d820Var9 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = d820Var9.e.getLayoutParams();
                layoutParams3.getClass();
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.R = 0.6f;
                d820 d820Var10 = this.i;
                if (d820Var10 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                d820Var10.e.setLayoutParams(layoutParams4);
            }
            d820 d820Var11 = this.i;
            if (d820Var11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            d820Var11.b.setOnClickListener(new fvj(this, 1));
            if (Build.VERSION.SDK_INT <= 25) {
                d820 d820Var12 = this.i;
                if (d820Var12 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                d820Var12.d.setTextSize(16.0f);
                d820 d820Var13 = this.i;
                if (d820Var13 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                d820Var13.c.setTextSize(16.0f);
            }
            int i = this.w;
            if (i != 0) {
                d820 d820Var14 = this.i;
                if (d820Var14 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                d820Var14.b.setBackgroundColor(i);
            }
            int i2 = this.y;
            if (i2 != 0) {
                d820 d820Var15 = this.i;
                if (d820Var15 != null) {
                    d820Var15.e.setBackgroundColor(i2);
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
