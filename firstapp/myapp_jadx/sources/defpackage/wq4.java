package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wq4 implements Function1 {
    public final /* synthetic */ ar4 a;
    public final /* synthetic */ String b;

    public /* synthetic */ wq4(ar4 ar4Var, String str) {
        this.a = ar4Var;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        bym bymVar = this.a.b;
        th.getClass();
        bymVar.c(this.b, th);
        return Unit.a;
    }
}
