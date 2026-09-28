package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rla {
    public final b a;
    public o47 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final lxo d = new lxo();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public rla(b bVar, o47 o47Var) {
        this.a = bVar;
        this.b = o47Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            f2z f2zVar = this.b.c;
            f2zVar.Z(r1z.i0.c);
            f2zVar.e[f2zVar.f - f2zVar.c[f2zVar.d - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        o47 o47Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        o47Var.getClass();
        if (size != 0) {
            f2z f2zVar2 = o47Var.c;
            f2zVar2.Z(r1z.h.c);
            f2z.b.a(f2zVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                f2z f2zVar = this.b.c;
                f2zVar.Z(r1z.y.c);
                int i3 = f2zVar.f - f2zVar.c[f2zVar.d - 1].a;
                int[] iArr = f2zVar.e;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                f2z f2zVar2 = this.b.c;
                f2zVar2.Z(r1z.s.c);
                int i6 = f2zVar2.f - f2zVar2.c[f2zVar2.d - 1].a;
                int[] iArr2 = f2zVar2.e;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        f fVar = this.a.G;
        int i = z ? fVar.i : fVar.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            c.b("Tried to seek backward");
        }
        if (i2 > 0) {
            f2z f2zVar = this.b.c;
            f2zVar.Z(r1z.a.c);
            f2zVar.e[f2zVar.f - f2zVar.c[f2zVar.d - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        f fVar = this.a.G;
        if (fVar.c > 0) {
            int i = fVar.i;
            lxo lxoVar = this.d;
            if (lxoVar.a(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.c.Z(r1z.n.c);
                    this.c = true;
                }
                if (i > 0) {
                    l00 l00VarA = fVar.a(i);
                    lxoVar.c(i);
                    d(false);
                    f2z f2zVar = this.b.c;
                    f2zVar.Z(r1z.m.c);
                    f2z.b.a(f2zVar, 0, l00VarA);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                c.b("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
