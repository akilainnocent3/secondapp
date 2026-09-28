package defpackage;

import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tr10 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<SportyBankDto> list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (SportyBankDto sportyBankDto : list) {
            sportyBankDto.getClass();
            int bankId = sportyBankDto.getBankId();
            String displayName = sportyBankDto.getDisplayName();
            String iconUrl = sportyBankDto.getIconUrl();
            Boolean bool = Boolean.FALSE;
            Boolean lastUsed = sportyBankDto.getLastUsed();
            Boolean bool2 = Boolean.TRUE;
            boolean zG = Intrinsics.g(lastUsed, bool2);
            boolean zG2 = Intrinsics.g(sportyBankDto.getRecommended(), bool2);
            String description = sportyBankDto.getDescription();
            if (description == null) {
                description = "";
            }
            arrayList.add(new jw1(bankId, null, displayName, iconUrl, false, false, bool, null, zG, zG2, description, 48));
        }
        return arrayList;
    }
}
