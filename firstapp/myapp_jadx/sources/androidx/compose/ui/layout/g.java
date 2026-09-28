package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.c5a0;
import defpackage.etw;
import defpackage.g9i0;
import defpackage.h8j0;
import defpackage.ise;
import defpackage.isw;
import defpackage.l8j0;
import defpackage.msw;
import defpackage.o9j0;
import defpackage.osw;
import defpackage.r6i0;
import defpackage.rtw;
import defpackage.t5a0;
import defpackage.u5a0;
import defpackage.uk40;
import defpackage.v5a0;
import defpackage.vk40;
import defpackage.x5a0;
import defpackage.ymn;
import defpackage.ytw;
import defpackage.zmy;
import defpackage.zx;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h8j0.b implements Runnable, zmy, View.OnAttachStateChangeListener {
    public boolean c;
    public int d;
    public l8j0 e;
    public final rtw f;
    public final osw i;
    public final etw<ytw<Rect>> v;
    public final SnapshotStateList<uk40> w;

    public g() {
        super(1);
        rtw rtwVar = new rtw(9);
        l0.a.getClass();
        rtwVar.m(l0.a.b, new o9j0("caption bar"));
        rtwVar.m(l0.a.c, new o9j0("display cutout"));
        rtwVar.m(l0.a.d, new o9j0("ime"));
        rtwVar.m(l0.a.e, new o9j0("mandatory system gestures"));
        rtwVar.m(l0.a.f, new o9j0("navigation bars"));
        rtwVar.m(l0.a.g, new o9j0("status bars"));
        rtwVar.m(l0.a.h, new o9j0("system gestures"));
        rtwVar.m(l0.a.i, new o9j0("tappable element"));
        rtwVar.m(l0.a.j, new o9j0("waterfall"));
        this.f = rtwVar;
        this.i = androidx.compose.runtime.k.a(0);
        this.v = new etw<>(4);
        this.w = new SnapshotStateList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h8j0.b
    public final void a(h8j0 h8j0Var) {
        this.c = false;
        int iD = h8j0Var.a.d();
        this.d &= ~iD;
        this.e = null;
        l0 l0VarB = n0.c.b(iD);
        if (l0VarB != null) {
            V vD = this.f.d(l0VarB);
            vD.getClass();
            o9j0 o9j0Var = (o9j0) vD;
            isw iswVar = o9j0Var.c;
            ((t5a0) iswVar).A(0.0f);
            ((t5a0) o9j0Var.e).A(1.0f);
            ((v5a0) o9j0Var.d).K(0L);
            ((t5a0) iswVar).A(0.0f);
            ((x5a0) o9j0Var.b).setValue(Boolean.FALSE);
            o9j0Var.j = -1L;
            o9j0Var.k = -1L;
            u5a0 u5a0Var = (u5a0) this.i;
            u5a0Var.k(u5a0Var.D() + 1);
            c5a0.e.getClass();
            c5a0.a.f();
        }
    }

    @Override // defpackage.zmy
    public final l8j0 b(View view, l8j0 l8j0Var) {
        if (this.c) {
            this.e = l8j0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return l8j0Var;
            }
        } else if (this.d == 0) {
            f(l8j0Var);
        }
        return l8j0Var;
    }

    @Override // h8j0.b
    public final void c(h8j0 h8j0Var) {
        this.c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h8j0.b
    public final l8j0 d(l8j0 l8j0Var, List<h8j0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h8j0 h8j0Var = list.get(i);
            l0 l0VarB = n0.c.b(h8j0Var.a.d());
            if (l0VarB != null) {
                V vD = this.f.d(l0VarB);
                vD.getClass();
                o9j0 o9j0Var = (o9j0) vD;
                if (((Boolean) ((x5a0) o9j0Var.b).getValue()).booleanValue()) {
                    h8j0.e eVar = h8j0Var.a;
                    ((t5a0) o9j0Var.c).A(eVar.c());
                    ((t5a0) o9j0Var.e).A(eVar.a());
                    ((v5a0) o9j0Var.d).K(eVar.b());
                }
            }
        }
        f(l8j0Var);
        return l8j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h8j0.b
    public final h8j0.a e(h8j0 h8j0Var, h8j0.a aVar) {
        l8j0 l8j0Var = this.e;
        this.c = false;
        this.e = null;
        h8j0.e eVar = h8j0Var.a;
        if (eVar.b() > 0 && l8j0Var != null) {
            int iD = eVar.d();
            this.d |= iD;
            l0 l0VarB = n0.c.b(iD);
            if (l0VarB != null) {
                V vD = this.f.d(l0VarB);
                vD.getClass();
                o9j0 o9j0Var = (o9j0) vD;
                ymn ymnVarG = l8j0Var.a.g(iD);
                long j = ((long) ymnVarG.d) | (((long) ymnVarG.a) << 48) | (((long) ymnVarG.b) << 32) | (((long) ymnVarG.c) << 16);
                long j2 = o9j0Var.h;
                if (!zx.a(j, j2)) {
                    o9j0Var.j = j2;
                    o9j0Var.k = j;
                    ((x5a0) o9j0Var.b).setValue(Boolean.TRUE);
                    ((t5a0) o9j0Var.c).A(eVar.c());
                    ((t5a0) o9j0Var.e).A(eVar.a());
                    ((v5a0) o9j0Var.d).K(eVar.b());
                    u5a0 u5a0Var = (u5a0) this.i;
                    u5a0Var.k(u5a0Var.D() + 1);
                    c5a0.e.getClass();
                    c5a0.a.f();
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(l8j0 l8j0Var) {
        char c;
        boolean z;
        char c2;
        char c3;
        char c4;
        long j;
        boolean z2;
        boolean z3;
        long j2;
        long jB;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int i;
        char c5;
        int[] iArr4;
        msw mswVar = n0.a;
        int[] iArr5 = mswVar.b;
        Object[] objArr = mswVar.c;
        long[] jArr5 = mswVar.a;
        int length = jArr5.length - 2;
        char c6 = 7;
        rtw rtwVar = this.f;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            z2 = false;
            z3 = false;
            z = true;
            c2 = 16;
            c3 = ' ';
            while (true) {
                long j3 = jArr5[i3];
                c4 = '0';
                j = -9187201950435737472L;
                if ((((~j3) << c6) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            c5 = c6;
                            int i7 = iArr5[i6];
                            i = i2;
                            l0 l0Var = (l0) objArr[i6];
                            ymn ymnVarG = l8j0Var.a.g(i7);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j4 = (((long) ymnVarG.a) << 48) | (((long) ymnVarG.b) << 32) | (((long) ymnVarG.c) << 16) | ((long) ymnVarG.d);
                            V vD = rtwVar.d(l0Var);
                            vD.getClass();
                            o9j0 o9j0Var = (o9j0) vD;
                            if (!zx.a(j4, o9j0Var.h)) {
                                o9j0Var.h = j4;
                                z2 = true;
                                if (!zx.a(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            i = i2;
                            c5 = c6;
                            iArr4 = iArr5;
                        }
                        j3 >>= i;
                        i5++;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                        c6 = c5;
                        i2 = i;
                    }
                    jArr3 = jArr5;
                    c = c6;
                    iArr3 = iArr5;
                    if (i4 != i2) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    c = c6;
                    iArr3 = iArr5;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                c6 = c;
                i2 = 8;
            }
        } else {
            c = 7;
            z = true;
            c2 = 16;
            c3 = ' ';
            c4 = '0';
            j = -9187201950435737472L;
            z2 = false;
            z3 = false;
        }
        msw<l0> mswVar2 = n0.c;
        int[] iArr6 = mswVar2.b;
        Object[] objArr2 = mswVar2.c;
        long[] jArr6 = mswVar2.a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr6[i8];
                if ((((~j5) << c) & j5 & j) != j) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i8 << 3) + i10;
                            int i12 = iArr6[i11];
                            V vD2 = rtwVar.d((l0) objArr2[i11]);
                            vD2.getClass();
                            o9j0 o9j0Var2 = (o9j0) vD2;
                            if (i12 != 8) {
                                ymn ymnVarH = l8j0Var.a.h(i12);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j6 = (((long) ymnVarH.a) << c4) | (((long) ymnVarH.b) << c3) | (((long) ymnVarH.c) << c2) | ((long) ymnVarH.d);
                                if (!zx.a(o9j0Var2.i, j6)) {
                                    o9j0Var2.i = j6;
                                    z2 = z;
                                    if (!zx.a(j6, 0L)) {
                                        z3 = z2;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            ((x5a0) o9j0Var2.a).setValue(Boolean.valueOf(l8j0Var.a.q(i12)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j5 >>= 8;
                        i10++;
                        iArr6 = iArr2;
                        jArr6 = jArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                iArr6 = iArr;
                jArr6 = jArr;
            }
        }
        ise iseVarF = l8j0Var.a.f();
        if (iseVarF == null) {
            j2 = 0;
        } else {
            ymn ymnVarA = iseVarF.a();
            j2 = (((long) ymnVarA.a) << c4) | (((long) ymnVarA.b) << c3) | (((long) ymnVarA.c) << c2) | ((long) ymnVarA.d);
        }
        l0.a.getClass();
        V vD3 = rtwVar.d(l0.a.j);
        vD3.getClass();
        o9j0 o9j0Var3 = (o9j0) vD3;
        if (!zx.a(o9j0Var3.h, j2)) {
            o9j0Var3.h = j2;
            o9j0Var3.i = j2;
            z2 = z;
            if (!zx.a(j2, 0L)) {
                z3 = z2;
            }
        }
        if (iseVarF == null) {
            jB = 0;
        } else {
            int i13 = Build.VERSION.SDK_INT;
            jB = ((long) (i13 >= 28 ? ise.a.b(iseVarF.a) : 0)) | (((long) (i13 >= 28 ? ise.a.e(iseVarF.a) : 0)) << c3) | (((long) (i13 >= 28 ? ise.a.c(iseVarF.a) : 0)) << c4) | (((long) (i13 >= 28 ? ise.a.d(iseVarF.a) : 0)) << c2);
        }
        V vD4 = rtwVar.d(l0.a.c);
        vD4.getClass();
        o9j0 o9j0Var4 = (o9j0) vD4;
        if (!zx.a(jB, o9j0Var4.h)) {
            o9j0Var4.h = jB;
            o9j0Var4.i = jB;
            z2 = z;
            if (!zx.a(jB, 0L)) {
                z3 = z2;
            }
        }
        SnapshotStateList<uk40> snapshotStateList = this.w;
        etw<ytw<Rect>> etwVar = this.v;
        if (iseVarF != null) {
            List<Rect> listA = Build.VERSION.SDK_INT >= 28 ? ise.a.a(iseVarF.a) : Collections.EMPTY_LIST;
            if (listA.size() < etwVar.b) {
                etwVar.l(listA.size(), etwVar.b);
                snapshotStateList.e(listA.size(), snapshotStateList.size());
                z2 = z;
            } else {
                int size = listA.size() - etwVar.b;
                int i14 = 0;
                while (i14 < size) {
                    etwVar.g(androidx.compose.runtime.m.b(listA.get(etwVar.b)));
                    snapshotStateList.add(new vk40("display cutout rect " + etwVar.b));
                    i14++;
                    z2 = z;
                }
            }
            int size2 = listA.size();
            for (int i15 = 0; i15 < size2; i15++) {
                Rect rect = listA.get(i15);
                ytw<Rect> ytwVarB = etwVar.b(i15);
                if (!Intrinsics.g(ytwVarB.getValue(), rect)) {
                    ytwVarB.setValue(rect);
                    z2 = z;
                }
            }
            if (!listA.isEmpty()) {
                z3 = z;
            }
        } else if (etwVar.b > 0) {
            etwVar.i();
            snapshotStateList.clear();
            z2 = z;
        }
        osw oswVar = this.i;
        if ((z3 || ((u5a0) oswVar).D() != 0) && z2) {
            u5a0 u5a0Var = (u5a0) oswVar;
            u5a0Var.k(u5a0Var.D() + 1);
            c5a0.e.getClass();
            c5a0.a.f();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(view, this);
        h8j0.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(view, null);
        h8j0.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            this.d = 0;
            this.c = false;
            l8j0 l8j0Var = this.e;
            if (l8j0Var != null) {
                f(l8j0Var);
                this.e = null;
            }
        }
    }
}
