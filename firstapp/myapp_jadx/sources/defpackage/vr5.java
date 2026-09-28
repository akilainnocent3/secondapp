package defpackage;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class vr5 {
    public static iox a(y740 y740Var) throws EOFException {
        int i = Integer.parseInt(y740Var.M(Long.MAX_VALUE));
        long j = Long.parseLong(y740Var.M(Long.MAX_VALUE));
        long j2 = Long.parseLong(y740Var.M(Long.MAX_VALUE));
        anx.a aVar = new anx.a();
        int i2 = Integer.parseInt(y740Var.M(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strM = y740Var.M(Long.MAX_VALUE);
            int iS = StringsKt.S(strM, ':', 0, 6);
            if (iS == -1) {
                kb5.a("Unexpected header: ".concat(strM));
                return null;
            }
            aVar.a(StringsKt.t0(strM.substring(0, iS)).toString(), strM.substring(iS + 1));
        }
        return new iox(i, j, j2, new anx(kpu.l(aVar.a)), 48);
    }

    public static void b(iox ioxVar, x740 x740Var) {
        x740Var.s0(ioxVar.a);
        x740Var.writeByte(10);
        x740Var.s0(ioxVar.b);
        x740Var.writeByte(10);
        x740Var.s0(ioxVar.c);
        x740Var.writeByte(10);
        Set<Map.Entry<String, List<String>>> setEntrySet = ioxVar.d.a.entrySet();
        Iterator<T> it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        x740Var.s0(size);
        x740Var.writeByte(10);
        for (Map.Entry<String, List<String>> entry : setEntrySet) {
            for (String str : entry.getValue()) {
                x740Var.R(entry.getKey());
                x740Var.R(":");
                x740Var.R(str);
                x740Var.writeByte(10);
            }
        }
    }
}
