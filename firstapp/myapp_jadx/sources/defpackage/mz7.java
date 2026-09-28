package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmz7;", "Lihb0;", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mz7 extends ihb0 {
    public static final BookingCodeFilterDto h0 = new BookingCodeFilterDto(true, kotlin.collections.b.k(1, 50), 0, kotlin.collections.b.k(Double.valueOf(1.0d), Double.valueOf(2.147483647E9d)), new BookingCodeFilterDto.SortBy(BookingCodeFilterDto.SortBy.SORT_POPULARITY, 0, ""), b.b(), m2g.a, null, 128, null);
    public final s6k0 A;
    public final d4k0 B;
    public final ssw<Pair<List<BookingCodeInfoDto>, Boolean>> C;
    public final ssw D;
    public final ssw<Boolean> E;
    public final ssw F;
    public final ssw<Boolean> G;
    public final ssw H;
    public final mpe0 I;
    public final mpe0 J;
    public final ku90<jox<m9s>> K;
    public final t340 L;
    public final wwd0 M;
    public final v340 N;
    public final wwd0 O;
    public final v340 P;
    public final uwd0<WorldCupTeam> Q;
    public final v340 R;
    public final or60 S;
    public BookingCodeFilterDto T;
    public final vu90<jox<mg6>> U;
    public final vu90 V;
    public final vu90<jox<BookingData>> W;
    public final vu90 X;
    public final vu90<jox<BookingData>> Y;
    public final vu90 Z;
    public int a0;
    public List<String> b0;
    public List<String> c0;
    public final x4k d;
    public String d0;
    public final li7 e;
    public int e0;
    public final s05 f;
    public String f0;
    public boolean g0;
    public final vg40 i;
    public final jrm v;
    public final wsm w;
    public final k1p y;
    public final s4k z;

    @c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$1", f = "CodeHubViewmodel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mz7.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            mz7.this.a0 = 0;
            return Unit.a;
        }
    }

    public static final class b {
        public static Calendar a() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar;
        }

        public static ArrayList b() {
            ArrayList arrayList = new ArrayList();
            Calendar calendarA = a();
            arrayList.add(Long.valueOf(calendarA.getTime().getTime()));
            for (int i = 1; i < 7; i++) {
                calendarA.add(5, 1);
                arrayList.add(Long.valueOf(calendarA.getTime().getTime()));
            }
            return arrayList;
        }
    }

    @c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$fetchCards$1", f = "CodeHubViewmodel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<lk50<? extends List<? extends BookingCodeInfoDto>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = mz7.this.new c(this.c, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends BookingCodeInfoDto>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((c) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mz7 mz7Var = mz7.this;
            ssw<Boolean> sswVar = mz7Var.G;
            ssw<Pair<List<BookingCodeInfoDto>, Boolean>> sswVar2 = mz7Var.C;
            ssw<Boolean> sswVar3 = mz7Var.E;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (Intrinsics.g(lk50Var, lk50.b.a)) {
                sswVar3.j(Boolean.TRUE);
            } else {
                boolean z = lk50Var instanceof lk50.c;
                boolean z2 = this.c;
                if (z) {
                    T t = ((lk50.c) lk50Var).a;
                    if (((Collection) t).isEmpty()) {
                        sswVar.j(Boolean.TRUE);
                        sswVar2.j(new Pair<>(new ArrayList(), Boolean.valueOf(z2)));
                    } else {
                        sswVar2.j(new Pair<>(t, Boolean.valueOf(z2)));
                    }
                    sswVar3.j(Boolean.FALSE);
                } else {
                    if (!(lk50Var instanceof lk50.a)) {
                        uhc.a();
                        return null;
                    }
                    sswVar.j(Boolean.TRUE);
                    sswVar3.j(Boolean.FALSE);
                    sswVar2.j(new Pair<>(new ArrayList(), Boolean.valueOf(z2)));
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$timerFlow$1", f = "CodeHubViewmodel.kt", l = {113, 114}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(2, v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        /* JADX WARN: Code duplicated, block: B:13:0x0029  */
        /* JADX WARN: Code duplicated, block: B:16:0x0036  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0040 -> B:11:0x001f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.b
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r7.a
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1c
                if (r2 == r4) goto L18
                if (r2 != r3) goto L11
                goto L1c
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L18:
                defpackage.uj50.b(r8)
                goto L36
            L1c:
                defpackage.uj50.b(r8)
            L1f:
                kotlin.coroutines.CoroutineContext r8 = r7.getContext()
                boolean r8 = defpackage.i9p.h(r8)
                if (r8 == 0) goto L43
                kotlin.Unit r8 = kotlin.Unit.a
                r7.b = r0
                r7.a = r4
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L36
                goto L42
            L36:
                r7.b = r0
                r7.a = r3
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = defpackage.hkd.b(r5, r7)
                if (r8 != r1) goto L1f
            L42:
                return r1
            L43:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mz7.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz7(x4k x4kVar, li7 li7Var, s05 s05Var, vg40 vg40Var, jrm jrmVar, wsm wsmVar, k1p k1pVar, s4k s4kVar, s6k0 s6k0Var, d4k0 d4k0Var) {
        super(0);
        s05Var.getClass();
        vg40Var.getClass();
        jrmVar.getClass();
        wsmVar.getClass();
        d4k0Var.getClass();
        this.d = x4kVar;
        this.e = li7Var;
        this.f = s05Var;
        this.i = vg40Var;
        this.v = jrmVar;
        this.w = wsmVar;
        this.y = k1pVar;
        this.z = s4kVar;
        this.A = s6k0Var;
        this.B = d4k0Var;
        ssw<Pair<List<BookingCodeInfoDto>, Boolean>> sswVar = new ssw<>();
        this.C = sswVar;
        this.D = sswVar;
        Boolean bool = Boolean.FALSE;
        ssw<Boolean> sswVar2 = new ssw<>(bool);
        this.E = sswVar2;
        this.F = sswVar2;
        ssw<Boolean> sswVar3 = new ssw<>(bool);
        this.G = sswVar3;
        this.H = sswVar3;
        this.I = hwr.b(new kz7(this, 0));
        this.J = hwr.b(new Function0() { // from class: lz7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(qq1.e((lq1) this.a.z.a, BOConfigParam.SportySocialCodeChatThreshold, 6));
            }
        });
        ku90<jox<m9s>> ku90Var = new ku90<>();
        this.K = ku90Var;
        this.L = e1i.a(ku90Var);
        wwd0 wwd0VarA = xwd0.a(bh40.b.a);
        this.M = wwd0VarA;
        this.N = e1i.b(wwd0VarA);
        m2g m2gVar = m2g.a;
        wwd0 wwd0VarA2 = xwd0.a(m2gVar);
        this.O = wwd0VarA2;
        this.P = e1i.b(wwd0VarA2);
        this.Q = d4k0Var.a();
        this.R = e1i.e(vg40Var.d(pu0.b.a), o8i0.d(this), q490.a.a, lk50.b.a);
        this.S = new or60(new d(2, null));
        this.T = BookingCodeFilterDto.copy$default(h0, false, null, 0, null, null, null, null, null, 255, null);
        vu90<jox<mg6>> vu90Var = new vu90<>();
        this.U = vu90Var;
        this.V = vu90Var;
        vu90<jox<BookingData>> vu90Var2 = new vu90<>();
        this.W = vu90Var2;
        this.X = vu90Var2;
        vu90<jox<BookingData>> vu90Var3 = new vu90<>();
        this.Y = vu90Var3;
        this.Z = vu90Var3;
        this.b0 = m2gVar;
        this.c0 = m2gVar;
        this.e0 = 20;
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        kzh.d(new g1i(d4k0Var.a(), new uz7(this, null)), o8i0.d(this));
    }

    public final void A1(BookingData bookingData, boolean z) {
        List<Event> list = bookingData.outcomes;
        LinkedHashMap linkedHashMapA = apg.a(list);
        for (Event event : list) {
            if (event.markets != null && !event.isBetBuilderChild() && !z) {
                for (Market market : event.markets) {
                    List<Outcome> list2 = market.outcomes;
                    if (list2 != null && market.status != 3) {
                        Iterator<Outcome> it = list2.iterator();
                        while (it.hasNext()) {
                            if (this.v.a1(event, market, it.next(), (List) linkedHashMapA.get(market.id), bookingData.shareCode, null) == 3) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void B1(BookingCodeFilterDto bookingCodeFilterDto, boolean z) {
        boolean zIsEmpty = this.b0.isEmpty();
        s05 s05Var = this.f;
        kzh.d(new g1i(!zIsEmpty ? s05Var.b(bookingCodeFilterDto, this.b0, this.c0, this.d0, this.e0) : s05Var.e(bookingCodeFilterDto), new c(z, null)), o8i0.d(this));
    }

    public final void C1() {
        this.a0 = 0;
        this.G.m(Boolean.FALSE);
        List<Long> timeSegmentFilter = this.T.getTimeSegmentFilter();
        if (timeSegmentFilter != null && !timeSegmentFilter.isEmpty()) {
            this.T = BookingCodeFilterDto.copy$default(this.T, false, null, 0, null, null, null, kotlin.collections.b.k(Long.valueOf(Calendar.getInstance().getTime().getTime()), Long.valueOf(Calendar.getInstance().getTime().getTime())), null, 191, null);
        }
        E1();
        B1(this.T, false);
    }

    public final void D1() {
        jox.b bVar = jox.b.a;
        this.W.m(bVar);
        this.Y.m(bVar);
        this.K.a(bVar);
    }

    public final void E1() {
        BookingCodeFilterDto bookingCodeFilterDto = this.T;
        this.T = BookingCodeFilterDto.copy$default(bookingCodeFilterDto, false, null, this.a0, null, BookingCodeFilterDto.SortBy.copy$default(bookingCodeFilterDto.getSortBy(), null, this.a0, null, 5, null), null, null, null, 235, null);
    }

    public final boolean z1(WorldCupTeam worldCupTeam) {
        String countryCode;
        String string;
        String upperCase = null;
        boolean z = !Intrinsics.g(this.f0, worldCupTeam != null ? worldCupTeam.getId() : null);
        this.f0 = worldCupTeam != null ? worldCupTeam.getId() : null;
        if (worldCupTeam != null && (countryCode = worldCupTeam.getCountryCode()) != null && (string = StringsKt.t0(countryCode).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                Locale locale = Locale.ROOT;
                locale.getClass();
                upperCase = string.toUpperCase(locale);
                upperCase.getClass();
            }
        }
        this.d0 = upperCase;
        return z;
    }
}
