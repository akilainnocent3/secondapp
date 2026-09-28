package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class e8s {

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((LevelConfigDetailDto) t).getLevel()).compareTo(Integer.valueOf(((LevelConfigDetailDto) t2).getLevel()));
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ f7s a;
        public final /* synthetic */ List b;

        public b(f7s f7sVar, List list) {
            this.a = f7sVar;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            return this.a.invoke(this.b.get(num.intValue()));
        }
    }

    public static final class c implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public c(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class d implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ int b;
        public final /* synthetic */ UserLevelProgressDto c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Function1 e;
        public final /* synthetic */ Function1 f;

        public d(List list, int i, UserLevelProgressDto userLevelProgressDto, String str, Function1 function1, Function1 function2) {
            this.a = list;
            this.b = i;
            this.c = userLevelProgressDto;
            this.d = str;
            this.e = function1;
            this.f = function2;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            x6s x6sVar;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                LevelConfigDetailDto levelConfigDetailDto = (LevelConfigDetailDto) this.a.get(iIntValue);
                aVar2.N(68482818);
                int level = levelConfigDetailDto.getLevel();
                int i2 = this.b;
                if (level < i2) {
                    x6sVar = x6s.a;
                } else {
                    x6sVar = level == i2 ? x6s.b : x6s.c;
                }
                e8s.c(levelConfigDetailDto, x6sVar, i2, this.c, this.d, this.e, this.f, aVar2, 0);
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final UserLevelProgressDto userLevelProgressDto, final List list, final boolean z, final boolean z2, final Integer num, final Float f, final fs50 fs50Var, final Function1 function1, final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i) {
        boolean z3;
        String strC;
        int i2;
        Object obj;
        androidx.compose.runtime.b bVar;
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-381492073);
        int i4 = (i & 6) == 0 ? (bVarI.M(userLevelProgressDto) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= bVarI.A(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= bVarI.M(num) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= bVarI.M(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= bVarI.d(fs50Var.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= bVarI.A(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= bVarI.M(dVar) ? 67108864 : 33554432;
        }
        if (bVarI.q(i4 & 1, (38347923 & i4) != 38347922)) {
            zp70 zp70VarA = op70.a(bVarI);
            op5 op5Var = op5.a;
            int i5 = i4;
            List<String> listK = kotlin.collections.b.k(op5.c(op5Var, "bonus_round_rule_1:sg_crash_games", pwo.e(R.string.sporty_cars_bonus_rule_1, bVarI)), op5.c(op5Var, "bonus_round_rule_2:sg_crash_games", pwo.e(R.string.sporty_cars_bonus_rule_2, bVarI)), op5.c(op5Var, "bonus_round_rule_3:sg_crash_games", pwo.e(R.string.sporty_cars_bonus_rule_3, bVarI)), op5.c(op5Var, "bonus_round_rule_4:sg_crash_games", pwo.e(R.string.sporty_cars_bonus_rule_4, bVarI)));
            hfs hfsVarD = ya5.a.d(kotlin.collections.b.k(new j58(r58.d(2583681587L)), new j58(r58.d(2583691263L)), new j58(r58.d(2583682403L))), 9187343241974906880L, 0L, 8);
            androidx.compose.ui.d dVarJ = h.j(h.h(op70.c(dVar, zp70VarA, 14), wdw.a(bVarI) * 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, wdw.a(bVarI) * 16.0f, 7);
            i78 i78VarA = g78.a(new kw0.i(wdw.a(bVarI) * 16.0f, true, new hw0()), ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            j(fs50Var, function1, h.j(j.g(aVar3, 1.0f), 0.0f, wdw.a(bVarI) * 10.0f, 0.0f, wdw.a(bVarI) * 10.0f, 5), bVarI, (i5 >> 18) & WebSocketProtocol.PAYLOAD_SHORT);
            int iB = k94.b(userLevelProgressDto, list);
            int bonusMeterRounds = userLevelProgressDto != null ? userLevelProgressDto.getBonusMeterRounds() : 1;
            if (bonusMeterRounds < 1) {
                bonusMeterRounds = 1;
            }
            int iE = f.e(userLevelProgressDto != null ? userLevelProgressDto.getCompletedBonusMeterRounds() : 0, 0, bonusMeterRounds);
            int i6 = bonusMeterRounds - iE;
            if (i6 < 0) {
                i6 = 0;
            }
            float fD = bonusMeterRounds > 0 ? f.d(iE / bonusMeterRounds, 0.0f, 1.0f) : 0.0f;
            int iIntValue = num != null ? num.intValue() : i6;
            if (f != null) {
                fD = f.floatValue();
            }
            twd0 twd0VarB = xe0.b(fD, yi0.e(450, 0, null, 6), "bonus_rounds_unlock_progress", null, bVarI, 3120, 20);
            hfs hfsVarA = ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(r58.d(3015016962L)), new j58(r58.d(3019093272L))));
            if (iIntValue > 1) {
                bVarI.N(1569947603);
                strC = op5.c(op5Var, "remaining_bets_bonus_round:sg_crash_games", pwo.f(R.string.sporty_cars_bonus_unlock_rounds_left, new Object[]{Integer.valueOf(iIntValue)}, bVarI));
                z3 = false;
                bVarI.X(false);
            } else {
                z3 = false;
                bVarI.N(1423982447);
                strC = op5.c(op5Var, "remaining_bet_bonus_round:sg_crash_games", pwo.f(R.string.sporty_cars_bonus_unlock_round_left, new Object[]{Integer.valueOf(iIntValue)}, bVarI));
                bVarI.X(false);
            }
            String strP = StringsKt.M(strC, "{roundsRemainingForBonusRound}", z3) ? kotlin.text.c.p(strC, "{roundsRemainingForBonusRound}", String.valueOf(iIntValue), z3) : String.format(strC, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
            String strC2 = op5.c(op5Var, "bonus_round_active:sg_crash_games", pwo.e(R.string.sporty_cars_bonus_active_banner_text, bVarI));
            String strC3 = op5.c(op5Var, "bonus_round_coming_soon:sg_crash_games", pwo.e(R.string.sporty_cars_bonus_banner_text, bVarI));
            String strC4 = op5.c(op5Var, "rules:sg_crash_games", pwo.e(R.string.sporty_cars_bonus_rules_title, bVarI));
            String str = strP;
            androidx.compose.ui.d dVarC2 = j.C(aVar3, null, 3);
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarC2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            androidx.compose.ui.d dVarI = j.i(j.g(aVar3, 1.0f), wdw.a(bVarI) * 48.0f);
            n54.a aVar4 = ht.a.n;
            androidx.compose.ui.d dVarG = h.g(d35.b(androidx.compose.foundation.a.b(androidx.compose.foundation.a.a(lx80.d(j.y(j.D(dVarI, aVar4, 2), 0.0f, ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.8f, 1), wdw.a(bVarI) * 6.0f, j060.c(wdw.a(bVarI) * 999.0f), false, r58.b(1073741824), r58.b(1073741824), 4), hfsVarA, j060.c(wdw.a(bVarI) * 999.0f), 0.0f, 4), r58.b(1291845632), j060.c(wdw.a(bVarI) * 999.0f)), wdw.a(bVarI) * 1.0f, hfsVarD, j060.c(wdw.a(bVarI) * 999.0f)), wdw.a(bVarI) * 14.0f, wdw.a(bVarI) * 6.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            if (z) {
                bVarI.N(333586764);
                i2 = 3;
                lkf0.b(strC2, null, r58.d(4294963712L), wdw.c(16, bVarI), n9i.a(), t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131010);
                bVar = bVarI;
                bVar.X(false);
                i3 = 0;
                obj = null;
            } else if (!z2 || userLevelProgressDto == null) {
                i2 = 3;
                obj = null;
                bVarI.N(335762902);
                h9n.a(erz.a(2131232151, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 48, 124);
                lkf0.b(strC3, null, j58.f, wdw.c(12, bVarI), n9i.a(), t9i.E, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 130498);
                bVar = bVarI;
                i3 = 0;
                bVar.X(false);
            } else {
                bVarI.N(334039581);
                imf0 imf0VarB = imf0.b(((rfd0) bVarI.O(mi60.a)).d, 0L, d2l.g(fw20.a(R.dimen._9ssp, bVarI), 4294967296L), null, n9i.a(), null, 0L, null, null, null, 0, 0L, null, null, 16777205);
                androidx.compose.ui.d dVarH = h.h(aVar3, 0.0f, wdw.a(bVarI) * 2.0f, 1);
                i78 i78VarA2 = g78.a(new kw0.i(wdw.a(bVarI) * 6.0f, true, new hw0()), aVar4, bVarI, 48);
                int iHashCode4 = Long.hashCode(bVarI.m());
                ne00 ne00VarS4 = bVarI.S();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarH);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar2);
                hlh0.a(bVarI, ne00VarS4, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                androidx.compose.ui.d dVarA = ls7.a(j.i(j.g(aVar3, 0.8f), wdw.a(bVarI) * 10.0f), j060.c(wdw.a(bVarI) * 999.0f));
                long jD = r58.d(4280621827L);
                zk40.a aVar5 = zk40.a;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarA, jD, aVar5);
                aiv aivVarC2 = g75.c(ht.a.a, false);
                int iHashCode5 = Long.hashCode(bVarI.m());
                ne00 ne00VarS5 = bVarI.S();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(bVarI, dVarB);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar2);
                hlh0.a(bVarI, ne00VarS5, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                    n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                }
                hlh0.a(bVarI, dVarC6, cVar);
                g75.a(androidx.compose.foundation.a.b(j.g(j.c(aVar3, 1.0f), ((Number) twd0VarB.getValue()).floatValue()), r58.d(4293454056L), aVar5), bVarI, 0);
                bVarI.X(true);
                i2 = 3;
                obj = null;
                wf1.a(str, null, imf0VarB, 1, d2l.f(9), null, 0, null, j58.f, bVarI, 100690944, 226);
                bVar = bVarI;
                bVar.X(true);
                i3 = 0;
                bVar.X(false);
            }
            bVar.X(true);
            androidx.compose.runtime.b bVar3 = bVar;
            h9n.a(erz.a(2131232257, i3, bVar), null, j.i(androidx.compose.foundation.layout.d.a.b(aVar3, n54Var), wdw.a(bVar) * 52.0f), null, null, 0.0f, null, bVar3, 48, 120);
            androidx.compose.runtime.b bVar4 = bVar3;
            bVar4.X(true);
            if ((!z2 || userLevelProgressDto == null) && !z) {
                bVar4.N(1398700769);
            } else {
                bVar4.N(1430062446);
                String strC5 = op5.c(op5Var, "keep_betting_to_cashout:sg_crash_games", pwo.e(R.string.keep_betting_to_cashout, bVar4));
                String strC6 = op5.c(op5Var, "more_in_bonus_round:sg_crash_games", pwo.e(R.string.more_in_bonus_round, bVar4));
                bVar4.N(1570165115);
                nk0.b bVar5 = new nk0.b(obj);
                long j = j58.f;
                long jC = wdw.c(12, bVar4);
                t9i t9iVar = t9i.E;
                int iL = bVar5.l(new ora0(j, jC, t9iVar, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65528));
                try {
                    bVar5.g(strC5);
                    Unit unit = Unit.a;
                    bVar5.i(iL);
                    int iL2 = bVar5.l(new ora0(r58.d(4294963712L), wdw.c(14, bVar4), t9iVar, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65528));
                    try {
                        bVar5.g(" " + iB + "% ");
                        bVar5.i(iL2);
                        int iL3 = bVar5.l(new ora0(j, wdw.c(12, bVar4), t9iVar, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65528));
                        try {
                            bVar5.g(strC6);
                            bVar5.i(iL3);
                            nk0 nk0VarM = bVar5.m();
                            bVar4.X(false);
                            lkf0.c(nk0VarM, h.h(j.g(aVar3, 1.0f), wdw.a(bVar4) * 16.0f, 0.0f, 2), 0L, 0L, n9i.a(), null, null, 0L, new gdf0(i2), 0L, 0, false, 2, 0, null, null, null, bVar4, 0, 3072, 253420);
                            bVar4 = bVar4;
                        } catch (Throwable th) {
                            bVar5.i(iL3);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        bVar5.i(iL2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    bVar5.i(iL);
                    throw th3;
                }
            }
            bVar4.X(false);
            androidx.compose.runtime.b bVar6 = bVar4;
            lkf0.b(strC4.concat(" :"), null, j58.f, wdw.c(16, bVar4), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar6, 196992, 0, 131026);
            bVarI = bVar6;
            bVarI.N(1570216885);
            for (String str2 : listK) {
                d160 d160VarA2 = b160.a(kw0.a, ht.a.j, bVarI, 0);
                int iHashCode6 = Long.hashCode(bVarI.m());
                ne00 ne00VarS6 = bVarI.S();
                androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(bVarI, aVar3);
                yka.k.getClass();
                tsr.a aVar6 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS6, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a2);
                }
                hlh0.a(bVarI, dVarC7, yka.a.d);
                androidx.compose.ui.d.a aVar7 = aVar3;
                androidx.compose.runtime.b bVar7 = bVarI;
                h9n.a(erz.a(R.drawable.ic_diamond_bonus_rules, 0, bVarI), null, h.j(aVar7, 0.0f, wdw.a(bVarI) * 5.0f, wdw.a(bVarI) * 10.0f, 0.0f, 9), null, null, 0.0f, null, bVar7, 48, 120);
                lkf0.b(str2, null, r58.d(4293322470L), wdw.c(14, bVar7), null, null, null, 0L, null, wdw.c(20, bVar7), 0, false, 0, 0, null, null, bVar7, 384, 0, 130034);
                bVarI = bVar7;
                bVarI.X(true);
                aVar3 = aVar7;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: a8s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    e8s.a(userLevelProgressDto, list, z, z2, num, f, fs50Var, function1, dVar, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-145660009);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d dVarR = j.r(androidx.compose.ui.d.a.b, wdw.a(bVarI) * 24.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarR);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h9n.a(erz.a(2131232259, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 48, 124);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new q7s();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r10v44, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r10v45, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r10v46, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r10v48, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r10v50, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v66 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r12v20, types: [int] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r13v19, types: [int] */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r17v6, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r2v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v0, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r30v1, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v32, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    public static final void c(final LevelConfigDetailDto levelConfigDetailDto, x6s x6sVar, final int i, final UserLevelProgressDto userLevelProgressDto, final String str, final Function1<? super Integer, Integer> function1, final Function1<? super Integer, String> function2, androidx.compose.runtime.a aVar, final int i2) {
        x6s x6sVar2;
        ?? r10;
        Object obj;
        androidx.compose.ui.d dVarA;
        androidx.compose.ui.d.a aVar2;
        n54 n54Var;
        tsr.a aVar3;
        yka.a.d dVar;
        x6s x6sVar3;
        ?? r4;
        float f;
        androidx.compose.runtime.b bVar;
        androidx.compose.foundation.layout.d dVar2;
        boolean z;
        yka.a.b bVar2;
        yka.a.C1350a c1350a;
        tsr.a aVar4;
        n54 n54Var2;
        androidx.compose.foundation.layout.d dVar3;
        boolean z2;
        boolean z3;
        ?? r5;
        zk40.a aVar5;
        boolean z4;
        ?? r7;
        long j;
        n54 n54Var3;
        androidx.compose.foundation.layout.d dVar4;
        yka.a.C1350a c1350a2;
        ?? r6;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        String strC;
        boolean z5;
        androidx.compose.runtime.b bVarI = aVar.i(1527387724);
        int i3 = i2 | (bVarI.M(levelConfigDetailDto) ? 4 : 2) | (bVarI.d(x6sVar.ordinal()) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.M(userLevelProgressDto) ? 2048 : 1024) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            String strE = pwo.e(function1.invoke(Integer.valueOf(levelConfigDetailDto.getLevel())).intValue(), bVarI);
            boolean zD = bVarI.d(levelConfigDetailDto.getLevel()) | bVarI.M(strE);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zD || objY == c0042a) {
                String strC2 = op5.c(op5.a, "level_display_name_" + f.e(levelConfigDetailDto.getLevel(), 1, 5) + ":sg_game_name", "");
                if (!StringsKt.U(strC2)) {
                    strE = strC2;
                }
                bVarI.r(strE);
                objY = strE;
            }
            op5 op5Var = op5.a;
            String str2 = op5.c(op5Var, "level:sg_crash_games", "Level") + " " + levelConfigDetailDto.getLevel() + " - " + ((String) objY);
            boolean zD2 = bVarI.d(levelConfigDetailDto.getLevel());
            Object objY2 = bVarI.y();
            if (zD2 || objY2 == c0042a) {
                String strC3 = op5.c(op5Var, "level_rewards_card_bg_" + f.e(levelConfigDetailDto.getLevel(), 1, 5) + ":sg_game_name", "");
                boolean zU = StringsKt.U(strC3);
                String strInvoke = strC3;
                if (zU) {
                    strInvoke = function2.invoke(Integer.valueOf(levelConfigDetailDto.getLevel()));
                }
                bVarI.r(strInvoke);
                obj = strInvoke;
            } else {
                obj = objY2;
            }
            String str3 = (String) obj;
            i060 i060VarC = j060.c(wdw.a(bVarI) * 12.0f);
            androidx.compose.ui.d.a aVar6 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarA2 = ls7.a(j.i(j.g(aVar6, 1.0f), wdw.a(bVarI) * 160.0f), i060VarC);
            x6s x6sVar4 = x6s.b;
            if (x6sVar == x6sVar4) {
                bVarI.N(1525473206);
                dVarA = d35.a(aVar6, wdw.a(bVarI) * 2.0f, j58.f, i060VarC);
                bVarI.X(false);
            } else {
                bVarI.N(1525572654);
                bVarI.X(false);
                dVarA = aVar6;
            }
            androidx.compose.ui.d dVarN = dVarA2.n(dVarA);
            boolean z6 = levelConfigDetailDto.getBonusPercentage() > 0.0d || (levelConfigDetailDto.getFbgCount() > 0 && levelConfigDetailDto.getFbgValue() > 0.0d && levelConfigDetailDto.getLevel() > userLevelProgressDto.getFbgHighestAwardedLevel());
            String strC4 = op5.c(op5Var, "no_reward_text:sg_game_name", "");
            bVarI.N(-1059157821);
            if (StringsKt.U(strC4)) {
                strC4 = pwo.e(R.string.sporty_cars_level_locked_hint, bVarI);
            }
            bVarI.X(false);
            n54 n54Var4 = ht.a.a;
            aiv aivVarC = g75.c(n54Var4, false);
            int iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarN);
            yka.k.getClass();
            tsr.a aVar7 = yka.a.b;
            bVarI.D();
            boolean z7 = z6;
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar3);
            yka.a.d dVar5 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar5);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            boolean zU2 = StringsKt.U(str3);
            zk40.a aVar8 = zk40.a;
            if (zU2) {
                androidx.compose.runtime.b bVar4 = bVarI;
                aVar2 = aVar6;
                n54Var = n54Var4;
                aVar3 = aVar7;
                dVar = dVar5;
                x6sVar3 = x6sVar4;
                r4 = 0;
                f = 1.0f;
                bVar4.N(1437601003);
                g75.a(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), r58.d(4280953386L), aVar8), bVar4, 6);
                bVar4.X(false);
                bVar = bVar4;
            } else {
                bVarI.N(1437366984);
                f = 1.0f;
                aVar2 = aVar6;
                n54Var = n54Var4;
                aVar3 = aVar7;
                dVar = dVar5;
                r4 = 0;
                x6sVar3 = x6sVar4;
                fn80.a(str3, null, j.e(aVar6, 1.0f), d0b.a.g, null, 0.0f, null, null, null, bVarI, 3504, 2032);
                androidx.compose.runtime.b bVar5 = bVarI;
                bVar5.X(false);
                bVar = bVar5;
            }
            androidx.compose.ui.d dVarF = h.f(j.e(aVar2, f), wdw.a(bVar) * 12.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVar, r4);
            int iHashCode2 = Long.hashCode(bVar.m());
            ne00 ne00VarS2 = bVar.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVar, dVarF);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, i78VarA, bVar3);
            hlh0.a(bVar, ne00VarS2, dVar);
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVar, iHashCode2, c1350a3);
            }
            hlh0.a(bVar, dVarC2, cVar);
            androidx.compose.ui.d dVarG = j.g(aVar2, f);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVar, 48);
            int iHashCode3 = Long.hashCode(bVar.m());
            ne00 ne00VarS3 = bVar.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVar, dVarG);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, d160VarA, bVar3);
            hlh0.a(bVar, ne00VarS3, dVar);
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVar, iHashCode3, c1350a3);
            }
            hlh0.a(bVar, dVarC3, cVar);
            androidx.compose.ui.d dVarG2 = j.g(aVar2, f);
            n54 n54Var5 = n54Var;
            aiv aivVarC2 = g75.c(n54Var5, r4);
            int iHashCode4 = Long.hashCode(bVar.m());
            ne00 ne00VarS4 = bVar.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVar, dVarG2);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, aivVarC2, bVar3);
            hlh0.a(bVar, ne00VarS4, dVar);
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVar, iHashCode4, c1350a3);
            }
            hlh0.a(bVar, dVarC4, cVar);
            long j2 = j58.f;
            t9i t9iVar = t9i.E;
            long jC = wdw.c(15, bVar);
            n54 n54Var6 = ht.a.e;
            androidx.compose.foundation.layout.d dVar6 = androidx.compose.foundation.layout.d.a;
            ?? r30 = bVar;
            lkf0.b(str2, dVar6.b(aVar2, n54Var6), j2, jC, n9i.a(), t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, r30, 196992, 0, 131008);
            int iOrdinal = x6sVar.ordinal();
            n54 n54Var7 = ht.a.c;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    r30.N(-656252394);
                    r30.X(r4);
                    Unit unit = Unit.a;
                } else {
                    if (iOrdinal != 2) {
                        throw igf0.a(r30, -656261827, r4);
                    }
                    r30.N(-656254218);
                    r30.X(r4);
                    Unit unit2 = Unit.a;
                }
                dVar2 = dVar6;
                z = true;
            } else {
                r30.N(-656259824);
                androidx.compose.ui.d dVarB = dVar2.b(aVar2, n54Var7);
                aiv aivVarC3 = g75.c(n54Var5, r4);
                int iHashCode5 = Long.hashCode(r30.m());
                ne00 ne00VarS5 = r30.S();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(r30, dVarB);
                r30.D();
                if (r30.S) {
                    dVar2 = dVar6;
                    r30.F(aVar3);
                } else {
                    dVar2 = dVar6;
                    r30.p();
                }
                hlh0.a(r30, aivVarC3, bVar3);
                hlh0.a(r30, ne00VarS5, dVar);
                if (r30.S || !Intrinsics.g(r30.y(), Integer.valueOf(iHashCode5))) {
                    n30.a(iHashCode5, r30, iHashCode5, c1350a3);
                }
                hlh0.a(r30, dVarC5, cVar);
                b(0, r30);
                z = true;
                r30.X(true);
                r30.X(false);
                Unit unit3 = Unit.a;
            }
            r30.X(z);
            r30.X(z);
            int iOrdinal2 = x6sVar.ordinal();
            n54.a aVar9 = ht.a.o;
            l78 l78Var = l78.a;
            if (iOrdinal2 == 0) {
                bVar2 = bVar3;
                ?? r8 = r30;
                androidx.compose.foundation.layout.d dVar7 = dVar2;
                boolean z8 = z;
                c1350a = c1350a3;
                aVar4 = aVar3;
                r8.N(-1794711285);
                androidx.compose.ui.d dVarG3 = j.g(l78Var.a(1.0f, aVar2, z8), 1.0f);
                aiv aivVarC4 = g75.c(n54Var5, false);
                int iHashCode6 = Long.hashCode(r8.m());
                n54Var2 = n54Var5;
                ne00 ne00VarS6 = r8.S();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(r8, dVarG3);
                r8.D();
                final String str4 = strC4;
                if (r8.S) {
                    r8.F(aVar4);
                } else {
                    r8.p();
                }
                hlh0.a(r8, aivVarC4, bVar2);
                hlh0.a(r8, ne00VarS6, dVar);
                if (r8.S || !Intrinsics.g(r8.y(), Integer.valueOf(iHashCode6))) {
                    n30.a(iHashCode6, r8, iHashCode6, c1350a);
                }
                hlh0.a(r8, dVarC6, cVar);
                androidx.compose.ui.d dVarJ = h.j(dVar7.b(aVar2, n54Var7), 0.0f, wdw.a(r8) * 20.0f, 0.0f, 0.0f, 13);
                dVar3 = dVar7;
                i78 i78VarA2 = g78.a(new kw0.i(wdw.a(r8) * 8.0f, true, new hw0()), aVar9, r8, 48);
                int iHashCode7 = Long.hashCode(r8.m());
                ne00 ne00VarS7 = r8.S();
                androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(r8, dVarJ);
                r8.D();
                if (r8.S) {
                    r8.F(aVar4);
                } else {
                    r8.p();
                }
                hlh0.a(r8, i78VarA2, bVar2);
                hlh0.a(r8, ne00VarS7, dVar);
                if (r8.S || !Intrinsics.g(r8.y(), Integer.valueOf(iHashCode7))) {
                    n30.a(iHashCode7, r8, iHashCode7, c1350a);
                }
                hlh0.a(r8, dVarC7, cVar);
                if (z7) {
                    r8.N(-398672305);
                    d(levelConfigDetailDto, str, userLevelProgressDto.getFbgHighestAwardedLevel(), r8, (i3 & 14) | ((i3 >> 9) & 112));
                    z2 = false;
                    r8.X(false);
                } else {
                    z2 = false;
                    r8.N(-398324361);
                    h(6, pp8.b(-26474115, new Function2() { // from class: l7s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            a aVar10 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar10.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                lkf0.b(str4, null, j58.f, wdw.c(11, aVar10), new n9i(1), t9i.E, null, 0L, new gdf0(3), 0L, 0, false, 2, 0, null, null, aVar10, 196992, 3072, 122306);
                            } else {
                                aVar10.G();
                            }
                            return Unit.a;
                        }
                    }, r8), r8);
                    r8.X(false);
                }
                z3 = true;
                f30.a(r8, true, true, z2);
                Unit unit4 = Unit.a;
                r5 = r8;
            } else if (iOrdinal2 == z) {
                bVar2 = bVar3;
                ?? r9 = r30;
                dVar3 = dVar2;
                boolean z9 = z;
                c1350a = c1350a3;
                aVar4 = aVar3;
                r9.N(-1796424469);
                androidx.compose.ui.d dVarG4 = j.g(l78Var.a(1.0f, aVar2, z9), 1.0f);
                aiv aivVarC5 = g75.c(n54Var5, false);
                int iHashCode8 = Long.hashCode(r9.m());
                n54Var2 = n54Var5;
                ne00 ne00VarS8 = r9.S();
                androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(r9, dVarG4);
                r9.D();
                final String str5 = strC4;
                if (r9.S) {
                    r9.F(aVar4);
                } else {
                    r9.p();
                }
                hlh0.a(r9, aivVarC5, bVar2);
                hlh0.a(r9, ne00VarS8, dVar);
                if (r9.S || !Intrinsics.g(r9.y(), Integer.valueOf(iHashCode8))) {
                    n30.a(iHashCode8, r9, iHashCode8, c1350a);
                }
                hlh0.a(r9, dVarC8, cVar);
                androidx.compose.ui.d dVarJ2 = h.j(dVar3.b(aVar2, n54Var7), 0.0f, wdw.a(r9) * 20.0f, 0.0f, 0.0f, 13);
                i78 i78VarA3 = g78.a(new kw0.i(wdw.a(r9) * 8.0f, true, new hw0()), aVar9, r9, 48);
                int iHashCode9 = Long.hashCode(r9.m());
                ne00 ne00VarS9 = r9.S();
                androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(r9, dVarJ2);
                r9.D();
                if (r9.S) {
                    r9.F(aVar4);
                } else {
                    r9.p();
                }
                hlh0.a(r9, i78VarA3, bVar2);
                hlh0.a(r9, ne00VarS9, dVar);
                if (r9.S || !Intrinsics.g(r9.y(), Integer.valueOf(iHashCode9))) {
                    n30.a(iHashCode9, r9, iHashCode9, c1350a);
                }
                hlh0.a(r9, dVarC9, cVar);
                if (z7) {
                    r9.N(-74663922);
                    d(levelConfigDetailDto, str, userLevelProgressDto.getFbgHighestAwardedLevel(), r9, (i3 & 14) | ((i3 >> 9) & 112));
                    z5 = false;
                    r9.X(false);
                } else {
                    z5 = false;
                    r9.N(-74315978);
                    h(6, pp8.b(-739672034, new Function2() { // from class: k7s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            a aVar10 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar10.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                lkf0.b(str5, null, j58.f, wdw.c(11, aVar10), new n9i(1), t9i.E, null, 0L, new gdf0(3), 0L, 0, false, 2, 0, null, null, aVar10, 196992, 3072, 122306);
                            } else {
                                aVar10.G();
                            }
                            return Unit.a;
                        }
                    }, r9), r9);
                    r9.X(false);
                }
                f30.a(r9, true, true, z5);
                Unit unit5 = Unit.a;
                z3 = true;
                r5 = r9;
            } else {
                if (iOrdinal2 != 2) {
                    throw igf0.a(r30, -612156976, false);
                }
                r30.N(-1797048778);
                androidx.compose.ui.d dVarG5 = j.g(l78Var.a(1.0f, aVar2, z), 1.0f);
                aiv aivVarC6 = g75.c(n54Var5, false);
                int iHashCode10 = Long.hashCode(r30.m());
                ne00 ne00VarS10 = r30.S();
                androidx.compose.ui.d dVarC10 = androidx.compose.ui.c.c(r30, dVarG5);
                r30.D();
                if (r30.S) {
                    r30.F(aVar3);
                } else {
                    r30.p();
                }
                hlh0.a(r30, aivVarC6, bVar3);
                hlh0.a(r30, ne00VarS10, dVar);
                if (r30.S || !Intrinsics.g(r30.y(), Integer.valueOf(iHashCode10))) {
                    n30.a(iHashCode10, r30, iHashCode10, c1350a3);
                }
                hlh0.a(r30, dVarC10, cVar);
                bVar2 = bVar3;
                dVar3 = dVar2;
                z3 = z;
                c1350a = c1350a3;
                ?? r15 = r30;
                aVar4 = aVar3;
                g(levelConfigDetailDto, str, userLevelProgressDto.getFbgHighestAwardedLevel(), j.e(aVar2, 1.0f), r15, (i3 & 14) | 3072 | ((i3 >> 9) & 112));
                r15.X(z3);
                r15.X(false);
                n54Var2 = n54Var5;
                r5 = r15;
            }
            r5.X(z3);
            x6sVar2 = x6sVar;
            if (x6sVar2 != x6sVar3) {
                r5.N(1442962174);
                aVar5 = aVar8;
                g75.a(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), j58.c(0.5f, j58.b), aVar5), r5, 6);
                z4 = false;
            } else {
                aVar5 = aVar8;
                z4 = false;
                r5.N(1401465264);
            }
            r5.X(z4);
            x6s x6sVar5 = x6s.c;
            if (x6sVar2 == x6sVar5) {
                r5.N(1443196348);
                androidx.compose.ui.d dVarF2 = h.f(j.e(aVar2, 1.0f), wdw.a(r5) * 12.0f);
                n54 n54Var8 = n54Var2;
                aiv aivVarC7 = g75.c(n54Var8, z4);
                int iHashCode11 = Long.hashCode(r5.m());
                ne00 ne00VarS11 = r5.S();
                androidx.compose.ui.d dVarC11 = androidx.compose.ui.c.c(r5, dVarF2);
                r5.D();
                yka.a.b bVar6 = bVar2;
                if (r5.S) {
                    r5.F(aVar4);
                } else {
                    r5.p();
                }
                bVar2 = bVar6;
                hlh0.a(r5, aivVarC7, bVar2);
                hlh0.a(r5, ne00VarS11, dVar);
                if (r5.S || !Intrinsics.g(r5.y(), Integer.valueOf(iHashCode11))) {
                    n30.a(iHashCode11, r5, iHashCode11, c1350a);
                }
                hlh0.a(r5, dVarC11, cVar);
                crz crzVarA = erz.a(R.drawable.ic_level_lock, 0, r5);
                androidx.compose.foundation.layout.d dVar8 = dVar3;
                androidx.compose.ui.d dVarR = j.r(dVar8.b(aVar2, n54Var7), 22.0f * wdw.a(r5));
                dVar4 = dVar8;
                ?? r17 = r5;
                n54Var3 = n54Var8;
                j = j2;
                r6 = 1;
                c1350a2 = c1350a;
                r7 = 0;
                h9n.a(crzVarA, null, dVarR, null, null, 0.0f, null, r17, 48, 120);
                ?? r16 = r17;
                r16.X(true);
                r11 = r16;
            } else {
                r7 = z4;
                j = j2;
                n54Var3 = n54Var2;
                dVar4 = dVar3;
                ?? r18 = r5;
                c1350a2 = c1350a;
                r6 = 1;
                r18.N(1401465264);
                r11 = r18;
            }
            r11.X(r7);
            if (x6sVar2 == x6sVar5 && levelConfigDetailDto.getLevel() == i + 1) {
                r11.N(1443876364);
                int normalRounds = userLevelProgressDto.getNormalRounds();
                if (normalRounds < r6) {
                    r14 = normalRounds;
                    r14 = r6;
                }
                r14 = normalRounds;
                float fD = f.d(f.e(userLevelProgressDto.getCompletedNormalRounds(), r7, r14) / ((float) r14), 0.0f, 1.0f);
                int normalRounds2 = userLevelProgressDto.getNormalRounds() - userLevelProgressDto.getCompletedNormalRounds();
                ?? r19 = normalRounds2;
                if (normalRounds2 < 0) {
                    r19 = r7;
                }
                if (r19 > r6) {
                    r11.N(1444230043);
                    strC = op5.c(op5Var, "no_of_rounds_to_unlock:sg_crash_games", pwo.f(R.string.sporty_cars_level_rounds_to_unlock_italic, new Object[]{Integer.valueOf((int) r19)}, r11));
                    r11.X(r7);
                } else {
                    r11.N(1444542461);
                    strC = op5.c(r37, "no_of_round_to_unlock:sg_crash_games", pwo.f(R.string.sporty_cars_level_round_to_unlock_italic, new Object[]{Integer.valueOf((int) r19)}, r11));
                    r11.X(r7);
                }
                String strP = kotlin.text.c.p(strC, "{roundsToUnlockNextLevel}", String.valueOf((int) r19), r7);
                androidx.compose.ui.d dVarF3 = h.f(j.e(aVar2, 1.0f), wdw.a(r11) * 12.0f);
                n54 n54Var9 = n54Var3;
                aiv aivVarC8 = g75.c(n54Var9, r7);
                int iHashCode12 = Long.hashCode(r11.m());
                ne00 ne00VarS12 = r11.S();
                androidx.compose.ui.d dVarC12 = androidx.compose.ui.c.c(r11, dVarF3);
                r11.D();
                if (r11.S) {
                    r11.F(aVar4);
                } else {
                    r11.p();
                }
                hlh0.a(r11, aivVarC8, bVar2);
                hlh0.a(r11, ne00VarS12, dVar);
                if (r11.S || !Intrinsics.g(r11.y(), Integer.valueOf(iHashCode12))) {
                    n30.a(iHashCode12, r11, iHashCode12, c1350a2);
                }
                hlh0.a(r11, dVarC12, cVar);
                androidx.compose.ui.d dVarB2 = dVar4.b(aVar2, ht.a.i);
                i78 i78VarA4 = g78.a(new kw0.i(wdw.a(r11) * 2.0f, r6, new hw0()), ht.a.n, r11, 48);
                int iHashCode13 = Long.hashCode(r11.m());
                ne00 ne00VarS13 = r11.S();
                androidx.compose.ui.d dVarC13 = androidx.compose.ui.c.c(r11, dVarB2);
                r11.D();
                if (r11.S) {
                    r11.F(aVar4);
                } else {
                    r11.p();
                }
                hlh0.a(r11, i78VarA4, bVar2);
                hlh0.a(r11, ne00VarS13, dVar);
                if (r11.S || !Intrinsics.g(r11.y(), Integer.valueOf(iHashCode13))) {
                    n30.a(iHashCode13, r11, iHashCode13, c1350a2);
                }
                hlh0.a(r11, dVarC13, cVar);
                zk40.a aVar10 = aVar5;
                androidx.compose.ui.d dVarB3 = androidx.compose.foundation.a.b(ls7.a(j.i(j.g(aVar2, 0.6f), wdw.a(r11) * 6.0f), j060.b(50)), r58.d(4279506716L), aVar10);
                aiv aivVarC9 = g75.c(n54Var9, false);
                int iHashCode14 = Long.hashCode(r11.m());
                ne00 ne00VarS14 = r11.S();
                androidx.compose.ui.d dVarC14 = androidx.compose.ui.c.c(r11, dVarB3);
                r11.D();
                if (r11.S) {
                    r11.F(aVar4);
                } else {
                    r11.p();
                }
                hlh0.a(r11, aivVarC9, bVar2);
                hlh0.a(r11, ne00VarS14, dVar);
                if (r11.S || !Intrinsics.g(r11.y(), Integer.valueOf(iHashCode14))) {
                    n30.a(iHashCode14, r11, iHashCode14, c1350a2);
                }
                hlh0.a(r11, dVarC14, cVar);
                long j3 = j;
                g75.a(androidx.compose.foundation.a.b(ls7.a(j.g(j.c(aVar2, 1.0f), fD), j060.b(50)), j3, aVar10), r11, 0);
                r11.X(true);
                ?? r31 = r11;
                lkf0.b(strP, null, j3, wdw.c(12, r11), n9i.a(), t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, r31, 196992, 0, 131010);
                ?? r110 = r31;
                r12 = 1;
                f30.a(r110, true, true, false);
                r13 = r110;
            } else {
                r12 = r6;
                r11.N(1401465264);
                r11.X(r7);
                r13 = r11;
            }
            r13.X(r12);
            r10 = r13;
        } else {
            androidx.compose.runtime.b bVar7 = bVarI;
            x6sVar2 = x6sVar;
            bVar7.G();
            r10 = bVar7;
        }
        e eVarZ = r10.Z();
        if (eVarZ != null) {
            final x6s x6sVar6 = x6sVar2;
            eVarZ.d = new Function2(x6sVar6, i, userLevelProgressDto, str, function1, function2, i2) { // from class: m7s
                public final /* synthetic */ x6s b;
                public final /* synthetic */ int c;
                public final /* synthetic */ UserLevelProgressDto d;
                public final /* synthetic */ String e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    e8s.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final LevelConfigDetailDto levelConfigDetailDto, final String str, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        final long j;
        boolean z;
        boolean z2;
        final LevelConfigDetailDto levelConfigDetailDto2 = levelConfigDetailDto;
        androidx.compose.runtime.b bVarI = aVar.i(1915788258);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(levelConfigDetailDto2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.d(i) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            op5 op5Var = op5.a;
            final String strC = op5.c(op5Var, "extra_cashout_bonus_rounds:sg_crash_games", pwo.e(R.string.sporty_cars_reward_pill_bonus_suffix, bVarI));
            final long jD = r58.d(4294963712L);
            long jD2 = r58.d(4294967295L);
            i78 i78VarA = g78.a(new kw0.i(wdw.a(bVarI) * 8.0f, true, new hw0()), ht.a.o, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, androidx.compose.ui.d.a.b);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (levelConfigDetailDto2.getBonusPercentage() > 0.0d) {
                bVarI.N(-2094615235);
                j = jD2;
                h(6, pp8.b(-663680708, new Function2() { // from class: r7s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        LevelConfigDetailDto levelConfigDetailDto3 = levelConfigDetailDto2;
                        String str2 = strC;
                        a aVar3 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            aVar3.N(-2141997227);
                            nk0.b bVar = new nk0.b((Object) null);
                            aVar3.N(-2141996714);
                            long jC = wdw.c(11, aVar3);
                            t9i t9iVar = t9i.E;
                            n9i n9iVar = new n9i(1);
                            long j2 = j;
                            int iL = bVar.l(new ora0(j2, jC, t9iVar, n9iVar, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65520));
                            try {
                                bVar.g(op5.c(op5.a, "win:sg_crash_games", pwo.e(R.string.sporty_cars_reward_pill_bonus_prefix, aVar3)));
                                bVar.g(" ");
                                Unit unit = Unit.a;
                                bVar.i(iL);
                                aVar3.H();
                                int iL2 = bVar.l(new ora0(jD, wdw.c(12, aVar3), t9iVar, new n9i(1), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65520));
                                try {
                                    bVar.g(((int) levelConfigDetailDto3.getBonusPercentage()) + "% ");
                                    bVar.i(iL2);
                                    int iL3 = bVar.l(new ora0(j2, wdw.c(11, aVar3), t9iVar, new n9i(1), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65520));
                                    try {
                                        bVar.g(str2);
                                        bVar.i(iL3);
                                        nk0 nk0VarM = bVar.m();
                                        aVar3.H();
                                        lkf0.c(nk0VarM, null, 0L, 0L, null, null, null, 0L, new gdf0(3), 0L, 2, false, 2, 0, null, null, null, aVar3, 0, 3120, 251390);
                                    } catch (Throwable th) {
                                        bVar.i(iL3);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    bVar.i(iL2);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                bVar.i(iL);
                                throw th3;
                            }
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI);
                z = false;
            } else {
                j = jD2;
                z = false;
                bVarI.N(-2142454218);
            }
            bVarI.X(z);
            if (levelConfigDetailDto.getFbgCount() <= 0 || levelConfigDetailDto.getFbgValue() <= 0.0d || levelConfigDetailDto.getLevel() <= i) {
                z2 = false;
                levelConfigDetailDto2 = levelConfigDetailDto;
                bVarI.N(-2142454218);
            } else {
                bVarI.N(-2092567313);
                final String strC2 = op5.c(op5Var, "fbg_worth:sg_crash_games", pwo.e(R.string.sporty_cars_reward_pill_fbg_mid, bVarI));
                final String strC3 = op5.c(op5Var, "win:sg_crash_games", pwo.e(R.string.sporty_cars_reward_pill_fbg_prefix, bVarI));
                double fbgValue = levelConfigDetailDto.getFbgValue();
                final int fbgCount = levelConfigDetailDto.getFbgCount() * Integer.parseInt(Math.abs(fbgValue % 1.0d) < 1.0E-9d ? String.valueOf((int) fbgValue) : String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(fbgValue)}, 1)));
                Function2 function2 = new Function2() { // from class: s7s
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = strC3;
                        LevelConfigDetailDto levelConfigDetailDto3 = levelConfigDetailDto;
                        String str3 = strC2;
                        int i4 = fbgCount;
                        String str4 = str;
                        a aVar3 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            aVar3.N(-1209742450);
                            nk0.b bVar = new nk0.b((Object) null);
                            long jC = wdw.c(11, aVar3);
                            t9i t9iVar = t9i.E;
                            n9i n9iVar = new n9i(1);
                            long j2 = j;
                            int iL = bVar.l(new ora0(j2, jC, t9iVar, n9iVar, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65520));
                            try {
                                bVar.g(str2);
                                bVar.g(" ");
                                Unit unit = Unit.a;
                                bVar.i(iL);
                                long jC2 = wdw.c(12, aVar3);
                                n9i n9iVar2 = new n9i(1);
                                long j3 = jD;
                                int iL2 = bVar.l(new ora0(j3, jC2, t9iVar, n9iVar2, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65520));
                                try {
                                    bVar.g(levelConfigDetailDto3.getFbgCount() + " ");
                                    bVar.i(iL2);
                                    int iL3 = bVar.l(new ora0(j2, wdw.c(11, aVar3), t9iVar, new n9i(1), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65520));
                                    try {
                                        bVar.g(str3);
                                        bVar.g(" ");
                                        bVar.i(iL3);
                                        int iL4 = bVar.l(new ora0(j3, wdw.c(12, aVar3), t9iVar, new n9i(1), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65520));
                                        try {
                                            bVar.g(i4 + " " + str4);
                                            bVar.i(iL4);
                                            nk0 nk0VarM = bVar.m();
                                            aVar3.H();
                                            lkf0.c(nk0VarM, null, 0L, 0L, null, null, null, 0L, new gdf0(3), 0L, 2, false, 2, 0, null, null, null, aVar3, 0, 3120, 251390);
                                        } catch (Throwable th) {
                                            bVar.i(iL4);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        bVar.i(iL3);
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    bVar.i(iL2);
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                bVar.i(iL);
                                throw th4;
                            }
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                };
                levelConfigDetailDto2 = levelConfigDetailDto;
                h(6, pp8.b(-1529748763, function2, bVarI), bVarI);
                z2 = false;
            }
            bVarI.X(z2);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: t7s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    e8s.d(levelConfigDetailDto2, str, i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final String str, final Function0 function0, final Function0 function1, final List list, final Double d2, final String str2, final int i, final int i2, final String str3, final long j, final int i3, final List list2, final UserLevelProgressDto userLevelProgressDto, final String str4, final Function0 function2, final boolean z, final boolean z2, final boolean z3, final Function1 function3, final Function1 function4, final Integer num, final Float f, final String str5, final String str6, final String str7, final Function0 function5, final Function0 function6, androidx.compose.runtime.a aVar, final int i4) {
        list.getClass();
        function3.getClass();
        function4.getClass();
        str6.getClass();
        str7.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1415290081);
        int i5 = i4 | (bVarI.M(str) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(list) ? 2048 : 1024) | (bVarI.M(d2) ? 16384 : 8192) | (bVarI.M(str2) ? 131072 : 65536) | (bVarI.d(i) ? 1048576 : 524288) | (bVarI.d(i2) ? 8388608 : 4194304) | (bVarI.M(str3) ? 67108864 : 33554432) | (bVarI.e(j) ? 536870912 : 268435456);
        if (bVarI.q(i5 & 1, ((i5 & 306783379) == 306783378 && (((((((((((bVarI.d(i3) ? (char) 4 : (char) 2) | (bVarI.A(list2) ? ' ' : (char) 16)) | (bVarI.M(userLevelProgressDto) ? 256 : 128)) | (bVarI.M(str4) ? 2048 : 1024)) | (bVarI.A(function2) ? 16384 : 8192)) | (bVarI.b(z) ? 131072 : 65536)) | (bVarI.b(z2) ? 1048576 : 524288)) | (bVarI.b(z3) ? (char) 0 : (char) 0)) | (bVarI.A(function3) ? (char) 0 : (char) 0)) | (bVarI.A(function4) ? (char) 0 : (char) 0)) & 306783379) == 306783378 && ((((((((bVarI.M(num) ? (char) 4 : (char) 2) | (bVarI.M(f) ? ' ' : (char) 16)) | (bVarI.M(str5) ? 256 : 128)) | (bVarI.M(str6) ? 2048 : 1024)) | (bVarI.M(str7) ? (char) 16384 : (char) 8192)) | (bVarI.A(function5) ? (char) 0 : (char) 0)) | (bVarI.A(function6) ? (char) 0 : (char) 0)) & 599187) == 599186) ? false : true)) {
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new g7f(configuration.screenHeightDp);
                bVarI.r(objY);
            }
            final float f2 = ((g7f) objY).a * 0.7f;
            k590 k590Var = k590.a;
            final j590 j590VarE = k65.e(390, 2, bVarI);
            final l65 l65VarD = k65.d(j590VarE, bVarI, 2);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY2);
            }
            final v5b v5bVar = (v5b) objY2;
            hna.a(wdw.a.a(wdw.d(bVarI)), pp8.b(-1519242847, new Function2() { // from class: u7s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        i060 i060VarE = j060.e(wdw.a(aVar2) * 16.0f, wdw.a(aVar2) * 16.0f, 0.0f, 0.0f, 12);
                        long jD = r58.d(4279900958L);
                        long j2 = j58.l;
                        float fA = wdw.a(aVar2) * 8.0f;
                        final float f3 = f2;
                        final Function0 function7 = function2;
                        final v5b v5bVar2 = v5bVar;
                        final j590 j590Var = j590VarE;
                        final int i6 = i3;
                        final List list3 = list2;
                        final UserLevelProgressDto userLevelProgressDto2 = userLevelProgressDto;
                        final String str8 = str4;
                        final boolean z4 = z;
                        final boolean z5 = z2;
                        final boolean z6 = z3;
                        final Function1 function8 = function3;
                        final Function1 function9 = function4;
                        final Integer num2 = num;
                        final Float f4 = f;
                        op8 op8VarB = pp8.b(-1713913872, new gaj() { // from class: d7s
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d dVarI = j.i(j.g(d.a.b, 1.0f), f3);
                                    aiv aivVarC = g75.c(ht.a.a, false);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarI);
                                    yka.k.getClass();
                                    tsr.a aVar4 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar4);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, aivVarC, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC, yka.a.d);
                                    final Function0 function10 = function7;
                                    boolean zM = aVar3.M(function10);
                                    final v5b v5bVar3 = v5bVar2;
                                    boolean zA = zM | aVar3.A(v5bVar3);
                                    final j590 j590Var2 = j590Var;
                                    boolean zM2 = zA | aVar3.M(j590Var2);
                                    Object objY3 = aVar3.y();
                                    if (zM2 || objY3 == a.C0041a.a) {
                                        objY3 = new Function0() { // from class: w7s
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function10.invoke();
                                                ej5.c(v5bVar3, null, null, new d8s(j590Var2, null), 3);
                                                return Unit.a;
                                            }
                                        };
                                        aVar3.r(objY3);
                                    }
                                    e8s.k((Function0) objY3, i6, list3, userLevelProgressDto2, str8, z4, z5, z6, function8, function9, num2, f4, aVar3, 0);
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2);
                        final String str9 = str;
                        final Double d3 = d2;
                        final List list4 = list;
                        final String str10 = str5;
                        final Function0 function10 = function0;
                        final Function0 function11 = function1;
                        final String str11 = str2;
                        final int i7 = i;
                        final int i8 = i2;
                        final long j3 = j;
                        final String str12 = str3;
                        final Function0 function12 = function5;
                        final Function0 function13 = function6;
                        final String str13 = str6;
                        final String str14 = str7;
                        k65.a(op8VarB, null, l65VarD, f3, 0.0f, i060VarE, jD, 0L, fA, null, false, null, j2, 0L, pp8.b(1863716038, new gaj() { // from class: n7s
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                String str15;
                                List list5;
                                Function0 function14;
                                Function0 function15;
                                n7s n7sVar;
                                int i9;
                                Function0 function16;
                                Function0 function17;
                                tmz tmzVar = (tmz) obj3;
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                tmzVar.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= aVar3.M(tmzVar) ? 4 : 2;
                                }
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    d.a aVar4 = d.a.b;
                                    d dVarE = h.e(j.e(aVar4, 1.0f), tmzVar);
                                    aiv aivVarC = g75.c(ht.a.h, false);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarE);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar3, aivVarC, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar3, ne00VarO, dVar);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar3, dVarC, cVar);
                                    d dVarJ = h.j(aVar4, 0.0f, 0.0f, 0.0f, wdw.a(aVar3) * 20.0f, 7);
                                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO2 = aVar3.o();
                                    d dVarC2 = c.c(aVar3, dVarJ);
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, i78VarA, bVar);
                                    hlh0.a(aVar3, ne00VarO2, dVar);
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC2, cVar);
                                    String str16 = str9;
                                    boolean zG = Intrinsics.g(str16, "ROUND_ONGOING");
                                    Double d4 = d3;
                                    List list6 = list4;
                                    String str17 = str10;
                                    Function0 function18 = function10;
                                    Function0 function19 = function11;
                                    if (zG) {
                                        aVar3.N(-858579544);
                                        lkf0.b(d4 + "x", null, j58.f, wdw.c(32, aVar3), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar3, 196992, 0, 131026);
                                        List listL = dg7.l(str17, list6);
                                        if (listL.isEmpty() || dg7.m(str17)) {
                                            aVar3 = aVar3;
                                            aVar3 = aVar3;
                                            function16 = function18;
                                            function17 = function19;
                                            i9 = -866548776;
                                            aVar3.N(-866548776);
                                            aVar3.H();
                                        } else {
                                            aVar3 = aVar3;
                                            aVar3.N(-858107445);
                                            function16 = function18;
                                            function17 = function19;
                                            dg7.d(listL, function16, function17, aVar3, 48);
                                            aVar3.H();
                                            i9 = -866548776;
                                        }
                                        aVar3.H();
                                        str15 = str17;
                                        list5 = list6;
                                        function14 = function16;
                                        function15 = function17;
                                        n7sVar = this;
                                    } else {
                                        if (Intrinsics.g(str16, "ROUND_END_WAIT")) {
                                            aVar3.N(-857723417);
                                            function15 = function19;
                                            long j4 = j58.f;
                                            long jC = wdw.c(22, aVar3);
                                            t9i t9iVar = t9i.E;
                                            function14 = function18;
                                            list5 = list6;
                                            str15 = str17;
                                            lkf0.b(str11, null, j4, jC, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar3, 196992, 0, 131026);
                                            lkf0.b(d4 + "x", null, j58.g, wdw.c(32, aVar3), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar3, 196992, 0, 131026);
                                            aVar3 = aVar3;
                                            aVar3.H();
                                            n7sVar = this;
                                        } else {
                                            str15 = str17;
                                            list5 = list6;
                                            function14 = function18;
                                            function15 = function19;
                                            if (Intrinsics.g(str16, "ROUND_WAITING")) {
                                                aVar3.N(-857097217);
                                                n7sVar = this;
                                                dg7.j(i7, i8, j3, str12, aVar3, 0);
                                                aVar3.H();
                                            } else {
                                                n7sVar = this;
                                                i9 = -866548776;
                                                aVar3.N(-866548776);
                                                aVar3.H();
                                            }
                                        }
                                        i9 = -866548776;
                                    }
                                    if (list5.isEmpty() || !dg7.m(str15)) {
                                        aVar3.N(i9);
                                    } else {
                                        aVar3.N(-856867290);
                                        a aVar6 = aVar3;
                                        dg7.b(list5, function14, function15, function12, function13, str13, str14, aVar6, 48);
                                        aVar3 = aVar6;
                                    }
                                    aVar3.H();
                                    aVar3.s();
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 1575942);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, function0, function1, list, d2, str2, i, i2, str3, j, i3, list2, userLevelProgressDto, str4, function2, z, z2, z3, function3, function4, num, f, str5, str6, str7, function5, function6, i4) { // from class: v7s
                public final /* synthetic */ List A;
                public final /* synthetic */ UserLevelProgressDto B;
                public final /* synthetic */ String C;
                public final /* synthetic */ Function0 D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ Function1 H;
                public final /* synthetic */ Function1 I;
                public final /* synthetic */ Integer J;
                public final /* synthetic */ Float K;
                public final /* synthetic */ String L;
                public final /* synthetic */ String M;
                public final /* synthetic */ String N;
                public final /* synthetic */ Function0 O;
                public final /* synthetic */ Function0 P;
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ List d;
                public final /* synthetic */ Double e;
                public final /* synthetic */ String f;
                public final /* synthetic */ int i;
                public final /* synthetic */ int v;
                public final /* synthetic */ String w;
                public final /* synthetic */ long y;
                public final /* synthetic */ int z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    e8s.e(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final List<LevelConfigDetailDto> list, final UserLevelProgressDto userLevelProgressDto, final String str, final int i, final fs50 fs50Var, final Function1<? super fs50, Unit> function1, final Function1<? super Integer, Integer> function2, final Function1<? super Integer, String> function3, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        Function1<? super Integer, Integer> function4;
        Function1<? super Integer, String> function5;
        androidx.compose.runtime.b bVar;
        int level;
        androidx.compose.runtime.b bVarI = aVar.i(-1586512750);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.A(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(userLevelProgressDto) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.d(fs50Var.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            function4 = function2;
            i3 |= bVarI.A(function4) ? 1048576 : 524288;
        } else {
            function4 = function2;
        }
        if ((12582912 & i2) == 0) {
            function5 = function3;
            i3 |= bVarI.A(function5) ? 8388608 : 4194304;
        } else {
            function5 = function3;
        }
        if (bVarI.q(i3 & 1, (i3 & 4792467) != 4792466)) {
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            boolean zM = bVarI.M(list);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = CollectionsKt.r0(list, new a());
                bVarI.r(objY);
            }
            final List list2 = (List) objY;
            if (userLevelProgressDto == null || (level = userLevelProgressDto.getLevel()) < 1) {
                level = 1;
            }
            androidx.compose.ui.d dVarE = j.e(androidx.compose.ui.d.a.b, 1.0f);
            kw0.i iVar = new kw0.i(wdw.a(bVarI) * 12.0f, true, new hw0());
            umz umzVarB = h.b(wdw.a(bVarI) * 16.0f, 0.0f, wdw.a(bVarI) * 16.0f, 16.0f * wdw.a(bVarI), 2);
            boolean zA = ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | bVarI.A(list) | ((i3 & 112) == 32) | bVarI.A(list2) | bVarI.d(level) | ((i3 & 896) == 256) | ((3670016 & i3) == 1048576) | ((i3 & 29360128) == 8388608);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                final Function1<? super Integer, Integer> function6 = function4;
                final Function1<? super Integer, String> function7 = function5;
                final int i4 = level;
                Function1 function8 = new Function1() { // from class: b8s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final fs50 fs50Var2 = fs50Var;
                        final Function1 function9 = function1;
                        szr.h(szrVar, "rewards_tab_row", new op8(-134693529, new gaj() { // from class: e7s
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    e8s.j(fs50Var2, function9, h.j(j.g(d.a.b, 1.0f), 0.0f, wdw.a(aVar2) * 10.0f, 0.0f, wdw.a(aVar2) * 10.0f, 5), aVar2, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true), 2);
                        if (list.isEmpty()) {
                            szr.h(szrVar, "levels_empty", pb9.a, 2);
                        } else {
                            final UserLevelProgressDto userLevelProgressDto2 = userLevelProgressDto;
                            if (userLevelProgressDto2 == null) {
                                szr.h(szrVar, "levels_loading", pb9.b, 2);
                            } else {
                                f7s f7sVar = new f7s(0);
                                List list3 = list2;
                                szrVar.d(list3.size(), new e8s.b(f7sVar, list3), new e8s.c(list3), new op8(802480018, new e8s.d(list3, i4, userLevelProgressDto2, str, function6, function7), true));
                                szr.h(szrVar, "reset_progress_footer", new op8(810918248, new gaj() { // from class: g7s
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        a aVar2;
                                        a aVar3 = (a) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((gwr) obj2).getClass();
                                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            int resetProgressInDays = userLevelProgressDto2.getResetProgressInDays();
                                            String strP = kotlin.text.c.p(op5.c(op5.a, "level_reset_message:sg_crash_games", pwo.f(R.string.sporty_cars_level_reset_progress_footer, new Object[]{Integer.valueOf(resetProgressInDays)}, aVar3)), "{levelResetDays}", String.valueOf(resetProgressInDays), false);
                                            if (resetProgressInDays > 0) {
                                                aVar3.N(-1124847547);
                                                lkf0.b("* ".concat(strP), h.j(j.g(d.a.b, 1.0f), 0.0f, wdw.a(aVar3) * 8.0f, 0.0f, wdw.a(aVar3) * 16.0f, 5), r58.d(4290295992L), wdw.c(14, aVar3), new n9i(1), t9i.D, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar3, 196992, 0, 130496);
                                                aVar2 = aVar3;
                                            } else {
                                                aVar2 = aVar3;
                                                aVar2.N(-1145996646);
                                            }
                                            aVar2.H();
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true), 2);
                            }
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function8);
                objY2 = function8;
            }
            bVar = bVarI;
            aur.a(dVarE, zzrVarA, umzVarB, false, iVar, null, null, false, null, (Function1) objY2, bVar, 6, 488);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: c8s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    e8s.f(list, userLevelProgressDto, str, i, fs50Var, function1, function2, function3, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final LevelConfigDetailDto levelConfigDetailDto, final String str, final int i, final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(534744035);
        int i3 = i2 | (bVarI.M(levelConfigDetailDto) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        int i4 = i3 | (bVarI.d(i) ? 256 : 128);
        if (bVarI.q(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z = levelConfigDetailDto.getBonusPercentage() > 0.0d || (levelConfigDetailDto.getFbgCount() > 0 && levelConfigDetailDto.getFbgValue() > 0.0d && levelConfigDetailDto.getLevel() > i);
            String strC = op5.c(op5.a, "no_reward_text:sg_game_name", "");
            bVarI.N(-1507047078);
            if (StringsKt.U(strC)) {
                strC = pwo.e(R.string.sporty_cars_level_locked_hint, bVarI);
            }
            bVarI.X(false);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarJ = h.j(androidx.compose.foundation.layout.d.a.b(androidx.compose.ui.d.a.b, ht.a.c), 0.0f, wdw.a(bVarI) * 12.0f, 0.0f, 0.0f, 13);
            boolean z2 = z;
            i78 i78VarA = g78.a(new kw0.i(wdw.a(bVarI) * 8.0f, true, new hw0()), ht.a.o, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (z2) {
                bVarI.N(-471507615);
                d(levelConfigDetailDto, str, i, bVarI, i4 & 1022);
                bVarI.X(false);
            } else {
                bVarI.N(-471270372);
                h(6, pp8.b(-1933932776, new o7s(strC), bVarI), bVarI);
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p7s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e8s.g(levelConfigDetailDto, str, i, dVar, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(int i, op8 op8Var, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1724115338);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            androidx.compose.ui.d dVarG = h.g(androidx.compose.foundation.a.b(h.j(androidx.compose.ui.d.a.b, wdw.a(bVarI) * 50.0f, 0.0f, 0.0f, 0.0f, 14), r58.b(1711276032), j060.c(wdw.a(bVarI) * 999.0f)), wdw.a(bVarI) * 10.0f, wdw.a(bVarI) * 4.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            w1i.a(6, op8Var, bVarI, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new yii(i, op8Var);
        }
    }

    public static final void i(final String str, final boolean z, final Function0 function0, final long j, final androidx.compose.ui.d dVar, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        i060 i060VarD;
        androidx.compose.runtime.b bVarI = aVar.i(-3292138);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            long jD = r58.d(z ? 4278782734L : 4280558887L);
            long j2 = z ? j : j58.f;
            if (z2) {
                bVarI.N(1131234124);
                i060VarD = j060.d(wdw.a(bVarI) * 8.0f, 0.0f, 0.0f, wdw.a(bVarI) * 8.0f);
                bVarI.X(false);
            } else {
                bVarI.N(1131238054);
                i060VarD = j060.d(0.0f, wdw.a(bVarI) * 8.0f, wdw.a(bVarI) * 8.0f, 0.0f);
                bVarI.X(false);
            }
            androidx.compose.ui.d dVarH = h.h(androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(ls7.a(dVar, i060VarD), jD, zk40.a), false, null, null, function0, 15), 0.0f, wdw.a(bVarI) * 6.0f, 1);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.b(str, null, j2, wdw.c(14, bVarI), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, (i2 & 14) | 196608, 0, 131026);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, function0, j, dVar, z2, i) { // from class: j7s
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ d e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(199681);
                    e8s.i(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final fs50 fs50Var, final Function1 function1, final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1671004102);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(fs50Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            long jD = r58.d(4278255381L);
            op5 op5Var = op5.a;
            String strC = op5.c(op5Var, "bonus_rounds:sg_crash_games", pwo.e(R.string.sporty_cars_rewards_tab_bonus, bVarI));
            String strC2 = op5.c(op5Var, "levels:sg_crash_games", pwo.e(R.string.multi_level_rewards_tab_levels, bVarI));
            androidx.compose.ui.d dVarG = h.g(ls7.a(dVar, j060.c(wdw.a(bVarI) * 12.0f)), wdw.a(bVarI) * 4.0f, wdw.a(bVarI) * 6.0f);
            d160 d160VarA = b160.a(kw0.f, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            boolean z = fs50Var == fs50.a;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new iii(1, function1);
                bVarI.r(objY);
            }
            Function0 function0 = (Function0) objY;
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            i(strC2, z, function0, jD, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), true, bVarI, 199680);
            boolean z3 = fs50Var == fs50.b;
            boolean z4 = i3 == 32;
            Object objY2 = bVarI.y();
            if (z4 || objY2 == c0042a) {
                objY2 = new h7s(0, function1);
                bVarI.r(objY2);
            }
            Function0 function2 = (Function0) objY2;
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            i(strC, z3, function2, jD, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, bVarI, 199680);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: i7s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    e8s.j(fs50Var, function1, dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x030c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0312  */
    /* JADX WARN: Code duplicated, block: B:111:0x0333  */
    /* JADX WARN: Code duplicated, block: B:114:0x0346  */
    /* JADX WARN: Code duplicated, block: B:116:0x0349  */
    /* JADX WARN: Code duplicated, block: B:118:0x036e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0372  */
    /* JADX WARN: Code duplicated, block: B:124:0x038d  */
    /* JADX WARN: Code duplicated, block: B:128:0x03db  */
    /* JADX WARN: Code duplicated, block: B:131:0x0427  */
    /* JADX WARN: Code duplicated, block: B:133:0x042f  */
    /* JADX WARN: Code duplicated, block: B:136:0x044a  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(final Function0 function0, final int i, final List list, final UserLevelProgressDto userLevelProgressDto, final String str, final boolean z, final boolean z2, final boolean z3, final Function1 function1, final Function1 function2, final Integer num, final Float f, androidx.compose.runtime.a aVar, final int i2) {
        String str2;
        yka.a.c cVar;
        int iHashCode;
        n54 n54Var;
        boolean z4;
        Object objY;
        int iHashCode2;
        tsr.a aVar2;
        int iOrdinal;
        boolean zM;
        Object objY2;
        int iHashCode3;
        boolean zM2;
        Object objY3;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(503066021);
        int i3 = i2 | (bVarI.A(function0) ? 4 : 2) | (bVarI.d(i) ? 32 : 16) | (bVarI.A(list) ? 256 : 128) | (bVarI.M(userLevelProgressDto) ? 2048 : 1024) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z) ? 131072 : 65536) | (bVarI.b(z2) ? 1048576 : 524288) | (bVarI.b(z3) ? 8388608 : 4194304) | (bVarI.A(function1) ? 67108864 : 33554432) | (bVarI.A(function2) ? 536870912 : 268435456);
        int i4 = (bVarI.M(num) ? 4 : 2) | (bVarI.M(f) ? 32 : 16);
        if (bVarI.q(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            boolean z5 = (i3 & 458752) == 131072;
            Object objY4 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z5 || objY4 == c0042a) {
                objY4 = m.b(z ? fs50.b : fs50.a);
                bVarI.r(objY4);
            }
            ytw ytwVar = (ytw) objY4;
            String strC = op5.c(op5.a, "levels_rewards:sg_crash_games", pwo.e(R.string.multi_level_rewards_bonus_header_title, bVarI));
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar3, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                str2 = strC;
            } else {
                str2 = strC;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                androidx.compose.ui.d dVarG = j.g(aVar3, 1.0f);
                long jD = r58.d(4280757042L);
                zk40.a aVar5 = zk40.a;
                androidx.compose.ui.d dVarG2 = h.g(androidx.compose.foundation.a.b(dVarG, jD, aVar5), wdw.a(bVarI) * 16.0f, 12.0f * wdw.a(bVarI));
                n54 n54Var2 = ht.a.a;
                aiv aivVarC = g75.c(n54Var2, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                hfs hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4293968997L)), new j58(r58.d(4294963151L))), null, 0L, 9187343241974906880L, 0);
                long jC = wdw.c(18, bVarI);
                t9i t9iVar = t9i.E;
                imf0 imf0Var = new imf0(hfsVar, jC, t9iVar, null, null, null, 0L, 33554418);
                long jC2 = wdw.c(18, bVarI);
                androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                n54Var = ht.a.e;
                lkf0.b(str2, dVar2.b(aVar3, n54Var), 0L, jC2, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 196608, 0, 65492);
                crz crzVarA = erz.a(R.drawable.ic_close_icon, 0, bVarI);
                long j = j58.f;
                androidx.compose.ui.d dVarB = dVar2.b(aVar3, ht.a.f);
                if ((i3 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objY = bVarI.y();
                if (z4 || objY == c0042a) {
                    objY = new x7s(function0, 0);
                    bVarI.r(objY);
                }
                h6n.b(crzVarA, "Close", androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY, 15), j, bVarI, 3120, 0);
                bVarI.X(true);
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(j.g(new LayoutWeightElement(1.0f, true), 1.0f), r58.d(4279506716L), aVar5);
                aiv aivVarC2 = g75.c(n54Var2, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarB2);
                bVarI.D();
                if (bVarI.S) {
                    aVar2 = aVar4;
                    bVarI.F(aVar2);
                } else {
                    aVar2 = aVar4;
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                iOrdinal = ((fs50) ytwVar.getValue()).ordinal();
                if (iOrdinal != 0) {
                    bVarI.N(302965150);
                    fs50 fs50Var = (fs50) ytwVar.getValue();
                    zM = bVarI.M(ytwVar);
                    objY2 = bVarI.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new eji(ytwVar, 1);
                        bVarI.r(objY2);
                    }
                    int i5 = i3 >> 6;
                    f(list, userLevelProgressDto, str, i, fs50Var, (Function1) objY2, function1, function2, bVarI, (i5 & 1022) | ((i3 << 6) & 7168) | (3670016 & i5) | (i5 & 29360128));
                    bVarI = bVarI;
                    bVarI.X(false);
                    Unit unit = Unit.a;
                } else {
                    if (iOrdinal == 1) {
                        throw igf0.a(bVarI, 302964441, false);
                    }
                    bVarI.N(302982965);
                    androidx.compose.ui.d dVarE2 = j.e(aVar3, 1.0f);
                    aiv aivVarC3 = g75.c(n54Var, false);
                    iHashCode3 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS4 = bVarI.S();
                    androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarE2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC3, bVar);
                    hlh0.a(bVarI, ne00VarS4, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                    }
                    hlh0.a(bVarI, dVarC4, cVar);
                    h9n.a(erz.a(R.drawable.ic_bonus_round_bg, 0, bVarI), null, j.t(aVar3, wdw.a(bVarI) * 240.0f, wdw.a(bVarI) * 315.0f), null, null, 0.0f, null, bVarI, 48, 120);
                    fs50 fs50Var2 = (fs50) ytwVar.getValue();
                    zM2 = bVarI.M(ytwVar);
                    objY3 = bVarI.y();
                    if (zM2 || objY3 == c0042a) {
                        objY3 = new y7s(ytwVar);
                        bVarI.r(objY3);
                    }
                    int i6 = i3 >> 12;
                    int i7 = ((i3 >> 9) & 14) | 100663296 | ((i3 >> 3) & 112) | (i6 & 896) | (i6 & 7168);
                    int i8 = i4 << 12;
                    a(userLevelProgressDto, list, z2, z3, num, f, fs50Var2, (Function1) objY3, j.e(aVar3, 1.0f), bVarI, i7 | (57344 & i8) | (i8 & 458752));
                    bVarI = bVarI;
                    bVarI.X(true);
                    bVarI.X(false);
                    Unit unit2 = Unit.a;
                }
                bVarI.X(true);
                bVarI.X(true);
            }
            n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarG3 = j.g(aVar3, 1.0f);
            long jD2 = r58.d(4280757042L);
            zk40.a aVar6 = zk40.a;
            androidx.compose.ui.d dVarG4 = h.g(androidx.compose.foundation.a.b(dVarG3, jD2, aVar6), wdw.a(bVarI) * 16.0f, 12.0f * wdw.a(bVarI));
            n54 n54Var3 = ht.a.a;
            aiv aivVarC4 = g75.c(n54Var3, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarG4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, bVar);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            hfs hfsVar2 = new hfs(kotlin.collections.b.k(new j58(r58.d(4293968997L)), new j58(r58.d(4294963151L))), null, 0L, 9187343241974906880L, 0);
            long jC3 = wdw.c(18, bVarI);
            t9i t9iVar2 = t9i.E;
            imf0 imf0Var2 = new imf0(hfsVar2, jC3, t9iVar2, null, null, null, 0L, 33554418);
            long jC4 = wdw.c(18, bVarI);
            androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
            n54Var = ht.a.e;
            lkf0.b(str2, dVar3.b(aVar3, n54Var), 0L, jC4, null, t9iVar2, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var2, bVarI, 196608, 0, 65492);
            crz crzVarA2 = erz.a(R.drawable.ic_close_icon, 0, bVarI);
            long j2 = j58.f;
            androidx.compose.ui.d dVarB3 = dVar3.b(aVar3, ht.a.f);
            if ((i3 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            objY = bVarI.y();
            if (z4) {
                objY = new x7s(function0, 0);
                bVarI.r(objY);
            } else {
                objY = new x7s(function0, 0);
                bVarI.r(objY);
            }
            h6n.b(crzVarA2, "Close", androidx.compose.foundation.d.d(dVarB3, false, null, null, (Function0) objY, 15), j2, bVarI, 3120, 0);
            bVarI.X(true);
            androidx.compose.ui.d dVarB4 = androidx.compose.foundation.a.b(j.g(new LayoutWeightElement(1.0f, true), 1.0f), r58.d(4279506716L), aVar6);
            aiv aivVarC5 = g75.c(n54Var3, false);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(bVarI, dVarB4);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar4;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar4;
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC5, bVar);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar);
            iOrdinal = ((fs50) ytwVar.getValue()).ordinal();
            if (iOrdinal != 0) {
                bVarI.N(302965150);
                fs50 fs50Var3 = (fs50) ytwVar.getValue();
                zM = bVarI.M(ytwVar);
                objY2 = bVarI.y();
                if (zM) {
                    objY2 = new eji(ytwVar, 1);
                    bVarI.r(objY2);
                } else {
                    objY2 = new eji(ytwVar, 1);
                    bVarI.r(objY2);
                }
                int i9 = i3 >> 6;
                f(list, userLevelProgressDto, str, i, fs50Var3, (Function1) objY2, function1, function2, bVarI, (i9 & 1022) | ((i3 << 6) & 7168) | (3670016 & i9) | (i9 & 29360128));
                bVarI = bVarI;
                bVarI.X(false);
                Unit unit3 = Unit.a;
            } else {
                if (iOrdinal == 1) {
                    throw igf0.a(bVarI, 302964441, false);
                }
                bVarI.N(302982965);
                androidx.compose.ui.d dVarE3 = j.e(aVar3, 1.0f);
                aiv aivVarC6 = g75.c(n54Var, false);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS7 = bVarI.S();
                androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(bVarI, dVarE3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC6, bVar);
                hlh0.a(bVarI, ne00VarS7, dVar);
                if (bVarI.S) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                } else {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC7, cVar);
                h9n.a(erz.a(R.drawable.ic_bonus_round_bg, 0, bVarI), null, j.t(aVar3, wdw.a(bVarI) * 240.0f, wdw.a(bVarI) * 315.0f), null, null, 0.0f, null, bVarI, 48, 120);
                fs50 fs50Var4 = (fs50) ytwVar.getValue();
                zM2 = bVarI.M(ytwVar);
                objY3 = bVarI.y();
                if (zM2) {
                    objY3 = new y7s(ytwVar);
                    bVarI.r(objY3);
                } else {
                    objY3 = new y7s(ytwVar);
                    bVarI.r(objY3);
                }
                int i10 = i3 >> 12;
                int i11 = ((i3 >> 9) & 14) | 100663296 | ((i3 >> 3) & 112) | (i10 & 896) | (i10 & 7168);
                int i12 = i4 << 12;
                a(userLevelProgressDto, list, z2, z3, num, f, fs50Var4, (Function1) objY3, j.e(aVar3, 1.0f), bVarI, i11 | (57344 & i12) | (i12 & 458752));
                bVarI = bVarI;
                bVarI.X(true);
                bVarI.X(false);
                Unit unit4 = Unit.a;
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, list, userLevelProgressDto, str, z, z2, z3, function1, function2, num, f, i2) { // from class: z7s
                public final /* synthetic */ Float A;
                public final /* synthetic */ int b;
                public final /* synthetic */ List c;
                public final /* synthetic */ UserLevelProgressDto d;
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Function1 w;
                public final /* synthetic */ Function1 y;
                public final /* synthetic */ Integer z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    e8s.k(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
