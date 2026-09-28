package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import j$.time.Clock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ggt implements rdd {
    public final iym a;
    public final hgt b;
    public final uqm c;
    public final Clock d;
    public final odd e;
    public final fgt f;
    public final mpe0 i;

    @c0d(c = "com.sportybet.feature.loggedinusertracker.LoggedInUserTracker$trySendEvent$1", f = "LoggedInUserTracker.kt", l = {55, 59}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public String a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ggt.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        
            if (r10.g(r9, r3) == r2) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                ggt r0 = defpackage.ggt.this
                hgt r1 = r0.b
                y5b r2 = defpackage.y5b.a
                int r3 = r9.b
                r4 = 0
                r5 = 0
                r6 = 2
                r7 = 1
                if (r3 == 0) goto L22
                if (r3 == r7) goto L1c
                if (r3 != r6) goto L16
                defpackage.uj50.b(r10)
                goto L6b
            L16:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r5
            L1c:
                java.lang.String r3 = r9.a
                defpackage.uj50.b(r10)
                goto L47
            L22:
                defpackage.uj50.b(r10)
                j$.time.Clock r10 = r0.d
                j$.time.LocalDate r10 = j$.time.LocalDate.now(r10)
                java.lang.String r3 = r10.toString()
                r3.getClass()
                rkd r10 = r1.b
                ohp<java.lang.Object>[] r8 = defpackage.hgt.c
                r8 = r8[r4]
                wm20 r10 = r10.a(r1, r8)
                r9.a = r3
                r9.b = r7
                java.lang.Object r10 = r10.f(r9)
                if (r10 != r2) goto L47
                goto L6a
            L47:
                java.lang.String r10 = (java.lang.String) r10
                boolean r10 = kotlin.jvm.internal.Intrinsics.g(r3, r10)
                if (r10 != 0) goto L6b
                iym r10 = r0.a
                java.lang.String r0 = "visitor_entry__logged_in"
                r10.d(r0)
                rkd r10 = r1.b
                ohp<java.lang.Object>[] r0 = defpackage.hgt.c
                r0 = r0[r4]
                wm20 r10 = r10.a(r1, r0)
                r9.a = r5
                r9.b = r6
                java.lang.Object r9 = r10.g(r9, r3)
                if (r9 != r2) goto L6b
            L6a:
                return r2
            L6b:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ggt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ggt(iym iymVar, hgt hgtVar, uqm uqmVar, Clock clock, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        iymVar.getClass();
        uqmVar.getClass();
        this.a = iymVar;
        this.b = hgtVar;
        this.c = uqmVar;
        this.d = clock;
        this.e = oddVar;
        this.f = new fgt(l5b.a.a);
        this.i = hwr.b(new n51(this, 1));
        uqmVar.addLoginEventListener(new lit() { // from class: egt
            @Override // defpackage.lit
            public final void onLogin() {
                this.a.a();
            }
        });
    }

    public final void a() {
        if (this.c.isLogin()) {
            ej5.c((v5b) this.i.getValue(), null, null, new a(null), 3);
        }
    }

    @Override // defpackage.rdd
    public final void onStart(ibs ibsVar) {
        a();
    }
}
