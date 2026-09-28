package defpackage;

import android.view.View;
import defpackage.ahf;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ahf<T extends ahf<T>> implements uh0.b {
    public static final c m = new c();
    public static final d n = new d();
    public static final e o = new e();
    public static final f p = new f();
    public static final g q = new g();
    public static final a r = new a();
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final y3l e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList<i> k;
    public final ArrayList<j> l;

    public class a extends k {
        @Override // defpackage.y3l
        public final float l(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // defpackage.y3l
        public final void t(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    }

    public class b extends y3l {
        public final /* synthetic */ lxh d;

        public b(lxh lxhVar) {
            this.d = lxhVar;
        }

        @Override // defpackage.y3l
        public final float l(Object obj) {
            return this.d.a;
        }

        @Override // defpackage.y3l
        public final void t(Object obj, float f) {
            this.d.a = f;
        }
    }

    public class c extends k {
        @Override // defpackage.y3l
        public final float l(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // defpackage.y3l
        public final void t(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    }

    public class d extends k {
        @Override // defpackage.y3l
        public final float l(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // defpackage.y3l
        public final void t(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    }

    public class e extends k {
        @Override // defpackage.y3l
        public final float l(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // defpackage.y3l
        public final void t(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    }

    public class f extends k {
        @Override // defpackage.y3l
        public final float l(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // defpackage.y3l
        public final void t(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    }

    public class g extends k {
        @Override // defpackage.y3l
        public final float l(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // defpackage.y3l
        public final void t(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    }

    public static class h {
        public float a;
        public float b;
    }

    public interface i {
        void a(float f);
    }

    public interface j {
        void l(float f);
    }

    public static abstract class k extends y3l {
    }

    public <K> ahf(K k2, y3l y3lVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = k2;
        this.e = y3lVar;
        if (y3lVar == o || y3lVar == p || y3lVar == q) {
            this.j = 0.1f;
            return;
        }
        if (y3lVar == r) {
            this.j = 0.00390625f;
        } else if (y3lVar == m || y3lVar == n) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
    }

    public static uh0 b() {
        ThreadLocal<uh0> threadLocal = uh0.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new uh0(new uh0.d()));
        }
        return threadLocal.get();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:32:0x010b  */
    /* JADX WARN: Code duplicated, block: B:36:0x011d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0123  */
    /* JADX WARN: Code duplicated, block: B:42:0x0138  */
    /* JADX WARN: Code duplicated, block: B:44:0x013e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131 A[EDGE_INSN: B:47:0x0131->B:40:0x0131 BREAK  A[LOOP:0: B:34:0x0115->B:39:0x012e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0141 A[SYNTHETIC] */
    @Override // uh0.b
    public final boolean a(long j2) {
        float f2;
        boolean z;
        uh0 uh0VarB;
        ArrayList<uh0.b> arrayList;
        int iIndexOf;
        ArrayList<i> arrayList2;
        int size;
        long j3 = this.i;
        int i2 = 0;
        if (j3 == 0) {
            this.i = j2;
            c(this.b);
            return false;
        }
        long j4 = j2 - j3;
        this.i = j2;
        float f3 = b().g;
        long j5 = f3 == 0.0f ? 2147483647L : (long) (j4 / f3);
        ckd0 ckd0Var = (ckd0) this;
        boolean z2 = ckd0Var.u;
        float f4 = ckd0Var.t;
        if (!z2) {
            dkd0 dkd0Var = ckd0Var.s;
            float f5 = ckd0Var.b;
            float f6 = ckd0Var.a;
            if (f4 != Float.MAX_VALUE) {
                long j6 = j5 / 2;
                h hVarC = dkd0Var.c(f5, f6, j6);
                dkd0 dkd0Var2 = ckd0Var.s;
                dkd0Var2.i = ckd0Var.t;
                ckd0Var.t = Float.MAX_VALUE;
                h hVarC2 = dkd0Var2.c(hVarC.a, hVarC.b, j6);
                f2 = hVarC2.a;
                ckd0Var.b = f2;
                ckd0Var.a = hVarC2.b;
            } else {
                h hVarC3 = dkd0Var.c(f5, f6, j5);
                f2 = hVarC3.a;
                ckd0Var.b = f2;
                ckd0Var.a = hVarC3.b;
            }
            float fMax = Math.max(f2, ckd0Var.h);
            ckd0Var.b = fMax;
            float fMin = Math.min(fMax, ckd0Var.g);
            ckd0Var.b = fMin;
            float f7 = ckd0Var.a;
            dkd0 dkd0Var3 = ckd0Var.s;
            dkd0Var3.getClass();
            if (Math.abs(f7) >= dkd0Var3.e || Math.abs(fMin - ((float) dkd0Var3.i)) >= dkd0Var3.d) {
                z = false;
            } else {
                ckd0Var.b = (float) ckd0Var.s.i;
                ckd0Var.a = 0.0f;
            }
            float fMin2 = Math.min(this.b, this.g);
            this.b = fMin2;
            float fMax2 = Math.max(fMin2, this.h);
            this.b = fMax2;
            c(fMax2);
            if (z) {
                this.f = false;
                uh0VarB = b();
                uh0VarB.a.remove(this);
                arrayList = uh0VarB.b;
                iIndexOf = arrayList.indexOf(this);
                if (iIndexOf >= 0) {
                    arrayList.set(iIndexOf, null);
                    uh0VarB.f = true;
                }
                this.i = 0L;
                this.c = false;
                while (true) {
                    arrayList2 = this.k;
                    if (i2 < arrayList2.size()) {
                        break;
                    }
                    if (arrayList2.get(i2) != null) {
                        arrayList2.get(i2).a(this.b);
                    }
                    i2++;
                }
                for (size = arrayList2.size() - 1; size >= 0; size--) {
                    if (arrayList2.get(size) == null) {
                        arrayList2.remove(size);
                    }
                }
            }
            return z;
        }
        if (f4 != Float.MAX_VALUE) {
            ckd0Var.s.i = f4;
            ckd0Var.t = Float.MAX_VALUE;
        }
        ckd0Var.b = (float) ckd0Var.s.i;
        ckd0Var.a = 0.0f;
        ckd0Var.u = false;
        z = true;
        float fMin3 = Math.min(this.b, this.g);
        this.b = fMin3;
        float fMax3 = Math.max(fMin3, this.h);
        this.b = fMax3;
        c(fMax3);
        if (z) {
            this.f = false;
            uh0VarB = b();
            uh0VarB.a.remove(this);
            arrayList = uh0VarB.b;
            iIndexOf = arrayList.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList.set(iIndexOf, null);
                uh0VarB.f = true;
            }
            this.i = 0L;
            this.c = false;
            while (true) {
                arrayList2 = this.k;
                if (i2 < arrayList2.size()) {
                    break;
                    break;
                }
                if (arrayList2.get(i2) != null) {
                    arrayList2.get(i2).a(this.b);
                }
                i2++;
            }
            while (size >= 0) {
                if (arrayList2.get(size) == null) {
                    arrayList2.remove(size);
                }
            }
        }
        return z;
    }

    public final void c(float f2) {
        ArrayList<j> arrayList;
        this.e.t(this.d, f2);
        int i2 = 0;
        while (true) {
            arrayList = this.l;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                arrayList.get(i2).l(this.b);
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public ahf(lxh lxhVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = null;
        this.e = new b(lxhVar);
        this.j = 1.0f;
    }
}
