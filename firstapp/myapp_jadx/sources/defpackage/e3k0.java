package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.loyalty.MissionData;

/* JADX INFO: loaded from: classes6.dex */
public final class e3k0 implements b3k0 {
    public final w1k0 a;
    public final y1k0 b;
    public final psm c;

    public e3k0(w1k0 w1k0Var, j2k0 j2k0Var, y1k0 y1k0Var, psm psmVar) {
        w1k0Var.getClass();
        y1k0Var.getClass();
        psmVar.getClass();
        this.a = w1k0Var;
        this.b = y1k0Var;
        this.c = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0026, B:26:0x0050, B:35:0x0068, B:32:0x005d, B:34:0x0066, B:36:0x006b), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x006b A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0026, B:26:0x0050, B:35:0x0068, B:32:0x005d, B:34:0x0066, B:36:0x006b), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.b3k0
    public final Object a(long j, x1b x1bVar) {
        d3k0 d3k0Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof d3k0) {
            d3k0Var = (d3k0) x1bVar;
            int i = d3k0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d3k0Var.d = i - Integer.MIN_VALUE;
            } else {
                d3k0Var = new d3k0(this, x1bVar);
            }
        } else {
            d3k0Var = new d3k0(this, x1bVar);
        }
        Object obj = d3k0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = d3k0Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                try {
                    w1k0 w1k0Var = this.a;
                    ftz ftzVar = new ftz(j);
                    d3k0Var.a = resourceUiText;
                    d3k0Var.d = 1;
                    Object objC = w1k0Var.c(ftzVar, d3k0Var);
                    if (objC == y5bVar) {
                        return y5bVar;
                    }
                    obj = objC;
                    uiText = resourceUiText;
                    n52.c((BaseResponse) obj);
                    bVar = ga30.b.a;
                    zi50.a aVar2 = zi50.b;
                } catch (SprThrowable e) {
                    e = e;
                    uiText = resourceUiText;
                    if (e.getD() == 61100) {
                        throw e;
                    }
                    bVar = ga30.a.a;
                }
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = d3k0Var.a;
            try {
                try {
                    uj50.b(obj);
                    n52.c((BaseResponse) obj);
                    bVar = ga30.b.a;
                } catch (SprThrowable e2) {
                    e = e2;
                    if (e.getD() == 61100) {
                        throw e;
                    }
                    bVar = ga30.a.a;
                }
                zi50.a aVar4 = zi50.b;
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar5 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.b3k0
    public final Object b(x1b x1bVar) {
        c3k0 c3k0Var;
        UiText uiText;
        Object bVar;
        Object obj;
        Throwable thA;
        Throwable thA2;
        fk50 fk50Var;
        UiText text;
        if (x1bVar instanceof c3k0) {
            c3k0Var = (c3k0) x1bVar;
            int i = c3k0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3k0Var.d = i - Integer.MIN_VALUE;
            } else {
                c3k0Var = new c3k0(this, x1bVar);
            }
        } else {
            c3k0Var = new c3k0(this, x1bVar);
        }
        Object obj2 = c3k0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = c3k0Var.d;
        if (i2 == 0) {
            uj50.b(obj2);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                if (this.c.O()) {
                    w1k0 w1k0Var = this.a;
                    c3k0Var.a = resourceUiText;
                    c3k0Var.d = 1;
                    Object objB = w1k0Var.b(c3k0Var);
                    if (objB == y5bVar) {
                        return y5bVar;
                    }
                    uiText = resourceUiText;
                    obj2 = objB;
                } else {
                    bVar = r3k0.d.a;
                    uiText = resourceUiText;
                }
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                obj = null;
            } else {
                obj = bVar;
            }
            if (obj != null) {
                return new lk50.c(obj);
            }
            thA = zi50.a(bVar);
            if (thA == null) {
                thA = new Throwable("Unknown error");
            }
            thA2 = zi50.a(bVar);
            if (thA2 != null) {
                fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
                if (fk50Var != null && (text = fk50Var.getText()) != null) {
                    uiText = text;
                }
            }
            return new lk50.a(thA, uiText);
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uiText = c3k0Var.a;
        try {
            uj50.b(obj2);
        } catch (Throwable th2) {
            th = th2;
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        MissionData missionData = (MissionData) n52.b((BaseResponse) obj2);
        this.b.a(missionData);
        bVar = j2k0.a(missionData);
        zi50.a aVar5 = zi50.b;
        if (bVar instanceof zi50.b) {
            obj = null;
        } else {
            obj = bVar;
        }
        if (obj != null) {
            return new lk50.c(obj);
        }
        thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }
}
