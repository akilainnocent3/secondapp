package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m36 {
    public final q36 a;
    public final ssw<l36> b;

    public m36(q36 q36Var) {
        this.a = q36Var;
        ssw<l36> sswVar = new ssw<>();
        this.b = sswVar;
        sswVar.j(new pg1(l36.b.e, null));
    }

    public final void a(n26.a aVar, l36.a aVar2) {
        pg1 pg1Var;
        if (aVar2 == null || aVar2.b() != 8) {
            switch (aVar) {
                case RELEASED:
                case CLOSED:
                    pg1Var = new pg1(l36.b.e, aVar2);
                    break;
                case RELEASING:
                case CLOSING:
                    pg1Var = new pg1(l36.b.d, aVar2);
                    break;
                case PENDING_OPEN:
                    q36 q36Var = this.a;
                    synchronized (q36Var.b) {
                        Iterator it = q36Var.e.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                pg1Var = new pg1(l36.b.a, null);
                            } else if (((q36.a) ((Map.Entry) it.next()).getValue()).a == n26.a.CLOSING) {
                                pg1Var = new pg1(l36.b.b, null);
                            }
                        }
                    }
                    break;
                case OPENING:
                    pg1Var = new pg1(l36.b.b, aVar2);
                    break;
                case OPEN:
                case CONFIGURED:
                    pg1Var = new pg1(l36.b.c, aVar2);
                    break;
                default:
                    rcp.a(aVar, "Unknown internal camera state: ");
                    return;
            }
        } else {
            pg1Var = new pg1(l36.b.e, aVar2);
        }
        pgt.a("CameraStateMachine", "New public camera state " + pg1Var + " from " + aVar + " and " + aVar2);
        if (Objects.equals(this.b.d(), pg1Var)) {
            return;
        }
        pgt.a("CameraStateMachine", "Publishing new public camera state " + pg1Var);
        this.b.j(pg1Var);
    }
}
