package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.ReportZaAnTestConversionUseCase$invoke$2", f = "ReportZaAnTestConversionUseCase.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class aa50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ba50 c;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.ReportZaAnTestConversionUseCase$invoke$2$1$1", f = "ReportZaAnTestConversionUseCase.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends Unit>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ ba50 c;
        public final /* synthetic */ x66<?> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ba50 ba50Var, x66<?> x66Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = ba50Var;
            this.d = x66Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends Unit>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            x66<?> x66Var = this.d;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    ba50 ba50Var = this.c;
                    zi50.a aVar = zi50.b;
                    yqm yqmVar = ba50Var.b;
                    String str = x66Var.a;
                    String str2 = (String) CollectionsKt.T(x66Var.b);
                    this.b = null;
                    this.a = 1;
                    if (yqmVar.c(str, str2, null, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                bVar = Unit.a;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar4 = itf0.a;
                aVar4.q("Welcome Reward An Test");
                aVar4.a(oxc.a(x66Var.a, " convert failed: ", thA.getMessage()), new Object[0]);
            }
            return new zi50(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa50(ba50 ba50Var, v1b<? super aa50> v1bVar) {
        super(2, v1bVar);
        this.c = ba50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        aa50 aa50Var = new aa50(this.c, v1bVar);
        aa50Var.b = obj;
        return aa50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((aa50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ba50 ba50Var = this.c;
            if (!ba50Var.a.O()) {
                return Unit.a;
            }
            List listK = b.k(z76.c, z76.f, z76.i, z76.n, z76.r);
            ArrayList arrayList = new ArrayList(l48.r(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                arrayList.add(ej5.a(v5bVar, null, new a(ba50Var, (x66) it.next(), null), 3));
            }
            this.b = null;
            this.a = 1;
            if (up1.a(arrayList, this) == y5bVar) {
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
