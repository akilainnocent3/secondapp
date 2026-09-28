package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onAddCode$4", f = "PersonalCodeViewModel.kt", l = {449}, m = "invokeSuspend", v = 2)
public final class tk00 extends tje0 implements gaj<myh<? super a8a0>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ el00 b;
    public final /* synthetic */ kl00 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk00(v1b v1bVar, el00 el00Var, kl00 kl00Var, boolean z) {
        super(3, v1bVar);
        this.b = el00Var;
        this.c = kl00Var;
        this.d = z;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super a8a0> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new tk00(v1bVar, this.b, this.c, this.d).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String str = this.c.a;
            bv7.b bVar = bv7.b.a;
            this.a = 1;
            if (this.b.x1(str, this.d, bVar) == y5bVar) {
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
