package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.c;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class lu7 implements LayoutInflater.Factory2 {
    public static final int[] c;
    public static final int d;
    public static final int e;
    public static final String[] f;
    public static final ConcurrentHashMap<String, Constructor<? extends View>> i;
    public final c a;
    public final jb40 b;

    static {
        int[] iArr = {R.attr.text, R.attr.hint};
        Arrays.sort(iArr);
        c = iArr;
        d = ay0.E(iArr, R.attr.text);
        e = ay0.E(iArr, R.attr.hint);
        f = new String[]{"android.widget.", "android.webkit.", "android.app."};
        i = new ConcurrentHashMap<>();
    }

    public lu7(c cVar, jb40 jb40Var) {
        cVar.getClass();
        jb40Var.getClass();
        this.a = cVar;
        this.b = jb40Var;
    }

    public static View b(String str, String str2, Context context, AttributeSet attributeSet) {
        String strConcat;
        ConcurrentHashMap<String, Constructor<? extends View>> concurrentHashMap = i;
        Constructor<? extends View> constructor = concurrentHashMap.get(str);
        if (constructor != null) {
            return constructor.newInstance(context, attributeSet);
        }
        if (str2 != null) {
            try {
                strConcat = str2.concat(str);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return null;
            }
        } else {
            strConcat = str;
        }
        Constructor<? extends View> constructor2 = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(Context.class, AttributeSet.class);
        concurrentHashMap.put(str, constructor2);
        return constructor2.newInstance(context, attributeSet);
    }

    public final void a(View view, Context context, AttributeSet attributeSet) {
        if (view instanceof TextView) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
            typedArrayObtainStyledAttributes.getClass();
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(d, 0);
                jb40 jb40Var = this.b;
                if (resourceId != 0 && jb40Var.d(resourceId)) {
                    ((TextView) view).setText(sn5.b(context, resourceId, new Object[0]));
                }
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(e, 0);
                if (resourceId2 != 0 && jb40Var.d(resourceId2)) {
                    ((TextView) view).setHint(sn5.b(context, resourceId2, new Object[0]));
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewB;
        str.getClass();
        context.getClass();
        attributeSet.getClass();
        View viewF = this.a.f(str, context, attributeSet);
        if (viewF != null) {
            a(viewF, context, attributeSet);
            return viewF;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
        typedArrayObtainStyledAttributes.getClass();
        try {
            int i2 = 0;
            boolean z = (typedArrayObtainStyledAttributes.getResourceId(d, 0) == 0 && typedArrayObtainStyledAttributes.getResourceId(e, 0) == 0) ? false : true;
            typedArrayObtainStyledAttributes.recycle();
            if (z) {
                if (StringsKt.S(str, '.', 0, 6) > -1) {
                    viewB = b(str, null, context, attributeSet);
                } else {
                    String[] strArr = f;
                    int length = strArr.length;
                    while (true) {
                        if (i2 >= length) {
                            viewB = null;
                            break;
                        }
                        View viewB2 = b(str, strArr[i2], context, attributeSet);
                        if (viewB2 != null) {
                            viewB = viewB2;
                            break;
                        }
                        i2++;
                    }
                }
                if (viewB != null) {
                    a(viewB, context, attributeSet);
                    return viewB;
                }
            }
            return null;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        str.getClass();
        context.getClass();
        attributeSet.getClass();
        return onCreateView(null, str, context, attributeSet);
    }
}
