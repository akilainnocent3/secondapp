package defpackage;

import com.sporty.android.core.model.cms.CMSRequest;
import com.sporty.android.core.model.cms.CMSResponse;
import com.sporty.android.core.model.cms.CMSResponseWrapper;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lrm5;", "", "", "Lcom/sporty/android/core/model/cms/CMSRequest;", "cmsRequestList", "Lcom/sporty/android/core/model/cms/CMSResponse;", "a", "(Ljava/util/List;Lv1b;)Ljava/lang/Object;", "", AnalyticsParam.MINI_GAMES_PAGE, "locale", "Lcom/sporty/android/core/model/cms/CMSResponseWrapper;", "c", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lxdp;", "b", "(Lv1b;)Ljava/lang/Object;", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface rm5 {
    @flz("cms/getKeys")
    @gil({"Content-Type: application/json"})
    Object a(@jh4 List<CMSRequest> list, v1b<? super List<CMSResponse>> v1bVar);

    @sbj("cms/pages/versions")
    @gil({"Content-Type: application/json"})
    Object b(v1b<? super xdp> v1bVar);

    @sbj("cms/pages/export/{page}")
    @gil({"Content-Type: application/json"})
    Object c(@dxz(AnalyticsParam.MINI_GAMES_PAGE) String str, @db30("locale") String str2, v1b<? super CMSResponseWrapper> v1bVar);
}
