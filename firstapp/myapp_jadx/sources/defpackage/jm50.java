package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class jm50 {
    public final cl50 a;

    public jm50(cl50 cl50Var) {
        this.a = cl50Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, long j, long j2, String str2, String str3, String str4, String str5, x1b x1bVar) {
        hm50 hm50Var;
        if (x1bVar instanceof hm50) {
            hm50Var = (hm50) x1bVar;
            int i = hm50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hm50Var.c = i - Integer.MIN_VALUE;
            } else {
                hm50Var = new hm50(this, x1bVar);
            }
        } else {
            hm50Var = new hm50(this, x1bVar);
        }
        hm50 hm50Var2 = hm50Var;
        Object objB = hm50Var2.a;
        y5b y5bVar = y5b.a;
        int i2 = hm50Var2.c;
        if (i2 == 0) {
            uj50.b(objB);
            hm50Var2.c = 1;
            objB = this.a.b(str, j, j2, str2, str3, str4, str5, hm50Var2);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objB);
        }
        return n52.b((BaseResponse) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(rm50 rm50Var, x1b x1bVar) {
        im50 im50Var;
        if (x1bVar instanceof im50) {
            im50Var = (im50) x1bVar;
            int i = im50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                im50Var.c = i - Integer.MIN_VALUE;
            } else {
                im50Var = new im50(this, x1bVar);
            }
        } else {
            im50Var = new im50(this, x1bVar);
        }
        Object obj = im50Var.a;
        y5b y5bVar = y5b.a;
        int i2 = im50Var.c;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                uj50.b(obj);
                return ((zi50) obj).a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        boolean z = rm50Var instanceof rm50.c;
        cl50 cl50Var = this.a;
        if (z) {
            String str = ((rm50.c) rm50Var).b;
            im50Var.c = 1;
            Object objA = cl50Var.a(str, null, im50Var);
            if (objA != y5bVar) {
                return objA;
            }
        } else {
            if (!(rm50Var instanceof rm50.b)) {
                uhc.a();
                return null;
            }
            String str2 = ((rm50.b) rm50Var).b;
            im50Var.c = 2;
            Object objA2 = cl50Var.a(null, str2, im50Var);
            if (objA2 != y5bVar) {
                return objA2;
            }
        }
        return y5bVar;
    }
}
