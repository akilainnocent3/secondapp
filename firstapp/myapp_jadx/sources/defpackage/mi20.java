package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sportybet.plugin.realsports.data.Event;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmi20;", "Lj8i0;", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mi20 extends j8i0 {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public final tuw D;
    public String E;
    public jvd0 F;
    public a G;
    public sa20 H;
    public final s05 a;
    public final pws b;
    public final xo20 c;
    public final rdd0 d;
    public final yqm e;
    public final ku90<com.sporty.android.common.uievent.a> f;
    public final lyh<com.sporty.android.common.uievent.a> i;
    public final ku90<mws> v;
    public final lyh<mws> w;
    public final ku90<wz80> y;
    public final lyh<wz80> z;

    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return uf80.a(ux5.a("EventContentSnapshot(eventId=", this.a, ", homeTeamIconUrl=", this.b, ", awayTeamIconUrl="), this.c, ")");
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.event.recommendcode.PreMatchRecommendedCodeViewModel$fetchRecommendedCodes$1", f = "PreMatchRecommendedCodeViewModel.kt", l = {107, 127, 129}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ c9p c;
        public final /* synthetic */ mi20 d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ Event f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, c9p c9pVar, mi20 mi20Var, boolean z, Event event, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = str;
            this.c = c9pVar;
            this.d = mi20Var;
            this.e = z;
            this.f = event;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0058  */
        /* JADX WARN: Code duplicated, block: B:25:0x005b  */
        /* JADX WARN: Code duplicated, block: B:27:0x005e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0061  */
        /* JADX WARN: Code duplicated, block: B:35:0x008f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:36:0x0091  */
        /* JADX WARN: Code duplicated, block: B:37:0x0095  */
        /* JADX WARN: Code duplicated, block: B:39:0x0098  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r0 == r8) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
        
            if (r6.A1(r13.b, r2, r9, 0, false, r13.e, r13) == r8) goto L42;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                y5b r8 = defpackage.y5b.a
                int r0 = r13.a
                com.sportybet.plugin.realsports.data.Event r1 = r13.f
                java.lang.String r2 = r13.b
                r3 = 3
                r4 = 2
                r5 = 1
                mi20 r6 = r13.d
                r9 = 0
                if (r0 == 0) goto L2b
                if (r0 == r5) goto L26
                if (r0 == r4) goto L21
                if (r0 != r3) goto L1b
                defpackage.uj50.b(r14)
                goto Lac
            L1b:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r9
            L21:
                defpackage.uj50.b(r14)
                goto L8f
            L26:
                defpackage.uj50.b(r14)
                r0 = r14
                goto L41
            L2b:
                defpackage.uj50.b(r14)
                if (r2 != 0) goto L33
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            L33:
                c9p r0 = r13.c
                if (r0 == 0) goto L43
                r13.a = r5
                java.lang.Object r0 = defpackage.i9p.c(r0, r13)
                if (r0 != r8) goto L41
                goto Lab
            L41:
                kotlin.Unit r0 = (kotlin.Unit) r0
            L43:
                wwd0 r0 = r6.A
                nj40$d r10 = new nj40$d
                m2g r11 = defpackage.m2g.a
                boolean r12 = r13.e
                r10.<init>(r11, r12)
                r0.getClass()
                r0.k(r9, r10)
                r6.E = r2
                if (r1 == 0) goto L5b
                java.lang.String r0 = r1.homeTeamIcon
                goto L5c
            L5b:
                r0 = r9
            L5c:
                if (r1 == 0) goto L61
                java.lang.String r10 = r1.awayTeamIcon
                goto L62
            L61:
                r10 = r9
            L62:
                mi20$a r11 = new mi20$a
                r11.<init>(r2, r0, r10)
                r6.G = r11
                wwd0 r0 = r6.B
            L6b:
                java.lang.Object r2 = r0.getValue()
                r10 = r2
                mj40 r10 = (defpackage.mj40) r10
                m2g r11 = defpackage.m2g.a
                r10.getClass()
                r11.getClass()
                mj40 r10 = new mj40
                r12 = 0
                r10.<init>(r12, r11, r5)
                boolean r2 = r0.g(r2, r10)
                if (r2 == 0) goto L6b
                r13.a = r4
                java.lang.Object r0 = r6.C1(r13)
                if (r0 != r8) goto L8f
                goto Lab
            L8f:
                if (r1 == 0) goto L95
                java.lang.String r0 = r1.homeTeamIcon
                r2 = r0
                goto L96
            L95:
                r2 = r9
            L96:
                if (r1 == 0) goto L9a
                java.lang.String r9 = r1.awayTeamIcon
            L9a:
                r13.a = r3
                java.lang.String r1 = r13.b
                r4 = 0
                r5 = 0
                r0 = r6
                boolean r6 = r13.e
                r7 = r13
                r3 = r9
                java.lang.Object r0 = r0.A1(r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r8) goto Lac
            Lab:
                return r8
            Lac:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mi20.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public mi20(s05 s05Var, pws pwsVar, xo20 xo20Var, rdd0 rdd0Var, yqm yqmVar) {
        s05Var.getClass();
        rdd0Var.getClass();
        yqmVar.getClass();
        this.a = s05Var;
        this.b = pwsVar;
        this.c = xo20Var;
        this.d = rdd0Var;
        this.e = yqmVar;
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.f = ku90Var;
        this.i = szh.a(e1i.a(ku90Var), 300L);
        ku90<mws> ku90Var2 = new ku90<>();
        this.v = ku90Var2;
        this.w = szh.a(e1i.a(ku90Var2), 300L);
        ku90<wz80> ku90Var3 = new ku90<>();
        this.y = ku90Var3;
        this.z = szh.a(e1i.a(ku90Var3), 300L);
        this.A = xwd0.a(new nj40.b(null));
        this.B = xwd0.a(new mj40(0));
        this.C = xwd0.a(Boolean.FALSE);
        this.D = uuw.a();
        this.H = sa20.THREE_FIVE_SELECTIONS;
    }

    public static void x1(mi20 mi20Var, List list, String str, String str2, int i) {
        int i2;
        if ((i & 1) != 0) {
            list = mi20Var.z1();
        }
        List list2 = list;
        int iOrdinal = mi20Var.H.ordinal();
        if (iOrdinal == 0) {
            i2 = 130;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            i2 = 220;
        }
        int i3 = i2;
        String str3 = mi20Var.E;
        String str4 = (i & 8) != 0 ? null : str;
        String str5 = (i & 16) != 0 ? null : str2;
        wwd0 wwd0Var = mi20Var.A;
        nj40.a aVar = new nj40.a(kz4.e(list2, sch.b, false, false, i3, str3, str4, str5, null, 32));
        wwd0Var.getClass();
        wwd0Var.k(null, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0111 A[EDGE_INSN: B:119:0x0111->B:66:0x0111 BREAK  A[LOOP:1: B:56:0x00dc->B:70:0x0131], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:29:0x008f, B:31:0x0099, B:38:0x00b4, B:40:0x00b8, B:44:0x00c2, B:46:0x00c8, B:51:0x00d0, B:55:0x00d6, B:56:0x00dc, B:58:0x00e5, B:60:0x00ed, B:62:0x00fb, B:64:0x0103, B:66:0x0111, B:26:0x0084), top: B:111:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x00b1, TRY_ENTER, TryCatch #0 {all -> 0x00b1, blocks: (B:29:0x008f, B:31:0x0099, B:38:0x00b4, B:40:0x00b8, B:44:0x00c2, B:46:0x00c8, B:51:0x00d0, B:55:0x00d6, B:56:0x00dc, B:58:0x00e5, B:60:0x00ed, B:62:0x00fb, B:64:0x0103, B:66:0x0111, B:26:0x0084), top: B:111:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:29:0x008f, B:31:0x0099, B:38:0x00b4, B:40:0x00b8, B:44:0x00c2, B:46:0x00c8, B:51:0x00d0, B:55:0x00d6, B:56:0x00dc, B:58:0x00e5, B:60:0x00ed, B:62:0x00fb, B:64:0x0103, B:66:0x0111, B:26:0x0084), top: B:111:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:29:0x008f, B:31:0x0099, B:38:0x00b4, B:40:0x00b8, B:44:0x00c2, B:46:0x00c8, B:51:0x00d0, B:55:0x00d6, B:56:0x00dc, B:58:0x00e5, B:60:0x00ed, B:62:0x00fb, B:64:0x0103, B:66:0x0111, B:26:0x0084), top: B:111:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:70:0x0131 A[LOOP:1: B:56:0x00dc->B:70:0x0131, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x013b A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #1 {all -> 0x0183, blocks: (B:73:0x0137, B:75:0x013b, B:80:0x0153, B:82:0x015b, B:89:0x0177, B:92:0x0185, B:94:0x018f, B:99:0x01b4), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153 A[Catch: all -> 0x0183, TRY_ENTER, TryCatch #1 {all -> 0x0183, blocks: (B:73:0x0137, B:75:0x013b, B:80:0x0153, B:82:0x015b, B:89:0x0177, B:92:0x0185, B:94:0x018f, B:99:0x01b4), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x015b A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #1 {all -> 0x0183, blocks: (B:73:0x0137, B:75:0x013b, B:80:0x0153, B:82:0x015b, B:89:0x0177, B:92:0x0185, B:94:0x018f, B:99:0x01b4), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0173  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177 A[Catch: all -> 0x0183, TRY_ENTER, TryCatch #1 {all -> 0x0183, blocks: (B:73:0x0137, B:75:0x013b, B:80:0x0153, B:82:0x015b, B:89:0x0177, B:92:0x0185, B:94:0x018f, B:99:0x01b4), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0185 A[Catch: all -> 0x0183, TryCatch #1 {all -> 0x0183, blocks: (B:73:0x0137, B:75:0x013b, B:80:0x0153, B:82:0x015b, B:89:0x0177, B:92:0x0185, B:94:0x018f, B:99:0x01b4), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x018f A[Catch: all -> 0x0183, TRY_LEAVE, TryCatch #1 {all -> 0x0183, blocks: (B:73:0x0137, B:75:0x013b, B:80:0x0153, B:82:0x015b, B:89:0x0177, B:92:0x0185, B:94:0x018f, B:99:0x01b4), top: B:112:0x0137 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b4 A[Catch: all -> 0x0183, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0183, blocks: (B:73:0x0137, B:75:0x013b, B:80:0x0153, B:82:0x015b, B:89:0x0177, B:92:0x0185, B:94:0x018f, B:99:0x01b4), top: B:112:0x0137 }] */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0135, code lost:
    
        r15 = r23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1(java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, boolean r22, boolean r23, defpackage.x1b r24) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi20.A1(java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, x1b):java.lang.Object");
    }

    public final void B1(ez4 ez4Var) {
        if (ez4Var instanceof ez4.c) {
            ej5.c(o8i0.d(this), null, null, new ri20(this, ((ez4.c) ez4Var).a, null), 3);
        } else {
            if (ez4Var instanceof ez4.a) {
                ez4.a aVar = (ez4.a) ez4Var;
                ej5.c(o8i0.d(this), null, null, new ni20(this, aVar.a, aVar.b, null), 3);
                return;
            }
            if ((ez4Var instanceof ez4.b) || (ez4Var instanceof ez4.d)) {
                return;
            }
            uhc.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C1(x1b x1bVar) {
        qi20 qi20Var;
        if (x1bVar instanceof qi20) {
            qi20Var = (qi20) x1bVar;
            int i = qi20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qi20Var.c = i - Integer.MIN_VALUE;
            } else {
                qi20Var = new qi20(this, x1bVar);
            }
        } else {
            qi20Var = new qi20(this, x1bVar);
        }
        Object objC = qi20Var.a;
        y5b y5bVar = y5b.a;
        int i2 = qi20Var.c;
        if (i2 == 0) {
            uj50.b(objC);
            vl50 vl50VarF = bm50.f(this.e.j(z76.k));
            qi20Var.c = 1;
            objC = s0i.c(vl50VarF, qi20Var);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        sa20 sa20Var = (sa20) objC;
        if (sa20Var == null) {
            sa20Var = sa20.THREE_FIVE_SELECTIONS;
        }
        this.H = sa20Var;
        return Unit.a;
    }

    public final void D1(rd20 rd20Var, k00... k00VarArr) {
        rd20Var.getClass();
        this.d.a(rd20Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
    }

    public final void y1(Event event, String str, boolean z) {
        this.F = ej5.c(o8i0.d(this), null, null, new b(str, this.F, this, z, event, null), 3);
    }

    public final List<BookingCodeInfoDto> z1() {
        return ((mj40) this.B.getValue()).a;
    }
}
