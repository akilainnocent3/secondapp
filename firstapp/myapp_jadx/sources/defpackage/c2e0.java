package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.sportystories.domain.entity.Story;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lc2e0;", "Lj8i0;", "b", "a", "d", "c", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c2e0 extends j8i0 {
    public final t340 A;
    public final wwd0 B;
    public final v340 C;
    public final wwd0 D;
    public final v340 E;
    public long F;
    public long G;
    public Long H;
    public long I;
    public jvd0 J;
    public final f K;
    public final rek a;
    public final azm b;
    public final iym c;
    public final y8j d;
    public final a8z e;
    public final muh f;
    public final us7 i;
    public final b390 v;
    public final wwd0 w;
    public final v340 y;
    public final b390 z;

    public static abstract class a {

        /* JADX INFO: renamed from: c2e0$a$a, reason: collision with other inner class name */
        public static final class C0151a extends a {
            public static final C0151a a = new C0151a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0151a);
            }

            public final int hashCode() {
                return -442875143;
            }

            public final String toString() {
                return "Error";
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1414388205;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c extends a {
            public final List<Story> a;
            public final boolean b;

            public c(List<Story> list, boolean z) {
                list.getClass();
                this.a = list;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(stories=" + this.a + ", showStoryViewer=" + this.b + ")";
            }
        }
    }

    public static final class b {
        public static final int d = Story.$stable;
        public final Story a;
        public final float b;
        public final boolean c;

        public b(Story story, float f, boolean z) {
            story.getClass();
            this.a = story;
            this.b = f;
            this.c = z;
        }

        public static b a(b bVar, float f, boolean z, int i) {
            Story story = bVar.a;
            if ((i & 2) != 0) {
                f = bVar.b;
            }
            story.getClass();
            return new b(story, f, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0 && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + tvh.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StoryProgress(story=");
            sb.append(this.a);
            sb.append(", progress=");
            sb.append(this.b);
            sb.append(", hideHeader=");
            return mq0.a(sb, this.c, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final /* synthetic */ c[] c;

        static {
            c cVar = new c("SWIPE", 0);
            a = cVar;
            c cVar2 = new c("TAP", 1);
            b = cVar2;
            c = new c[]{cVar, cVar2};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) c.clone();
        }
    }

    public static abstract class d {

        public static final class a extends d {
            public final Event a;

            public a(Event event) {
                this.a = event;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ShowGiftDialog(event=" + this.a + ")";
            }
        }

        public static final class b extends d {
            public final int a;
            public final Integer b;
            public final Function0<Unit> c;

            public b(int i, Integer num, l460 l460Var) {
                this.a = i;
                this.b = num;
                this.c = l460Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.a) * 31;
                Integer num = this.b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Function0<Unit> function0 = this.c;
                return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
            }

            public final String toString() {
                return "ShowSnackbar(messageRes=" + this.a + ", actionRes=" + this.b + ", onActionClick=" + this.c + ")";
            }
        }

        public static final class c extends d {
            public final String a;
            public final String b;
            public final boolean c;
            public final EventSource d;

            static {
                Parcelable.Creator<EventSource> creator = EventSource.CREATOR;
            }

            public c(String str, String str2, boolean z, EventSource eventSource) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
                this.c = z;
                this.d = eventSource;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c && Intrinsics.g(this.d, cVar.d);
            }

            public final int hashCode() {
                int iA = mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
                EventSource eventSource = this.d;
                return iA + (eventSource == null ? 0 : eventSource.hashCode());
            }

            public final String toString() {
                StringBuilder sbA = ux5.a("ShowStatsDialog(eventId=", this.a, ", sportId=", this.b, ", isLive=");
                sbA.append(this.c);
                sbA.append(", eventSource=");
                sbA.append(this.d);
                sbA.append(")");
                return sbA.toString();
            }
        }
    }

    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                c cVar = c.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c cVar2 = c.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$pauseStoryProgress$1", f = "StoriesViewModel.kt", l = {255}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ c2e0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(v1b v1bVar, c2e0 c2e0Var) {
            super(2, v1bVar);
            this.b = c2e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new g(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            b bVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(300L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            c2e0 c2e0Var = this.b;
            jvd0 jvd0Var = c2e0Var.J;
            if (jvd0Var == null || !jvd0Var.isActive() || jvd0Var.isCompleted()) {
                wwd0 wwd0Var = c2e0Var.D;
                do {
                    value = wwd0Var.getValue();
                    bVar = (b) value;
                } while (!wwd0Var.g(value, bVar != null ? b.a(bVar, 0.0f, true, 3) : null));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$special$$inlined$flatMapLatest$1", f = "StoriesViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements gaj<myh<? super zi50<? extends List<? extends Story>>>, Unit, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ c2e0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(v1b v1bVar, c2e0 c2e0Var) {
            super(3, v1bVar);
            this.d = c2e0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zi50<? extends List<? extends Story>>> myhVar, Unit unit, v1b<? super Unit> v1bVar) {
            h hVar = new h(v1bVar, this.d);
            hVar.b = myhVar;
            hVar.c = unit;
            return hVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                rek rekVar = this.d.a;
                rekVar.getClass();
                yzh yzhVar = new yzh(new or60(new pek(rekVar, null)), new qek(3, null));
                f4j0 f4j0Var = rekVar.b;
                yzh yzhVar2 = new yzh(new l(new n1i(yzhVar, new h4j0(f4j0Var.a.a(), f4j0Var), new oek(3, null))), new j(3, null));
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, yzhVar2, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$startStoryProgress$2", f = "StoriesViewModel.kt", l = {235}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public long a;
        public int b;
        public final /* synthetic */ c2e0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(v1b v1bVar, c2e0 c2e0Var) {
            super(2, v1bVar);
            this.c = c2e0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new i(v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0058  */
        /* JADX WARN: Code duplicated, block: B:24:0x0079  */
        /* JADX WARN: Code duplicated, block: B:25:0x007e  */
        /* JADX WARN: Code duplicated, block: B:30:0x0091 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008f -> B:31:0x0092). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c2e0.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$storiesUiState$1$2", f = "StoriesViewModel.kt", l = {98}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements gaj<myh<? super zi50<? extends List<? extends Story>>>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zi50<? extends List<? extends Story>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            j jVar = new j(3, v1bVar);
            jVar.b = myhVar;
            jVar.c = th;
            return jVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            Throwable th = this.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                zi50 zi50Var = new zi50(uj50.a(th));
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(zi50Var, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$storiesUiState$2", f = "StoriesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends tje0 implements gaj<zi50<? extends List<? extends Story>>, Boolean, v1b<? super a>, Object> {
        public /* synthetic */ Object a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(zi50<? extends List<? extends Story>> zi50Var, Boolean bool, v1b<? super a> v1bVar) {
            Object obj = zi50Var.a;
            boolean zBooleanValue = bool.booleanValue();
            k kVar = new k(3, v1bVar);
            kVar.a = obj;
            kVar.b = zBooleanValue;
            return kVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return zi50.a(obj2) == null ? new a.c((List) obj2, z) : a.C0151a.a;
        }
    }

    public static final class l implements lyh<zi50<? extends List<? extends Story>>> {
        public final /* synthetic */ n1i a;

        @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$storiesUiState$lambda$0$$inlined$map$1", f = "StoriesViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return l.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$storiesUiState$lambda$0$$inlined$map$1$2", f = "StoriesViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    zi50 zi50Var = new zi50((List) obj);
                    aVar.b = 1;
                    if (this.a.emit(zi50Var, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public l(n1i n1iVar) {
            this.a = n1iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super zi50<? extends List<? extends Story>>> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public c2e0(rek rekVar, azm azmVar, iym iymVar, y8j y8jVar, a8z a8zVar, muh muhVar, us7 us7Var) {
        azmVar.getClass();
        iymVar.getClass();
        y8jVar.getClass();
        muhVar.getClass();
        this.a = rekVar;
        this.b = azmVar;
        this.c = iymVar;
        this.d = y8jVar;
        this.e = a8zVar;
        this.f = muhVar;
        this.i = us7Var;
        b390 b390VarB = d390.b(1, 0, null, 6);
        this.v = b390VarB;
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.w = wwd0VarA;
        this.y = e1i.e(new n1i(r0i.f(b390VarB, new h(null, this)), wwd0VarA, new k(3, null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), a.b.a);
        b390 b390VarB2 = d390.b(0, 0, null, 7);
        this.z = b390VarB2;
        this.A = e1i.a(b390VarB2);
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.B = wwd0VarA2;
        this.C = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(null);
        this.D = wwd0VarA3;
        this.E = e1i.b(wwd0VarA3);
        ej5.c(o8i0.d(this), null, null, new e2e0(null, this), 3);
        this.K = new f();
    }

    public final void A1(String str) {
        String storyId;
        Story storyX1 = x1();
        if (storyX1 == null || (storyId = storyX1.getStoryId()) == null) {
            return;
        }
        gym.a(this.c, new ubd0(this.F, this.I, storyId, str));
        Story storyX2 = x1();
        this.d.f(AnalyticsEvent.STORY_CTA_BTN_CLICK, kpu.f(new Pair(AnalyticsParam.STORY_ID, storyX2 != null ? storyX2.getStoryId() : null), new Pair(AnalyticsParam.STORY_ELAPSED_TIME, Long.valueOf(this.F)), new Pair(AnalyticsParam.STORY_PAUSE_DURATION, Long.valueOf(this.I)), new Pair(AnalyticsParam.STORY_CTA_TARGET, str)));
    }

    public final void B1(String str) {
        gym.a(this.c, new xbd0(str, this.F, this.I));
        this.d.f(AnalyticsEvent.STORY_SKIP, kpu.f(new Pair(AnalyticsParam.STORY_ELAPSED_TIME, Long.valueOf(this.F)), new Pair(AnalyticsParam.STORY_PAUSE_DURATION, Long.valueOf(this.I)), new Pair("reason", str)));
    }

    public final void C1(String str) {
        this.d.f(AnalyticsEvent.STORY_CONTENT_AREA_SWIPE, jpu.b(new Pair("value", str)));
        B1(AnalyticsParam.STORY_SKIP_REASON_SWIPE);
    }

    public final void D1() {
        this.F = 0L;
        jvd0 jvd0Var = this.J;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.B.setValue(null);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var = this.w;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    public final void E1(int i2, c cVar) {
        String storyId;
        Integer numY1;
        if (this.y.a.getValue() instanceof a.c) {
            wwd0 wwd0Var = this.B;
            Integer num = (Integer) wwd0Var.getValue();
            if ((num != null && num.intValue() == i2) || i2 < 0 || i2 >= z1().size()) {
                return;
            }
            Integer numY2 = y1();
            y8j y8jVar = this.d;
            if (numY2 != null) {
                if (i2 <= numY2.intValue()) {
                    numY2 = null;
                }
                if (numY2 != null) {
                    int i3 = cVar == null ? -1 : e.a[cVar.ordinal()];
                    if (i3 == 1) {
                        C1(AnalyticsParam.STORY_SWIPE_LEFT);
                    } else if (i3 == 2) {
                        y8j.a(y8jVar, AnalyticsEvent.STORY_RIGHT_AREA_CLICK);
                        B1(AnalyticsParam.STORY_SKIP_REASON_TAP);
                    }
                }
            }
            kd2.a(i2, wwd0Var, null);
            jvd0 jvd0Var = this.J;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.F = 0L;
            b bVar = new b(z1().get(i2), 0.0f, false);
            wwd0 wwd0Var2 = this.D;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bVar);
            this.H = null;
            this.I = 0L;
            Story storyX1 = x1();
            if (storyX1 != null && (storyId = storyX1.getStoryId()) != null && (numY1 = y1()) != null) {
                gym.a(this.c, new ybd0(storyId, numY1.intValue()));
                Story storyX2 = x1();
                y8jVar.f(AnalyticsEvent.STORY_VIEW, kpu.f(new Pair(AnalyticsParam.STORY_ID, storyX2 != null ? storyX2.getStoryId() : null), new Pair("position", y1())));
            }
            G1();
        }
    }

    public final void F1() {
        jvd0 jvd0Var = this.J;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.H = Long.valueOf(this.i.a().a());
        ej5.c(o8i0.d(this), null, null, new g(null, this), 3);
    }

    public final void G1() {
        jvd0 jvd0Var = this.J;
        if (jvd0Var == null || !jvd0Var.isActive() || jvd0Var.isCompleted()) {
            us7 us7Var = this.i;
            this.G = us7Var.a().a() - this.F;
            Long l2 = this.H;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                this.I = (us7Var.a().a() - jLongValue) + this.I;
            }
            this.J = ej5.c(o8i0.d(this), null, null, new i(null, this), 3);
        }
    }

    public final Story x1() {
        Integer numY1 = y1();
        if (numY1 != null) {
            return (Story) CollectionsKt.V(numY1.intValue(), z1());
        }
        return null;
    }

    public final Integer y1() {
        return (Integer) this.B.getValue();
    }

    public final List<Story> z1() {
        Object value = this.y.a.getValue();
        a.c cVar = value instanceof a.c ? (a.c) value : null;
        List<Story> list = cVar != null ? cVar.a : null;
        return list == null ? m2g.a : list;
    }

    public static final class f implements xeh {

        @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$featuredMatchClickListener$1$onGiftClicked$1", f = "StoriesViewModel.kt", l = {303}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ c2e0 b;
            public final /* synthetic */ Event c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c2e0 c2e0Var, Event event, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = c2e0Var;
                this.c = event;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                c2e0 c2e0Var = this.b;
                if (i == 0) {
                    uj50.b(obj);
                    b390 b390Var = c2e0Var.z;
                    d.a aVar = new d.a(this.c);
                    this.a = 1;
                    if (b390Var.emit(aVar, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                c2e0Var.A1(AnalyticsParam.STORY_CTA_TARGET_FEATURED_MATCH_REDIRECT);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$featuredMatchClickListener$1$onOutcomeClicked$1", f = "StoriesViewModel.kt", l = {313}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ c2e0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z, c2e0 c2e0Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = z;
                this.c = c2e0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                c2e0 c2e0Var = this.c;
                boolean z = this.b;
                int i2 = 1;
                if (i == 0) {
                    uj50.b(obj);
                    int i3 = z ? R.string.common_functions__added_to_betslip : R.string.common_functions__removed_from_betslip;
                    b390 b390Var = c2e0Var.z;
                    d.b bVar = new d.b(i3, new Integer(R.string.common_functions__view_betslip), new l460(i2));
                    this.a = 1;
                    if (b390Var.emit(bVar, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                if (z) {
                    c2e0Var.A1("add_to_betslip");
                }
                return Unit.a;
            }
        }

        @c0d(c = "com.sportybet.plugin.sportystories.presentation.StoriesViewModel$featuredMatchClickListener$1$onStatsClicked$1", f = "StoriesViewModel.kt", l = {296}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ c2e0 b;
            public final /* synthetic */ Event c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(c2e0 c2e0Var, Event event, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = c2e0Var;
                this.c = event;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                c2e0 c2e0Var = this.b;
                if (i == 0) {
                    uj50.b(obj);
                    b390 b390Var = c2e0Var.z;
                    Event event = this.c;
                    String str = event.eventId;
                    str.getClass();
                    String str2 = event.sport.id;
                    str2.getClass();
                    d.c cVar = new d.c(str, str2, event.isLiveOrFinished(), event.eventSource);
                    this.a = 1;
                    if (b390Var.emit(cVar, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                c2e0Var.A1(AnalyticsParam.STORY_CTA_TARGET_FEATURED_MATCH_REDIRECT);
                return Unit.a;
            }
        }

        public f() {
        }

        @Override // defpackage.xeh
        public final void a(Event event) {
            c2e0 c2e0Var = c2e0.this;
            ej5.c(o8i0.d(c2e0Var), null, null, new c(c2e0Var, event, null), 3);
        }

        @Override // defpackage.xeh
        public final void c(Event event) {
            c2e0 c2e0Var = c2e0.this;
            ej5.c(o8i0.d(c2e0Var), null, null, new a(c2e0Var, event, null), 3);
        }

        @Override // defpackage.xeh
        public final void d(Selection selection, boolean z) {
            c2e0 c2e0Var = c2e0.this;
            ej5.c(o8i0.d(c2e0Var), null, null, new b(z, c2e0Var, null), 3);
        }

        @Override // defpackage.xeh
        public final void f(Event event, Market market, z7z z7zVar) {
            z7zVar.getClass();
            if (z7zVar instanceof z7z.b) {
                c2e0.this.f.a(apg.b(event, market), brg.FEATURED_MATCH);
            }
        }

        @Override // defpackage.xeh
        public final z7z g(Event event, Market market, Outcome outcome) {
            return c2e0.this.e.a(event, market, outcome);
        }

        @Override // defpackage.xeh
        public final void l(Event event) {
            Sport sport = event.sport;
            String strA = lx5.a("sportybet://tournament?sportId=", sport.id, "&tournamentId=", sport.category.tournament.id);
            c2e0 c2e0Var = c2e0.this;
            c2e0Var.b.l(Uri.parse(strA), null);
            c2e0Var.A1(AnalyticsParam.STORY_CTA_TARGET_FEATURED_MATCH_REDIRECT);
        }

        @Override // defpackage.xeh
        public final void m(Event event, com.sportybet.plugin.realsports.home.featuredsection.a aVar) {
            String str = event.status == 0 ? "prematch" : "live";
            StringBuilder sbA = ux5.a("sportybet://event?sportId=", event.sport.id, "&eventId=", event.eventId, "&eventType=");
            sbA.append(str);
            String string = sbA.toString();
            c2e0 c2e0Var = c2e0.this;
            c2e0Var.b.l(Uri.parse(string), null);
            c2e0Var.A1(AnalyticsParam.STORY_CTA_TARGET_FEATURED_MATCH_REDIRECT);
        }

        @Override // defpackage.xeh
        public final void r(String str, Function2<? super String, ? super v5b, Unit> function2) {
            str.getClass();
            c2e0 c2e0Var = c2e0.this;
            function2.invoke(str, o8i0.d(c2e0Var));
            c2e0Var.A1(AnalyticsParam.STORY_CTA_TARGET_FEATURED_MATCH_REDIRECT);
        }

        @Override // defpackage.xeh
        public final void t(String str, String str2, String str3) {
        }
    }
}
