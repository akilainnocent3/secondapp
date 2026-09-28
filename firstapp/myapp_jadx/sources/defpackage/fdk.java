package defpackage;

import com.sporty.android.core.model.MyLog;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.usecase.GetSTVPlayerDataUseCase$reportExceptionFromGetLiveStreamData$2", f = "GetSTVPlayerDataUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fdk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ hdk b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdk(Throwable th, hdk hdkVar, String str, v1b<? super fdk> v1bVar) {
        super(2, v1bVar);
        this.a = th;
        this.b = hdkVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fdk(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fdk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Exception exc = new Exception("STV unavailable caused by exception from get LiveStreamData");
        Throwable th = this.a;
        StackTraceElement[] stackTrace = th.getStackTrace();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StackTraceElement("STV unavailable caused by exception from get LiveStreamData", "", "", 0));
        arrayList.add(new StackTraceElement(th.toString(), "", "", 0));
        arrayList.add(new StackTraceElement("", inm.a("eventId=", this.c), "", 0));
        stackTrace.getClass();
        p48.x(arrayList, stackTrace);
        exc.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_STV_PLAYER);
        aVar.e(exc);
        wsm.d(this.b.e, exc);
        return Unit.a;
    }
}
