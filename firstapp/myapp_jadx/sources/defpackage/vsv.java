package defpackage;

import com.sporty.android.core.model.loyalty.BetBuilderType;
import com.sporty.android.core.model.loyalty.BetType;
import com.sporty.android.core.model.loyalty.EarlyGoalsType;
import com.sporty.android.core.model.loyalty.MissionRewardDto;
import com.sporty.android.core.model.loyalty.UpType;
import com.sportybet.core.domain.model.a;
import com.sportybet.core.domain.model.b;
import com.sportybet.core.domain.model.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class vsv {
    /* JADX WARN: Code duplicated, block: B:42:0x0082 A[EDGE_INSN: B:42:0x0082->B:43:0x0083 BREAK  A[LOOP:0: B:37:0x006e->B:79:?]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa A[EDGE_INSN: B:56:0x00aa->B:57:0x00ab BREAK  A[LOOP:1: B:51:0x0096->B:82:?]] */
    public static final jrv a(List<? extends BetBuilderType> list, List<? extends EarlyGoalsType> list2, List<? extends UpType> list3, List<? extends BetType> list4) {
        boolean z;
        boolean z2;
        list4.getClass();
        boolean z3 = false;
        boolean z4 = (list == null || list.isEmpty() || list.contains(BetBuilderType.NO_LIMIT)) ? false : true;
        boolean z5 = (list2 == null || list2.isEmpty() || list2.contains(EarlyGoalsType.NO_LIMIT)) ? false : true;
        boolean z6 = (list3 == null || list3.isEmpty() || list3.contains(UpType.NO_LIMIT)) ? false : true;
        Set setV = ay0.V(new UpType[]{UpType.ALL_ONE_UP, UpType.LEAST_ONE_ONE_UP});
        Set setV2 = ay0.V(new UpType[]{UpType.ALL_TWO_UP, UpType.LEAST_ONE_TWO_UP});
        if (!z6) {
            z = false;
            break;
        }
        List<? extends UpType> list5 = list3 == null ? m2g.a : list3;
        if (list5 != null && list5.isEmpty()) {
            z = false;
            break;
        }
        Iterator<T> it = list5.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (setV.contains((UpType) it.next())) {
                z = true;
                break;
            }
        }
        if (!z6) {
            z2 = false;
            break;
        }
        if (list3 == null) {
            list3 = m2g.a;
        }
        if (list3 != null && list3.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator<T> it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if (setV2.contains((UpType) it2.next())) {
                z2 = true;
                break;
            }
        }
        if (z && z2) {
            z3 = true;
        }
        if (z4) {
            return jrv.a.a;
        }
        if (z5) {
            return jrv.b.a;
        }
        if (z3) {
            return jrv.c.a;
        }
        if (z) {
            return jrv.d.a;
        }
        return z2 ? jrv.f.a : new jrv.e(list4);
    }

    public static final rtv b(MissionRewardDto missionRewardDto) {
        missionRewardDto.getClass();
        int rewardType = missionRewardDto.getRewardType();
        if (rewardType != 1) {
            if (rewardType == 7) {
                return new rtv.c(missionRewardDto.getMultiplier(), missionRewardDto.getDays());
            }
            if (rewardType == 9) {
                return rtv.d.a;
            }
            if (rewardType == 10) {
                return new rtv.a(missionRewardDto.getPickAmount());
            }
            itf0.a aVar = itf0.a;
            aVar.q("MissionRewardMapper");
            aVar.n(hce0.a(missionRewardDto.getRewardType(), "Dropping reward with unknown rewardType="), new Object[0]);
            return null;
        }
        long rewardAmount = missionRewardDto.getRewardAmount();
        List<Integer> realSportBizTypeIdList = missionRewardDto.getRealSportBizTypeIdList();
        b.a aVar2 = b.b;
        ArrayList arrayList = new ArrayList(l48.r(realSportBizTypeIdList, 10));
        Iterator<T> it = realSportBizTypeIdList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            aVar2.getClass();
            arrayList.add(b.a.a(iIntValue));
        }
        List<Integer> instantVirtualBizTypeIdList = missionRewardDto.getInstantVirtualBizTypeIdList();
        c.a aVar3 = c.b;
        ArrayList arrayList2 = new ArrayList(l48.r(instantVirtualBizTypeIdList, 10));
        Iterator<T> it2 = instantVirtualBizTypeIdList.iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((Number) it2.next()).intValue();
            aVar3.getClass();
            arrayList2.add(c.a.a(iIntValue2));
        }
        List<Integer> gameBizTypeIdList = missionRewardDto.getGameBizTypeIdList();
        a.C0358a c0358a = a.b;
        ArrayList arrayList3 = new ArrayList(l48.r(gameBizTypeIdList, 10));
        Iterator<T> it3 = gameBizTypeIdList.iterator();
        while (it3.hasNext()) {
            int iIntValue3 = ((Number) it3.next()).intValue();
            c0358a.getClass();
            arrayList3.add(a.C0358a.a(iIntValue3));
        }
        return new rtv.b(rewardAmount, arrayList, arrayList2, arrayList3);
    }
}
