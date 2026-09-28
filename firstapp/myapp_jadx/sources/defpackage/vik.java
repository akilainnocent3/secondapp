package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.gift.gift.data.remote.dto.RedeemCodeRequestDto;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\n\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lvik;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lmel;", "d", "(Lv1b;)Ljava/lang/Object;", "", "classify", "", "lastId", "pageSize", "Lrrk;", "e", "(ILjava/lang/String;ILv1b;)Ljava/lang/Object;", "Lcom/sportybet/feature/gift/gift/data/remote/dto/RedeemCodeRequestDto;", "body", "Lxjk;", "c", "(Lcom/sportybet/feature/gift/gift/data/remote/dto/RedeemCodeRequestDto;Lv1b;)Ljava/lang/Object;", "pageNo", "Lm25;", "b", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lv1b;)Ljava/lang/Object;", "Lmnh0;", "Lnnh0;", "a", "(Lmnh0;Lv1b;)Ljava/lang/Object;", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface vik {
    @flz("promotion/v1/boost/gift/use")
    Object a(@jh4 mnh0 mnh0Var, v1b<? super BaseResponse<nnh0>> v1bVar);

    @sbj("promotion/v1/boost/gift")
    Object b(@db30("classify") Integer num, @db30("pageNo") Integer num2, @db30("pageSize") Integer num3, v1b<? super BaseResponse<m25>> v1bVar);

    @flz("promotion/v1/gifts/redeem")
    Object c(@jh4 RedeemCodeRequestDto redeemCodeRequestDto, v1b<? super BaseResponse<xjk>> v1bVar);

    @sbj("promotion/v1/gifts/hasUsed")
    Object d(v1b<? super BaseResponse<mel>> v1bVar);

    @sbj("promotion/v1/gifts")
    Object e(@db30("classify") int i, @db30("lastId") String str, @db30("pageSize") int i2, v1b<? super BaseResponse<rrk>> v1bVar);
}
