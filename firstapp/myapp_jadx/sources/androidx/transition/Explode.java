package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.sportybet.android.gp.tz.R;
import defpackage.bug0;
import defpackage.no7;

/* JADX INFO: loaded from: classes.dex */
public class Explode extends Visibility {
    public static final DecelerateInterpolator Z = new DecelerateInterpolator();
    public static final AccelerateInterpolator a0 = new AccelerateInterpolator();
    public final int[] Y;

    public Explode() {
        this.Y = new int[2];
        this.M = new no7();
    }

    @Override // androidx.transition.Visibility
    public final Animator R(ViewGroup viewGroup, View view, bug0 bug0Var, bug0 bug0Var2) {
        if (bug0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) bug0Var2.a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = this.Y;
        U(viewGroup, rect, iArr);
        return g.a(view, bug0Var2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, Z, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator S(ViewGroup viewGroup, View view, bug0 bug0Var, bug0 bug0Var2) {
        float f;
        float f2;
        if (bug0Var == null) {
            return null;
        }
        Rect rect = (Rect) bug0Var.a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) bug0Var.b.getTag(R.id.transition_position);
        if (iArr != null) {
            int i3 = iArr[0];
            f = (i3 - rect.left) + translationX;
            int i4 = iArr[1];
            f2 = (i4 - rect.top) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f = translationX;
            f2 = translationY;
        }
        int[] iArr2 = this.Y;
        U(viewGroup, rect, iArr2);
        return g.a(view, bug0Var, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], a0, this);
    }

    public final void U(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.Y;
        viewGroup.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        Transition.c cVar = this.N;
        Rect rectA = cVar == null ? null : cVar.a();
        if (rectA == null) {
            iCenterX = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i;
            iCenterY = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i2;
        } else {
            iCenterX = rectA.centerX();
            iCenterY = rectA.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i3 = iCenterX - i;
        int i4 = iCenterY - i2;
        float fMax = Math.max(i3, viewGroup.getWidth() - i3);
        float fMax2 = Math.max(i4, viewGroup.getHeight() - i4);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    public final void V(bug0 bug0Var) {
        View view = bug0Var.b;
        int[] iArr = this.Y;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        bug0Var.a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void d(bug0 bug0Var) {
        Visibility.P(bug0Var);
        V(bug0Var);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(bug0 bug0Var) {
        Visibility.P(bug0Var);
        V(bug0Var);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y = new int[2];
        this.M = new no7();
    }
}
