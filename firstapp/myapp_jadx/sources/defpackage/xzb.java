package defpackage;

import com.sportybet.android.social.data.local.CreatorCreditHistoryEntity;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditHistoryViewModel$getCreatorCreditHistory$3$1", f = "CreatorCreditHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xzb extends tje0 implements Function2<CreatorCreditHistoryEntity, v1b<? super tzb>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xzb xzbVar = new xzb(2, v1bVar);
        xzbVar.a = obj;
        return xzbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreatorCreditHistoryEntity creatorCreditHistoryEntity, v1b<? super tzb> v1bVar) {
        return ((xzb) create(creatorCreditHistoryEntity, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CreatorCreditHistoryEntity creatorCreditHistoryEntity = (CreatorCreditHistoryEntity) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        creatorCreditHistoryEntity.getClass();
        String batchId = creatorCreditHistoryEntity.getBatchId();
        String strA = p2c.a(creatorCreditHistoryEntity.getClaimedAmount(), creatorCreditHistoryEntity.getCurrency());
        Date date = new Date(creatorCreditHistoryEntity.getLastClaimedTime());
        Locale locale = Locale.getDefault();
        locale.getClass();
        return new tzb(batchId, strA, bwf0.l(date, "dd MMM, yyyy", locale, 2, 0), p2c.b(creatorCreditHistoryEntity.getStartTime(), creatorCreditHistoryEntity.getEndTime()));
    }
}
