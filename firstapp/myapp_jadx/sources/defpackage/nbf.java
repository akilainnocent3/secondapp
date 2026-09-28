package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class nbf implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ nbf(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Float) obj).getClass();
                break;
            default:
                eq7 eq7Var = (eq7) obj;
                eq7Var.getClass();
                eq7.a(eq7Var, "JsonPrimitive", new bdp(new wcp()));
                eq7.a(eq7Var, "JsonNull", new bdp(new mwj(1)));
                eq7.a(eq7Var, "JsonLiteral", new bdp(new xcp()));
                eq7.a(eq7Var, "JsonObject", new bdp(new ycp()));
                eq7.a(eq7Var, "JsonArray", new bdp(new zcp()));
                break;
        }
        return Unit.a;
    }
}
