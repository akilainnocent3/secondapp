package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class tqk0 extends kqk0 {
    public static boolean c(ipk0 ipk0Var, ipk0 ipk0Var2) {
        if (ipk0Var instanceof rok0) {
            ipk0Var = new ypk0(ipk0Var.zzc());
        }
        if (ipk0Var2 instanceof rok0) {
            ipk0Var2 = new ypk0(ipk0Var2.zzc());
        }
        if ((ipk0Var instanceof ypk0) && (ipk0Var2 instanceof ypk0)) {
            return ((ypk0) ipk0Var).a.compareTo(((ypk0) ipk0Var2).a) < 0;
        }
        double dDoubleValue = ipk0Var.zzd().doubleValue();
        double dDoubleValue2 = ipk0Var2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean d(ipk0 ipk0Var, ipk0 ipk0Var2) {
        if (ipk0Var.getClass().equals(ipk0Var2.getClass())) {
            if ((ipk0Var instanceof bqk0) || (ipk0Var instanceof apk0)) {
                return true;
            }
            if (ipk0Var instanceof eok0) {
                return (Double.isNaN(ipk0Var.zzd().doubleValue()) || Double.isNaN(ipk0Var2.zzd().doubleValue()) || ipk0Var.zzd().doubleValue() != ipk0Var2.zzd().doubleValue()) ? false : true;
            }
            if (ipk0Var instanceof ypk0) {
                return ipk0Var.zzc().equals(ipk0Var2.zzc());
            }
            if (ipk0Var instanceof unk0) {
                return ipk0Var.zze().equals(ipk0Var2.zze());
            }
            return ipk0Var == ipk0Var2;
        }
        if (((ipk0Var instanceof bqk0) || (ipk0Var instanceof apk0)) && ((ipk0Var2 instanceof bqk0) || (ipk0Var2 instanceof apk0))) {
            return true;
        }
        boolean z = ipk0Var instanceof eok0;
        if (z && (ipk0Var2 instanceof ypk0)) {
            return d(ipk0Var, new eok0(ipk0Var2.zzd()));
        }
        boolean z2 = ipk0Var instanceof ypk0;
        if (z2 && (ipk0Var2 instanceof eok0)) {
            return d(new eok0(ipk0Var.zzd()), ipk0Var2);
        }
        if (ipk0Var instanceof unk0) {
            return d(new eok0(ipk0Var.zzd()), ipk0Var2);
        }
        if (ipk0Var2 instanceof unk0) {
            return d(ipk0Var, new eok0(ipk0Var2.zzd()));
        }
        if ((z2 || z) && (ipk0Var2 instanceof rok0)) {
            return d(ipk0Var, new ypk0(ipk0Var2.zzc()));
        }
        if ((ipk0Var instanceof rok0) && ((ipk0Var2 instanceof ypk0) || (ipk0Var2 instanceof eok0))) {
            return d(new ypk0(ipk0Var.zzc()), ipk0Var2);
        }
        return false;
    }

    public static boolean e(ipk0 ipk0Var, ipk0 ipk0Var2) {
        if (ipk0Var instanceof rok0) {
            ipk0Var = new ypk0(ipk0Var.zzc());
        }
        if (ipk0Var2 instanceof rok0) {
            ipk0Var2 = new ypk0(ipk0Var2.zzc());
        }
        return (((ipk0Var instanceof ypk0) && (ipk0Var2 instanceof ypk0)) || !(Double.isNaN(ipk0Var.zzd().doubleValue()) || Double.isNaN(ipk0Var2.zzd().doubleValue()))) && !c(ipk0Var2, ipk0Var);
    }

    @Override // defpackage.kqk0
    public final ipk0 a(String str, g3l0 g3l0Var, ArrayList arrayList) {
        boolean zD;
        boolean zD2;
        r5l0.a(2, r5l0.e(str).name(), arrayList);
        ipk0 ipk0VarB = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
        ipk0 ipk0VarB2 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
        int iOrdinal = r5l0.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zD2 = d(ipk0VarB, ipk0VarB2);
            } else if (iOrdinal == 42) {
                zD = c(ipk0VarB, ipk0VarB2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        zD = c(ipk0VarB2, ipk0VarB);
                        break;
                    case 38:
                        zD = e(ipk0VarB2, ipk0VarB);
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        zD = r5l0.f(ipk0VarB, ipk0VarB2);
                        break;
                    case 40:
                        zD2 = r5l0.f(ipk0VarB, ipk0VarB2);
                        break;
                    default:
                        b(str);
                        throw null;
                }
            } else {
                zD = e(ipk0VarB, ipk0VarB2);
            }
            zD = !zD2;
        } else {
            zD = d(ipk0VarB, ipk0VarB2);
        }
        return zD ? ipk0.t : ipk0.u;
    }
}
