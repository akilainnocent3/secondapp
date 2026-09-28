package defpackage;

import androidx.compose.ui.layout.d;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;

/* JADX INFO: loaded from: classes.dex */
public final class jln implements uk40 {
    public final uk40[] a;
    public final k0 b;
    public final f c;
    public final k0 d;
    public final f e;

    public jln(uk40[] uk40VarArr) {
        this.a = uk40VarArr;
        int length = uk40VarArr.length;
        k0[] k0VarArr = new k0[length];
        for (int i = 0; i < length; i++) {
            k0VarArr[i] = this.a[i].a();
        }
        this.b = new k0(new i0(k0VarArr));
        int length2 = this.a.length;
        f[] fVarArr = new f[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            fVarArr[i2] = this.a[i2].b();
        }
        this.c = new f(new d(fVarArr));
        int length3 = this.a.length;
        k0[] k0VarArr2 = new k0[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            k0VarArr2[i3] = this.a[i3].d();
        }
        this.d = new k0(new j0(k0VarArr2));
        int length4 = this.a.length;
        f[] fVarArr2 = new f[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            fVarArr2[i4] = this.a[i4].c();
        }
        this.e = new f(new e(fVarArr2));
    }

    @Override // defpackage.uk40
    public final k0 a() {
        return this.b;
    }

    @Override // defpackage.uk40
    public final f b() {
        return this.c;
    }

    @Override // defpackage.uk40
    public final f c() {
        return this.e;
    }

    @Override // defpackage.uk40
    public final k0 d() {
        return this.d;
    }

    public final String toString() {
        return ay0.G(this.a, null, "innermostOf(", ")", null, 57);
    }
}
