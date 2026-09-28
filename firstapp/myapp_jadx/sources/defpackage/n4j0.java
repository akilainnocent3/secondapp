package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.patron.DocumentAuditStatus;
import com.sporty.android.core.model.welcomereward.LoyaltyMetadata;
import com.sporty.android.core.model.welcomereward.LoyaltyMissionMetadata;
import com.sporty.android.core.model.welcomereward.LuckyWheelMetadata;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import com.sporty.android.core.model.welcomereward.NonFtdRewardType;
import com.sporty.android.core.model.welcomereward.NonFtdTaskType;
import com.sporty.android.core.model.welcomereward.Reward;
import com.sporty.android.core.model.welcomereward.Task;
import com.sporty.android.core.model.welcomereward.TierConfig;
import com.sportybet.android.gp.tz.R;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class n4j0 {
    public final psm a;
    public final mgb0 b;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NonFtdTaskType.values().length];
            try {
                iArr[NonFtdTaskType.REGISTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NonFtdTaskType.KYC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NonFtdTaskType.FIRST_TIME_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[NonFtdRewardType.values().length];
            try {
                iArr2[NonFtdRewardType.LOYALTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NonFtdRewardType.LUCKY_WHEEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NonFtdRewardType.LOYALTY_MISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NonFtdRewardType.LIVE_STREAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public n4j0(psm psmVar, mgb0 mgb0Var) {
        psmVar.getClass();
        mgb0Var.getClass();
        this.a = psmVar;
        this.b = mgb0Var;
    }

    public static ResourceUiText a(ZonedDateTime zonedDateTime) {
        long jBetween = ChronoUnit.SECONDS.between(ZonedDateTime.now(zonedDateTime.getZone()), zonedDateTime);
        if (jBetween <= 0) {
            return null;
        }
        int iCeil = (int) Math.ceil(jBetween / 86400.0d);
        if (iCeil <= 1) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.wap_home__one_day_left);
        }
        Object[] objArr = {Integer.valueOf(iCeil)};
        StringUiText stringUiText2 = vch0.a;
        return new ResourceUiText(R.string.wap_home__days_left, ay0.S(objArr));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085 A[PHI: r8
      0x0085: PHI (r8v5 com.sporty.android.core.model.welcomereward.Reward) = 
      (r8v4 com.sporty.android.core.model.welcomereward.Reward)
      (r8v4 com.sporty.android.core.model.welcomereward.Reward)
      (r8v8 com.sporty.android.core.model.welcomereward.Reward)
     binds: [B:22:0x0056, B:24:0x005c, B:35:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(NonFtdEngagement nonFtdEngagement, x1b x1bVar) {
        o4j0 o4j0Var;
        Object next;
        Reward reward;
        Reward reward2;
        String expiresAt;
        LuckyWheelMetadata luckyWheelMetadata;
        if (x1bVar instanceof o4j0) {
            o4j0Var = (o4j0) x1bVar;
            int i = o4j0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o4j0Var.d = i - Integer.MIN_VALUE;
            } else {
                o4j0Var = new o4j0(this, x1bVar);
            }
        } else {
            o4j0Var = new o4j0(this, x1bVar);
        }
        Object userCertStatus = o4j0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = o4j0Var.d;
        boolean z = true;
        if (i2 == 0) {
            uj50.b(userCertStatus);
            Iterator<T> it = nonFtdEngagement.getRewards().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Reward) next).getType() != NonFtdRewardType.LUCKY_WHEEL);
            reward = (Reward) next;
            if (reward == null || !reward.getUnlocked()) {
                if (reward != null || (luckyWheelMetadata = reward.getLuckyWheelMetadata()) == null) {
                    expiresAt = null;
                } else {
                    expiresAt = luckyWheelMetadata.getExpiresAt();
                }
                if (expiresAt != null) {
                    try {
                        ZonedDateTime zonedDateTime = ZonedDateTime.parse(expiresAt, DateTimeFormatter.ISO_DATE_TIME);
                        zonedDateTime.getClass();
                        return a(zonedDateTime);
                    } catch (Exception e) {
                        itf0.a aVar = itf0.a;
                        aVar.q("WelcomeRewardUiStateMapper");
                        aVar.a("getDaysLeftText failed with " + e + " - " + e.getMessage(), new Object[0]);
                        return null;
                    }
                }
            } else if (this.a.n()) {
                o4j0Var.a = reward;
                o4j0Var.d = 1;
                userCertStatus = this.b.getUserCertStatus(o4j0Var);
                if (userCertStatus == y5bVar) {
                    return y5bVar;
                }
                reward2 = reward;
            } else if (!z) {
                if (reward != null) {
                    expiresAt = null;
                } else {
                    expiresAt = null;
                }
                if (expiresAt != null) {
                    ZonedDateTime zonedDateTime2 = ZonedDateTime.parse(expiresAt, DateTimeFormatter.ISO_DATE_TIME);
                    zonedDateTime2.getClass();
                    return a(zonedDateTime2);
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        reward2 = o4j0Var.a;
        uj50.b(userCertStatus);
        if (((Number) userCertStatus).intValue() != 320) {
            reward = reward2;
        } else {
            reward = reward2;
            z = false;
        }
        if (!z) {
            if (reward != null) {
                expiresAt = null;
            } else {
                expiresAt = null;
            }
            if (expiresAt != null) {
                ZonedDateTime zonedDateTime3 = ZonedDateTime.parse(expiresAt, DateTimeFormatter.ISO_DATE_TIME);
                zonedDateTime3.getClass();
                return a(zonedDateTime3);
            }
        }
        return null;
    }

    public final ResourceUiText c() {
        AccountInfo accountInfoLastAccountInfo;
        psm psmVar = this.a;
        if (psmVar.x() && (accountInfoLastAccountInfo = this.b.lastAccountInfo()) != null) {
            long createTime = accountInfoLastAccountInfo.getCreateTime();
            if (createTime > 0) {
                try {
                    ZoneId zoneIdOf = ZoneId.of(psmVar.Y());
                    ZonedDateTime zonedDateTimeH = Instant.ofEpochMilli(createTime).atZone(zoneIdOf).m().e(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).M(LocalTime.MAX).H(zoneIdOf);
                    zonedDateTimeH.getClass();
                    return a(zonedDateTimeH);
                } catch (Exception e) {
                    itf0.a aVar = itf0.a;
                    aVar.q("WelcomeRewardUiStateMapper");
                    aVar.a("getRegistrationWeekDaysLeft failed with " + e + " - " + e.getMessage(), new Object[0]);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(NonFtdEngagement nonFtdEngagement, x1b x1bVar) {
        p4j0 p4j0Var;
        int i;
        int i2;
        int i3;
        UiText uiTextC;
        int i4;
        float f;
        int i5;
        float f2;
        int i6;
        boolean z;
        boolean z2;
        if (x1bVar instanceof p4j0) {
            p4j0Var = (p4j0) x1bVar;
            int i7 = p4j0Var.v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                p4j0Var.v = i7 - Integer.MIN_VALUE;
            } else {
                p4j0Var = new p4j0(this, x1bVar);
            }
        } else {
            p4j0Var = new p4j0(this, x1bVar);
        }
        Object obj = p4j0Var.f;
        Object obj2 = y5b.a;
        int i8 = p4j0Var.v;
        if (i8 == 0) {
            uj50.b(obj);
            int size = nonFtdEngagement.getTasks().size();
            List<Task> tasks = nonFtdEngagement.getTasks();
            if (tasks == null || !tasks.isEmpty()) {
                Iterator<T> it = tasks.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    if (((Task) it.next()).getCompleted() && (i9 = i9 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
                i = i9;
            } else {
                i = 0;
            }
            i2 = (!nonFtdEngagement.getEnabled() || size <= 0) ? 0 : 1;
            float f3 = i / size;
            List<Task> tasks2 = nonFtdEngagement.getTasks();
            if (tasks2 != null && tasks2.isEmpty()) {
                i3 = 1;
                break;
            }
            Iterator<T> it2 = tasks2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i3 = 1;
                    break;
                }
                if (!((Task) it2.next()).getCompleted()) {
                    i3 = 0;
                    break;
                }
            }
            uiTextC = c();
            if (uiTextC == null) {
                p4j0Var.a = size;
                p4j0Var.b = i;
                p4j0Var.c = i2;
                p4j0Var.e = f3;
                p4j0Var.d = i3;
                p4j0Var.v = 1;
                Object objB = b(nonFtdEngagement, p4j0Var);
                if (objB == obj2) {
                    return obj2;
                }
                i5 = size;
                f2 = f3;
                obj = objB;
                i6 = i3;
            } else {
                i4 = size;
                f = f3;
            }
            int i10 = i;
            UiText uiText = uiTextC;
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (i3 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new q1j0(z, i4, i10, f, uiText, z2);
        }
        if (i8 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i6 = p4j0Var.d;
        f2 = p4j0Var.e;
        i2 = p4j0Var.c;
        i = p4j0Var.b;
        i5 = p4j0Var.a;
        uj50.b(obj);
        uiTextC = (UiText) obj;
        i3 = i6;
        i4 = i5;
        f = f2;
        int i11 = i;
        UiText uiText2 = uiTextC;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i3 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new q1j0(z, i4, i11, f, uiText2, z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v27, types: [com.sporty.android.common_ui.uitext.UiText] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [n4j0] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v22 */
    public final Object e(NonFtdEngagement nonFtdEngagement, int i, int i2, x1b x1bVar) {
        q4j0 q4j0Var;
        int i3;
        dup aVar;
        ?? r13;
        ResourceUiText resourceUiText;
        String str;
        dup dupVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        ResourceUiText resourceUiText2;
        dup dupVar2;
        String str2;
        List list2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ResourceUiText resourceUiText3;
        int i4;
        Object resourceUiText4;
        String str3;
        boolean z;
        or50 dVar;
        or50 aVar2;
        String maxPrizeAmount;
        Long lS0;
        String depositAmount;
        String maxPrizeAmount2;
        TierConfig tierConfig;
        Float game;
        TierConfig tierConfig2;
        Float instantWin;
        TierConfig tierConfig3;
        Float realSport;
        w5f0 w5f0Var;
        ResourceUiText resourceUiText5;
        int i5;
        if (x1bVar instanceof q4j0) {
            q4j0Var = (q4j0) x1bVar;
            int i6 = q4j0Var.w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                q4j0Var.w = i6 - Integer.MIN_VALUE;
            } else {
                q4j0Var = new q4j0(this, x1bVar);
            }
        } else {
            q4j0Var = new q4j0(this, x1bVar);
        }
        Object obj = q4j0Var.i;
        y5b y5bVar = y5b.a;
        int i7 = q4j0Var.w;
        ds50 ds50Var = null;
        int i8 = 1;
        if (i7 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiTextC = c();
            List<Task> tasks = nonFtdEngagement.getTasks();
            ArrayList arrayList5 = new ArrayList();
            Iterator it = tasks.iterator();
            while (true) {
                int i9 = 2;
                if (it.hasNext()) {
                    Task task = (Task) it.next();
                    NonFtdTaskType type = task.getType();
                    if (type == null) {
                        w5f0Var = null;
                    } else {
                        boolean completed = task.getCompleted();
                        int[] iArr = a.a;
                        int i10 = iArr[type.ordinal()];
                        if (i10 == 1) {
                            StringUiText stringUiText = vch0.a;
                            resourceUiText5 = new ResourceUiText(R.string.wap_home__welcome_challenge_register_title);
                        } else if (i10 == 2) {
                            StringUiText stringUiText2 = vch0.a;
                            resourceUiText5 = new ResourceUiText(R.string.wap_home__welcome_challenge_kyc_title);
                        } else {
                            if (i10 != 3) {
                                uhc.a();
                                return null;
                            }
                            StringUiText stringUiText3 = vch0.a;
                            resourceUiText5 = new ResourceUiText(R.string.wap_home__welcome_challenge_deposit_title);
                        }
                        int i11 = iArr[type.ordinal()];
                        if (i11 == 1) {
                            i5 = R.drawable.ic_verify_bet;
                        } else if (i11 == 2) {
                            i5 = R.drawable.ic_verify;
                        } else {
                            if (i11 != 3) {
                                uhc.a();
                                return null;
                            }
                            i5 = R.drawable.ic_balance;
                        }
                        w5f0Var = new w5f0(completed, type, resourceUiText5, i5);
                    }
                    if (w5f0Var != null) {
                        arrayList5.add(w5f0Var);
                    }
                } else {
                    List<Task> tasks2 = nonFtdEngagement.getTasks();
                    if (tasks2 == null || !tasks2.isEmpty()) {
                        Iterator it2 = tasks2.iterator();
                        i3 = 0;
                        while (it2.hasNext()) {
                            if (((Task) it2.next()).getCompleted() && (i3 = i3 + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    } else {
                        i3 = 0;
                    }
                    String strA = n36.a("(", i3, nonFtdEngagement.getTasks().size(), "/", ")");
                    List<Reward> rewards = nonFtdEngagement.getRewards();
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it3 = rewards.iterator();
                    while (true) {
                        boolean zHasNext = it3.hasNext();
                        psm psmVar = this.a;
                        if (!zHasNext) {
                            ds50 ds50Var2 = ds50Var;
                            if (psmVar.x() && i2 == DocumentAuditStatus.SUBMITTED.getValue()) {
                                StringUiText stringUiText4 = vch0.a;
                                aVar = new dup.a(new ResourceUiText(R.string.wap_home__kyc_banner_verifying1));
                            } else {
                                aVar = dup.b.a;
                            }
                            StringUiText stringUiText5 = vch0.a;
                            List listK = b.k(new tcf0.b(new ResourceUiText(R.string.wap_home__reward_tc_one)), new tcf0.a(new ResourceUiText(R.string.wap_home__reward_tc_two), new ResourceUiText(R.string.wap_home__more_details)), new tcf0.b(new ResourceUiText(R.string.wap_home__reward_tc_three)), new tcf0.b(new ResourceUiText(R.string.wap_home__reward_tc_four)), new tcf0.b(new ResourceUiText(R.string.wap_home__reward_tc_five, ay0.S(new Object[]{24, 48}))));
                            if (resourceUiTextC == null) {
                                q4j0Var.a = resourceUiTextC;
                                q4j0Var.b = arrayList5;
                                q4j0Var.c = strA;
                                q4j0Var.d = arrayList6;
                                q4j0Var.e = aVar;
                                q4j0Var.f = listK;
                                q4j0Var.w = 1;
                                Object objB = b(nonFtdEngagement, q4j0Var);
                                if (objB != y5bVar) {
                                    resourceUiText2 = resourceUiTextC;
                                    dupVar2 = aVar;
                                    obj = objB;
                                    str2 = strA;
                                    list2 = listK;
                                    arrayList3 = arrayList5;
                                    arrayList4 = arrayList6;
                                    break;
                                }
                                return y5bVar;
                            }
                            r13 = ds50Var2;
                            resourceUiText = resourceUiTextC;
                            str = strA;
                            dupVar = aVar;
                            arrayList = arrayList5;
                            arrayList2 = arrayList6;
                            list = listK;
                            return new m4j0(arrayList, str, arrayList2, dupVar, list, (UiText) r13, resourceUiText, 128);
                        }
                        Reward reward = (Reward) it3.next();
                        NonFtdRewardType type2 = reward.getType();
                        if (type2 == null) {
                            ds50Var = ds50Var;
                        } else {
                            LoyaltyMetadata loyaltyMetadata = reward.getLoyaltyMetadata();
                            float fFloatValue = 0.0f;
                            float fFloatValue2 = (loyaltyMetadata == null || (tierConfig3 = loyaltyMetadata.getTierConfig()) == null || (realSport = tierConfig3.getRealSport()) == null) ? 0.0f : realSport.floatValue();
                            LoyaltyMetadata loyaltyMetadata2 = reward.getLoyaltyMetadata();
                            float fFloatValue3 = (loyaltyMetadata2 == null || (tierConfig2 = loyaltyMetadata2.getTierConfig()) == null || (instantWin = tierConfig2.getInstantWin()) == null) ? 0.0f : instantWin.floatValue();
                            LoyaltyMetadata loyaltyMetadata3 = reward.getLoyaltyMetadata();
                            if (loyaltyMetadata3 != null && (tierConfig = loyaltyMetadata3.getTierConfig()) != null && (game = tierConfig.getGame()) != null) {
                                fFloatValue = game.floatValue();
                            }
                            float f = fFloatValue;
                            float fMax = Math.max(Math.max(fFloatValue2, fFloatValue3), f);
                            int[] iArr2 = a.b;
                            int i12 = iArr2[type2.ordinal()];
                            if (i12 == i8) {
                                StringUiText stringUiText6 = vch0.a;
                                resourceUiText3 = new ResourceUiText(R.string.wap_home__get_your_bets_back);
                            } else if (i12 == i9) {
                                StringUiText stringUiText7 = vch0.a;
                                resourceUiText3 = new ResourceUiText(R.string.wap_home__free_lucky_spin);
                            } else if (i12 == 3) {
                                StringUiText stringUiText8 = vch0.a;
                                resourceUiText3 = new ResourceUiText(R.string.wap_home__welcome_mission);
                            } else {
                                if (i12 != 4) {
                                    uhc.a();
                                    return ds50Var;
                                }
                                StringUiText stringUiText9 = vch0.a;
                                resourceUiText3 = new ResourceUiText(R.string.wap_home__free_live_streams);
                            }
                            int i13 = iArr2[type2.ordinal()];
                            if (i13 != i8) {
                                i4 = i8;
                                if (i13 == 2) {
                                    LuckyWheelMetadata luckyWheelMetadata = reward.getLuckyWheelMetadata();
                                    String strB = psmVar.B();
                                    ResourceUiText resourceUiText6 = new ResourceUiText(R.string.wap_home__reward_lw_content1, ay0.S(new Object[]{(luckyWheelMetadata == null || (maxPrizeAmount2 = luckyWheelMetadata.getMaxPrizeAmount()) == null) ? "" : maxPrizeAmount2, strB}));
                                    StringUiText stringUiText10 = new StringUiText(yFmFZvuWxAYfEj.sYGKZITABbnk);
                                    if (luckyWheelMetadata == 0 || (depositAmount = luckyWheelMetadata.getDepositAmount()) == null) {
                                        depositAmount = "";
                                    }
                                    ResourceUiText resourceUiText7 = new ResourceUiText(R.string.wap_home__reward_lw_content2, ay0.S(new Object[]{depositAmount, strB}));
                                    UiText[] uiTextArr = new UiText[3];
                                    uiTextArr[0] = resourceUiText6;
                                    uiTextArr[i4] = stringUiText10;
                                    uiTextArr[2] = resourceUiText7;
                                    resourceUiText4 = new ConcatUiText(uiTextArr);
                                } else if (i13 == 3) {
                                    resourceUiText4 = new ResourceUiText(R.string.wap_home__explore_missions);
                                } else {
                                    if (i13 != 4) {
                                        uhc.a();
                                        return ds50Var;
                                    }
                                    resourceUiText4 = new ResourceUiText(R.string.wap_home__reward_live_stream_content);
                                }
                            } else {
                                i4 = i8;
                                resourceUiText4 = new ResourceUiText(R.string.wap_home__reward_loyalty_content, ay0.S(new Object[]{fMax + "%"}));
                            }
                            int i14 = iArr2[type2.ordinal()];
                            if (i14 == i4) {
                                str3 = "https://s.sporty.net/cms/img_welcome_reward_trophy_d521a64658.png";
                            } else if (i14 == 2) {
                                str3 = "https://s.sporty.net/cms/img_welcome_reward_lw_71047cb66a.png";
                            } else if (i14 == 3) {
                                str3 = "https://s.sporty.net/cms/img_welcome_reward_mission_47f0bf87c8.png";
                            } else {
                                if (i14 != 4) {
                                    uhc.a();
                                    return ds50Var;
                                }
                                str3 = "https://s.sporty.net/cms/img_welcome_reward_live_677b0a323f.png";
                            }
                            String str4 = str3;
                            if (iArr2[type2.ordinal()] == 2 && psmVar.n()) {
                                z = i != 330 && reward.getUnlocked();
                            } else {
                                boolean unlocked = reward.getUnlocked();
                                z = unlocked;
                            }
                            int i15 = iArr2[type2.ordinal()];
                            if (i15 != 1) {
                                if (i15 == 2) {
                                    LuckyWheelMetadata luckyWheelMetadata2 = reward.getLuckyWheelMetadata();
                                    aVar2 = new or50.a(luckyWheelMetadata2 != null ? luckyWheelMetadata2.getLuckyWheelType() : ds50Var);
                                } else if (i15 == 3) {
                                    String strB2 = psmVar.B();
                                    LoyaltyMissionMetadata loyaltyMissionMetadata = reward.getLoyaltyMissionMetadata();
                                    aVar2 = new or50.b(oxc.a(strB2, " ", bjb0.V((loyaltyMissionMetadata == null || (maxPrizeAmount = loyaltyMissionMetadata.getMaxPrizeAmount()) == null || (lS0 = StringsKt.s0(maxPrizeAmount)) == null) ? 0L : lS0.longValue())));
                                } else {
                                    if (i15 != 4) {
                                        uhc.a();
                                        return ds50Var;
                                    }
                                    aVar2 = or50.c.a;
                                }
                                dVar = aVar2;
                            } else {
                                dVar = new or50.d(b.k(new jx30(new ResourceUiText(R.string.wap_home__rakeback_sport), fFloatValue2), new jx30(new ResourceUiText(R.string.wap_home__rakeback_virtual), fFloatValue3), new jx30(new ResourceUiText(R.string.wap_home__rakeback_games), f)));
                            }
                            ds50Var = new ds50(resourceUiText3, resourceUiText4, str4, type2, z, dVar);
                        }
                        if (ds50Var != null) {
                            arrayList6.add(ds50Var);
                        }
                        ds50Var = ds50Var;
                        it3 = it3;
                        i8 = 1;
                        i9 = 2;
                    }
                }
            }
        } else {
            if (i7 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = q4j0Var.f;
            dupVar2 = q4j0Var.e;
            arrayList4 = q4j0Var.d;
            str2 = q4j0Var.c;
            arrayList3 = q4j0Var.b;
            resourceUiText2 = q4j0Var.a;
            uj50.b(obj);
        }
        list = list2;
        r13 = (UiText) obj;
        resourceUiText = resourceUiText2;
        dupVar = dupVar2;
        arrayList2 = arrayList4;
        str = str2;
        arrayList = arrayList3;
        return new m4j0(arrayList, str, arrayList2, dupVar, list, (UiText) r13, resourceUiText, 128);
    }
}
