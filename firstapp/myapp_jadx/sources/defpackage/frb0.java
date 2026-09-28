package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class frb0 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Long l = (Long) obj;
        l.getClass();
        String str = (String) obj2;
        str.getClass();
        wag0.b.j(new Pair<>(l, str));
        op5.a.getClass();
        String str2 = op5.c;
        if (str2 == null) {
            str2 = "";
        }
        wz.a("tournament_join_clicked", krh0.e(str2), new String[0]);
        String str3 = op5.c;
        wz.a("tournament_tnc_clicked", krh0.e(str3 != null ? str3 : ""), new String[0]);
        return Unit.a;
    }
}
