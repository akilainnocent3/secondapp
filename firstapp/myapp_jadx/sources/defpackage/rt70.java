package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import com.sportygames.common.framework.network.HTTPResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lrt70;", "", "", "gameNames", "Lcom/sportygames/common/framework/network/HTTPResponse;", "", "Lcom/sportygames/common/business/CommonGameDetails;", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface rt70 {
    @sbj("lobby/v1/games/fetchByGameNames")
    Object a(@db30("gameNames") String str, v1b<? super HTTPResponse<List<CommonGameDetails>>> v1bVar);
}
