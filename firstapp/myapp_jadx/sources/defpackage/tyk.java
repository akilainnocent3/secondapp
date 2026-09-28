package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$fetchValidGiftGroups$2", f = "GiftViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tyk extends tje0 implements gaj<myh<? super BaseResponse<List<? extends GiftGroup>>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BaseResponse<List<? extends GiftGroup>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        tyk tykVar = new tyk(3, v1bVar);
        tykVar.a = th;
        return tykVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.a(e40.a(aVar, "GiftViewModel", "Error fetching valid gift groups: ", th), new Object[0]);
        return Unit.a;
    }
}
