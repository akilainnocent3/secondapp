package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.c7;
import defpackage.e0g0;
import defpackage.e6;
import defpackage.r6i0;
import defpackage.th50;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements k.a {
    public static final int[] V = {R.attr.state_checked};
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final CheckedTextView O;
    public FrameLayout P;
    public h Q;
    public ColorStateList R;
    public boolean S;
    public Drawable T;
    public final a U;

    public class a extends e6 {
        public a() {
        }

        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.M);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.N = true;
        a aVar = new a();
        this.U = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.sportybet.android.gp.tz.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.sportybet.android.gp.tz.R.id.design_menu_item_text);
        this.O = checkedTextView;
        r6i0.p(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.P == null) {
                this.P = (FrameLayout) ((ViewStub) findViewById(com.sportybet.android.gp.tz.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.P.removeAllViews();
            this.P.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        StateListDrawable stateListDrawable;
        this.Q = hVar;
        int i = hVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.sportybet.android.gp.tz.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(V, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.q);
        e0g0.a(this, hVar.r);
        h hVar2 = this.Q;
        CharSequence charSequence = hVar2.e;
        CheckedTextView checkedTextView = this.O;
        if (charSequence == null && hVar2.getIcon() == null && this.Q.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.P;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.P.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.P;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.P.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.Q;
        if (hVar != null && hVar.isCheckable() && this.Q.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.M != z) {
            this.M = z;
            this.U.h(this.O, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.O;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.N) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.S) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.R);
            }
            int i = this.K;
            drawable.setBounds(0, 0, i, i);
        } else if (this.L) {
            if (this.T == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = th50.a;
                Drawable drawable2 = resources.getDrawable(com.sportybet.android.gp.tz.R.drawable.navigation_empty_icon, theme);
                this.T = drawable2;
                if (drawable2 != null) {
                    int i2 = this.K;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.T;
        }
        this.O.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.O.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.K = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.R = colorStateList;
        this.S = colorStateList != null;
        h hVar = this.Q;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.O.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.L = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        this.O.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.O.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.O.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
