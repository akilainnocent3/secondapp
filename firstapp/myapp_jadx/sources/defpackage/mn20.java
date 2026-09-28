package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class mn20 implements en20 {
    public final Context a;

    @c0d(c = "com.sportygames.common.framework.datastore.PreferenceDataStoreImpl$putBoolean$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ zn20.a<Boolean> b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zn20.a<Boolean> aVar, boolean z, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = aVar;
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((a) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Boolean boolValueOf = Boolean.valueOf(this.c);
            jtwVar.getClass();
            jtwVar.h(this.b, boolValueOf);
            return Unit.a;
        }
    }

    public mn20(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.en20
    public final Object a(String str, boolean z, v1b<? super Unit> v1bVar) {
        Object objA = do20.a(pn20.a(this.a), new a(co20.a(str), z, null), v1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    @Override // defpackage.en20
    public final Object b(String str, boolean z, x1b x1bVar) {
        return f(new zn20.a(str), Boolean.valueOf(z), x1bVar);
    }

    @Override // defpackage.en20
    public final Object c(long j, x1b x1bVar, String str) {
        Object objA = do20.a(pn20.a(this.a), new on20(new zn20.a(str), j, null), x1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    @Override // defpackage.en20
    public final Object d(String str, x1b x1bVar) {
        return f(new zn20.a(str), new Long(0L), x1bVar);
    }

    @Override // defpackage.en20
    public final Object e(kw4 kw4Var) {
        Object objA = do20.a(pn20.a(this.a), new nn20(new zn20.a("bonus_vault_toast_ready_to_claim_tier_level"), null), kw4Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(zn20.a aVar, Object obj, x1b x1bVar) {
        kn20 kn20Var;
        if (x1bVar instanceof kn20) {
            kn20Var = (kn20) x1bVar;
            int i = kn20Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kn20Var.d = i - Integer.MIN_VALUE;
            } else {
                kn20Var = new kn20(this, x1bVar);
            }
        } else {
            kn20Var = new kn20(this, x1bVar);
        }
        Object objC = kn20Var.b;
        y5b y5bVar = y5b.a;
        int i2 = kn20Var.d;
        if (i2 == 0) {
            uj50.b(objC);
            jn20 jn20Var = new jn20(new yzh(pn20.a(this.a).k(), new ln20(3, null)), aVar);
            kn20Var.a = obj;
            kn20Var.d = 1;
            objC = s0i.c(jn20Var, kn20Var);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = kn20Var.a;
            uj50.b(objC);
        }
        return objC == null ? obj : objC;
    }

    @Override // defpackage.en20
    public final hn20 getBooleanByFlow(String str, boolean z) {
        return new hn20(new yzh(pn20.a(this.a).k(), new in20(3, null)), str, z);
    }
}
