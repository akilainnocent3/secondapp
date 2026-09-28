package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sportybet.plugin.realsports.data.LiveStreamData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.usecase.GetSTVPlayerDataUseCase$reportUndefinedLiveStreamData$2", f = "GetSTVPlayerDataUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gdk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ LiveStreamData b;
    public final /* synthetic */ hdk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdk(String str, LiveStreamData liveStreamData, hdk hdkVar, v1b<? super gdk> v1bVar) {
        super(2, v1bVar);
        this.a = str;
        this.b = liveStreamData;
        this.c = hdkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gdk(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gdk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Exception exc = new Exception("STV unavailable caused by undefined LiveStreamData type");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StackTraceElement("STV unavailable caused by undefined LiveStreamData type", "", "", 0));
        arrayList.add(new StackTraceElement("", inm.a("eventId=", this.a), "", 0));
        LiveStreamData liveStreamData = this.b;
        if (liveStreamData != null) {
            str = liveStreamData.getClass() + "(platform=" + liveStreamData.platform + ")";
        } else {
            str = oAudzpbdOhCI.yWgihVKQsLX;
        }
        arrayList.add(new StackTraceElement("", "LiveStreamData=".concat(str), "", 0));
        exc.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_STV_PLAYER);
        aVar.e(exc);
        wsm.d(this.c.e, exc);
        return Unit.a;
    }
}
