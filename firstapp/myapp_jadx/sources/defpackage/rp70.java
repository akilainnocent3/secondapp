package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rp70 extends d.c implements psr, ya80 {
    public zp70 D;
    public boolean E;
    public boolean F;

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        if (this.F) {
            i = Reader.READ_DONE;
        }
        return mzoVar.b0(i);
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        lb80.j(pb80Var);
        vo70 vo70Var = new vo70(new qp70(this, 0), new ibq(this, 2), this.E);
        if (this.F) {
            ob80<vo70> ob80Var = hb80.u;
            ohp<Object> ohpVar = lb80.a[12];
            pb80Var.b(ob80Var, vo70Var);
        } else {
            ob80<vo70> ob80Var2 = hb80.t;
            ohp<Object> ohpVar2 = lb80.a[11];
            pb80Var.b(ob80Var2, vo70Var);
        }
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        dj7.a(j, this.F ? i3z.a : i3z.b);
        boolean z = this.F;
        int i = Reader.READ_DONE;
        int iH = z ? Integer.MAX_VALUE : kxa.h(j);
        if (this.F) {
            i = kxa.i(j);
        }
        final y yVarD0 = vhvVar.d0(kxa.b(0, i, 0, iH, 5, j));
        int i2 = yVarD0.a;
        int i3 = kxa.i(j);
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = yVarD0.b;
        int iH2 = kxa.h(j);
        if (i4 > iH2) {
            i4 = iH2;
        }
        final int i5 = yVarD0.b - i4;
        int i6 = yVarD0.a - i2;
        if (!this.F) {
            i5 = i6;
        }
        zp70 zp70Var = this.D;
        osw oswVar = zp70Var.d;
        osw oswVar2 = zp70Var.a;
        ((u5a0) oswVar).k(i5);
        c5a0.e.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            if (((u5a0) oswVar2).D() > i5) {
                ((u5a0) oswVar2).k(i5);
            }
            Unit unit = Unit.a;
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            ((u5a0) this.D.b).k(this.F ? i4 : i2);
            return t.z1(tVar, i2, i4, new Function1() { // from class: pp70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    y.a aVar = (y.a) obj;
                    rp70 rp70Var = this.a;
                    int iD = ((u5a0) rp70Var.D.a).D();
                    if (iD < 0) {
                        iD = 0;
                    }
                    int i7 = i5;
                    if (iD > i7) {
                        iD = i7;
                    }
                    int i8 = rp70Var.E ? iD - i7 : -iD;
                    boolean z2 = rp70Var.F;
                    int i9 = z2 ? 0 : i8;
                    if (!z2) {
                        i8 = 0;
                    }
                    aVar.a = true;
                    y.a.C(aVar, yVarD0, i9, i8);
                    Unit unit2 = Unit.a;
                    aVar.a = false;
                    return Unit.a;
                }
            });
        } catch (Throwable th) {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            throw th;
        }
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        if (this.F) {
            i = Reader.READ_DONE;
        }
        return mzoVar.a0(i);
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        if (!this.F) {
            i = Reader.READ_DONE;
        }
        return mzoVar.x(i);
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        if (!this.F) {
            i = Reader.READ_DONE;
        }
        return mzoVar.R(i);
    }
}
