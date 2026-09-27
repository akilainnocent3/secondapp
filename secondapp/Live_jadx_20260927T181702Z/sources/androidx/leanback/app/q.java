package androidx.leanback.app;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class q extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f11774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f11775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f11776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f11777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f11778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f11779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f11780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View.OnClickListener f11781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f11782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11783u = true;

    public static Paint.FontMetricsInt I(TextView textView) {
        Paint paint = new Paint(1);
        paint.setTextSize(textView.getTextSize());
        paint.setTypeface(textView.getTypeface());
        return paint.getFontMetricsInt();
    }

    public static void T(TextView textView, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = i10;
        textView.setLayoutParams(marginLayoutParams);
    }

    public Drawable F() {
        return this.f11782t;
    }

    public View.OnClickListener G() {
        return this.f11781s;
    }

    public String H() {
        return this.f11780r;
    }

    public Drawable J() {
        return this.f11778p;
    }

    public CharSequence K() {
        return this.f11779q;
    }

    public boolean L() {
        return this.f11783u;
    }

    public void M(Drawable drawable) {
        this.f11782t = drawable;
        if (drawable != null) {
            int opacity = drawable.getOpacity();
            this.f11783u = opacity == -3 || opacity == -2;
        }
        U();
        X();
    }

    public void O(View.OnClickListener onClickListener) {
        this.f11781s = onClickListener;
        V();
    }

    public void P(String str) {
        this.f11780r = str;
        V();
    }

    public void Q(boolean z10) {
        this.f11782t = null;
        this.f11783u = z10;
        U();
        X();
    }

    public void R(Drawable drawable) {
        this.f11778p = drawable;
        W();
    }

    public void S(CharSequence charSequence) {
        this.f11779q = charSequence;
        X();
    }

    public final void U() {
        ViewGroup viewGroup = this.f11774l;
        if (viewGroup != null) {
            Drawable drawable = this.f11782t;
            if (drawable != null) {
                viewGroup.setBackground(drawable);
            } else {
                viewGroup.setBackgroundColor(viewGroup.getResources().getColor(this.f11783u ? s3.a.d.f128518t : s3.a.d.f128517s));
            }
        }
    }

    public final void V() {
        Button button = this.f11777o;
        if (button != null) {
            button.setText(this.f11780r);
            this.f11777o.setOnClickListener(this.f11781s);
            this.f11777o.setVisibility(TextUtils.isEmpty(this.f11780r) ? 8 : 0);
            this.f11777o.requestFocus();
        }
    }

    public final void W() {
        ImageView imageView = this.f11775m;
        if (imageView != null) {
            imageView.setImageDrawable(this.f11778p);
            this.f11775m.setVisibility(this.f11778p == null ? 8 : 0);
        }
    }

    public final void X() {
        TextView textView = this.f11776n;
        if (textView != null) {
            textView.setText(this.f11779q);
            this.f11776n.setVisibility(TextUtils.isEmpty(this.f11779q) ? 8 : 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(s3.a.j.f128838m, viewGroup, false);
        this.f11774l = (ViewGroup) viewInflate.findViewById(s3.a.h.f128696b0);
        U();
        u(layoutInflater, this.f11774l, bundle);
        this.f11775m = (ImageView) viewInflate.findViewById(s3.a.h.I0);
        W();
        this.f11776n = (TextView) viewInflate.findViewById(s3.a.h.M1);
        X();
        this.f11777o = (Button) viewInflate.findViewById(s3.a.h.f128785y);
        V();
        Paint.FontMetricsInt fontMetricsIntI = I(this.f11776n);
        T(this.f11776n, (viewGroup != null ? viewGroup.getResources().getDimensionPixelSize(s3.a.e.Z0) : 0) + fontMetricsIntI.ascent);
        T(this.f11777o, (viewGroup != null ? viewGroup.getResources().getDimensionPixelSize(s3.a.e.f128527a1) : 0) - fontMetricsIntI.descent);
        return viewInflate;
    }

    @Override // androidx.leanback.app.h, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f11774l.requestFocus();
    }
}
