package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kez<T> implements nis {
    public final mi10<T> a;
    public final mi10<T> b;
    public final nis c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public kez(mi10<T> mi10Var, mi10<T> mi10Var2, nis nisVar) {
        mi10Var.getClass();
        mi10Var2.getClass();
        this.a = mi10Var;
        this.b = mi10Var2;
        this.c = nisVar;
        this.d = mi10Var.d();
        this.e = mi10Var.f();
        this.f = mi10Var.b();
        this.g = 1;
        this.h = 1;
    }

    @Override // defpackage.nis
    public final void onChanged(int i, int i2, Object obj) {
        this.c.onChanged(i + this.d, i2, obj);
    }

    @Override // defpackage.nis
    public final void onInserted(int i, int i2) {
        int i3 = this.f;
        vpe vpeVar = vpe.b;
        nis nisVar = this.c;
        if (i >= i3 && this.h != 2) {
            int iMin = Math.min(i2, this.e);
            if (iMin > 0) {
                this.h = 3;
                nisVar.onChanged(this.d + i, iMin, vpeVar);
                this.e -= iMin;
            }
            int i4 = i2 - iMin;
            if (i4 > 0) {
                nisVar.onInserted(i + iMin + this.d, i4);
            }
        } else if (i <= 0 && this.g != 2) {
            int iMin2 = Math.min(i2, this.d);
            if (iMin2 > 0) {
                this.g = 3;
                nisVar.onChanged((0 - iMin2) + this.d, iMin2, vpeVar);
                this.d -= iMin2;
            }
            int i5 = i2 - iMin2;
            if (i5 > 0) {
                nisVar.onInserted(this.d, i5);
            }
        } else {
            nisVar.onInserted(i + this.d, i2);
        }
        this.f += i2;
    }

    @Override // defpackage.nis
    public final void onMoved(int i, int i2) {
        int i3 = this.d;
        this.c.onMoved(i + i3, i2 + i3);
    }

    @Override // defpackage.nis
    public final void onRemoved(int i, int i2) {
        int i3;
        int i4 = i + i2;
        int i5 = this.f;
        vpe vpeVar = vpe.a;
        mi10<T> mi10Var = this.b;
        nis nisVar = this.c;
        if (i4 >= i5 && this.h != 3) {
            int iMin = Math.min(mi10Var.f() - this.e, i2);
            i3 = iMin >= 0 ? iMin : 0;
            int i6 = i2 - i3;
            if (i3 > 0) {
                this.h = 2;
                nisVar.onChanged(this.d + i, i3, vpeVar);
                this.e += i3;
            }
            if (i6 > 0) {
                nisVar.onRemoved(i + i3 + this.d, i6);
            }
        } else if (i <= 0 && this.g != 3) {
            int iMin2 = Math.min(mi10Var.d() - this.d, i2);
            i3 = iMin2 >= 0 ? iMin2 : 0;
            int i7 = i2 - i3;
            if (i7 > 0) {
                nisVar.onRemoved(this.d, i7);
            }
            if (i3 > 0) {
                this.g = 2;
                nisVar.onChanged(this.d, i3, vpeVar);
                this.d += i3;
            }
        } else {
            nisVar.onRemoved(i + this.d, i2);
        }
        this.f -= i2;
    }
}
