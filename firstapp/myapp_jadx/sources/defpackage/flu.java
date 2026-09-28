package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.MainViewModel$reportRegSuccessCtaClickConversion$1", f = "MainViewModel.kt", l = {720}, m = "invokeSuspend", v = 2)
public final class flu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oku c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flu(v1b v1bVar, oku okuVar) {
        super(2, v1bVar);
        this.c = okuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        flu fluVar = new flu(v1bVar, this.c);
        fluVar.b = obj;
        return fluVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((flu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                oku okuVar = this.c;
                zi50.a aVar = zi50.b;
                yqm yqmVar = okuVar.X;
                x66<js40> x66Var = z76.n;
                String str = x66Var.a;
                String str2 = (String) CollectionsKt.b0(x66Var.b);
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
            Unit unit = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable unused) {
            zi50.a aVar3 = zi50.b;
        }
        return Unit.a;
    }
}
