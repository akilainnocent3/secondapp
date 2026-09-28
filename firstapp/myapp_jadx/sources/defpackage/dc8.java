package defpackage;

import com.sporty.android.core.model.MyLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class dc8 {

    @Deprecated
    public static class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Parameter{appId='");
            sb.append(this.a);
            sb.append("', namespace='application', configKey='");
            return uf80.a(sb, this.b, "'}");
        }
    }

    public static tcp a(int i, bcp bcpVar) {
        tcp tcpVar;
        tcp tcpVarJ;
        if (bcpVar == null) {
            return null;
        }
        ArrayList<tcp> arrayList = bcpVar.a;
        if (i < 0 || i >= arrayList.size() || (tcpVar = arrayList.get(i)) == null || !(tcpVar instanceof xdp) || (tcpVarJ = tcpVar.d().j("configValue")) == null) {
            return null;
        }
        return tcpVarJ;
    }

    public static boolean b(bcp bcpVar, boolean z) {
        tcp tcpVarA = a(0, bcpVar);
        if (tcpVarA != null) {
            try {
                return Boolean.parseBoolean(tcpVarA.f());
            } catch (NumberFormatException unused) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CONFIG);
                aVar.n("can NOT convert \"" + tcpVarA.f() + "\" to Integer", new Object[0]);
            }
        }
        return z;
    }

    public static double c(int i, bcp bcpVar) {
        tcp tcpVarA = a(i, bcpVar);
        if (tcpVarA != null) {
            try {
                return Double.parseDouble(tcpVarA.f());
            } catch (NumberFormatException unused) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CONFIG);
                aVar.n("can NOT convert \"" + tcpVarA.f() + "\" to Double. Configs: " + bcpVar + ", index: " + i, new Object[0]);
            }
        }
        return 0.0d;
    }

    public static int d(int i, bcp bcpVar, int i2) {
        tcp tcpVarA = a(i, bcpVar);
        if (tcpVarA != null) {
            try {
                return Integer.parseInt(tcpVarA.f());
            } catch (NumberFormatException unused) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CONFIG);
                aVar.n("can NOT convert \"" + tcpVarA.f() + "\" to Integer", new Object[0]);
            }
        }
        return i2;
    }

    public static long e(int i, bcp bcpVar, long j) {
        tcp tcpVarA = a(i, bcpVar);
        if (tcpVarA != null) {
            try {
                return Long.parseLong(tcpVarA.f());
            } catch (NumberFormatException unused) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CONFIG);
                aVar.n("can NOT convert \"" + tcpVarA.f() + "\" to Long", new Object[0]);
            }
        }
        return j;
    }

    public static String f(int i, bcp bcpVar, String str) {
        tcp tcpVarA = a(i, bcpVar);
        return tcpVarA != null ? tcpVarA.f() : str;
    }
}
