package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u0004H§@¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lo04;", "", "Lvkh0;", "body", "Lcom/sporty/android/common/network/data/BaseResponse;", "b", "(Lvkh0;Lv1b;)Ljava/lang/Object;", "", "Ll24;", "a", "(Lv1b;)Ljava/lang/Object;", "Lysz;", "Latz;", "d", "(Lysz;Lv1b;)Ljava/lang/Object;", "Lv14;", "c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface o04 {
    @sbj("promotion/v1/loyalty/betting/streak/missions:status")
    Object a(v1b<? super BaseResponse<List<l24>>> v1bVar);

    @ljz("promotion/v1/loyalty/betting/streak/settings")
    Object b(@jh4 vkh0 vkh0Var, v1b<? super BaseResponse<vkh0>> v1bVar);

    @sbj("promotion/v1/loyalty/betting/streak:queryLevelConfigs")
    Object c(v1b<? super BaseResponse<List<v14>>> v1bVar);

    @flz("promotion/v1/loyalty/betting/streak/missions:participate")
    Object d(@jh4 ysz yszVar, v1b<? super BaseResponse<atz>> v1bVar);
}
