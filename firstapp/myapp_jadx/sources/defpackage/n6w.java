package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n6w implements Function1 {
    public final /* synthetic */ k6w a;
    public final /* synthetic */ dq40 b;
    public final /* synthetic */ aq40 c;
    public final /* synthetic */ wr70 d;
    public final /* synthetic */ yp40 e;

    public /* synthetic */ n6w(k6w k6wVar, dq40 dq40Var, aq40 aq40Var, wr70 wr70Var, yp40 yp40Var) {
        this.a = k6wVar;
        this.b = dq40Var;
        this.c = aq40Var;
        this.d = wr70Var;
        this.e = yp40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, k6w$a] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        k6w k6wVar = this.a;
        k6w.a aVarD = k6w.d(k6wVar.e);
        if (aVarD != null) {
            k6wVar.e(aVarD);
            dq40 dq40Var = this.b;
            ?? A = ((k6w.a) dq40Var.a).a(aVarD);
            dq40Var.a = A;
            long j = A.a;
            wr70 wr70Var = this.d;
            float fG = wr70Var.g(wr70Var.e(j));
            this.c.a = fG;
            this.e.a = !w39.a(fG - fFloatValue);
        }
        return Boolean.valueOf(aVarD != null);
    }
}
