package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n7f0 implements Function1 {
    public final /* synthetic */ Function2 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        prg prgVar = (prg) obj;
        prgVar.getClass();
        String str = prgVar.o;
        if (str != null) {
            this.a.invoke(prgVar.a, str);
        }
        return Unit.a;
    }
}
