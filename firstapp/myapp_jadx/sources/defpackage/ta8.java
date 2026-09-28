package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.config.BroadcastConfig;
import com.sporty.android.core.model.config.VersionData;
import com.sporty.android.core.model.config.bo.BOConfigResponse;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\bJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00152\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00152\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00050\u00040\u0012H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00050\u0004H§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lta8;", "", "", "jsonStr", "Lcom/sporty/android/common/network/data/BaseResponse;", "", "Lcom/sporty/android/core/model/config/bo/BOConfigValueWrapper;", "k", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/config/bo/BOConfigResponse;", "f", "e", "j", "currentVersion", "countryCode", "Lcom/sporty/android/core/model/config/VersionData;", "h", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lct90;", "i", "(Ljava/lang/String;)Lct90;", "Lsu5;", "c", "(Ljava/lang/String;)Lsu5;", "b", "Lcom/sporty/android/core/model/config/BroadcastConfig;", "d", "()Lct90;", "g", "(Lv1b;)Ljava/lang/Object;", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ta8 {
    @flz("common/config/v2/query")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<Object>> b(@jh4 String jsonStr);

    @flz("common/config/query")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<Object>> c(@jh4 String jsonStr);

    @sbj("common/config/broadcast")
    ct90<BaseResponse<List<BroadcastConfig>>> d();

    @flz("common/config/query")
    @gil({"Content-Type: application/json"})
    @fae
    Object e(@jh4 String str, v1b<? super BaseResponse<Object>> v1bVar);

    @flz("common/config/v2/query")
    @gil({"Content-Type: application/json"})
    Object f(@jh4 String str, v1b<? super BaseResponse<BOConfigResponse>> v1bVar);

    @sbj("common/config/broadcast/virtual")
    Object g(v1b<? super BaseResponse<List<BroadcastConfig>>> v1bVar);

    @sbj("common/config/versionInfo/android")
    Object h(@db30("appVersion") String str, @db30("product") String str2, v1b<? super BaseResponse<VersionData>> v1bVar);

    @flz("common/config/query")
    @gil({"Content-Type: application/json"})
    ct90<BaseResponse<Object>> i(@jh4 String jsonStr);

    @flz("common/config/v2/query")
    @gil({"Content-Type: application/json"})
    @fae
    Object j(@jh4 String str, v1b<? super BaseResponse<Object>> v1bVar);

    @flz("common/config/query")
    @gil({"Content-Type: application/json"})
    Object k(@jh4 String str, v1b<? super BaseResponse<List<BOConfigValueWrapper>>> v1bVar);
}
