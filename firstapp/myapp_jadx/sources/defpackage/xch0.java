package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class xch0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static m9i0 a(View view) {
        m9i0 m9i0VarA;
        if (view instanceof m9i0) {
            return (m9i0) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        do {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            childAt.getClass();
            m9i0VarA = a(childAt);
        } while (m9i0VarA == null);
        return m9i0VarA;
    }

    public static View b(View view, int i, int i2) {
        View viewB;
        if (!view.isShown()) {
            return null;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect) || !rect.contains(i, i2)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (-1 < childCount) {
                    View childAt = viewGroup.getChildAt(childCount);
                    childAt.getClass();
                    viewB = b(childAt, i, i2);
                }
            } while (viewB == null);
            return viewB;
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[RETURN] */
    public static String c(bb80 bb80Var, long j, boolean z) {
        String str;
        String strA0;
        String strC;
        if (bb80Var.g().a(j)) {
            List listJ = bb80.j(7, bb80Var);
            int size = listJ.size();
            do {
                size--;
                if (-1 < size) {
                    strC = c((bb80) listJ.get(size), j, z);
                } else if (z) {
                    if (bb80Var.k().a.b(ra80.b)) {
                        str = (String) ta80.a(bb80Var.k(), hb80.y);
                        if (str != null) {
                            if (!c.u(str, "com.sportybet.android:id/", false)) {
                                str = null;
                            }
                            if (str != null) {
                                strA0 = StringsKt.a0(str, "com.sportybet.android:id/");
                                if (!StringsKt.U(strA0)) {
                                    return strA0;
                                }
                            }
                        }
                    }
                } else {
                    str = (String) ta80.a(bb80Var.k(), hb80.y);
                    if (str != null) {
                        if (!c.u(str, "com.sportybet.android:id/", false)) {
                            str = null;
                        }
                        if (str != null) {
                            strA0 = StringsKt.a0(str, "com.sportybet.android:id/");
                            if (!StringsKt.U(strA0)) {
                                return strA0;
                            }
                        }
                    }
                }
            } while (strC == null);
            return strC;
        }
        return null;
    }

    public static String d(View view) {
        Object bVar;
        if (view.getId() != -1) {
            try {
                zi50.a aVar = zi50.b;
                bVar = view.getResources().getResourceEntryName(view.getId());
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            String str = (String) bVar;
            if (str != null) {
                return str;
            }
        }
        String simpleName = view.getClass().getSimpleName();
        if (!StringsKt.U(simpleName)) {
            return simpleName;
        }
        String name = view.getClass().getName();
        return StringsKt.l0('.', name, name);
    }
}
