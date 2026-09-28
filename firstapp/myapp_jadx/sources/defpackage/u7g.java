package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase$invoke$2", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {60, 63, 66}, m = "invokeSuspend", v = 2)
public final class u7g extends tje0 implements Function2<v5b, v1b<? super ds3>, Object> {
    public pjd a;
    public ojd b;
    public n7g.a c;
    public TaxConfigs d;
    public AccountInfo e;
    public String f;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ n7g w;
    public final /* synthetic */ boolean y;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase$invoke$2$account$1", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super n7g.a>, Object> {
        public int a;
        public final /* synthetic */ n7g b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n7g n7gVar, boolean z, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = n7gVar;
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super n7g.a> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objA = this.b.a(this.c, this);
                return objA == y5bVar ? y5bVar : objA;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase$invoke$2$assetsInfo$1", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super n7g.b>, Object> {
        public int a;
        public final /* synthetic */ n7g b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n7g n7gVar, boolean z, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = n7gVar;
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super n7g.b> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objB = this.b.b(this.c, this);
                return objB == y5bVar ? y5bVar : objB;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase$invoke$2$taxConfigs$1", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super TaxConfigs>, Object> {
        public int a;
        public final /* synthetic */ n7g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n7g n7gVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = n7gVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super TaxConfigs> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objF = this.b.f(this);
                return objF == y5bVar ? y5bVar : objF;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7g(n7g n7gVar, boolean z, v1b<? super u7g> v1bVar) {
        super(2, v1bVar);
        this.w = n7gVar;
        this.y = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u7g u7gVar = new u7g(this.w, this.y, v1bVar);
        u7gVar.v = obj;
        return u7gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ds3> v1bVar) {
        return ((u7g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        ojd ojdVarA;
        pjd pjdVar;
        n7g.a aVar;
        ojd ojdVar;
        TaxConfigs taxConfigs;
        AccountInfo accountInfo;
        String str;
        Object objAwait;
        TaxConfigs taxConfigs2;
        AccountInfo accountInfo2;
        v5b v5bVar = (v5b) this.v;
        y5b y5bVar = y5b.a;
        int i = this.i;
        if (i == 0) {
            uj50.b(obj);
            n7g n7gVar = this.w;
            pjd pjdVarA = ej5.a(v5bVar, null, new c(n7gVar, null), 3);
            boolean z = this.y;
            pjd pjdVarA2 = ej5.a(v5bVar, null, new a(n7gVar, z, null), 3);
            ojdVarA = ej5.a(v5bVar, null, new b(n7gVar, z, null), 3);
            this.v = null;
            this.a = pjdVarA;
            this.b = ojdVarA;
            this.i = 1;
            Object objQ = pjdVarA2.q(this);
            if (objQ != y5bVar) {
                pjdVar = pjdVarA;
                obj = objQ;
            }
            return y5bVar;
        }
        if (i == 1) {
            ojdVarA = this.b;
            pjdVar = this.a;
            uj50.b(obj);
        } else {
            if (i == 2) {
                aVar = this.c;
                ojdVar = this.b;
                uj50.b(obj);
                taxConfigs = (TaxConfigs) obj;
                accountInfo = aVar.b;
                str = aVar.a;
                this.v = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = taxConfigs;
                this.e = accountInfo;
                this.f = str;
                this.i = 3;
                objAwait = ojdVar.await(this);
                if (objAwait != y5bVar) {
                    obj = objAwait;
                    taxConfigs2 = taxConfigs;
                    accountInfo2 = accountInfo;
                }
                return y5bVar;
            }
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.f;
            accountInfo2 = this.e;
            taxConfigs2 = this.d;
            uj50.b(obj);
        }
        return new ds3(taxConfigs2, accountInfo2, str, ((n7g.b) obj).a);
        n7g.a aVar2 = (n7g.a) obj;
        this.v = null;
        this.a = null;
        this.b = ojdVarA;
        this.c = aVar2;
        this.i = 2;
        Object objAwait2 = pjdVar.await(this);
        if (objAwait2 != y5bVar) {
            ojd ojdVar2 = ojdVarA;
            aVar = aVar2;
            obj = objAwait2;
            ojdVar = ojdVar2;
            taxConfigs = (TaxConfigs) obj;
            accountInfo = aVar.b;
            str = aVar.a;
            this.v = null;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = taxConfigs;
            this.e = accountInfo;
            this.f = str;
            this.i = 3;
            objAwait = ojdVar.await(this);
            if (objAwait != y5bVar) {
                obj = objAwait;
                taxConfigs2 = taxConfigs;
                accountInfo2 = accountInfo;
                return new ds3(taxConfigs2, accountInfo2, str, ((n7g.b) obj).a);
            }
        }
        return y5bVar;
    }
}
