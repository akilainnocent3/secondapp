package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class em50 {
    public static final yzh a(lyh lyhVar) {
        lyhVar.getClass();
        return new yzh(new xzh(new gl50(lyhVar), new hl50(2, null)), new jl50(3, null));
    }

    public static final <T> T b(HTTPResponse<T> hTTPResponse) throws wjd0 {
        T data;
        hTTPResponse.getClass();
        Integer bizCode = hTTPResponse.getBizCode();
        HTTPResponse<T> hTTPResponse2 = (bizCode != null && bizCode.intValue() == 10000) ? hTTPResponse : null;
        if (hTTPResponse2 != null && (data = hTTPResponse2.getData()) != null) {
            return data;
        }
        Integer bizCode2 = hTTPResponse.getBizCode();
        int iIntValue = bizCode2 != null ? bizCode2.intValue() : 0;
        String message = hTTPResponse.getMessage();
        if (message == null) {
            message = "";
        }
        throw new wjd0(iIntValue, message);
    }
}
