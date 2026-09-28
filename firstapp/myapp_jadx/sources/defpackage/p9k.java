package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetMyNumberUseCase$invoke$2", f = "GetMyNumberUseCase.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class p9k extends tje0 implements gaj<myh<? super dvq>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super dvq> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        p9k p9kVar = new p9k(3, v1bVar);
        p9kVar.b = myhVar;
        return p9kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            dvq.a aVar = dvq.a.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(aVar, this) == y5bVar) {
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
