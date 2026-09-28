package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class iv2 implements hv2 {
    public final m2l a;

    @c0d(c = "com.sportybet.datastore.BetItemStateStoreImpl", f = "BetItemStateStore.kt", l = {53, 54}, m = "clearSelectionsAndEditFeatures", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return iv2.this.b(this);
        }
    }

    static {
        ohp<Object>[] ohpVarArr = m2l.e;
    }

    public iv2(m2l m2lVar) {
        m2lVar.getClass();
        this.a = m2lVar;
    }

    @Override // defpackage.hv2
    public final Object a(xu2 xu2Var) {
        return this.a.a.getString("KEY_CACHE_EDIT_BET_FEATURES", "", xu2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hv2
    public final Object b(v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        m2l m2lVar = this.a;
        if (i2 == 0) {
            uj50.b(obj);
            zn20.a aVar2 = new zn20.a("KEY_CACHE_SELECTIONS");
            aVar.c = 1;
            if (m2lVar.a.clearPreference(aVar2, aVar) != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        zn20.a aVar3 = new zn20.a("KEY_CACHE_EDIT_BET_FEATURES");
        aVar.c = 2;
        Object objClearPreference = m2lVar.a.clearPreference(aVar3, aVar);
        return objClearPreference == y5bVar ? y5bVar : objClearPreference;
    }

    @Override // defpackage.hv2
    public final Object c(wu2 wu2Var) {
        return this.a.a.getString("KEY_CACHE_SELECTIONS", "", wu2Var);
    }

    @Override // defpackage.hv2
    public final lyh<Integer> d() {
        m2l m2lVar = this.a;
        m2lVar.getClass();
        return m2lVar.a.getIntFlow("KEY_BETSLIP_MODE");
    }

    @Override // defpackage.hv2
    public final Object e(String str, bv2 bv2Var) {
        return this.a.a.putString("KEY_CACHE_EDIT_BET_FEATURES", str, bv2Var);
    }

    @Override // defpackage.hv2
    public final Object f(yu2 yu2Var) {
        return this.a.a.getInt("KEY_BETSLIP_MODE", 0, yu2Var);
    }

    @Override // defpackage.hv2
    public final Object g(String str, dv2 dv2Var) {
        return this.a.a.putString("KEY_CACHE_SELECTIONS", str, dv2Var);
    }

    @Override // defpackage.hv2
    public final Object h(int i, pu2.e eVar) {
        return this.a.a.putInt("KEY_BETSLIP_MODE", new Integer(i), eVar);
    }
}
