package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.social.data.remote.entity.SocialSuggestedCode;
import com.sportybet.android.social.data.remote.entity.SocialSuggestedCodeDetail;
import com.sportybet.android.social.data.remote.entity.SocialSuggestedCodeItem;
import com.sportybet.android.social.data.remote.entity.SocialSuggestedCodes;
import com.sportybet.android.social.data.remote.entity.SocialSuggestedSection;
import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbsi;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bsi extends c82 {
    public final v340 A;
    public final wuw<qqi> B;
    public int C;
    public jvd0 D;
    public final o6k d;
    public final sqi e;
    public final ufa0 f;
    public final oia0 i;
    public final uqm v;
    public final psm w;
    public final rdd0 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$fetchPage$1", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends uri>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = bsi.this.new a(this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends uri> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            msi bVar;
            msi aVar;
            uri uriVarA;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int i = 0;
            boolean z = this.c != null;
            bsi bsiVar = bsi.this;
            uri uriVarX1 = bsiVar.x1();
            wwd0 wwd0Var = bsiVar.z;
            if (lk50Var instanceof lk50.b) {
                if (!z || uriVarX1 == null) {
                    bVar = uriVarX1 != null ? new msi.a(uri.b(uriVarX1, 0, null, null, null, null, false, true, 31)) : msi.c.a;
                } else {
                    bVar = new msi.a(uri.b(uriVarX1, 0, null, null, null, null, true, false, 31));
                }
            } else if (lk50Var instanceof lk50.c) {
                uri uriVar = (uri) ((lk50.c) lk50Var).a;
                if (!z || uriVarX1 == null) {
                    uriVarA = uriVar.a();
                } else {
                    List<nqi> list = uriVarX1.d;
                    List<nqi> list2 = uriVarX1.c;
                    List<nqi> list3 = uriVarX1.b;
                    bsiVar.e.getClass();
                    uriVar.getClass();
                    ArrayList arrayListI0 = CollectionsKt.i0(list, CollectionsKt.i0(list2, list3));
                    ArrayList arrayList = new ArrayList();
                    int size = arrayListI0.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayListI0.get(i2);
                        i2++;
                        p48.w(((nqi) obj2).g, arrayList);
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        linkedHashSet.add(((kl00) obj3).a);
                    }
                    uriVarA = uri.b(uriVarX1, 0, sqi.a(list3, uriVar.b, linkedHashSet), sqi.a(list2, uriVar.c, linkedHashSet), sqi.a(list, uriVar.d, linkedHashSet), uriVar.e, false, false, 97).a();
                }
                bVar = new msi.a(uriVarA);
            } else {
                if (!(lk50Var instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
                lk50.a aVar2 = (lk50.a) lk50Var;
                Throwable th = aVar2.a;
                SprThrowable sprThrowable = (SprThrowable) (!(th instanceof SprThrowable) ? null : th);
                if (sprThrowable != null && sprThrowable.c && sprThrowable.getD() == 10000) {
                    i = 1;
                }
                if (!z || uriVarX1 == null) {
                    if (uriVarX1 != null) {
                        aVar = new msi.a(i != 0 ? new uri(bsiVar.C, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT) : uriVarX1.a());
                    } else if (i != 0) {
                        aVar = new msi.a(new uri(bsiVar.C, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    } else {
                        bVar = new msi.b(th, aVar2.b);
                    }
                    bVar = aVar;
                } else {
                    bVar = new msi.a(uri.b(uriVarX1.a(), 0, null, null, null, i == 0 ? uriVarX1.e : null, false, false, 111));
                }
            }
            wwd0Var.setValue(bVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$loadBookingCode$1", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Function1<Throwable, qqi> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Throwable, ? extends qqi> function1, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = bsi.this.new b(this.c, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, v1b<? super Unit> v1bVar) {
            return ((b) create(th, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bsi.this.B.a(this.c.invoke(th));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$loadBookingCode$2", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<a8a0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Function1<a8a0, qqi> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super a8a0, ? extends qqi> function1, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = bsi.this.new c(this.c, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a8a0 a8a0Var, v1b<? super Unit> v1bVar) {
            return ((c) create(a8a0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            a8a0 a8a0Var = (a8a0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bsi.this.B.a(this.c.invoke(a8a0Var));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$loadBookingCode$3", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super a8a0>, v1b<? super Unit>, Object> {
        public final /* synthetic */ kl00 b;
        public final /* synthetic */ Function2<kl00, bv7, kl00> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(kl00 kl00Var, Function2<? super kl00, ? super bv7, kl00> function2, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = kl00Var;
            this.c = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return bsi.this.new d(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super a8a0> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            final Function2<kl00, bv7, kl00> function2 = this.c;
            bsi.this.C1(this.b, new Function1() { // from class: dsi
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    bv7.a aVar = bv7.a.a;
                    return (kl00) function2.invoke((kl00) obj2, aVar);
                }
            });
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.foryou.presentation.ForYouFeedViewModel$loadBookingCode$4", f = "ForYouFeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements gaj<myh<? super a8a0>, Throwable, v1b<? super Unit>, Object> {
        public final /* synthetic */ kl00 b;
        public final /* synthetic */ Function2<kl00, bv7, kl00> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(kl00 kl00Var, Function2<? super kl00, ? super bv7, kl00> function2, v1b<? super e> v1bVar) {
            super(3, v1bVar);
            this.b = kl00Var;
            this.c = function2;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super a8a0> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            kl00 kl00Var = this.b;
            Function2<kl00, bv7, kl00> function2 = this.c;
            return bsi.this.new e(kl00Var, function2, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            final Function2<kl00, bv7, kl00> function2 = this.c;
            bsi.this.C1(this.b, new Function1() { // from class: esi
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    bv7.b bVar = bv7.b.a;
                    return (kl00) function2.invoke((kl00) obj2, bVar);
                }
            });
            return Unit.a;
        }
    }

    public bsi(o6k o6kVar, sqi sqiVar, ufa0 ufa0Var, oia0 oia0Var, uqm uqmVar, psm psmVar, rdd0 rdd0Var) {
        uqmVar.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        this.d = o6kVar;
        this.e = sqiVar;
        this.f = ufa0Var;
        this.i = oia0Var;
        this.v = uqmVar;
        this.w = psmVar;
        this.y = rdd0Var;
        wwd0 wwd0VarA = xwd0.a(msi.c.a);
        this.z = wwd0VarA;
        this.A = e1i.b(wwd0VarA);
        this.B = new wuw<>();
    }

    public static qqi.f z1(kl00 kl00Var, a8a0 a8a0Var) {
        BookingData bookingData = a8a0Var.a;
        String str = bookingData.shareCode;
        str.getClass();
        List<Event> list = bookingData.outcomes;
        g08 g08Var = g08.UNKNOWN;
        return new qqi.f(new z7a0.c(str, list, Integer.valueOf(kl00Var.c), Double.valueOf(kl00Var.b), false, 10000, 834));
    }

    public final void A1(kl00 kl00Var, Function2<? super kl00, ? super bv7, kl00> function2, Function1<? super Throwable, ? extends qqi> function1, Function1<? super a8a0, ? extends qqi> function3) {
        kzh.d(new wzh(new xzh(this.i.a(kl00Var.a, this.w.getCountryCode(), kl00Var.k, new b(function1, null), new c(function3, null)), new d(kl00Var, function2, null)), new e(kl00Var, function2, null)), o8i0.d(this));
    }

    public final void B1(int i) {
        this.C = i;
        uri uriVarX1 = x1();
        if (uriVarX1 == null || !uriVarX1.g) {
            if (uriVarX1 != null) {
                msi.a aVar = new msi.a(uri.b(uriVarX1, 0, null, null, null, null, false, true, 31));
                wwd0 wwd0Var = this.z;
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
            }
            y1(null);
        }
    }

    public final void C1(final kl00 kl00Var, final Function1<? super kl00, kl00> function1) {
        Object value = this.A.a.getValue();
        msi.a aVar = value instanceof msi.a ? (msi.a) value : null;
        if (aVar == null) {
            return;
        }
        msi.a aVar2 = new msi.a(aVar.a.c(new Function1() { // from class: asi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                nqi nqiVar = (nqi) obj;
                nqiVar.getClass();
                List<kl00> list = nqiVar.g;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                for (kl00 kl00Var2 : list) {
                    String str = kl00Var2.a;
                    kl00 kl00Var3 = kl00Var;
                    if (Intrinsics.g(str, kl00Var3.a) && Intrinsics.g(kl00Var2.g, kl00Var3.g)) {
                        kl00Var2 = (kl00) function1.invoke(kl00Var2);
                    }
                    arrayList.add(kl00Var2);
                }
                return nqi.a(nqiVar, false, null, arrayList, 63);
            }
        }));
        wwd0 wwd0Var = this.z;
        wwd0Var.getClass();
        wwd0Var.k(null, aVar2);
    }

    public final void D1(final String str, final boolean z, final y7i y7iVar) {
        Object obj;
        int i;
        Object value = this.A.a.getValue();
        msi.a aVar = value instanceof msi.a ? (msi.a) value : null;
        if (aVar == null) {
            return;
        }
        uri uriVar = aVar.a;
        ArrayList arrayListI0 = CollectionsKt.i0(uriVar.d, CollectionsKt.i0(uriVar.c, uriVar.b));
        int size = arrayListI0.size();
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            } else {
                obj = arrayListI0.get(i2);
                i2++;
            }
        } while (!((nqi) obj).a.equals(str));
        nqi nqiVar = (nqi) obj;
        if (nqiVar != null) {
            boolean z2 = nqiVar.e;
            if (!z || z2) {
                i = (z || !z2) ? 0 : -1;
            } else {
                i = 1;
            }
            int i3 = uriVar.a + i;
            int i4 = i3 < 0 ? 0 : i3;
            this.C = i4;
            msi.a aVar2 = new msi.a(uri.b(uriVar.c(new Function1() { // from class: zri
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    nqi nqiVar2 = (nqi) obj2;
                    nqiVar2.getClass();
                    return nqiVar2.a.equals(str) ? nqi.a(nqiVar2, z, y7iVar, null, 79) : nqiVar2;
                }
            }), i4, null, null, null, null, false, false, WebSocketProtocol.PAYLOAD_SHORT));
            wwd0 wwd0Var = this.z;
            wwd0Var.getClass();
            wwd0Var.k(null, aVar2);
        }
    }

    public final uri x1() {
        Object value = this.A.a.getValue();
        msi.a aVar = value instanceof msi.a ? (msi.a) value : null;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public final void y1(String str) {
        jvd0 jvd0Var = this.D;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        final int i = this.C;
        final o6k o6kVar = this.d;
        this.D = kzh.d(new g1i(new wl50(bm50.b(o6kVar.a.g(str), vch0.b), new Function1() { // from class: n6k
            /* JADX WARN: Code duplicated, block: B:145:0x020f  */
            /* JADX WARN: Code duplicated, block: B:169:0x0265  */
            /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
            /* JADX WARN: Code duplicated, block: B:74:0x0119  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2;
                Object next;
                wia0 wia0Var;
                String strE;
                ArrayList arrayList;
                wia0 wia0Var2;
                kl00 kl00Var;
                rqi rqiVar;
                String shareCode;
                Double totalOdds;
                Long deadline;
                jl00 jl00Var;
                Integer outcomeId;
                Double odds;
                String upperCase;
                SocialSuggestedCodes socialSuggestedCodes = (SocialSuggestedCodes) obj;
                socialSuggestedCodes.getClass();
                o6k o6kVar2 = o6kVar;
                CountryCodeName countryCode = o6kVar2.b.getCountryCode();
                bnh0 bnh0Var = o6kVar2.c;
                List<SocialSuggestedCodeItem> items = socialSuggestedCodes.getItems();
                if (items == null) {
                    items = m2g.a;
                }
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                for (Object obj2 : items) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    SocialSuggestedCodeItem socialSuggestedCodeItem = (SocialSuggestedCodeItem) obj2;
                    List<SocialSuggestedSection> sections = socialSuggestedCodes.getSections();
                    if (sections == null) {
                        sections = m2g.a;
                    }
                    Iterator<T> it = sections.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        SocialSuggestedSection socialSuggestedSection = (SocialSuggestedSection) next;
                        if (socialSuggestedSection.getFrom() != null && socialSuggestedSection.getTo() != null) {
                            int iIntValue = socialSuggestedSection.getFrom().intValue();
                            if (i3 <= socialSuggestedSection.getTo().intValue() && iIntValue <= i3) {
                                break;
                            }
                        }
                    }
                    SocialSuggestedSection socialSuggestedSection2 = (SocialSuggestedSection) next;
                    if (socialSuggestedSection2 != null) {
                        wia0.a aVar = wia0.a;
                        String section = socialSuggestedSection2.getSection();
                        aVar.getClass();
                        if (section != null) {
                            Locale locale = Locale.ROOT;
                            locale.getClass();
                            upperCase = section.toUpperCase(locale);
                            upperCase.getClass();
                        } else {
                            upperCase = null;
                        }
                        wia0Var = Intrinsics.g(upperCase, "FOLLOWING") ? wia0.b : Intrinsics.g(upperCase, "POPULAR") ? wia0.d : wia0.c;
                    } else {
                        wia0Var = null;
                    }
                    if (wia0Var == null) {
                        wia0Var = Intrinsics.g(socialSuggestedCodeItem.getFollowedByMe(), Boolean.TRUE) ? wia0.b : wia0.c;
                    }
                    String nickname = socialSuggestedCodeItem.getNickname();
                    if (nickname == null || StringsKt.U(nickname)) {
                        nickname = null;
                    }
                    String str2 = nickname == null ? "" : nickname;
                    if (wia0Var == wia0.d || !(str2.length() == 0 || socialSuggestedCodeItem.getFollowersCount() == null)) {
                        String userType = socialSuggestedCodeItem.getUserType();
                        if (userType == null) {
                            userType = "";
                        }
                        dja0 dja0VarA = laa0.a(userType);
                        String avatar = socialSuggestedCodeItem.getAvatar();
                        if (avatar == null) {
                            strE = null;
                        } else {
                            if (StringsKt.U(avatar)) {
                                avatar = null;
                            }
                            if (avatar != null) {
                                strE = bnh0Var.e(avatar);
                            } else {
                                strE = null;
                            }
                        }
                        Integer followersCount = socialSuggestedCodeItem.getFollowersCount();
                        int iIntValue2 = followersCount != null ? followersCount.intValue() : 0;
                        boolean z = Intrinsics.g(socialSuggestedCodeItem.getFollowedByMe(), Boolean.TRUE) || wia0Var == wia0.b;
                        SocialSuggestedCode code = socialSuggestedCodeItem.getCode();
                        if (code != null) {
                            List<SocialSuggestedCodeDetail> shareCodeDetail = code.getShareCodeDetail();
                            if (shareCodeDetail == null) {
                                arrayList = arrayList2;
                                wia0Var2 = wia0Var;
                                kl00Var = null;
                                break;
                            }
                            if (shareCodeDetail.isEmpty()) {
                                shareCodeDetail = null;
                            }
                            if (shareCodeDetail != null && (shareCode = code.getShareCode()) != null) {
                                if (StringsKt.U(shareCode)) {
                                    shareCode = null;
                                }
                                if (shareCode != null && (totalOdds = code.getTotalOdds()) != null) {
                                    double dDoubleValue = totalOdds.doubleValue();
                                    Integer foldsAmount = code.getFoldsAmount();
                                    if (foldsAmount == null) {
                                        arrayList = arrayList2;
                                        wia0Var2 = wia0Var;
                                        kl00Var = null;
                                        break;
                                    }
                                    int iIntValue3 = foldsAmount.intValue();
                                    String userId = code.getUserId();
                                    if (userId == null) {
                                        arrayList = arrayList2;
                                        wia0Var2 = wia0Var;
                                        kl00Var = null;
                                        break;
                                    }
                                    if (StringsKt.U(userId)) {
                                        userId = null;
                                    }
                                    if (userId == null || (deadline = code.getDeadline()) == null) {
                                        arrayList = arrayList2;
                                        wia0Var2 = wia0Var;
                                        kl00Var = null;
                                        break;
                                    }
                                    long jLongValue = deadline.longValue();
                                    Long createTime = code.getCreateTime();
                                    if (createTime == null) {
                                        arrayList = arrayList2;
                                        wia0Var2 = wia0Var;
                                        kl00Var = null;
                                        break;
                                    }
                                    long jLongValue2 = createTime.longValue();
                                    ArrayList arrayList3 = new ArrayList(l48.r(shareCodeDetail, 10));
                                    Iterator<T> it2 = shareCodeDetail.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            arrayList = arrayList2;
                                            wia0Var2 = wia0Var;
                                            kl00Var = new kl00(shareCode, dDoubleValue, iIntValue3, userId, jLongValue, jLongValue2, str2, null, false, strE, countryCode, dja0VarA, null, arrayList3, 118784);
                                            break;
                                        }
                                        SocialSuggestedCodeDetail socialSuggestedCodeDetail = (SocialSuggestedCodeDetail) it2.next();
                                        String eventId = socialSuggestedCodeDetail.getEventId();
                                        if (eventId == null) {
                                            jl00Var = null;
                                        } else {
                                            String str3 = !StringsKt.U(eventId) ? eventId : null;
                                            if (str3 == null) {
                                                jl00Var = null;
                                            } else {
                                                boolean zT = b3.T(str3);
                                                Long startTime = socialSuggestedCodeDetail.getStartTime();
                                                if (startTime != null) {
                                                    long jLongValue3 = startTime.longValue();
                                                    Long endTime = socialSuggestedCodeDetail.getEndTime();
                                                    String homeTeamName = socialSuggestedCodeDetail.getHomeTeamName();
                                                    String str4 = homeTeamName == null ? "" : homeTeamName;
                                                    String awayTeamName = socialSuggestedCodeDetail.getAwayTeamName();
                                                    String str5 = awayTeamName == null ? "" : awayTeamName;
                                                    Integer marketId = socialSuggestedCodeDetail.getMarketId();
                                                    if (marketId != null) {
                                                        int iIntValue4 = marketId.intValue();
                                                        String marketDescription = socialSuggestedCodeDetail.getMarketDescription();
                                                        if (marketDescription == null || (outcomeId = socialSuggestedCodeDetail.getOutcomeId()) == null) {
                                                            jl00Var = null;
                                                        } else {
                                                            int iIntValue5 = outcomeId.intValue();
                                                            String outcomeDescription = socialSuggestedCodeDetail.getOutcomeDescription();
                                                            if (outcomeDescription == null || (odds = socialSuggestedCodeDetail.getOdds()) == null) {
                                                                jl00Var = null;
                                                            } else {
                                                                double dDoubleValue2 = odds.doubleValue();
                                                                String sportId = socialSuggestedCodeDetail.getSportId();
                                                                if (sportId == null) {
                                                                    jl00Var = null;
                                                                } else {
                                                                    String str6 = !StringsKt.U(sportId) ? sportId : null;
                                                                    if (str6 == null) {
                                                                        jl00Var = null;
                                                                    } else {
                                                                        String tournamentId = socialSuggestedCodeDetail.getTournamentId();
                                                                        String tournamentIcon = socialSuggestedCodeDetail.getTournamentIcon();
                                                                        jl00Var = new jl00(str3, zT, jLongValue3, endTime, str4, str5, iIntValue4, marketDescription, iIntValue5, outcomeDescription, dDoubleValue2, str6, tournamentId, (tournamentIcon == null || StringsKt.U(tournamentIcon)) ? null : tournamentIcon, socialSuggestedCodeDetail.getTournamentName(), null);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        jl00Var = null;
                                                    }
                                                } else {
                                                    jl00Var = null;
                                                }
                                            }
                                        }
                                        if (jl00Var == null) {
                                            arrayList = arrayList2;
                                            wia0Var2 = wia0Var;
                                            kl00Var = null;
                                            break;
                                        }
                                        arrayList3.add(jl00Var);
                                    }
                                } else {
                                    arrayList = arrayList2;
                                    wia0Var2 = wia0Var;
                                    kl00Var = null;
                                    break;
                                }
                            } else {
                                arrayList = arrayList2;
                                wia0Var2 = wia0Var;
                                kl00Var = null;
                                break;
                            }
                            if (kl00Var != null) {
                                rqiVar = new rqi(wia0Var2, str2, strE, iIntValue2, dja0VarA, z, kl00Var);
                            }
                        } else {
                            socialSuggestedCodes = socialSuggestedCodes;
                            arrayList = arrayList2;
                        }
                        rqiVar = null;
                    } else {
                        socialSuggestedCodes = socialSuggestedCodes;
                        arrayList = arrayList2;
                        rqiVar = null;
                    }
                    if (rqiVar != null) {
                        arrayList.add(rqiVar);
                    }
                    arrayList2 = arrayList;
                    i3 = i4;
                    socialSuggestedCodes = socialSuggestedCodes;
                }
                SocialSuggestedCodes socialSuggestedCodes2 = socialSuggestedCodes;
                ArrayList arrayList4 = arrayList2;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    if (hashSet.add(((rqi) obj3).g.a)) {
                        arrayList5.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size2 = arrayList5.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj4 = arrayList5.get(i6);
                    i6++;
                    wia0 wia0Var3 = ((rqi) obj4).a;
                    Object arrayList6 = linkedHashMap.get(wia0Var3);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap.put(wia0Var3, arrayList6);
                    }
                    ((List) arrayList6).add(obj4);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    List<rqi> list = (List) entry.getValue();
                    ArrayList arrayList7 = new ArrayList(l48.r(list, 10));
                    for (rqi rqiVar2 : list) {
                        String str7 = rqiVar2.b;
                        String str8 = rqiVar2.c;
                        int i7 = rqiVar2.d;
                        dja0 dja0Var = rqiVar2.e;
                        boolean z2 = rqiVar2.f;
                        arrayList7.add(new nqi(str7, str8, i7, dja0Var, z2, z2 ? y7i.a.a : y7i.c.a, a.c(rqiVar2.g)));
                    }
                    linkedHashMap2.put(key, arrayList7);
                }
                Integer followingPoolSize = socialSuggestedCodes2.getFollowingPoolSize();
                if (followingPoolSize != null) {
                    int iIntValue6 = followingPoolSize.intValue();
                    i2 = iIntValue6 >= 0 ? iIntValue6 : 0;
                } else {
                    i2 = i;
                }
                List list2 = (List) linkedHashMap2.get(wia0.b);
                if (list2 == null) {
                    list2 = m2g.a;
                }
                List list3 = list2;
                List list4 = (List) linkedHashMap2.get(wia0.c);
                if (list4 == null) {
                    list4 = m2g.a;
                }
                List list5 = list4;
                List list6 = (List) linkedHashMap2.get(wia0.d);
                if (list6 == null) {
                    list6 = m2g.a;
                }
                return new uri(i2, list3, list5, list6, socialSuggestedCodes2.getNextCursor(), 96);
            }
        }), new a(str, null)), o8i0.d(this));
    }
}
