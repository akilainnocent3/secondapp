package defpackage;

import com.sporty.android.book.domain.entity.Sport;
import com.sporty.android.book.domain.entity.SportsMenuData;
import com.sporty.android.book.domain.entity.Tournament;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldgb0;", "Lj8i0;", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dgb0 extends j8i0 {
    public final v340 A;
    public final wwd0 B;
    public final v340 C;
    public final wwd0 D;
    public final v340 E;
    public final wwd0 F;
    public final v340 G;
    public final wwd0 H;
    public final v340 I;
    public final wwd0 J;
    public final v340 K;
    public final wwd0 L;
    public final v340 M;
    public final b390 N;
    public final t340 O;
    public jvd0 P;
    public final eek a;
    public final i6k b;
    public final hzf0 c;
    public final uqm d;
    public final m2l e;
    public final wwd0 f;
    public final v340 i;
    public final wwd0 v;
    public final v340 w;
    public List<String> y;
    public final wwd0 z;

    @c0d(c = "com.sporty.android.book.presentation.sportsmenu.SportsMenuViewModel$1", f = "SportsMenuViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return dgb0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            wwd0 wwd0Var2;
            y5b y5bVar = y5b.a;
            int i = this.b;
            boolean z = false;
            if (i == 0) {
                uj50.b(obj);
                dgb0 dgb0Var = dgb0.this;
                wwd0Var = dgb0Var.L;
                if (dgb0Var.d.isLogin()) {
                    m2l m2lVar = dgb0Var.e;
                    this.a = wwd0Var;
                    this.b = 1;
                    obj = m2lVar.a.getBoolean("favourites_hint_shown", false, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                    wwd0Var2 = wwd0Var;
                } else {
                    wwd0Var2 = wwd0Var;
                }
                wwd0Var2.setValue(Boolean.valueOf(z));
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0Var2 = this.a;
            uj50.b(obj);
            if (((Boolean) obj).booleanValue()) {
                wwd0Var = wwd0Var2;
                wwd0Var2 = wwd0Var;
            } else {
                z = true;
            }
            wwd0Var2.setValue(Boolean.valueOf(z));
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.book.presentation.sportsmenu.SportsMenuViewModel$dismissFavoritesHint$1", f = "SportsMenuViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return dgb0.this.new b(v1bVar);
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
                m2l m2lVar = dgb0.this.e;
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (m2lVar.a.putBoolean("favourites_hint_shown", bool, this) == y5bVar) {
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

    @c0d(c = "com.sporty.android.book.presentation.sportsmenu.SportsMenuViewModel$getSportsMenuData$1", f = "SportsMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<myh<? super SportsMenuData>, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ dgb0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, dgb0 dgb0Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = dgb0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super SportsMenuData> myhVar, v1b<? super Unit> v1bVar) {
            return ((c) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!this.a) {
                wwd0 wwd0Var = this.b.v;
                UIState.Loading loading = new UIState.Loading(((UIState) wwd0Var.getValue()).getData());
                wwd0Var.getClass();
                wwd0Var.k(null, loading);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.book.presentation.sportsmenu.SportsMenuViewModel$getSportsMenuData$2", f = "SportsMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<SportsMenuData, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = dgb0.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SportsMenuData sportsMenuData, v1b<? super Unit> v1bVar) {
            return ((d) create(sportsMenuData, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            UIState.Success success;
            SportsMenuData sportsMenuData = (SportsMenuData) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            dgb0 dgb0Var = dgb0.this;
            wwd0 wwd0Var = dgb0Var.v;
            if (dgb0Var.B.getValue() != null) {
                Object data = ((UIState) wwd0Var.getValue()).getData();
                data.getClass();
                success = new UIState.Success(((SportsMenuData) data).updateEventSizes(sportsMenuData));
            } else {
                success = new UIState.Success(sportsMenuData);
            }
            wwd0Var.getClass();
            wwd0Var.k(null, success);
            dgb0Var.A1();
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.book.presentation.sportsmenu.SportsMenuViewModel$getSportsMenuData$3", f = "SportsMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements gaj<myh<? super SportsMenuData>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public e(v1b<? super e> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super SportsMenuData> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            e eVar = dgb0.this.new e(v1bVar);
            eVar.a = th;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = dgb0.this.v;
            UIState.Error error = new UIState.Error(th, null, 2, null);
            wwd0Var.getClass();
            wwd0Var.k(null, error);
            return Unit.a;
        }
    }

    public dgb0(eek eekVar, i6k i6kVar, hzf0 hzf0Var, uqm uqmVar, m2l m2lVar) {
        uqmVar.getClass();
        m2lVar.getClass();
        this.a = eekVar;
        this.b = i6kVar;
        this.c = hzf0Var;
        this.d = uqmVar;
        this.e = m2lVar;
        wwd0 wwd0VarA = xwd0.a("");
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(UIState.Idle.INSTANCE);
        this.v = wwd0VarA2;
        this.w = e1i.b(wwd0VarA2);
        this.y = m2g.a;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        wwd0 wwd0VarA3 = xwd0.a(o2gVar);
        this.z = wwd0VarA3;
        this.A = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.B = wwd0VarA4;
        this.C = e1i.b(wwd0VarA4);
        t3g t3gVar = t3g.a;
        wwd0 wwd0VarA5 = xwd0.a(t3gVar);
        this.D = wwd0VarA5;
        this.E = e1i.b(wwd0VarA5);
        wwd0 wwd0VarA6 = xwd0.a(t3gVar);
        this.F = wwd0VarA6;
        this.G = e1i.b(wwd0VarA6);
        wwd0 wwd0VarA7 = xwd0.a(0);
        this.H = wwd0VarA7;
        this.I = e1i.b(wwd0VarA7);
        wwd0 wwd0VarA8 = xwd0.a("");
        this.J = wwd0VarA8;
        this.K = e1i.b(wwd0VarA8);
        wwd0 wwd0VarA9 = xwd0.a(Boolean.FALSE);
        this.L = wwd0VarA9;
        this.M = e1i.b(wwd0VarA9);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.N = b390VarB;
        this.O = e1i.a(b390VarB);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void A1() {
        Map mapK;
        Map<String, Sport> sportMap;
        wwd0 wwd0Var = this.v;
        SportsMenuData sportsMenuData = (SportsMenuData) ((UIState) wwd0Var.getValue()).getData();
        if (sportsMenuData == null || (sportMap = sportsMenuData.getSportMap()) == null) {
            mapK = null;
        } else {
            ArrayList arrayList = new ArrayList(sportMap.size());
            for (Map.Entry<String, Sport> entry : sportMap.entrySet()) {
                String key = entry.getKey();
                List<String> list = this.y;
                ArrayList arrayList2 = new ArrayList();
                for (String str : list) {
                    SportsMenuData sportsMenuData2 = (SportsMenuData) ((UIState) wwd0Var.getValue()).getData();
                    Tournament tournamentFindTournament = sportsMenuData2 != null ? sportsMenuData2.findTournament(entry.getKey(), str) : null;
                    if (tournamentFindTournament != null) {
                        arrayList2.add(tournamentFindTournament);
                    }
                }
                arrayList.add(new Pair(key, arrayList2));
            }
            mapK = kpu.k(arrayList);
        }
        if (mapK == null) {
            mapK = o2g.a;
            mapK.getClass();
        }
        wwd0 wwd0Var2 = this.z;
        wwd0Var2.getClass();
        wwd0Var2.k(null, mapK);
    }

    public final void B1(String str) {
        str.getClass();
        this.F.setValue(t3g.a);
        wwd0 wwd0Var = this.J;
        wwd0Var.getClass();
        wwd0Var.k(null, "");
        wwd0 wwd0Var2 = this.f;
        wwd0Var2.getClass();
        wwd0Var2.k(null, str);
    }

    public final void C1(TimePickerItem timePickerItem, boolean z) {
        if (timePickerItem == null) {
            if (((Number) this.H.getValue()).intValue() == 2) {
                TimePickerItem.Companion companion = TimePickerItem.INSTANCE;
                Calendar calendar = Calendar.getInstance();
                calendar.getClass();
                companion.getClass();
                timePickerItem = TimePickerItem.Companion.b(calendar, calendar);
            } else {
                timePickerItem = null;
            }
        }
        this.B.setValue(timePickerItem);
        if (z) {
            y1(true);
        }
    }

    public final void x1() {
        wwd0 wwd0Var = this.L;
        if (((Boolean) wwd0Var.getValue()).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            ej5.c(o8i0.d(this), null, null, new b(null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    public final void y1(boolean z) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        jvd0 jvd0Var = this.P;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        TimePickerItem timePickerItem = (TimePickerItem) this.B.getValue();
        eek eekVar = this.a;
        nkb0 nkb0Var = eekVar.a;
        if (timePickerItem != null) {
            long startTime = timePickerItem.getStartTime();
            lValueOf = Long.valueOf(startTime);
            if (timePickerItem.isTimeRange() || startTime <= 0) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        if (timePickerItem != null) {
            long endTime = timePickerItem.getEndTime();
            lValueOf2 = Long.valueOf(endTime);
            if (timePickerItem.isTimeRange() || endTime <= 0) {
                lValueOf2 = null;
            }
        } else {
            lValueOf2 = null;
        }
        if (timePickerItem != null) {
            long startTime2 = timePickerItem.getStartTime();
            lValueOf3 = Long.valueOf(startTime2);
            if (!timePickerItem.isTimeRange() || startTime2 <= 0) {
                lValueOf3 = null;
            }
        } else {
            lValueOf3 = null;
        }
        this.P = kzh.d(new yzh(new g1i(new xzh(ozh.c(new n1i(nkb0Var.k(lValueOf, lValueOf2, lValueOf3), timePickerItem != null ? new gzh(m2g.a) : nkb0Var.g(), new dek(3, null)), eekVar.b), new c(z, this, null)), new d(null)), new e(null)), o8i0.d(this));
    }

    public final Boolean z1(String str) {
        List list;
        str.getClass();
        if (!this.d.isLogin() || (list = (List) ((Map) this.z.getValue()).get(this.f.getValue())) == null) {
            return null;
        }
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.g(((Tournament) it.next()).getId(), str)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
