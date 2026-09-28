package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class x2d {
    public static final lk40 a(View view, AndroidComposeView androidComposeView) {
        int[] iArr = g4i.a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        return new lk40(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final boolean c(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer d(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final String e(v1b v1bVar) {
        Object bVar;
        if (v1bVar instanceof yre) {
            return ((yre) v1bVar).toString();
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = v1bVar + '@' + b(v1bVar);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = v1bVar.getClass().getName() + '@' + b(v1bVar);
        }
        return (String) bVar;
    }

    public static final t3i f(int i) {
        if (i == 1) {
            return new t3i(2);
        }
        if (i == 2) {
            return new t3i(1);
        }
        if (i == 17) {
            return new t3i(3);
        }
        if (i == 33) {
            return new t3i(5);
        }
        if (i == 66) {
            return new t3i(4);
        }
        if (i != 130) {
            return null;
        }
        return new t3i(6);
    }

    public static final hu00 g(rx00 rx00Var) {
        int iOrdinal = rx00Var.ordinal();
        if (iOrdinal == 0) {
            return hu00.b;
        }
        if (iOrdinal == 1) {
            return hu00.a;
        }
        if (iOrdinal == 2) {
            return hu00.d;
        }
        if (iOrdinal == 3) {
            return hu00.c;
        }
        uhc.a();
        return null;
    }

    public static final rx00 h(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 112785) {
            if (iHashCode != 3027034) {
                if (iHashCode == 98619139 && lowerCase.equals("green")) {
                    return rx00.a;
                }
            } else if (lowerCase.equals("blue")) {
                return rx00.d;
            }
        } else if (lowerCase.equals("red")) {
            return rx00.b;
        }
        return rx00.c;
    }
}
