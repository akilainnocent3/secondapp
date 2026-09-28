package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$streamInfo$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zfr extends tje0 implements gaj<String, Integer, v1b<? super String>, Object> {
    public /* synthetic */ String a;

    @Override // defpackage.gaj
    public final Object invoke(String str, Integer num, v1b<? super String> v1bVar) {
        num.intValue();
        zfr zfrVar = new zfr(3, v1bVar);
        zfrVar.a = str;
        return zfrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return str;
    }
}
