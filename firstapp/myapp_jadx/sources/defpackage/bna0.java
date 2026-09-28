package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bna0 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    th.printStackTrace();
                }
                return Unit.a;
            default:
                d08 d08Var = (d08) obj;
                d08Var.getClass();
                if (d08Var instanceof d08.b) {
                    return String.valueOf(((d08.b) d08Var).a);
                }
                if (d08Var instanceof d08.a) {
                    return "";
                }
                uhc.a();
                return null;
        }
    }
}
