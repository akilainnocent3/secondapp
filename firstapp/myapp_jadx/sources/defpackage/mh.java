package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.AddMuNumberUseCase$invoke$3", f = "AddMuNumberUseCase.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class mh extends tje0 implements Function2<myh<? super xwq>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mh mhVar = new mh(2, v1bVar);
        mhVar.b = obj;
        return mhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super xwq> myhVar, v1b<? super Unit> v1bVar) {
        return ((mh) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xwq xwqVar = new xwq(lk50.b.a, dvq.c.a);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(xwqVar, this) == y5bVar) {
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
