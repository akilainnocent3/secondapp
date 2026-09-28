package defpackage;

import androidx.compose.animation.f;
import com.sporty.android.core.model.pocket.deposit.sportybank.OneTimeBankHowToDepositDto;
import com.sporty.android.core.model.pocket.deposit.sportybank.OneTimeBankHowToDepositStepDto;
import com.sporty.android.core.model.pocket.deposit.sportybank.OneTimeBankPageContentDto;
import com.sporty.android.core.model.pocket.deposit.sportybank.OneTimeBankPromotionBannerDto;
import com.sporty.android.core.model.pocket.deposit.sportybank.OneTimeBankPromotionContentDto;
import com.sporty.android.core.model.pocket.deposit.sportybank.OneTimeBankPromotionDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uhx implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ uhx(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? arrayList;
        OneTimeBankPromotionBannerDto banner;
        String string;
        Ctry.b bVar;
        String string2;
        rry rryVar = null;
        switch (this.a) {
            case 0:
                return f.f(yi0.e(700, 0, null, 6), 2);
            default:
                OneTimeBankPageContentDto oneTimeBankPageContentDto = (OneTimeBankPageContentDto) obj;
                oneTimeBankPageContentDto.getClass();
                OneTimeBankPromotionDto promotion = oneTimeBankPageContentDto.getPromotion();
                Ctry ctry = Ctry.d;
                if (promotion != null && Intrinsics.g(promotion.getEnabled(), Boolean.TRUE) && (banner = promotion.getBanner()) != null) {
                    String iconUrl = banner.getIconUrl();
                    if (iconUrl == null || (string = StringsKt.t0(iconUrl).toString()) == null || string.length() <= 0) {
                        string = null;
                    }
                    Ctry.a aVar = new Ctry.a(string, a020.g(banner.getTitle()), a020.g(banner.getContent()), a020.g(banner.getLearnMore()));
                    OneTimeBankPromotionContentDto content = promotion.getContent();
                    if (content != null) {
                        String iconUrl2 = content.getIconUrl();
                        String str = (iconUrl2 == null || (string2 = StringsKt.t0(iconUrl2).toString()) == null || string2.length() <= 0) ? null : string2;
                        String strG = a020.g(content.getTitle());
                        String strG2 = a020.g(content.getBenefit());
                        String strG3 = a020.g(content.getLegalDescription());
                        String strG4 = a020.g(content.getRegistrationNumber());
                        bVar = new Ctry.b(str, strG, strG2, strG3, strG4);
                        if (strG.length() <= 0 && strG2.length() <= 0 && strG3.length() <= 0 && strG4.length() <= 0) {
                            bVar = null;
                        }
                    } else {
                        bVar = null;
                    }
                    ctry = new Ctry(true, aVar, bVar);
                }
                OneTimeBankHowToDepositDto howToDeposit = oneTimeBankPageContentDto.getHowToDeposit();
                if (howToDeposit != null) {
                    List<OneTimeBankHowToDepositStepDto> steps = howToDeposit.getSteps();
                    if (steps != null) {
                        arrayList = new ArrayList();
                        for (OneTimeBankHowToDepositStepDto oneTimeBankHowToDepositStepDto : steps) {
                            String strG5 = a020.g(oneTimeBankHowToDepositStepDto.getTitle());
                            rry.a aVar2 = strG5.length() == 0 ? null : new rry.a(strG5, a020.g(oneTimeBankHowToDepositStepDto.getDescription()));
                            if (aVar2 != null) {
                                arrayList.add(aVar2);
                            }
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = m2g.a;
                    }
                    if (!arrayList.isEmpty()) {
                        rryVar = new rry(a020.g(howToDeposit.getHeader()), arrayList);
                    }
                }
                return new sry(ctry, rryVar);
        }
    }
}
