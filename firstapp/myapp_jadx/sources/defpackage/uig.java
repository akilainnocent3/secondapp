package defpackage;

import android.text.TextUtils;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.event.EventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uig implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uig(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                EventActivity eventActivity = (EventActivity) obj2;
                UIState uIState = (UIState) obj;
                int i2 = EventActivity.U0;
                if (uIState instanceof UIState.Success) {
                    UIState.Success success = (UIState.Success) uIState;
                    if (!TextUtils.isEmpty((CharSequence) success.getData())) {
                        agd0 agd0Var = eventActivity.R;
                        if (agd0Var == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        agd0Var.d.setRadioStreamUrl((String) success.getData());
                    }
                } else if (uIState instanceof UIState.Error) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_API);
                    aVar.a("Get audio stream fail: %s", ((UIState.Error) uIState).getError().getLocalizedMessage());
                }
                return Unit.a;
            default:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.f(((Number) ((wd0) obj2).d()).floatValue());
                return Unit.a;
        }
    }
}
