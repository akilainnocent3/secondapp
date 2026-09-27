package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r1 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f19664a = "android:visibilityPropagation:visibility";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19665b = "android:visibilityPropagation:center";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f19666c = {f19664a, f19665b};

    public static int d(@Nullable y0 y0Var, int i10) {
        int[] iArr;
        if (y0Var == null || (iArr = (int[]) y0Var.f19710a.get(f19665b)) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // androidx.transition.u0
    public void a(@NonNull y0 y0Var) {
        View view = y0Var.f19711b;
        Integer numValueOf = (Integer) y0Var.f19710a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        y0Var.f19710a.put(f19664a, numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        y0Var.f19710a.put(f19665b, iArr);
    }

    @Override // androidx.transition.u0
    @Nullable
    public String[] b() {
        return f19666c;
    }

    public int e(@Nullable y0 y0Var) {
        Integer num;
        if (y0Var == null || (num = (Integer) y0Var.f19710a.get(f19664a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(@Nullable y0 y0Var) {
        return d(y0Var, 0);
    }

    public int g(@Nullable y0 y0Var) {
        return d(y0Var, 1);
    }
}
