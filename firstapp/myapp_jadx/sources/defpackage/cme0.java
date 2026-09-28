package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class cme0 {
    public final i20<dme0> a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [zle0] */
    @fae
    public cme0(dme0 dme0Var, final mmd mmdVar, Function1<? super dme0, Boolean> function1, Function1<? super Float, Float> function2) {
        gzg0 gzg0Var = v00.a;
        i4d i4dVar = v00.c;
        ?? r2 = new Function0() { // from class: zle0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(mmdVar.C1(125.0f));
            }
        };
        i20<dme0> i20Var = new i20<>(dme0Var);
        i20Var.a = function1;
        i20Var.b = function2;
        i20Var.c = r2;
        i20Var.d = gzg0Var;
        i20Var.e = i4dVar;
        this.a = i20Var;
    }
}
