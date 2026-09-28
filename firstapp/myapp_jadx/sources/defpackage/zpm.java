package defpackage;

import okhttp3.Call;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zpm<ResponseT, ReturnT> extends ef80<ReturnT> {
    public final ra50 a;
    public final Call.Factory b;
    public final y2b<ResponseBody, ResponseT> c;

    public static final class a<ResponseT, ReturnT> extends zpm<ResponseT, ReturnT> {
        public final tu5<ResponseT, ReturnT> d;

        public a(ra50 ra50Var, Call.Factory factory, y2b<ResponseBody, ResponseT> y2bVar, tu5<ResponseT, ReturnT> tu5Var) {
            super(ra50Var, factory, y2bVar);
            this.d = tu5Var;
        }

        @Override // defpackage.zpm
        public final Object c(cmy cmyVar, Object[] objArr) {
            return this.d.b(cmyVar);
        }
    }

    public static final class b<ResponseT> extends zpm<ResponseT, Object> {
        public final tu5<ResponseT, su5<ResponseT>> d;
        public final boolean e;

        public b(ra50 ra50Var, Call.Factory factory, y2b y2bVar, tu5 tu5Var, boolean z) {
            super(ra50Var, factory, y2bVar);
            this.d = tu5Var;
            this.e = z;
        }

        @Override // defpackage.zpm
        public final Object c(cmy cmyVar, Object[] objArr) {
            su5<ResponseT> su5VarB = this.d.b(cmyVar);
            v1b v1bVar = (v1b) objArr[objArr.length - 1];
            try {
                try {
                    if (!this.e) {
                        return urp.a(su5VarB, v1bVar);
                    }
                    try {
                        su5VarB.getClass();
                        return urp.b(su5VarB, v1bVar);
                    } catch (LinkageError e) {
                        throw e;
                    } catch (ThreadDeath e2) {
                        throw e2;
                    }
                } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
                    throw e3;
                }
            } catch (Throwable th) {
                urp.c(th, v1bVar);
                return y5b.a;
            }
        }
    }

    public static final class c<ResponseT> extends zpm<ResponseT, Object> {
        public final tu5<ResponseT, su5<ResponseT>> d;

        public c(ra50 ra50Var, Call.Factory factory, y2b<ResponseBody, ResponseT> y2bVar, tu5<ResponseT, su5<ResponseT>> tu5Var) {
            super(ra50Var, factory, y2bVar);
            this.d = tu5Var;
        }

        @Override // defpackage.zpm
        public final Object c(cmy cmyVar, Object[] objArr) throws Throwable {
            su5<ResponseT> su5VarB = this.d.b(cmyVar);
            v1b v1bVar = (v1b) objArr[objArr.length - 1];
            try {
                bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
                bc6Var.q();
                bc6Var.t(new vrp(su5VarB));
                su5VarB.G(new wrp(bc6Var));
                Object objO = bc6Var.o();
                y5b y5bVar = y5b.a;
                return objO;
            } catch (Exception e) {
                urp.c(e, v1bVar);
                return y5b.a;
            }
        }
    }

    public zpm(ra50 ra50Var, Call.Factory factory, y2b<ResponseBody, ResponseT> y2bVar) {
        this.a = ra50Var;
        this.b = factory;
        this.c = y2bVar;
    }

    @Override // defpackage.ef80
    public final ReturnT a(Object obj, Object[] objArr) {
        return (ReturnT) c(new cmy(this.a, obj, objArr, this.b, this.c), objArr);
    }

    public abstract Object c(cmy cmyVar, Object[] objArr);
}
