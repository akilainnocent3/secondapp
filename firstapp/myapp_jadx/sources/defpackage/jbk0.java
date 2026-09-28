package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import com.sporty.android.core.model.welcomereward.NonFtdTaskType;
import com.sporty.android.core.model.welcomereward.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ljbk0;", "Lj8i0;", "c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jbk0 extends j8i0 {
    public final mgb0 a;
    public final w1j0 b;
    public final JsonSerializeService c;
    public final z1d d;
    public final v340 e;
    public final wwd0 f;
    public final v340 i;

    @c0d(c = "com.sportybet.feature.debugscreen.impl.zadepositlobby.ZaDepositLobbyDebugViewModel$1", f = "ZaDepositLobbyDebugViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public Long a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jbk0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Long l;
            Object value;
            y5b y5bVar = y5b.a;
            int i = this.b;
            Long l2 = null;
            jbk0 jbk0Var = jbk0.this;
            if (i == 0) {
                uj50.b(obj);
                AccountInfo accountInfoLastAccountInfo = jbk0Var.a.lastAccountInfo();
                if (accountInfoLastAccountInfo != null) {
                    Long l3 = new Long(accountInfoLastAccountInfo.getCreateTime());
                    if (l3.longValue() > 0) {
                        l2 = l3;
                    }
                }
                this.a = l2;
                this.b = 1;
                obj = jbk0Var.x1(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                l = l2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Long l4 = this.a;
                uj50.b(obj);
                l = l4;
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            wwd0 wwd0Var = jbk0Var.f;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, c.a((c) value, bool, l, 0L, false, 12)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.debugscreen.impl.zadepositlobby.ZaDepositLobbyDebugViewModel$2", f = "ZaDepositLobbyDebugViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public static final class a<T> implements myh {
            public final /* synthetic */ jbk0 a;

            public a(jbk0 jbk0Var) {
                this.a = jbk0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                Object value;
                c cVar;
                Long l;
                long jLongValue = ((Number) obj).longValue();
                wwd0 wwd0Var = this.a.f;
                do {
                    value = wwd0Var.getValue();
                    cVar = (c) value;
                    l = new Long(jLongValue);
                    if (l.longValue() <= 0) {
                        l = null;
                    }
                } while (!wwd0Var.g(value, c.a(cVar, null, null, l != null ? l.longValue() : qbk0.a, jLongValue > 0, 3)));
                return Unit.a;
            }
        }

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jbk0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to jbk0$b for r5v2 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r2
            L10:
                defpackage.uj50.b(r6)
                goto L2b
            L14:
                defpackage.uj50.b(r6)
                jbk0 r6 = defpackage.jbk0.this
                v340 r1 = r6.e
                jbk0$b$a r4 = new jbk0$b$a
                r4.<init>(r6)
                r5.a = r3
                uwd0<T> r6 = r1.a
                java.lang.Object r5 = r6.collect(r4, r5)
                if (r5 != r0) goto L2b
                return r0
            L2b:
                defpackage.fkd.a()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: jbk0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public jbk0(mgb0 mgb0Var, w1j0 w1j0Var, JsonSerializeService jsonSerializeService, z1d z1dVar) {
        mgb0Var.getClass();
        w1j0Var.getClass();
        jsonSerializeService.getClass();
        this.a = mgb0Var;
        this.b = w1j0Var;
        this.c = jsonSerializeService;
        this.d = z1dVar;
        this.e = e1i.e(z1dVar.d.a(z1dVar, z1d.f[2]).d(0L), o8i0.d(this), q490.a.a, 0L);
        wwd0 wwd0VarA = xwd0.a(new c(0));
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(x1b x1bVar) {
        mbk0 mbk0Var;
        Object bVar;
        if (x1bVar instanceof mbk0) {
            mbk0Var = (mbk0) x1bVar;
            int i = mbk0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbk0Var.c = i - Integer.MIN_VALUE;
            } else {
                mbk0Var = new mbk0(this, x1bVar);
            }
        } else {
            mbk0Var = new mbk0(this, x1bVar);
        }
        Object objE = mbk0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = mbk0Var.c;
        Object obj = null;
        if (i2 == 0) {
            uj50.b(objE);
            wm20<String> wm20VarC = this.b.c();
            mbk0Var.c = 1;
            objE = wm20VarC.e(mbk0Var, "");
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objE);
        }
        String str = (String) objE;
        JsonSerializeService jsonSerializeService = this.c;
        try {
            zi50.a aVar = zi50.b;
            bVar = jsonSerializeService.fromJson(str, new lbk0().getType());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        NonFtdEngagement nonFtdEngagement = (NonFtdEngagement) bVar;
        if (nonFtdEngagement == null) {
            return Boolean.FALSE;
        }
        for (Object obj2 : nonFtdEngagement.getTasks()) {
            if (((Task) obj2).getType() == NonFtdTaskType.FIRST_TIME_DEPOSIT) {
                obj = obj2;
                break;
            }
        }
        Task task = (Task) obj;
        return task == null ? Boolean.FALSE : Boolean.valueOf(!task.getCompleted());
    }

    public static final class c {
        public final Boolean a;
        public final Long b;
        public final long c;
        public final boolean d;

        public c(Boolean bool, Long l, long j, boolean z) {
            this.a = bool;
            this.b = l;
            this.c = j;
            this.d = z;
        }

        public static c a(c cVar, Boolean bool, Long l, long j, boolean z, int i) {
            if ((i & 1) != 0) {
                bool = cVar.a;
            }
            Boolean bool2 = bool;
            if ((i & 2) != 0) {
                l = cVar.b;
            }
            Long l2 = l;
            if ((i & 4) != 0) {
                j = cVar.c;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                z = cVar.d;
            }
            cVar.getClass();
            return new c(bool2, l2, j2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            Boolean bool = this.a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l = this.b;
            return Boolean.hashCode(this.d) + f87.a((iHashCode + (l != null ? l.hashCode() : 0)) * 31, this.c, 31);
        }

        public final String toString() {
            return "UiState(ftdNotCompleted=" + this.a + ", registeredAtMillis=" + this.b + ", effectiveCutoffMillis=" + this.c + ", isOverrideActive=" + this.d + ")";
        }

        public c(int i) {
            this(null, null, qbk0.a, false);
        }

        public c() {
            this(0);
        }
    }
}
