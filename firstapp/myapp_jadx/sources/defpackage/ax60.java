package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ax60 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        qrz qrzVar = null;
        aVar = null;
        rfs.a aVar = null;
        bVar = null;
        rfs.b bVar = null;
        rmh0Var = null;
        rmh0 rmh0Var = null;
        nxh0Var = null;
        nxh0 nxh0Var = null;
        ora0Var = null;
        ora0 ora0Var = null;
        qrzVar = null;
        al0 al0Var = obj2 != null ? (al0) obj2 : null;
        al0Var.getClass();
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        num.getClass();
        int iIntValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        num2.getClass();
        int iIntValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        str.getClass();
        switch (al0Var.ordinal()) {
            case 0:
                Object obj6 = list.get(1);
                uv60 uv60Var = kx60.h;
                if (!Intrinsics.g(obj6, Boolean.FALSE) && obj6 != null) {
                    qrzVar = (qrz) uv60Var.b.invoke(obj6);
                }
                qrzVar.getClass();
                return new nk0.d(qrzVar, str, iIntValue, iIntValue2);
            case 1:
                Object obj7 = list.get(1);
                uv60 uv60Var2 = kx60.i;
                if (!Intrinsics.g(obj7, Boolean.FALSE) && obj7 != null) {
                    ora0Var = (ora0) uv60Var2.b.invoke(obj7);
                }
                ora0Var.getClass();
                return new nk0.d(ora0Var, str, iIntValue, iIntValue2);
            case 2:
                Object obj8 = list.get(1);
                uv60 uv60Var3 = kx60.d;
                if (!Intrinsics.g(obj8, Boolean.FALSE) && obj8 != null) {
                    nxh0Var = (nxh0) uv60Var3.b.invoke(obj8);
                }
                nxh0Var.getClass();
                return new nk0.d(nxh0Var, str, iIntValue, iIntValue2);
            case 3:
                Object obj9 = list.get(1);
                uv60 uv60Var4 = kx60.e;
                if (!Intrinsics.g(obj9, Boolean.FALSE) && obj9 != null) {
                    rmh0Var = (rmh0) uv60Var4.b.invoke(obj9);
                }
                rmh0Var.getClass();
                return new nk0.d(rmh0Var, str, iIntValue, iIntValue2);
            case 4:
                Object obj10 = list.get(1);
                uv60 uv60Var5 = kx60.f;
                if (!Intrinsics.g(obj10, Boolean.FALSE) && obj10 != null) {
                    bVar = (rfs.b) uv60Var5.b.invoke(obj10);
                }
                bVar.getClass();
                return new nk0.d(bVar, str, iIntValue, iIntValue2);
            case 5:
                Object obj11 = list.get(1);
                uv60 uv60Var6 = kx60.g;
                if (!Intrinsics.g(obj11, Boolean.FALSE) && obj11 != null) {
                    aVar = (rfs.a) uv60Var6.b.invoke(obj11);
                }
                aVar.getClass();
                return new nk0.d(aVar, str, iIntValue, iIntValue2);
            case 6:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                str2.getClass();
                return new nk0.d(new e9e0(str2), str, iIntValue, iIntValue2);
            default:
                uhc.a();
                return null;
        }
    }
}
