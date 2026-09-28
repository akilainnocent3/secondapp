package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c420 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ i420 b;
    public final /* synthetic */ m420 c;
    public final /* synthetic */ cxt d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ c420(boolean z, i420 i420Var, m420 m420Var, cxt cxtVar, boolean z2) {
        this.a = z;
        this.b = i420Var;
        this.c = m420Var;
        this.d = cxtVar;
        this.e = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        i420 i420Var = this.b;
        m420 m420Var = this.c;
        if (zBooleanValue) {
            boolean z = this.a;
            cxt cxtVar = this.d;
            if (z) {
                i420Var.c(m420Var, cxtVar);
            } else {
                i420Var.d(m420Var, this.e, cxtVar);
            }
        } else {
            i420Var.a.k(m420Var.b);
        }
        return Unit.a;
    }
}
