package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballSelectionStatus;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class gg70 implements lyh<mi70> {
    public final /* synthetic */ jv5 a;
    public final /* synthetic */ mg70 b;

    @c0d(c = "com.sportybet.android.instantwin.data.repository.ScheduledFootballRepoImpl$selectionStatusFlow$$inlined$map$1", f = "ScheduledFootballRepoImpl.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return gg70.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.android.instantwin.data.repository.ScheduledFootballRepoImpl$selectionStatusFlow$$inlined$map$1$2", f = "ScheduledFootballRepoImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, mg70 mg70Var) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Object bVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            mi70 mi70Var = null;
            if (i2 == 0) {
                uj50.b(obj2);
                String str = (String) obj;
                try {
                    zi50.a aVar2 = zi50.b;
                    bVar = (NetworkScheduledFootballSelectionStatus) new eal().e(str, NetworkScheduledFootballSelectionStatus.class);
                } catch (Throwable th) {
                    zi50.a aVar3 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                NetworkScheduledFootballSelectionStatus networkScheduledFootballSelectionStatus = (NetworkScheduledFootballSelectionStatus) bVar;
                if (networkScheduledFootballSelectionStatus != null) {
                    String selectionId = networkScheduledFootballSelectionStatus.getSelectionId();
                    if (selectionId == null) {
                        selectionId = "";
                    }
                    sj70.a aVar4 = sj70.b;
                    int selectionStatus = networkScheduledFootballSelectionStatus.getSelectionStatus();
                    aVar4.getClass();
                    mi70Var = new mi70(selectionId, sj70.a.a(selectionStatus));
                }
                aVar.b = 1;
                if (this.a.emit(mi70Var, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public gg70(jv5 jv5Var, mg70 mg70Var) {
        this.a = jv5Var;
        this.b = mg70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super mi70> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
