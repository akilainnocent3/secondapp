package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tk4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tk4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        il4 il4VarL;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fm4 fm4Var = (fm4) obj;
                yn4 yn4Var = ((zk4) obj2).a;
                il4 il4VarA = yn4Var.a(fm4Var.b, fm4Var.c, fm4Var.d);
                fp4 fp4Var = fm4Var.a;
                return (fp4Var == null || (il4VarL = yn4Var.l(fp4Var)) == null) ? il4VarA : il4VarL;
            default:
                m410 m410Var = (m410) obj2;
                cgb.a(m410Var.P0(), m410Var.F0, "cashout", (String) obj);
                return Unit.a;
        }
    }
}
