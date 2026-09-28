package defpackage;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class lpa0 {
    public final Object a;
    public final Object b;

    public /* synthetic */ lpa0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public fm5 a() {
        String str = (String) this.a;
        if (str != null) {
            return lm5.h(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + ((String) this.b) + ". Using WrapContent.");
        return lm5.h("wrap");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, File file, x1b x1bVar) {
        jpa0 jpa0Var;
        if (x1bVar instanceof jpa0) {
            jpa0Var = (jpa0) x1bVar;
            int i = jpa0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jpa0Var.c = i - Integer.MIN_VALUE;
            } else {
                jpa0Var = new jpa0(this, x1bVar);
            }
        } else {
            jpa0Var = new jpa0(this, x1bVar);
        }
        Object objD = jpa0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = jpa0Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            k5b k5bVar = (k5b) this.b;
            kpa0 kpa0Var = new kpa0(str, file, this, null);
            jpa0Var.c = 1;
            objD = ej5.d(k5bVar, kpa0Var, jpa0Var);
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
        return ((zi50) objD).a;
    }
}
