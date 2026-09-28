package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.bookingcode.data.dto.BookingData;

/* JADX INFO: loaded from: classes5.dex */
public final class cz80 implements gv5<BaseResponse<BookingData>> {
    public final /* synthetic */ dz80 a;

    public cz80(dz80 dz80Var) {
        this.a = dz80Var;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<BookingData>> su5Var, Throwable th) {
        this.a.c(new kqc());
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<BookingData>> su5Var, bi50<BaseResponse<BookingData>> bi50Var) {
        BaseResponse<BookingData> baseResponse;
        if (bi50Var.a.getIsSuccessful() && (baseResponse = bi50Var.b) != null) {
            BaseResponse<BookingData> baseResponse2 = baseResponse;
            if (baseResponse2.bizCode == 10000) {
                BookingData bookingData = baseResponse2.data;
                dz80 dz80Var = this.a;
                dz80Var.b = bookingData;
                dz80Var.c(new nqc(bookingData));
                return;
            }
        }
        onFailure(su5Var, null);
    }
}
