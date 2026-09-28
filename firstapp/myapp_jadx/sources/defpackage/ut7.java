package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.cloudflare.CloudflareViewModel$cloudflareParams$1", f = "CloudflareViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ut7 extends tje0 implements gaj<String, j6c, v1b<? super rt7>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ j6c b;

    @Override // defpackage.gaj
    public final Object invoke(String str, j6c j6cVar, v1b<? super rt7> v1bVar) {
        ut7 ut7Var = new ut7(3, v1bVar);
        ut7Var.a = str;
        ut7Var.b = j6cVar;
        return ut7Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        j6c j6cVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new rt7(str, j6cVar);
    }
}
