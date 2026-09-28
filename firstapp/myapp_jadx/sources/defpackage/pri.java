package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pri implements Function1 {
    public final /* synthetic */ String a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nqi nqiVar = (nqi) obj;
        nqiVar.getClass();
        String str = nqiVar.a;
        kl00 kl00Var = (kl00) CollectionsKt.firstOrNull(nqiVar.g);
        String str2 = kl00Var != null ? kl00Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        return tug.a(this.a, "_", tug.a(str, "_", str2));
    }
}
