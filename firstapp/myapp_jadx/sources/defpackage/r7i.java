package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class r7i {

    @c0d(c = "com.sportybet.android.codehub.ui.FollowCodeScreenKt$FollowCodeScreen$1$1$1", f = "FollowCodeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<b6i, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ Function2<String, b6i.e, Unit> c;
        public final /* synthetic */ Function1<b6i.c, Unit> d;
        public final /* synthetic */ Function1<b6i.a, Unit> e;
        public final /* synthetic */ Function1<b6i.d, Unit> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<Unit> function0, Function2<? super String, ? super b6i.e, Unit> function2, Function1<? super b6i.c, Unit> function1, Function1<? super b6i.a, Unit> function3, Function1<? super b6i.d, Unit> function4, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = function0;
            this.c = function2;
            this.d = function1;
            this.e = function3;
            this.f = function4;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b6i b6iVar, v1b<? super Unit> v1bVar) {
            return ((a) create(b6iVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            b6i b6iVar = (b6i) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (b6iVar instanceof b6i.b) {
                this.b.invoke();
            } else if (b6iVar instanceof b6i.e) {
                this.c.invoke(((b6i.e) b6iVar).b, (b6i.e) b6iVar);
            } else if (b6iVar instanceof b6i.c) {
                this.d.invoke((b6i.c) b6iVar);
            } else if (b6iVar instanceof b6i.a) {
                this.e.invoke((b6i.a) b6iVar);
            } else {
                if (!(b6iVar instanceof b6i.d)) {
                    uhc.a();
                    return null;
                }
                this.f.invoke((b6i.d) b6iVar);
            }
            return Unit.a;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(1014811284);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(j.e(aVar2, 1.0f), "follow_code_loading");
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            q330.a(dw.a(aVar2, 0.5f), c68.a(R.color.text_type1_secondary, bVarI), 0.0f, 0L, 0, 0.0f, bVarI, 6, 60);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new f7i();
        }
    }

    public static final void b(Function0 function0, op8 op8Var, androidx.compose.runtime.a aVar, int i) {
        b bVarI = aVar.i(-1478065115);
        int i2 = (bVarI.A(function0) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d930 d930VarB = zcg.b(i2 & WebSocketProtocol.PAYLOAD_SHORT, bVarI, function0, false);
            d dVarA = a930.a(j.e(d.a.b, 1.0f), d930VarB);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            op8Var.invoke(bVarI, 6);
            w830.b(false, d930VarB, null, c68.a(R.color.background_type1_primary, bVarI), c68.a(R.color.text_type1_primary, bVarI), bVarI, 70, 36);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new z6i(function0, op8Var, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v85 */
    public static final void c(final u7i u7iVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function2<? super String, ? super b6i.e, Unit> function2, final Function1<? super b6i.c, Unit> function3, final Function1<? super b6i.a, Unit> function4, final Function1<? super b6i.d, Unit> function5, final Function2<? super String, ? super String, Unit> function6, final Function1<? super String, Unit> function7, androidx.compose.runtime.a aVar, final int i) {
        u7i u7iVar2;
        ?? r0;
        boolean z;
        d.a aVar2;
        boolean z2;
        v3a0 v3a0Var;
        u7iVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        b bVarI = aVar.i(-57504638);
        int i2 = i | (bVarI.A(u7iVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536) | (bVarI.A(function5) ? 1048576 : 524288) | (bVarI.A(function6) ? 8388608 : 4194304) | (bVarI.A(function7) ? 67108864 : 33554432);
        if (bVarI.q(i2 & 1, (i2 & 38347923) != 38347922)) {
            ytw ytwVarC = wyh.c(u7iVar.i, bVarI, 0, 7);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = b40.a(bVarI);
            }
            v3a0 v3a0Var2 = (v3a0) objY;
            int i3 = i2 & 14;
            int i4 = i2 & 896;
            boolean z3 = (i3 == 4 || bVarI.A(u7iVar)) | (i4 == 256);
            int i5 = i2 & 7168;
            boolean z4 = (i5 == 2048) | z3;
            int i6 = i2 & 57344;
            int i7 = i2 & 458752;
            boolean z5 = z4 | (i6 == 16384) | (i7 == 131072);
            int i8 = i2 & 3670016;
            boolean z6 = z5 | (i8 == 1048576);
            Object objY2 = bVarI.y();
            if (z6 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: p6i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        u7i u7iVar3 = u7iVar;
                        kzh.d(new g1i(u7iVar3.v.b, new r7i.a(function1, function2, function3, function4, function5, null)), o8i0.d(u7iVar3));
                        u7iVar3.x1(true);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            xfa.b((Function0) objY2, bVarI, 0);
            boolean z7 = i3 == 4 || bVarI.A(u7iVar);
            Object objY3 = bVarI.y();
            if (z7 || objY3 == c0042a) {
                r0 = 0;
                objY3 = new a7i(u7iVar, 0);
                bVarI.r(objY3);
            } else {
                r0 = 0;
            }
            xfa.e((Function0) objY3, bVarI, r0);
            d.a aVar3 = d.a.b;
            d dVarE = j.e(aVar3, 1.0f);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new k7i(r0);
                bVarI.r(objY4);
            }
            d dVarB = xa80.b(dVarE, r0, (Function1) objY4);
            aiv aivVarC = g75.c(ht.a.b, r0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            x7i x7iVar = (x7i) ytwVarC.getValue();
            if (x7iVar instanceof x7i.a) {
                bVarI.N(-1400438891);
                boolean z8 = i3 == 4 || bVarI.A(u7iVar);
                Object objY5 = bVarI.y();
                if (z8 || objY5 == c0042a) {
                    z = true;
                    objY5 = new vi4(u7iVar, 1);
                    bVarI.r(objY5);
                } else {
                    z = true;
                }
                b((Function0) objY5, pp8.b(-389753935, new l7i(ytwVarC, function0), bVarI), bVarI, 390);
                bVarI.X(false);
            } else {
                z = true;
                if (x7iVar instanceof x7i.e) {
                    bVarI.N(-1399969427);
                    boolean z9 = i3 == 4 || bVarI.A(u7iVar);
                    Object objY6 = bVarI.y();
                    if (z9 || objY6 == c0042a) {
                        objY6 = new Function0() { // from class: m7i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                u7iVar.x1(true);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY6);
                    }
                    b((Function0) objY6, pp8.b(1959789530, new Function2() { // from class: n7i
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar5 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                r7i.h(function1, aVar5, 0);
                            } else {
                                aVar5.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 390);
                    bVarI.X(false);
                } else {
                    int i9 = 0;
                    if (x7iVar instanceof x7i.c) {
                        bVarI.N(-1399579075);
                        u7iVar2 = u7iVar;
                        z2 = true;
                        g(v3a0Var2, function0, function1, function2, function3, function4, function5, function6, function7, null, bVarI, (i2 & 112) | 6 | i4 | i5 | i6 | i7 | i8 | (i2 & 29360128) | (i2 & 234881024));
                        v3a0Var = v3a0Var2;
                        bVarI.X(false);
                        aVar2 = aVar3;
                    } else {
                        u7iVar2 = u7iVar;
                        aVar2 = aVar3;
                        z2 = true;
                        v3a0Var = v3a0Var2;
                        if (x7iVar instanceof x7i.b) {
                            bVarI.N(-1399005761);
                            boolean z10 = i3 == 4 || bVarI.A(u7iVar2);
                            Object objY7 = bVarI.y();
                            if (z10 || objY7 == c0042a) {
                                objY7 = new o7i(u7iVar2, i9);
                                bVarI.r(objY7);
                            }
                            b((Function0) objY7, y19.a, bVarI, 390);
                            bVarI.X(false);
                        } else {
                            if (!(x7iVar instanceof x7i.d)) {
                                throw igf0.a(bVarI, 1201749673, false);
                            }
                            bVarI.N(-1398715167);
                            a(0, bVarI);
                            bVarI.X(false);
                        }
                    }
                }
                s3a0.b(v3a0Var, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.h), y19.b, bVarI, 390, 0);
                bVarI.X(z2);
            }
            u7iVar2 = u7iVar;
            aVar2 = aVar3;
            z2 = z;
            v3a0Var = v3a0Var2;
            s3a0.b(v3a0Var, androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.h), y19.b, bVarI, 390, 0);
            bVarI.X(z2);
        } else {
            u7iVar2 = u7iVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final u7i u7iVar3 = u7iVar2;
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, function5, function6, function7, i) { // from class: p7i
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function2 v;
                public final /* synthetic */ Function1 w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    r7i.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-2078365973);
        int i3 = 0;
        if ((i & 6) == 0) {
            i2 = (bVarI.b(false) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarE = j.e(d.a.b, 1.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new d7i(function0, i3);
                bVarI.r(objY);
            }
            aur.a(dVarE, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 6, 510);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e7i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    r7i.d(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0242  */
    /* JADX WARN: Code duplicated, block: B:35:0x0248  */
    /* JADX WARN: Code duplicated, block: B:42:0x026a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0291  */
    /* JADX WARN: Code duplicated, block: B:47:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0340  */
    /* JADX WARN: Code duplicated, block: B:58:0x0342  */
    /* JADX WARN: Code duplicated, block: B:65:0x0352  */
    /* JADX WARN: Code duplicated, block: B:68:0x038a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0392  */
    /* JADX WARN: Code duplicated, block: B:75:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0409  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static final void e(final int i, androidx.compose.runtime.a aVar, Function0 function0, final boolean z) {
        int i2;
        int i3;
        yka.a.c cVar;
        boolean z2;
        int iHashCode;
        int i4;
        boolean z3;
        Object objY;
        boolean z4;
        Object objY2;
        int i5;
        int iHashCode2;
        final Function0 function1 = function0;
        b bVarI = aVar.i(-425411349);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.b(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i6 = i2 | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i6 & 1, (i6 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            long jA = c68.a(R.color.background_general_primary, bVarI);
            zk40.a aVar3 = zk40.a;
            d dVarH = g3w.h(androidx.compose.foundation.a.b(dVarE, jA, aVar3), "follow_code_empty_list");
            kw0.k kVar = kw0.c;
            n54.a aVar4 = ht.a.n;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i3 = i6;
            } else {
                i3 = i6;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                ty0.a(bVarI, j.i(aVar2, 48.0f));
                h9n.a(erz.a(R.drawable.following_code, 0, bVarI), null, g3w.h(j.r(aVar2, 80.0f), "follow_code_empty_image"), null, null, 0.0f, null, bVarI, 432, 120);
                ty0.a(bVarI, j.i(aVar2, 24.0f));
                lkf0.d(cb40.a(R.string.personal_page__code_hub_empty_following_title, new Object[0], bVarI), g3w.h(h.h(aVar2, 48.0f, 0.0f, 2), "follow_code_empty_title"), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
                ty0.a(bVarI, j.i(aVar2, 44.0f));
                lkf0.d(cb40.a(R.string.personal_page__following_page_how_to_title, new Object[0], bVarI), g3w.h(h.h(aVar2, 40.0f, 0.0f, 2), "follow_code_empty_how_to_title"), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 130040);
                bVarI = bVarI;
                ty0.a(bVarI, j.i(aVar2, 24.0f));
                ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
                z2 = true;
                d dVarH2 = h.h(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_type1_quaternary, bVarI), aVar3), 0.0f, 32.0f, 1);
                i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarH2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                f(h.h(aVar2, 64.0f, 0.0f, 2), bVarI, 6);
                bVarI.X(true);
                ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
                if (z) {
                    hnw.a(bVarI, 1350413022, aVar2, 32.0f, bVarI);
                    d dVarH3 = g3w.h(h.h(j.i(j.g(aVar2, 1.0f), 44.0f), 32.0f, 0.0f, 2), "follow_code_login_button");
                    ak5 ak5VarA = sya.a(0L, 0L, 0L, 0L, bVarI, 24576, 15);
                    alb0 alb0VarA = alb0.a(sya.b, null, new umz(20.0f, 12.0f, 20.0f, 12.0f), 0L, 0.0f, 27);
                    i4 = i3 & 112;
                    if (i4 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objY = bVarI.y();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (z3 || objY == c0042a) {
                        objY = new x5d(function0, 1);
                        bVarI.r(objY);
                    }
                    xya.b(dVarH3, false, ak5VarA, alb0VarA, null, 0.0f, null, (Function0) objY, y19.c, bVarI, 100663302, 114);
                    ty0.a(bVarI, j.i(aVar2, 8.0f));
                    d dVarG = h.g(aVar2, 20.0f, 12.0f);
                    if (i4 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objY2 = bVarI.y();
                    if (!z4 || objY2 == c0042a) {
                        function1 = function0;
                        i5 = 0;
                        objY2 = new g7i(function1, 0);
                        bVarI.r(objY2);
                    } else {
                        function1 = function0;
                        i5 = 0;
                    }
                    d dVarH4 = g3w.h(androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY2, 15), "follow_code_create_social_link");
                    aiv aivVarC = g75.c(ht.a.e, i5);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarH4);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar5);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC, bVar);
                    hlh0.a(bVarI, ne00VarS3, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, cVar);
                    lkf0.d(cb40.a(R.string.personal_page__create_my_sportysocial, new Object[i5], bVarI), null, c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130042);
                    bVarI = bVarI;
                    z2 = true;
                    bVarI.X(true);
                    bVarI.X(i5);
                } else {
                    function1 = function0;
                    bVarI.N(1352138017);
                    bVarI.X(false);
                }
                bVarI.X(z2);
            }
            n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            ty0.a(bVarI, j.i(aVar2, 48.0f));
            h9n.a(erz.a(R.drawable.following_code, 0, bVarI), null, g3w.h(j.r(aVar2, 80.0f), "follow_code_empty_image"), null, null, 0.0f, null, bVarI, 432, 120);
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            lkf0.d(cb40.a(R.string.personal_page__code_hub_empty_following_title, new Object[0], bVarI), g3w.h(h.h(aVar2, 48.0f, 0.0f, 2), "follow_code_empty_title"), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            ty0.a(bVarI, j.i(aVar2, 44.0f));
            lkf0.d(cb40.a(R.string.personal_page__following_page_how_to_title, new Object[0], bVarI), g3w.h(h.h(aVar2, 40.0f, 0.0f, 2), "follow_code_empty_how_to_title"), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            ty0.a(bVarI, j.i(aVar2, 24.0f));
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            z2 = true;
            d dVarH5 = h.h(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_type1_quaternary, bVarI), aVar3), 0.0f, 32.0f, 1);
            i78 i78VarA3 = g78.a(kVar, aVar4, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarH5);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            f(h.h(aVar2, 64.0f, 0.0f, 2), bVarI, 6);
            bVarI.X(true);
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            if (z) {
                hnw.a(bVarI, 1350413022, aVar2, 32.0f, bVarI);
                d dVarH6 = g3w.h(h.h(j.i(j.g(aVar2, 1.0f), 44.0f), 32.0f, 0.0f, 2), "follow_code_login_button");
                ak5 ak5VarA2 = sya.a(0L, 0L, 0L, 0L, bVarI, 24576, 15);
                alb0 alb0VarA2 = alb0.a(sya.b, null, new umz(20.0f, 12.0f, 20.0f, 12.0f), 0L, 0.0f, 27);
                i4 = i3 & 112;
                if (i4 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
                if (z3) {
                    objY = new x5d(function0, 1);
                    bVarI.r(objY);
                } else {
                    objY = new x5d(function0, 1);
                    bVarI.r(objY);
                }
                xya.b(dVarH6, false, ak5VarA2, alb0VarA2, null, 0.0f, null, (Function0) objY, y19.c, bVarI, 100663302, 114);
                ty0.a(bVarI, j.i(aVar2, 8.0f));
                d dVarG2 = h.g(aVar2, 20.0f, 12.0f);
                if (i4 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objY2 = bVarI.y();
                if (z4) {
                    function1 = function0;
                    i5 = 0;
                    objY2 = new g7i(function1, 0);
                    bVarI.r(objY2);
                } else {
                    function1 = function0;
                    i5 = 0;
                    objY2 = new g7i(function1, 0);
                    bVarI.r(objY2);
                }
                d dVarH7 = g3w.h(androidx.compose.foundation.d.d(dVarG2, false, null, null, (Function0) objY2, 15), "follow_code_create_social_link");
                aiv aivVarC2 = g75.c(ht.a.e, i5);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS5 = bVarI.S();
                d dVarC5 = c.c(bVarI, dVarH7);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar);
                hlh0.a(bVarI, ne00VarS5, dVar);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                lkf0.d(cb40.a(R.string.personal_page__create_my_sportysocial, new Object[i5], bVarI), null, c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130042);
                bVarI = bVarI;
                z2 = true;
                bVarI.X(true);
                bVarI.X(i5);
            } else {
                function1 = function0;
                bVarI.N(1352138017);
                bVarI.X(false);
            }
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: h7i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r7i.e(qj40.a(i | 1), (a) obj, function1, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final d dVar, androidx.compose.runtime.a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-1318565614);
        boolean z = false;
        boolean z2 = true;
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            List listK = kotlin.collections.b.k(cb40.a(R.string.personal_page__following_page_how_to_step_1, new Object[0], bVarI), cb40.a(R.string.personal_page__following_page_how_to_step_2, new Object[0], bVarI), cb40.a(R.string.personal_page__following_page_how_to_step_3, new Object[0], bVarI), cb40.a(R.string.personal_page__following_page_how_to_step_4, new Object[0], bVarI));
            float f = 1.0f;
            d dVarG = j.g(dVar, 1.0f);
            float f2 = 8.0f;
            int i2 = 6;
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            Iterator itA = yt1.a(bVarI, dVarC, yka.a.d, 818578506, listK);
            int i3 = 0;
            while (itA.hasNext()) {
                Object next = itA.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                String str = (String) next;
                d dVarG2 = j.g(d.a.b, f);
                d160 d160VarA = b160.a(new kw0.i(f2, z2, new hw0()), ht.a.j, bVarI, 54);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG2);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                boolean z3 = z2;
                float f3 = f;
                b bVar2 = bVarI;
                lkf0.d(i4 + ".", null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, bVarI), bVar2, 0, 0, 130042);
                lkf0.d(str, new LayoutWeightElement(f3, z3), c68.a(R.color.text_type1_primary, bVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, bVar2), bVar2, 0, 0, 131064);
                bVar2.X(z3);
                z2 = z3;
                f = f3;
                bVarI = bVar2;
                f2 = f2;
                i2 = i2;
                i3 = i4;
                z = false;
            }
            bVar = bVarI;
            bVar.X(z);
            bVar.X(z2);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: j7i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    r7i.f(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final v3a0 v3a0Var, final Function0 function0, final Function0 function1, final Function2 function2, final Function1 function3, final Function1 function4, final Function1 function5, final Function2 function6, final Function1 function7, bsi bsiVar, androidx.compose.runtime.a aVar, final int i) {
        final bsi bsiVar2;
        bsi bsiVar3;
        int i2;
        b bVarI = aVar.i(-666237229);
        int i3 = i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536) | (bVarI.A(function5) ? 1048576 : 524288) | (bVarI.A(function6) ? 8388608 : 4194304) | (bVarI.A(function7) ? 67108864 : 33554432) | 268435456;
        if (bVarI.q(i3 & 1, (i3 & 306783379) != 306783378)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    bsiVar3 = (bsi) p8i0.a(jq40.a(bsi.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i2 = i3 & (-1879048193);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-1879048193);
                bsiVar3 = bsiVar;
            }
            bVarI.Y();
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            msi msiVar = (msi) wyh.c(bsiVar3.A, bVarI, 0, 7).getValue();
            msi.a aVar2 = msiVar instanceof msi.a ? (msi.a) msiVar : null;
            int i4 = aVar2 != null ? aVar2.a.a : 0;
            boolean z = (29360128 & i2) == 8388608;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new Function1() { // from class: q7i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        jl00 jl00Var = (jl00) obj;
                        jl00Var.getClass();
                        function6.invoke(jl00Var.a, jl00Var.l);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            Function1 function8 = (Function1) objY;
            boolean z2 = (i2 & 7168) == 2048;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function2() { // from class: q6i
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str = (String) obj;
                        z7a0.d dVar = (z7a0.d) obj2;
                        str.getClass();
                        dVar.getClass();
                        function2.invoke(str, new b6i.e(dVar.a, str, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            Function2 function9 = (Function2) objY2;
            boolean z3 = (57344 & i2) == 16384;
            Object objY3 = bVarI.y();
            if (z3 || objY3 == c0042a) {
                objY3 = new r6i(function3, 0);
                bVarI.r(objY3);
            }
            Function1 function10 = (Function1) objY3;
            boolean z4 = (458752 & i2) == 131072;
            Object objY4 = bVarI.y();
            if (z4 || objY4 == c0042a) {
                objY4 = new s6i(function4, 0);
                bVarI.r(objY4);
            }
            Function1 function11 = (Function1) objY4;
            boolean z5 = (3670016 & i2) == 1048576;
            Object objY5 = bVarI.y();
            if (z5 || objY5 == c0042a) {
                objY5 = new t6i(function5, 0);
                bVarI.r(objY5);
            }
            Function1 function12 = (Function1) objY5;
            boolean z6 = (i2 & 112) == 32;
            Object objY6 = bVarI.y();
            if (z6 || objY6 == c0042a) {
                objY6 = new u6i(function0, 0);
                bVarI.r(objY6);
            }
            Function1 function13 = (Function1) objY6;
            boolean z7 = (i2 & 896) == 256;
            Object objY7 = bVarI.y();
            if (z7 || objY7 == c0042a) {
                objY7 = new Function1() { // from class: v6i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((bba0.a) obj).getClass();
                        function1.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY7);
            }
            Function1 function14 = (Function1) objY7;
            boolean zA = bVarI.A(context);
            Object objY8 = bVarI.y();
            if (zA || objY8 == c0042a) {
                objY8 = new Function0() { // from class: w6i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        qaa0.a.getClass();
                        qaa0.b(context);
                        return Unit.a;
                    }
                };
                bVarI.r(objY8);
            }
            tri.c(bsiVar3, i4, v3a0Var, function7, function8, function9, function10, function11, function12, function13, function14, (Function0) objY8, null, false, pp8.b(-2104564405, new Function2() { // from class: x6i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        r7i.e(6, aVar3, function0, false);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 392 | ((i2 >> 15) & 7168), 27648, 4096);
            bVarI = bVarI;
            bsiVar2 = bsiVar3;
        } else {
            bVarI.G();
            bsiVar2 = bsiVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, function5, function6, function7, bsiVar2, i) { // from class: y6i
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function2 v;
                public final /* synthetic */ Function1 w;
                public final /* synthetic */ bsi y;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    r7i.g(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1642569579);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.A(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            kw0.k kVar = kw0.c;
            n54.a aVar3 = ht.a.n;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            ty0.a(bVarI, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA2 = g78.a(new kw0.i(40.0f, true, new hw0()), aVar3, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            int i3 = i2;
            lkf0.d(cb40.a(R.string.personal_page__please_create_sportysocial_first, new Object[0], bVarI), g3w.h(h.h(aVar2, 32.0f, 0.0f, 2), "social_creation_title"), c68.a(R.color.text_type1_tertiary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVarI), bVarI, 48, 0, 130040);
            h9n.a(erz.a(R.drawable.following_code, 0, bVarI), "find_followers", g3w.h(j.r(aVar2, 80.0f), "social_creation_image"), null, null, 0.0f, null, bVarI, 432, 120);
            lkf0.d(cb40.a(R.string.personal_page__following_page_create_social_description, new Object[0], bVarI), g3w.h(h.h(aVar2, 32.0f, 0.0f, 2), "social_creation_description"), c68.a(R.color.text_type1_tertiary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            bVarI.X(true);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            ty0.a(bVarI, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            d dVarH = g3w.h(h.h(j.i(j.g(aVar2, 1.0f), 44.0f), 32.0f, 0.0f, 2), "social_creation_button");
            ak5 ak5VarA = sya.a(0L, 0L, 0L, 0L, bVarI, 24576, 15);
            alb0 alb0VarA = alb0.a(sya.b, null, new umz(20.0f, 12.0f, 20.0f, 12.0f), 0L, 0.0f, 27);
            boolean z = (i3 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new b7i(function0, 0);
                bVarI.r(objY);
            }
            xya.b(dVarH, false, ak5VarA, alb0VarA, null, 0.0f, null, (Function0) objY, y19.d, bVarI, 100663302, 114);
            bVarI = bVarI;
            iib0.a(aVar2, 32.0f, bVarI, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: c7i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    r7i.h(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
