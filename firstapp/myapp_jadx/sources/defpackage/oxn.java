package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class oxn implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ oxn(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                gun gunVar = (gun) obj;
                gunVar.getClass();
                return gunVar.d;
            case 1:
                bck0 bck0Var = (bck0) obj;
                bck0Var.getClass();
                cxz cxzVar = ch50.d;
                return Boolean.valueOf(ch50.a.a(bck0Var.a));
            default:
                long j = ((jxo) obj).a;
                return new jj0((int) (j >> 32), (int) (j & 4294967295L));
        }
    }
}
