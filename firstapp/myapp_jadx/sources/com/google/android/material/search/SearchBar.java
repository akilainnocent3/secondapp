package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.ecv;
import defpackage.fcv;
import defpackage.gcv;
import defpackage.gof0;
import defpackage.gr0;
import defpackage.pk30;
import defpackage.rx80;
import defpackage.tcv;
import defpackage.ut70;
import defpackage.vbv;
import defpackage.zkh;
import defpackage.zzf0;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class SearchBar extends Toolbar {
    public Drawable A0;
    public int B0;
    public boolean C0;
    public final fcv D0;
    public boolean E0;
    public int F0;
    public ActionMenuView G0;
    public ImageButton H0;
    public final a I0;
    public final TextView m0;
    public final TextView n0;
    public final FrameLayout o0;
    public final int p0;
    public boolean q0;
    public final ColorStateList r0;
    public final boolean s0;
    public final boolean t0;
    public final ut70 u0;
    public final Drawable v0;
    public final boolean w0;
    public final boolean x0;
    public View y0;
    public final Integer z0;

    public class a extends AppBarLayout.f {
        public a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f
        public final void a(float f) {
            SearchBar searchBar = SearchBar.this;
            ColorStateList colorStateList = searchBar.r0;
            if (colorStateList != null) {
                searchBar.D0.s(ColorStateList.valueOf(vbv.g(f, searchBar.p0, colorStateList.getDefaultColor())));
            }
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        this.B0 = -1;
        this.I0 = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                zkh.a("SearchBar does not support title. Use hint or text instead.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                zkh.a("SearchBar does not support subtitle. Use hint or text instead.");
                throw null;
            }
        }
        Drawable drawableA = gr0.a(context2, getDefaultNavigationIconResource());
        this.v0 = drawableA;
        ut70 ut70Var = new ut70();
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        this.u0 = ut70Var;
        TypedArray typedArrayD = gof0.d(context2, attributeSet, pk30.Y, i, R.style.Widget_Material3_SearchBar, new int[0]);
        rx80 rx80VarA = rx80.d(context2, attributeSet, i, R.style.Widget_Material3_SearchBar).a();
        int color = typedArrayD.getColor(4, 0);
        this.p0 = color;
        this.r0 = ecv.a(11, context2, typedArrayD);
        float dimension = typedArrayD.getDimension(7, 0.0f);
        this.t0 = typedArrayD.getBoolean(5, true);
        this.C0 = typedArrayD.getBoolean(6, true);
        boolean z = typedArrayD.getBoolean(9, false);
        this.x0 = typedArrayD.getBoolean(8, false);
        this.w0 = typedArrayD.getBoolean(16, true);
        if (typedArrayD.hasValue(12)) {
            this.z0 = Integer.valueOf(typedArrayD.getColor(12, -1));
        }
        int resourceId = typedArrayD.getResourceId(0, -1);
        String string = typedArrayD.getString(2);
        String string2 = typedArrayD.getString(3);
        float dimension2 = typedArrayD.getDimension(14, -1.0f);
        int color2 = typedArrayD.getColor(13, 0);
        this.E0 = typedArrayD.getBoolean(15, false);
        this.q0 = typedArrayD.getBoolean(10, false);
        this.F0 = typedArrayD.getDimensionPixelSize(1, -1);
        typedArrayD.recycle();
        if (!z) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawableA);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.s0 = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.m0 = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.n0 = textView2;
        this.o0 = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        setTextCentered(this.E0);
        fcv fcvVar = new fcv(rx80VarA);
        this.D0 = fcvVar;
        fcvVar.o(getContext());
        this.D0.r(dimension);
        if (dimension2 >= 0.0f) {
            fcv fcvVar2 = this.D0;
            fcvVar2.z(dimension2);
            fcvVar2.y(ColorStateList.valueOf(color2));
        }
        int iB = vbv.b(R.attr.colorControlHighlight, this);
        this.D0.s(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
        fcv fcvVar3 = this.D0;
        setBackground(new RippleDrawable(colorStateListValueOf, fcvVar3, fcvVar3));
    }

    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButtonB = zzf0.b(this);
        if (imageButtonB == null) {
            return;
        }
        imageButtonB.setClickable(!z);
        imageButtonB.setFocusable(!z);
        Drawable background = imageButtonB.getBackground();
        if (background != null) {
            this.A0 = background;
        }
        imageButtonB.setBackgroundDrawable(z ? null : this.A0);
        w();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.s0 && this.y0 == null && !(view instanceof ActionMenuView)) {
            this.y0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public View getCenterView() {
        return this.y0;
    }

    public float getCompatElevation() {
        fcv fcvVar = this.D0;
        return fcvVar != null ? fcvVar.b.n : getElevation();
    }

    public float getCornerSize() {
        return this.D0.l();
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.m0.getHint();
    }

    public int getMaxWidth() {
        return this.F0;
    }

    public int getMenuResId() {
        return this.B0;
    }

    public TextView getPlaceholderTextView() {
        return this.n0;
    }

    public int getStrokeColor() {
        return this.D0.b.e.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.D0.b.k;
    }

    public CharSequence getText() {
        return this.m0.getText();
    }

    public boolean getTextCentered() {
        return this.E0;
    }

    public TextView getTextView() {
        return this.m0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        super.m(i);
        this.B0 = i;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AppBarLayout appBarLayoutParentIfExists;
        super.onAttachedToWindow();
        gcv.c(this, this.D0);
        if (this.t0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            if (i == 0) {
                i = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i;
            int i2 = marginLayoutParams.topMargin;
            if (i2 == 0) {
                i2 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i2;
            int i3 = marginLayoutParams.rightMargin;
            if (i3 != 0) {
                dimensionPixelSize = i3;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i4 = marginLayoutParams.bottomMargin;
            if (i4 != 0) {
                dimensionPixelSize2 = i4;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        x();
        if (!this.q0 || (appBarLayoutParentIfExists = getAppBarLayoutParentIfExists()) == null || this.r0 == null) {
            return;
        }
        appBarLayoutParentIfExists.H.add(this.I0);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.H.remove(this.I0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.y0;
        if (view != null && view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        w();
        TextView textView = this.m0;
        if (textView == null || !this.E0) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.o0;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        boolean z2 = getLayoutDirection() == 1;
        ActionMenuView actionMenuView = this.G0;
        View view2 = actionMenuView;
        if (actionMenuView == null) {
            ActionMenuView actionMenuViewA = zzf0.a(this);
            this.G0 = actionMenuViewA;
            view2 = actionMenuViewA;
        }
        ImageButton imageButtonB = this.H0;
        if (imageButtonB == null) {
            imageButtonB = zzf0.b(this);
            this.H0 = imageButtonB;
        }
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i7 = measuredWidth6 + measuredWidth4;
        int i8 = measuredWidth7 + measuredWidth4;
        View view3 = z2 ? view2 : imageButtonB;
        if (z2) {
            view2 = imageButtonB;
        }
        int iMax = view3 != null ? Math.max(view3.getRight() - i7, 0) : 0;
        int i9 = i7 + iMax;
        int i10 = i8 + iMax;
        int iMax2 = view2 != null ? Math.max(i10 - view2.getLeft(), 0) : 0;
        int i11 = i9 - iMax2;
        int i12 = i10 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i11, getContentInsetLeft() - i11), 0)) - Math.max(Math.max(i12 - (getMeasuredWidth() - getPaddingRight()), i12 - (getMeasuredWidth() - getContentInsetRight())), 0);
        frameLayout.layout(measuredWidth4 + iMax3, measuredHeight3, measuredWidth5 + iMax3, measuredHeight4);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.F0;
        if (i3 >= 0 && i3 < View.MeasureSpec.getSize(i)) {
            i = View.MeasureSpec.makeMeasureSpec(this.F0, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        View view = this.y0;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setText(savedState.c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.c = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(View view) {
        View view2 = this.y0;
        if (view2 != null) {
            removeView(view2);
            this.y0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.C0 = z;
        x();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        fcv fcvVar = this.D0;
        if (fcvVar != null) {
            fcvVar.r(f);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.m0.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z) {
        this.q0 = z;
        a aVar = this.I0;
        if (!z) {
            AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
            if (appBarLayoutParentIfExists != null) {
                appBarLayoutParentIfExists.H.remove(aVar);
                return;
            }
            return;
        }
        AppBarLayout appBarLayoutParentIfExists2 = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists2 == null || this.r0 == null) {
            return;
        }
        appBarLayoutParentIfExists2.H.add(aVar);
    }

    public void setMaxWidth(int i) {
        if (this.F0 != i) {
            this.F0 = i;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int iB;
        if (this.w0 && drawable != null) {
            Integer num = this.z0;
            if (num != null) {
                iB = num.intValue();
            } else {
                iB = vbv.b(drawable == this.v0 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface, this);
            }
            drawable = drawable.mutate();
            drawable.setTint(iB);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.x0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.u0.getClass();
    }

    public void setPlaceholderText(String str) {
        this.n0.setText(str);
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            this.D0.y(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            this.D0.z(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.m0.setText(charSequence);
        this.n0.setText(charSequence);
    }

    public void setTextCentered(boolean z) {
        this.E0 = z;
        TextView textView = this.m0;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z) {
            layoutParams.gravity = 1;
            textView.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            textView.setGravity(0);
        }
        textView.setLayoutParams(layoutParams);
        this.n0.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void w() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z = getLayoutDirection() == 1;
        ImageButton imageButtonB = zzf0.b(this);
        if (imageButtonB == null || !imageButtonB.isClickable()) {
            width = 0;
        } else {
            width = z ? getWidth() - imageButtonB.getLeft() : imageButtonB.getRight();
        }
        ActionMenuView actionMenuViewA = zzf0.a(this);
        if (actionMenuViewA != null) {
            right = z ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft();
        }
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    public final void x() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.C0) {
                if (layoutParams.a == 0) {
                    layoutParams.a = 53;
                }
            } else if (layoutParams.a == 53) {
                layoutParams.a = 0;
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.c);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean i;

        public ScrollingViewBehavior() {
            this.i = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.h(coordinatorLayout, view, view2);
            if (!this.i && (view2 instanceof AppBarLayout)) {
                this.i = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.i = false;
        }
    }

    public void setHint(int i) {
        this.m0.setHint(i);
    }

    public void setText(int i) {
        this.m0.setText(i);
        this.n0.setText(i);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public SearchBar(Context context) {
        this(context, null);
    }
}
