package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class thc0 {

    public static final class a implements rss.a {
        public final /* synthetic */ rss a;
        public final /* synthetic */ nss.d b;
        public final /* synthetic */ ytw<Boolean> c;
        public final /* synthetic */ osw d;
        public final /* synthetic */ osw e;

        public a(rss rssVar, nss.d dVar, ytw<Boolean> ytwVar, osw oswVar, osw oswVar2) {
            this.a = rssVar;
            this.b = dVar;
            this.c = ytwVar;
            this.d = oswVar;
            this.e = oswVar2;
        }

        @Override // rss.a
        public final void a(int i) {
            Map<Integer, ho70> map = this.b.g;
            this.c.setValue(Boolean.valueOf(i >= this.a.d));
            this.d.k(thc0.h(map, b4l.HOME, i));
            this.e.k(thc0.h(map, b4l.AWAY, i));
        }
    }

    public static final class b implements tse {
        public final /* synthetic */ rss a;
        public final /* synthetic */ a b;

        public b(rss rssVar, a aVar) {
            this.a = rssVar;
            this.b = aVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            rss rssVar = this.a;
            rssVar.getClass();
            rssVar.b.remove(this.b);
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.component.SportyLegendsRunningPageEventScreenKt$TopProgress$1$1", f = "SportyLegendsRunningPageEventScreen.kt", l = {392, 394}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, wd0<Float, ij0> wd0Var, int i, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = wd0Var;
            this.d = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            if (r4.f(r11, r1) == r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        
            if (defpackage.wd0.a(r4, r5, r6, null, null, r11, 12) == r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        
            return r0;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r11.a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L17
                if (r1 == r2) goto Lc
                if (r1 != r3) goto L10
            Lc:
                defpackage.uj50.b(r12)
                goto L4e
            L10:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                r11 = 0
                return r11
            L17:
                defpackage.uj50.b(r12)
                r12 = 1065353216(0x3f800000, float:1.0)
                boolean r1 = r11.b
                wd0<java.lang.Float, ij0> r4 = r11.c
                if (r1 == 0) goto L30
                java.lang.Float r1 = new java.lang.Float
                r1.<init>(r12)
                r11.a = r2
                java.lang.Object r11 = r4.f(r11, r1)
                if (r11 != r0) goto L4e
                goto L4d
            L30:
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r12)
                int r12 = r11.d
                int r12 = r12 * 1000
                r1 = 0
                wkf r2 = defpackage.xkf.d
                gzg0 r6 = defpackage.yi0.e(r12, r1, r2, r3)
                r11.a = r3
                r7 = 0
                r8 = 0
                r10 = 12
                r9 = r11
                java.lang.Object r11 = defpackage.wd0.a(r4, r5, r6, r7, r8, r9, r10)
                if (r11 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: thc0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final int i, final int i2, final int i3, androidx.compose.runtime.a aVar, final d dVar) {
        int i4;
        androidx.compose.runtime.b bVarI = aVar.i(278527960);
        if ((i3 & 6) == 0) {
            i4 = (bVarI.d(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.M(dVar) ? 256 : 128;
        }
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
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
            lwh.a(String.valueOf(i), false, null, mla.l(R.style.H1_B, bVarI), bVarI, 0, 6);
            long jA = c68.a(R.color.text_primary, bVarI);
            imf0 imf0VarL = mla.l(R.style.H1_B, bVarI);
            d dVarA = j.A(d.a.b, null, 3);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new bhc0();
                bVarI.r(objY);
            }
            lkf0.d(" - ", g3w.h(xa80.b(dVarA, false, (Function1) objY), "sporty_legends_running_score_separator_text"), jA, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarL, bVarI, 6, 0, 130040);
            bVarI = bVarI;
            lwh.a(String.valueOf(i2), false, null, mla.l(R.style.H1_B, bVarI), bVarI, 0, 6);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: chc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    thc0.a(i, i2, iA, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final int i, final int i2, final int i3, androidx.compose.runtime.a aVar, final d dVar) throws FileNotFoundException {
        int i4;
        boolean z;
        final osw oswVar;
        ytw ytwVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1925679682);
        if ((i3 & 6) == 0) {
            i4 = (bVarI.M(dVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.d(i2) ? 256 : 128;
        }
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(i);
                bVarI.r(objY);
            }
            osw oswVar2 = (osw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = k.a(i2);
                bVarI.r(objY2);
            }
            osw oswVar3 = (osw) objY2;
            ont ontVarC = i350.c(new pnt.f(cb40.a(R.string.page_instant_virtual__lottie_sporty_legends_scoreboard, new Object[0], bVarI)), bVarI, 0);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = k.a(0);
                bVarI.r(objY3);
            }
            osw oswVar4 = (osw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(Boolean.FALSE);
                bVarI.r(objY4);
            }
            ytw ytwVar2 = (ytw) objY4;
            final fmt fmtVarA = bf0.a(ontVarC.getValue(), ((Boolean) ytwVar2.getValue()).booleanValue(), false, 0.0f, 0, bVarI, 1020);
            Integer numValueOf = Integer.valueOf(i);
            Integer numValueOf2 = Integer.valueOf(i2);
            boolean z2 = ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object objY5 = bVarI.y();
            if (z2 || objY5 == c0042a) {
                z = false;
                oswVar = oswVar4;
                ytwVar = ytwVar2;
                rhc0 rhc0Var = new rhc0(i2, i, oswVar3, oswVar2, oswVar, ytwVar, null);
                bVarI.r(rhc0Var);
                objY5 = rhc0Var;
            } else {
                z = false;
                oswVar = oswVar4;
                ytwVar = ytwVar2;
            }
            xvf.g(numValueOf, numValueOf2, (Function2) objY5, bVarI);
            Float fValueOf = Float.valueOf(fmtVarA.getValue().floatValue());
            boolean zM = bVarI.M(fmtVarA);
            Object objY6 = bVarI.y();
            if (zM || objY6 == c0042a) {
                objY6 = new shc0(fmtVarA, ytwVar, oswVar, null);
                bVarI.r(objY6);
            }
            xvf.e(bVarI, fValueOf, (Function2) objY6);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(-43983682);
                Object objY7 = bVarI.y();
                if (objY7 == c0042a) {
                    objY7 = new Function1() { // from class: dhc0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.k(oswVar.D());
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY7);
                }
                d dVarA = androidx.compose.ui.graphics.a.a(dVar, (Function1) objY7);
                xmt value = ontVarC.getValue();
                boolean zM2 = bVarI.M(fmtVarA);
                Object objY8 = bVarI.y();
                if (zM2 || objY8 == c0042a) {
                    objY8 = new Function0() { // from class: ehc0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(fmtVarA.getValue().floatValue());
                        }
                    };
                    bVarI.r(objY8);
                }
                mmt.b(value, (Function0) objY8, dVarA, false, false, false, false, null, false, null, null, d0b.a.d, false, false, null, null, false, bVarI, 0, 48, 129016);
                bVarI = bVarI;
                bVarI.X(z);
            } else {
                bVarI.N(-43695196);
                bVarI.X(z);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fhc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    thc0.b(i, i2, iA, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final nss.d dVar, final rss rssVar, final d dVar2, androidx.compose.runtime.a aVar, final int i) {
        final ytw ytwVar;
        Object obj;
        final osw oswVar;
        final osw oswVar2;
        Map<Integer, ho70> map = dVar.g;
        rssVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-101569299);
        int i2 = (bVarI.A(dVar) ? 4 : 2) | i | (bVarI.A(rssVar) ? 32 : 16) | (bVarI.M(dVar2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(h(map, b4l.HOME, rssVar.c));
                bVarI.r(objY);
            }
            osw oswVar3 = (osw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = k.a(h(map, b4l.AWAY, rssVar.c));
                bVarI.r(objY2);
            }
            osw oswVar4 = (osw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            ytw ytwVar2 = (ytw) objY3;
            boolean z = ((i2 & 14) == 4 || bVarI.A(dVar)) | ((i2 & 112) == 32 || bVarI.A(rssVar));
            Object objY4 = bVarI.y();
            if (z || objY4 == c0042a) {
                ytwVar = ytwVar2;
                oswVar = oswVar3;
                oswVar2 = oswVar4;
                obj = new Function1() { // from class: jhc0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ((use) obj2).getClass();
                        rss rssVar2 = rssVar;
                        thc0.a aVar2 = new thc0.a(rssVar2, dVar, ytwVar, oswVar, oswVar2);
                        rssVar2.getClass();
                        rssVar2.b.add(aVar2);
                        return new thc0.b(rssVar2, aVar2);
                    }
                };
                bVarI.r(obj);
            } else {
                ytwVar = ytwVar2;
                obj = objY4;
                oswVar = oswVar3;
                oswVar2 = oswVar4;
            }
            xvf.a(dVar, rssVar, (Function1) obj, bVarI);
            d dVarB = androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), c68.a(R.color.bg_primary_d_base, bVarI), zk40.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
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
            g(rssVar.d, 0, bVarI, ((Boolean) ytwVar.getValue()).booleanValue());
            d(dVar.b, dVar.c, dVar.d, dVar.e, oswVar.D(), oswVar2.D(), false, bVarI, 1572864);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(rssVar, dVar2, i) { // from class: khc0
                public final /* synthetic */ rss b;
                public final /* synthetic */ d c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(73);
                    thc0.c(this.a, this.b, this.c, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x017c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0198  */
    public static final void d(final String str, final String str2, final String str3, final String str4, final int i, final int i2, final boolean z, androidx.compose.runtime.a aVar, final int i3) throws FileNotFoundException {
        int i4;
        int iHashCode;
        wd7.a(str, str2, str3, str4);
        androidx.compose.runtime.b bVarI = aVar.i(-107358679);
        int i5 = i3 | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.M(str4) ? 2048 : 1024) | (bVarI.d(i) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(i2) ? 131072 : 65536);
        if (bVarI.q(i5 & 1, (599187 & i5) != 599186)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 56.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i4 = i5;
            } else {
                i4 = i5;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d dVarE = j.e(aVar2, 1.0f);
                d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarE);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                f160 f160Var = f160.a;
                e(str, str2, R.drawable.ic_default_team_logo_home, c68.a(R.color.bg_brand_main_primary, bVarI), false, "sporty_legends_running_home_team", f160Var.a(0.4f, aVar2, true), bVarI, (i4 & 14) | 221184 | (i4 & 112));
                a(i, i2, (i4 >> 12) & WebSocketProtocol.PAYLOAD_SHORT, bVarI, f160Var.a(0.2f, aVar2, true));
                d dVarA = f160Var.a(0.4f, aVar2, true);
                int i6 = i4 >> 6;
                e(str3, str4, R.drawable.ic_default_team_logo_away, c68.a(R.color.bg_info_primary, bVarI), true, "sporty_legends_running_away_team", dVarA, bVarI, (i6 & 14) | 221184 | (i6 & 112));
                bVarI.X(true);
                if (z) {
                    bVarI.N(1219970793);
                    d dVarE2 = j.e(aVar2, 1.0f);
                    int i7 = i4 >> 9;
                    b(i, i2, (i7 & 896) | (i7 & 112) | 6, bVarI, dVarE2);
                    bVarI.X(false);
                } else {
                    bVarI.N(1220164915);
                    bVarI.X(false);
                }
                bVarI.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d dVarE3 = j.e(aVar2, 1.0f);
            d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarE3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            f160 f160Var2 = f160.a;
            e(str, str2, R.drawable.ic_default_team_logo_home, c68.a(R.color.bg_brand_main_primary, bVarI), false, "sporty_legends_running_home_team", f160Var2.a(0.4f, aVar2, true), bVarI, (i4 & 14) | 221184 | (i4 & 112));
            a(i, i2, (i4 >> 12) & WebSocketProtocol.PAYLOAD_SHORT, bVarI, f160Var2.a(0.2f, aVar2, true));
            d dVarA2 = f160Var2.a(0.4f, aVar2, true);
            int i8 = i4 >> 6;
            e(str3, str4, R.drawable.ic_default_team_logo_away, c68.a(R.color.bg_info_primary, bVarI), true, "sporty_legends_running_away_team", dVarA2, bVarI, (i8 & 14) | 221184 | (i8 & 112));
            bVarI.X(true);
            if (z) {
                bVarI.N(1219970793);
                d dVarE4 = j.e(aVar2, 1.0f);
                int i9 = i4 >> 9;
                b(i, i2, (i9 & 896) | (i9 & 112) | 6, bVarI, dVarE4);
                bVarI.X(false);
            } else {
                bVarI.N(1220164915);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, str4, i, i2, z, i3) { // from class: lhc0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ boolean i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1572865);
                    thc0.d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final String str, final String str2, int i, final long j, final boolean z, final String str3, final d dVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.b bVarI = aVar.i(1892125119);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.e(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.M(str3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.M(dVar) ? 1048576 : 524288;
        }
        int i5 = i3;
        if (bVarI.q(i5 & 1, (i5 & 599187) != 599186)) {
            d dVarG = j.g(dVar, 1.0f);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new phc0();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarG, false, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
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
            d.a aVar3 = d.a.b;
            int i6 = i5 >> 6;
            f(i6 & 1008, j, bVarI, androidx.compose.foundation.layout.d.a.b(j.i(j.g(aVar3, 1.0f), 28.0f), ht.a.e), z);
            d dVarG2 = j.g(h.g(dVar, 16.0f, 6.0f), 1.0f);
            d160 d160VarA = b160.a(!z ? kw0.a : kw0.b, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d0b.a.C0470a c0470a = d0b.a.a;
            if (z) {
                bVarI.N(1389418903);
                lkf0.d(str, g3w.h(aVar3, str3.concat("_name_text")), c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, i5 & 14, 0, 131064);
                bVarI = bVarI;
                ty0.a(bVarI, j.w(aVar3, 8.0f));
                int i7 = i6 & 14;
                i4 = i;
                mw90.b(str2, yk10.a(str, " logo"), g3w.h(j.r(aVar3, 32.0f), str3.concat("_logo_icon")), erz.a(i4, i7, bVarI), erz.a(i4, i7, bVarI), null, null, null, c0470a, 0.0f, null, bVarI, (i5 >> 3) & 14, 6, 31712);
                bVarI.X(false);
            } else {
                bVarI.N(1388553879);
                int i8 = i6 & 14;
                mw90.b(str2, yk10.a(str, " logo"), g3w.h(j.r(aVar3, 32.0f), str3.concat("_logo_icon")), erz.a(i, i8, bVarI), erz.a(i, i8, bVarI), null, null, null, c0470a, 0.0f, null, bVarI, (i5 >> 3) & 14, 6, 31712);
                ty0.a(bVarI, j.w(aVar3, 8.0f));
                lkf0.d(str, g3w.h(aVar3, str3.concat("_name_text")), c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, i5 & 14, 0, 131064);
                bVarI = bVarI;
                bVarI.X(false);
                i4 = i;
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            i4 = i;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final int i9 = i4;
            eVarZ.d = new Function2() { // from class: qhc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    thc0.e(str, str2, i9, j, z, str3, dVar, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final int i, final long j, androidx.compose.runtime.a aVar, final d dVar, final boolean z) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-1665931185);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarI = j.i(dVar, 10.0f);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z2 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: ghc0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        j90 j90VarA = m90.a();
                        if (z) {
                            j90VarA.a(tcfVar.C1(8.0f), 0.0f);
                            j90VarA.c(fIntBitsToFloat, 0.0f);
                            j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
                            j90VarA.c(0.0f, fIntBitsToFloat2);
                        } else {
                            j90VarA.a(0.0f, 0.0f);
                            j90VarA.c(fIntBitsToFloat - tcfVar.C1(8.0f), 0.0f);
                            j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
                            j90VarA.c(0.0f, fIntBitsToFloat2);
                        }
                        j90VarA.close();
                        tcf.Q1(tcfVar, j90VarA, j, 0.0f, null, 60);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVarI, (Function1) objY, bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hhc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    thc0.f(qj40.a(i | 1), j, (a) obj, dVar, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final int i, final int i2, androidx.compose.runtime.a aVar, final boolean z) {
        androidx.compose.runtime.b bVarI = aVar.i(-1836382868);
        int i3 = (bVarI.d(i) ? 4 : 2) | i2 | (bVarI.b(z) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = ee0.a(z ? 1.0f : 0.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var = (wd0) objY;
            Integer numValueOf = Integer.valueOf(i);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA = ((i3 & 112) == 32) | bVarI.A(wd0Var) | (i4 == 4);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new c(z, wd0Var, i, null);
                bVarI.r(objY2);
            }
            xvf.g(numValueOf, boolValueOf, (Function2) objY2, bVarI);
            float fD = f.d(((Number) wd0Var.d()).floatValue(), 0.0f, 1.0f);
            long jA = c68.a(R.color.bg_warning_primary, bVarI);
            long jA2 = c68.a(R.color.border_primary, bVarI);
            if (fD == 0.0f) {
                jA = j58.c(0.0f, jA);
            }
            boolean zC = bVarI.c(fD);
            Object objY3 = bVarI.y();
            if (zC || objY3 == c0042a) {
                objY3 = new mhc0(fD);
                bVarI.r(objY3);
            }
            Function0 function0 = (Function0) objY3;
            d dVarI = j.i(j.g(d.a.b, 1.0f), 4.0f);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new nhc0();
                bVarI.r(objY4);
            }
            q330.c(function0, g3w.h(xa80.b(dVarI, false, (Function1) objY4), "sporty_legends_running_progress_content"), jA, jA2, 1, 0.0f, null, bVarI, 0, 96);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, z) { // from class: ohc0
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;

                {
                    this.b = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    thc0.g(this.a, iA, (a) obj, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final int h(Map<Integer, ho70> map, b4l b4lVar, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, ho70> entry : map.entrySet()) {
            if (entry.getValue().a == b4lVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = CollectionsKt.q0(linkedHashMap.keySet()).iterator();
        while (true) {
            int i2 = 0;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                ho70 ho70Var = (ho70) linkedHashMap.get(Integer.valueOf(iIntValue));
                if (iIntValue > i) {
                    ho70 ho70Var2 = (ho70) linkedHashMap.get(Integer.valueOf(iIntValue));
                    if (ho70Var2 != null) {
                        return ho70Var2.b;
                    }
                    return 0;
                }
                if (ho70Var != null) {
                    i2 = ho70Var.c;
                }
            }
            return i2;
        }
    }
}
