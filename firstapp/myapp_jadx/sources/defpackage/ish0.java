package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ish0 implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ish0(Function1 function1, Function1 function2, Function1 function3) {
        this.a = function1;
        this.b = function2;
        this.c = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b01.b bVar = (b01.b) obj;
        if (bVar instanceof b01.b.c) {
            Function1 function1 = this.a;
            if (function1 != null) {
                function1.invoke(bVar);
            }
        } else if (bVar instanceof b01.b.d) {
            Function1 function2 = this.b;
            if (function2 != null) {
                function2.invoke(bVar);
            }
        } else if (bVar instanceof b01.b.C0106b) {
            Function1 function3 = this.c;
            if (function3 != null) {
                function3.invoke(bVar);
            }
        } else if (!(bVar instanceof b01.b.a)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
