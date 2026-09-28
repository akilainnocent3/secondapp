package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class ec8 {
    public static tcp a(int i, bcp bcpVar) {
        tcp tcpVar;
        tcp tcpVarJ;
        ArrayList<tcp> arrayList = bcpVar.a;
        if (i < 0 || i >= arrayList.size() || (tcpVar = arrayList.get(i)) == null || !(tcpVar instanceof xdp) || (tcpVarJ = tcpVar.d().j("configValue")) == null) {
            return null;
        }
        return tcpVarJ;
    }

    public static double b(int i, bcp bcpVar) {
        tcp tcpVarA = a(i, bcpVar);
        if (tcpVarA != null) {
            try {
                return Double.parseDouble(tcpVarA.f());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return 0.0d;
    }
}
