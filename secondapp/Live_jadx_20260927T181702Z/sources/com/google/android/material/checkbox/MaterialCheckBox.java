package com.google.android.material.checkbox;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.l2;
import androidx.appcompat.widget.p;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.p0;
import com.sigma.niceswitch.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.b1;
import k.t0;
import k.u;
import k.y0;
import vh.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialCheckBox extends p {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int[] E;
    public static final int[][] F;

    @SuppressLint({"DiscouragedApi"})
    public static final int G;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<d> f50524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<c> f50525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ColorStateList f50526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f50527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f50528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f50529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public CharSequence f50530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Drawable f50531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Drawable f50532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f50533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ColorStateList f50534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ColorStateList f50535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f50536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f50537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f50538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f50539u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public CharSequence f50540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f50541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final v9.c f50542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v9.b.a f50543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f50523z = ih.a.n.f92760fj;
    public static final int[] D = {ih.a.c.f90854fh};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50544b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @NonNull
        public final String c() {
            int i10 = this.f50544b;
            if (i10 != 1) {
                return i10 != 2 ? "unchecked" : "indeterminate";
            }
            return Constants.KEY_CHECKED;
        }

        @NonNull
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + c() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f50544b));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f50544b = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends v9.b.a {
        public a() {
        }

        @Override // v9.b.a
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f50534p;
            if (colorStateList != null) {
                l1.d.o(drawable, colorStateList);
            }
        }

        @Override // v9.b.a
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f50534p;
            if (colorStateList != null) {
                l1.d.n(drawable, colorStateList.getColorForState(materialCheckBox.f50538t, MaterialCheckBox.this.f50534p.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP})
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(@NonNull MaterialCheckBox materialCheckBox, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(@NonNull MaterialCheckBox materialCheckBox, boolean z10);
    }

    static {
        int i10 = ih.a.c.f90831eh;
        E = new int[]{i10};
        F = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f50537s;
        if (i10 == 1) {
            return getResources().getString(ih.a.m.W0);
        }
        return i10 == 0 ? getResources().getString(ih.a.m.Y0) : getResources().getString(ih.a.m.X0);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f50526h == null) {
            int[][] iArr = F;
            int[] iArr2 = new int[iArr.length];
            int iD = v.d(this, ih.a.c.f91069p3);
            int iD2 = v.d(this, ih.a.c.f91137s3);
            int iD3 = v.d(this, ih.a.c.f90818e4);
            int iD4 = v.d(this, ih.a.c.I3);
            iArr2[0] = v.t(iD3, iD2, 1.0f);
            iArr2[1] = v.t(iD3, iD, 1.0f);
            iArr2[2] = v.t(iD3, iD4, 0.54f);
            iArr2[3] = v.t(iD3, iD4, 0.38f);
            iArr2[4] = v.t(iD3, iD4, 0.38f);
            this.f50526h = new ColorStateList(iArr, iArr2);
        }
        return this.f50526h;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f50534p;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public void d(@NonNull c cVar) {
        this.f50525g.add(cVar);
    }

    public void e(@NonNull d dVar) {
        this.f50524f.add(dVar);
    }

    public void f() {
        this.f50525g.clear();
    }

    public void g() {
        this.f50524f.clear();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f50531m;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f50532n;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f50535q;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f50536r;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f50534p;
    }

    public int getCheckedState() {
        return this.f50537s;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f50530l;
    }

    public final boolean h(l2 l2Var) {
        return l2Var.u(ih.a.o.f93905tn, 0) == G && l2Var.u(ih.a.o.f93941un, 0) == 0;
    }

    public boolean i() {
        return this.f50528j;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f50537s == 1;
    }

    public boolean j() {
        return this.f50529k;
    }

    public boolean k() {
        return this.f50527i;
    }

    public final void l() {
        this.f50531m = zh.d.d(this.f50531m, this.f50534p, androidx.core.widget.d.c(this));
        this.f50532n = zh.d.d(this.f50532n, this.f50535q, this.f50536r);
        p();
        q();
        super.setButtonDrawable(zh.d.a(this.f50531m, this.f50532n));
        refreshDrawableState();
    }

    public void m(@NonNull c cVar) {
        this.f50525g.remove(cVar);
    }

    public void n(@NonNull d dVar) {
        this.f50524f.remove(dVar);
    }

    public final void o() {
        if (Build.VERSION.SDK_INT < 30 || this.f50540v != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f50527i && this.f50534p == null && this.f50535q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        if (j()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        this.f50538t = zh.d.f(iArrOnCreateDrawableState);
        r();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f50528j || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (p0.s(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            l1.d.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && j()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f50530l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f50544b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f50544b = getCheckedState();
        return savedState;
    }

    public final void p() {
        v9.c cVar;
        if (this.f50533o) {
            v9.c cVar2 = this.f50542x;
            if (cVar2 != null) {
                cVar2.b(this.f50543y);
                this.f50542x.c(this.f50543y);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f50531m;
                if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f50542x) == null) {
                    return;
                }
                ((AnimatedStateListDrawable) drawable).addTransition(ih.a.h.G0, ih.a.h.f92394v6, cVar, false);
                ((AnimatedStateListDrawable) this.f50531m).addTransition(ih.a.h.f92262f2, ih.a.h.f92394v6, this.f50542x, false);
            }
        }
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f50531m;
        if (drawable != null && (colorStateList2 = this.f50534p) != null) {
            l1.d.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f50532n;
        if (drawable2 == null || (colorStateList = this.f50535q) == null) {
            return;
        }
        l1.d.o(drawable2, colorStateList);
    }

    @Override // androidx.appcompat.widget.p, android.widget.CompoundButton
    public void setButtonDrawable(@u int i10) {
        setButtonDrawable(n.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f50532n = drawable;
        l();
    }

    public void setButtonIconDrawableResource(@u int i10) {
        setButtonIconDrawable(n.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f50535q == colorStateList) {
            return;
        }
        this.f50535q = colorStateList;
        l();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f50536r == mode) {
            return;
        }
        this.f50536r = mode;
        l();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f50534p == colorStateList) {
            return;
        }
        this.f50534p = colorStateList;
        l();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        l();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f50528j = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f50537s != i10) {
            this.f50537s = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            o();
            if (this.f50539u) {
                return;
            }
            this.f50539u = true;
            LinkedHashSet<c> linkedHashSet = this.f50525g;
            if (linkedHashSet != null) {
                Iterator<c> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f50537s);
                }
            }
            if (this.f50537s != 2 && (onCheckedChangeListener = this.f50541w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = com.google.android.material.checkbox.b.a(getContext().getSystemService(com.google.android.material.checkbox.a.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f50539u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        r();
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f50530l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@b1 int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f50529k == z10) {
            return;
        }
        this.f50529k = z10;
        refreshDrawableState();
        Iterator<d> it = this.f50524f.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f50529k);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f50541w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @t0(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f50540v = charSequence;
        if (charSequence == null) {
            o();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f50527i = z10;
        if (z10) {
            androidx.core.widget.d.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.d.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ih.a.c.f90816e2);
    }

    @Override // androidx.appcompat.widget.p, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f50531m = drawable;
        this.f50533o = false;
        l();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f50523z;
        super(ti.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f50524f = new LinkedHashSet<>();
        this.f50525g = new LinkedHashSet<>();
        this.f50542x = v9.c.d(getContext(), ih.a.g.G1);
        this.f50543y = new a();
        Context context2 = getContext();
        this.f50531m = androidx.core.widget.d.a(this);
        this.f50534p = getSuperButtonTintList();
        setSupportButtonTintList(null);
        l2 l2VarL = g0.l(context2, attributeSet, ih.a.o.f93869sn, i10, i11, new int[0]);
        this.f50532n = l2VarL.h(ih.a.o.f93977vn);
        if (this.f50531m != null && g0.h(context2) && h(l2VarL)) {
            super.setButtonDrawable((Drawable) null);
            this.f50531m = n.a.b(context2, ih.a.g.F1);
            this.f50533o = true;
            if (this.f50532n == null) {
                this.f50532n = n.a.b(context2, ih.a.g.H1);
            }
        }
        this.f50535q = ki.c.b(context2, l2VarL, ih.a.o.f94012wn);
        this.f50536r = p0.t(l2VarL.o(ih.a.o.f94047xn, -1), PorterDuff.Mode.SRC_IN);
        this.f50527i = l2VarL.a(ih.a.o.Dn, false);
        this.f50528j = l2VarL.a(ih.a.o.f94117zn, true);
        this.f50529k = l2VarL.a(ih.a.o.Cn, false);
        this.f50530l = l2VarL.x(ih.a.o.Bn);
        if (l2VarL.C(ih.a.o.An)) {
            setCheckedState(l2VarL.o(ih.a.o.An, 0));
        }
        l2VarL.I();
        l();
    }

    public final void r() {
    }
}
