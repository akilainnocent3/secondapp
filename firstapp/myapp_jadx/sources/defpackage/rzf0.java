package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.MyLog;
import com.sportybet.model.cashOut.CashOutPageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rzf0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ rzf0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final Context context = this.b;
        if (zBooleanValue) {
            int i = this.a;
            if (-1 != i) {
                tzf0.i(context, i);
            } else if (tzf0.a.getAccountHelper().getAccount() == null) {
                tzf0.i(context, 0);
            } else {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.l("show toolbar notification, get openBetsCount", new Object[0]);
                try {
                    context.getClass();
                    int i2 = 20;
                    Object baseContext = context;
                    while (true) {
                        int i3 = i2 - 1;
                        if (i2 <= 0 || (baseContext instanceof ibs)) {
                            break;
                        }
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        baseContext.getClass();
                        i2 = i3;
                    }
                    ibs ibsVar = baseContext instanceof ibs ? (ibs) baseContext : null;
                    if (!tzf0.c && ibsVar != null) {
                        tzf0.c = true;
                        i2i.c(((v840) tzf0.b.a.getValue()).a(), null, 3).f(ibsVar, new lfy() { // from class: szf0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.lfy
                            public final void u1(Object obj2) {
                                BaseResponse baseResponse = (BaseResponse) obj2;
                                baseResponse.getClass();
                                boolean zHasData = baseResponse.hasData();
                                Context context2 = context;
                                if (zHasData) {
                                    tzf0.i(context2, ((CashOutPageResponse) baseResponse.data).getTotalNum());
                                } else {
                                    int i4 = baseResponse.bizCode;
                                    String str = baseResponse.message;
                                    if (str == null) {
                                        str = "";
                                    }
                                    new SprThrowable(i4, str, baseResponse.data == 0);
                                    tzf0.i(context2, 0);
                                }
                                tzf0.c = false;
                            }
                        });
                    }
                } catch (Throwable th) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.p(th, "Failed to get openBetsCount", new Object[0]);
                    tzf0.i(context, 0);
                }
            }
        } else if (context != null) {
            new t2y(context).b.cancel(null, 500000);
        }
        return Unit.a;
    }
}
