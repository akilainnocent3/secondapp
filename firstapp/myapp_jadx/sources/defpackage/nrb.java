package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class nrb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nrb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iW;
        int i = this.a;
        Object obj2 = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                b390 b390Var = ((qrb) obj2).d;
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
                break;
            default:
                nt70 nt70Var = (nt70) obj2;
                eq7 eq7Var = (eq7) obj;
                eq7Var.getClass();
                hj5.b(k9e0.a);
                eq7.a(eq7Var, "type", gae0.b);
                eq7.a(eq7Var, "value", vd80.b("kotlinx.serialization.Sealed<" + nt70Var.a.k() + '>', yd80.a.a, new pd80[0], new mt70(nt70Var, i2)));
                List<? extends Annotation> list = nt70Var.b;
                list.getClass();
                eq7Var.b = list;
                break;
        }
        return Unit.a;
    }
}
