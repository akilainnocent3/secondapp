package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnkj0;", "Luzz;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class nkj0 extends uzz {
    public final ee<s8d0> D;

    public nkj0() {
        ee<s8d0> eeVarRegisterForActivityResult = registerForActivityResult(new s1i0(), new ud() { // from class: mkj0
            @Override // defpackage.ud
            public final void a(Object obj) {
                v1i0 v1i0Var = (v1i0) obj;
                v1i0Var.getClass();
                xkj0 xkj0VarO0 = this.a.o0();
                xkj0VarO0.getClass();
                if (v1i0Var instanceof v1i0.c) {
                    bmj0 bmj0Var = xkj0VarO0.J;
                    v1i0.c cVar = (v1i0.c) v1i0Var;
                    String str = cVar.a;
                    String str2 = cVar.b;
                    bmj0Var.c = str;
                    bmj0Var.d = str2;
                    xkj0VarO0.q2();
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.D = eeVarRegisterForActivityResult;
    }

    public abstract xkj0 o0();
}
