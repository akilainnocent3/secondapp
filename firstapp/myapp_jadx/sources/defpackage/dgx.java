package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dgx implements Function1 {
    public final /* synthetic */ yp40 a;
    public final /* synthetic */ yp40 b;
    public final /* synthetic */ igx c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gx0 e;

    public /* synthetic */ dgx(yp40 yp40Var, yp40 yp40Var2, igx igxVar, boolean z, gx0 gx0Var) {
        this.a = yp40Var;
        this.b = yp40Var2;
        this.c = igxVar;
        this.d = z;
        this.e = gx0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ifx ifxVar = (ifx) obj;
        ifxVar.getClass();
        this.a.a = true;
        this.b.a = true;
        this.c.s(ifxVar, this.d, this.e);
        return Unit.a;
    }
}
