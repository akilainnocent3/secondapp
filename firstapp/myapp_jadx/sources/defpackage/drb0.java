package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class drb0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Long) obj).getClass();
        op5.a.getClass();
        String str = op5.c;
        if (str == null) {
            str = "";
        }
        wz.a("tournament_joined", krh0.e(str), new String[0]);
        String str2 = op5.c;
        wz.a("tournament_tnc_clicked", krh0.e(str2 != null ? str2 : ""), new String[0]);
        return Unit.a;
    }
}
