package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.transition.AutoTransition;
import defpackage.akx;
import defpackage.amf0;
import defpackage.bbv;
import defpackage.bkx;
import defpackage.c7;
import defpackage.dj0;
import defpackage.e220;
import defpackage.f6w;
import defpackage.fcv;
import defpackage.hb5;
import defpackage.o0b;
import defpackage.rx80;
import defpackage.wte;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements k {
    public static final int[] o0 = {R.attr.state_checked};
    public static final int[] p0 = {-16842910};
    public ColorStateList A;
    public final ColorStateList B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public Drawable H;
    public ColorStateList I;
    public int J;
    public final SparseArray<com.google.android.material.badge.a> K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final AutoTransition a;
    public rx80 a0;
    public final a b;
    public boolean b0;
    public e220 c;
    public ColorStateList c0;
    public final SparseArray<View.OnTouchListener> d;
    public NavigationBarPresenter d0;
    public int e;
    public akx e0;
    public int f;
    public boolean f0;
    public boolean g0;
    public int h0;
    public bkx[] i;
    public int i0;
    public boolean j0;
    public MenuItem k0;
    public int l0;
    public boolean m0;
    public final Rect n0;
    public int v;
    public int w;
    public ColorStateList y;
    public int z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h itemData = ((NavigationBarItemView) view).getItemData();
            NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
            akx akxVar = navigationBarMenuView.e0;
            boolean zS = akxVar.a.s(itemData, navigationBarMenuView.d0, 0);
            if (itemData == null || !itemData.isCheckable()) {
                return;
            }
            if (!zS || itemData.isChecked()) {
                navigationBarMenuView.setCheckedItem(itemData);
            }
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        this.d = new SparseArray<>();
        this.v = -1;
        this.w = -1;
        this.K = new SparseArray<>();
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.W = 49;
        this.b0 = false;
        this.h0 = 1;
        this.i0 = 0;
        this.k0 = null;
        this.l0 = 7;
        this.m0 = false;
        this.n0 = new Rect();
        this.B = c();
        if (isInEditMode()) {
            this.a = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.a = autoTransition;
            autoTransition.T(0);
            autoTransition.o();
            autoTransition.H(bbv.c(getContext(), com.sportybet.android.gp.tz.R.attr.motionDurationMedium4, getResources().getInteger(com.sportybet.android.gp.tz.R.integer.material_motion_duration_long_1)));
            autoTransition.J(f6w.c(getContext(), com.sportybet.android.gp.tz.R.attr.motionEasingStandard, dj0.b));
            autoTransition.P(new amf0());
        }
        this.b = new a();
        setImportantForAccessibility(1);
    }

    public static boolean g(int i, int i2) {
        if (i == -1) {
            return i2 > 3;
        }
        return i == 0;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.l0, this.e0.e);
    }

    private NavigationBarItemView getNewItem() {
        e220 e220Var = this.c;
        NavigationBarItemView navigationBarItemView = e220Var != null ? (NavigationBarItemView) e220Var.b() : null;
        return navigationBarItemView == null ? f(getContext()) : navigationBarItemView;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        com.google.android.material.badge.a aVar;
        int id = navigationBarItemView.getId();
        if (id == -1 || (aVar = this.K.get(id)) == null) {
            return;
        }
        navigationBarItemView.setBadge(aVar);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void a(f fVar) {
        this.e0 = new akx(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        NavigationBarItemView navigationBarItemViewE;
        View viewE;
        NavigationBarDividerView navigationBarDividerView;
        removeAllViews();
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null && this.c != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) bkxVar;
                    this.c.a(navigationBarItemView);
                    ImageView imageView = navigationBarItemView.I;
                    if (navigationBarItemView.p0 != null) {
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            com.google.android.material.badge.a aVar = navigationBarItemView.p0;
                            if (aVar != null) {
                                if (aVar.e() != null) {
                                    aVar.e().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        navigationBarItemView.p0 = null;
                    }
                    navigationBarItemView.a0 = null;
                    navigationBarItemView.g0 = 0.0f;
                    navigationBarItemView.a = false;
                }
            }
        }
        this.d0.b = true;
        this.e0.b();
        this.d0.b = false;
        int i = this.e0.c;
        if (i == 0) {
            this.v = 0;
            this.w = 0;
            this.i = null;
            this.c = null;
            return;
        }
        if (this.c == null || this.i0 != i) {
            this.i0 = i;
            this.c = new e220(i);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.e0.b.size(); i2++) {
            hashSet.add(Integer.valueOf(this.e0.a(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            SparseArray<com.google.android.material.badge.a> sparseArray = this.K;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i3++;
        }
        int size = this.e0.b.size();
        this.i = new bkx[size];
        boolean zG = g(this.e, getCurrentVisibleContentItemCount());
        int size2 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem menuItemA = this.e0.a(i5);
            boolean z = menuItemA instanceof wte;
            if (z) {
                Context context = getContext();
                navigationBarDividerView = new NavigationBarDividerView(context);
                LayoutInflater.from(context).inflate(com.sportybet.android.gp.tz.R.layout.m3_navigation_menu_divider, (ViewGroup) navigationBarDividerView, true);
                navigationBarDividerView.a();
                navigationBarDividerView.setOnlyShowWhenExpanded(true);
                navigationBarDividerView.setDividersEnabled(this.m0);
            } else if (menuItemA.hasSubMenu()) {
                if (size2 > 0) {
                    hb5.a("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                    return;
                }
                NavigationBarSubheaderView navigationBarSubheaderView = new NavigationBarSubheaderView(getContext());
                int i6 = this.F;
                if (i6 == 0) {
                    i6 = this.D;
                }
                navigationBarSubheaderView.setTextAppearance(i6);
                navigationBarSubheaderView.setTextColor(this.A);
                navigationBarSubheaderView.setOnlyShowWhenExpanded(true);
                navigationBarSubheaderView.c((h) menuItemA);
                size2 = menuItemA.getSubMenu().size();
                viewE = navigationBarSubheaderView;
            } else if (size2 > 0) {
                navigationBarItemViewE = e(i5, (h) menuItemA, zG, true);
                size2--;
            } else {
                h hVar = (h) menuItemA;
                boolean z2 = i4 >= this.l0;
                i4++;
                viewE = e(i5, hVar, zG, z2);
            }
            if (z) {
                viewE = navigationBarItemViewE;
                viewE = navigationBarDividerView;
            } else {
                viewE = navigationBarItemViewE;
                if (menuItemA.isCheckable() && this.w == -1) {
                    viewE = navigationBarDividerView;
                    this.w = i5;
                } else {
                    viewE = navigationBarDividerView;
                }
            }
            this.i[i5] = viewE;
            addView(viewE);
        }
        int iMin = Math.min(size - 1, this.w);
        this.w = iMin;
        setCheckedItem(this.i[iMin].getItemData());
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = o0b.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.sportybet.android.gp.tz.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = o0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = p0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListB.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    public final fcv d() {
        if (this.a0 == null || this.c0 == null) {
            return null;
        }
        fcv fcvVar = new fcv(this.a0);
        fcvVar.s(this.c0);
        return fcvVar;
    }

    public final NavigationBarItemView e(int i, h hVar, boolean z, boolean z2) {
        this.d0.b = true;
        hVar.setCheckable(true);
        this.d0.b = false;
        NavigationBarItemView newItem = getNewItem();
        newItem.setShifting(z);
        newItem.setLabelMaxLines(this.h0);
        newItem.setIconTintList(this.y);
        newItem.setIconSize(this.z);
        newItem.setTextColor(this.B);
        newItem.setTextAppearanceInactive(this.C);
        newItem.setTextAppearanceActive(this.D);
        newItem.setHorizontalTextAppearanceInactive(this.E);
        newItem.setHorizontalTextAppearanceActive(this.F);
        newItem.setTextAppearanceActiveBoldEnabled(this.G);
        newItem.setTextColor(this.A);
        int i2 = this.L;
        if (i2 != -1) {
            newItem.setItemPaddingTop(i2);
        }
        int i3 = this.M;
        if (i3 != -1) {
            newItem.setItemPaddingBottom(i3);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f0);
        newItem.setLabelFontScalingEnabled(this.g0);
        int i4 = this.N;
        if (i4 != -1) {
            newItem.setActiveIndicatorLabelPadding(i4);
        }
        int i5 = this.O;
        if (i5 != -1) {
            newItem.setIconLabelHorizontalSpacing(i5);
        }
        newItem.setActiveIndicatorWidth(this.Q);
        newItem.setActiveIndicatorHeight(this.R);
        newItem.setActiveIndicatorExpandedWidth(this.S);
        newItem.setActiveIndicatorExpandedHeight(this.T);
        newItem.setActiveIndicatorMarginHorizontal(this.U);
        newItem.setItemGravity(this.W);
        newItem.setActiveIndicatorExpandedPadding(this.n0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.V);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.b0);
        newItem.setActiveIndicatorEnabled(this.P);
        Drawable drawable = this.H;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.J);
        }
        newItem.setItemRippleColor(this.I);
        newItem.setLabelVisibilityMode(this.e);
        newItem.setItemIconGravity(this.f);
        newItem.setOnlyShowWhenExpanded(z2);
        newItem.setExpanded(this.j0);
        newItem.c(hVar);
        newItem.setItemPosition(i);
        int i6 = hVar.a;
        newItem.setOnTouchListener(this.d.get(i6));
        newItem.setOnClickListener(this.b);
        int i7 = this.v;
        if (i7 != 0 && i6 == i7) {
            this.w = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public abstract NavigationBarItemView f(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.N;
    }

    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.K;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.j0 ? this.e0.d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.F;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.E;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.O;
    }

    public ColorStateList getIconTintList() {
        return this.y;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.c0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.P;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.T;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.V;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.S;
    }

    public int getItemActiveIndicatorHeight() {
        return this.R;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.U;
    }

    public rx80 getItemActiveIndicatorShapeAppearance() {
        return this.a0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.Q;
    }

    public Drawable getItemBackground() {
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null && bkxVarArr.length > 0) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    return ((NavigationBarItemView) bkxVar).getBackground();
                }
            }
        }
        return this.H;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.J;
    }

    public int getItemGravity() {
        return this.W;
    }

    public int getItemIconGravity() {
        return this.f;
    }

    public int getItemIconSize() {
        return this.z;
    }

    public int getItemPaddingBottom() {
        return this.M;
    }

    public int getItemPaddingTop() {
        return this.L;
    }

    public ColorStateList getItemRippleColor() {
        return this.I;
    }

    public int getItemTextAppearanceActive() {
        return this.D;
    }

    public int getItemTextAppearanceInactive() {
        return this.C;
    }

    public ColorStateList getItemTextColor() {
        return this.A;
    }

    public int getLabelMaxLines() {
        return this.h0;
    }

    public int getLabelVisibilityMode() {
        return this.e;
    }

    public akx getMenu() {
        return this.e0;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.g0;
    }

    public int getSelectedItemId() {
        return this.v;
    }

    public int getSelectedItemPosition() {
        return this.w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c7.e.a(1, getCurrentVisibleContentItemCount(), 1).a);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.N = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.k0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.k0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.k0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.k0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.l0 = i;
    }

    public void setExpanded(boolean z) {
        this.j0 = z;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                bkxVar.setExpanded(z);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.F = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.E = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.O = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.y = colorStateList;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.c0 = colorStateList;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.P = z;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorEnabled(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.T = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.V = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedPadding(int i, int i2, int i3, int i4) {
        Rect rect = this.n0;
        rect.left = i;
        rect.top = i2;
        rect.right = i3;
        rect.bottom = i4;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorExpandedPadding(rect);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.S = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.R = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.U = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.b0 = z;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorResizeable(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(rx80 rx80Var) {
        this.a0 = rx80Var;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.Q = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.H = drawable;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.J = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.W = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.f = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.z = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setIconSize(i);
                }
            }
        }
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        SparseArray<View.OnTouchListener> sparseArray = this.d;
        if (onTouchListener == null) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, onTouchListener);
        }
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if ((bkxVar instanceof NavigationBarItemView) && bkxVar.getItemData() != null && bkxVar.getItemData().a == i) {
                    ((NavigationBarItemView) bkxVar).setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.M = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setItemPaddingBottom(this.M);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.L = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.D = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.G = z;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setTextAppearanceActiveBoldEnabled(z);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.C = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.g0 = z;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setLabelFontScalingEnabled(z);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.h0 = i;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.e = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z) {
        this.f0 = z;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) bkxVar).setMeasureBottomPaddingFromLabelBaseline(z);
                }
            }
        }
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.d0 = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.m0 == z) {
            return;
        }
        this.m0 = z;
        bkx[] bkxVarArr = this.i;
        if (bkxVarArr != null) {
            for (bkx bkxVar : bkxVarArr) {
                if (bkxVar instanceof NavigationBarDividerView) {
                    ((NavigationBarDividerView) bkxVar).setDividersEnabled(z);
                }
            }
        }
    }
}
