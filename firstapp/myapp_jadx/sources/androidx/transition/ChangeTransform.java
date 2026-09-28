package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.sportybet.android.gp.tz.R;
import defpackage.bug0;
import defpackage.g9h0;
import defpackage.g9i0;
import defpackage.gqm;
import defpackage.h630;
import defpackage.hai0;
import defpackage.hb5;
import defpackage.hdv;
import defpackage.ib5;
import defpackage.lhk;
import defpackage.mhk;
import defpackage.nhk;
import defpackage.ohk;
import defpackage.qwh;
import defpackage.r6i0;
import defpackage.u7i0;
import defpackage.xbe0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ChangeTransform extends Transition {
    public static final String[] Z = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final a a0 = new a(float[].class, "nonTranslations");
    public static final b b0 = new b(PointF.class, "translations");
    public static final boolean c0 = true;
    public final boolean W;
    public final boolean X;
    public final Matrix Y;

    public class a extends Property<e, float[]> {
        @Override // android.util.Property
        public final float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(e eVar, float[] fArr) {
            e eVar2 = eVar;
            float[] fArr2 = fArr;
            System.arraycopy(fArr2, 0, eVar2.c, 0, fArr2.length);
            eVar2.a();
        }
    }

    public class b extends Property<e, PointF> {
        @Override // android.util.Property
        public final PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(e eVar, PointF pointF) {
            e eVar2 = eVar;
            PointF pointF2 = pointF;
            eVar2.getClass();
            eVar2.d = pointF2.x;
            eVar2.e = pointF2.y;
            eVar2.a();
        }
    }

    public static class c extends androidx.transition.d {
        public View a;
        public lhk b;

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void a() {
            this.b.setVisibility(4);
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void f() {
            this.b.setVisibility(0);
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void j(Transition transition) {
            transition.B(this);
            View view = this.a;
            if (Build.VERSION.SDK_INT == 28) {
                if (!nhk.i) {
                    try {
                        nhk.b();
                        Method declaredMethod = nhk.b.getDeclaredMethod("removeGhost", View.class);
                        nhk.f = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
                    }
                    nhk.i = true;
                }
                Method method = nhk.f;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e2) {
                        gqm.a(e2.getCause());
                        return;
                    }
                }
            } else {
                int i = ohk.i;
                ohk ohkVar = (ohk) view.getTag(R.id.ghost_view);
                if (ohkVar != null) {
                    int i2 = ohkVar.d - 1;
                    ohkVar.d = i2;
                    if (i2 <= 0) {
                        ((mhk) ohkVar.getParent()).removeView(ohkVar);
                    }
                }
            }
            view.setTag(R.id.transition_transform, null);
            view.setTag(R.id.parent_matrix, null);
        }
    }

    public static class d extends AnimatorListenerAdapter {
        public boolean a;
        public final Matrix b = new Matrix();
        public final boolean c;
        public final boolean d;
        public final View e;
        public final f f;
        public final e i;
        public final Matrix v;

        public d(View view, f fVar, e eVar, Matrix matrix, boolean z, boolean z2) {
            this.c = z;
            this.d = z2;
            this.e = view;
            this.f = fVar;
            this.i = eVar;
            this.v = matrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z = this.a;
            f fVar = this.f;
            View view = this.e;
            if (!z) {
                if (this.c && this.d) {
                    Matrix matrix = this.b;
                    matrix.set(this.v);
                    view.setTag(R.id.transition_transform, matrix);
                    float f = fVar.a;
                    float f2 = fVar.b;
                    float f3 = fVar.c;
                    float f4 = fVar.d;
                    float f5 = fVar.e;
                    float f6 = fVar.f;
                    float f7 = fVar.g;
                    float f8 = fVar.h;
                    String[] strArr = ChangeTransform.Z;
                    view.setTranslationX(f);
                    view.setTranslationY(f2);
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    r6i0.d.p(view, f3);
                    view.setScaleX(f4);
                    view.setScaleY(f5);
                    view.setRotationX(f6);
                    view.setRotationY(f7);
                    view.setRotation(f8);
                } else {
                    view.setTag(R.id.transition_transform, null);
                    view.setTag(R.id.parent_matrix, null);
                }
            }
            hai0.a.c(view, null);
            float f9 = fVar.a;
            float f10 = fVar.b;
            float f11 = fVar.c;
            float f12 = fVar.d;
            float f13 = fVar.e;
            float f14 = fVar.f;
            float f15 = fVar.g;
            float f16 = fVar.h;
            String[] strArr2 = ChangeTransform.Z;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
            r6i0.d.p(view, f11);
            view.setScaleX(f12);
            view.setScaleY(f13);
            view.setRotationX(f14);
            view.setRotationY(f15);
            view.setRotation(f16);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = this.i.a;
            Matrix matrix2 = this.b;
            matrix2.set(matrix);
            View view = this.e;
            view.setTag(R.id.transition_transform, matrix2);
            f fVar = this.f;
            float f = fVar.a;
            float f2 = fVar.b;
            float f3 = fVar.c;
            float f4 = fVar.d;
            float f5 = fVar.e;
            float f6 = fVar.f;
            float f7 = fVar.g;
            float f8 = fVar.h;
            String[] strArr = ChangeTransform.Z;
            view.setTranslationX(f);
            view.setTranslationY(f2);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.p(view, f3);
            view.setScaleX(f4);
            view.setScaleY(f5);
            view.setRotationX(f6);
            view.setRotationY(f7);
            view.setRotation(f8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            String[] strArr = ChangeTransform.Z;
            View view = this.e;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.p(view, 0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            view.setRotation(0.0f);
        }
    }

    public static class e {
        public final Matrix a = new Matrix();
        public final View b;
        public final float[] c;
        public float d;
        public float e;

        public e(View view, float[] fArr) {
            this.b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            a();
        }

        public final void a() {
            float f = this.d;
            float[] fArr = this.c;
            fArr[2] = f;
            fArr[5] = this.e;
            Matrix matrix = this.a;
            matrix.setValues(fArr);
            hai0.a.c(this.b, matrix);
        }
    }

    public static class f {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public f(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            this.c = r6i0.d.g(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a == this.a && fVar.b == this.b && fVar.c == this.c && fVar.d == this.d && fVar.e == this.e && fVar.f == this.f && fVar.g == this.g && fVar.h == this.h;
        }

        public final int hashCode() {
            float f = this.a;
            int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.h;
            return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = true;
        this.X = true;
        this.Y = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xbe0.e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.W = !g9h0.e(xmlPullParser, "reparentWithOverlay") ? true : typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.X = g9h0.e(xmlPullParser, "reparent") ? typedArrayObtainStyledAttributes.getBoolean(0, true) : true;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void P(bug0 bug0Var) {
        View view = bug0Var.b;
        HashMap map = bug0Var.a;
        if (view.getVisibility() == 8) {
            return;
        }
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new f(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.X) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            hai0.a.d(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    @Override // androidx.transition.Transition
    public final void d(bug0 bug0Var) {
        P(bug0Var);
    }

    @Override // androidx.transition.Transition
    public final void g(bug0 bug0Var) {
        P(bug0Var);
        View view = bug0Var.b;
        if (c0) {
            return;
        }
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, bug0 bug0Var, bug0 bug0Var2) {
        int i;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        Object obj;
        ObjectAnimator objectAnimator;
        int i2;
        ohk ohkVar;
        boolean z;
        ohk ohkVar2;
        mhk mhkVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ObjectAnimator objectAnimator2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int iIntValue;
        mhk mhkVar2;
        lhk lhkVar;
        nhk nhkVar;
        bug0 bug0VarP;
        if (bug0Var == null) {
            return null;
        }
        View view = bug0Var.b;
        HashMap map = bug0Var.a;
        if (bug0Var2 == null) {
            return null;
        }
        View view2 = bug0Var2.b;
        HashMap map2 = bug0Var2.a;
        if (!map.containsKey("android:changeTransform:parent") || !map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        View view3 = (ViewGroup) map2.get("android:changeTransform:parent");
        boolean z3 = this.X && (!(x(viewGroup2) && x(view3)) ? viewGroup2 == view3 : !((bug0VarP = p(viewGroup2, true)) == null || view3 != bug0VarP.b));
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z3) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            view2.setTag(R.id.parent_matrix, matrix3);
            Matrix matrix4 = this.Y;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = hdv.a;
        }
        if (matrix7 == null) {
            matrix7 = hdv.a;
        }
        if (matrix6.equals(matrix7)) {
            obj = "android:changeTransform:parentMatrix";
            objectAnimatorOfPropertyValuesHolder = null;
            i = 2;
        } else {
            f fVar = (f) map2.get("android:changeTransform:transforms");
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.p(view2, 0.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setRotationX(0.0f);
            view2.setRotationY(0.0f);
            view2.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix7.getValues(fArr2);
            e eVar = new e(view2, fArr);
            i = 2;
            qwh qwhVar = new qwh();
            qwhVar.a = new float[9];
            objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(a0, qwhVar, fArr, fArr2), h630.a(b0, this.O.a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            view2 = view2;
            d dVar = new d(view2, fVar, eVar, matrix7, z3, this.W);
            objectAnimatorOfPropertyValuesHolder.addListener(dVar);
            objectAnimatorOfPropertyValuesHolder.addPauseListener(dVar);
        }
        boolean z4 = c0;
        if (z3 && objectAnimatorOfPropertyValuesHolder != null && this.W) {
            Matrix matrix8 = new Matrix((Matrix) map2.get(obj));
            hai0.a.e(viewGroup, matrix8);
            if (Build.VERSION.SDK_INT == 28) {
                if (!nhk.e) {
                    try {
                        nhk.b();
                        Method declaredMethod = nhk.b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                        nhk.d = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e2) {
                        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e2);
                    }
                    nhk.e = true;
                }
                Method method = nhk.d;
                if (method != null) {
                    try {
                        nhkVar = new nhk((View) method.invoke(null, view2, viewGroup, matrix8));
                    } catch (IllegalAccessException unused) {
                        nhkVar = null;
                    } catch (InvocationTargetException e3) {
                        gqm.a(e3.getCause());
                        return null;
                    }
                } else {
                    nhkVar = null;
                }
                objectAnimator = objectAnimatorOfPropertyValuesHolder;
                z = z4;
                lhkVar = nhkVar;
            } else {
                int i6 = ohk.i;
                if (!(view2.getParent() instanceof ViewGroup)) {
                    hb5.a("Ghosted views must be parented by a ViewGroup");
                    return null;
                }
                int i7 = mhk.c;
                mhk mhkVar3 = (mhk) viewGroup.getTag(R.id.ghost_view_holder);
                ohk ohkVar3 = (ohk) view2.getTag(R.id.ghost_view);
                if (ohkVar3 == null || (mhkVar2 = (mhk) ohkVar3.getParent()) == mhkVar3) {
                    i2 = 0;
                    ohkVar = ohkVar3;
                } else {
                    i2 = ohkVar3.d;
                    mhkVar2.removeView(ohkVar3);
                    ohkVar = null;
                }
                if (ohkVar == null) {
                    ohk ohkVar4 = new ohk(view2);
                    ohkVar4.e = matrix8;
                    if (mhkVar3 == null) {
                        mhk mhkVar4 = new mhk(viewGroup.getContext());
                        mhkVar4.setClipChildren(false);
                        mhkVar4.a = viewGroup;
                        viewGroup.setTag(R.id.ghost_view_holder, mhkVar4);
                        viewGroup.getOverlay().add(mhkVar4);
                        mhkVar4.b = true;
                        mhkVar = mhkVar4;
                    } else {
                        ViewGroup viewGroup3 = mhkVar3.a;
                        if (!mhkVar3.b) {
                            ib5.a("This GhostViewHolder is detached!");
                            return null;
                        }
                        viewGroup3.getOverlay().remove(mhkVar3);
                        viewGroup3.getOverlay().add(mhkVar3);
                        mhkVar = mhkVar3;
                    }
                    hai0.a(mhkVar, mhkVar.getLeft(), mhkVar.getTop(), viewGroup.getWidth() + mhkVar.getLeft(), viewGroup.getHeight() + mhkVar.getTop());
                    hai0.a(ohkVar4, ohkVar4.getLeft(), ohkVar4.getTop(), viewGroup.getWidth() + ohkVar4.getLeft(), viewGroup.getHeight() + ohkVar4.getTop());
                    ArrayList arrayList3 = new ArrayList();
                    mhk.a(ohkVar4.c, arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    int childCount = mhkVar.getChildCount() - 1;
                    int i8 = 0;
                    while (i8 <= childCount) {
                        int i9 = (i8 + childCount) / 2;
                        mhk.a(((ohk) mhkVar.getChildAt(i9)).c, arrayList4);
                        if (arrayList3.isEmpty() || arrayList4.isEmpty()) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            z2 = z4;
                        } else {
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            z2 = z4;
                            if (arrayList3.get(0) != arrayList4.get(0)) {
                                arrayList = arrayList3;
                            } else {
                                int iMin = Math.min(arrayList3.size(), arrayList4.size());
                                int i10 = 1;
                                while (true) {
                                    if (i10 < iMin) {
                                        View view4 = (View) arrayList3.get(i10);
                                        arrayList = arrayList3;
                                        View view5 = (View) arrayList4.get(i10);
                                        if (view4 != view5) {
                                            ViewGroup viewGroup4 = (ViewGroup) view4.getParent();
                                            int childCount2 = viewGroup4.getChildCount();
                                            if (mhk.a.a(view4) == mhk.a.a(view5)) {
                                                arrayList2 = arrayList4;
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 < childCount2) {
                                                        int i12 = childCount2;
                                                        i5 = childCount;
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            iIntValue = u7i0.a.a(viewGroup4, i11);
                                                            i11 = i11;
                                                            i4 = i;
                                                        } else {
                                                            if (!u7i0.c) {
                                                                try {
                                                                    Class[] clsArr = new Class[i];
                                                                    Class cls = Integer.TYPE;
                                                                    clsArr[0] = cls;
                                                                    clsArr[1] = cls;
                                                                    Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", clsArr);
                                                                    u7i0.b = declaredMethod2;
                                                                    declaredMethod2.setAccessible(true);
                                                                } catch (NoSuchMethodException unused2) {
                                                                }
                                                                u7i0.c = true;
                                                            }
                                                            Method method2 = u7i0.b;
                                                            if (method2 != null) {
                                                                i4 = 2;
                                                                try {
                                                                    Object[] objArr = new Object[2];
                                                                    try {
                                                                        objArr[0] = Integer.valueOf(viewGroup4.getChildCount());
                                                                        objArr[1] = Integer.valueOf(i11);
                                                                        iIntValue = ((Integer) method2.invoke(viewGroup4, objArr)).intValue();
                                                                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                                                                        iIntValue = i11;
                                                                    }
                                                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                                                }
                                                            } else {
                                                                i4 = 2;
                                                            }
                                                            iIntValue = i11;
                                                        }
                                                        View childAt = viewGroup4.getChildAt(iIntValue);
                                                        if (childAt != view4) {
                                                            if (childAt != view5) {
                                                                i11++;
                                                                i = i4;
                                                                childCount2 = i12;
                                                                childCount = i5;
                                                            }
                                                        }
                                                    }
                                                    i8 = i9 + 1;
                                                    i3 = i5;
                                                }
                                            } else if (mhk.a.a(view4) <= mhk.a.a(view5)) {
                                                arrayList2 = arrayList4;
                                                i4 = i;
                                            }
                                            i3 = i9 - 1;
                                        } else {
                                            i10++;
                                            arrayList3 = arrayList;
                                            childCount = childCount;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        arrayList2 = arrayList4;
                                        i5 = childCount;
                                        i4 = i;
                                        if (arrayList2.size() == iMin) {
                                            i8 = i9 + 1;
                                            i3 = i5;
                                        } else {
                                            i3 = i9 - 1;
                                        }
                                    }
                                    arrayList2.clear();
                                    arrayList3 = arrayList;
                                    i = i4;
                                    childCount = i3;
                                    arrayList4 = arrayList2;
                                    objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                    z4 = z2;
                                }
                            }
                            arrayList2 = arrayList4;
                        }
                        i5 = childCount;
                        i4 = i;
                        i8 = i9 + 1;
                        i3 = i5;
                        arrayList2.clear();
                        arrayList3 = arrayList;
                        i = i4;
                        childCount = i3;
                        arrayList4 = arrayList2;
                        objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                        z4 = z2;
                    }
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z = z4;
                    if (i8 < 0 || i8 >= mhkVar.getChildCount()) {
                        mhkVar.addView(ohkVar4);
                    } else {
                        mhkVar.addView(ohkVar4, i8);
                    }
                    ohkVar4.d = i2;
                    ohkVar2 = ohkVar4;
                } else {
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z = z4;
                    ohkVar.e = matrix8;
                    ohkVar2 = ohkVar;
                }
                ohkVar2.d++;
                lhkVar = ohkVar2;
            }
            if (lhkVar != null) {
                lhkVar.a(view, (ViewGroup) map.get("android:changeTransform:parent"));
                Transition transition = this;
                while (true) {
                    Transition transition2 = transition.z;
                    if (transition2 == null) {
                        break;
                    }
                    transition = transition2;
                }
                c cVar = new c();
                cVar.a = view2;
                cVar.b = lhkVar;
                transition.a(cVar);
                if (z) {
                    if (view != view2) {
                        hai0.b(view, 0.0f);
                    }
                    hai0.b(view2, 1.0f);
                }
            }
        } else {
            objectAnimator = objectAnimatorOfPropertyValuesHolder;
            if (!z4) {
                viewGroup2.endViewTransition(view);
            }
        }
        return objectAnimator;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return Z;
    }

    public ChangeTransform() {
        this.W = true;
        this.X = true;
        this.Y = new Matrix();
    }
}
