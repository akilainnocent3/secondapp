package defpackage;

import com.sporty.android.core.model.cms.CMSLanguage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.cms.CMSUpdateUseCase$downloadPage$2", f = "CMSUpdateUseCase.kt", l = {69, 76, 78}, m = "invokeSuspend", v = 2)
public final class qp5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xp5 d;
    public final /* synthetic */ no5 e;

    @c0d(c = "com.sporty.android.platform.features.cms.CMSUpdateUseCase$downloadPage$2$1$1", f = "CMSUpdateUseCase.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ xp5 b;
        public final /* synthetic */ no5 c;
        public final /* synthetic */ CMSLanguage d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xp5 xp5Var, no5 no5Var, CMSLanguage cMSLanguage, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = xp5Var;
            this.c = no5Var;
            this.d = cMSLanguage;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
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
                no5 no5Var = this.c;
                long j = no5Var.b;
                this.a = 1;
                if (this.b.a(j, no5Var, this.d, this) == y5bVar) {
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
    public qp5(xp5 xp5Var, no5 no5Var, v1b<? super qp5> v1bVar) {
        super(2, v1bVar);
        this.d = xp5Var;
        this.e = no5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qp5 qp5Var = new qp5(this.d, this.e, v1bVar);
        qp5Var.c = obj;
        return qp5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qp5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (r2.c(r1, r16) == r4) goto L37;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
