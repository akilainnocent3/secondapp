package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.account.verifiedemailchange.EmailUpdateRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.newemail.EmailChangeNewEmailViewModel$updateEmail$1", f = "EmailChangeNewEmailViewModel.kt", l = {118}, m = "invokeSuspend", v = 2)
public final class nxf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mxf b;

    @c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.newemail.EmailChangeNewEmailViewModel$updateEmail$1$2", f = "EmailChangeNewEmailViewModel.kt", l = {117}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ mxf b;
        public final /* synthetic */ EmailUpdateRequest c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mxf mxfVar, EmailUpdateRequest emailUpdateRequest, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = mxfVar;
            this.c = emailUpdateRequest;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                oyf oyfVar = this.b.a;
                this.a = 1;
                if (oyfVar.i(this.c, this) == y5bVar) {
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

    public static final class b<T> implements myh {
        public final /* synthetic */ mxf a;

        public b(mxf mxfVar) {
            this.a = mxfVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.a;
            mxf mxfVar = this.a;
            if (z) {
                wwd0 wwd0Var = mxfVar.d;
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, lxf.a((lxf) value3, null, null, null, null, uxs.DISABLE, null, 47)));
                SprThrowable sprThrowableH = bm50.h(lk50Var);
                wwd0 wwd0Var2 = mxfVar.d;
                if (sprThrowableH != null) {
                    do {
                        value5 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value5, lxf.a((lxf) value5, null, null, null, ((lk50.a) lk50Var).b, uxs.DISABLE, null, 39)));
                } else {
                    do {
                        value4 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value4, lxf.a((lxf) value4, null, null, null, null, null, vwf.b.a, 31)));
                }
            } else if (Intrinsics.g(lk50Var, lk50.b.a)) {
                wwd0 wwd0Var3 = mxfVar.d;
                do {
                    value2 = wwd0Var3.getValue();
                } while (!wwd0Var3.g(value2, lxf.a((lxf) value2, null, null, null, null, uxs.LOADING, null, 47)));
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                wwd0 wwd0Var4 = mxfVar.d;
                do {
                    value = wwd0Var4.getValue();
                } while (!wwd0Var4.g(value, lxf.a((lxf) value, null, null, null, null, uxs.ENABLE, vwf.a.a, 15)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxf(mxf mxfVar, v1b<? super nxf> v1bVar) {
        super(2, v1bVar);
        this.b = mxfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nxf(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nxf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mxf mxfVar = this.b;
            wwd0 wwd0Var = mxfVar.d;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, lxf.a((lxf) value, null, null, null, vch0.a, null, null, 55)));
            or60 or60VarO = bm50.o(new a(mxfVar, new EmailUpdateRequest(mxfVar.c, ((lxf) mxfVar.d.getValue()).b.a.b), null));
            b bVar = new b(mxfVar);
            this.a = 1;
            if (or60VarO.collect(bVar, this) == y5bVar) {
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
