package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.CategoryItem;
import com.sporty.android.sportynews.data.CategoryList;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.sportyherocompose.remote.models.UserInfoResponseSocket;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wb90 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wb90(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object cVar;
        Unit unit;
        TopBets bet;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        T t;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fd90 fd90Var = (fd90) obj2;
                String str = (String) obj;
                ig50 ig50Var = fd90Var.f;
                str.getClass();
                try {
                    UserInfoResponseSocket userInfoResponseSocket = (UserInfoResponseSocket) ig50Var.a.e(str, UserInfoResponseSocket.class);
                    if (userInfoResponseSocket == null || (bet = userInfoResponseSocket.getBet()) == null) {
                        cVar = ig50.a.e.a;
                    } else {
                        boolean z = bet.getActualPayoutAmount() != null;
                        String messageType = userInfoResponseSocket.getMessageType();
                        if (Intrinsics.g(messageType, "OVER_UNDER_BET_RECORD")) {
                            cVar = z ? new ig50.a.C0677a(bet) : new ig50.a.b(bet);
                        } else if (Intrinsics.g(messageType, "RANGE_BET_RECORD")) {
                            cVar = z ? new ig50.a.c(bet) : new ig50.a.d(bet);
                        } else {
                            cVar = ig50.a.e.a;
                        }
                    }
                } catch (Exception unused) {
                    cVar = ig50.a.e.a;
                }
                if (cVar instanceof ig50.a.b) {
                    hd90.a aVar = fd90Var.o;
                    if (aVar == null) {
                        unit = Unit.a;
                    } else {
                        fd90Var.b(aVar, ((ig50.a.b) cVar).a);
                        unit = Unit.a;
                    }
                } else if (cVar instanceof ig50.a.C0677a) {
                    hd90.a aVar2 = fd90Var.o;
                    if (aVar2 == null) {
                        unit = Unit.a;
                    } else {
                        fd90Var.c(aVar2, ((ig50.a.C0677a) cVar).a);
                        unit = Unit.a;
                    }
                } else if (cVar instanceof ig50.a.d) {
                    hd90.b bVar = fd90Var.p;
                    if (bVar == null) {
                        unit = Unit.a;
                    } else {
                        fd90Var.b(bVar, ((ig50.a.d) cVar).a);
                        unit = Unit.a;
                    }
                } else {
                    if (cVar instanceof ig50.a.c) {
                        hd90.b bVar2 = fd90Var.p;
                        if (bVar2 == null) {
                            unit = Unit.a;
                        } else {
                            fd90Var.c(bVar2, ((ig50.a.c) cVar).a);
                        }
                    } else if (!Intrinsics.g(cVar, ig50.a.e.a)) {
                        uhc.a();
                        return null;
                    }
                    unit = Unit.a;
                }
                return unit;
            default:
                tsc0 tsc0Var = (tsc0) obj2;
                wwd0 wwd0Var = tsc0Var.b;
                wwd0 wwd0Var2 = tsc0Var.f;
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
                    do {
                        value4 = wwd0Var2.getValue();
                        ((Boolean) value4).getClass();
                    } while (!wwd0Var2.g(value4, Boolean.FALSE));
                    if (baseResponse.bizCode == 10000) {
                        List<CategoryItem> categories = ((CategoryList) baseResponse.data).getCategories();
                        if (categories == null || !(!categories.isEmpty())) {
                            do {
                                value6 = wwd0Var.getValue();
                            } while (!wwd0Var.g(value6, ot6.c.a));
                        } else {
                            do {
                                value7 = wwd0Var.getValue();
                                t = baseResponse.data;
                                t.getClass();
                            } while (!wwd0Var.g(value7, new ot6.b((CategoryList) t)));
                        }
                    } else {
                        do {
                            value5 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value5, ot6.d.a));
                    }
                } else if (lk50Var instanceof lk50.a) {
                    do {
                        value2 = wwd0Var2.getValue();
                        ((Boolean) value2).getClass();
                    } while (!wwd0Var2.g(value2, Boolean.FALSE));
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, ot6.d.a));
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    do {
                        value = wwd0Var2.getValue();
                        ((Boolean) value).getClass();
                    } while (!wwd0Var2.g(value, Boolean.TRUE));
                }
                return Unit.a;
        }
    }
}
