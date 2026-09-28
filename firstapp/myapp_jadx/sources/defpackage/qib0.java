package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.util.SportyBetImagePreloader$preloadGifInScope$1", f = "SportyBetImagePreloader.kt", l = {179, 190}, m = "invokeSuspend", v = 2)
public final class qib0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public Object b;
    public Object c;
    public String d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ wib0 i;
    public final /* synthetic */ uag v;

    @c0d(c = "com.sporty.android.compose.ui.util.SportyBetImagePreloader$preloadGifInScope$1$job$1", f = "SportyBetImagePreloader.kt", l = {120}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wib0 b;
        public final /* synthetic */ uag c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wib0 wib0Var, uag uagVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = wib0Var;
            this.c = uagVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.a(this.c, "loyalty_cdn_gif", this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qib0(wib0 wib0Var, uag uagVar, v1b v1bVar) {
        super(2, v1bVar);
        this.i = wib0Var;
        this.v = uagVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qib0 qib0Var = new qib0(this.i, this.v, v1bVar);
        qib0Var.f = obj;
        return qib0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qib0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        quw quwVar;
        String str;
        wib0 wib0Var;
        quw quwVar2;
        c9p c9pVar;
        v5b v5bVar = (v5b) this.f;
        y5b y5bVar = y5b.a;
        int i = this.e;
        String str2 = "loyalty_cdn_gif";
        wib0 wib0Var2 = this.i;
        try {
            if (i == 0) {
                uj50.b(obj);
                quwVar = wib0Var2.e;
                this.f = v5bVar;
                this.a = quwVar;
                this.b = wib0Var2;
                this.c = "loyalty_cdn_gif";
                this.e = 1;
                if (quwVar.d(this) != y5bVar) {
                    str = "loyalty_cdn_gif";
                    wib0Var = wib0Var2;
                }
                return y5bVar;
            }
            if (i == 1) {
                str = (String) this.c;
                wib0Var = (wib0) this.b;
                quwVar = (quw) this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = this.d;
                wib0Var2 = (wib0) this.c;
                quwVar2 = (quw) this.b;
                c9pVar = (c9p) this.a;
                uj50.b(obj);
            }
            try {
                wib0Var2.d.put(str2, c9pVar);
                Unit unit = Unit.a;
                return Unit.a;
            } finally {
                quwVar2.f(null);
            }
            c9p c9pVar2 = (c9p) wib0Var.d.get(str);
            if (c9pVar2 != null) {
                c9pVar2.cancel((CancellationException) null);
                Unit unit2 = Unit.a;
            }
            quwVar.f(null);
            jvd0 jvd0VarC = ej5.c(v5bVar, null, null, new a(wib0Var2, this.v, null), 3);
            quwVar2 = wib0Var2.e;
            this.f = null;
            this.a = jvd0VarC;
            this.b = quwVar2;
            this.c = wib0Var2;
            this.d = "loyalty_cdn_gif";
            this.e = 2;
            if (quwVar2.d(this) != y5bVar) {
                c9pVar = jvd0VarC;
                wib0Var2.d.put(str2, c9pVar);
                Unit unit3 = Unit.a;
                return Unit.a;
            }
            return y5bVar;
        } catch (Throwable th) {
            quwVar.f(null);
            throw th;
        }
    }
}
