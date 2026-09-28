package defpackage;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hvf extends saj implements Function1<ijf0, Unit> {
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ijf0 ijf0Var) {
        Object value;
        kvf kvfVar;
        boolean z;
        boolean z2;
        int length;
        ijf0 ijf0Var2 = ijf0Var;
        ijf0Var2.getClass();
        lvf lvfVar = (lvf) this.receiver;
        lvfVar.getClass();
        String str = ijf0Var2.a.b;
        Locale locale = Locale.US;
        ijf0 ijf0VarB = ijf0.b(ijf0Var2, gvf.a(locale, str, locale), 0L, 6);
        wwd0 wwd0Var = lvfVar.a;
        do {
            value = wwd0Var.getValue();
            kvfVar = (kvf) value;
            cb cbVar = lvfVar.v;
            String str2 = ijf0VarB.a.b;
            boolean zG = Intrinsics.g(str2, kvfVar.a);
            z = false;
            if (!zG) {
                cbVar.getClass();
                if (str2 != null && 4 <= (length = str2.length()) && length < 16) {
                    z = true;
                }
            }
            if (!zG) {
                cbVar.getClass();
                z2 = str2 != null ? ogx.a("^[a-zA-Z0-9]+$", str2) : false ? true : z;
            }
        } while (!wwd0Var.g(value, kvf.a(kvfVar, ijf0VarB, z, z2, (z && z2) ? kqh0.b : kqh0.a, null, null, 0, 193)));
        return Unit.a;
    }
}
