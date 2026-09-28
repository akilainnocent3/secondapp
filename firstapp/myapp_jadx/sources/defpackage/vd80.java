package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class vd80 {
    public static final gw20 a(String str, bw20 bw20Var) {
        bw20Var.getClass();
        if (StringsKt.U(str)) {
            hb5.a("Blank serial names are prohibited");
            return null;
        }
        Object it = ((aou) jw20.a.values()).iterator();
        while (((xnu.d) it).hasNext()) {
            php phpVar = (php) ((xnu.f) it).next();
            if (str.equals(phpVar.getDescriptor().h())) {
                StringBuilder sbA = he.a("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbA.append(jq40.a(phpVar.getClass()).k());
                sbA.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                hb5.a(qae0.c(sbA.toString()));
                return null;
            }
        }
        return new gw20(str, bw20Var);
    }

    public static final sd80 b(String str, yd80 yd80Var, pd80[] pd80VarArr, Function1 function1) {
        yd80Var.getClass();
        if (StringsKt.U(str)) {
            hb5.a("Blank serial names are prohibited");
            return null;
        }
        if (yd80Var.equals(ebe0.a.a)) {
            hb5.a("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        eq7 eq7Var = new eq7(str);
        function1.invoke(eq7Var);
        return new sd80(str, yd80Var, eq7Var.c.size(), ay0.S(pd80VarArr), eq7Var);
    }

    public static sd80 c(String str, yd80 yd80Var, pd80[] pd80VarArr) {
        yd80Var.getClass();
        if (StringsKt.U(str)) {
            hb5.a("Blank serial names are prohibited");
            return null;
        }
        if (yd80Var.equals(ebe0.a.a)) {
            hb5.a("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        eq7 eq7Var = new eq7(str);
        Unit unit = Unit.a;
        return new sd80(str, yd80Var, eq7Var.c.size(), ay0.S(pd80VarArr), eq7Var);
    }
}
