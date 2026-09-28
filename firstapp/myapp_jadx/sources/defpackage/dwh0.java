package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dwh0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jj0 jj0Var = (jj0) obj;
        int iRound = Math.round(jj0Var.a);
        if (iRound < 0) {
            iRound = 0;
        }
        int iRound2 = Math.round(jj0Var.b);
        return new jxo((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
    }
}
