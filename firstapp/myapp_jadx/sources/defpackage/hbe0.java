package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hbe0 implements Function1 {
    public final /* synthetic */ sbe0 a;

    public /* synthetic */ hbe0(sbe0 sbe0Var) {
        this.a = sbe0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iW;
        b390 b390Var = this.a.a;
        f1e0 f1e0Var = (f1e0) obj;
        String str = f1e0Var.a;
        String str2 = f1e0Var.c;
        if (Intrinsics.g(str, "CONNECTED")) {
            str2.getClass();
            b390Var.a(str2);
        }
        if (Intrinsics.g(f1e0Var.a, "ERROR")) {
            str2.getClass();
            if (StringsKt.M(str2, "message:", true) && (iW = StringsKt.W(str2, '{', 0, 6)) != -1) {
                b390Var.a(str2.substring(iW));
            }
        }
        return Unit.a;
    }
}
