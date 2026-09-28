package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onShareCode$3", f = "PersonalCodeViewModel.kt", l = {256}, m = "invokeSuspend", v = 2)
public final class cl00 extends tje0 implements Function2<myh<? super uha0>, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ el00 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl00(el00 el00Var, String str, boolean z, v1b<? super cl00> v1bVar) {
        super(2, v1bVar);
        this.b = el00Var;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cl00(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super uha0> myhVar, v1b<? super Unit> v1bVar) {
        return ((cl00) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            bv7.a aVar = bv7.a.a;
            this.a = 1;
            if (this.b.z1(this.c, this.d, aVar) == y5bVar) {
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
