package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.loyalty.BetType;
import com.sporty.android.core.model.loyalty.LoyaltyMissionTaskType;
import com.sporty.android.core.model.loyalty.MissionProgressDto;
import com.sporty.android.core.model.loyalty.MissionPublishState;
import com.sporty.android.core.model.loyalty.MissionStatus;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public final class mwv implements lwv {
    public final uti a;
    public final eg50 b;
    public final psm c;
    public final ytv d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[wwv.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                wwv wwvVar = wwv.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                wwv wwvVar2 = wwv.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                wwv wwvVar3 = wwv.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                wwv wwvVar4 = wwv.a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                wwv wwvVar5 = wwv.a;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[qtv.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                qtv qtvVar = qtv.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                qtv qtvVar2 = qtv.a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                qtv qtvVar3 = qtv.a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[LoyaltyMissionTaskType.values().length];
            try {
                iArr3[LoyaltyMissionTaskType.BET_TOTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[LoyaltyMissionTaskType.DEPOSIT_TOTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[LoyaltyMissionTaskType.PURCHASE_PAY_TOTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[LoyaltyMissionTaskType.PLACE_TOTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            a = iArr3;
            int[] iArr4 = new int[ctv.values().length];
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                ctv ctvVar = ctv.a;
                iArr4[2] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                ctv ctvVar2 = ctv.a;
                iArr4[3] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr5 = new int[BetType.values().length];
            try {
                iArr5[BetType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[BetType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[BetType.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            b = iArr5;
        }
    }

    public mwv(uti utiVar, eg50 eg50Var, psm psmVar, ytv ytvVar) {
        psmVar.getClass();
        this.a = utiVar;
        this.b = eg50Var;
        this.c = psmVar;
        this.d = ytvVar;
    }

    public static dtv e(double d, double d2, UiText uiText, long j) {
        ctv ctvVar;
        ResourceUiText resourceUiText;
        float fD = d2 > 0.0d ? f.d((float) (d / d2), 0.0f, 1.0f) : 0.0f;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        long j2 = j - 86400000;
        long j3 = j - 172800000;
        if (fD >= 1.0f) {
            ctvVar = ctv.a;
        } else if (fD >= 0.8f && fD < 1.0f) {
            ctvVar = ctv.b;
        } else if (fD >= 0.8f || j2 > timeInMillis || timeInMillis >= j) {
            ctvVar = (fD >= 0.8f || j3 > timeInMillis || timeInMillis >= j2) ? ctv.e : ctv.d;
        } else {
            ctvVar = ctv.c;
        }
        int iOrdinal = ctvVar.ordinal();
        if (iOrdinal == 1) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_loyalty__almost_there);
        } else if (iOrdinal == 2) {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_loyalty__within_one_day_reminder);
        } else if (iOrdinal != 3) {
            resourceUiText = null;
        } else {
            StringUiText stringUiText3 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_loyalty__close_to_end_date_keep_going, ay0.S(new Object[]{2}));
        }
        return new dtv(uiText, fD, ctvVar, resourceUiText);
    }

    public static bxg0 h(wwv wwvVar, int i, Set set, Map map, boolean z) {
        uxs uxsVar;
        if (!z) {
            uxs uxsVar2 = uxs.ENABLE;
            Boolean bool = Boolean.TRUE;
            StringUiText stringUiText = vch0.a;
            return new bxg0(uxsVar2, bool, new ResourceUiText(R.string.page_loyalty__login_to_join));
        }
        boolean zContains = set.contains(Integer.valueOf(i));
        int iOrdinal = wwvVar.ordinal();
        if (iOrdinal == 0) {
            return new bxg0(uxs.DISABLE, Boolean.FALSE, vch0.a);
        }
        if (iOrdinal == 1) {
            if (zContains) {
                uxsVar = uxs.LOADING;
            } else {
                uxsVar = (uxs) map.get(Integer.valueOf(i));
                if (uxsVar == null) {
                    uxsVar = uxs.ENABLE;
                }
            }
            Boolean bool2 = Boolean.TRUE;
            StringUiText stringUiText2 = vch0.a;
            return new bxg0(uxsVar, bool2, new ResourceUiText(R.string.page_loyalty__start));
        }
        if (iOrdinal == 2) {
            uxs uxsVar3 = uxs.DISABLE;
            Boolean bool3 = Boolean.TRUE;
            StringUiText stringUiText3 = vch0.a;
            return new bxg0(uxsVar3, bool3, new ResourceUiText(R.string.page_loyalty__start));
        }
        if (iOrdinal == 3) {
            uxs uxsVar4 = uxs.DISABLE;
            Boolean bool4 = Boolean.FALSE;
            StringUiText stringUiText4 = vch0.a;
            return new bxg0(uxsVar4, bool4, new ResourceUiText(R.string.page_loyalty__upcoming));
        }
        if (iOrdinal == 4) {
            return new bxg0(uxs.DISABLE, Boolean.FALSE, vch0.a);
        }
        if (iOrdinal != 5) {
            uhc.a();
            return null;
        }
        uxs uxsVar5 = uxs.DISABLE;
        Boolean bool5 = Boolean.TRUE;
        StringUiText stringUiText5 = vch0.a;
        return new bxg0(uxsVar5, bool5, new ResourceUiText(R.string.page_loyalty__expired));
    }

    public static UiText i(Long l, long j, wwv wwvVar) {
        if (l != null && (wwvVar == wwv.b || wwvVar == wwv.d || wwvVar == wwv.c)) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_loyalty__mission_end_time);
        }
        String strN = bwf0.n(j);
        StringUiText stringUiText2 = vch0.a;
        return new StringUiText(strN);
    }

    public static ResourceUiText j(Long l, long j, wwv wwvVar) {
        if (l != null && (wwvVar == wwv.b || wwvVar == wwv.d || wwvVar == wwv.c)) {
            int i = l.longValue() > 1 ? R.string.common_dates__days_lowercase : R.string.common_dates__day_lowercase;
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_loyalty__days_to_complete_vdays, ay0.S(new Object[]{new ConcatUiText(new UiText[]{vch0.d(String.valueOf(l.longValue())), new StringUiText(" "), new ResourceUiText(i)})}));
        }
        Date date = new Date(j);
        Locale locale = Locale.US;
        locale.getClass();
        Object[] objArr = {bwf0.l(date, "dd MMM", locale, 0, 0)};
        StringUiText stringUiText2 = vch0.a;
        return new ResourceUiText(R.string.page_loyalty__ends_till_vdatetime, ay0.S(objArr));
    }

    public static wwv k(MissionPublishState missionPublishState, MissionStatus missionStatus, boolean z, boolean z2, boolean z3) {
        missionPublishState.getClass();
        if (!z3) {
            return wwv.b;
        }
        MissionPublishState missionPublishState2 = MissionPublishState.PUBLISHED;
        if (missionPublishState == missionPublishState2 && missionStatus == MissionStatus.IN_PROGRESS) {
            return wwv.a;
        }
        if (missionStatus == MissionStatus.COMPLETED) {
            return wwv.e;
        }
        if (missionPublishState == MissionPublishState.UNPUBLISHED || missionStatus == MissionStatus.EXPIRED) {
            return wwv.f;
        }
        if (z2 && missionStatus == null && missionPublishState == missionPublishState2) {
            return wwv.a;
        }
        if (missionPublishState == MissionPublishState.PRE_PUBLISHED) {
            return wwv.d;
        }
        if (missionPublishState != missionPublishState2 || z) {
            return missionPublishState == missionPublishState2 ? wwv.b : wwv.b;
        }
        return wwv.c;
    }

    public static ConcatUiText l() {
        StringUiText stringUiText = vch0.a;
        return new ConcatUiText(new UiText[]{new ResourceUiText(R.string.component_betslip__single), new StringUiText(" / "), new ResourceUiText(R.string.component_betslip__multiple), new StringUiText(" / "), new ResourceUiText(R.string.component_betslip__system)});
    }

    public static ConcatUiText n(double d) {
        String strA = m58.a((int) d, " ");
        StringUiText stringUiText = vch0.a;
        return ygh.a(R.string.page_loyalty__bets, new StringUiText(strA));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0086 -> B:21:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.lwv
    public final java.lang.Object a(java.util.List r11, java.util.Map r12, java.util.Set r13, boolean r14, defpackage.x1b r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.twv
            if (r0 == 0) goto L13
            r0 = r15
            twv r0 = (defpackage.twv) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            twv r0 = new twv
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.i
            y5b r1 = defpackage.y5b.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3e
            boolean r11 = r0.f
            java.util.Collection r12 = r0.e
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.Iterator r13 = r0.d
            java.util.Collection r14 = r0.c
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.Set r2 = r0.b
            java.util.Set r2 = (java.util.Set) r2
            java.util.Map r4 = r0.a
            defpackage.uj50.b(r15)
            r8 = r11
            r9 = r0
            r7 = r2
            r6 = r4
            r4 = r10
            goto L87
        L3e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            r10 = 0
            return r10
        L45:
            defpackage.uj50.b(r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.l48.r(r11, r2)
            r15.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
            r6 = r12
            r7 = r13
            r8 = r14
            r12 = r15
            r9 = r0
            r13 = r11
        L5d:
            boolean r11 = r13.hasNext()
            if (r11 == 0) goto L8f
            java.lang.Object r11 = r13.next()
            r5 = r11
            osv r5 = (defpackage.osv) r5
            r9.a = r6
            r11 = r7
            java.util.Set r11 = (java.util.Set) r11
            r9.b = r11
            r11 = r12
            java.util.Collection r11 = (java.util.Collection) r11
            r9.c = r11
            r9.d = r13
            r9.e = r11
            r9.f = r8
            r9.w = r3
            r4 = r10
            java.lang.Object r15 = r4.o(r5, r6, r7, r8, r9)
            if (r15 != r1) goto L86
            return r1
        L86:
            r14 = r12
        L87:
            kwv r15 = (defpackage.kwv) r15
            r12.add(r15)
            r12 = r14
            r10 = r4
            goto L5d
        L8f:
            java.util.List r12 = (java.util.List) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwv.a(java.util.List, java.util.Map, java.util.Set, boolean, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0086 -> B:21:0x0087). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.lwv
    public final java.lang.Object b(java.util.List r11, java.util.Map r12, java.util.Set r13, boolean r14, defpackage.x1b r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.uwv
            if (r0 == 0) goto L13
            r0 = r15
            uwv r0 = (defpackage.uwv) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            uwv r0 = new uwv
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.i
            y5b r1 = defpackage.y5b.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3e
            boolean r11 = r0.f
            java.util.Collection r12 = r0.e
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.Iterator r13 = r0.d
            java.util.Collection r14 = r0.c
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.Set r2 = r0.b
            java.util.Set r2 = (java.util.Set) r2
            java.util.Map r4 = r0.a
            defpackage.uj50.b(r15)
            r8 = r11
            r9 = r0
            r7 = r2
            r6 = r4
            r4 = r10
            goto L87
        L3e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            r10 = 0
            return r10
        L45:
            defpackage.uj50.b(r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.l48.r(r11, r2)
            r15.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
            r6 = r12
            r7 = r13
            r8 = r14
            r12 = r15
            r9 = r0
            r13 = r11
        L5d:
            boolean r11 = r13.hasNext()
            if (r11 == 0) goto L8f
            java.lang.Object r11 = r13.next()
            r5 = r11
            qlw r5 = (defpackage.qlw) r5
            r9.a = r6
            r11 = r7
            java.util.Set r11 = (java.util.Set) r11
            r9.b = r11
            r11 = r12
            java.util.Collection r11 = (java.util.Collection) r11
            r9.c = r11
            r9.d = r13
            r9.e = r11
            r9.f = r8
            r9.w = r3
            r4 = r10
            java.lang.Object r15 = r4.p(r5, r6, r7, r8, r9)
            if (r15 != r1) goto L86
            return r1
        L86:
            r14 = r12
        L87:
            kwv r15 = (defpackage.kwv) r15
            r12.add(r15)
            r12 = r14
            r10 = r4
            goto L5d
        L8f:
            java.util.List r12 = (java.util.List) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwv.b(java.util.List, java.util.Map, java.util.Set, boolean, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Double d, String str, double d2, qtv qtvVar, long j, x1b x1bVar) {
        nwv nwvVar;
        double d3;
        UiText uiTextN;
        UiText uiText;
        double d4;
        double d5;
        if (x1bVar instanceof nwv) {
            nwvVar = (nwv) x1bVar;
            int i = nwvVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nwvVar.f = i - Integer.MIN_VALUE;
            } else {
                nwvVar = new nwv(this, x1bVar);
            }
        } else {
            nwvVar = new nwv(this, x1bVar);
        }
        Object objG = nwvVar.d;
        Object obj = y5b.a;
        int i2 = nwvVar.f;
        if (i2 == 0) {
            uj50.b(objG);
            if (d == null) {
                return null;
            }
            double dDoubleValue = d.doubleValue();
            int iOrdinal = qtvVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                nwvVar.a = d2;
                nwvVar.c = j;
                nwvVar.b = dDoubleValue;
                nwvVar.f = 1;
                objG = g(d2, str, nwvVar);
                if (objG == obj) {
                    return obj;
                }
                d3 = dDoubleValue;
            } else {
                if (iOrdinal == 2) {
                    uiTextN = n(d2);
                } else {
                    if (iOrdinal != 3) {
                        uhc.a();
                        return null;
                    }
                    uiTextN = vch0.a;
                }
                uiText = uiTextN;
                d4 = d2;
                d5 = dDoubleValue;
            }
            return e(d5, d4, uiText, j);
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d3 = nwvVar.b;
        j = nwvVar.c;
        d2 = nwvVar.a;
        uj50.b(objG);
        d5 = d3;
        uiText = (UiText) objG;
        d4 = d2;
        return e(d5, d4, uiText, j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Double d, String str, double d2, LoyaltyMissionTaskType loyaltyMissionTaskType, long j, x1b x1bVar) {
        owv owvVar;
        double d3;
        double d4;
        double d5;
        UiText uiTextN;
        if (x1bVar instanceof owv) {
            owvVar = (owv) x1bVar;
            int i = owvVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                owvVar.f = i - Integer.MIN_VALUE;
            } else {
                owvVar = new owv(this, x1bVar);
            }
        } else {
            owvVar = new owv(this, x1bVar);
        }
        Object objG = owvVar.d;
        Object obj = y5b.a;
        int i2 = owvVar.f;
        if (i2 == 0) {
            uj50.b(objG);
            if (d == null) {
                return null;
            }
            double dDoubleValue = d.doubleValue();
            int i3 = a.a[loyaltyMissionTaskType.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                owvVar.a = d2;
                owvVar.c = j;
                owvVar.b = dDoubleValue;
                owvVar.f = 1;
                objG = g(d2, str, owvVar);
                if (objG == obj) {
                    return obj;
                }
                d3 = dDoubleValue;
            } else {
                d4 = d2;
                d5 = dDoubleValue;
                uiTextN = i3 != 4 ? vch0.a : n(d2);
            }
            return e(d5, d4, uiTextN, j);
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d3 = owvVar.b;
        j = owvVar.c;
        d2 = owvVar.a;
        uj50.b(objG);
        d5 = d3;
        uiTextN = (UiText) objG;
        d4 = d2;
        return e(d5, d4, uiTextN, j);
    }

    public final ArrayList f(String str, jrv jrvVar, Double d, Double d2, Boolean bool, Boolean bool2) {
        UiText uiTextL;
        int i;
        ArrayList arrayList = new ArrayList();
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__bet_type);
        if (Intrinsics.g(jrvVar, jrv.a.a)) {
            uiTextL = new ResourceUiText(R.string.page_loyalty__bet_builder);
        } else if (Intrinsics.g(jrvVar, jrv.b.a)) {
            uiTextL = new ResourceUiText(R.string.page_loyalty__early_goals);
        } else if (Intrinsics.g(jrvVar, jrv.c.a)) {
            uiTextL = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.page_loyalty__one_up), new StringUiText(" / "), new ResourceUiText(R.string.page_loyalty__two_up)});
        } else if (Intrinsics.g(jrvVar, jrv.d.a)) {
            uiTextL = new ResourceUiText(R.string.page_loyalty__one_up);
        } else if (Intrinsics.g(jrvVar, jrv.f.a)) {
            uiTextL = new ResourceUiText(R.string.page_loyalty__two_up);
        } else {
            if (!(jrvVar instanceof jrv.e)) {
                uhc.a();
                return null;
            }
            List<BetType> list = ((jrv.e) jrvVar).a;
            if (list.isEmpty()) {
                uiTextL = l();
            } else {
                ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i2 = a.b[((BetType) it.next()).ordinal()];
                    if (i2 == 1) {
                        i = R.string.component_betslip__single;
                    } else if (i2 == 2) {
                        i = R.string.component_betslip__multiple;
                    } else {
                        if (i2 != 3) {
                            uhc.a();
                            return null;
                        }
                        i = R.string.component_betslip__system;
                    }
                    arrayList2.add(new ResourceUiText(i));
                }
                if (arrayList2.isEmpty()) {
                    uiTextL = l();
                } else {
                    StringUiText stringUiText2 = vch0.a;
                    Iterator it2 = t38.a(arrayList2, new StringUiText(" / ")).iterator();
                    if (!it2.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = ((UiText) next).h((UiText) it2.next());
                    }
                    uiTextL = (UiText) next;
                }
            }
        }
        arrayList.add(new yuv(resourceUiText, uiTextL, jrvVar instanceof jrv.e ? zuv.b.a : zuv.c.a));
        if (d != null) {
            try {
                String strD = s5y.d(Double.valueOf(d.doubleValue()));
                arrayList.add(new yuv(new ResourceUiText(R.string.page_loyalty__minimum_stake_per_bet), this.c.F() ? new ResourceUiText(R.string.page_loyalty__minimum_vstake_per_bet, ay0.S(new Object[]{strD, str})) : new ResourceUiText(R.string.page_loyalty__minimum_vstake_per_bet, ay0.S(new Object[]{str, strD}))));
            } catch (Exception e) {
                itf0.a.d("Error parsing minStake in rules: " + e, new Object[0]);
                Unit unit = Unit.a;
            }
        }
        if (d2 != null) {
            try {
                arrayList.add(new yuv(new ResourceUiText(R.string.page_loyalty__total_odds_per_bet), new ResourceUiText(R.string.page_loyalty__total_vodds_per_bet, ay0.S(new Object[]{gky.a.b(d2.doubleValue(), true)}))));
            } catch (Exception e2) {
                itf0.a.d("Error parsing minTotalOdd in rules: " + e2, new Object[0]);
                Unit unit2 = Unit.a;
            }
        }
        if (bool != null) {
            arrayList.add(new yuv(new ResourceUiText(R.string.page_loyalty__gift_usage), new ResourceUiText(bool.booleanValue() ? R.string.page_loyalty__bet_with_gift : R.string.page_loyalty__bet_without_gift)));
        }
        if (bool2 != null && !bool2.booleanValue()) {
            arrayList.add(new yuv(new ResourceUiText(R.string.page_loyalty__cash_out), new ResourceUiText(R.string.page_loyalty__can_not_cash_out)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(double d, String str, x1b x1bVar) {
        pwv pwvVar;
        if (x1bVar instanceof pwv) {
            pwvVar = (pwv) x1bVar;
            int i = pwvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pwvVar.c = i - Integer.MIN_VALUE;
            } else {
                pwvVar = new pwv(this, x1bVar);
            }
        } else {
            pwvVar = new pwv(this, x1bVar);
        }
        pwv pwvVar2 = pwvVar;
        Object objG = pwvVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = pwvVar2.c;
        if (i2 == 0) {
            uj50.b(objG);
            String strE = s5y.e(new Double(d));
            pwvVar2.c = 1;
            objG = uti.g(this.a, strE, str, true, pwvVar2, 16);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objG);
        }
        return vch0.d((CharSequence) objG);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object m(yvv yvvVar, String str, wwv wwvVar, long j, x1b x1bVar) {
        qwv qwvVar;
        s5f0 aVar;
        String str2;
        if (x1bVar instanceof qwv) {
            qwvVar = (qwv) x1bVar;
            int i = qwvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qwvVar.d = i - Integer.MIN_VALUE;
            } else {
                qwvVar = new qwv(this, x1bVar);
            }
        } else {
            qwvVar = new qwv(this, x1bVar);
        }
        qwv qwvVar2 = qwvVar;
        Object objD = qwvVar2.b;
        Object obj = y5b.a;
        int i2 = qwvVar2.d;
        if (i2 == 0) {
            uj50.b(objD);
            wwvVar.getClass();
            if (wwvVar == wwv.a) {
                LoyaltyMissionTaskType loyaltyMissionTaskType = yvvVar.a;
                if (loyaltyMissionTaskType == LoyaltyMissionTaskType.VERIFY_EMAIL) {
                    aVar = new s5f0.a(yvvVar.o == MissionStatus.COMPLETED);
                } else {
                    Double d = yvvVar.p;
                    double d2 = yvvVar.c;
                    qwvVar2.a = yvvVar;
                    qwvVar2.d = 1;
                    objD = d(d, str, d2, loyaltyMissionTaskType, j, qwvVar2);
                    if (objD == obj) {
                        return obj;
                    }
                }
            } else {
                aVar = s5f0.b.a;
            }
            String str3 = yvvVar.b;
            str2 = yvvVar.d;
            if (str2 == null) {
                str2 = "";
            }
            return new r5f0(str3, aVar, str2);
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yvv yvvVar2 = qwvVar2.a;
        uj50.b(objD);
        yvvVar = yvvVar2;
        dtv dtvVar = (dtv) objD;
        aVar = dtvVar != null ? new s5f0.c(dtvVar) : s5f0.b.a;
        String str4 = yvvVar.b;
        str2 = yvvVar.d;
        if (str2 == null) {
            str2 = "";
        }
        return new r5f0(str4, aVar, str2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0115  */
    /* JADX WARN: Code duplicated, block: B:33:0x014b  */
    /* JADX WARN: Code duplicated, block: B:34:0x014d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0152  */
    /* JADX WARN: Code duplicated, block: B:39:0x0156  */
    /* JADX WARN: Code duplicated, block: B:42:0x015c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0166  */
    /* JADX WARN: Code duplicated, block: B:47:0x019e  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0215  */
    /* JADX WARN: Code duplicated, block: B:55:0x0244  */
    /* JADX WARN: Code duplicated, block: B:56:0x0247  */
    /* JADX WARN: Code duplicated, block: B:58:0x024b  */
    /* JADX WARN: Code duplicated, block: B:59:0x024e  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object o(osv osvVar, Map map, Set set, boolean z, x1b x1bVar) {
        rwv rwvVar;
        Map map2;
        boolean z2;
        Object obj;
        Set set2;
        Set set3;
        osv osvVar2;
        boolean z3;
        String str;
        Map map3;
        ytv.a aVar;
        int i;
        MissionProgressDto missionProgressDto;
        MissionStatus status;
        wwv wwvVarK;
        uxs uxsVar;
        UiText uiText;
        String str2;
        String str3;
        List<cuv> list;
        String str4;
        String strN;
        UiText uiTextI;
        ResourceUiText resourceUiTextJ;
        int i2;
        int i3;
        String strN2;
        int i4;
        String str5;
        int i5;
        boolean z4;
        ArrayList arrayListF;
        Double d;
        wwv wwvVar;
        int i6;
        String str6;
        String str7;
        UiText uiText2;
        uxs uxsVar2;
        String str8;
        UiText uiText3;
        String str9;
        List<cuv> list2;
        ResourceUiText resourceUiText;
        int i7;
        int i8;
        boolean z5;
        ArrayList arrayList;
        String str10;
        boolean z6;
        boolean z7;
        osv osvVar3 = osvVar;
        if (x1bVar instanceof rwv) {
            rwvVar = (rwv) x1bVar;
            int i9 = rwvVar.M;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                rwvVar.M = i9 - Integer.MIN_VALUE;
            } else {
                rwvVar = new rwv(this, x1bVar);
            }
        } else {
            rwvVar = new rwv(this, x1bVar);
        }
        rwv rwvVar2 = rwvVar;
        Object objC = rwvVar2.K;
        Object obj2 = y5b.a;
        int i10 = rwvVar2.M;
        if (i10 == 0) {
            uj50.b(objC);
            String str11 = osvVar3.j;
            rwvVar2.a = osvVar3;
            map2 = map;
            rwvVar2.b = map2;
            rwvVar2.c = set;
            z2 = z;
            rwvVar2.G = z2;
            rwvVar2.M = 1;
            Object objA = this.b.a(str11, rwvVar2);
            if (objA != obj2) {
                obj = objA;
                set2 = set;
            }
            return obj2;
        }
        if (i10 == 1) {
            boolean z8 = rwvVar2.G;
            Set set4 = rwvVar2.c;
            Map map4 = rwvVar2.b;
            osv osvVar4 = rwvVar2.a;
            uj50.b(objC);
            z2 = z8;
            osvVar3 = osvVar4;
            obj = objC;
            set2 = set4;
            map2 = map4;
        } else if (i10 == 2) {
            boolean z9 = rwvVar2.G;
            String str12 = rwvVar2.d;
            set3 = rwvVar2.c;
            map3 = rwvVar2.b;
            osv osvVar5 = rwvVar2.a;
            uj50.b(objC);
            z3 = z9;
            str = str12;
            osvVar2 = osvVar5;
            aVar = (ytv.a) objC;
            MissionPublishState missionPublishState = osvVar2.b;
            i = osvVar2.a;
            long j = osvVar2.f;
            Long l = osvVar2.e;
            missionProgressDto = osvVar2.t;
            if (missionProgressDto != null) {
                status = missionProgressDto.getStatus();
            } else {
                status = null;
            }
            wwvVarK = k(missionPublishState, status, osvVar2.s, aVar.d, z3);
            bxg0 bxg0VarH = h(wwvVarK, i, set3, map3, z3);
            uxsVar = (uxs) bxg0VarH.a;
            uiText = (UiText) bxg0VarH.c;
            str2 = osvVar2.c;
            str3 = osvVar2.d;
            list = aVar.a;
            str4 = osvVar2.h;
            String str13 = str;
            strN = bwf0.n(osvVar2.i);
            uiTextI = i(l, j, wwvVarK);
            resourceUiTextJ = j(l, j, wwvVarK);
            if (wwvVarK == wwv.a) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (wwvVarK == wwv.e) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (wwvVarK == wwv.d) {
                strN2 = bwf0.n(osvVar2.g);
            } else {
                strN2 = "";
            }
            i4 = i3;
            str5 = strN2;
            i5 = i2;
            z4 = z3;
            arrayListF = f(str13, osvVar2.m, osvVar2.n, osvVar2.o, osvVar2.p, osvVar2.q);
            if (missionProgressDto != null) {
                d = new Double(missionProgressDto.getAccumulatedAmount());
            } else {
                d = null;
            }
            String str14 = osvVar2.j;
            double d2 = osvVar2.l;
            qtv qtvVar = osvVar2.k;
            long j2 = osvVar2.f;
            rwvVar2.a = null;
            rwvVar2.b = null;
            rwvVar2.c = null;
            rwvVar2.d = null;
            rwvVar2.e = aVar;
            rwvVar2.f = str2;
            rwvVar2.i = str3;
            rwvVar2.v = list;
            rwvVar2.w = str4;
            rwvVar2.y = strN;
            rwvVar2.z = uiTextI;
            rwvVar2.A = resourceUiTextJ;
            rwvVar2.B = uxsVar;
            rwvVar2.C = wwvVarK;
            rwvVar2.D = str5;
            rwvVar2.E = uiText;
            rwvVar2.F = arrayListF;
            rwvVar2.G = z4;
            rwvVar2.H = i;
            rwvVar2.I = i5;
            rwvVar2.J = i4;
            rwvVar2.M = 3;
            objC = c(d, str14, d2, qtvVar, j2, rwvVar2);
            if (objC == obj2) {
                return obj2;
            }
            wwvVar = wwvVarK;
            i6 = i4;
            str6 = strN;
            str7 = str3;
            uiText2 = uiTextI;
            uxsVar2 = uxsVar;
            str8 = str2;
            uiText3 = uiText;
            str9 = str4;
            list2 = list;
            resourceUiText = resourceUiTextJ;
            i7 = i5;
            i8 = i;
            z5 = z4;
            arrayList = arrayListF;
            str10 = str5;
        } else {
            if (i10 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = rwvVar2.J;
            i7 = rwvVar2.I;
            int i12 = rwvVar2.H;
            boolean z10 = rwvVar2.G;
            ArrayList arrayList2 = rwvVar2.F;
            UiText uiText4 = rwvVar2.E;
            String str15 = rwvVar2.D;
            wwv wwvVar2 = rwvVar2.C;
            uxs uxsVar3 = rwvVar2.B;
            ResourceUiText resourceUiText2 = rwvVar2.A;
            UiText uiText5 = rwvVar2.z;
            String str16 = rwvVar2.y;
            String str17 = rwvVar2.w;
            List<cuv> list3 = rwvVar2.v;
            String str18 = rwvVar2.i;
            String str19 = rwvVar2.f;
            ytv.a aVar2 = rwvVar2.e;
            Set set5 = rwvVar2.c;
            uj50.b(objC);
            str7 = str18;
            str8 = str19;
            i8 = i12;
            z5 = z10;
            arrayList = arrayList2;
            uiText3 = uiText4;
            str10 = str15;
            wwvVar = wwvVar2;
            str9 = str17;
            list2 = list3;
            uxsVar2 = uxsVar3;
            resourceUiText = resourceUiText2;
            uiText2 = uiText5;
            str6 = str16;
            aVar = aVar2;
            i6 = i11;
        }
        dtv dtvVar = (dtv) objC;
        ResourceUiText resourceUiText3 = aVar.b;
        wae waeVar = aVar.c;
        boolean z11 = aVar.d;
        boolean z12 = aVar.e;
        if (i7 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (i6 != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new kwv(i8, str8, str7, list2, str9, str6, uiText2, resourceUiText, z6, z7, uxsVar2, wwvVar, str10, uiText3, arrayList, dtvVar, resourceUiText3, waeVar, z11, z5, z12, m2g.a, false, qrv.c.a);
        String str20 = (String) obj;
        ArrayList arrayList3 = osvVar3.r;
        String str21 = osvVar3.j;
        rwvVar2.a = osvVar3;
        rwvVar2.b = map2;
        rwvVar2.c = set2;
        rwvVar2.d = str20;
        rwvVar2.G = z2;
        rwvVar2.M = 2;
        Object objA2 = this.d.a(arrayList3, str21, str20, rwvVar2);
        if (objA2 != obj2) {
            set3 = set2;
            objC = objA2;
            osvVar2 = osvVar3;
            z3 = z2;
            str = str20;
            map3 = map2;
            aVar = (ytv.a) objC;
            MissionPublishState missionPublishState2 = osvVar2.b;
            i = osvVar2.a;
            long j3 = osvVar2.f;
            Long l2 = osvVar2.e;
            missionProgressDto = osvVar2.t;
            if (missionProgressDto != null) {
                status = missionProgressDto.getStatus();
            } else {
                status = null;
            }
            wwvVarK = k(missionPublishState2, status, osvVar2.s, aVar.d, z3);
            bxg0 bxg0VarH2 = h(wwvVarK, i, set3, map3, z3);
            uxsVar = (uxs) bxg0VarH2.a;
            uiText = (UiText) bxg0VarH2.c;
            str2 = osvVar2.c;
            str3 = osvVar2.d;
            list = aVar.a;
            str4 = osvVar2.h;
            String str110 = str;
            strN = bwf0.n(osvVar2.i);
            uiTextI = i(l2, j3, wwvVarK);
            resourceUiTextJ = j(l2, j3, wwvVarK);
            if (wwvVarK == wwv.a) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (wwvVarK == wwv.e) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (wwvVarK == wwv.d) {
                strN2 = bwf0.n(osvVar2.g);
            } else {
                strN2 = "";
            }
            i4 = i3;
            str5 = strN2;
            i5 = i2;
            z4 = z3;
            arrayListF = f(str110, osvVar2.m, osvVar2.n, osvVar2.o, osvVar2.p, osvVar2.q);
            if (missionProgressDto != null) {
                d = new Double(missionProgressDto.getAccumulatedAmount());
            } else {
                d = null;
            }
            String str111 = osvVar2.j;
            double d3 = osvVar2.l;
            qtv qtvVar2 = osvVar2.k;
            long j4 = osvVar2.f;
            rwvVar2.a = null;
            rwvVar2.b = null;
            rwvVar2.c = null;
            rwvVar2.d = null;
            rwvVar2.e = aVar;
            rwvVar2.f = str2;
            rwvVar2.i = str3;
            rwvVar2.v = list;
            rwvVar2.w = str4;
            rwvVar2.y = strN;
            rwvVar2.z = uiTextI;
            rwvVar2.A = resourceUiTextJ;
            rwvVar2.B = uxsVar;
            rwvVar2.C = wwvVarK;
            rwvVar2.D = str5;
            rwvVar2.E = uiText;
            rwvVar2.F = arrayListF;
            rwvVar2.G = z4;
            rwvVar2.H = i;
            rwvVar2.I = i5;
            rwvVar2.J = i4;
            rwvVar2.M = 3;
            objC = c(d, str111, d3, qtvVar2, j4, rwvVar2);
            if (objC == obj2) {
                return obj2;
            }
            wwvVar = wwvVarK;
            i6 = i4;
            str6 = strN;
            str7 = str3;
            uiText2 = uiTextI;
            uxsVar2 = uxsVar;
            str8 = str2;
            uiText3 = uiText;
            str9 = str4;
            list2 = list;
            resourceUiText = resourceUiTextJ;
            i7 = i5;
            i8 = i;
            z5 = z4;
            arrayList = arrayListF;
            str10 = str5;
            dtv dtvVar2 = (dtv) objC;
            ResourceUiText resourceUiText4 = aVar.b;
            wae waeVar2 = aVar.c;
            boolean z13 = aVar.d;
            boolean z14 = aVar.e;
            if (i7 != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i6 != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new kwv(i8, str8, str7, list2, str9, str6, uiText2, resourceUiText, z6, z7, uxsVar2, wwvVar, str10, uiText3, arrayList, dtvVar2, resourceUiText4, waeVar2, z13, z5, z14, m2g.a, false, qrv.c.a);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0246  */
    /* JADX WARN: Code duplicated, block: B:59:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.String, java.util.Map, java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x02e0 -> B:60:0x02fb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object p(defpackage.qlw r48, java.util.Map r49, java.util.Set r50, boolean r51, defpackage.x1b r52) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwv.p(qlw, java.util.Map, java.util.Set, boolean, x1b):java.lang.Object");
    }
}
