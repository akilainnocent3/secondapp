package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$createCustomCode$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rcc extends tje0 implements gaj<String, String, v1b<? super Pair<? extends String, ? extends String>>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ String b;

    @Override // defpackage.gaj
    public final Object invoke(String str, String str2, v1b<? super Pair<? extends String, ? extends String>> v1bVar) {
        rcc rccVar = new rcc(3, v1bVar);
        rccVar.a = str;
        rccVar.b = str2;
        return rccVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        String str2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(str, str2);
    }
}
