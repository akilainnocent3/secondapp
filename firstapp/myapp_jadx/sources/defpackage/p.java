package defpackage;

import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJ\\\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lp;", "", "", "campaignCode", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/anTesting/data/model/CampaignParticipateV2;", "b", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "", "campaignId", "variantId", "", "c", "(IILv1b;)Ljava/lang/Object;", "variantName", "eventName", "", "amount", "a", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lv1b;)Ljava/lang/Object;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p {
    @sbj("anTest/client/v2/convert")
    Object a(@db30("campaignId") Integer num, @db30("campaignCode") String str, @db30("variantId") Integer num2, @db30("variantName") String str2, @db30("eventName") String str3, @db30("amount") Double d, v1b<? super HTTPResponse<Unit>> v1bVar);

    @sbj("anTest/client/v2/participate")
    Object b(@db30("campaignCode") String str, v1b<? super HTTPResponse<CampaignParticipateV2>> v1bVar);

    @sbj("anTest/client/v2/visit")
    Object c(@db30("campaignId") int i, @db30("variantId") int i2, v1b<? super HTTPResponse<Unit>> v1bVar);
}
