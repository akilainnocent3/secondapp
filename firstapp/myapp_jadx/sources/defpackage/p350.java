package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes.dex */
public final class p350 implements v5b, j350 {
    public static final jc6 e = new jc6();
    public final CoroutineContext a;
    public final CoroutineContext b;
    public final p350 c = this;
    public volatile CoroutineContext d;

    public static final class a extends kotlin.coroutines.a implements l5b {
        public final /* synthetic */ rma a;
        public final /* synthetic */ p350 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rma rmaVar, p350 p350Var) {
            super(l5b.a.a);
            this.a = rmaVar;
            this.b = p350Var;
        }

        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            rma rmaVar = this.a;
            p350 p350Var = this.b;
            rmaVar.a(th, p350Var);
            CoroutineContext coroutineContext2 = p350Var.b;
            l5b.a aVar = l5b.a.a;
            l5b l5bVar = (l5b) coroutineContext2.get(aVar);
            if (l5bVar != null) {
                l5bVar.handleException(coroutineContext, th);
                return;
            }
            l5b l5bVar2 = (l5b) p350Var.a.get(aVar);
            if (l5bVar2 == null) {
                throw th;
            }
            l5bVar2.handleException(coroutineContext, th);
        }
    }

    public p350(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.a = coroutineContext;
        this.b = coroutineContext2;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                CoroutineContext coroutineContext = this.d;
                if (coroutineContext == null) {
                    this.d = e;
                } else {
                    i9p.b(coroutineContext, new sti());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.j350
    public final void e() {
        a();
    }

    @Override // defpackage.j350
    public final void f() {
        a();
    }

    @Override // defpackage.v5b
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContextPlus;
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext == null || coroutineContext == e) {
            rma rmaVar = (rma) this.a.get(rma.b);
            CoroutineContext aVar = rmaVar != null ? new a(rmaVar, this) : e.a;
            synchronized (this.c) {
                try {
                    CoroutineContext coroutineContext2 = this.d;
                    if (coroutineContext2 == null) {
                        CoroutineContext coroutineContext3 = this.a;
                        coroutineContextPlus = coroutineContext3.plus(new e9p((c9p) coroutineContext3.get(c9p.b.a))).plus(this.b).plus(aVar);
                    } else if (coroutineContext2 == e) {
                        CoroutineContext coroutineContext4 = this.a;
                        e9p e9pVar = new e9p((c9p) coroutineContext4.get(c9p.b.a));
                        e9pVar.t(new sti());
                        coroutineContextPlus = coroutineContext4.plus(e9pVar).plus(this.b).plus(aVar);
                    } else {
                        coroutineContextPlus = coroutineContext2;
                    }
                    this.d = coroutineContextPlus;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext = coroutineContextPlus;
        }
        coroutineContext.getClass();
        return coroutineContext;
    }

    @Override // defpackage.j350
    public final void c() {
    }
}
