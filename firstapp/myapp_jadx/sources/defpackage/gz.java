package defpackage;

import com.sportygames.commons.remote.model.ResultWrapper;

/* JADX INFO: loaded from: classes7.dex */
public final class gz {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        az azVar;
        if (x1bVar instanceof az) {
            azVar = (az) x1bVar;
            int i = azVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                azVar.c = i - Integer.MIN_VALUE;
            } else {
                azVar = new az(this, x1bVar);
            }
        } else {
            azVar = new az(this, x1bVar);
        }
        Object objD = azVar.a;
        y5b y5bVar = y5b.a;
        int i2 = azVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            bz bzVar = new bz(str, null);
            azVar.c = 1;
            objD = ej5.d(oddVar, new a52(bzVar, null), azVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return (ResultWrapper) objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(Integer num, String str, Integer num2, String str2, String str3, Double d, x1b x1bVar) {
        cz czVar;
        if (x1bVar instanceof cz) {
            czVar = (cz) x1bVar;
            int i = czVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                czVar.c = i - Integer.MIN_VALUE;
            } else {
                czVar = new cz(this, x1bVar);
            }
        } else {
            czVar = new cz(this, x1bVar);
        }
        Object objD = czVar.a;
        y5b y5bVar = y5b.a;
        int i2 = czVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            dz dzVar = new dz(num, str, num2, str2, str3, d, null);
            czVar.c = 1;
            objD = ej5.d(oddVar, new a52(dzVar, null), czVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return (ResultWrapper) objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, int i2, x1b x1bVar) {
        ez ezVar;
        if (x1bVar instanceof ez) {
            ezVar = (ez) x1bVar;
            int i3 = ezVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ezVar.c = i3 - Integer.MIN_VALUE;
            } else {
                ezVar = new ez(this, x1bVar);
            }
        } else {
            ezVar = new ez(this, x1bVar);
        }
        Object objD = ezVar.a;
        y5b y5bVar = y5b.a;
        int i4 = ezVar.c;
        if (i4 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            fz fzVar = new fz(i, i2, null);
            ezVar.c = 1;
            objD = ej5.d(oddVar, new a52(fzVar, null), ezVar);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return (ResultWrapper) objD;
    }
}
