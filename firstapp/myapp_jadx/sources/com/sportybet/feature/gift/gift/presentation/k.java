package com.sportybet.feature.gift.gift.presentation;

import com.appsflyer.internal.u;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.ads.RealSportsAdSpots;
import com.sporty.android.core.model.ads.RealSportsAds;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sporty.android.core.model.luckywheel.LuckyWheelTicketStatus;
import com.sporty.android.core.model.luckywheel.TicketInfo;
import com.sportybet.android.gp.tz.R;
import defpackage.a7k;
import defpackage.awk;
import defpackage.ay0;
import defpackage.bm50;
import defpackage.bnh0;
import defpackage.brk;
import defpackage.bwf0;
import defpackage.bwk;
import defpackage.bxg0;
import defpackage.c04;
import defpackage.c0d;
import defpackage.c25;
import defpackage.cx3;
import defpackage.dx3;
import defpackage.e7e;
import defpackage.e990;
import defpackage.eik;
import defpackage.ej5;
import defpackage.f1i;
import defpackage.fbe;
import defpackage.g1i;
import defpackage.ib5;
import defpackage.j25;
import defpackage.j8i0;
import defpackage.jnk;
import defpackage.jvd0;
import defpackage.k00;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.l25;
import defpackage.l48;
import defpackage.lk50;
import defpackage.m2g;
import defpackage.m58;
import defpackage.mjk;
import defpackage.njk;
import defpackage.o8i0;
import defpackage.onk;
import defpackage.or60;
import defpackage.oyk;
import defpackage.ozh;
import defpackage.p2k;
import defpackage.pjk;
import defpackage.pqf0;
import defpackage.psm;
import defpackage.pu0;
import defpackage.q2k;
import defpackage.r0i;
import defpackage.r1i;
import defpackage.rdd0;
import defpackage.rvk;
import defpackage.s6k;
import defpackage.t6k;
import defpackage.tje0;
import defpackage.tug;
import defpackage.u6k;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uvk;
import defpackage.uy0;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v6k;
import defpackage.vch0;
import defpackage.w6k;
import defpackage.wjk;
import defpackage.wok;
import defpackage.wpk;
import defpackage.wwd0;
import defpackage.wyk;
import defpackage.x1b;
import defpackage.x6k;
import defpackage.xwd0;
import defpackage.xxi0;
import defpackage.xyk;
import defpackage.y5b;
import defpackage.y6k;
import defpackage.ygh;
import defpackage.yik;
import defpackage.yzh;
import defpackage.z15;
import defpackage.z6k;
import defpackage.zsk;
import defpackage.zvk;
import defpackage.zzj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/gift/gift/presentation/k;", "Lj8i0;", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class k extends j8i0 {
    public final fbe A;
    public jvd0 B;
    public jvd0 C;
    public jvd0 D;
    public boolean E;
    public boolean F;
    public final ku90<e> G;
    public final wwd0 H;
    public final q2k a;
    public final uy0 b;
    public final a7k c;
    public final bwk d;
    public final e990 e;
    public final brk f;
    public final bnh0 i;
    public final psm v;
    public final e7e w;
    public final onk y;
    public final rdd0 z;

    @c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel$getPromotionAd$1", f = "GiftViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends RealSportsAdsData>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = k.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends RealSportsAdsData> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            RealSportsAdSpots realSportsAdSpots;
            Object value2;
            String linkUrl;
            String btnText;
            String text;
            Object next;
            wwd0 wwd0Var = k.this.H;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (lk50Var instanceof lk50.c) {
                List<RealSportsAdSpots> adSpots = ((RealSportsAdsData) ((lk50.c) lk50Var).a).getAdSpots();
                if (adSpots != null) {
                    Iterator<T> it = adSpots.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.g(((RealSportsAdSpots) next).getSpotId(), "giftsBottom"));
                    realSportsAdSpots = (RealSportsAdSpots) next;
                } else {
                    realSportsAdSpots = null;
                }
                RealSportsAds firstAd = realSportsAdSpots != null ? realSportsAdSpots.getFirstAd() : null;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, i.a((i) value2, null, null, null, null, (firstAd == null || (text = firstAd.getText()) == null || text.length() <= 0) ? null : text, (firstAd == null || (linkUrl = firstAd.getLinkUrl()) == null || (btnText = firstAd.getBtnText()) == null || btnText.length() == 0 || linkUrl.length() <= 0) ? null : linkUrl, null, null, 0, null, false, false, 4047)));
            } else {
                if (!(lk50Var instanceof lk50.a) && !Intrinsics.g(lk50Var, lk50.b.a)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, i.a((i) value, null, null, null, null, null, null, null, null, 0, null, false, false, 4047)));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel$handleAction$2", f = "GiftViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.sportybet.feature.gift.gift.presentation.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.sportybet.feature.gift.gift.presentation.b bVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return k.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                com.sportybet.feature.gift.gift.presentation.b.a aVar = (com.sportybet.feature.gift.gift.presentation.b.a) this.c;
                List<c04> list = aVar.a;
                String str = aVar.b;
                this.a = 1;
                if (k.this.z1(this, str, list) == y5bVar) {
                    return y5bVar;
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

    @c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel$handleAction$5", f = "GiftViewModel.kt", l = {146, 157, 158, 159, 161}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public boolean a;
        public int b;
        public final /* synthetic */ com.sportybet.feature.gift.gift.presentation.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.sportybet.feature.gift.gift.presentation.b bVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.d = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return k.this.new c(this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:59:0x017b A[PHI: r1
          0x017b: PHI (r1v6 boolean) = (r1v5 boolean), (r1v8 boolean) binds: [B:57:0x0178, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0187, code lost:
        
            if (r2.h(r4, r32) == r3) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0198, code lost:
        
            if (r1.z1(r32, r2, r4) == r3) goto L64;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instruction units count: 454
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.gift.gift.presentation.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel$loadGiftsForTab$job$1", f = "GiftViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<lk50<? extends wjk>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ uvk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, uvk uvkVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = z;
            this.d = uvkVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = k.this.new d(this.c, this.d, v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends wjk> lk50Var, v1b<? super Unit> v1bVar) {
            return ((d) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:147:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:149:0x04b9  */
        /* JADX WARN: Code duplicated, block: B:151:0x04bf  */
        /* JADX WARN: Code duplicated, block: B:152:0x04c8  */
        /* JADX WARN: Code duplicated, block: B:154:0x04cc  */
        /* JADX WARN: Code duplicated, block: B:155:0x04cf  */
        /* JADX WARN: Code duplicated, block: B:157:0x04d3  */
        /* JADX WARN: Code duplicated, block: B:158:0x04d6  */
        /* JADX WARN: Code duplicated, block: B:54:0x0188  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            i iVarA;
            Object value2;
            Object obj2;
            List<eik> list;
            wwd0 wwd0Var;
            wjk wjkVar;
            List<TicketInfo> list2;
            njk njkVar;
            String str;
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z;
            int i;
            ArrayList arrayList3;
            String str2;
            bwk bwkVar;
            String str3;
            int i2;
            boolean z2;
            k kVar;
            rdd0 rdd0Var;
            bwk bwkVar2;
            String str4;
            boolean z3;
            String str5;
            f.b bVar;
            UiText resourceUiText;
            int i3;
            int i4;
            int iOrdinal;
            ResourceUiText resourceUiText2;
            int i5;
            Integer numValueOf;
            int i6;
            int i7;
            UiText resourceUiText3;
            wwd0 wwd0Var2;
            ArrayList arrayList4;
            boolean z4;
            int i8;
            yik yikVar;
            rdd0 rdd0Var2;
            k kVar2;
            wjk wjkVar2;
            i iVarA2;
            f.b bVar2;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            k kVar3 = k.this;
            rdd0 rdd0Var3 = kVar3.z;
            wwd0 wwd0Var3 = kVar3.H;
            String strF = kVar3.v.f();
            boolean z5 = lk50Var instanceof lk50.c;
            uvk uvkVar = this.d;
            if (z5) {
                wjk wjkVar3 = (wjk) ((lk50.c) lk50Var).a;
                List<eik> list3 = wjkVar3.a;
                List<z15> list4 = wjkVar3.c;
                List<TicketInfo> list5 = wjkVar3.b;
                if (list3.isEmpty() && list5.isEmpty() && list4.isEmpty()) {
                    kVar3.x1();
                    bVar = new f.b(m2g.a);
                    list = list3;
                    kVar = kVar3;
                    rdd0Var = rdd0Var3;
                    wwd0Var = wwd0Var3;
                    wjkVar = wjkVar3;
                    list2 = list5;
                    obj2 = null;
                } else {
                    bwk bwkVar3 = kVar3.d;
                    njk njkVar2 = bwkVar3.a;
                    strF.getClass();
                    ArrayList arrayList5 = new ArrayList();
                    boolean z6 = this.c;
                    String str6 = z6 ? "valid" : "expired";
                    obj2 = null;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj3 : list3) {
                        List<eik> list6 = list3;
                        bwk bwkVar4 = bwkVar3;
                        if (((eik) obj3).b == awk.FreeBet) {
                            arrayList6.add(obj3);
                        }
                        list3 = list6;
                        bwkVar3 = bwkVar4;
                    }
                    list = list3;
                    bwk bwkVar5 = bwkVar3;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Iterator it2 = it;
                        String str7 = strF;
                        if (((eik) next).b == awk.Cash) {
                            arrayList7.add(next);
                        }
                        it = it2;
                        strF = str7;
                    }
                    String str8 = strF;
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        ArrayList arrayList9 = arrayList7;
                        Iterator it4 = it3;
                        if (((eik) next2).b == awk.Discount) {
                            arrayList8.add(next2);
                        }
                        arrayList7 = arrayList9;
                        it3 = it4;
                    }
                    ArrayList arrayList10 = arrayList7;
                    if (list5.isEmpty()) {
                        wwd0Var = wwd0Var3;
                        wjkVar = wjkVar3;
                        list2 = list5;
                        njkVar = njkVar2;
                        str = str6;
                        arrayList = arrayList6;
                        arrayList2 = arrayList8;
                        z = false;
                        i = R.color.text_disable_type1_primary;
                    } else {
                        String strConcat = str6.concat("_header_LuckyWheel");
                        awk awkVar = awk.LuckyWheel;
                        mjk.b bVar3 = new mjk.b(awkVar);
                        UiText uiTextC = bwk.c(awkVar);
                        int iB = bwk.b(awkVar);
                        ArrayList arrayList11 = new ArrayList(l48.r(list5, 10));
                        Iterator it5 = list5.iterator();
                        int i9 = 0;
                        while (it5.hasNext()) {
                            Object next3 = it5.next();
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            TicketInfo ticketInfo = (TicketInfo) next3;
                            Iterator it6 = it5;
                            List<TicketInfo> list7 = list5;
                            int type = ticketInfo.getType();
                            ArrayList arrayList12 = arrayList6;
                            StringBuilder sb = new StringBuilder(str6);
                            String str9 = str6;
                            sb.append("_ticket_");
                            sb.append(type);
                            sb.append("_");
                            sb.append(i9);
                            String string = sb.toString();
                            awk awkVar2 = awk.LuckyWheel;
                            pjk pjkVarC = njkVar2.c(awkVar2, z6);
                            int type2 = ticketInfo.getType();
                            String typeName = ticketInfo.getTypeName();
                            if (typeName == null) {
                                StringUiText stringUiText = vch0.a;
                                resourceUiText3 = new ResourceUiText(R.string.common_functions__lucky_wheel);
                            } else {
                                if (StringsKt.U(typeName)) {
                                    typeName = null;
                                }
                                if (typeName != null) {
                                    StringUiText stringUiText2 = vch0.a;
                                    resourceUiText3 = new StringUiText(typeName);
                                } else {
                                    StringUiText stringUiText3 = vch0.a;
                                    resourceUiText3 = new ResourceUiText(R.string.common_functions__lucky_wheel);
                                }
                            }
                            UiText uiText = resourceUiText3;
                            ConcatUiText concatUiTextA = ygh.a(R.string.lucky_wheel__tickets, new StringUiText(m58.a(ticketInfo.getTicketNum(), " ")));
                            wwd0 wwd0Var4 = wwd0Var3;
                            wjk wjkVar4 = wjkVar3;
                            ResourceUiText resourceUiText4 = ticketInfo.getExpireDate() != 0 ? new ResourceUiText(R.string.component_coupon__expires_vtime, ay0.S(new Object[]{bwf0.o((6 & 4) != 0 ? 0 : 1, ticketInfo.getExpireDate(), false)})) : null;
                            if (z6 && ticketInfo.getStatus() == LuckyWheelTicketStatus.VALID) {
                                wwd0Var2 = wwd0Var4;
                                arrayList4 = arrayList8;
                                yikVar = new yik(pjkVarC.c, pjkVarC.d, new ResourceUiText(R.string.gift__use), true);
                                z4 = false;
                                i8 = R.color.text_disable_type1_primary;
                            } else {
                                wwd0Var2 = wwd0Var4;
                                arrayList4 = arrayList8;
                                if (z6 && ticketInfo.getStatus() == LuckyWheelTicketStatus.UNAVAILABLE) {
                                    yikVar = new yik(R.color.text_disable_type1_primary, R.color.absolute_type1, new ResourceUiText(R.string.gift__unavailable), false);
                                    z4 = false;
                                    i8 = R.color.text_disable_type1_primary;
                                } else {
                                    ResourceUiText resourceUiText5 = ticketInfo.getStatus() == LuckyWheelTicketStatus.USED ? new ResourceUiText(R.string.gift__used) : new ResourceUiText(R.string.gift__expired);
                                    z4 = false;
                                    i8 = R.color.text_disable_type1_primary;
                                    yikVar = new yik(R.color.text_disable_type1_primary, R.color.text_type2_primary, resourceUiText5, false);
                                }
                            }
                            arrayList11.add(new wok.c(string, new pqf0(type2, uiText, concatUiTextA, resourceUiText4, yikVar, bwk.d(awkVar2, z6, z4), z6 ? Integer.valueOf(pjkVarC.a) : null, z6 ? R.drawable.iwqk_gift_bottom : R.drawable.iwqk_expired_gift_bottom, z6 ? R.color.brand_tertiary : i8, pjkVarC.a, pjkVarC.b, pjkVarC.d, ticketInfo)));
                            it5 = it6;
                            i9 = i10;
                            list5 = list7;
                            arrayList6 = arrayList12;
                            str6 = str9;
                            njkVar2 = njkVar2;
                            wjkVar3 = wjkVar4;
                            wwd0Var3 = wwd0Var2;
                            arrayList8 = arrayList4;
                        }
                        wwd0Var = wwd0Var3;
                        wjkVar = wjkVar3;
                        list2 = list5;
                        njkVar = njkVar2;
                        str = str6;
                        arrayList = arrayList6;
                        arrayList2 = arrayList8;
                        z = false;
                        i = R.color.text_disable_type1_primary;
                        arrayList5.add(new zsk(strConcat, bVar3, uiTextC, iB, null, false, arrayList11));
                    }
                    if (arrayList.isEmpty()) {
                        arrayList3 = arrayList5;
                        str2 = str8;
                        bwkVar = bwkVar5;
                        str3 = str;
                        i2 = 10;
                        z2 = z6;
                    } else {
                        arrayList3 = arrayList5;
                        str2 = str8;
                        bwkVar = bwkVar5;
                        str3 = str;
                        i2 = 10;
                        z2 = z6;
                        arrayList3.add(bwkVar.a(awk.FreeBet, arrayList, str2, z2, str3));
                    }
                    if (!arrayList10.isEmpty()) {
                        arrayList3.add(bwkVar.a(awk.Cash, arrayList10, str2, z2, str3));
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList3.add(bwkVar.a(awk.Discount, arrayList2, str2, z2, str3));
                    }
                    if (list4.isEmpty()) {
                        kVar = kVar3;
                        rdd0Var = rdd0Var3;
                        bwkVar2 = bwkVar;
                        str4 = str2;
                        z3 = z2;
                        str5 = str3;
                    } else {
                        String strConcat2 = str3.concat("_header_Boost");
                        mjk.a aVar = mjk.a.a;
                        StringUiText stringUiText4 = vch0.a;
                        ResourceUiText resourceUiText6 = new ResourceUiText(R.string.gift__boost_gifts);
                        ArrayList arrayList13 = new ArrayList(l48.r(list4, i2));
                        Iterator it7 = list4.iterator();
                        while (it7.hasNext()) {
                            z15 z15Var = (z15) it7.next();
                            String str10 = z15Var.a;
                            bwk bwkVar6 = bwkVar;
                            ResourceUiText resourceUiText7 = resourceUiText6;
                            long j = z15Var.i;
                            String strA = tug.a(str3, "_boost_", str10);
                            l25 l25Var = z15Var.b;
                            String str11 = str2;
                            rvk rvkVar = z15Var.g;
                            String str12 = str3;
                            pjk pjkVarD = njkVar.d(l25Var, z2);
                            boolean z7 = z2;
                            int i11 = pjkVarD.d;
                            String str13 = z15Var.a;
                            Iterator it8 = it7;
                            rdd0 rdd0Var4 = rdd0Var3;
                            ResourceUiText resourceUiText8 = new ResourceUiText(R.string.gift__boost_timeframe_days, ay0.S(new Object[]{Integer.valueOf(z15Var.e)}));
                            ResourceUiText resourceUiText9 = new ResourceUiText(R.string.gift__boost_percent, ay0.S(new Object[]{Integer.valueOf(z15Var.f)}));
                            ResourceUiText resourceUiText10 = (z7 && rvkVar == rvk.b) ? new ResourceUiText(R.string.app_common__date_begin_end, ay0.S(new Object[]{bwf0.o((6 & 4) != 0 ? 0 : 1, z15Var.h, false), bwf0.o((6 & 4) != 0 ? 0 : 1, j, false)})) : new ResourceUiText(R.string.component_coupon__expires_vtime, ay0.S(new Object[]{bwf0.o((6 & 4) != 0 ? 0 : 1, j, false)}));
                            int iOrdinal2 = rvkVar.ordinal();
                            if (iOrdinal2 == 1) {
                                resourceUiText = new ResourceUiText(R.string.common_functions__upcoming);
                            } else if (iOrdinal2 == 2) {
                                resourceUiText = new ResourceUiText(R.string.gift__use);
                            } else if (iOrdinal2 != 3) {
                                resourceUiText = iOrdinal2 != 4 ? new StringUiText("") : new ResourceUiText(R.string.gift__expired);
                            } else {
                                resourceUiText = new ResourceUiText(R.string.gift__used);
                            }
                            boolean z8 = (z7 && rvkVar == rvk.c) ? true : z;
                            if (rvkVar == rvk.b && z7) {
                                njkVar.b(l25Var);
                                i3 = R.color.text_warning;
                            } else {
                                if (z7) {
                                    i3 = pjkVarD.c;
                                } else {
                                    i3 = i;
                                    i4 = R.color.text_type2_primary;
                                }
                                yik yikVar2 = new yik(i3, i4, resourceUiText, z8);
                                iOrdinal = l25Var.ordinal();
                                if (iOrdinal == 0 && iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        uhc.a();
                                        return null;
                                    }
                                    resourceUiText2 = new ResourceUiText(R.string.gift__rakeback_boost_gift);
                                }
                                ResourceUiText resourceUiText11 = resourceUiText2;
                                if (z7) {
                                    i5 = R.drawable.iwqk_discount_gift_up;
                                } else {
                                    i5 = R.drawable.iwqk_expired_gift_up;
                                }
                                int i12 = i5;
                                if (z7) {
                                    numValueOf = Integer.valueOf(pjkVarD.a);
                                } else {
                                    numValueOf = null;
                                }
                                if (z7) {
                                    i6 = R.drawable.iwqk_gift_bottom;
                                } else {
                                    i6 = R.drawable.iwqk_expired_gift_bottom;
                                }
                                if (z7) {
                                    i7 = R.color.brand_tertiary;
                                } else {
                                    i7 = i;
                                }
                                arrayList13.add(new wok.a(strA, new j25(str13, resourceUiText8, resourceUiText9, resourceUiText10, yikVar2, resourceUiText11, i12, numValueOf, i6, i7, pjkVarD.a, pjkVarD.b, pjkVarD.d, z15Var)));
                                resourceUiText6 = resourceUiText7;
                                bwkVar = bwkVar6;
                                str2 = str11;
                                z2 = z7;
                                it7 = it8;
                                rdd0Var3 = rdd0Var4;
                                kVar3 = kVar3;
                                str3 = str12;
                            }
                            i4 = i11;
                            yik yikVar3 = new yik(i3, i4, resourceUiText, z8);
                            iOrdinal = l25Var.ordinal();
                            resourceUiText2 = iOrdinal == 0 ? new ResourceUiText(R.string.gift__wager_boost_gift) : new ResourceUiText(R.string.gift__wager_boost_gift);
                            ResourceUiText resourceUiText12 = resourceUiText2;
                            if (z7) {
                                i5 = R.drawable.iwqk_discount_gift_up;
                            } else {
                                i5 = R.drawable.iwqk_expired_gift_up;
                            }
                            int i13 = i5;
                            if (z7) {
                                numValueOf = Integer.valueOf(pjkVarD.a);
                            } else {
                                numValueOf = null;
                            }
                            if (z7) {
                                i6 = R.drawable.iwqk_gift_bottom;
                            } else {
                                i6 = R.drawable.iwqk_expired_gift_bottom;
                            }
                            if (z7) {
                                i7 = R.color.brand_tertiary;
                            } else {
                                i7 = i;
                            }
                            arrayList13.add(new wok.a(strA, new j25(str13, resourceUiText8, resourceUiText9, resourceUiText10, yikVar3, resourceUiText12, i13, numValueOf, i6, i7, pjkVarD.a, pjkVarD.b, pjkVarD.d, z15Var)));
                            resourceUiText6 = resourceUiText7;
                            bwkVar = bwkVar6;
                            str2 = str11;
                            z2 = z7;
                            it7 = it8;
                            rdd0Var3 = rdd0Var4;
                            kVar3 = kVar3;
                            str3 = str12;
                        }
                        kVar = kVar3;
                        rdd0Var = rdd0Var3;
                        bwkVar2 = bwkVar;
                        str4 = str2;
                        z3 = z2;
                        str5 = str3;
                        arrayList3.add(new zsk(strConcat2, aVar, resourceUiText6, R.drawable.ic__rocket2, null, true, arrayList13));
                    }
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj4 : list) {
                        if (((eik) obj4).b == awk.BetslipTheme) {
                            arrayList14.add(obj4);
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList3.add(bwkVar2.a(awk.BetslipTheme, arrayList14, str4, z3, str5));
                    }
                    bVar = new f.b(arrayList3);
                }
                f.b bVar4 = bVar;
                uvk uvkVar2 = uvk.a;
                if (uvkVar == uvkVar2) {
                    kVar2 = kVar;
                    if (kVar2.E || list2.isEmpty()) {
                        rdd0Var2 = rdd0Var;
                    } else {
                        kVar2.E = true;
                        rdd0Var2 = rdd0Var;
                        rdd0Var2.a(zvk.e.a, k00.d);
                    }
                } else {
                    rdd0Var2 = rdd0Var;
                    kVar2 = kVar;
                }
                if (uvkVar == uvkVar2 && !kVar2.F && (list == null || !list.isEmpty())) {
                    Iterator<T> it9 = list.iterator();
                    while (it9.hasNext()) {
                        if (((eik) it9.next()).b == awk.BetslipTheme) {
                            kVar2.F = true;
                            rdd0Var2.a(dx3.a, k00.d);
                            break;
                        }
                    }
                }
                while (true) {
                    Object value3 = wwd0Var.getValue();
                    i iVar = (i) value3;
                    int iOrdinal3 = uvkVar.ordinal();
                    if (iOrdinal3 == 0) {
                        wjkVar2 = wjkVar;
                        iVarA2 = i.a(iVar, null, bVar4, null, null, null, null, null, null, wjkVar2.d, null, false, false, 3837);
                        bVar2 = bVar4;
                    } else {
                        if (iOrdinal3 != 1) {
                            uhc.a();
                            return obj2;
                        }
                        bVar2 = bVar4;
                        iVarA2 = i.a(iVar, null, null, bVar2, null, null, null, null, null, 0, null, false, false, 4091);
                        wjkVar2 = wjkVar;
                    }
                    wwd0 wwd0Var5 = wwd0Var;
                    if (!wwd0Var5.g(value3, iVarA2)) {
                        wjkVar = wjkVar2;
                        wwd0Var = wwd0Var5;
                        bVar4 = bVar2;
                    }
                }
            } else if (lk50Var instanceof lk50.a) {
                kVar3.x1();
                do {
                    value2 = wwd0Var3.getValue();
                } while (!wwd0Var3.g(value2, i.a((i) value2, null, null, null, null, null, null, null, new com.sportybet.feature.gift.gift.presentation.d.a(vch0.b, true), 0, null, false, false, 3967)));
            } else {
                if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var3.getValue();
                    i iVar2 = (i) value;
                    int iOrdinal4 = uvkVar.ordinal();
                    if (iOrdinal4 == 0) {
                        iVarA = i.a(iVar2, null, f.a.a, null, null, null, null, null, null, 0, null, false, false, 4093);
                    } else {
                        if (iOrdinal4 != 1) {
                            uhc.a();
                            return null;
                        }
                        iVarA = i.a(iVar2, null, null, f.a.a, null, null, null, null, null, 0, null, false, false, 4091);
                    }
                } while (!wwd0Var3.g(value, iVarA));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(q2k q2kVar, uy0 uy0Var, a7k a7kVar, bwk bwkVar, e990 e990Var, brk brkVar, bnh0 bnh0Var, psm psmVar, e7e e7eVar, onk onkVar, rdd0 rdd0Var, fbe fbeVar) {
        Object value;
        uy0Var.getClass();
        bwkVar.getClass();
        brkVar.getClass();
        bnh0Var.getClass();
        psmVar.getClass();
        e7eVar.getClass();
        rdd0Var.getClass();
        this.a = q2kVar;
        this.b = uy0Var;
        this.c = a7kVar;
        this.d = bwkVar;
        this.e = e990Var;
        this.f = brkVar;
        this.i = bnh0Var;
        this.v = psmVar;
        this.w = e7eVar;
        this.y = onkVar;
        this.z = rdd0Var;
        this.A = fbeVar;
        this.G = new ku90<>();
        wwd0 wwd0VarA = xwd0.a(new i(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095));
        this.H = wwd0VarA;
        do {
            value = wwd0VarA.getValue();
        } while (!wwd0VarA.g(value, i.a((i) value, null, null, null, this.v.f(), null, null, null, null, 0, null, false, false, 4087)));
        A1(uvk.a);
        A1(uvk.b);
        kzh.d(new g1i(bm50.f(this.b.h(pu0.b.a)), new xyk(this, null)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new oyk(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1(uvk uvkVar) {
        bxg0 bxg0Var;
        int iOrdinal = uvkVar.ordinal();
        if (iOrdinal == 0) {
            bxg0Var = new bxg0(zzj.Valid, c25.Usable, LuckyWheelTicketStatus.VALID);
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            bxg0Var = new bxg0(zzj.UsedOrExpired, c25.UsedOrExpired, LuckyWheelTicketStatus.USED);
        }
        zzj zzjVar = (zzj) bxg0Var.a;
        c25 c25Var = (c25) bxg0Var.b;
        LuckyWheelTicketStatus luckyWheelTicketStatus = (LuckyWheelTicketStatus) bxg0Var.c;
        boolean z = uvkVar == uvk.a;
        int iOrdinal2 = uvkVar.ordinal();
        if (iOrdinal2 == 0) {
            jvd0 jvd0Var = this.C;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
        } else if (iOrdinal2 != 1) {
            uhc.a();
            return;
        } else {
            jvd0 jvd0Var2 = this.D;
            if (jvd0Var2 != null) {
                jvd0Var2.cancel((CancellationException) null);
            }
        }
        int i = zzjVar.a;
        int i2 = c25Var.a;
        a7k a7kVar = this.c;
        a7kVar.getClass();
        luckyWheelTicketStatus.getClass();
        f1i f1iVar = new f1i(new yzh(new or60(new y6k(a7kVar.c, String.valueOf(i), null)), new z6k(3, null)));
        brk brkVar = a7kVar.a;
        jvd0 jvd0VarD = kzh.d(new g1i(bm50.a(ozh.c(r0i.e(f1iVar, r1i.a(new yzh(new s6k(brkVar.i(i)), new t6k(3, null)), new yzh(new s6k(new w6k(a7kVar.b.h(luckyWheelTicketStatus.getStatus()))), new t6k(3, null)), new yzh(new u6k(brkVar.c(Integer.valueOf(i2), 100)), new v6k(3, null)), new x6k(4, null))), a7kVar.d)), new d(z, uvkVar, null)), o8i0.d(this));
        int iOrdinal3 = uvkVar.ordinal();
        if (iOrdinal3 == 0) {
            this.C = jvd0VarD;
        } else if (iOrdinal3 == 1) {
            this.D = jvd0VarD;
        } else {
            uhc.a();
        }
    }

    public final void x1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adSpots", new JSONArray().put(new JSONObject().put("spotId", "giftsBottom")));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jvd0 jvd0Var = this.B;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        String string = jSONObject.toString();
        string.getClass();
        q2k q2kVar = this.a;
        q2kVar.getClass();
        this.B = kzh.d(new g1i(bm50.a(new p2k(q2kVar.a.i(string))), new a(null)), o8i0.d(this));
    }

    public final void y1(com.sportybet.feature.gift.gift.presentation.b bVar) {
        Object value;
        Object value2;
        int i;
        ResourceUiText resourceUiText;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        boolean z = bVar instanceof com.sportybet.feature.gift.gift.presentation.b.a;
        wwd0 wwd0Var = this.H;
        if (z) {
            do {
                value6 = wwd0Var.getValue();
            } while (!wwd0Var.g(value6, i.a((i) value6, null, null, null, null, null, null, com.sportybet.feature.gift.gift.presentation.c.b.a, null, 0, null, false, false, 4031)));
            ej5.c(o8i0.d(this), null, null, new b(bVar, null), 3);
            return;
        }
        if (bVar.equals(com.sportybet.feature.gift.gift.presentation.b.C0362b.a)) {
            do {
                value5 = wwd0Var.getValue();
            } while (!wwd0Var.g(value5, i.a((i) value5, null, null, null, null, null, null, com.sportybet.feature.gift.gift.presentation.c.b.a, null, 0, null, false, false, 4031)));
            return;
        }
        boolean z2 = bVar instanceof com.sportybet.feature.gift.gift.presentation.b.e;
        rdd0 rdd0Var = this.z;
        ku90<e> ku90Var = this.G;
        if (z2) {
            rdd0Var.a(zvk.b.a, k00.d);
            com.sportybet.feature.gift.gift.presentation.b.e eVar = (com.sportybet.feature.gift.gift.presentation.b.e) bVar;
            jnk jnkVar = (eVar.b || !eVar.a) ? jnk.BetSlip : jnk.Game;
            xxi0[] xxi0VarArr = xxi0.a;
            String strD = bnh0.d(this.i, new String[]{"my_accounts/gifts/how_to_use_gifts"}, u.a("tab", jnkVar.a), 4);
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, i.a((i) value4, null, null, null, null, null, null, com.sportybet.feature.gift.gift.presentation.c.b.a, null, 0, null, false, false, 4031)));
            ku90Var.a(new e.j(strD));
            return;
        }
        if (bVar instanceof com.sportybet.feature.gift.gift.presentation.b.g) {
            if (((com.sportybet.feature.gift.gift.presentation.b.g) bVar).a.b != awk.BetslipTheme) {
                ej5.c(o8i0.d(this), null, null, new c(bVar, null), 3);
                return;
            } else {
                rdd0Var.a(cx3.a, k00.d);
                ku90Var.a(e.b.a);
                return;
            }
        }
        if (bVar instanceof com.sportybet.feature.gift.gift.presentation.b.k) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, i.a((i) value3, ((com.sportybet.feature.gift.gift.presentation.b.k) bVar).a, null, null, null, null, null, null, null, 0, null, false, false, 4094)));
            return;
        }
        if (bVar instanceof com.sportybet.feature.gift.gift.presentation.b.h) {
            rdd0Var.a(zvk.d.a, k00.d);
            ku90Var.a(new e.g(((com.sportybet.feature.gift.gift.presentation.b.h) bVar).a));
            return;
        }
        if (!(bVar instanceof com.sportybet.feature.gift.gift.presentation.b.f)) {
            if (bVar instanceof com.sportybet.feature.gift.gift.presentation.b.c) {
                ku90Var.a(new e.i(((com.sportybet.feature.gift.gift.presentation.b.c) bVar).a));
                return;
            }
            if (bVar.equals(com.sportybet.feature.gift.gift.presentation.b.d.a)) {
                rdd0Var.a(zvk.a.a, k00.d);
                ku90Var.a(e.d.a);
                return;
            }
            if (bVar.equals(com.sportybet.feature.gift.gift.presentation.b.i.a)) {
                com.sportybet.feature.gift.gift.presentation.d dVar = ((i) wwd0Var.getValue()).h;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, i.a((i) value2, null, null, null, null, null, null, null, com.sportybet.feature.gift.gift.presentation.d.c.a, 0, null, false, false, 3967)));
                if (dVar instanceof com.sportybet.feature.gift.gift.presentation.d.C0363d) {
                    ej5.c(o8i0.d(this), null, null, new l(this, ((com.sportybet.feature.gift.gift.presentation.d.C0363d) dVar).a, null), 3);
                    return;
                } else {
                    if ((dVar instanceof com.sportybet.feature.gift.gift.presentation.d.a) && ((com.sportybet.feature.gift.gift.presentation.d.a) dVar).b) {
                        ku90Var.a(e.a.a);
                        return;
                    }
                    return;
                }
            }
            if (bVar.equals(com.sportybet.feature.gift.gift.presentation.b.j.a)) {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, i.a((i) value, null, null, null, null, null, null, null, com.sportybet.feature.gift.gift.presentation.d.c.a, 0, null, false, false, 3967)));
                return;
            } else {
                if (!(bVar instanceof com.sportybet.feature.gift.gift.presentation.b.l)) {
                    uhc.a();
                    return;
                }
                com.sportybet.feature.gift.gift.presentation.b.l lVar = (com.sportybet.feature.gift.gift.presentation.b.l) bVar;
                zvk zvkVar = lVar.a;
                k00[] k00VarArr = (k00[]) lVar.b.toArray(new k00[0]);
                rdd0Var.a(zvkVar, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
                return;
            }
        }
        z15 z15Var = ((com.sportybet.feature.gift.gift.presentation.b.f) bVar).a;
        this.d.getClass();
        l25 l25Var = z15Var.b;
        int i2 = z15Var.f;
        int i3 = z15Var.e;
        int iOrdinal = l25Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            i = R.string.gift__use_wager_boost;
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            i = R.string.gift__use_rakeback_boost;
        }
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText2 = new ResourceUiText(i);
        int iOrdinal2 = l25Var.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            resourceUiText = new ResourceUiText(R.string.gift__wager_boost_confirm_message, ay0.S(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
        } else {
            if (iOrdinal2 != 2) {
                uhc.a();
                return;
            }
            resourceUiText = new ResourceUiText(R.string.gift__rakeback_boost_confirm_message, ay0.S(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
        }
        com.sportybet.feature.gift.gift.presentation.d.C0363d c0363d = new com.sportybet.feature.gift.gift.presentation.d.C0363d(z15Var.a, resourceUiText2, resourceUiText);
        while (true) {
            Object value7 = wwd0Var.getValue();
            com.sportybet.feature.gift.gift.presentation.d.C0363d c0363d2 = c0363d;
            if (wwd0Var.g(value7, i.a((i) value7, null, null, null, null, null, null, null, c0363d2, 0, null, false, false, 3967))) {
                return;
            } else {
                c0363d = c0363d2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(x1b x1bVar, String str, List list) {
        wyk wykVar;
        e cVar;
        if (x1bVar instanceof wyk) {
            wykVar = (wyk) x1bVar;
            int i = wykVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wykVar.d = i - Integer.MIN_VALUE;
            } else {
                wykVar = new wyk(this, x1bVar);
            }
        } else {
            wykVar = new wyk(this, x1bVar);
        }
        Object objA = wykVar.b;
        y5b y5bVar = y5b.a;
        int i2 = wykVar.d;
        if (i2 == 0) {
            uj50.b(objA);
            wykVar.a = str;
            wykVar.d = 1;
            objA = this.A.a(list, wykVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = wykVar.a;
            uj50.b(objA);
        }
        wpk wpkVar = (wpk) objA;
        if (wpkVar instanceof wpk.a) {
            cVar = new e.c(((wpk.a) wpkVar).a, str);
        } else if (Intrinsics.g(wpkVar, wpk.c.a)) {
            cVar = e.h.a;
        } else {
            if (!Intrinsics.g(wpkVar, wpk.b.a)) {
                uhc.a();
                return null;
            }
            cVar = e.C0364e.a;
        }
        this.G.a(cVar);
        return Unit.a;
    }
}
