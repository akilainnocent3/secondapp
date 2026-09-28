package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.g;
import androidx.compose.runtime.h;
import com.google.protobuf.Reader;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class y6w {
    public final g a;

    public y6w(g gVar) {
        this.a = gVar;
    }

    public static final void a(h hVar, int i) {
        while (hVar.v >= 0 && hVar.u <= i) {
            hVar.M();
            hVar.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rtw b(fv0 fv0Var, ccy ccyVar) {
        g gVar;
        int i;
        Object[] objArr = ccyVar.a;
        int i2 = ccyVar.b;
        Object[] objArr2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        while (true) {
            gVar = this.a;
            if (i7 >= i2) {
                break;
            }
            if (!gVar.f(((z6w) objArr[i7]).e)) {
                etw etwVar = new etw((Object) null);
                Object[] objArr3 = ccyVar.a;
                int i8 = ccyVar.b;
                for (int i9 = i3; i9 < i8; i9++) {
                    Object obj = objArr3[i9];
                    if (gVar.f(((z6w) obj).e)) {
                        etwVar.g(obj);
                    }
                }
                ccyVar = etwVar;
                break;
            }
            i7++;
        }
        x6w x6wVar = new x6w(this, objArr2 == true ? 1 : 0);
        int i10 = 1;
        int i11 = 1;
        boolean z2 = true;
        if (ccyVar.b > 1) {
            Comparable comparable = (Comparable) x6wVar.invoke(ccyVar.b(i5));
            int i12 = ccyVar.b;
            int i13 = i11;
            while (i13 < i12) {
                Comparable comparable2 = (Comparable) x6wVar.invoke(ccyVar.b(i13));
                if (comparable.compareTo(comparable2) > 0) {
                    etw etwVar2 = new etw(ccyVar.b);
                    Object[] objArr4 = ccyVar.a;
                    int i14 = ccyVar.b;
                    for (int i15 = i4; i15 < i14; i15++) {
                        etwVar2.g(objArr4[i15]);
                    }
                    etw.b bVar = etwVar2.c;
                    if (bVar == null) {
                        bVar = new etw.b(etwVar2);
                        etwVar2.c = bVar;
                    }
                    if (bVar.a.b > i10) {
                        o48.v(new z3h(x6wVar), bVar);
                    }
                    ccyVar = etwVar2;
                    break;
                }
                i13++;
                comparable = comparable2;
            }
        }
        if (ccyVar.d()) {
            rtw rtwVar = fz60.b;
            rtwVar.getClass();
            return rtwVar;
        }
        rtw rtwVarB = fz60.b();
        h hVarE = gVar.e();
        try {
            Object[] objArr5 = ccyVar.a;
            int i16 = ccyVar.b;
            for (int i17 = i6; i17 < i16; i17++) {
                z6w z6wVar = (z6w) objArr5[i17];
                int iC = hVarE.c(z6wVar.e);
                int iE = hVarE.E(hVarE.b, iC);
                a(hVarE, iE);
                a(hVarE, iE);
                while (true) {
                    i = hVarE.t;
                    if (i == iE || i == hVarE.u) {
                        break;
                        break;
                    }
                    if (iE < hVarE.s(i) + i) {
                        hVarE.P();
                    } else {
                        hVarE.L();
                    }
                }
                if (i != iE) {
                    c.b("Unexpected slot table structure");
                }
                hVarE.P();
                hVarE.a(iC - hVarE.t);
                rtwVarB.m(z6wVar, c.d(z6wVar.c, z6wVar, hVarE, fv0Var));
            }
            a(hVarE, Reader.READ_DONE);
            Unit unit = Unit.a;
            return rtwVarB;
        } finally {
            hVarE.e(z);
        }
    }
}
