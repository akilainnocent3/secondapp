package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class xqd0 implements Function1 {
    public final /* synthetic */ brd0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ xqd0(brd0 brd0Var, String str) {
        this.a = brd0Var;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        aym aymVar = this.a.a;
        th.getClass();
        aymVar.c(this.b, th);
        return Unit.a;
    }
}
