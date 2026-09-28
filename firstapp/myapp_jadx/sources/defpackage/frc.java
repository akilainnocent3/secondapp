package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
public final class frc extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yqc<Object> b;

    public static final class a<T> implements myh {
        public final /* synthetic */ yqc<T> a;

        public a(yqc<T> yqcVar) {
            this.a = yqcVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            yqc<T> yqcVar = this.a;
            if (yqcVar.h.a() instanceof mnh) {
                return Unit.a;
            }
            Object objF = yqcVar.f(true, v1bVar);
            return objF == y5b.a ? objF : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frc(yqc<Object> yqcVar, v1b<? super frc> v1bVar) {
        super(2, v1bVar);
        this.b = yqcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new frc(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((frc) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r6.collect(r1, r5) == r0) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            yqc<java.lang.Object> r4 = r5.b
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            defpackage.uj50.b(r6)
            goto L4d
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)
            goto L32
        L1d:
            defpackage.uj50.b(r6)
            yqc<T>$a r6 = r4.i
            r5.a = r3
            dm8 r6 = r6.b
            java.lang.Object r6 = r6.q(r5)
            if (r6 != r0) goto L2d
            goto L2f
        L2d:
            kotlin.Unit r6 = kotlin.Unit.a
        L2f:
            if (r6 != r0) goto L32
            goto L4c
        L32:
            wxo r6 = r4.b()
            lyh r6 = r6.c()
            r1 = -1
            lyh r6 = defpackage.ozh.b(r6, r1, r2)
            frc$a r1 = new frc$a
            r1.<init>(r4)
            r5.a = r2
            java.lang.Object r5 = r6.collect(r1, r5)
            if (r5 != r0) goto L4d
        L4c:
            return r0
        L4d:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
