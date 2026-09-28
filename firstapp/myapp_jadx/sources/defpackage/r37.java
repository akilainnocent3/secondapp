package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeViewModel$loadChallenge$1", f = "ChallengeViewModel.kt", l = {247, 249, 256}, m = "invokeSuspend", v = 2)
public final class r37 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public m0u a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ o37 e;
    public final /* synthetic */ Long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r37(o37 o37Var, Long l, v1b<? super r37> v1bVar) {
        super(2, v1bVar);
        this.e = o37Var;
        this.f = l;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r37(this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r37) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0270  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0294  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:124:0x0303  */
    /* JADX WARN: Code duplicated, block: B:127:0x030b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0341  */
    /* JADX WARN: Code duplicated, block: B:140:0x034b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0363  */
    /* JADX WARN: Code duplicated, block: B:149:0x036d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0385  */
    /* JADX WARN: Code duplicated, block: B:158:0x038f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[LOOP:5: B:138:0x0345->B:193:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:? A[LOOP:6: B:147:0x0367->B:196:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[LOOP:8: B:71:0x01ac->B:205:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0142 A[LOOP:0: B:52:0x013c->B:54:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x015d  */
    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d6 A[LOOP:1: B:78:0x01d0->B:80:0x01d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x020b  */
    /* JADX WARN: Code duplicated, block: B:88:0x020d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0210  */
    /* JADX WARN: Code duplicated, block: B:90:0x0213  */
    /* JADX WARN: Code duplicated, block: B:95:0x0249  */
    /* JADX WARN: Code duplicated, block: B:96:0x024e  */
    /* JADX WARN: Code duplicated, block: B:99:0x026b  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        m0u m0uVarA;
        Object objB;
        m0u m0uVar;
        boolean z;
        Object objB2;
        Object value2;
        Object value3;
        lk50 lk50VarL;
        Object value4;
        Object objD;
        boolean z2;
        int i;
        ArrayList arrayList;
        Iterator it;
        Long l;
        ArrayList arrayList2;
        int size;
        int i2;
        iz6 iz6VarA;
        uf00<iz6> uf00VarF;
        Iterator<iz6> it2;
        f07 f07Var;
        ArrayList arrayList3;
        Iterator<iz6> it3;
        ArrayList arrayList4;
        int size2;
        int i3;
        Integer num;
        int iIntValue;
        Integer num2;
        int iIntValue2;
        Integer num3;
        int iIntValue3;
        ArrayList arrayList5;
        Iterator itListIterator;
        uf00 uf00VarF2;
        Object value5;
        r17 r17Var;
        uf00<iz6> uf00VarX1;
        a07 a07VarE;
        int i4;
        uf00 uf00Var;
        uf00<iz6> uf00Var2;
        Iterator<iz6> it4;
        ChallengeCardStatus challengeCardStatus;
        Iterator<iz6> it5;
        Iterator<iz6> it6;
        g07 g07Var;
        boolean z3;
        ChallengeCardStatus challengeCardStatus2;
        f07 f07Var2;
        o37 o37Var = this.e;
        mgb0 mgb0Var = o37Var.e;
        j37 j37Var = o37Var.d;
        wwd0 wwd0Var = o37Var.y;
        y5b y5bVar = y5b.a;
        int i5 = this.d;
        char c = 2;
        if (i5 == 0) {
            uj50.b(obj);
            tz6 tz6Var = ((r17) wwd0Var.getValue()).a;
            tz6.c cVar = tz6Var instanceof tz6.c ? (tz6.c) tz6Var : null;
            if (cVar != null) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, r17.a((r17) value3, tz6.c.a(cVar, null, null, null, 15), null, null, null, 14)));
            } else {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, r17.a((r17) value, tz6.b.a, null, null, null, 14)));
            }
            boolean zIsLogin = mgb0Var.isLogin();
            if (zIsLogin) {
                AccountInfo accountInfoLastAccountInfo = mgb0Var.lastAccountInfo();
                if (accountInfoLastAccountInfo != null) {
                    m0u.a aVar = m0u.b;
                    int loyaltyCurrentTier = accountInfoLastAccountInfo.getLoyaltyCurrentTier();
                    aVar.getClass();
                    m0uVarA = m0u.a.a(loyaltyCurrentTier);
                } else {
                    m0uVarA = null;
                }
            } else {
                m0uVarA = m0u.Tier0;
            }
            if (m0uVarA == null) {
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, r17.a((r17) value2, new tz6.a(vch0.b), null, null, null, 14)));
                return Unit.a;
            }
            if (zIsLogin) {
                u2k u2kVar = o37Var.a;
                this.a = m0uVarA;
                this.b = zIsLogin;
                this.d = 1;
                objB2 = u2kVar.a.b(this);
                if (objB2 != y5bVar) {
                    m0uVar = m0uVarA;
                    z = zIsLogin;
                    lk50VarL = (lk50) objB2;
                }
            } else {
                zvt zvtVar = o37Var.f;
                this.a = m0uVarA;
                this.b = zIsLogin;
                this.d = 2;
                objB = zvtVar.b(this);
                if (objB != y5bVar) {
                    m0uVar = m0uVarA;
                    z = zIsLogin;
                    lk50VarL = bm50.l((lk50) objB, new q37());
                }
            }
            return y5bVar;
        }
        if (i5 == 1) {
            z = this.b;
            m0uVar = this.a;
            uj50.b(obj);
            objB2 = obj;
            lk50VarL = (lk50) objB2;
        } else if (i5 == 2) {
            z = this.b;
            m0uVar = this.a;
            uj50.b(obj);
            objB = obj;
            lk50VarL = bm50.l((lk50) objB, new q37());
        } else {
            if (i5 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.c;
            boolean z4 = this.b;
            uj50.b(obj);
            objD = obj;
            z2 = z4;
        }
        Iterable iterable = (Iterable) objD;
        arrayList = new ArrayList(l48.r(iterable, 10));
        it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(iz6.a((iz6) it.next(), null, null, null, false, z2, 262143));
        }
        l = this.f;
        if (l != null) {
            arrayList2 = new ArrayList(l48.r(arrayList, 10));
            size = arrayList.size();
            i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                iz6VarA = (iz6) obj2;
                char c2 = c;
                if (iz6VarA.a == l.longValue()) {
                    iz6VarA = iz6.a(iz6VarA, null, null, null, true, false, 516095);
                }
                arrayList2.add(iz6VarA);
                c = c2;
            }
            arrayList = arrayList2;
        }
        uf00VarF = a4h.f(arrayList);
        o37Var.v = uf00VarF;
        if (uf00VarF == null || !uf00VarF.isEmpty()) {
            it2 = uf00VarF.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    f07Var = f07.a;
                    break;
                }
                if (it2.next().l == ChallengeCardStatus.Ongoing) {
                    f07Var = f07.b;
                    break;
                }
            }
        } else {
            f07Var = f07.a;
            break;
        }
        arrayList3 = new ArrayList(l48.r(uf00VarF, 10));
        it3 = uf00VarF.iterator();
        while (it3.hasNext()) {
            arrayList3.add(it3.next().l);
        }
        j37Var.getClass();
        arrayList4 = new ArrayList();
        size2 = arrayList3.size();
        i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            challengeCardStatus2 = (ChallengeCardStatus) obj3;
            challengeCardStatus2.getClass();
            switch (jz6.a[challengeCardStatus2.ordinal()]) {
                case 1:
                case 2:
                    f07Var2 = f07.c;
                    break;
                case 3:
                    f07Var2 = f07.b;
                    break;
                case 4:
                    f07Var2 = f07.d;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    f07Var2 = null;
                    break;
                default:
                    uhc.a();
                    return null;
            }
            if (f07Var2 != null) {
                arrayList4.add(f07Var2);
            }
        }
        Map mapA = e9l.a(new n37(arrayList4));
        f07 f07Var3 = f07.a;
        StringUiText stringUiText = vch0.a;
        g07 g07Var2 = new g07(f07Var3, new ResourceUiText(R.string.page_loyalty__challenge_tab_all), null, true);
        f07 f07Var4 = f07.b;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__challenge_tab_ongoing);
        num = (Integer) mapA.get(f07Var4);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        g07 g07Var3 = new g07(f07Var4, resourceUiText, Integer.valueOf(iIntValue), false);
        f07 f07Var5 = f07.c;
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_loyalty__challenge_tab_available);
        num2 = (Integer) mapA.get(f07Var5);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        g07 g07Var4 = new g07(f07Var5, resourceUiText2, Integer.valueOf(iIntValue2), false);
        f07 f07Var6 = f07.d;
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_loyalty__challenge_tab_completed);
        num3 = (Integer) mapA.get(f07Var6);
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        uf00 uf00VarA = a4h.a(g07Var2, g07Var3, g07Var4, new g07(f07Var6, resourceUiText3, Integer.valueOf(iIntValue3), false));
        arrayList5 = new ArrayList(l48.r(uf00VarA, 10));
        itListIterator = ((n4) uf00VarA).listIterator(0);
        while (itListIterator.hasNext()) {
            g07Var = (g07) itListIterator.next();
            if (g07Var.a == f07Var) {
                z3 = true;
            } else {
                z3 = false;
            }
            arrayList5.add(g07.a(g07Var, z3));
        }
        uf00VarF2 = a4h.f(arrayList5);
        do {
            value5 = wwd0Var.getValue();
            r17Var = (r17) value5;
            uf00VarX1 = o37Var.x1(f07Var);
            j37Var.getClass();
            a07VarE = j37.e(f07Var);
            if ((16 & 1) != 0) {
                i4 = 0;
            } else {
                i4 = i;
            }
            if ((16 & 2) != 0) {
                uf00Var = n1a0.c;
            } else {
                uf00Var = uf00VarF2;
            }
            if ((16 & 4) != 0) {
                uf00VarX1 = n1a0.c;
            }
            uf00Var2 = uf00VarX1;
            if ((16 & 8) != 0) {
                StringUiText stringUiText2 = vch0.a;
                a07VarE = new a07(stringUiText2, stringUiText2);
            }
        } while (!wwd0Var.g(value5, r17.a(r17Var, new tz6.c(i4, uf00Var, uf00Var2, a07VarE, false), null, null, null, 14)));
        if (!o37Var.w && !uf00VarF.isEmpty()) {
            o37Var.z1(i37.j.a);
            if (!uf00VarF.isEmpty()) {
                it6 = uf00VarF.iterator();
                while (it6.hasNext()) {
                    if (it6.next().l == ChallengeCardStatus.Available) {
                        o37Var.z1(i37.b.a);
                    }
                }
            }
            if (!uf00VarF.isEmpty()) {
                it5 = uf00VarF.iterator();
                while (it5.hasNext()) {
                    if (it5.next().l == ChallengeCardStatus.Ongoing) {
                        o37Var.z1(i37.f.a);
                    }
                }
            }
            if (!uf00VarF.isEmpty()) {
                it4 = uf00VarF.iterator();
                while (it4.hasNext()) {
                    challengeCardStatus = it4.next().l;
                    if (challengeCardStatus != ChallengeCardStatus.Ongoing || challengeCardStatus == ChallengeCardStatus.Completed || challengeCardStatus == ChallengeCardStatus.Cancelled || challengeCardStatus == ChallengeCardStatus.Expired) {
                        o37Var.z1(i37.z.a);
                    }
                }
            }
            o37Var.w = true;
        }
        return Unit.a;
        if (lk50VarL instanceof lk50.c) {
            j37Var.getClass();
            int iF = j37.f(m0uVar);
            List list = (List) ((lk50.c) lk50VarL).a;
            this.a = null;
            this.b = z;
            this.c = iF;
            this.d = 3;
            objD = j37Var.d(iF, this, list);
            if (objD != y5bVar) {
                z2 = z;
                i = iF;
                Iterable iterable2 = (Iterable) objD;
                arrayList = new ArrayList(l48.r(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(iz6.a((iz6) it.next(), null, null, null, false, z2, 262143));
                }
                l = this.f;
                if (l != null) {
                    arrayList2 = new ArrayList(l48.r(arrayList, 10));
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        iz6VarA = (iz6) obj4;
                        char c3 = c;
                        if (iz6VarA.a == l.longValue()) {
                            iz6VarA = iz6.a(iz6VarA, null, null, null, true, false, 516095);
                        }
                        arrayList2.add(iz6VarA);
                        c = c3;
                    }
                    arrayList = arrayList2;
                }
                uf00VarF = a4h.f(arrayList);
                o37Var.v = uf00VarF;
                if (uf00VarF == null) {
                    it2 = uf00VarF.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            f07Var = f07.a;
                            break;
                        }
                        if (it2.next().l == ChallengeCardStatus.Ongoing) {
                            f07Var = f07.b;
                            break;
                        }
                    }
                } else {
                    it2 = uf00VarF.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            f07Var = f07.a;
                            break;
                        }
                        if (it2.next().l == ChallengeCardStatus.Ongoing) {
                            f07Var = f07.b;
                            break;
                        }
                    }
                }
                arrayList3 = new ArrayList(l48.r(uf00VarF, 10));
                it3 = uf00VarF.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(it3.next().l);
                }
                j37Var.getClass();
                arrayList4 = new ArrayList();
                size2 = arrayList3.size();
                i3 = 0;
                while (i3 < size2) {
                    Object obj5 = arrayList3.get(i3);
                    i3++;
                    challengeCardStatus2 = (ChallengeCardStatus) obj5;
                    challengeCardStatus2.getClass();
                    switch (jz6.a[challengeCardStatus2.ordinal()]) {
                        case 1:
                        case 2:
                            f07Var2 = f07.c;
                            break;
                        case 3:
                            f07Var2 = f07.b;
                            break;
                        case 4:
                            f07Var2 = f07.d;
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            f07Var2 = null;
                            break;
                        default:
                            uhc.a();
                            return null;
                    }
                    if (f07Var2 != null) {
                        arrayList4.add(f07Var2);
                    }
                }
                Map mapA2 = e9l.a(new n37(arrayList4));
                f07 f07Var7 = f07.a;
                StringUiText stringUiText3 = vch0.a;
                g07 g07Var5 = new g07(f07Var7, new ResourceUiText(R.string.page_loyalty__challenge_tab_all), null, true);
                f07 f07Var8 = f07.b;
                ResourceUiText resourceUiText4 = new ResourceUiText(R.string.page_loyalty__challenge_tab_ongoing);
                num = (Integer) mapA2.get(f07Var8);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                g07 g07Var6 = new g07(f07Var8, resourceUiText4, Integer.valueOf(iIntValue), false);
                f07 f07Var9 = f07.c;
                ResourceUiText resourceUiText5 = new ResourceUiText(R.string.page_loyalty__challenge_tab_available);
                num2 = (Integer) mapA2.get(f07Var9);
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                g07 g07Var7 = new g07(f07Var9, resourceUiText5, Integer.valueOf(iIntValue2), false);
                f07 f07Var10 = f07.d;
                ResourceUiText resourceUiText6 = new ResourceUiText(R.string.page_loyalty__challenge_tab_completed);
                num3 = (Integer) mapA2.get(f07Var10);
                if (num3 != null) {
                    iIntValue3 = num3.intValue();
                } else {
                    iIntValue3 = 0;
                }
                uf00 uf00VarA2 = a4h.a(g07Var5, g07Var6, g07Var7, new g07(f07Var10, resourceUiText6, Integer.valueOf(iIntValue3), false));
                arrayList5 = new ArrayList(l48.r(uf00VarA2, 10));
                itListIterator = ((n4) uf00VarA2).listIterator(0);
                while (itListIterator.hasNext()) {
                    g07Var = (g07) itListIterator.next();
                    if (g07Var.a == f07Var) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList5.add(g07.a(g07Var, z3));
                }
                uf00VarF2 = a4h.f(arrayList5);
                do {
                    value5 = wwd0Var.getValue();
                    r17Var = (r17) value5;
                    uf00VarX1 = o37Var.x1(f07Var);
                    j37Var.getClass();
                    a07VarE = j37.e(f07Var);
                    if ((16 & 1) != 0) {
                        i4 = 0;
                    } else {
                        i4 = i;
                    }
                    if ((16 & 2) != 0) {
                        uf00Var = n1a0.c;
                    } else {
                        uf00Var = uf00VarF2;
                    }
                    if ((16 & 4) != 0) {
                        uf00VarX1 = n1a0.c;
                    }
                    uf00Var2 = uf00VarX1;
                    if ((16 & 8) != 0) {
                        StringUiText stringUiText4 = vch0.a;
                        a07VarE = new a07(stringUiText4, stringUiText4);
                    }
                } while (!wwd0Var.g(value5, r17.a(r17Var, new tz6.c(i4, uf00Var, uf00Var2, a07VarE, false), null, null, null, 14)));
                if (!o37Var.w) {
                    o37Var.z1(i37.j.a);
                    if (!uf00VarF.isEmpty()) {
                        it6 = uf00VarF.iterator();
                        while (it6.hasNext()) {
                            if (it6.next().l == ChallengeCardStatus.Available) {
                                o37Var.z1(i37.b.a);
                            }
                        }
                    }
                    if (!uf00VarF.isEmpty()) {
                        it5 = uf00VarF.iterator();
                        while (it5.hasNext()) {
                            if (it5.next().l == ChallengeCardStatus.Ongoing) {
                                o37Var.z1(i37.f.a);
                            }
                        }
                    }
                    if (!uf00VarF.isEmpty()) {
                        it4 = uf00VarF.iterator();
                        while (it4.hasNext()) {
                            challengeCardStatus = it4.next().l;
                            if (challengeCardStatus != ChallengeCardStatus.Ongoing) {
                            }
                            o37Var.z1(i37.z.a);
                        }
                    }
                    o37Var.w = true;
                }
            }
            return y5bVar;
        }
        if (lk50VarL instanceof lk50.a) {
            SprThrowable sprThrowableH = bm50.h(lk50VarL);
            UiText uiTextB = sprThrowableH != null ? sprThrowableH.b() : vch0.b;
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, r17.a((r17) value4, new tz6.a(uiTextB), null, null, null, 14)));
        }
        return Unit.a;
    }
}
