package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.f;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import defpackage.dbv;
import defpackage.dj0;
import defpackage.dkx;
import defpackage.ecv;
import defpackage.ekx;
import defpackage.fbv;
import defpackage.fcv;
import defpackage.fef;
import defpackage.fyf0;
import defpackage.gcv;
import defpackage.gef;
import defpackage.gof0;
import defpackage.hb5;
import defpackage.ib5;
import defpackage.jcv;
import defpackage.l8j0;
import defpackage.o0b;
import defpackage.pk30;
import defpackage.r6i0;
import defpackage.rx80;
import defpackage.ry80;
import defpackage.sfe0;
import defpackage.skx;
import defpackage.sr1;
import defpackage.sy80;
import defpackage.tcv;
import defpackage.ty80;
import defpackage.udf;
import defpackage.yt50;
import ekx.c;
import ekx.h;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements dbv {
    public static final int[] N = {R.attr.state_checked};
    public static final int[] O = {-16842910};
    public sfe0 A;
    public final skx B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public final boolean H;
    public final int I;
    public final ry80 J;
    public final jcv K;
    public final fbv L;
    public final a M;
    public final dkx v;
    public final ekx w;
    public final int y;
    public final int[] z;

    public class a extends DrawerLayout.f {
        public a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public final void a(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final fbv fbvVar = navigationView.L;
                Objects.requireNonNull(fbvVar);
                view.post(new Runnable() { // from class: rkx
                    @Override // java.lang.Runnable
                    public final void run() {
                        fbvVar.a(true);
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public final void b(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.L.b();
                if (!navigationView.H || navigationView.G == 0) {
                    return;
                }
                navigationView.G = 0;
                navigationView.h(navigationView.getWidth(), navigationView.getHeight());
            }
        }
    }

    public class b implements f.a {
        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
        }
    }

    public interface c {
    }

    /* JADX WARN: Code duplicated, block: B:62:0x018a A[PHI: r9
      0x018a: PHI (r9v3 android.graphics.drawable.Drawable) = 
      (r9v2 android.graphics.drawable.Drawable)
      (r9v7 android.graphics.drawable.Drawable)
      (r9v2 android.graphics.drawable.Drawable)
     binds: [B:54:0x014d, B:60:0x0173, B:58:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(tcv.a(context, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_Design_NavigationView), attributeSet, i);
        ekx ekxVar = new ekx();
        this.w = ekxVar;
        this.z = new int[2];
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = true;
        this.G = 0;
        this.J = Build.VERSION.SDK_INT >= 33 ? new ty80(this) : new sy80(this);
        this.K = new jcv(this);
        this.L = new fbv(this, this);
        this.M = new a();
        Context context2 = getContext();
        dkx dkxVar = new dkx(context2);
        this.v = dkxVar;
        fyf0 fyf0VarE = gof0.e(context2, attributeSet, pk30.T, i, com.sportybet.android.gp.tz.R.style.Widget_Design_NavigationView, new int[0]);
        TypedArray typedArray = fyf0VarE.b;
        if (typedArray.hasValue(1)) {
            setBackground(fyf0VarE.b(1));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        this.G = dimensionPixelSize;
        this.H = dimensionPixelSize == 0;
        this.I = getResources().getDimensionPixelSize(com.sportybet.android.gp.tz.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListD = udf.d(background);
        if (background == null || colorStateListD != null) {
            fcv fcvVar = new fcv(rx80.d(context2, attributeSet, i, com.sportybet.android.gp.tz.R.style.Widget_Design_NavigationView).a());
            if (colorStateListD != null) {
                fcvVar.s(colorStateListD);
            }
            fcvVar.o(context2);
            setBackground(fcvVar);
        }
        if (typedArray.hasValue(8)) {
            setElevation(typedArray.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(2, false));
        this.y = typedArray.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListA = typedArray.hasValue(33) ? fyf0VarE.a(33) : null;
        int resourceId = typedArray.hasValue(36) ? typedArray.getResourceId(36, 0) : 0;
        if (resourceId == 0 && colorStateListA == null) {
            colorStateListA = f(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListA2 = typedArray.hasValue(15) ? fyf0VarE.a(15) : f(R.attr.textColorSecondary);
        int resourceId2 = typedArray.hasValue(25) ? typedArray.getResourceId(25, 0) : 0;
        boolean z = typedArray.getBoolean(26, true);
        if (typedArray.hasValue(14)) {
            setItemIconSize(typedArray.getDimensionPixelSize(14, 0));
        }
        ColorStateList colorStateListA3 = typedArray.hasValue(27) ? fyf0VarE.a(27) : null;
        if (resourceId2 == 0 && colorStateListA3 == null) {
            colorStateListA3 = f(R.attr.textColorPrimary);
        }
        Drawable drawableB = fyf0VarE.b(11);
        if (drawableB == null && (typedArray.hasValue(18) || typedArray.hasValue(19))) {
            drawableB = g(fyf0VarE, ecv.b(getContext(), fyf0VarE, 20));
            ColorStateList colorStateListB = ecv.b(context2, fyf0VarE, 17);
            if (colorStateListB != null) {
                ekxVar.C = new RippleDrawable(yt50.c(colorStateListB), null, g(fyf0VarE, null));
                ekxVar.m();
            }
        }
        if (typedArray.hasValue(12)) {
            i2 = 0;
            setItemHorizontalPadding(typedArray.getDimensionPixelSize(12, 0));
        } else {
            i2 = 0;
        }
        if (typedArray.hasValue(28)) {
            setItemVerticalPadding(typedArray.getDimensionPixelSize(28, i2));
        }
        setDividerInsetStart(typedArray.getDimensionPixelSize(6, i2));
        setDividerInsetEnd(typedArray.getDimensionPixelSize(5, i2));
        setSubheaderInsetStart(typedArray.getDimensionPixelSize(35, i2));
        setSubheaderInsetEnd(typedArray.getDimensionPixelSize(34, i2));
        setTopInsetScrimEnabled(typedArray.getBoolean(37, this.C));
        setBottomInsetScrimEnabled(typedArray.getBoolean(4, this.D));
        setStartInsetScrimEnabled(typedArray.getBoolean(32, this.E));
        setEndInsetScrimEnabled(typedArray.getBoolean(9, this.F));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(13, 0);
        setItemMaxLines(typedArray.getInt(16, 1));
        dkxVar.e = new b();
        ekxVar.d = 1;
        ekxVar.l(context2, dkxVar);
        if (resourceId != 0) {
            ekxVar.i = resourceId;
            ekxVar.b();
        }
        ekxVar.v = colorStateListA;
        ekxVar.b();
        ekxVar.A = colorStateListA2;
        ekxVar.m();
        int overScrollMode = getOverScrollMode();
        ekxVar.Q = overScrollMode;
        NavigationMenuView navigationMenuView = ekxVar.a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (resourceId2 != 0) {
            ekxVar.w = resourceId2;
            ekxVar.m();
        }
        ekxVar.y = z;
        ekxVar.m();
        ekxVar.z = colorStateListA3;
        ekxVar.m();
        ekxVar.B = drawableB;
        ekxVar.m();
        ekxVar.F = dimensionPixelSize2;
        ekxVar.m();
        dkxVar.b(ekxVar, dkxVar.a);
        if (ekxVar.a == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) ekxVar.f.inflate(com.sportybet.android.gp.tz.R.layout.design_navigation_menu, (ViewGroup) this, false);
            ekxVar.a = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(ekxVar.new h(ekxVar.a));
            if (ekxVar.e == null) {
                ekx.c cVar = ekxVar.new c();
                ekxVar.e = cVar;
                cVar.setHasStableIds(true);
            }
            int i3 = ekxVar.Q;
            if (i3 != -1) {
                ekxVar.a.setOverScrollMode(i3);
            }
            LinearLayout linearLayout = (LinearLayout) ekxVar.f.inflate(com.sportybet.android.gp.tz.R.layout.design_navigation_item_header, (ViewGroup) ekxVar.a, false);
            ekxVar.b = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            ekxVar.a.setAdapter(ekxVar.e);
        }
        addView(ekxVar.a);
        if (typedArray.hasValue(29)) {
            int resourceId3 = typedArray.getResourceId(29, 0);
            ekx.c cVar2 = ekxVar.e;
            if (cVar2 != null) {
                cVar2.c = true;
            }
            getMenuInflater().inflate(resourceId3, dkxVar);
            ekx.c cVar3 = ekxVar.e;
            if (cVar3 != null) {
                cVar3.c = false;
            }
            ekxVar.j(false);
        }
        if (typedArray.hasValue(10)) {
            ekxVar.b.addView(ekxVar.f.inflate(typedArray.getResourceId(10, 0), (ViewGroup) ekxVar.b, false));
            NavigationMenuView navigationMenuView3 = ekxVar.a;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        fyf0VarE.g();
        this.B = new skx(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.B);
    }

    private MenuInflater getMenuInflater() {
        sfe0 sfe0Var = this.A;
        if (sfe0Var != null) {
            return sfe0Var;
        }
        sfe0 sfe0Var2 = new sfe0(getContext());
        this.A = sfe0Var2;
        return sfe0Var2;
    }

    @Override // defpackage.dbv
    public final void a(sr1 sr1Var) {
        i();
        this.K.f = sr1Var;
    }

    @Override // defpackage.dbv
    public final void b() {
        i();
        this.K.b();
        if (!this.H || this.G == 0) {
            return;
        }
        this.G = 0;
        h(getWidth(), getHeight());
    }

    @Override // defpackage.dbv
    public final void c() {
        Pair<DrawerLayout, DrawerLayout.LayoutParams> pairI = i();
        final DrawerLayout drawerLayout = (DrawerLayout) pairI.first;
        jcv jcvVar = this.K;
        sr1 sr1Var = jcvVar.f;
        jcvVar.f = null;
        if (sr1Var == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.c(this, true);
            return;
        }
        int i = ((DrawerLayout.LayoutParams) pairI.second).a;
        int i2 = gef.a;
        jcvVar.c(sr1Var, i, new fef(drawerLayout, this), new ValueAnimator.AnimatorUpdateListener() { // from class: eef
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(b78.f(-1728053248, dj0.c(valueAnimator.getAnimatedFraction(), gef.a, 0)));
            }
        });
    }

    @Override // defpackage.dbv
    public final void d(sr1 sr1Var) {
        float f = sr1Var.c;
        int i = ((DrawerLayout.LayoutParams) i().second).a;
        jcv jcvVar = this.K;
        if (jcvVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        sr1 sr1Var2 = jcvVar.f;
        jcvVar.f = sr1Var;
        if (sr1Var2 != null) {
            jcvVar.d(i, f, sr1Var.d == 0);
        }
        if (this.H) {
            this.G = dj0.c(jcvVar.a.getInterpolation(f), 0, this.I);
            h(getWidth(), getHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ry80 ry80Var = this.J;
        Path path = ry80Var.e;
        if (!ry80Var.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public final void e(l8j0 l8j0Var) {
        ekx ekxVar = this.w;
        ekxVar.getClass();
        int iD = l8j0Var.d();
        if (ekxVar.O != iD) {
            ekxVar.O = iD;
            int i = (ekxVar.b.getChildCount() <= 0 && ekxVar.M) ? ekxVar.O : 0;
            NavigationMenuView navigationMenuView = ekxVar.a;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = ekxVar.a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, l8j0Var.a());
        r6i0.b(ekxVar.b, l8j0Var);
    }

    public final ColorStateList f(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = o0b.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.sportybet.android.gp.tz.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = N;
        int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
        int[] iArr3 = O;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListB.getColorForState(iArr3, defaultColor), i2, defaultColor});
    }

    public final InsetDrawable g(fyf0 fyf0Var, ColorStateList colorStateList) {
        TypedArray typedArray = fyf0Var.b;
        fcv fcvVar = new fcv(rx80.a(getContext(), typedArray.getResourceId(18, 0), typedArray.getResourceId(19, 0)).a());
        fcvVar.s(colorStateList);
        return new InsetDrawable((Drawable) fcvVar, typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(24, 0), typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(21, 0));
    }

    public jcv getBackHelper() {
        return this.K;
    }

    public MenuItem getCheckedItem() {
        return this.w.e.b;
    }

    public int getDividerInsetEnd() {
        return this.w.I;
    }

    public int getDividerInsetStart() {
        return this.w.H;
    }

    public int getHeaderCount() {
        return this.w.b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.w.B;
    }

    public int getItemHorizontalPadding() {
        return this.w.D;
    }

    public int getItemIconPadding() {
        return this.w.F;
    }

    public ColorStateList getItemIconTintList() {
        return this.w.A;
    }

    public int getItemMaxLines() {
        return this.w.N;
    }

    public ColorStateList getItemTextColor() {
        return this.w.z;
    }

    public int getItemVerticalPadding() {
        return this.w.E;
    }

    public Menu getMenu() {
        return this.v;
    }

    public int getSubheaderInsetEnd() {
        return this.w.K;
    }

    public int getSubheaderInsetStart() {
        return this.w.J;
    }

    public final void h(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.G > 0 || this.H) && (getBackground() instanceof fcv)) {
                boolean z = Gravity.getAbsoluteGravity(((DrawerLayout.LayoutParams) getLayoutParams()).a, getLayoutDirection()) == 3;
                fcv fcvVar = (fcv) getBackground();
                rx80.a aVarH = fcvVar.b.a.h();
                aVarH.b(this.G);
                if (z) {
                    aVarH.f(0.0f);
                    aVarH.d(0.0f);
                } else {
                    aVarH.g(0.0f);
                    aVarH.e(0.0f);
                }
                rx80 rx80VarA = aVarH.a();
                fcvVar.setShapeAppearanceModel(rx80VarA);
                ry80 ry80Var = this.J;
                ry80Var.c = rx80VarA;
                ry80Var.c();
                ry80Var.a(this);
                ry80Var.d = new RectF(0.0f, 0.0f, i, i2);
                ry80Var.c();
                ry80Var.a(this);
                ry80Var.b = true;
                ry80Var.a(this);
            }
        }
    }

    public final Pair<DrawerLayout, DrawerLayout.LayoutParams> i() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        ib5.a("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
        return null;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ArrayList arrayList;
        super.onAttachedToWindow();
        gcv.d(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            fbv fbvVar = this.L;
            if (fbvVar.a != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                a aVar = this.M;
                if (aVar != null && (arrayList = drawerLayout.H) != null) {
                    arrayList.remove(aVar);
                }
                drawerLayout.a(aVar);
                if (DrawerLayout.l(this)) {
                    fbvVar.a(true);
                }
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.B);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            a aVar = this.M;
            if (aVar != null && (arrayList = drawerLayout.H) != null) {
                arrayList.remove(aVar);
            }
        }
        this.L.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.y;
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i3), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        this.v.f(savedState.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.c = bundle;
        this.v.g(bundle);
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h(i, i2);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.D = z;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.v.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            hb5.a("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        } else {
            this.w.e.j((androidx.appcompat.view.menu.h) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        ekx ekxVar = this.w;
        ekxVar.I = i;
        ekxVar.a();
    }

    public void setDividerInsetStart(int i) {
        ekx ekxVar = this.w;
        ekxVar.H = i;
        ekxVar.a();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        gcv.b(this, f);
    }

    public void setEndInsetScrimEnabled(boolean z) {
        this.F = z;
    }

    public void setForceCompatClippingEnabled(boolean z) {
        ry80 ry80Var = this.J;
        if (z != ry80Var.a) {
            ry80Var.a = z;
            ry80Var.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        ekx ekxVar = this.w;
        ekxVar.B = drawable;
        ekxVar.m();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(int i) {
        ekx ekxVar = this.w;
        ekxVar.D = i;
        ekxVar.m();
    }

    public void setItemHorizontalPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        ekx ekxVar = this.w;
        ekxVar.D = dimensionPixelSize;
        ekxVar.m();
    }

    public void setItemIconPadding(int i) {
        ekx ekxVar = this.w;
        ekxVar.F = i;
        ekxVar.m();
    }

    public void setItemIconPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        ekx ekxVar = this.w;
        ekxVar.F = dimensionPixelSize;
        ekxVar.m();
    }

    public void setItemIconSize(int i) {
        ekx ekxVar = this.w;
        if (ekxVar.G != i) {
            ekxVar.G = i;
            ekxVar.L = true;
            ekxVar.m();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        ekx ekxVar = this.w;
        ekxVar.A = colorStateList;
        ekxVar.m();
    }

    public void setItemMaxLines(int i) {
        ekx ekxVar = this.w;
        ekxVar.N = i;
        ekxVar.m();
    }

    public void setItemTextAppearance(int i) {
        ekx ekxVar = this.w;
        ekxVar.w = i;
        ekxVar.m();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        ekx ekxVar = this.w;
        ekxVar.y = z;
        ekxVar.m();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        ekx ekxVar = this.w;
        ekxVar.z = colorStateList;
        ekxVar.m();
    }

    public void setItemVerticalPadding(int i) {
        ekx ekxVar = this.w;
        ekxVar.E = i;
        ekxVar.m();
    }

    public void setItemVerticalPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        ekx ekxVar = this.w;
        ekxVar.E = dimensionPixelSize;
        ekxVar.m();
    }

    public void setNavigationItemSelectedListener(c cVar) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        ekx ekxVar = this.w;
        if (ekxVar != null) {
            ekxVar.Q = i;
            NavigationMenuView navigationMenuView = ekxVar.a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setStartInsetScrimEnabled(boolean z) {
        this.E = z;
    }

    public void setSubheaderInsetEnd(int i) {
        ekx ekxVar = this.w;
        ekxVar.K = i;
        ekxVar.b();
    }

    public void setSubheaderInsetStart(int i) {
        ekx ekxVar = this.w;
        ekxVar.J = i;
        ekxVar.b();
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.C = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Bundle c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
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

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.v.findItem(i);
        if (menuItemFindItem != null) {
            this.w.e.j((androidx.appcompat.view.menu.h) menuItemFindItem);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.navigationViewStyle);
    }

    public NavigationView(Context context) {
        this(context, null);
    }
}
