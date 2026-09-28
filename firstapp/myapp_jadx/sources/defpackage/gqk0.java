package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class gqk0 extends kqk0 {
    @Override // defpackage.kqk0
    public final ipk0 a(String str, g3l0 g3l0Var, ArrayList arrayList) {
        ktk0 ktk0Var = ktk0.ADD;
        switch (r5l0.e(str).ordinal()) {
            case 4:
                r5l0.a(2, "BITWISE_AND", arrayList);
                return new eok0(Double.valueOf(r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue()) & r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue())));
            case 5:
                r5l0.a(2, "BITWISE_LEFT_SHIFT", arrayList);
                return new eok0(Double.valueOf(r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue()) << ((int) (((long) r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue())) & 31))));
            case 6:
                r5l0.a(1, "BITWISE_NOT", arrayList);
                return new eok0(Double.valueOf(~r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue())));
            case 7:
                r5l0.a(2, "BITWISE_OR", arrayList);
                return new eok0(Double.valueOf(r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue()) | r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue())));
            case 8:
                r5l0.a(2, "BITWISE_RIGHT_SHIFT", arrayList);
                return new eok0(Double.valueOf(r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue()) >> ((int) (((long) r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue())) & 31))));
            case 9:
                r5l0.a(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                return new eok0(Double.valueOf((((long) r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue())) & 4294967295L) >>> ((int) (((long) r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue())) & 31))));
            case 10:
                r5l0.a(2, "BITWISE_XOR", arrayList);
                return new eok0(Double.valueOf(r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue()) ^ r5l0.g(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue())));
            default:
                b(str);
                throw null;
        }
    }
}
