package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;

/* JADX INFO: loaded from: classes5.dex */
public final class jgk {
    public final sen a;
    public final h530 b;
    public final m2l c;
    public final odd d;
    public final JsonSerializeService e;

    public jgk(sen senVar, h530 h530Var, m2l m2lVar, uqm uqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, JsonSerializeService jsonSerializeService) {
        senVar.getClass();
        h530Var.getClass();
        m2lVar.getClass();
        uqmVar.getClass();
        jsonSerializeService.getClass();
        this.a = senVar;
        this.b = h530Var;
        this.c = m2lVar;
        this.d = oddVar;
        this.e = jsonSerializeService;
        uqmVar.addLogoutEventListener(new fjt() { // from class: cgk
            @Override // defpackage.fjt
            public final void p() {
                zu7.a aVar = zu7.a;
                jgk jgkVar = this.a;
                odd oddVar2 = jgkVar.d;
                ej5.c(zu7.b(oddVar2), null, null, new fgk(jgkVar, null), 3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r0.b(r2) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.x1b r21) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgk.a(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r6.a.putString("key_loyalty_unread", r7, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.x1b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.hgk
            if (r0 == 0) goto L13
            r0 = r7
            hgk r0 = (defpackage.hgk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hgk r0 = new hgk
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r7)     // Catch: java.lang.Throwable -> L6d
            goto L68
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            jgk r6 = r0.a
            defpackage.uj50.b(r7)     // Catch: java.lang.Throwable -> L6d
            goto L49
        L37:
            defpackage.uj50.b(r7)
            zi50$a r7 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L6d
            h530 r7 = r6.b     // Catch: java.lang.Throwable -> L6d
            r0.a = r6     // Catch: java.lang.Throwable -> L6d
            r0.d = r4     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r7 = r7.u(r0)     // Catch: java.lang.Throwable -> L6d
            if (r7 != r1) goto L49
            goto L67
        L49:
            com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r7 = defpackage.n52.b(r7)     // Catch: java.lang.Throwable -> L6d
            com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData r7 = (com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData) r7     // Catch: java.lang.Throwable -> L6d
            com.sporty.android.core.model.json.JsonSerializeService r2 = r6.e     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = r2.toJson(r7)     // Catch: java.lang.Throwable -> L6d
            m2l r6 = r6.c     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = "key_loyalty_unread"
            r0.a = r5     // Catch: java.lang.Throwable -> L6d
            r0.d = r3     // Catch: java.lang.Throwable -> L6d
            zed r6 = r6.a     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r6.putString(r2, r7, r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r6 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L6d
            zi50$a r6 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            zi50$a r6 = defpackage.zi50.b
        L6f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgk.b(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x1b x1bVar) {
        igk igkVar;
        if (x1bVar instanceof igk) {
            igkVar = (igk) x1bVar;
            int i = igkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                igkVar.c = i - Integer.MIN_VALUE;
            } else {
                igkVar = new igk(this, x1bVar);
            }
        } else {
            igkVar = new igk(this, x1bVar);
        }
        Object objB = igkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = igkVar.c;
        if (i2 == 0) {
            uj50.b(objB);
            igkVar.c = 1;
            objB = this.a.b(igkVar);
            if (objB != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objB);
                return objB;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objB);
        Boolean bool = (Boolean) n52.b((BaseResponse) objB);
        bool.getClass();
        igkVar.c = 2;
        Object objPutBoolean = this.c.a.putBoolean("notification_center_any_unread", bool, igkVar);
        return objPutBoolean == y5bVar ? y5bVar : objPutBoolean;
    }
}
