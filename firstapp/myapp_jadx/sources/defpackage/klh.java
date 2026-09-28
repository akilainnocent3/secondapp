package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class klh<T> extends okh<T> implements w7k0<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.w7k0
    public final Object b(Object obj, x1b x1bVar) throws IOException {
        jlh jlhVar;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (x1bVar instanceof jlh) {
            jlhVar = (jlh) x1bVar;
            int i = jlhVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jlhVar.e = i - Integer.MIN_VALUE;
            } else {
                jlhVar = new jlh(this, x1bVar);
            }
        } else {
            jlhVar = new jlh(this, x1bVar);
        }
        Object obj2 = jlhVar.c;
        y5b y5bVar = y5b.a;
        int i2 = jlhVar.e;
        if (i2 == 0) {
            uj50.b(obj2);
            if (this.c.get()) {
                ib5.a("This scope has already been closed.");
                return null;
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
            try {
                ne80<T> ne80Var = this.b;
                gdh0 gdh0Var = new gdh0(fileOutputStream3);
                jlhVar.a = fileOutputStream3;
                jlhVar.b = fileOutputStream3;
                jlhVar.e = 1;
                if (ne80Var.a(obj, gdh0Var) == y5bVar) {
                    return y5bVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = jlhVar.b;
            fileOutputStream = jlhVar.a;
            try {
                uj50.b(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ft7.a(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        Unit unit = Unit.a;
        ft7.a(fileOutputStream, null);
        return Unit.a;
    }
}
