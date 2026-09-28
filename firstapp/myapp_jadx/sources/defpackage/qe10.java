package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.f;
import java.util.List;
import kotlin.time.b;
import kotlin.time.c;
import kotlin.time.d;

/* JADX INFO: loaded from: classes5.dex */
public final class qe10 {
    public final et7 a;
    public final ztw<f> b;
    public final n910 c;
    public final ebk d;
    public final us7.a e;
    public int f;
    public ebk.a g;
    public List<ib00> h;
    public int i;
    public jvd0 j;
    public jvd0 k;

    public static final class a {
        public final ebk a;
        public final us7.a b;

        public a(ebk ebkVar, us7.a aVar) {
            v4c v4cVar = v4c.a;
            aVar.getClass();
            this.a = ebkVar;
            this.b = aVar;
        }
    }

    public qe10(et7 et7Var, wwd0 wwd0Var, n910 n910Var, ebk ebkVar, us7.a aVar) {
        v4c v4cVar = v4c.a;
        this.a = et7Var;
        this.b = wwd0Var;
        this.c = n910Var;
        this.d = ebkVar;
        this.e = aVar;
        this.h = m2g.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, x1b x1bVar) {
        se10 se10Var;
        Object objA;
        if (x1bVar instanceof se10) {
            se10Var = (se10) x1bVar;
            int i2 = se10Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                se10Var.c = i2 - Integer.MIN_VALUE;
            } else {
                se10Var = new se10(this, x1bVar);
            }
        } else {
            se10Var = new se10(this, x1bVar);
        }
        Object obj = se10Var.a;
        y5b y5bVar = y5b.a;
        int i3 = se10Var.c;
        if (i3 == 0) {
            uj50.b(obj);
            this.f = i;
            se10Var.c = 1;
            objA = this.d.a(i, se10Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        ebk.a aVar2 = (ebk.a) (objA instanceof zi50.b ? null : objA);
        if (aVar2 != null) {
            this.g = aVar2;
            this.i = aVar2.a.size();
        }
        return objA;
    }

    public final long b(ebk.b bVar) {
        d dVar = d.c;
        d dVarA = d.a.a(bVar.d);
        this.e.getClass();
        d dVarA2 = gsn.a.a();
        dVarA.getClass();
        dVarA2.getClass();
        b.a aVar = b.b;
        long j = dVarA.a - dVarA2.a;
        rgf rgfVar = rgf.SECONDS;
        return b.j(b.i(c.i(j, rgfVar), c.h(dVarA.b - dVarA2.b, rgf.NANOSECONDS)), rgfVar);
    }
}
