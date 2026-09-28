package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonGroup;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import defpackage.a2;
import defpackage.cxd0;
import defpackage.exd0;
import defpackage.fxd0;
import defpackage.gof0;
import defpackage.lbv;
import defpackage.pk30;
import defpackage.rx80;
import defpackage.tcv;
import defpackage.x4b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialButtonGroup extends LinearLayout {
    public static final /* synthetic */ int z = 0;
    public final ArrayList a;
    public final ArrayList b;
    public final a c;
    public final lbv d;
    public Integer[] e;
    public cxd0 f;
    public exd0 i;
    public int v;
    public fxd0 w;
    public boolean y;

    public class a implements MaterialButton.c {
        public a() {
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [lbv] */
    public MaterialButtonGroup(Context context, AttributeSet attributeSet, int i) {
        cxd0 cxd0VarB;
        int next;
        fxd0 fxd0Var;
        int next2;
        super(tcv.a(context, attributeSet, i, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, i);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new a();
        this.d = new Comparator() { // from class: lbv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int i2 = MaterialButtonGroup.z;
                int iCompareTo = Boolean.valueOf(materialButton.D).compareTo(Boolean.valueOf(materialButton2.D));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonGroup materialButtonGroup = this.a;
                return Integer.compare(materialButtonGroup.indexOfChild(materialButton), materialButtonGroup.indexOfChild(materialButton2));
            }
        };
        this.y = true;
        Context context2 = getContext();
        TypedArray typedArrayD = gof0.d(context2, attributeSet, pk30.C, i, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayD.hasValue(2)) {
            int resourceId = typedArrayD.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        fxd0Var = new fxd0();
                        fxd0Var.c = new int[10][];
                        fxd0Var.d = new fxd0.a[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            fxd0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                    } catch (Throwable th) {
                        if (xml == null) {
                            throw th;
                        }
                        try {
                            xml.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    fxd0Var = null;
                }
            } else {
                fxd0Var = null;
            }
            this.w = fxd0Var;
        }
        if (typedArrayD.hasValue(4)) {
            exd0 exd0VarA = exd0.a(4, context2, typedArrayD);
            this.i = exd0VarA;
            if (exd0VarA == null) {
                exd0.a aVar = new exd0.a(rx80.a(context2, typedArrayD.getResourceId(4, 0), typedArrayD.getResourceId(5, 0)).a());
                this.i = aVar.a != 0 ? new exd0(aVar) : null;
            }
        }
        if (typedArrayD.hasValue(3)) {
            a2 a2Var = new a2(0.0f);
            int resourceId2 = typedArrayD.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        cxd0 cxd0Var = new cxd0();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            cxd0Var.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                        cxd0VarB = cxd0Var;
                    } catch (Throwable th3) {
                        if (xml2 == null) {
                            throw th3;
                        }
                        try {
                            xml2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    cxd0VarB = cxd0.b(a2Var);
                }
            } else {
                cxd0VarB = cxd0.b(rx80.e(typedArrayD, 3, a2Var));
            }
            this.f = cxd0VarB;
        }
        this.v = typedArrayD.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.v <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.v - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.v - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.y = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        this.a.add(materialButton.getShapeAppearanceModel());
        this.b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.w == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Reader.READ_DONE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                int iMin2 = 0;
                if (c(i) && this.w != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    fxd0 fxd0Var = this.w;
                    int width = materialButton3.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < fxd0Var.a; i3++) {
                        fxd0.b bVar = fxd0Var.d[i3].a;
                        fxd0.c cVar = bVar.a;
                        float f = bVar.b;
                        if (cVar == fxd0.c.b) {
                            fMax = Math.max(i2, f);
                        } else {
                            if (cVar == fxd0.c.a) {
                                fMax = Math.max(i2, width * f);
                            }
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i4 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i4 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i4)) {
                                materialButton2 = (MaterialButton) getChildAt(i4);
                                break;
                            }
                            i4--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    for (int i5 = i + 1; i5 < childCount; i5++) {
                        if (c(i5)) {
                            materialButton = (MaterialButton) getChildAt(i5);
                            break;
                        }
                    }
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
        }
        int i6 = firstVisibleChildIndex;
        while (i6 <= lastVisibleChildIndex) {
            if (c(i6)) {
                ((MaterialButton) getChildAt(i6)).setSizeChange(this.w);
                ((MaterialButton) getChildAt(i6)).setWidthChangeMax((i6 == firstVisibleChildIndex || i6 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i6++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.K;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.K = null;
                materialButton.H = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        exd0.a aVar;
        int i;
        if (!(this.f == null && this.i == null) && this.y) {
            this.y = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z2 = i2 == firstVisibleChildIndex;
                    boolean z3 = i2 == lastVisibleChildIndex;
                    exd0 exd0Var = this.i;
                    if (exd0Var == null || (!z2 && !z3)) {
                        exd0Var = (exd0) this.b.get(i2);
                    }
                    if (exd0Var == null) {
                        aVar = new exd0.a((rx80) this.a.get(i2));
                    } else {
                        exd0.a aVar2 = new exd0.a();
                        int i3 = exd0Var.a;
                        aVar2.a = i3;
                        aVar2.b = exd0Var.b;
                        int[][] iArr = exd0Var.c;
                        int[][] iArr2 = new int[iArr.length][];
                        aVar2.c = iArr2;
                        rx80[] rx80VarArr = exd0Var.d;
                        aVar2.d = new rx80[rx80VarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i3);
                        System.arraycopy(rx80VarArr, 0, aVar2.d, 0, aVar2.a);
                        aVar2.e = exd0Var.e;
                        aVar2.f = exd0Var.f;
                        aVar2.g = exd0Var.g;
                        aVar2.h = exd0Var.h;
                        aVar = aVar2;
                    }
                    boolean z4 = getOrientation() == 0;
                    boolean z5 = getLayoutDirection() == 1;
                    if (z4) {
                        i = z2 ? 5 : 0;
                        if (z3) {
                            i |= 10;
                        }
                        if (z5) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z2 ? 3 : 0;
                        if (z3) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    cxd0 cxd0Var = this.f;
                    if ((i4 | 1) == i4) {
                        aVar.e = cxd0Var;
                    }
                    if ((i4 | 2) == i4) {
                        aVar.f = cxd0Var;
                    }
                    if ((i4 | 4) == i4) {
                        aVar.g = cxd0Var;
                    }
                    if ((i4 | 8) == i4) {
                        aVar.h = cxd0Var;
                    }
                    exd0 exd0Var2 = aVar.a == 0 ? null : new exd0(aVar);
                    if (exd0Var2.c()) {
                        materialButton.setStateListShapeAppearanceModel(exd0Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(exd0Var2.b());
                    }
                }
                i2++;
            }
        }
    }

    public fxd0 getButtonSizeChange() {
        return this.w;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public x4b getInnerCornerSize() {
        return this.f.b;
    }

    public cxd0 getInnerCornerSizeStateList() {
        return this.f;
    }

    public rx80 getShapeAppearance() {
        exd0 exd0Var = this.i;
        if (exd0Var == null) {
            return null;
        }
        return exd0Var.b();
    }

    public int getSpacing() {
        return this.v;
    }

    public exd0 getStateListShapeAppearance() {
        return this.i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (z2) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.a.remove(iIndexOfChild);
            this.b.remove(iIndexOfChild);
        }
        this.y = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(fxd0 fxd0Var) {
        if (this.w != fxd0Var) {
            this.w = fxd0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z2);
        }
    }

    public void setInnerCornerSize(x4b x4bVar) {
        this.f = cxd0.b(x4bVar);
        this.y = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(cxd0 cxd0Var) {
        this.f = cxd0Var;
        this.y = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.y = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(rx80 rx80Var) {
        exd0.a aVar = new exd0.a(rx80Var);
        this.i = aVar.a == 0 ? null : new exd0(aVar);
        this.y = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.v = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(exd0 exd0Var) {
        this.i = exd0Var;
        this.y = true;
        e();
        invalidate();
    }

    public MaterialButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    public MaterialButtonGroup(Context context) {
        this(context, null);
    }
}
