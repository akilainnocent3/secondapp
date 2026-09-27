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
@Deprecated
public class p extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f11764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f11765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f11766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f11767o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f11768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f11769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f11770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View.OnClickListener f11771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f11772t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11773u = true;

    public static void F(TextView textView, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        marginLayoutParams.topMargin = i10;
        textView.setLayoutParams(marginLayoutParams);
    }

    public static Paint.FontMetricsInt v(TextView textView) {
        Paint paint = new Paint(1);
        paint.setTextSize(textView.getTextSize());
        paint.setTypeface(textView.getTypeface());
        return paint.getFontMetricsInt();
    }

    public void A(View.OnClickListener onClickListener) {
        this.f11771s = onClickListener;
        H();
    }

    public void B(String str) {
        this.f11770r = str;
        H();
    }

    public void C(boolean z10) {
        this.f11772t = null;
        this.f11773u = z10;
        G();
        J();
    }

    public void D(Drawable drawable) {
        this.f11768p = drawable;
        I();
    }

    public void E(CharSequence charSequence) {
        this.f11769q = charSequence;
        J();
    }

    public final void G() {
        ViewGroup viewGroup = this.f11764l;
        if (viewGroup != null) {
            Drawable drawable = this.f11772t;
            if (drawable != null) {
                viewGroup.setBackground(drawable);
            } else {
                viewGroup.setBackgroundColor(viewGroup.getResources().getColor(this.f11773u ? s3.a.d.f128518t : s3.a.d.f128517s));
            }
        }
    }

    public final void H() {
        Button button = this.f11767o;
        if (button != null) {
            button.setText(this.f11770r);
            this.f11767o.setOnClickListener(this.f11771s);
            this.f11767o.setVisibility(TextUtils.isEmpty(this.f11770r) ? 8 : 0);
            this.f11767o.requestFocus();
        }
    }

    public final void I() {
        ImageView imageView = this.f11765m;
        if (imageView != null) {
            imageView.setImageDrawable(this.f11768p);
            this.f11765m.setVisibility(this.f11768p == null ? 8 : 0);
        }
    }

    public final void J() {
        TextView textView = this.f11766n;
        if (textView != null) {
            textView.setText(this.f11769q);
            this.f11766n.setVisibility(TextUtils.isEmpty(this.f11769q) ? 8 : 0);
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(s3.a.j.f128838m, viewGroup, false);
        this.f11764l = (ViewGroup) viewInflate.findViewById(s3.a.h.f128696b0);
        G();
        h(layoutInflater, this.f11764l, bundle);
        this.f11765m = (ImageView) viewInflate.findViewById(s3.a.h.I0);
        I();
        this.f11766n = (TextView) viewInflate.findViewById(s3.a.h.M1);
        J();
        this.f11767o = (Button) viewInflate.findViewById(s3.a.h.f128785y);
        H();
        Paint.FontMetricsInt fontMetricsIntV = v(this.f11766n);
        F(this.f11766n, (viewGroup != null ? viewGroup.getResources().getDimensionPixelSize(s3.a.e.Z0) : 0) + fontMetricsIntV.ascent);
        F(this.f11767o, (viewGroup != null ? viewGroup.getResources().getDimensionPixelSize(s3.a.e.f128527a1) : 0) - fontMetricsIntV.descent);
        return viewInflate;
    }

    @Override // androidx.leanback.app.g, android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f11764l.requestFocus();
    }

    public Drawable s() {
        return this.f11772t;
    }

    public View.OnClickListener t() {
        return this.f11771s;
    }

    public String u() {
        return this.f11770r;
    }

    public Drawable w() {
        return this.f11768p;
    }

    public CharSequence x() {
        return this.f11769q;
    }

    public boolean y() {
        return this.f11773u;
    }

    public void z(Drawable drawable) {
        this.f11772t = drawable;
        if (drawable != null) {
            int opacity = drawable.getOpacity();
            this.f11773u = opacity == -3 || opacity == -2;
        }
        G();
        J();
    }
}
