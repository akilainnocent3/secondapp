package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ty00 implements Function1 {
    public final /* synthetic */ bz00 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ty00(bz00 bz00Var, String str) {
        this.a = bz00Var;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        zxm zxmVar = this.a.b;
        th.getClass();
        zxmVar.c(this.b, th);
        return Unit.a;
    }
}
