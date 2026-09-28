package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f50 extends qlr implements Function1<tsr, Boolean> {
    public static final f50 a = new f50(1);

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(tsr tsrVar) {
        boolean z;
        sa80 sa80VarF = tsrVar.f();
        if (sa80VarF != null) {
            if (sa80VarF.c) {
                z = sa80VarF.a.b(hb80.E);
            }
        }
        return Boolean.valueOf(z);
    }
}
