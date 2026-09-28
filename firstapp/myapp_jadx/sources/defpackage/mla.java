package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mla {
    public static ComposeView a(Context context, final op8 op8Var) {
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(new op8(-349647492, new Function2() { // from class: dla
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    op8Var.invoke(aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    public static final float b(float f, a aVar) {
        return ((mmd) aVar.O(kna.h)).C1(f);
    }

    public static final boolean c(zzr zzrVar) {
        zzrVar.getClass();
        zyr zyrVar = (zyr) CollectionsKt.d0(zzrVar.j().k());
        if (zyrVar != null) {
            boolean z = zyrVar.getIndex() == zzrVar.j().i() - 1;
            int iA = zyrVar.a() + zyrVar.getOffset();
            if (!z || iA > zzrVar.j().f()) {
                return false;
            }
        }
        return true;
    }

    public static final Function0 d(final Function0 function0, a aVar, int i) {
        function0.getClass();
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = l.a(0L);
            aVar.r(objY);
        }
        final xsw xswVar = (xsw) objY;
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.e(400L)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.M(function0)) || (i & 48) == 32);
        Object objY2 = aVar.y();
        if (z || objY2 == c0042a) {
            objY2 = new Function0() { // from class: hla
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    xsw xswVar2 = xswVar;
                    if (jCurrentTimeMillis - xswVar2.u() >= 400) {
                        xswVar2.K(jCurrentTimeMillis);
                        function0.invoke();
                    }
                    return Unit.a;
                }
            };
            aVar.r(objY2);
        }
        return (Function0) objY2;
    }

    public static final float e(float f, a aVar) {
        return ((mmd) aVar.O(kna.h)).v1(f);
    }

    public static final float f(int i, a aVar) {
        return ((mmd) aVar.O(kna.h)).u1(i);
    }

    public static final ytw g(a aVar) {
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (objY == obj) {
            objY = m.b(Boolean.FALSE);
            aVar.r(objY);
        }
        final ytw ytwVar = (ytw) objY;
        final View view = (View) aVar.O(AndroidCompositionLocals_androidKt.f);
        boolean zA = aVar.A(view);
        Object objY2 = aVar.y();
        if (zA || objY2 == obj) {
            objY2 = new Function1() { // from class: fla
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, gla] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((use) obj2).getClass();
                    final View view2 = view;
                    final ytw ytwVar2 = ytwVar;
                    ?? r2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: gla
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                            l8j0 l8j0VarA = r6i0.e.a(view2);
                            ytwVar2.setValue(Boolean.valueOf(l8j0VarA != null ? l8j0VarA.a.q(8) : true));
                        }
                    };
                    view2.getViewTreeObserver().addOnGlobalLayoutListener(r2);
                    return new jla(view2, r2);
                }
            };
            aVar.r(objY2);
        }
        xvf.c(view, (Function1) objY2, aVar);
        return ytwVar;
    }

    public static final void h(c000 c000Var, ComposeView composeView, op8 op8Var) {
        composeView.getClass();
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(new op8(-402311435, new cla(op8Var, 0), true));
    }

    public static void i(ComposeView composeView, op8 op8Var) {
        composeView.getClass();
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(op8Var);
    }

    public static final <T extends Enum<T>> d j(d dVar, Enum<T> r3) {
        dVar.getClass();
        r3.getClass();
        return c.a(dVar, gnn.a, new ela(r3, 0));
    }

    public static final d k(final Enum r1, final Object obj) {
        gaj gajVar = new gaj() { // from class: bla
            @Override // defpackage.gaj
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                d dVarN;
                d dVar = (d) obj2;
                a aVar = (a) obj3;
                e3w.a((Integer) obj4, dVar, aVar, 1139055871);
                Object obj5 = obj;
                Enum r2 = r1;
                if (obj5 == null) {
                    dVarN = mla.j(dVar, r2);
                } else {
                    dVarN = dVar.n(androidx.compose.ui.platform.d.a(dVar, r2.name() + "_" + obj5));
                }
                aVar.H();
                return dVarN;
            }
        };
        return c.a(d.a.b, gnn.a, gajVar);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final imf0 l(int i, a aVar) {
        omf0 omf0Var;
        t9i t9iVar;
        t9i t9iVar2;
        boolean zContains;
        mxs mxsVarA;
        float dimension;
        Float fValueOf;
        omf0 omf0Var2;
        long j;
        int i2;
        aVar.N(371747463);
        Object objY = aVar.y();
        if (objY == a.C0041a.a) {
            objY = m.b(null);
            aVar.r(objY);
        }
        ytw ytwVar = (ytw) objY;
        Pair pair = (Pair) ytwVar.getValue();
        if (pair != null) {
            if (((Number) pair.a).intValue() != i) {
                pair = null;
            }
            if (pair != null) {
                imf0 imf0Var = (imf0) pair.b;
                aVar.H();
                return imf0Var;
            }
        }
        qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
        TypedArray typedArrayObtainStyledAttributes = ((Context) aVar.O(qyd0Var)).obtainStyledAttributes(i, dl30.z);
        typedArrayObtainStyledAttributes.getClass();
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(3);
        long jB = colorStateList != null ? r58.b(colorStateList.getDefaultColor()) : j58.m;
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        Float fValueOf2 = Float.valueOf(dimension2);
        if (dimension2 < 0.0f) {
            fValueOf2 = null;
        }
        if (fValueOf2 == null) {
            aVar.N(-1991332701);
            aVar.H();
            omf0Var = null;
        } else {
            aVar.N(-1991332700);
            long jG0 = ((mmd) aVar.O(kna.h)).g0(fValueOf2.floatValue());
            aVar.H();
            omf0Var = new omf0(jG0);
        }
        long j2 = omf0Var != null ? omf0Var.a : omf0.c;
        int i3 = typedArrayObtainStyledAttributes.getInt(11, -1);
        int i4 = typedArrayObtainStyledAttributes.getInt(2, 0);
        String string = typedArrayObtainStyledAttributes.getString(10);
        Typeface typefaceCreate = string != null ? Typeface.create(string, i4) : null;
        Integer numValueOf = Integer.valueOf(i3);
        if (i3 < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            Integer numValueOf2 = Integer.valueOf(i4);
            if (!b.k(3, 1).contains(Integer.valueOf(i4))) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                t9iVar2 = t9i.E;
            } else {
                t9iVar = (Build.VERSION.SDK_INT < 28 || typefaceCreate == null) ? null : new t9i(typefaceCreate.getWeight());
            }
            zContains = b.k(2, 3).contains(Integer.valueOf(i4));
            if (typefaceCreate == null) {
                mxsVarA = null;
            } else {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (t9iVar != null) {
                        i2 = t9iVar.a;
                    } else {
                        i2 = t9i.B.a;
                    }
                    typefaceCreate = Typeface.create(typefaceCreate, i2, zContains);
                }
                if (typefaceCreate != null) {
                    mxsVarA = d1a.a(typefaceCreate);
                } else {
                    mxsVarA = null;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = ((Context) aVar.O(qyd0Var)).obtainStyledAttributes(i, dl30.j);
            typedArrayObtainStyledAttributes2.getClass();
            dimension = typedArrayObtainStyledAttributes2.getDimension(19, -1.0f);
            fValueOf = Float.valueOf(dimension);
            if (dimension < 0.0f) {
                fValueOf = null;
            }
            typedArrayObtainStyledAttributes2.recycle();
            if (fValueOf == null) {
                aVar.N(606888574);
                aVar.H();
                omf0Var2 = null;
            } else {
                aVar.N(606888575);
                long jG1 = ((mmd) aVar.O(kna.h)).g0(fValueOf.floatValue());
                aVar.H();
                omf0Var2 = new omf0(jG1);
            }
            if (omf0Var2 != null) {
                j = omf0Var2.a;
            } else {
                j = omf0.c;
            }
            imf0 imf0Var2 = new imf0(jB, j2, t9iVar, new n9i(zContains ? 1 : 0), mxsVarA, 0L, null, null, 0, j, null, null, 16646096);
            ytwVar.setValue(new Pair(Integer.valueOf(i), imf0Var2));
            aVar.H();
            return imf0Var2;
        }
        t9iVar2 = new t9i(numValueOf.intValue());
        t9iVar = t9iVar2;
        zContains = b.k(2, 3).contains(Integer.valueOf(i4));
        if (typefaceCreate == null) {
            mxsVarA = null;
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                if (t9iVar != null) {
                    i2 = t9iVar.a;
                } else {
                    i2 = t9i.B.a;
                }
                typefaceCreate = Typeface.create(typefaceCreate, i2, zContains);
            }
            if (typefaceCreate != null) {
                mxsVarA = d1a.a(typefaceCreate);
            } else {
                mxsVarA = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = ((Context) aVar.O(qyd0Var)).obtainStyledAttributes(i, dl30.j);
        typedArrayObtainStyledAttributes3.getClass();
        dimension = typedArrayObtainStyledAttributes3.getDimension(19, -1.0f);
        fValueOf = Float.valueOf(dimension);
        if (dimension < 0.0f) {
            fValueOf = null;
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (fValueOf == null) {
            aVar.N(606888574);
            aVar.H();
            omf0Var2 = null;
        } else {
            aVar.N(606888575);
            long jG2 = ((mmd) aVar.O(kna.h)).g0(fValueOf.floatValue());
            aVar.H();
            omf0Var2 = new omf0(jG2);
        }
        if (omf0Var2 != null) {
            j = omf0Var2.a;
        } else {
            j = omf0.c;
        }
        imf0 imf0Var3 = new imf0(jB, j2, t9iVar, new n9i(zContains ? 1 : 0), mxsVarA, 0L, null, null, 0, j, null, null, 16646096);
        ytwVar.setValue(new Pair(Integer.valueOf(i), imf0Var3));
        aVar.H();
        return imf0Var3;
    }

    public static final long m(float f, a aVar) {
        return d2l.g(f / ((Configuration) aVar.O(AndroidCompositionLocals_androidKt.a)).fontScale, 4294967296L);
    }
}
