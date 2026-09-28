package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mny {
    public static void a(iny inyVar, ibs ibsVar, Function1 function1, int i) {
        if ((i & 1) != 0) {
            ibsVar = null;
        }
        inyVar.getClass();
        lny lnyVar = new lny(function1);
        if (ibsVar != null) {
            inyVar.a(ibsVar, lnyVar);
        } else {
            inyVar.b(lnyVar);
        }
    }
}
