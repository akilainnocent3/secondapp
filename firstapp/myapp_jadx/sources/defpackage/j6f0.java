package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class j6f0 {
    public static List a(String str) {
        Object next;
        str.getClass();
        String strReplace = new Regex("[^AB]").replace(str, "");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strReplace.length(); i++) {
            char cCharAt = strReplace.charAt(i);
            uag uagVar = b4l.e;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            do {
                if (!bVarA.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarA.next();
            } while (((b4l) next).a != cCharAt);
            b4l b4lVar = (b4l) next;
            h6f0 h6f0Var = b4lVar != null ? new h6f0(b4lVar, 1) : null;
            if (h6f0Var != null) {
                arrayList.add(h6f0Var);
            }
        }
        if (arrayList.size() >= 2) {
            return arrayList;
        }
        if (arrayList.isEmpty()) {
            return b.k(new h6f0(b4l.HOME, 0), new h6f0(b4l.AWAY, 0));
        }
        b4l b4lVar2 = ((h6f0) CollectionsKt.T(arrayList)).a;
        b4l b4lVar3 = b4l.HOME;
        return b4lVar2 == b4lVar3 ? CollectionsKt.j0(arrayList, new h6f0(b4l.AWAY, 0)) : CollectionsKt.i0(arrayList, a.c(new h6f0(b4lVar3, 0)));
    }
}
