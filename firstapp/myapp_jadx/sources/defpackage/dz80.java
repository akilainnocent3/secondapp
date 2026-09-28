package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.bookingcode.data.dto.BookingData;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class dz80 extends u4s {
    public BookingData b;
    public final mo0 c;
    public su5<BaseResponse<BookingData>> d;

    public dz80() {
        super(0);
        this.c = l840.a();
    }

    @Override // defpackage.u4s
    public final hqc b() {
        BookingData bookingData = this.b;
        if (bookingData != null) {
            return new nqc(bookingData);
        }
        return null;
    }
}
