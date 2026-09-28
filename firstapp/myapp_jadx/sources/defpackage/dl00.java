package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onShareCode$4", f = "PersonalCodeViewModel.kt", l = {262}, m = "invokeSuspend", v = 2)
public final class dl00 extends tje0 implements gaj<myh<? super uha0>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ el00 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl00(el00 el00Var, String str, boolean z, v1b<? super dl00> v1bVar) {
        super(3, v1bVar);
        this.b = el00Var;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super uha0> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        String str = this.c;
        boolean z = this.d;
        return new dl00(this.b, str, z, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            bv7.b bVar = bv7.b.a;
            this.a = 1;
            if (this.b.z1(this.c, this.d, bVar) == y5bVar) {
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
