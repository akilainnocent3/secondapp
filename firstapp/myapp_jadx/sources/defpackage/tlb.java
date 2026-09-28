package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tlb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tlb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mmd mmdVar;
        ukf0 ukf0Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                ((enb) obj2).w0().e.invoke(Boolean.TRUE);
                return Unit.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new c9q.h(str));
                return Unit.a;
            default:
                hmf0 hmf0Var = (hmf0) obj2;
                List list = (List) obj;
                orz orzVarP2 = hmf0Var.p2();
                imf0 imf0VarF = imf0.f(hmf0Var.E, j58.m, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                asr asrVar = orzVarP2.o;
                ukf0 ukf0Var2 = null;
                if (asrVar == null || (mmdVar = orzVarP2.i) == null) {
                    ukf0Var = null;
                } else {
                    nk0 nk0Var = new nk0(orzVarP2.a);
                    if (orzVarP2.j == null || orzVarP2.n == null) {
                        ukf0Var = null;
                    } else {
                        long j = orzVarP2.p & (-8589934589L);
                        m2g m2gVar = m2g.a;
                        int i2 = orzVarP2.f;
                        boolean z = orzVarP2.e;
                        int i3 = orzVarP2.d;
                        f8i.a aVar = orzVarP2.c;
                        ukf0Var = new ukf0(new tkf0(nk0Var, imf0VarF, m2gVar, i2, z, i3, mmdVar, asrVar, aVar, j), new zjw(new ckw(nk0Var, imf0VarF, m2gVar, mmdVar, aVar), j, orzVarP2.f, orzVarP2.d), orzVarP2.l);
                    }
                }
                if (ukf0Var != null) {
                    list.add(ukf0Var);
                    ukf0Var2 = ukf0Var;
                }
                return Boolean.valueOf(ukf0Var2 != null);
        }
    }
}
