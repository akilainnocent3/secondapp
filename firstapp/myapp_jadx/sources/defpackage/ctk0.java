package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ctk0 extends kqk0 {
    @Override // defpackage.kqk0
    public final ipk0 a(String str, g3l0 g3l0Var, ArrayList arrayList) {
        ktk0 ktk0Var = ktk0.ADD;
        int iOrdinal = r5l0.e(str).ordinal();
        if (iOrdinal == 0) {
            r5l0.a(2, "ADD", arrayList);
            ipk0 ipk0VarB = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
            ipk0 ipk0VarB2 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
            if (!(ipk0VarB instanceof rok0) && !(ipk0VarB instanceof ypk0) && !(ipk0VarB2 instanceof rok0) && !(ipk0VarB2 instanceof ypk0)) {
                return new eok0(Double.valueOf(ipk0VarB2.zzd().doubleValue() + ipk0VarB.zzd().doubleValue()));
            }
            return new ypk0(String.valueOf(ipk0VarB.zzc()).concat(String.valueOf(ipk0VarB2.zzc())));
        }
        if (iOrdinal == 21) {
            r5l0.a(2, "DIVIDE", arrayList);
            return new eok0(Double.valueOf(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue() / g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue()));
        }
        if (iOrdinal == 59) {
            r5l0.a(2, "SUBTRACT", arrayList);
            ipk0 ipk0VarB3 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
            return new eok0(Double.valueOf(ipk0VarB3.zzd().doubleValue() + (-g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue())));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            r5l0.a(2, str, arrayList);
            ipk0 ipk0VarB4 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
            g3l0Var.a((ipk0) arrayList.get(1));
            return ipk0VarB4;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            r5l0.a(1, str, arrayList);
            return g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
        }
        switch (iOrdinal) {
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                r5l0.a(2, "MODULUS", arrayList);
                return new eok0(Double.valueOf(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue() % g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue()));
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                r5l0.a(2, "MULTIPLY", arrayList);
                return new eok0(Double.valueOf(g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1)).zzd().doubleValue() * g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue()));
            case 46:
                r5l0.a(1, "NEGATE", arrayList);
                return new eok0(Double.valueOf(-g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzd().doubleValue()));
            default:
                b(str);
                throw null;
        }
    }
}
