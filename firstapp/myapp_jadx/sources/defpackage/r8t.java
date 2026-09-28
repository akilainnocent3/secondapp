package defpackage;

import com.sportygames.compose.lobbyv2.viewmodels.a;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class r8t {
    public static Object a(List list, x1b x1bVar) {
        try {
            if (list.size() > 30) {
                list = list.subList(0, 30);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String strA0 = CollectionsKt.a0(list, ",", null, null, null, 62);
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new a52(new b8t(strA0, null), null), x1bVar);
    }

    public static Object b(Integer num, int i, Integer num2, a aVar) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new a52(new c8t(num, i, num2, null), null), aVar);
    }

    public static Object c(tje0 tje0Var) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new a52(new e8t(1, null), null), tje0Var);
    }

    public static Object d(Integer num, int i, Integer num2, a aVar) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new a52(new h8t(num, i, num2, null), null), aVar);
    }

    public static Object f(Integer num, int i, Integer num2, x1b x1bVar) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new a52(new p8t(num, i, num2, null), null), x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r8 == r13) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (r8 == r13) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, java.lang.Integer r10, boolean r11, boolean r12, defpackage.x1b r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8t.e(java.lang.String, java.lang.Integer, boolean, boolean, x1b):java.lang.Object");
    }
}
