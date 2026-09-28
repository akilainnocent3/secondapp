package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.survey.AvailableSurveyIds;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Llie0;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/core/model/survey/AvailableSurveyIds;", "b", "(Lv1b;)Ljava/lang/Object;", "", "surveyId", "", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface lie0 {
    @flz("marketing/v2/survey/complete/{surveyId}")
    Object a(@dxz("surveyId") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("marketing/v2/survey/available")
    Object b(v1b<? super BaseResponse<AvailableSurveyIds>> v1bVar);
}
