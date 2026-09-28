package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ixa;
import defpackage.wk30;
import defpackage.yil;
import defpackage.zj30;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {
    public int[] a;
    public int b;
    public final Context c;
    public yil d;
    public boolean e;
    public String f;
    public String i;
    public View[] v;
    public final HashMap<Integer, String> w;

    public ConstraintHelper(Context context) {
        super(context);
        this.a = new int[32];
        this.e = false;
        this.v = null;
        this.w = new HashMap<>();
        this.c = context;
        n(null);
    }

    public final void e(String str) {
        if (str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        int iL = l(strTrim);
        if (iL != 0) {
            this.w.put(Integer.valueOf(iL), strTrim);
            f(iL);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void f(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.b + 1;
        int[] iArrCopyOf = this.a;
        if (i2 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.a = iArrCopyOf;
        }
        int i3 = this.b;
        iArrCopyOf[i3] = i;
        this.b = i3 + 1;
    }

    public final void g(String str) {
        if (str.length() == 0 || this.c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    f(childAt.getId());
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    public final void h() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        i((ConstraintLayout) parent);
    }

    public final void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.b; i++) {
            View viewV = constraintLayout.v(this.a[i]);
            if (viewV != null) {
                viewV.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewV.setTranslationZ(viewV.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public final int k(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final int l(String str) {
        int iK;
        HashMap<String, Integer> map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iK = 0;
        } else {
            Integer num = (str == null || (map = constraintLayout.B) == null || !map.containsKey(str)) ? null : constraintLayout.B.get(str);
            if (num instanceof Integer) {
                iK = num.intValue();
            } else {
                iK = 0;
            }
        }
        if (iK == 0 && constraintLayout != null) {
            iK = k(constraintLayout, str);
        }
        if (iK == 0) {
            try {
                iK = zj30.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iK != 0) {
            return iK;
        }
        Context context = this.c;
        return context.getResources().getIdentifier(str, AnalyticsParam.EVENT_PARAM_ID, context.getPackageName());
    }

    public final View[] m(ConstraintLayout constraintLayout) {
        View[] viewArr = this.v;
        if (viewArr == null || viewArr.length != this.b) {
            this.v = new View[this.b];
        }
        for (int i = 0; i < this.b; i++) {
            this.v[i] = constraintLayout.v(this.a[i]);
        }
        return this.v;
    }

    public void n(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wk30.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.i = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void o(b.a aVar, yil yilVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        b.C0054b c0054b = aVar.e;
        int[] iArr = c0054b.j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = c0054b.k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = c0054b.k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int iL = l(str2.trim());
                        if (iL != 0) {
                            iArrCopyOf[i2] = iL;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    c0054b.j0 = iArrCopyOf;
                } else {
                    c0054b.j0 = null;
                }
            }
        }
        yilVar.Y();
        if (c0054b.j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = c0054b.j0;
            if (i >= iArr2.length) {
                return;
            }
            ixa ixaVar = (ixa) sparseArray.get(iArr2[i]);
            if (ixaVar != null) {
                yilVar.W(ixaVar);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.i;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(yil yilVar, SparseArray sparseArray) {
        yilVar.Y();
        for (int i = 0; i < this.b; i++) {
            yilVar.W((ixa) sparseArray.get(this.a[i]));
        }
    }

    public void setIds(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                e(str.substring(i));
                return;
            } else {
                e(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.i = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                g(str.substring(i));
                return;
            } else {
                g(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.b = 0;
        for (int i : iArr) {
            f(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            f(i);
        }
    }

    public final void t() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).q0 = this.d;
        }
    }

    public void q() {
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.e = false;
        this.v = null;
        this.w = new HashMap<>();
        this.c = context;
        n(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new int[32];
        this.e = false;
        this.v = null;
        this.w = new HashMap<>();
        this.c = context;
        n(attributeSet);
    }

    public void p(ixa ixaVar, boolean z) {
    }
}
