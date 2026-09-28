package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class urp {

    public static final class a implements Function1<Throwable, Unit> {
        public final /* synthetic */ su5<T> a;

        public a(su5<T> su5Var) {
            this.a = su5Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            this.a.cancel();
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements gv5<T> {
        public final /* synthetic */ bc6 a;

        public b(bc6 bc6Var) {
            this.a = bc6Var;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<T> su5Var, Throwable th) {
            th.getClass();
            zi50.a aVar = zi50.b;
            this.a.resumeWith(new zi50.b(th));
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<T> su5Var, bi50<T> bi50Var) {
            boolean isSuccessful = bi50Var.a.getIsSuccessful();
            bc6 bc6Var = this.a;
            if (!isSuccessful) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(new zi50.b(new tom(bi50Var)));
                return;
            }
            T t = bi50Var.b;
            if (t != null) {
                zi50.a aVar2 = zi50.b;
                bc6Var.resumeWith(t);
                return;
            }
            Object objTag = su5Var.request().tag(s0p.class);
            objTag.getClass();
            s0p s0pVar = (s0p) objTag;
            asp aspVar = new asp("Response from " + s0pVar.a.getName() + '.' + s0pVar.c.getName() + " was null but response body type was declared as non-null");
            zi50.a aVar3 = zi50.b;
            bc6Var.resumeWith(new zi50.b(aspVar));
        }
    }

    public static final class c implements Function1<Throwable, Unit> {
        public final /* synthetic */ su5<T> a;

        public c(su5<T> su5Var) {
            this.a = su5Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            this.a.cancel();
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class d<T> implements gv5<T> {
        public final /* synthetic */ bc6 a;

        public d(bc6 bc6Var) {
            this.a = bc6Var;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<T> su5Var, Throwable th) {
            th.getClass();
            zi50.a aVar = zi50.b;
            this.a.resumeWith(new zi50.b(th));
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<T> su5Var, bi50<T> bi50Var) {
            boolean isSuccessful = bi50Var.a.getIsSuccessful();
            bc6 bc6Var = this.a;
            if (isSuccessful) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(bi50Var.b);
            } else {
                zi50.a aVar2 = zi50.b;
                bc6Var.resumeWith(new zi50.b(new tom(bi50Var)));
            }
        }
    }

    public static final <T> Object a(su5<T> su5Var, v1b<? super T> v1bVar) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        bc6Var.t(new a(su5Var));
        su5Var.G(new b(bc6Var));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    public static final <T> Object b(su5<T> su5Var, v1b<? super T> v1bVar) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        bc6Var.t(new c(su5Var));
        su5Var.G(new d(bc6Var));
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void c(Throwable th, v1b v1bVar) {
        xrp xrpVar;
        if (v1bVar instanceof xrp) {
            xrpVar = (xrp) v1bVar;
            int i = xrpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xrpVar.b = i - Integer.MIN_VALUE;
            } else {
                xrpVar = new xrp(v1bVar);
            }
        } else {
            xrpVar = new xrp(v1bVar);
        }
        Object obj = xrpVar.a;
        y5b y5bVar = y5b.a;
        int i2 = xrpVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
        } else {
            uj50.b(obj);
            xrpVar.b = 1;
            fse.a.d0(xrpVar.getContext(), new yrp(xrpVar, th));
        }
    }
}
