package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.l2;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f6492s = "ListMenuItemView";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f6493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f6494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f6495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f6496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f6497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f6498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f6499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f6500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f6501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f6502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f6504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f6506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LayoutInflater f6508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6509r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.a.b.Y1);
    }

    private LayoutInflater getInflater() {
        if (this.f6508q == null) {
            this.f6508q = LayoutInflater.from(getContext());
        }
        return this.f6508q;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f6499h;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f6500i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6500i.getLayoutParams();
        rect.top += this.f6500i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i10) {
        LinearLayout linearLayout = this.f6501j;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(boolean z10, char c10) {
        int i10 = (z10 && this.f6493b.D()) ? 0 : 8;
        if (i10 == 0) {
            this.f6498g.setText(this.f6493b.k());
        }
        if (this.f6498g.getVisibility() != i10) {
            this.f6498g.setVisibility(i10);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(h hVar, int i10) {
        this.f6493b = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.l(this));
        setCheckable(hVar.isCheckable());
        d(hVar.D(), hVar.j());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean f() {
        return this.f6509r;
    }

    public final void g() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(m.a.j.f105767o, (ViewGroup) this, false);
        this.f6497f = checkBox;
        a(checkBox);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f6493b;
    }

    public final void h() {
        ImageView imageView = (ImageView) getInflater().inflate(m.a.j.f105768p, (ViewGroup) this, false);
        this.f6494c = imageView;
        b(imageView, 0);
    }

    public final void i() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(m.a.j.f105770r, (ViewGroup) this, false);
        this.f6495d = radioButton;
        a(radioButton);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f6502k);
        TextView textView = (TextView) findViewById(m.a.g.f105727s0);
        this.f6496e = textView;
        int i10 = this.f6503l;
        if (i10 != -1) {
            textView.setTextAppearance(this.f6504m, i10);
        }
        this.f6498g = (TextView) findViewById(m.a.g.f105705h0);
        ImageView imageView = (ImageView) findViewById(m.a.g.f105717n0);
        this.f6499h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f6506o);
        }
        this.f6500i = (ImageView) findViewById(m.a.g.C);
        this.f6501j = (LinearLayout) findViewById(m.a.g.f105728t);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f6494c != null && this.f6505n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f6494c.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f6495d == null && this.f6497f == null) {
            return;
        }
        if (this.f6493b.p()) {
            if (this.f6495d == null) {
                i();
            }
            compoundButton = this.f6495d;
            view = this.f6497f;
        } else {
            if (this.f6497f == null) {
                g();
            }
            compoundButton = this.f6497f;
            view = this.f6495d;
        }
        if (z10) {
            compoundButton.setChecked(this.f6493b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f6497f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f6495d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f6493b.p()) {
            if (this.f6495d == null) {
                i();
            }
            compoundButton = this.f6495d;
        } else {
            if (this.f6497f == null) {
                g();
            }
            compoundButton = this.f6497f;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f6509r = z10;
        this.f6505n = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f6500i;
        if (imageView != null) {
            imageView.setVisibility((this.f6507p || !z10) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setIcon(Drawable drawable) {
        boolean z10 = this.f6493b.C() || this.f6509r;
        if (z10 || this.f6505n) {
            ImageView imageView = this.f6494c;
            if (imageView == null && drawable == null && !this.f6505n) {
                return;
            }
            if (imageView == null) {
                h();
            }
            if (drawable == null && !this.f6505n) {
                this.f6494c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f6494c;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f6494c.getVisibility() != 0) {
                this.f6494c.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f6496e.getVisibility() != 8) {
                this.f6496e.setVisibility(8);
            }
        } else {
            this.f6496e.setText(charSequence);
            if (this.f6496e.getVisibility() != 0) {
                this.f6496e.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        l2 l2VarG = l2.G(getContext(), attributeSet, m.a.m.I4, i10, 0);
        this.f6502k = l2VarG.h(m.a.m.O4);
        this.f6503l = l2VarG.u(m.a.m.K4, -1);
        this.f6505n = l2VarG.a(m.a.m.Q4, false);
        this.f6504m = context;
        this.f6506o = l2VarG.h(m.a.m.R4);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, m.a.b.f105479p1, 0);
        this.f6507p = typedArrayObtainStyledAttributes.hasValue(0);
        l2VarG.I();
        typedArrayObtainStyledAttributes.recycle();
    }
}
