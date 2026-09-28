package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.Closeable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class xu5 implements hmx {
    public final Call.Factory a;

    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(Call.Factory factory, wnx wnxVar, wmx wmxVar, x1b x1bVar) throws Throwable {
        wu5 wu5Var;
        Function2 function2;
        Function2 function3;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (x1bVar instanceof wu5) {
            wu5Var = (wu5) x1bVar;
            int i = wu5Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wu5Var.d = i - Integer.MIN_VALUE;
            } else {
                wu5Var = new wu5(x1bVar);
            }
        } else {
            wu5Var = new wu5(x1bVar);
        }
        Object objC = wu5Var.c;
        y5b y5bVar = y5b.a;
        int i2 = wu5Var.d;
        if (i2 == 0) {
            uj50.b(objC);
            wu5Var.a = wmxVar;
            wu5Var.b = factory;
            wu5Var.d = 1;
            objC = tsh0.c(wnxVar, wu5Var);
            if (objC != y5bVar) {
            }
            function2 = wmxVar;
            return y5bVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) wu5Var.b;
                try {
                    uj50.b(objC);
                    ft7.a(closeable2, null);
                    return objC;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        ft7.a(closeable2, th);
                        throw th3;
                    }
                }
            }
            Function2 function4 = wu5Var.a;
            uj50.b(objC);
            function3 = function4;
            closeable = (Closeable) objC;
            try {
                iox ioxVarB = tsh0.b((Response) closeable);
                wu5Var.a = null;
                wu5Var.b = closeable;
                wu5Var.d = 3;
                objC = function3.invoke(ioxVarB, wu5Var);
                if (objC != y5bVar) {
                    closeable2 = closeable;
                    ft7.a(closeable2, null);
                    return objC;
                }
                function2 = wmxVar;
                return y5bVar;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        factory = (Call.Factory) wu5Var.b;
        Function2 function5 = wu5Var.a;
        uj50.b(objC);
        function2 = function5;
        function2 = wmxVar;
        Call callNewCall = factory.newCall((Request) objC);
        wu5Var.a = function2;
        wu5Var.b = null;
        wu5Var.d = 2;
        bc6 bc6Var = new bc6(1, yzo.b(wu5Var));
        bc6Var.q();
        w1b w1bVar = new w1b(callNewCall, bc6Var);
        FirebasePerfOkHttpClient.enqueue(callNewCall, w1bVar);
        bc6Var.t(w1bVar);
        objC = bc6Var.o();
        if (objC != y5bVar) {
            function3 = function2;
            closeable = (Closeable) objC;
            iox ioxVarB2 = tsh0.b((Response) closeable);
            wu5Var.a = null;
            wu5Var.b = closeable;
            wu5Var.d = 3;
            objC = function3.invoke(ioxVarB2, wu5Var);
            if (objC != y5bVar) {
                closeable2 = closeable;
                ft7.a(closeable2, null);
                return objC;
            }
        }
        function2 = wmxVar;
        return y5bVar;
    }

    @Override // defpackage.hmx
    public final Object a(wnx wnxVar, wmx wmxVar, vmx.b bVar) {
        return b(this.a, wnxVar, wmxVar, bVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xu5) {
            return Intrinsics.g(this.a, ((xu5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ')';
    }
}
