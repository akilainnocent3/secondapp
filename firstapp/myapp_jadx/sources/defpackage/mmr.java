package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.langauage.LanguageViewModel$getLanguageCode$$inlined$flatMapLatest$1", f = "LanguageViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class mmr extends tje0 implements gaj<myh<? super String>, jb40.a.b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ omr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmr(v1b v1bVar, omr omrVar) {
        super(3, v1bVar);
        this.d = omrVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super String> myhVar, jb40.a.b bVar, v1b<? super Unit> v1bVar) {
        mmr mmrVar = new mmr(v1bVar, this.d);
        mmrVar.b = myhVar;
        mmrVar.c = bVar;
        return mmrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh<String> languageFlow = this.d.a.getLanguageFlow();
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, languageFlow, this) == y5bVar) {
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
