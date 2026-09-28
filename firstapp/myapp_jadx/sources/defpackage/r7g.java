package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase$getCachedOrNull$2", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {43, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class r7g extends tje0 implements Function2<v5b, v1b<? super ds3>, Object> {
    public pjd a;
    public ojd b;
    public TaxConfigs c;
    public n7g.a d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ n7g i;
    public final /* synthetic */ boolean v;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase$getCachedOrNull$2$account$1", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {40}, m = "invokeSuspend", v = 2)
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
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objC = this.b.c(this.c, this);
                return objC == y5bVar ? y5bVar : objC;
            }
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase$getCachedOrNull$2$assetsInfo$1", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super n7g.b>, Object> {
        public final /* synthetic */ n7g a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n7g n7gVar, boolean z, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = n7gVar;
            this.b = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super n7g.b> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return this.a.d(this.b);
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase$getCachedOrNull$2$taxConfigs$1", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
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
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                Object objE = this.b.e(this);
                return objE == y5bVar ? y5bVar : objE;
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
    public r7g(n7g n7gVar, boolean z, v1b<? super r7g> v1bVar) {
        super(2, v1bVar);
        this.i = n7gVar;
        this.v = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r7g r7gVar = new r7g(this.i, this.v, v1bVar);
        r7gVar.f = obj;
        return r7gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ds3> v1bVar) {
        return ((r7g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        ojd ojdVarA;
        pjd pjdVar;
        TaxConfigs taxConfigs;
        Object objAwait;
        n7g.a aVar;
        Object objAwait2;
        TaxConfigs taxConfigs2;
        n7g.a aVar2;
        n7g.b bVar;
        v5b v5bVar = (v5b) this.f;
        y5b y5bVar = y5b.a;
        int i = this.e;
        if (i == 0) {
            uj50.b(obj);
            n7g n7gVar = this.i;
            pjd pjdVarA = ej5.a(v5bVar, null, new c(n7gVar, null), 3);
            boolean z = this.v;
            pjd pjdVarA2 = ej5.a(v5bVar, null, new a(n7gVar, z, null), 3);
            ojdVarA = ej5.a(v5bVar, null, new b(n7gVar, z, null), 3);
            this.f = null;
            this.a = pjdVarA2;
            this.b = ojdVarA;
            this.e = 1;
            obj = pjdVarA.q(this);
            if (obj != y5bVar) {
                pjdVar = pjdVarA2;
            }
            return y5bVar;
        }
        if (i == 1) {
            ojdVarA = this.b;
            pjdVar = this.a;
            uj50.b(obj);
        } else {
            if (i == 2) {
                TaxConfigs taxConfigs3 = this.c;
                ojd ojdVar = this.b;
                uj50.b(obj);
                objAwait = obj;
                taxConfigs = taxConfigs3;
                ojdVarA = ojdVar;
                aVar = (n7g.a) objAwait;
                if (aVar != null) {
                    this.f = null;
                    this.a = null;
                    this.b = null;
                    this.c = taxConfigs;
                    this.d = aVar;
                    this.e = 3;
                    objAwait2 = ojdVarA.await(this);
                    if (objAwait2 != y5bVar) {
                        TaxConfigs taxConfigs4 = taxConfigs;
                        obj = objAwait2;
                        taxConfigs2 = taxConfigs4;
                        aVar2 = aVar;
                    }
                    return y5bVar;
                }
                return null;
            }
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = this.d;
            taxConfigs2 = this.c;
            uj50.b(obj);
        }
        bVar = (n7g.b) obj;
        if (bVar != null) {
            return new ds3(taxConfigs2, aVar2.b, aVar2.a, bVar.a);
        }
        return null;
        taxConfigs = (TaxConfigs) obj;
        if (taxConfigs != null) {
            this.f = null;
            this.a = null;
            this.b = ojdVarA;
            this.c = taxConfigs;
            this.e = 2;
            objAwait = pjdVar.await(this);
            if (objAwait != y5bVar) {
                aVar = (n7g.a) objAwait;
                if (aVar != null) {
                    this.f = null;
                    this.a = null;
                    this.b = null;
                    this.c = taxConfigs;
                    this.d = aVar;
                    this.e = 3;
                    objAwait2 = ojdVarA.await(this);
                    if (objAwait2 != y5bVar) {
                        TaxConfigs taxConfigs5 = taxConfigs;
                        obj = objAwait2;
                        taxConfigs2 = taxConfigs5;
                        aVar2 = aVar;
                        bVar = (n7g.b) obj;
                        if (bVar != null) {
                            return new ds3(taxConfigs2, aVar2.b, aVar2.a, bVar.a);
                        }
                    }
                }
            }
            return y5bVar;
        }
        return null;
    }
}
