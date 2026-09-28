package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface oo0 {
    @flz("base/cipher")
    @tti
    su5<BaseResponse<xdp>> a(@gjh("deviceId") String str, @gjh("password") String str2);

    @flz("common/config/v2/query")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<Object>> b(@jh4 String str);

    @flz("common/config/query")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<Object>> c(@jh4 String str);
}
