package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import f2.z1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f7888i = "TransitionLayout";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f7889j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f7892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f7894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7897h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(String str, a aVar) {
        this.f7890a = false;
        this.f7891b = str;
        this.f7892c = aVar;
    }

    public static int b(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static HashMap<String, b> d(HashMap<String, b> map, View view) {
        HashMap<String, b> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e12);
            }
        }
        return map2;
    }

    public static void q(Context context, XmlPullParser xmlPullParser, HashMap<String, b> map) {
        a aVar;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), l.c.A8);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        a aVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == l.c.B8) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == l.c.L8) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == l.c.C8) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == l.c.E8) {
                    aVar = a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == l.c.D8) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == l.c.I8) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == l.c.F8) {
                    aVar = a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == l.c.G8) {
                    aVar = a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == l.c.H8) {
                    aVar = a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == l.c.K8) {
                    aVar = a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == l.c.J8) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                aVar2 = aVar;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new b(string, aVar2, objValueOf2, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void r(View view, HashMap<String, b> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            String str2 = bVar.f7890a ? str : "set" + str;
            try {
                int iOrdinal = bVar.f7892c.ordinal();
                Class<?> cls2 = Float.TYPE;
                Class<?> cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(bVar.f7893d));
                        break;
                    case 1:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(bVar.f7894e));
                        break;
                    case 2:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(bVar.f7897h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f7897h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f7895f);
                        break;
                    case 5:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f7896g));
                        break;
                    case 6:
                        cls.getMethod(str2, cls2).invoke(view, Float.valueOf(bVar.f7894e));
                        break;
                    case 7:
                        cls.getMethod(str2, cls3).invoke(view, Integer.valueOf(bVar.f7893d));
                        break;
                }
            } catch (IllegalAccessException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e10);
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e12);
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f7891b;
        if (this.f7890a) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            int iOrdinal = this.f7892c.ordinal();
            Class<?> cls2 = Integer.TYPE;
            Class<?> cls3 = Float.TYPE;
            switch (iOrdinal) {
                case 0:
                case 7:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f7893d));
                    break;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f7894e));
                    break;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf(this.f7897h));
                    break;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f7897h);
                    method.invoke(view, colorDrawable);
                    break;
                case 4:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f7895f);
                    break;
                case 5:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f7896g));
                    break;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(this.f7894e));
                    break;
            }
        } catch (IllegalAccessException e10) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e10);
        } catch (NoSuchMethodException e11) {
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e11);
        } catch (InvocationTargetException e12) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e12);
        }
    }

    public boolean c(b bVar) {
        a aVar;
        if (bVar != null && (aVar = this.f7892c) == bVar.f7892c) {
            switch (aVar) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.f7893d == bVar.f7893d) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    return this.f7894e == bVar.f7894e;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    return this.f7897h == bVar.f7897h;
                case STRING_TYPE:
                    return this.f7893d == bVar.f7893d;
                case BOOLEAN_TYPE:
                    return this.f7896g == bVar.f7896g;
                case DIMENSION_TYPE:
                    return this.f7894e == bVar.f7894e;
                default:
                    return false;
            }
        }
        return false;
    }

    public int e() {
        return this.f7897h;
    }

    public float f() {
        return this.f7894e;
    }

    public int g() {
        return this.f7893d;
    }

    public String h() {
        return this.f7891b;
    }

    public String i() {
        return this.f7895f;
    }

    public a j() {
        return this.f7892c;
    }

    public float k() {
        switch (this.f7892c) {
            case INT_TYPE:
                return this.f7893d;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.f7894e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.f7896g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public void l(float[] fArr) {
        switch (this.f7892c) {
            case INT_TYPE:
                fArr[0] = this.f7893d;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f7894e;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i10 = this.f7897h;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.f7896g ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f7894e;
                return;
            default:
                return;
        }
    }

    public boolean m() {
        return this.f7896g;
    }

    public boolean n() {
        int iOrdinal = this.f7892c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public boolean o() {
        return this.f7890a;
    }

    public int p() {
        int iOrdinal = this.f7892c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void s(int i10) {
        this.f7897h = i10;
    }

    public void t(float f10) {
        this.f7894e = f10;
    }

    public void u(int i10) {
        this.f7893d = i10;
    }

    public void v(String str) {
        this.f7895f = str;
    }

    public void w(Object obj) {
        switch (this.f7892c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f7893d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f7894e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f7897h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f7895f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f7896g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f7894e = ((Float) obj).floatValue();
                break;
        }
    }

    public void x(float[] fArr) {
        switch (this.f7892c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f7893d = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.f7894e = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int iHSVToColor = Color.HSVToColor(fArr);
                this.f7897h = iHSVToColor;
                this.f7897h = (b((int) (fArr[3] * 255.0f)) << 24) | (iHSVToColor & z1.f82662x);
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                this.f7896g = ((double) fArr[0]) > 0.5d;
                return;
            case DIMENSION_TYPE:
                this.f7894e = fArr[0];
                return;
            default:
                return;
        }
    }

    public b(String str, a aVar, Object obj, boolean z10) {
        this.f7891b = str;
        this.f7892c = aVar;
        this.f7890a = z10;
        w(obj);
    }

    public b(b bVar, Object obj) {
        this.f7890a = false;
        this.f7891b = bVar.f7891b;
        this.f7892c = bVar.f7892c;
        w(obj);
    }
}
