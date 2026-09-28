package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class hsk0 extends kqk0 {
    @Override // defpackage.kqk0
    public final ipk0 a(String str, g3l0 g3l0Var, ArrayList arrayList) {
        ktk0 ktk0Var = ktk0.ADD;
        int iOrdinal = r5l0.e(str).ordinal();
        if (iOrdinal == 1) {
            r5l0.a(2, "AND", arrayList);
            ipk0 ipk0VarB = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
            if (!ipk0VarB.zze().booleanValue()) {
                return ipk0VarB;
            }
            return g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
        }
        if (iOrdinal == 47) {
            r5l0.a(1, "NOT", arrayList);
            return new unk0(Boolean.valueOf(!g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            b(str);
            throw null;
        }
        r5l0.a(2, "OR", arrayList);
        ipk0 ipk0VarB2 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
        if (ipk0VarB2.zze().booleanValue()) {
            return ipk0VarB2;
        }
        return g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
    }
}
