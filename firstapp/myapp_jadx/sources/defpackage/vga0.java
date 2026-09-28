package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.social.data.local.SocShareCodeEntity;
import com.sportybet.android.social.data.local.SocialFollowerEntity;
import com.sportybet.android.social.data.local.SocialFollowingEntity;
import com.sportybet.android.social.data.remote.entity.SocShareCode;
import com.sportybet.android.social.data.remote.entity.SocialMetaData;

/* JADX INFO: loaded from: classes6.dex */
public interface vga0 {
    static /* synthetic */ lyh h(vga0 vga0Var, int i, String str, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        return vga0Var.o(i, str);
    }

    static /* synthetic */ lyh j(vga0 vga0Var, int i, String str, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        return vga0Var.c(i, str);
    }

    lyh<BaseResponse<BookingData>> a(String str, boolean z);

    lyh<BaseResponse<Void>> b(String str);

    lyh c(int i, String str);

    lyh<BaseResponse<SocShareCode>> d(String str, String str2);

    lyh e(int i, String str);

    lyh<BaseResponse<Void>> f(String str, String str2);

    lyh g(String str);

    lyh<BaseResponse<SocialMetaData>> i(String str);

    lyh<BaseResponse<BookingData>> k(String str, String str2);

    lyh<BaseResponse<Void>> l(String str);

    lyh<kqz<SocShareCodeEntity>> m(y7a0 y7a0Var);

    lyh<BaseResponse<SocShareCode>> n(String str);

    lyh o(int i, String str);

    lyh<BaseResponse<Boolean>> p(String str);

    lyh<kqz<SocialFollowerEntity>> q(v8a0 v8a0Var);

    lyh<BaseResponse<Void>> r(String str);

    lyh<BaseResponse<SocialMetaData>> s();

    lyh<BaseResponse<Boolean>> t(String str);

    lyh<kqz<SocialFollowingEntity>> u(v8a0 v8a0Var);
}
