package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class y5d0 {
    public static final ArrayList a(String str) {
        m5d0 m5d0Var = m5d0.a;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            nwc0 nwc0Var = null;
            if (cCharAt == 'A' || cCharAt == 'B') {
                m5d0Var = cCharAt == 'A' ? m5d0.a : m5d0.b;
            } else if (Character.isDigit(cCharAt)) {
                nwc0Var = new nwc0(m5d0Var, cCharAt == '1');
            }
            if (nwc0Var != null) {
                arrayList.add(nwc0Var);
            }
        }
        return arrayList;
    }
}
