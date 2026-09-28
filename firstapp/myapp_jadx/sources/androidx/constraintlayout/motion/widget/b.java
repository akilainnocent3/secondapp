package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout.g;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import defpackage.b9p;
import defpackage.bai0;
import defpackage.gmp;
import defpackage.l5w;
import defpackage.n5w;
import defpackage.skf;
import defpackage.sxd0;
import defpackage.u5w;
import defpackage.uf80;
import defpackage.wk30;
import defpackage.zzc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final MotionLayout a;
    public final sxd0 b;
    public C0051b c;
    public final ArrayList<C0051b> d;
    public final C0051b e;
    public final ArrayList<C0051b> f;
    public final SparseArray<androidx.constraintlayout.widget.b> g;
    public final HashMap<String, Integer> h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public MotionLayout.f o;
    public boolean p;
    public final e q;
    public float r;
    public float s;

    public class a implements Interpolator {
        public final /* synthetic */ skf a;

        public a(skf skfVar) {
            this.a = skfVar;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public b(Context context, MotionLayout motionLayout, int i) {
        this.b = null;
        this.c = null;
        ArrayList<C0051b> arrayList = new ArrayList<>();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new SparseArray<>();
        this.h = new HashMap<>();
        this.i = new SparseIntArray();
        this.j = 400;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.a = motionLayout;
        this.q = new e(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0051b c0051b = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                i(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                gmp gmpVar = new gmp(context, xml);
                                if (c0051b != null) {
                                    c0051b.k.add(gmpVar);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                k(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                d dVar = new d(context, xml);
                                e eVar = this.q;
                                eVar.b.add(dVar);
                                eVar.c = null;
                                int i2 = dVar.b;
                                if (i2 == 4) {
                                    ConstraintLayout.getSharedValues().a(dVar.u, new bai0());
                                } else if (i2 == 5) {
                                    ConstraintLayout.getSharedValues().a(dVar.u, new bai0());
                                }
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                c0051b = new C0051b(this, context, xml);
                                boolean z = c0051b.b;
                                arrayList.add(c0051b);
                                if (this.c == null && !z) {
                                    this.c = c0051b;
                                    c cVar = c0051b.l;
                                    if (cVar != null) {
                                        cVar.c(this.p);
                                    }
                                }
                                if (z) {
                                    if (c0051b.c == -1) {
                                        this.e = c0051b;
                                    } else {
                                        this.f.add(c0051b);
                                    }
                                    arrayList.remove(c0051b);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && c0051b != null && !motionLayout.isInEditMode()) {
                                c0051b.m.add(new C0051b.a(context, c0051b, xml));
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (c0051b == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (c0051b != null) {
                                    c0051b.l = new c(context, motionLayout, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                l(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.b = new sxd0(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                k(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        this.g.put(R.id.motion_base, new androidx.constraintlayout.widget.b());
        this.h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    public static int d(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), AnalyticsParam.EVENT_PARAM_ID, context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final boolean a(int i, MotionLayout motionLayout) {
        C0051b c0051b;
        if (this.o == null) {
            ArrayList<C0051b> arrayList = this.d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                C0051b c0051b2 = arrayList.get(i2);
                i2++;
                C0051b c0051b3 = c0051b2;
                int i3 = c0051b3.n;
                if (i3 != 0 && ((c0051b = this.c) != c0051b3 || (c0051b.r & 2) == 0)) {
                    int i4 = c0051b3.d;
                    MotionLayout.i iVar = MotionLayout.i.d;
                    MotionLayout.i iVar2 = MotionLayout.i.c;
                    MotionLayout.i iVar3 = MotionLayout.i.b;
                    if (i == i4 && (i3 == 4 || i3 == 2)) {
                        motionLayout.setState(iVar);
                        motionLayout.setTransition(c0051b3);
                        if (c0051b3.n == 4) {
                            motionLayout.T();
                            motionLayout.setState(iVar3);
                            motionLayout.setState(iVar2);
                            return true;
                        }
                        motionLayout.setProgress(1.0f);
                        motionLayout.G(true);
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                        motionLayout.setState(iVar);
                        motionLayout.O();
                        return true;
                    }
                    if (i == c0051b3.c && (i3 == 3 || i3 == 1)) {
                        motionLayout.setState(iVar);
                        motionLayout.setTransition(c0051b3);
                        if (c0051b3.n == 3) {
                            motionLayout.U();
                            motionLayout.setState(iVar3);
                            motionLayout.setState(iVar2);
                            return true;
                        }
                        motionLayout.setProgress(0.0f);
                        motionLayout.G(true);
                        motionLayout.setState(iVar3);
                        motionLayout.setState(iVar2);
                        motionLayout.setState(iVar);
                        motionLayout.O();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.b b(int i) {
        int iA;
        sxd0 sxd0Var = this.b;
        if (sxd0Var != null && (iA = sxd0Var.a(i)) != -1) {
            i = iA;
        }
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.g;
        if (sparseArray.get(i) != null) {
            return sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + zzc.c(this.a.getContext(), i) + " In MotionScene");
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        C0051b c0051b = this.c;
        return c0051b != null ? c0051b.h : this.j;
    }

    public final Interpolator e() {
        C0051b c0051b = this.c;
        int i = c0051b.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i == -1) {
            return new a(skf.c(c0051b.f));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void f(n5w n5wVar) {
        C0051b c0051b = this.c;
        int i = 0;
        if (c0051b != null) {
            ArrayList<gmp> arrayList = c0051b.k;
            int size = arrayList.size();
            while (i < size) {
                gmp gmpVar = arrayList.get(i);
                i++;
                gmpVar.a(n5wVar);
            }
            return;
        }
        C0051b c0051b2 = this.e;
        if (c0051b2 != null) {
            ArrayList<gmp> arrayList2 = c0051b2.k;
            int size2 = arrayList2.size();
            while (i < size2) {
                gmp gmpVar2 = arrayList2.get(i);
                i++;
                gmpVar2.a(n5wVar);
            }
        }
    }

    public final float g() {
        c cVar;
        C0051b c0051b = this.c;
        if (c0051b == null || (cVar = c0051b.l) == null) {
            return 0.0f;
        }
        return cVar.t;
    }

    public final int h() {
        C0051b c0051b = this.c;
        if (c0051b == null) {
            return -1;
        }
        return c0051b.d;
    }

    public final int i(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iD = -1;
        int iD2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iD2 = d(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        bVar.d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                bVar.d = 4;
                                break;
                            case "left":
                                bVar.d = 2;
                                break;
                            case "none":
                                bVar.d = 0;
                                break;
                            case "right":
                                bVar.d = 1;
                                break;
                            case "x_right":
                                bVar.d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iD = d(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.h.put(attributeValue, Integer.valueOf(iD));
                    bVar.a = zzc.c(context, iD);
                    break;
                case "stateLabels":
                    bVar.c = attributeValue.split(",");
                    int i2 = 0;
                    while (true) {
                        String[] strArr = bVar.c;
                        if (i2 < strArr.length) {
                            strArr[i2] = strArr[i2].trim();
                            i2++;
                        }
                    }
                    break;
            }
        }
        if (iD != -1) {
            int i3 = this.a.c0;
            bVar.r(context, xmlResourceParser);
            if (iD2 != -1) {
                this.i.put(iD, iD2);
            }
            this.g.put(iD, bVar);
        }
        return iD;
    }

    public final int j(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return i(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), wk30.H);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                j(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), wk30.w);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(int i, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.g;
        androidx.constraintlayout.widget.b bVar = sparseArray.get(i);
        String str = bVar.a;
        HashMap<Integer, androidx.constraintlayout.widget.b.a> map = bVar.g;
        bVar.b = str;
        int i2 = this.i.get(i);
        if (i2 > 0) {
            m(i2, motionLayout);
            androidx.constraintlayout.widget.b bVar2 = sparseArray.get(i2);
            if (bVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + zzc.c(this.a.getContext(), i2));
                return;
            }
            HashMap<Integer, androidx.constraintlayout.widget.b.a> map2 = bVar2.g;
            bVar.b += "/" + bVar2.b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                androidx.constraintlayout.widget.b.a aVar = map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new androidx.constraintlayout.widget.b.a());
                }
                androidx.constraintlayout.widget.b.a aVar2 = map.get(num);
                if (aVar2 != null) {
                    androidx.constraintlayout.widget.b.C0054b c0054b = aVar2.e;
                    if (!c0054b.b) {
                        c0054b.a(aVar.e);
                    }
                    androidx.constraintlayout.widget.b.d dVar = aVar2.c;
                    if (!dVar.a) {
                        androidx.constraintlayout.widget.b.d dVar2 = aVar.c;
                        dVar.a = dVar2.a;
                        dVar.b = dVar2.b;
                        dVar.d = dVar2.d;
                        dVar.e = dVar2.e;
                        dVar.c = dVar2.c;
                    }
                    androidx.constraintlayout.widget.b.e eVar = aVar2.f;
                    if (!eVar.a) {
                        eVar.a(aVar.f);
                    }
                    androidx.constraintlayout.widget.b.c cVar = aVar2.d;
                    if (!cVar.a) {
                        cVar.a(aVar.d);
                    }
                    for (String str2 : aVar.g.keySet()) {
                        if (!aVar2.g.containsKey(str2)) {
                            aVar2.g.put(str2, aVar.g.get(str2));
                        }
                    }
                }
            }
        } else {
            bVar.b = uf80.a(new StringBuilder(), bVar.b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id = childAt.getId();
                if (bVar.f && id == -1) {
                    b9p.a("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new androidx.constraintlayout.widget.b.a());
                }
                androidx.constraintlayout.widget.b.a aVar3 = map.get(Integer.valueOf(id));
                if (aVar3 != null) {
                    androidx.constraintlayout.widget.b.d dVar3 = aVar3.c;
                    androidx.constraintlayout.widget.b.C0054b c0054b2 = aVar3.e;
                    androidx.constraintlayout.widget.b.e eVar2 = aVar3.f;
                    if (!c0054b2.b) {
                        aVar3.c(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            c0054b2.j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                c0054b2.o0 = barrier.getAllowsGoneWidget();
                                c0054b2.g0 = barrier.getType();
                                c0054b2.h0 = barrier.getMargin();
                            }
                        }
                        c0054b2.b = true;
                    }
                    if (!dVar3.a) {
                        dVar3.b = childAt.getVisibility();
                        dVar3.d = childAt.getAlpha();
                        dVar3.a = true;
                    }
                    if (!eVar2.a) {
                        eVar2.a = true;
                        eVar2.b = childAt.getRotation();
                        eVar2.c = childAt.getRotationX();
                        eVar2.d = childAt.getRotationY();
                        eVar2.e = childAt.getScaleX();
                        eVar2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            eVar2.g = pivotX;
                            eVar2.h = pivotY;
                        }
                        eVar2.j = childAt.getTranslationX();
                        eVar2.k = childAt.getTranslationY();
                        eVar2.l = childAt.getTranslationZ();
                        if (eVar2.m) {
                            eVar2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.b.a aVar4 : map.values()) {
            if (aVar4.h != null) {
                if (aVar4.b == null) {
                    aVar4.h.e(bVar.p(aVar4.a));
                } else {
                    Iterator<Integer> it = map.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.b.a aVarP = bVar.p(it.next().intValue());
                        String str3 = aVarP.e.l0;
                        if (str3 != null && aVar4.b.matches(str3)) {
                            aVar4.h.e(aVarP);
                            aVarP.g.putAll((HashMap) aVar4.g.clone());
                        }
                    }
                }
            }
        }
    }

    public final void n(MotionLayout motionLayout) {
        int i = 0;
        while (true) {
            SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.g;
            if (i >= sparseArray.size()) {
                return;
            }
            int iKeyAt = sparseArray.keyAt(i);
            SparseIntArray sparseIntArray = this.i;
            int i2 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (i2 > 0) {
                if (i2 != iKeyAt) {
                    int i3 = size - 1;
                    if (size >= 0) {
                        i2 = sparseIntArray.get(i2);
                        size = i3;
                    }
                }
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            m(iKeyAt, motionLayout);
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public final void o(int i, int i2) {
        int iA;
        int iA2;
        C0051b c0051b;
        ArrayList<C0051b> arrayList;
        int size;
        int i3;
        int i4;
        ArrayList<C0051b> arrayList2;
        int size2;
        C0051b c0051b2;
        C0051b c0051b3;
        C0051b c0051b4;
        C0051b c0051b5;
        int i5;
        c cVar;
        sxd0 sxd0Var = this.b;
        if (sxd0Var != null) {
            iA = sxd0Var.a(i);
            if (iA == -1) {
                iA = i;
            }
            iA2 = sxd0Var.a(i2);
            if (iA2 == -1) {
            }
            c0051b = this.c;
            if (c0051b == null && c0051b.c == i2 && c0051b.d == i) {
                return;
            }
            arrayList = this.d;
            size = arrayList.size();
            i3 = 0;
            i4 = 0;
            while (true) {
                if (i4 < size) {
                    arrayList2 = this.f;
                    size2 = arrayList2.size();
                    c0051b2 = this.e;
                    while (i3 < size2) {
                        C0051b c0051b6 = arrayList2.get(i3);
                        i3++;
                        c0051b4 = c0051b6;
                        if (c0051b4.c == i2) {
                            c0051b2 = c0051b4;
                        }
                    }
                    c0051b3 = new C0051b(this, c0051b2);
                    c0051b3.d = iA;
                    c0051b3.c = iA2;
                    if (iA != -1) {
                        arrayList.add(c0051b3);
                    }
                    this.c = c0051b3;
                    return;
                }
                C0051b c0051b7 = arrayList.get(i4);
                i4++;
                c0051b5 = c0051b7;
                i5 = c0051b5.c;
                if ((i5 != iA2 && c0051b5.d == iA) || (i5 == i2 && c0051b5.d == i)) {
                    break;
                }
            }
            this.c = c0051b5;
            cVar = c0051b5.l;
            if (cVar != null) {
                cVar.c(this.p);
            }
        }
        iA = i;
        iA2 = i2;
        c0051b = this.c;
        if (c0051b == null) {
        }
        arrayList = this.d;
        size = arrayList.size();
        i3 = 0;
        i4 = 0;
        while (true) {
            if (i4 < size) {
                arrayList2 = this.f;
                size2 = arrayList2.size();
                c0051b2 = this.e;
                while (i3 < size2) {
                    C0051b c0051b8 = arrayList2.get(i3);
                    i3++;
                    c0051b4 = c0051b8;
                    if (c0051b4.c == i2) {
                        c0051b2 = c0051b4;
                    }
                }
                c0051b3 = new C0051b(this, c0051b2);
                c0051b3.d = iA;
                c0051b3.c = iA2;
                if (iA != -1) {
                    arrayList.add(c0051b3);
                }
                this.c = c0051b3;
                return;
            }
            C0051b c0051b9 = arrayList.get(i4);
            i4++;
            c0051b5 = c0051b9;
            i5 = c0051b5.c;
            if (i5 != iA2) {
            }
        }
        this.c = c0051b5;
        cVar = c0051b5.l;
        if (cVar != null) {
            cVar.c(this.p);
        }
    }

    public final boolean p() {
        ArrayList<C0051b> arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C0051b c0051b = arrayList.get(i);
            i++;
            if (c0051b.l != null) {
                return true;
            }
        }
        C0051b c0051b2 = this.c;
        return (c0051b2 == null || c0051b2.l == null) ? false : true;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.b$b, reason: collision with other inner class name */
    public static class C0051b {
        public final int a;
        public final boolean b;
        public int c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public final float i;
        public final b j;
        public final ArrayList<gmp> k;
        public c l;
        public final ArrayList<a> m;
        public int n;
        public final boolean o;
        public int p;
        public final int q;
        public final int r;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.b$b$a */
        public static class a implements View.OnClickListener {
            public final C0051b a;
            public final int b;
            public final int c;

            public a(Context context, C0051b c0051b, XmlResourceParser xmlResourceParser) {
                this.b = -1;
                this.c = 17;
                this.a = c0051b;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), wk30.y);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    } else if (index == 0) {
                        this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public final void a(MotionLayout motionLayout, int i, C0051b c0051b) {
                boolean z;
                View viewFindViewById;
                int i2 = this.b;
                View view = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    view = viewFindViewById;
                    Log.e("MotionScene", "OnClick could not find id " + i2);
                    return;
                }
                int i3 = c0051b.d;
                int i4 = c0051b.c;
                if (i3 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i5 = this.c;
                int i6 = i5 & 1;
                boolean z2 = false;
                if (i6 == 0 || i != i3) {
                    view = viewFindViewById;
                    z = false;
                } else {
                    z = true;
                }
                boolean z3 = (i6 != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z2 = true;
                }
                if (z3 || z2) {
                    view.setOnClickListener(this);
                }
            }

            public final void b(MotionLayout motionLayout) {
                int i = this.b;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sxd0 sxd0Var;
                sxd0.b bVar;
                C0051b c0051b = this.a;
                b bVar2 = c0051b.j;
                MotionLayout motionLayout = bVar2.a;
                if (motionLayout.O) {
                    int i = 0;
                    boolean z = true;
                    if (c0051b.d != -1) {
                        C0051b c0051b2 = bVar2.c;
                        int i2 = this.c;
                        int i3 = i2 & 1;
                        int i4 = (i3 == 0 && (i2 & 256) == 0) ? 0 : 1;
                        int i5 = i2 & 16;
                        if (i5 == 0 && (i2 & 4096) == 0) {
                            z = false;
                        }
                        if (i4 == 0 || !z) {
                            i = i4;
                        } else {
                            if (c0051b2 != c0051b) {
                                motionLayout.setTransition(c0051b);
                            }
                            if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                                z = false;
                                i = i4;
                            }
                        }
                        if (c0051b != c0051b2) {
                            int i6 = c0051b.c;
                            int i7 = c0051b.d;
                            int i8 = motionLayout.K;
                            if (i7 == -1) {
                                if (i8 == i6) {
                                    return;
                                }
                            } else if (i8 != i7 && i8 != i6) {
                                return;
                            }
                        }
                        if (i != 0 && i3 != 0) {
                            motionLayout.setTransition(c0051b);
                            motionLayout.T();
                            return;
                        }
                        if (z && i5 != 0) {
                            motionLayout.setTransition(c0051b);
                            motionLayout.U();
                            return;
                        } else if (i != 0 && (i2 & 256) != 0) {
                            motionLayout.setTransition(c0051b);
                            motionLayout.setProgress(1.0f);
                            return;
                        } else {
                            if (!z || (i2 & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(c0051b);
                            motionLayout.setProgress(0.0f);
                            return;
                        }
                    }
                    int currentState = motionLayout.getCurrentState();
                    if (currentState != -1) {
                        C0051b c0051b3 = new C0051b(bVar2, c0051b);
                        c0051b3.d = currentState;
                        c0051b3.c = c0051b.c;
                        motionLayout.setTransition(c0051b3);
                        motionLayout.T();
                        return;
                    }
                    int i9 = c0051b.c;
                    if (!motionLayout.isAttachedToWindow()) {
                        MotionLayout.g gVar = motionLayout.J0;
                        if (gVar == null) {
                            gVar = motionLayout.new g();
                            motionLayout.J0 = gVar;
                        }
                        gVar.d = i9;
                        return;
                    }
                    MotionLayout.e eVar = motionLayout.O0;
                    HashMap<View, n5w> map = motionLayout.P;
                    b bVar3 = motionLayout.F;
                    if (bVar3 != null && (sxd0Var = bVar3.b) != null) {
                        int i10 = motionLayout.K;
                        sxd0.a aVar = sxd0Var.b.get(i9);
                        if (aVar != null) {
                            ArrayList<sxd0.b> arrayList = aVar.b;
                            int i11 = aVar.c;
                            if (i11 != i10) {
                                int size = arrayList.size();
                                int i12 = 0;
                                do {
                                    if (i12 >= size) {
                                        i10 = i11;
                                        break;
                                    } else {
                                        bVar = arrayList.get(i12);
                                        i12++;
                                    }
                                } while (i10 != bVar.e);
                            }
                        } else {
                            i10 = i9;
                        }
                        if (i10 != -1) {
                            i9 = i10;
                        }
                    }
                    int i13 = motionLayout.K;
                    if (i13 == i9) {
                        return;
                    }
                    if (motionLayout.J == i9) {
                        motionLayout.E(0.0f);
                        return;
                    }
                    if (motionLayout.L == i9) {
                        motionLayout.E(1.0f);
                        return;
                    }
                    motionLayout.L = i9;
                    if (i13 != -1) {
                        motionLayout.setTransition(i13, i9);
                        motionLayout.E(1.0f);
                        motionLayout.T = 0.0f;
                        motionLayout.T();
                        return;
                    }
                    motionLayout.e0 = false;
                    motionLayout.V = 1.0f;
                    motionLayout.S = 0.0f;
                    motionLayout.T = 0.0f;
                    motionLayout.U = motionLayout.getNanoTime();
                    motionLayout.Q = motionLayout.getNanoTime();
                    motionLayout.W = false;
                    motionLayout.G = null;
                    motionLayout.R = motionLayout.F.c() / 1000.0f;
                    motionLayout.J = -1;
                    motionLayout.F.o(-1, motionLayout.L);
                    SparseArray sparseArray = new SparseArray();
                    int childCount = motionLayout.getChildCount();
                    map.clear();
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = motionLayout.getChildAt(i14);
                        map.put(childAt, new n5w(childAt));
                        sparseArray.put(childAt.getId(), map.get(childAt));
                    }
                    motionLayout.a0 = true;
                    eVar.e(null, motionLayout.F.b(i9));
                    motionLayout.Q();
                    eVar.a();
                    int childCount2 = motionLayout.getChildCount();
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        View childAt2 = motionLayout.getChildAt(i15);
                        n5w n5wVar = map.get(childAt2);
                        if (n5wVar != null) {
                            u5w u5wVar = n5wVar.f;
                            u5wVar.c = 0.0f;
                            u5wVar.d = 0.0f;
                            u5wVar.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                            l5w l5wVar = n5wVar.h;
                            childAt2.getX();
                            childAt2.getY();
                            childAt2.getWidth();
                            childAt2.getHeight();
                            l5wVar.b(childAt2);
                        }
                    }
                    int width = motionLayout.getWidth();
                    int height = motionLayout.getHeight();
                    if (motionLayout.s0 != null) {
                        for (int i16 = 0; i16 < childCount; i16++) {
                            n5w n5wVar2 = map.get(motionLayout.getChildAt(i16));
                            if (n5wVar2 != null) {
                                motionLayout.F.f(n5wVar2);
                            }
                        }
                        ArrayList<MotionHelper> arrayList2 = motionLayout.s0;
                        int size2 = arrayList2.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            MotionHelper motionHelper = arrayList2.get(i17);
                            i17++;
                            motionHelper.u(motionLayout, map);
                        }
                        for (int i18 = 0; i18 < childCount; i18++) {
                            n5w n5wVar3 = map.get(motionLayout.getChildAt(i18));
                            if (n5wVar3 != null) {
                                n5wVar3.i(width, motionLayout.getNanoTime(), height);
                            }
                        }
                    } else {
                        for (int i19 = 0; i19 < childCount; i19++) {
                            n5w n5wVar4 = map.get(motionLayout.getChildAt(i19));
                            if (n5wVar4 != null) {
                                motionLayout.F.f(n5wVar4);
                                n5wVar4.i(width, motionLayout.getNanoTime(), height);
                            }
                        }
                    }
                    C0051b c0051b4 = motionLayout.F.c;
                    float f = c0051b4 != null ? c0051b4.i : 0.0f;
                    if (f != 0.0f) {
                        float fMin = Float.MAX_VALUE;
                        float fMax = -3.4028235E38f;
                        for (int i20 = 0; i20 < childCount; i20++) {
                            u5w u5wVar2 = map.get(motionLayout.getChildAt(i20)).g;
                            float f2 = u5wVar2.f + u5wVar2.e;
                            fMin = Math.min(fMin, f2);
                            fMax = Math.max(fMax, f2);
                        }
                        while (i < childCount) {
                            n5w n5wVar5 = map.get(motionLayout.getChildAt(i));
                            u5w u5wVar3 = n5wVar5.g;
                            float f3 = u5wVar3.e;
                            float f4 = u5wVar3.f;
                            n5wVar5.n = 1.0f / (1.0f - f);
                            n5wVar5.m = f - ((((f3 + f4) - fMin) * f) / (fMax - fMin));
                            i++;
                        }
                    }
                    motionLayout.S = 0.0f;
                    motionLayout.T = 0.0f;
                    motionLayout.a0 = true;
                    motionLayout.invalidate();
                }
            }
        }

        public C0051b(b bVar, Context context, XmlResourceParser xmlResourceParser) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.r = 0;
            int i = bVar.j;
            SparseArray<androidx.constraintlayout.widget.b> sparseArray = bVar.g;
            this.h = i;
            this.q = bVar.k;
            this.j = bVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), wk30.E);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 2) {
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        bVar2.q(context, this.c);
                        sparseArray.append(this.c, bVar2);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.c = bVar.j(context, this.c);
                    }
                } else if (index == 3) {
                    this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
                        bVar3.q(context, this.d);
                        sparseArray.append(this.d, bVar3);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = bVar.j(context, this.d);
                    }
                } else if (index == 6) {
                    int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i3 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    }
                } else if (index == 4) {
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, this.h);
                    this.h = i4;
                    if (i4 < 8) {
                        this.h = 8;
                    }
                } else if (index == 8) {
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                } else if (index == 1) {
                    this.n = typedArrayObtainStyledAttributes.getInteger(index, this.n);
                } else if (index == 0) {
                    this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 9) {
                    this.o = typedArrayObtainStyledAttributes.getBoolean(index, this.o);
                } else if (index == 7) {
                    this.p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final void a(int i) {
            this.h = Math.max(i, 8);
        }

        public C0051b(b bVar, int i) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.a = -1;
            this.j = bVar;
            this.d = R.id.view_transition;
            this.c = i;
            this.h = bVar.j;
            this.q = bVar.k;
        }

        public C0051b(b bVar, C0051b c0051b) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = bVar;
            this.h = bVar.j;
            if (c0051b != null) {
                this.p = c0051b.p;
                this.e = c0051b.e;
                this.f = c0051b.f;
                this.g = c0051b.g;
                this.h = c0051b.h;
                this.k = c0051b.k;
                this.i = c0051b.i;
                this.q = c0051b.q;
            }
        }
    }
}
