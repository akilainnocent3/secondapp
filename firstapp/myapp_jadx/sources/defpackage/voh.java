package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\u0007\u001a*\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00050\u00030\u0002j\u0002`\u0006H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lvoh;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "", "", "", "Lcom/sportybet/android/firebase/FirebaseTopicsResult;", "b", "(Lv1b;)Ljava/lang/Object;", "feature", "", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface voh {
    @sbj("patron/v1/notification-topics/available/{feature}")
    Object a(@dxz("feature") String str, v1b<? super BaseResponse<Boolean>> v1bVar);

    @sbj("patron/v1/notification-topics")
    Object b(v1b<? super BaseResponse<Map<String, List<Map<String, String>>>>> v1bVar);
}
