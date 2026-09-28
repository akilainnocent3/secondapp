package defpackage;

import android.content.Context;
import com.sportygames.newcms.d;

/* JADX INFO: loaded from: classes7.dex */
public final class zve0 {
    public final t4l a;
    public final d b;
    public final cwe0 c;
    public final vmy d;
    public final kh8 e;
    public final Context f;
    public final b5 g;
    public final pp5 h;

    public zve0(t4l t4lVar, d dVar, cwe0 cwe0Var, vmy vmyVar, kh8 kh8Var, Context context, b5 b5Var, pp5 pp5Var) {
        t4lVar.getClass();
        dVar.getClass();
        cwe0Var.getClass();
        vmyVar.getClass();
        kh8Var.getClass();
        context.getClass();
        b5Var.getClass();
        pp5Var.getClass();
        this.a = t4lVar;
        this.b = dVar;
        this.c = cwe0Var;
        this.d = vmyVar;
        this.e = kh8Var;
        this.f = context;
        this.g = b5Var;
        this.h = pp5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String[] strArr, x1b x1bVar) {
        sve0 sve0Var;
        if (x1bVar instanceof sve0) {
            sve0Var = (sve0) x1bVar;
            int i = sve0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sve0Var.d = i - Integer.MIN_VALUE;
            } else {
                sve0Var = new sve0(this, x1bVar);
            }
        } else {
            sve0Var = new sve0(this, x1bVar);
        }
        Object obj = sve0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = sve0Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            tve0 tve0Var = new tve0(this, null);
            sve0Var.a = strArr;
            sve0Var.d = 1;
            if (ej5.d(wclVar, tve0Var, sve0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strArr = sve0Var.a;
            uj50.b(obj);
        }
        or60 or60Var = new or60(new uve0(this, strArr, null));
        pfd pfdVar2 = fse.a;
        return ozh.c(or60Var, odd.b);
    }
}
