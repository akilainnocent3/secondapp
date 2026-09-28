package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.sharewin.ShareWinData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v64 implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ajx) obj).getClass();
                return Unit.a;
            default:
                BaseResponse baseResponse = (BaseResponse) obj;
                baseResponse.getClass();
                if (!baseResponse.isSuccessful()) {
                    return z190.a.a;
                }
                T t = baseResponse.data;
                t.getClass();
                return new z190.b((ShareWinData) t);
        }
    }
}
