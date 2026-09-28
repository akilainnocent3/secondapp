package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y2n implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y2n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object bVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = ((z2n) obj).a;
                try {
                    zi50.a aVar = zi50.b;
                    String strC0 = StringsKt.c0(StringsKt.m0(str, "/", str), ".json");
                    int iV = StringsKt.V(6, strC0, "_");
                    bVar = iV != -1 ? strC0.substring(0, iV) : strC0;
                    break;
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Throwable thA = zi50.a(bVar);
                Object objC0 = bVar;
                if (thA != null) {
                    objC0 = StringsKt.c0(StringsKt.m0(str, "/", str), ".json");
                }
                return (String) objC0;
            case 1:
                ylb0 ylb0Var = (ylb0) obj;
                ylb0Var.v0(ylb0Var.R0(), null);
                return Unit.a;
            default:
                ((Function1) obj).invoke(b.v.a.a);
                return Unit.a;
        }
    }
}
