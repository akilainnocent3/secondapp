package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sn5 {
    public static final String a(int i, Context context, TypedArray typedArray) {
        typedArray.getClass();
        context.getClass();
        int resourceId = typedArray.getResourceId(i, 0);
        Integer numValueOf = Integer.valueOf(resourceId);
        if (resourceId == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return b(context, numValueOf.intValue(), new Object[0]);
        }
        return null;
    }

    public static final String b(Context context, int i, Object... objArr) {
        ln5 ln5Var;
        Object bVar;
        Object bVar2;
        context.getClass();
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i2 = 0;
        while (true) {
            String str = "";
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            try {
                zi50.a aVar = zi50.b;
                bVar2 = String.valueOf(obj);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar2 = new zi50.b(th);
            }
            String str2 = (String) (bVar2 instanceof zi50.b ? null : bVar2);
            if (str2 != null) {
                str = str2;
            }
            arrayList.add(str);
            i2++;
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ln5)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    ln5Var = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                baseContext.getClass();
            } else {
                ln5Var = (ln5) baseContext;
                break;
            }
        }
        if (ln5Var != null) {
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            String strB = ln5Var.i.b(ln5Var.g, ln5Var, i, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            if (strB != null) {
                return strB;
            }
        }
        try {
            zi50.a aVar3 = zi50.b;
            bVar = context.getString(i, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th2);
        }
        String str3 = (String) (bVar instanceof zi50.b ? null : bVar);
        return str3 == null ? "" : str3;
    }

    public static final String c(View view, int i, Object... objArr) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        return b(context, i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String d(Fragment fragment, int i, Object... objArr) {
        fragment.getClass();
        Context context = fragment.getContext();
        return context != null ? b(context, i, Arrays.copyOf(objArr, objArr.length)) : "";
    }

    public static final List e(m12 m12Var, int i) {
        Object bVar;
        Context context = m12Var.getContext();
        if (context != null) {
            try {
                zi50.a aVar = zi50.b;
                TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
                typedArrayObtainTypedArray.getClass();
                ArrayList arrayList = new ArrayList();
                int length = typedArrayObtainTypedArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(b(context, resourceId, new Object[0]));
                    }
                }
                typedArrayObtainTypedArray.recycle();
                bVar = arrayList;
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            zi50.a aVar3 = zi50.b;
            boolean z = bVar instanceof zi50.b;
            Object obj = bVar;
            if (z) {
                obj = null;
            }
            List list = (List) obj;
            if (list == null) {
                list = m2g.a;
            }
            if (list != null) {
                return list;
            }
        }
        return m2g.a;
    }

    public static final void f(TextView textView, int i, Object... objArr) {
        textView.getClass();
        Context context = textView.getContext();
        context.getClass();
        textView.setText(b(context, i, Arrays.copyOf(objArr, objArr.length)));
    }
}
