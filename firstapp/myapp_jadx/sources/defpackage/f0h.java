package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0h extends e6 {
    public static final Rect n = new Rect(Reader.READ_DONE, Reader.READ_DONE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final a o = new a();
    public static final b p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public class a implements l5i.a<c7> {
    }

    public class b {
    }

    public class c extends d7 {
        public c() {
        }

        @Override // defpackage.d7
        public final c7 b(int i) {
            return new c7(AccessibilityNodeInfo.obtain(f0h.this.r(i).a));
        }

        @Override // defpackage.d7
        public final c7 c(int i) {
            f0h f0hVar = f0h.this;
            int i2 = i == 2 ? f0hVar.k : f0hVar.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // defpackage.d7
        public final boolean d(int i, int i2, Bundle bundle) {
            int i3;
            f0h f0hVar = f0h.this;
            View view = f0hVar.i;
            if (i == -1) {
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                return view.performAccessibilityAction(i2, bundle);
            }
            if (i2 == 1) {
                return f0hVar.w(i);
            }
            if (i2 == 2) {
                return f0hVar.j(i);
            }
            if (i2 != 64) {
                if (i2 != 128) {
                    return f0hVar.s(i, i2, bundle);
                }
                if (f0hVar.k != i) {
                    return false;
                }
                f0hVar.k = Integer.MIN_VALUE;
                view.invalidate();
                f0hVar.x(i, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = f0hVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = f0hVar.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                f0hVar.k = Integer.MIN_VALUE;
                view.invalidate();
                f0hVar.x(i3, 65536);
            }
            f0hVar.k = i;
            view.invalidate();
            f0hVar.x(i, 32768);
            return true;
        }
    }

    public f0h(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.e6
    public final d7 b(View view) {
        c cVar = this.j;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.j = cVar2;
        return cVar2;
    }

    @Override // defpackage.e6
    public final void d(View view, c7 c7Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, c7Var.a);
        t(c7Var);
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        v(i, false);
        x(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i2) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        c7 c7VarR = r(i);
        accessibilityEventObtain2.getText().add(c7VarR.g());
        AccessibilityNodeInfo accessibilityNodeInfo = c7VarR.a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            b9p.a("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final c7 l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        c7 c7Var = new c7(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c7Var.l("android.view.View");
        Rect rect = n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        c7Var.k(rect);
        c7Var.b = -1;
        View view = this.i;
        accessibilityNodeInfoObtain.setParent(view);
        u(i, c7Var);
        if (c7Var.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            b9p.a("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        c7Var.f(rect2);
        if (rect2.equals(rect)) {
            b9p.a("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            b9p.a("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            b9p.a("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        c7Var.c = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c7Var.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c7Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            c7Var.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c7Var.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c7Var.f(rect3);
            if (c7Var.b != -1) {
                c7 c7Var2 = new c7(AccessibilityNodeInfo.obtain());
                for (int i2 = c7Var.b; i2 != -1; i2 = c7Var2.b) {
                    c7Var2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c7Var2.a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    u(i2, c7Var2);
                    c7Var2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                c7Var.k(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        c7Var.a.setVisibleToUser(true);
                    }
                }
            }
        }
        return c7Var;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.m;
            if (i2 != iN) {
                this.m = iN;
                x(iN, 128);
                x(i2, 256);
            }
            if (iN == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.m = Integer.MIN_VALUE;
                x(Integer.MIN_VALUE, 128);
                x(i, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f, float f2);

    public abstract void o(ArrayList arrayList);

    public final void p(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(i, 2048);
        accessibilityEventK.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    public final boolean q(int i, Rect rect) {
        int i2;
        Object obj;
        c7 c7Var;
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        esa0 esa0Var = new esa0();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            esa0Var.d(((Integer) arrayList.get(i3)).intValue(), l(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int iC = Integer.MIN_VALUE;
        c7 c7Var2 = i4 == Integer.MIN_VALUE ? null : (c7) fsa0.a(esa0Var, i4);
        a aVar = o;
        b bVar = p;
        View view = this.i;
        int i5 = -1;
        if (i == 1 || i == 2) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            boolean z = view.getLayoutDirection() == 1;
            bVar.getClass();
            int iE = esa0Var.e();
            ArrayList arrayList2 = new ArrayList(iE);
            for (int i6 = 0; i6 < iE; i6++) {
                arrayList2.add((c7) esa0Var.f(i6));
            }
            Collections.sort(arrayList2, new l5i.b(z, aVar));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (c7Var2 != null) {
                    size = arrayList2.indexOf(c7Var2);
                }
                int i7 = size - 1;
                obj = i7 >= 0 ? arrayList2.get(i7) : null;
            } else {
                if (i != 2) {
                    hb5.a("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c7Var2 == null ? -1 : arrayList2.lastIndexOf(c7Var2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            c7Var = (c7) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                hb5.a("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i8 = this.l;
            if (i8 != Integer.MIN_VALUE) {
                r(i8).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        hb5.a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    hb5.a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            bVar.getClass();
            int iE2 = esa0Var.e();
            Rect rect4 = new Rect();
            c7Var = null;
            for (int i9 = 0; i9 < iE2; i9++) {
                c7 c7Var3 = (c7) esa0Var.f(i9);
                if (c7Var3 != c7Var2) {
                    aVar.getClass();
                    c7Var3.f(rect4);
                    if (l5i.c(i, rect2, rect4)) {
                        if (!l5i.c(i, rect2, rect3) || l5i.a(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            c7Var = c7Var3;
                        } else if (!l5i.a(i, rect2, rect3, rect4)) {
                            int iD = l5i.d(i, rect2, rect4);
                            int iE3 = l5i.e(i, rect2, rect4);
                            int i10 = (iE3 * iE3) + (iD * 13 * iD);
                            int iD2 = l5i.d(i, rect2, rect3);
                            int iE4 = l5i.e(i, rect2, rect3);
                            if (i10 < (iE4 * iE4) + (iD2 * 13 * iD2)) {
                                rect3.set(rect4);
                                c7Var = c7Var3;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        c7 c7Var4 = c7Var;
        if (c7Var4 != null) {
            if (esa0Var.a) {
                fsa0.b(esa0Var);
            }
            int i11 = esa0Var.d;
            for (int i12 = i2; i12 < i11; i12++) {
                if (esa0Var.c[i12] == c7Var4) {
                    i5 = i12;
                    break;
                }
            }
            iC = esa0Var.c(i5);
        }
        return w(iC);
    }

    public final c7 r(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        c7 c7Var = new c7(accessibilityNodeInfoObtain);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            b9p.a("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c7Var.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return c7Var;
    }

    public abstract boolean s(int i, int i2, Bundle bundle);

    public abstract void u(int i, c7 c7Var);

    public final boolean w(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        v(i, true);
        x(i, 8);
        return true;
    }

    public final void x(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i2));
    }

    public void t(c7 c7Var) {
    }

    public void v(int i, boolean z) {
    }
}
