package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lhde;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "", "b", "(Lv1b;)Ljava/lang/Object;", "Lide;", "body", "Ljde;", "a", "(Lide;Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface hde {
    @flz("patron/integrity/token/verify")
    Object a(@jh4 ide ideVar, v1b<? super BaseResponse<jde>> v1bVar);

    @sbj("patron/integrity/generate/unique")
    Object b(v1b<? super BaseResponse<String>> v1bVar);
}
