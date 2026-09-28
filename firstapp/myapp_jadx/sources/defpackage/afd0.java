package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportytv.data.Program;
import com.sporty.android.sportytv.data.TvConfig;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface afd0 {
    lyh<BaseResponse<xdp>> a(String str);

    lyh<BaseResponse<xdp>> b(String str);

    lyh<BaseResponse<TvConfig>> c(String str);

    lyh<BaseResponse<List<Program>>> d(String str, String str2);

    lyh e(String str, String str2);
}
