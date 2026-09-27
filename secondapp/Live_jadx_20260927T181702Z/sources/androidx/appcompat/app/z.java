package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.i2;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.s0;
import androidx.appcompat.widget.x0;
import f0.k3;
import f2.z1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f6468h = "AppCompatViewInflater";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f6470a = new Object[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f6462b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6463c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6464d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f6465e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f6466f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f6467g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k3<String, Constructor<? extends View>> f6469i = new k3<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f6471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f6472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f6473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Context f6474e;

        public a(@NonNull View view, @NonNull String str) {
            this.f6471b = view;
            this.f6472c = str;
        }

        public final void a(@Nullable Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f6472c, View.class)) != null) {
                        this.f6473d = method;
                        this.f6474e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f6471b.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f6471b.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f6472c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f6471b.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
            if (this.f6473d == null) {
                a(this.f6471b.getContext());
            }
            try {
                this.f6473d.invoke(this.f6474e, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.a.m.W6, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(m.a.m.X6, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(m.a.m.f106004b7, 0)) != 0) {
            Log.i(f6468h, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof r.d) && ((r.d) context).getThemeResId() == resourceId)) ? context : new r.d(context, resourceId);
    }

    public final void a(@NonNull Context context, @NonNull View view, @NonNull AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6464d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            z1.H1(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f6465e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            z1.J1(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f6466f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            z1.w2(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6463c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public androidx.appcompat.widget.h c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    @NonNull
    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @NonNull
    public androidx.appcompat.widget.p e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.p(context, attributeSet);
    }

    @NonNull
    public androidx.appcompat.widget.r f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    @NonNull
    public androidx.appcompat.widget.w g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.w(context, attributeSet);
    }

    @NonNull
    public androidx.appcompat.widget.b0 h(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.b0(context, attributeSet);
    }

    @NonNull
    public AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @NonNull
    public androidx.appcompat.widget.f0 j(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f0(context, attributeSet);
    }

    @NonNull
    public androidx.appcompat.widget.j0 k(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.j0(context, attributeSet);
    }

    @NonNull
    public k0 l(Context context, AttributeSet attributeSet) {
        return new k0(context, attributeSet);
    }

    @NonNull
    public m0 m(Context context, AttributeSet attributeSet) {
        return new m0(context, attributeSet);
    }

    @NonNull
    public AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @NonNull
    public s0 o(Context context, AttributeSet attributeSet) {
        return new s0(context, attributeSet);
    }

    @NonNull
    public x0 p(Context context, AttributeSet attributeSet) {
        return new x0(context, attributeSet);
    }

    @Nullable
    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final View r(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View viewL;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = i2.b(context2);
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    b10 = 0;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    b10 = 1;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    b10 = 2;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    b10 = 3;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    b10 = 4;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    b10 = 5;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    b10 = 6;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    b10 = 7;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    b10 = 8;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    b10 = 9;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    b10 = 10;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    b10 = zi.c.f161635m;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    b10 = zi.c.f161636n;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    b10 = 13;
                }
                break;
        }
        switch (b10) {
            case 0:
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case 1:
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case 2:
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case 3:
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case 4:
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case 5:
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case 6:
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case 7:
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case 8:
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case 9:
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case 10:
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case 11:
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case 12:
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case 13:
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }

    public final View s(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        k3<String, Constructor<? extends View>> k3Var = f6469i;
        Constructor<? extends View> constructor = k3Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6462b);
            k3Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f6470a);
    }

    public final View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, sc.c.f129750g);
        }
        try {
            Object[] objArr = this.f6470a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f6467g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i10]);
                if (viewS != null) {
                    return viewS;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f6470a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
