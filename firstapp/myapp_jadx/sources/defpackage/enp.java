package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class enp extends mlp {
    public float w;
    public float e = 0.1f;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public RectF i = new RectF();
    public RectF j = new RectF();
    public HashMap<String, Method> k = new HashMap<>();
    public String l = null;
    public int m = -1;
    public String n = null;
    public String o = null;
    public int p = -1;
    public int q = -1;
    public View r = null;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public float v = Float.NaN;
    public boolean x = false;

    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public enp() {
        this.d = new HashMap<>();
    }

    public static void j(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // defpackage.mlp
    public final void a(HashMap<String, q9i0> map) {
        throw null;
    }

    @Override // defpackage.mlp
    /* JADX INFO: renamed from: b */
    public final mlp clone() {
        enp enpVar = new enp();
        super.c(this);
        enpVar.l = this.l;
        enpVar.m = this.m;
        enpVar.n = this.n;
        enpVar.o = this.o;
        enpVar.p = this.p;
        enpVar.q = this.q;
        enpVar.r = this.r;
        enpVar.e = this.e;
        enpVar.s = this.s;
        enpVar.t = this.t;
        enpVar.u = this.u;
        enpVar.v = this.v;
        enpVar.w = this.w;
        enpVar.x = this.x;
        enpVar.i = this.i;
        enpVar.j = this.j;
        enpVar.k = this.k;
        return enpVar;
    }

    @Override // defpackage.mlp
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.o);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                    break;
                case 7:
                    if (MotionLayout.U0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.a);
                    this.a = integer;
                    this.v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                    break;
                case 10:
                    this.x = typedArrayObtainStyledAttributes.getBoolean(index, this.x);
                    break;
                case 11:
                    this.m = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                    break;
                case 12:
                    this.h = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                    break;
                case 13:
                    this.f = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                    break;
                case 14:
                    this.g = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    public final void h(View view, float f) {
        boolean z;
        boolean z2;
        float f2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        float f5;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        boolean z8 = false;
        if (this.q != -1) {
            View viewFindViewById = this.r;
            if (viewFindViewById == null) {
                viewFindViewById = ((ViewGroup) view.getParent()).findViewById(this.q);
                this.r = viewFindViewById;
            }
            j(this.i, viewFindViewById, this.x);
            j(this.j, view, this.x);
            boolean zIntersect = this.i.intersect(this.j);
            boolean z9 = this.s;
            if (zIntersect) {
                if (z9) {
                    this.s = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.u) {
                    this.u = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.t = true;
            } else {
                if (z9) {
                    z = false;
                } else {
                    this.s = true;
                    z = true;
                }
                if (this.t) {
                    this.t = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.u = true;
                boolean z10 = z5;
                z6 = false;
                z8 = z10;
            }
            z7 = z6;
        } else {
            boolean z11 = this.s;
            float f6 = this.v;
            if (z11) {
                if ((this.w - f6) * (f - f6) < 0.0f) {
                    this.s = false;
                    z = true;
                }
                z2 = this.t;
                f2 = this.v;
                if (z2) {
                    f5 = f - f2;
                    if ((this.w - f2) * f5 >= 0.0f && f5 < 0.0f) {
                        this.t = false;
                        z3 = true;
                    }
                    z4 = this.u;
                    f3 = this.v;
                    if (z4) {
                        f4 = f - f3;
                        if ((this.w - f3) * f4 >= 0.0f && f4 > 0.0f) {
                            this.u = false;
                        }
                        z8 = z3;
                    } else if (Math.abs(f - f3) > this.e) {
                        this.u = true;
                    }
                    z7 = false;
                    z8 = z3;
                } else if (Math.abs(f - f2) > this.e) {
                    this.t = true;
                }
                z3 = false;
                z4 = this.u;
                f3 = this.v;
                if (z4) {
                    f4 = f - f3;
                    if ((this.w - f3) * f4 >= 0.0f) {
                    }
                    z8 = z3;
                } else if (Math.abs(f - f3) > this.e) {
                    this.u = true;
                }
                z7 = false;
                z8 = z3;
            } else if (Math.abs(f - f6) > this.e) {
                this.s = true;
            }
            z = false;
            z2 = this.t;
            f2 = this.v;
            if (z2) {
                f5 = f - f2;
                if ((this.w - f2) * f5 >= 0.0f) {
                }
                z4 = this.u;
                f3 = this.v;
                if (z4) {
                    f4 = f - f3;
                    if ((this.w - f3) * f4 >= 0.0f) {
                    }
                    z8 = z3;
                } else if (Math.abs(f - f3) > this.e) {
                    this.u = true;
                }
                z7 = false;
                z8 = z3;
            } else if (Math.abs(f - f2) > this.e) {
                this.t = true;
            }
            z3 = false;
            z4 = this.u;
            f3 = this.v;
            if (z4) {
                f4 = f - f3;
                if ((this.w - f3) * f4 >= 0.0f) {
                }
                z8 = z3;
            } else if (Math.abs(f - f3) > this.e) {
                this.u = true;
            }
            z7 = false;
            z8 = z3;
        }
        this.w = f;
        if (z8 || z || z7) {
            MotionLayout motionLayout = (MotionLayout) view.getParent();
            MotionLayout.h hVar = motionLayout.b0;
            if (hVar != null) {
                hVar.d(motionLayout);
            }
            CopyOnWriteArrayList<MotionLayout.h> copyOnWriteArrayList = motionLayout.t0;
            if (copyOnWriteArrayList != null) {
                Iterator<MotionLayout.h> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().d(motionLayout);
                }
            }
        }
        View viewFindViewById2 = this.m == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.m);
        if (z8) {
            String str = this.n;
            if (str != null) {
                i(viewFindViewById2, str);
            }
            if (this.f != -1) {
                ((MotionLayout) view.getParent()).W(this.f, viewFindViewById2);
            }
        }
        if (z7) {
            String str2 = this.o;
            if (str2 != null) {
                i(viewFindViewById2, str2);
            }
            if (this.g != -1) {
                ((MotionLayout) view.getParent()).W(this.g, viewFindViewById2);
            }
        }
        if (z) {
            String str3 = this.l;
            if (str3 != null) {
                i(viewFindViewById2, str3);
            }
            if (this.h != -1) {
                ((MotionLayout) view.getParent()).W(this.h, viewFindViewById2);
            }
        }
    }

    public final void i(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.k.containsKey(str)) {
                method = this.k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.k.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + zzc.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.l + "\"on class " + view.getClass().getSimpleName() + " " + zzc.d(view));
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.d.get(str2);
                if (aVar != null) {
                    Class<?> cls = view.getClass();
                    String str3 = aVar.b;
                    String strA = !aVar.a ? inm.a("set", str3) : str3;
                    try {
                        int iOrdinal = aVar.c.ordinal();
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iOrdinal) {
                            case 0:
                            case 7:
                                cls.getMethod(strA, cls2).invoke(view, Integer.valueOf(aVar.d));
                                break;
                            case 1:
                                cls.getMethod(strA, cls3).invoke(view, Float.valueOf(aVar.e));
                                break;
                            case 2:
                                cls.getMethod(strA, cls2).invoke(view, Integer.valueOf(aVar.h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strA, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(aVar.h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strA, CharSequence.class).invoke(view, aVar.f);
                                break;
                            case 5:
                                cls.getMethod(strA, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.g));
                                break;
                            case 6:
                                cls.getMethod(strA, cls3).invoke(view, Float.valueOf(aVar.e));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbA = he.a(" Custom Attribute \"", str3, "\" not found on ");
                        sbA.append(cls.getName());
                        Log.e("TransitionLayout", sbA.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + strA, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbA2 = he.a(" Custom Attribute \"", str3, "\" not found on ");
                        sbA2.append(cls.getName());
                        Log.e("TransitionLayout", sbA2.toString(), e3);
                    }
                }
            }
        }
    }

    @Override // defpackage.mlp
    public final void d(HashSet<String> hashSet) {
    }
}
