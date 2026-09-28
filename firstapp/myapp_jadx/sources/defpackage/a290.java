package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.sharewin.ShareWinData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a290 implements Function1 {
    public final /* synthetic */ f290 a;

    public /* synthetic */ a290(f290 f290Var) {
        this.a = f290Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rdk bVar;
        BaseResponse baseResponse = (BaseResponse) obj;
        ShareWinData shareWinData = (ShareWinData) baseResponse.data;
        String shareUrl = shareWinData != null ? shareWinData.getShareUrl() : null;
        f290 f290Var = this.a;
        wwd0 wwd0Var = f290Var.y;
        wwd0 wwd0Var2 = f290Var.G;
        if (baseResponse.isSuccessful()) {
            T t = baseResponse.data;
            t.getClass();
            bVar = new rdk.b((ShareWinData) t);
        } else {
            bVar = rdk.a.a;
        }
        wwd0Var.setValue(bVar);
        if (!baseResponse.isSuccessful() || shareUrl == null || StringsKt.U(shareUrl)) {
            wwd0Var2.setValue(null);
            ej5.c(o8i0.d(f290Var), null, null, new i290(null, f290Var), 3);
        } else {
            wwd0Var2.getClass();
            wwd0Var2.k(null, shareUrl);
        }
        return Unit.a;
    }
}
