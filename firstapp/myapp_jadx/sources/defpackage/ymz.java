package defpackage;

import android.os.Build;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ymz<Key, Value> {
    public final Function1<v1b<? super wqz<Key, Value>>, Object> a;
    public final iqz b;
    public final gua<Boolean> c = new gua<>(0);
    public final gua<Unit> d = new gua<>(0);
    public final lyh<kqz<Value>> e;

    public static final class a<Key, Value> {
        public final enz<Key, Value> a;
        public final xqz<Key, Value> b;
        public final e9p c;

        public a(enz enzVar, xqz xqzVar, e9p e9pVar) {
            this.a = enzVar;
            this.b = xqzVar;
            this.c = e9pVar;
        }
    }

    public final class b<Key, Value> implements w9m {
        public final enz<Key, Value> a;

        public b(enz enzVar) {
            this.a = enzVar;
        }

        @Override // defpackage.w9m
        public final void a(qai0 qai0Var) {
            x8m x8mVar = this.a.g;
            x8mVar.getClass();
            x8mVar.a.a(qai0Var instanceof qai0.a ? (qai0.a) qai0Var : null, new z8m(qai0Var));
        }
    }

    public final class c implements rch0 {
        public final gua<Unit> a;
        public final /* synthetic */ ymz<Key, Value> b;

        public c(ymz ymzVar, gua<Unit> guaVar) {
            guaVar.getClass();
            this.b = ymzVar;
            this.a = guaVar;
        }

        @Override // defpackage.rch0
        public final void c() {
            this.b.c.a(Boolean.TRUE);
        }

        @Override // defpackage.rch0
        public final void retry() {
            this.a.a(Unit.a);
        }
    }

    public ymz(Function1 function1, iqz iqzVar, r650 r650Var) {
        this.a = function1;
        this.b = iqzVar;
        this.e = rj90.a(new zmz(r650Var, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(wqz wqzVar, x1b x1bVar) {
        anz anzVar;
        if (x1bVar instanceof anz) {
            anzVar = (anz) x1bVar;
            int i = anzVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                anzVar.e = i - Integer.MIN_VALUE;
            } else {
                anzVar = new anz(this, x1bVar);
            }
        } else {
            anzVar = new anz(this, x1bVar);
        }
        Object objInvoke = anzVar.c;
        y5b y5bVar = y5b.a;
        int i2 = anzVar.e;
        if (i2 == 0) {
            uj50.b(objInvoke);
            anzVar.a = this;
            anzVar.b = wqzVar;
            anzVar.e = 1;
            objInvoke = this.a.invoke(anzVar);
            if (objInvoke == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wqzVar = anzVar.b;
            this = anzVar.a;
            uj50.b(objInvoke);
        }
        ymz<Key, Value> ymzVar = this;
        wqz wqzVar2 = (wqz) objInvoke;
        if (wqzVar2 instanceof xl8) {
            ((xl8) wqzVar2).a(ymzVar.b.a);
        }
        if (wqzVar2 == wqzVar) {
            ib5.a("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
            return null;
        }
        bnz bnzVar = new bnz(0, ymzVar, ymz.class, "invalidate", "invalidate()V", 0);
        wqzVar2.getClass();
        wqzVar2.a.b(bnzVar);
        if (wqzVar != null) {
            wqzVar.a.c(new cnz(0, ymzVar, ymz.class, "invalidate", "invalidate()V", 0));
        }
        if (wqzVar != null) {
            wqzVar.c();
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Generated new PagingSource " + wqzVar2, null);
        }
        return wqzVar2;
    }
}
