package g2;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityRecord f85945a;

    @Deprecated
    public t0(Object obj) {
        this.f85945a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static t0 A(t0 t0Var) {
        return new t0(AccessibilityRecord.obtain(t0Var.f85945a));
    }

    public static void N(@NonNull AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    public static void P(@NonNull AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    public static void Y(@NonNull AccessibilityRecord accessibilityRecord, @Nullable View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }

    public static int j(@NonNull AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int l(@NonNull AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static t0 z() {
        return new t0(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f85945a.recycle();
    }

    @Deprecated
    public void C(int i10) {
        this.f85945a.setAddedCount(i10);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f85945a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z10) {
        this.f85945a.setChecked(z10);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f85945a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f85945a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i10) {
        this.f85945a.setCurrentItemIndex(i10);
    }

    @Deprecated
    public void I(boolean z10) {
        this.f85945a.setEnabled(z10);
    }

    @Deprecated
    public void J(int i10) {
        this.f85945a.setFromIndex(i10);
    }

    @Deprecated
    public void K(boolean z10) {
        this.f85945a.setFullScreen(z10);
    }

    @Deprecated
    public void L(int i10) {
        this.f85945a.setItemCount(i10);
    }

    @Deprecated
    public void M(int i10) {
        N(this.f85945a, i10);
    }

    @Deprecated
    public void O(int i10) {
        P(this.f85945a, i10);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f85945a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z10) {
        this.f85945a.setPassword(z10);
    }

    @Deprecated
    public void S(int i10) {
        this.f85945a.setRemovedCount(i10);
    }

    @Deprecated
    public void T(int i10) {
        this.f85945a.setScrollX(i10);
    }

    @Deprecated
    public void U(int i10) {
        this.f85945a.setScrollY(i10);
    }

    @Deprecated
    public void V(boolean z10) {
        this.f85945a.setScrollable(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view) {
        this.f85945a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i10) {
        Y(this.f85945a, view, i10);
    }

    @Deprecated
    public void Z(int i10) {
        this.f85945a.setToIndex(i10);
    }

    @Deprecated
    public int a() {
        return this.f85945a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f85945a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f85945a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f85945a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f85945a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        AccessibilityRecord accessibilityRecord = this.f85945a;
        if (accessibilityRecord == null) {
            return t0Var.f85945a == null;
        }
        return accessibilityRecord.equals(t0Var.f85945a);
    }

    @Deprecated
    public int f() {
        return this.f85945a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f85945a;
    }

    @Deprecated
    public int h() {
        return this.f85945a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f85945a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return j(this.f85945a);
    }

    @Deprecated
    public int k() {
        return l(this.f85945a);
    }

    @Deprecated
    public Parcelable m() {
        return this.f85945a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f85945a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f85945a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f85945a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public n0 q() {
        return n0.s2(this.f85945a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f85945a.getText();
    }

    @Deprecated
    public int s() {
        return this.f85945a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f85945a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f85945a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f85945a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f85945a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f85945a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f85945a.isScrollable();
    }
}
