package com.sportybet.feature.loyalty.impl.notifications.presentation.mission;

import android.net.Uri;
import android.util.Pair;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportygames.externalgames.model.GamesMetadataFilter;
import com.sportygames.externalgames.model.GamesMetadataResponse;
import com.sportygames.externalgames.model.GamesMetadataSortBy;
import defpackage.azm;
import defpackage.bki0;
import defpackage.bwf0;
import defpackage.c0d;
import defpackage.c8k;
import defpackage.dwt;
import defpackage.e48;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.j8i0;
import defpackage.jih;
import defpackage.jmh0;
import defpackage.k00;
import defpackage.l48;
import defpackage.lk50;
import defpackage.lq1;
import defpackage.o8i0;
import defpackage.osv;
import defpackage.pdd0;
import defpackage.qq1;
import defpackage.rdd0;
import defpackage.rgf;
import defpackage.rtv;
import defpackage.rwt;
import defpackage.s5y;
import defpackage.swt;
import defpackage.tje0;
import defpackage.uag;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uti;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.vu60;
import defpackage.vxf0;
import defpackage.wae;
import defpackage.wsv;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.yi5;
import defpackage.zi50;
import defpackage.zs6;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/mission/e;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e extends j8i0 {
    public static final GamesMetadataSortBy z = GamesMetadataSortBy.ONLINE_USER_COUNT;
    public final rdd0 a;
    public final azm b;
    public final lq1 c;
    public final yi5 d;
    public final jih e;
    public final c8k f;
    public final uti i;
    public final LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument v;
    public final wwd0 w;
    public final b y;

    @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetViewModel$1", f = "LoyaltyMissionBottomSheetViewModel.kt", l = {167}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return e.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            d dVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                e eVar = e.this;
                LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument missionBottomSheetArgument = eVar.v;
                if (missionBottomSheetArgument instanceof LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.GamesCarouselMission) {
                    this.a = 1;
                    if (eVar.z1((LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.GamesCarouselMission) missionBottomSheetArgument, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (!(missionBottomSheetArgument instanceof LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.RegularMission)) {
                        uhc.a();
                        return null;
                    }
                    LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.RegularMission regularMission = (LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.RegularMission) missionBottomSheetArgument;
                    Integer num = regularMission.b;
                    wsv wsvVar = regularMission.a;
                    if (wsvVar != wsv.a || num == null) {
                        int iOrdinal = wsvVar.ordinal();
                        if (iOrdinal == 0) {
                            dVar = d.a.b.C0392b.a;
                        } else {
                            if (iOrdinal != 1) {
                                uhc.a();
                                return null;
                            }
                            dVar = d.a.b.C0391a.a;
                        }
                        eVar.y1(dVar);
                    } else {
                        ej5.c(o8i0.d(eVar), null, null, new g(eVar, num, wsvVar, null), 3);
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class b implements com.sportybet.feature.loyalty.impl.notifications.presentation.mission.b {
        public b() {
        }

        @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.b
        public final void a() {
            pdd0 iVar;
            e eVar = e.this;
            d dVar = (d) eVar.w.getValue();
            if (Intrinsics.g(dVar, d.a.b.C0391a.a)) {
                iVar = new dwt.f(0);
            } else if (Intrinsics.g(dVar, d.a.b.C0392b.a)) {
                iVar = new dwt.i(0);
            } else if (dVar instanceof d.b) {
                iVar = new zs6.b(((d.b) dVar).getSource(), e.z.name());
            } else if (dVar instanceof d.a.C0390a) {
                iVar = new dwt.i(0);
            } else {
                if (!Intrinsics.g(dVar, d.c.a)) {
                    uhc.a();
                    return;
                }
                iVar = null;
            }
            if (iVar != null) {
                rdd0 rdd0Var = eVar.a;
                uag uagVar = k00.f;
                uagVar.getClass();
                k00[] k00VarArr = (k00[]) e48.b(uagVar, new k00[0]);
                rdd0Var.a(iVar, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
            }
        }

        @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.b
        public final void b(int i, jmh0 jmh0Var, String str) {
            String str2 = jmh0Var.e;
            e eVar = e.this;
            eVar.a.a(new zs6.a(jmh0Var.b, i, e.z.name(), str), k00.c, k00.d);
            if (str2 != null) {
                eVar.b.l(Uri.parse(str2), null);
            }
        }

        @Override // com.sportybet.feature.loyalty.impl.notifications.presentation.mission.b
        public final void c(d.a aVar) {
            e eVar = e.this;
            azm azmVar = eVar.b;
            rdd0 rdd0Var = eVar.a;
            if (aVar.equals(d.a.b.C0391a.a)) {
                dwt.e eVar2 = new dwt.e(0);
                uag uagVar = k00.f;
                uagVar.getClass();
                k00[] k00VarArr = (k00[]) e48.b(uagVar, new k00[0]);
                rdd0Var.a(eVar2, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
                azmVar.d(wae.ME_GIFTS);
                return;
            }
            if (aVar.equals(d.a.b.C0392b.a)) {
                dwt.h hVar = new dwt.h(0);
                uag uagVar2 = k00.f;
                uagVar2.getClass();
                k00[] k00VarArr2 = (k00[]) e48.b(uagVar2, new k00[0]);
                rdd0Var.a(hVar, (k00[]) Arrays.copyOf(k00VarArr2, k00VarArr2.length));
                azmVar.k(wae.LOYALTY, new Pair[]{new Pair("tab", "mission")}, null);
                return;
            }
            if (!(aVar instanceof d.a.C0390a)) {
                uhc.a();
                return;
            }
            dwt.h hVar2 = new dwt.h(0);
            uag uagVar3 = k00.f;
            uagVar3.getClass();
            k00[] k00VarArr3 = (k00[]) e48.b(uagVar3, new k00[0]);
            rdd0Var.a(hVar2, (k00[]) Arrays.copyOf(k00VarArr3, k00VarArr3.length));
            azmVar.k(wae.LOYALTY, new Pair[]{new Pair("tab", "mission")}, null);
        }
    }

    public e(rdd0 rdd0Var, azm azmVar, lq1 lq1Var, yi5 yi5Var, jih jihVar, c8k c8kVar, uti utiVar, vu60 vu60Var) {
        rdd0Var.getClass();
        azmVar.getClass();
        lq1Var.getClass();
        yi5Var.getClass();
        c8kVar.getClass();
        vu60Var.getClass();
        this.a = rdd0Var;
        this.b = azmVar;
        this.c = lq1Var;
        this.d = yi5Var;
        this.e = jihVar;
        this.f = c8kVar;
        this.i = utiVar;
        LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument missionBottomSheetArgument = (LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument) vu60Var.b("mission_argument");
        this.v = missionBottomSheetArgument == null ? new LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.RegularMission(wsv.b, null) : missionBottomSheetArgument;
        this.w = xwd0.a(d.c.a);
        this.y = new b();
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object x1(int i, x1b x1bVar) {
        rwt rwtVar;
        osv osvVar;
        StringUiText stringUiText;
        if (x1bVar instanceof rwt) {
            rwtVar = (rwt) x1bVar;
            int i2 = rwtVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rwtVar.e = i2 - Integer.MIN_VALUE;
            } else {
                rwtVar = new rwt(this, x1bVar);
            }
        } else {
            rwtVar = new rwt(this, x1bVar);
        }
        rwt rwtVar2 = rwtVar;
        Object objD = rwtVar2.c;
        y5b y5bVar = y5b.a;
        int i3 = rwtVar2.e;
        if (i3 != 0) {
            if (i3 == 1) {
                i = rwtVar2.a;
                uj50.b(objD);
            } else {
                if (i3 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                stringUiText = rwtVar2.b;
                uj50.b(objD);
            }
            return new d.a.C0390a(stringUiText, vch0.d((CharSequence) objD));
        }
        uj50.b(objD);
        kotlin.time.b.a aVar = kotlin.time.b.b;
        long jI = kotlin.time.c.i(1200L, rgf.MILLISECONDS);
        swt swtVar = new swt(this, i, null);
        rwtVar2.a = i;
        rwtVar2.e = 1;
        objD = vxf0.d(jI, swtVar, rwtVar2);
        if (objD != y5bVar) {
        }
        return y5bVar;
        lk50 lk50Var = (lk50) objD;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar != null && (osvVar = (osv) cVar.a) != null) {
            Object objP0 = CollectionsKt.p0(osvVar.r);
            rtv.b bVar = objP0 instanceof rtv.b ? (rtv.b) objP0 : null;
            if (bVar != null) {
                String strN = bwf0.n(osvVar.i);
                StringUiText stringUiText2 = vch0.a;
                StringUiText stringUiText3 = new StringUiText(strN);
                rwtVar2.b = stringUiText3;
                rwtVar2.a = i;
                rwtVar2.e = 2;
                objD = uti.g(this.i, s5y.d(new Long(bVar.a)), osvVar.j, false, rwtVar2, 28);
                if (objD != y5bVar) {
                    stringUiText = stringUiText3;
                    return new d.a.C0390a(stringUiText, vch0.d((CharSequence) objD));
                }
                return y5bVar;
            }
        }
        return null;
    }

    public final void y1(d dVar) {
        wwd0 wwd0Var = this.w;
        boolean z2 = wwd0Var.getValue().getClass() != dVar.getClass();
        wwd0Var.getClass();
        pdd0 cVar = null;
        wwd0Var.k(null, dVar);
        if (z2) {
            if (dVar instanceof d.a.C0390a) {
                cVar = new dwt.j(0);
            } else if (dVar.equals(d.a.b.C0391a.a)) {
                cVar = new dwt.g(0);
            } else if (dVar.equals(d.a.b.C0392b.a)) {
                cVar = new dwt.j(0);
            } else if (dVar instanceof d.b.a) {
                cVar = new zs6.c(((d.b.a) dVar).c, z.name());
            } else if (!(dVar instanceof d.b.C0393b) && !dVar.equals(d.c.a)) {
                uhc.a();
                return;
            }
            if (cVar != null) {
                k00[] k00VarArr = (k00[]) k00.f.toArray(new k00[0]);
                this.a.a(cVar, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0132  */
    /* JADX WARN: Code duplicated, block: B:40:0x0148  */
    /* JADX WARN: Code duplicated, block: B:43:0x016e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0179  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object z1(LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.GamesCarouselMission gamesCarouselMission, x1b x1bVar) {
        f fVar;
        Object obj;
        LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.GamesCarouselMission gamesCarouselMission2;
        LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.GamesCarouselMission gamesCarouselMission3;
        Object obj2;
        List<GamesMetadataResponse.GameMetadata> list;
        ArrayList arrayList;
        String name;
        if (x1bVar instanceof f) {
            fVar = (f) x1bVar;
            int i = fVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.d = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, x1bVar);
            }
        } else {
            fVar = new f(this, x1bVar);
        }
        f fVar2 = fVar;
        Object obj3 = fVar2.b;
        y5b y5bVar = y5b.a;
        int i2 = fVar2.d;
        if (i2 == 0) {
            uj50.b(obj3);
            BOConfigParam bOConfigParam = BOConfigParam.MissionCompletedGamesCarouselBottomSheetEnabled;
            String strA = this.d.b().a();
            fVar2.a = gamesCarouselMission;
            fVar2.d = 1;
            Object objK = qq1.k(this.c, bOConfigParam, strA, fVar2);
            if (objK != y5bVar) {
                obj = objK;
                gamesCarouselMission2 = gamesCarouselMission;
            }
            return y5bVar;
        }
        if (i2 == 1) {
            LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.GamesCarouselMission gamesCarouselMission4 = fVar2.a;
            uj50.b(obj3);
            obj = obj3;
            gamesCarouselMission2 = gamesCarouselMission4;
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gamesCarouselMission3 = fVar2.a;
            uj50.b(obj3);
            obj2 = ((zi50) obj3).a;
        }
        zi50.a aVar = zi50.b;
        if (!(obj2 instanceof zi50.b)) {
            list = (List) obj2;
            if (list.isEmpty()) {
                y1(d.a.b.C0391a.a);
            } else {
                String str = gamesCarouselMission3.a;
                Long l = new Long(gamesCarouselMission3.c);
                BigDecimal bigDecimal = s5y.a;
                BigDecimal bigDecimalDivide = new BigDecimal(l.toString()).divide(s5y.a, 0, RoundingMode.HALF_UP);
                bigDecimalDivide.getClass();
                String strB = s5y.b(0, bigDecimalDivide);
                String str2 = gamesCarouselMission3.d.a;
                arrayList = new ArrayList(l48.r(list, 10));
                for (GamesMetadataResponse.GameMetadata gameMetadata : list) {
                    String strValueOf = String.valueOf(gameMetadata.getGameId());
                    name = gameMetadata.getName();
                    if (name == null) {
                        name = "";
                    }
                    arrayList.add(new jmh0(strValueOf, name, gameMetadata.getImageUrl(), gameMetadata.getOnlineUserCount(), gameMetadata.getDeepLinkUrl(), String.valueOf(gameMetadata.getCategoryIds())));
                }
                y1(new d.b.a(str, strB, str2, arrayList));
            }
        }
        if (zi50.a(obj2) != null) {
            y1(d.a.b.C0391a.a);
        }
        return Unit.a;
        if (((Boolean) obj).booleanValue()) {
            String str3 = gamesCarouselMission2.a;
            Long l2 = new Long(gamesCarouselMission2.c);
            BigDecimal bigDecimal2 = s5y.a;
            BigDecimal bigDecimalDivide2 = new BigDecimal(l2.toString()).divide(s5y.a, 0, RoundingMode.HALF_UP);
            bigDecimalDivide2.getClass();
            y1(new d.b.C0393b(str3, s5y.b(0, bigDecimalDivide2), gamesCarouselMission2.d.a));
            List<Long> list2 = gamesCarouselMission2.b;
            ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                bki0.a((int) ((Number) it.next()).longValue(), arrayList2);
            }
            GamesMetadataFilter gamesMetadataFilter = new GamesMetadataFilter(null, arrayList2, null, null, 13, null);
            fVar2.a = gamesCarouselMission2;
            fVar2.d = 2;
            Object objB = jih.b(this.e, gamesMetadataFilter, z, null, fVar2, 28);
            if (objB != y5bVar) {
                gamesCarouselMission3 = gamesCarouselMission2;
                obj2 = objB;
                zi50.a aVar2 = zi50.b;
                if (!(obj2 instanceof zi50.b)) {
                    list = (List) obj2;
                    if (list.isEmpty()) {
                        String str4 = gamesCarouselMission3.a;
                        Long l3 = new Long(gamesCarouselMission3.c);
                        BigDecimal bigDecimal3 = s5y.a;
                        BigDecimal bigDecimalDivide3 = new BigDecimal(l3.toString()).divide(s5y.a, 0, RoundingMode.HALF_UP);
                        bigDecimalDivide3.getClass();
                        String strB2 = s5y.b(0, bigDecimalDivide3);
                        String str5 = gamesCarouselMission3.d.a;
                        arrayList = new ArrayList(l48.r(list, 10));
                        while (r3.hasNext()) {
                            String strValueOf2 = String.valueOf(gameMetadata.getGameId());
                            name = gameMetadata.getName();
                            if (name == null) {
                                name = "";
                            }
                            arrayList.add(new jmh0(strValueOf2, name, gameMetadata.getImageUrl(), gameMetadata.getOnlineUserCount(), gameMetadata.getDeepLinkUrl(), String.valueOf(gameMetadata.getCategoryIds())));
                        }
                        y1(new d.b.a(str4, strB2, str5, arrayList));
                    } else {
                        y1(d.a.b.C0391a.a);
                    }
                }
                if (zi50.a(obj2) != null) {
                    y1(d.a.b.C0391a.a);
                }
            }
            return y5bVar;
        }
        y1(d.a.b.C0391a.a);
        return Unit.a;
    }
}
