package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$onLiveEventNotificationEnabled$1", f = "HomeViewModel.kt", l = {804}, m = "invokeSuspend", v = 2)
public final class cjm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iim c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjm(iim iimVar, Context context, boolean z, v1b<? super cjm> v1bVar) {
        super(2, v1bVar);
        this.c = iimVar;
        this.d = context;
        this.e = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cjm cjmVar = new cjm(this.c, this.d, this.e, v1bVar);
        cjmVar.b = obj;
        return cjmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cjm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                iim iimVar = this.c;
                Context context = this.d;
                boolean z = this.e;
                zi50.a aVar = zi50.b;
                fls flsVar = iimVar.w;
                this.b = null;
                this.a = 1;
                if (flsVar.a(context, z, this) == y5bVar) {
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
