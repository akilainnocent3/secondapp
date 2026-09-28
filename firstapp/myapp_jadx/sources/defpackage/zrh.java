package defpackage;

import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.repository.FirebaseRemoteConfigRepositoryImpl$observe$1", f = "FirebaseRemoteConfigRepositoryImpl.kt", l = {83}, m = "invokeSuspend", v = 2)
public final class zrh extends tje0 implements Function2<myh<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wrh c;
    public final /* synthetic */ Type d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrh(wrh wrhVar, Type type, v1b v1bVar) {
        super(2, v1bVar);
        this.c = wrhVar;
        this.d = type;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zrh zrhVar = new zrh(this.c, this.d, v1bVar);
        zrhVar.b = obj;
        return zrhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<Object> myhVar, v1b<? super Unit> v1bVar) {
        return ((zrh) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Object objJ = this.c.j(this.d);
            if (objJ != null) {
                this.b = null;
                this.a = 1;
                if (myhVar.emit(objJ, this) == y5bVar) {
                    return y5bVar;
                }
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
