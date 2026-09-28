package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nxn implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                gun gunVar = (gun) obj;
                gunVar.getClass();
                return Boolean.valueOf(gunVar.e);
            default:
                jj0 jj0Var = (jj0) obj;
                return new iwo((((long) Math.round(jj0Var.b)) & 4294967295L) | (((long) Math.round(jj0Var.a)) << 32));
        }
    }
}
