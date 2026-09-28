package defpackage;

import com.sporty.android.core.model.bo.images.ImageBOTypes;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.imageBOConfigs.BOImageRepositoryImpl$loadFromNetwork$4", f = "BOImageRepositoryImpl.kt", l = {156}, m = "invokeSuspend", v = 2)
public final class ar1 extends tje0 implements gaj<myh<? super ImageBOTypes.ImageResult>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super ImageBOTypes.ImageResult> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ar1 ar1Var = new ar1(3, v1bVar);
        ar1Var.b = myhVar;
        return ar1Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ImageBOTypes.ImageResult.Empty empty = ImageBOTypes.ImageResult.Empty.INSTANCE;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(empty, this) == y5bVar) {
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
