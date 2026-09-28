package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportybet.android.gp.tz.R;
import com.sportygames.fbg_dialog.data.model.GiftItem;
import com.sportygames.fbg_dialog.data.model.Metadata;
import com.sportygames.newcms.CMSRes;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class vca {

    @c0d(c = "com.sportygames.fbg_dialog.presentation.component.ComposeFBGDialogKt$GiftItemRowComposeV2$1$1", f = "ComposeFBGDialog.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ cok a;
        public final /* synthetic */ ytw<dwk> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cok cokVar, ytw<dwk> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = cokVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            cok cokVar = this.a;
            if (cokVar.h) {
                dwk dwkVar = dwk.b;
                this.b.setValue(dwkVar);
                cokVar.getClass();
                cokVar.l = dwkVar;
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.fbg_dialog.presentation.component.ComposeFBGDialogKt$GiftItemRowComposeV2$2$1", f = "ComposeFBGDialog.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ cok a;
        public final /* synthetic */ ytw<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cok cokVar, ytw<String> ytwVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = cokVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.setValue(this.a.n);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.fbg_dialog.presentation.component.ComposeFBGDialogKt$GiftItemRowComposeV2$3$3$3$1", f = "ComposeFBGDialog.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw<String> A;
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;
        public final /* synthetic */ double d;
        public final /* synthetic */ h5h e;
        public final /* synthetic */ double f;
        public final /* synthetic */ String i;
        public final /* synthetic */ cok v;
        public final /* synthetic */ ytw<dwk> w;
        public final /* synthetic */ ytw<String> y;
        public final /* synthetic */ ytw<Boolean> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, boolean z2, int i, double d, h5h h5hVar, double d2, String str, cok cokVar, ytw<dwk> ytwVar, ytw<String> ytwVar2, ytw<Boolean> ytwVar3, ytw<String> ytwVar4, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = z2;
            this.c = i;
            this.d = d;
            this.e = h5hVar;
            this.f = d2;
            this.i = str;
            this.v = cokVar;
            this.w = ytwVar;
            this.y = ytwVar2;
            this.z = ytwVar3;
            this.A = ytwVar4;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            String str;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!this.a) {
                return Unit.a;
            }
            if (this.w.getValue() != dwk.b || this.b) {
                return Unit.a;
            }
            ytw<String> ytwVar = this.y;
            String value = ytwVar.getValue();
            boolean zM = StringsKt.M(value, ".", false);
            double d = this.f;
            double d2 = this.d;
            int i = this.c;
            h5h h5hVar = this.e;
            ytw<Boolean> ytwVar2 = this.z;
            if (i == -1) {
                if (value.length() > 0) {
                    value = wae0.E(value);
                }
                ytwVar2.setValue(Boolean.FALSE);
                z = false;
            } else {
                if (i >= 0 && i < 10) {
                    List listSplit$default = StringsKt__StringsKt.split$default(value, new String[]{"."}, false, 0, 6, null);
                    String str2 = (String) CollectionsKt.V(0, listSplit$default);
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = (String) CollectionsKt.V(1, listSplit$default);
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (zM) {
                        if (str3.length() < 2) {
                            value = hce0.a(i, value);
                        }
                    } else if (value.equals("0")) {
                        value = String.valueOf(i);
                    } else if (str2.length() < 7) {
                        value = hce0.a(i, value);
                    }
                    ytwVar2.setValue(Boolean.TRUE);
                } else if (i == 10) {
                    if (!zM) {
                        if (value.length() == 0) {
                            ytwVar2.setValue(Boolean.FALSE);
                            value = "";
                        } else {
                            value = value.concat(".");
                            ytwVar2.setValue(Boolean.TRUE);
                        }
                    }
                } else if (i == 11) {
                    if (value.length() == 0 || value.equals("0")) {
                        value = CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS;
                    } else if (!zM && value.length() > 0 && !value.equals("0") && value.length() + 2 <= 7) {
                        value = value.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                    } else if (zM && (str = (String) CollectionsKt.V(1, StringsKt__StringsKt.split$default(value, new String[]{"."}, false, 0, 6, null))) != null && str.length() == 0) {
                        value = value.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                    }
                    ytwVar2.setValue(Boolean.TRUE);
                } else if (i == 12) {
                    value = value.length() > 0 ? wae0.E(value) : "";
                    ytwVar2.setValue(Boolean.TRUE);
                } else if (i == 13) {
                    ytwVar2.setValue(Boolean.TRUE);
                    value = "";
                } else if (i == 14) {
                    Double dH = kotlin.text.b.h(kotlin.text.c.p(value, ",", "", false));
                    if (dH == null || dH.doubleValue() < d2) {
                        value = h5hVar.b(new Double(d2));
                    } else {
                        value = dH.doubleValue() > d ? h5hVar.b(new Double(d)) : h5hVar.b(value);
                    }
                    ytwVar2.setValue(Boolean.TRUE);
                    z = false;
                    h5hVar.g(false);
                }
                z = false;
            }
            Double dH2 = kotlin.text.b.h(kotlin.text.c.p(value, ",", "", z));
            ytw<String> ytwVar3 = this.A;
            if (dH2 == null) {
                ytwVar.setValue(value);
                ytwVar3.setValue("");
            } else {
                double dDoubleValue = dH2.doubleValue();
                String str4 = this.i;
                if (dDoubleValue < d2) {
                    ytwVar.setValue(value);
                    ytwVar3.setValue(h5hVar.c(r4h.s.i, "The value can't be lower than %1$s %2$s", str4, h5hVar.b(new Double(d2))));
                } else if (dH2.doubleValue() > d) {
                    ytwVar3.setValue(h5hVar.c(r4h.s.h, "The value can't exceed %1$s %2$s", str4, h5hVar.b(new Double(d))));
                } else {
                    ytwVar.setValue(value);
                    ytwVar3.setValue("");
                }
            }
            ytwVar.setValue(value);
            cok cokVar = this.v;
            cokVar.getClass();
            cokVar.n = value;
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final Function1 function1, d dVar, final imf0 imf0Var, long j, long j2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        final d dVar2;
        final long j3;
        final long j4;
        long j5;
        int i2;
        d dVar3;
        long j6;
        Object kcaVar;
        String str2;
        long j7;
        ora0 ora0Var = imf0Var.a;
        str.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1745320557);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | 384 | (bVarI.M(imf0Var) ? 2048 : 1024) | 90112;
        int i4 = 0;
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                long jF = d2l.f(12);
                j5 = ora0Var.b;
                i2 = i3 & (-458753);
                dVar3 = d.a.b;
                j6 = jF;
            } else {
                bVarI.G();
                j6 = j;
                j5 = j2;
                i2 = i3 & (-458753);
                dVar3 = dVar;
            }
            bVarI.Y();
            olf0 olf0VarA = plf0.a(bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new omf0(ora0Var.b));
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            long j8 = j5;
            imf0 imf0VarB = imf0.b(imf0Var, 0L, ((omf0) ytwVar.getValue()).a, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
            d dVarG = j.g(dVar3, 1.0f);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new rba(ytwVar2, i4);
                bVarI.r(objY3);
            }
            d dVarA = w.a(dVarG, (Function1) objY3);
            int i5 = i2 & 14;
            d dVar4 = dVar3;
            int i6 = i2;
            ab2.b(str, function1, dVarA, false, false, imf0VarB, null, null, true, 0, 0, null, null, null, null, null, bVarI, 100663296 | i5 | (i2 & 112), 0, 65240);
            bVar = bVarI;
            Integer num = (Integer) ytwVar2.getValue();
            boolean zE = bVar.e(j8) | bVar.M(olf0VarA) | (i5 == 4) | ((i6 & 7168) == 2048);
            Object objY4 = bVar.y();
            if (zE || objY4 == c0042a) {
                str2 = str;
                j7 = j6;
                kcaVar = new kca(j7, j8, olf0VarA, str2, imf0Var, ytwVar2, ytwVar, null);
                bVar.r(kcaVar);
            } else {
                str2 = str;
                kcaVar = objY4;
                j7 = j6;
            }
            xvf.g(str2, num, (Function2) kcaVar, bVar);
            j3 = j7;
            j4 = j8;
            dVar2 = dVar4;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            j3 = j;
            j4 = j2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, function1, dVar2, imf0Var, j3, j4, i) { // from class: sba
                public final /* synthetic */ String a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ d c;
                public final /* synthetic */ imf0 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vca.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d dVar, final String str, final imf0 imf0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        final d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-1633220900);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(imf0Var) ? 256 : 128;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(imf0Var);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            imf0 imf0Var2 = (imf0) ytwVar.getValue();
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new tba(ytwVar2, i3);
                bVarI.r(objY3);
            }
            d.a aVar2 = d.a.b;
            d dVarC = androidx.compose.ui.draw.a.c(aVar2, (Function1) objY3);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new uba(0, ytwVar, ytwVar2);
                bVarI.r(objY4);
            }
            bVar = bVarI;
            lkf0.b(str, dVarC, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, (Function1) objY4, imf0Var2, bVar, (i2 >> 3) & 14, 200064, 20476);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vba
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    vca.b(dVar2, str, imf0Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final boolean z2, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-402718641);
        int i2 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.b(z2) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(ls7.a(j.r(aVar2, 24.0f), j060.a), r58.d((z || !z2) ? 4288454827L : 4283215696L), zk40.a);
            boolean z3 = (i2 & 896) == 256;
            Object objY = bVarI.y();
            if (z3 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new hba(function0, 0);
                bVarI.r(objY);
            }
            d dVarD = androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY, 15);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarD);
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
            if (!z2 || z) {
                bVarI.N(-33233767);
            } else {
                bVarI.N(-2007343);
                h6n.b(erz.a(R.drawable.dlg_ic_fbg_checkmark, 0, bVarI), "Selected", j.r(aVar2, 9.0f), j58.f, bVarI, 3504, 0);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, z2, function0, i) { // from class: iba
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vca.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final int i, final ArrayList arrayList, final int i2, final boolean z, final double d, final double d2, e5h e5hVar, h5h h5hVar, final Function0 function0, final gaj gajVar, final Function0 function1, final Function0 function2, final Function0 function3, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.b bVar;
        final e5h e5hVar2;
        final h5h h5hVar2;
        final h5h h5hVar3;
        function0.getClass();
        gajVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1582290796);
        int i4 = i3 | (bVarI.d(i) ? 4 : 2) | (bVarI.A(arrayList) ? 32 : 16) | (bVarI.d(i2) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.f(d) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.f(d2) ? 131072 : 65536) | 37748736 | (bVarI.A(function0) ? 536870912 : 268435456);
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (((((bVarI.A(gajVar) ? (char) 4 : (char) 2) | (bVarI.A(function1) ? ' ' : (char) 16)) | (bVarI.A(function2) ? 256 : 128)) | (bVarI.A(function3) ? 2048 : 1024)) & 1171) == 1170) ? false : true)) {
            bVarI.A0();
            int i5 = i3 & 1;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i5 == 0 || bVarI.h0()) {
                bVarI.N(-924953623);
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                j8i0 j8i0VarA = sgk.a(jq40.a(e5h.class), w8i0VarA.getViewModelStore(), dyb.a(w8i0VarA), null, orp.b(bVarI), null);
                bVarI.X(false);
                e5hVar = (e5h) j8i0VarA;
                qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
                boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
                Object objY = bVarI.y();
                if (zM || objY == c0042a) {
                    objY = qn70VarA.a(jq40.a(h5h.class), null, null);
                    bVarI.r(objY);
                }
                bVarI.X(false);
                bVarI.X(false);
                h5hVar3 = (h5h) objY;
            } else {
                bVarI.G();
                h5hVar3 = h5hVar;
            }
            final e5h e5hVar3 = e5hVar;
            bVarI.Y();
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new g7f(configuration.screenHeightDp);
                bVarI.r(objY2);
            }
            final float f = ((g7f) objY2).a * 0.6f;
            k590 k590Var = k590.a;
            final j590 j590VarE = k65.e(390, 2, bVarI);
            l65 l65VarD = k65.d(j590VarE, bVarI, 2);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY3);
            }
            final v5b v5bVar = (v5b) objY3;
            Unit unit = Unit.a;
            boolean zM2 = bVarI.M(j590VarE);
            Object objY4 = bVarI.y();
            if (zM2 || objY4 == c0042a) {
                objY4 = new lca(j590VarE, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, unit, (Function2) objY4);
            bVar = bVarI;
            k65.a(pp8.b(1818457829, new gaj() { // from class: wba
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    int i6 = 0;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarI = j.i(j.g(d.a.b, 1.0f), f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarI);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        final v5b v5bVar2 = v5bVar;
                        boolean zA = aVar2.A(v5bVar2);
                        final j590 j590Var = j590VarE;
                        boolean zM3 = zA | aVar2.M(j590Var);
                        final Function0 function4 = function0;
                        boolean zM4 = zM3 | aVar2.M(function4);
                        Object objY5 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM4 || objY5 == c0042a2) {
                            objY5 = new Function0() { // from class: yba
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ej5.c(v5bVar2, null, null, new mca(j590Var, function4, null), 3);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY5);
                        }
                        Function0 function5 = (Function0) objY5;
                        boolean zA2 = aVar2.A(v5bVar2) | aVar2.M(j590Var);
                        final gaj gajVar2 = gajVar;
                        boolean zM5 = zA2 | aVar2.M(gajVar2);
                        Object objY6 = aVar2.y();
                        if (zM5 || objY6 == c0042a2) {
                            objY6 = new gaj() { // from class: aca
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    GiftItem giftItem = (GiftItem) obj4;
                                    double dDoubleValue = ((Double) obj5).doubleValue();
                                    boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                                    giftItem.getClass();
                                    ej5.c(v5bVar2, null, null, new nca(j590Var, gajVar2, giftItem, dDoubleValue, zBooleanValue, null), 3);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY6);
                        }
                        gaj gajVar3 = (gaj) objY6;
                        Function0 function6 = function1;
                        boolean zM6 = aVar2.M(function6);
                        Object objY7 = aVar2.y();
                        if (zM6 || objY7 == c0042a2) {
                            objY7 = new w46(1, function6);
                            aVar2.r(objY7);
                        }
                        Function0 function7 = (Function0) objY7;
                        Function0 function8 = function2;
                        boolean zM7 = aVar2.M(function8);
                        Object objY8 = aVar2.y();
                        if (zM7 || objY8 == c0042a2) {
                            objY8 = new bca(function8, i6);
                            aVar2.r(objY8);
                        }
                        Function0 function9 = (Function0) objY8;
                        Function0 function10 = function3;
                        boolean zM8 = aVar2.M(function10);
                        Object objY9 = aVar2.y();
                        if (zM8 || objY9 == c0042a2) {
                            objY9 = new cca(function10, i6);
                            aVar2.r(objY9);
                        }
                        vca.e(i, arrayList, i2, z, d, d2, e5hVar3, h5hVar3, function5, gajVar3, function7, function9, (Function0) objY9, aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, l65VarD, f, 0.0f, j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12), r58.d(4279900958L), 0L, 8.0f, null, false, null, j58.l, 0L, hv8.a, bVar, 806882310);
            e5hVar2 = e5hVar3;
            h5hVar2 = h5hVar3;
        } else {
            bVar = bVarI;
            bVar.G();
            e5hVar2 = e5hVar;
            h5hVar2 = h5hVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, arrayList, i2, z, d, d2, e5hVar2, h5hVar2, function0, gajVar, function1, function2, function3, i3) { // from class: xba
                public final /* synthetic */ Function0 A;
                public final /* synthetic */ Function0 B;
                public final /* synthetic */ int a;
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ double e;
                public final /* synthetic */ double f;
                public final /* synthetic */ e5h i;
                public final /* synthetic */ h5h v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ gaj y;
                public final /* synthetic */ Function0 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1572865);
                    vca.d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final int i, final ArrayList arrayList, final int i2, final boolean z, final double d, final double d2, final e5h e5hVar, final h5h h5hVar, final Function0 function0, final gaj gajVar, final Function0 function1, final Function0 function2, final Function0 function3, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        ytw ytwVar;
        boolean z2;
        ArrayList arrayList2;
        function0.getClass();
        gajVar.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1147859806);
        int i4 = i3 | (bVarI.d(i) ? 4 : 2) | (bVarI.A(arrayList) ? 32 : 16) | (bVarI.d(i2) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.f(d) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.f(d2) ? 131072 : 65536) | (bVarI.f(0.0d) ? 1048576 : 524288) | (bVarI.A(e5hVar) ? 8388608 : 4194304) | (bVarI.A(h5hVar) ? 67108864 : 33554432) | (bVarI.A(function0) ? 536870912 : 268435456);
        int i5 = (bVarI.A(gajVar) ? (char) 4 : (char) 2) | (bVarI.A(function1) ? ' ' : (char) 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024);
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            bVarI.A0();
            if ((i3 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a2) {
                objY = m.b(Boolean.TRUE);
                bVarI.r(objY);
            }
            ytw ytwVar2 = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a2) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            final ytw ytwVar3 = (ytw) objY2;
            final zzr zzrVarA = e0s.a(0, 3, bVarI);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a2) {
                objY3 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY3);
            }
            final v5b v5bVar = (v5b) objY3;
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            final int iC1 = (int) mmdVar.C1(96.0f);
            final int iC2 = (int) mmdVar.C1(16.0f);
            boolean zA = bVarI.A(e5hVar) | bVarI.A(context) | bVarI.A(arrayList) | ((i4 & 57344) == 16384) | ((i4 & 458752) == 131072) | ((i4 & 3670016) == 1048576) | ((i5 & 112) == 32);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a2) {
                c0042a = c0042a2;
                ytwVar = ytwVar2;
                z2 = false;
                oca ocaVar = new oca(e5hVar, context, arrayList, d, d2, function1, ytwVar, null);
                arrayList2 = arrayList;
                bVarI.r(ocaVar);
                objY4 = ocaVar;
            } else {
                c0042a = c0042a2;
                ytwVar = ytwVar2;
                z2 = false;
                arrayList2 = arrayList;
            }
            xvf.e(bVarI, arrayList2, (Function2) objY4);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new sca(e5hVar, e5h.class, "giftItemsExtended", "getGiftItemsExtended()Ljava/util/List;", 0);
                bVarI.r(objY5);
            }
            final lhp lhpVar = (lhp) objY5;
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), r58.d(2281701376L), zk40.a);
            aiv aivVarC = g75.c(ht.a.h, z2);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
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
            final ytw ytwVar4 = ytwVar;
            ihe0.a(j.A(j.g(aVar2, 1.0f), null, 3), j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12), r58.d(4280097820L), 0L, 0.0f, 0.0f, null, pp8.b(1478781469, new Function2() { // from class: dba
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Object obj3;
                    zzr zzrVar;
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar5 = d.a.b;
                        d dVarA = j.A(j.g(aVar5, 1.0f), null, 3);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar4, 0);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC2 = c.c(aVar4, dVarA);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA, yka.a.f);
                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC2, yka.a.d);
                        Function0 function4 = function0;
                        boolean zM = aVar4.M(function4);
                        Object objY6 = aVar4.y();
                        a.C0041a.C0042a c0042a3 = a.C0041a.a;
                        if (zM || objY6 == c0042a3) {
                            objY6 = new zba(function4, 0);
                            aVar4.r(objY6);
                        }
                        final h5h h5hVar2 = h5hVar;
                        vca.f(h5hVar2, (Function0) objY6, aVar4, 0);
                        if (((Boolean) ytwVar4.getValue()).booleanValue()) {
                            aVar4.N(-1303944932);
                            aVar4.H();
                        } else {
                            aVar4.N(-1303852366);
                            x5a0 x5a0Var = (x5a0) h5hVar2.e;
                            boolean z3 = !((Boolean) x5a0Var.getValue()).booleanValue();
                            d dVarJ = h.j(j.e(aVar5, 1.0f), 0.0f, 0.0f, 0.0f, ((Boolean) x5a0Var.getValue()).booleanValue() ? 96.0f : 0.0f, 7);
                            final lhp lhpVar2 = lhpVar;
                            boolean zA2 = aVar4.A(lhpVar2);
                            final int i6 = i;
                            boolean zD = zA2 | aVar4.d(i6);
                            final int i7 = i2;
                            boolean zD2 = zD | aVar4.d(i7);
                            final boolean z4 = z;
                            boolean zB = zD2 | aVar4.b(z4) | aVar4.A(h5hVar2);
                            final gaj gajVar2 = gajVar;
                            boolean zM2 = zB | aVar4.M(gajVar2);
                            final zzr zzrVar2 = zzrVarA;
                            boolean zM3 = zM2 | aVar4.M(zzrVar2);
                            final int i8 = iC1;
                            boolean zD3 = zM3 | aVar4.d(i8);
                            final int i9 = iC2;
                            boolean zD4 = zD3 | aVar4.d(i9);
                            final v5b v5bVar2 = v5bVar;
                            boolean zA3 = zD4 | aVar4.A(v5bVar2);
                            final Function0 function5 = function2;
                            boolean zM4 = zA3 | aVar4.M(function5);
                            final Function0 function6 = function3;
                            boolean zM5 = zM4 | aVar4.M(function6);
                            Object objY7 = aVar4.y();
                            if (zM5 || objY7 == c0042a3) {
                                final ytw ytwVar5 = ytwVar3;
                                obj3 = new Function1() { // from class: dca
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        szr szrVar = (szr) obj4;
                                        szrVar.getClass();
                                        List list = (List) lhpVar2.get();
                                        szrVar.d(list.size(), null, new tca(list), new op8(2039820996, new uca(list, i6, i7, z4, h5hVar2, gajVar2, zzrVar2, i8, i9, v5bVar2, function5, function6, ytwVar5), true));
                                        return Unit.a;
                                    }
                                };
                                zzrVar = zzrVar2;
                                aVar4.r(obj3);
                            } else {
                                obj3 = objY7;
                                zzrVar = zzrVar2;
                            }
                            aur.a(dVarJ, zzrVar, null, false, null, null, null, z3, null, (Function1) obj3, aVar4, 0, 380);
                            aVar4.H();
                        }
                        aVar4.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 12583302, 120);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, arrayList, i2, z, d, d2, e5hVar, h5hVar, function0, gajVar, function1, function2, function3, i3) { // from class: oba
                public final /* synthetic */ Function0 A;
                public final /* synthetic */ Function0 B;
                public final /* synthetic */ int a;
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ double e;
                public final /* synthetic */ double f;
                public final /* synthetic */ e5h i;
                public final /* synthetic */ h5h v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ gaj y;
                public final /* synthetic */ Function0 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vca.e(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final h5h h5hVar, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1691718781);
        int i2 = (bVarI.A(h5hVar) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            bVarI.N(-2050851124);
            ((mmd) bVarI.O(kna.h)).N(fw20.a(R.dimen.dlg_24ssp, bVarI));
            bVarI.X(false);
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
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
            CMSRes cMSRes = r4h.s.c;
            String string = ((Context) bVarI.O(qyd0Var)).getString(R.string.dlg_fbg_choose_gift_title);
            string.getClass();
            String strC = h5hVar.c(cMSRes, string, new String[0]);
            d dVarH = h.h(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.dlg_fbg_dialog_header_bg_color, bVarI), zk40.a), 0.0f, 12.0f, 1);
            long jM = m(18, bVarI);
            t9i t9iVar = t9i.E;
            long j = j58.f;
            boolean z = false;
            lkf0.b(strC, dVarH, j, jM, null, t9iVar, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 130512);
            bVarI = bVarI;
            crz crzVarA = erz.a(R.drawable.fbg_ic_close_icon, 0, bVarI);
            d dVarJ = h.j(androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.f), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function0() { // from class: eca
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            h6n.b(crzVarA, "Close Icon", androidx.compose.foundation.d.d(dVarJ, false, null, null, (Function0) objY, 15), j, bVarI, 3120, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: fca
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vca.f(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:113:0x024c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0292  */
    /* JADX WARN: Code duplicated, block: B:117:0x0296  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:127:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ab  */
    public static final void g(final float f, final int i, final boolean z, final String str, final String str2, final h5h h5hVar, String str3, String str4, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        long j;
        kw0.c cVar;
        int iHashCode;
        long jA;
        kw0.l lVar;
        int iHashCode2;
        boolean z2;
        final String str5 = str3;
        final String str6 = str4;
        h5hVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-812943499);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.c(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.M(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.A(h5hVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.M(str5) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= bVarI.M(str6) ? 8388608 : 4194304;
        }
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            Map mapA = h5h.a(i, f);
            Float f2 = (Float) mapA.get("fbgText");
            float fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
            Float f3 = (Float) mapA.get("stakeText");
            float fFloatValue2 = f3 != null ? f3.floatValue() : 0.0f;
            Float f4 = (Float) mapA.get("expiryText");
            float fFloatValue3 = f4 != null ? f4.floatValue() : 0.0f;
            Float f5 = (Float) mapA.get("metaDataText");
            float fFloatValue4 = f5 != null ? f5.floatValue() : 0.0f;
            float f6 = i;
            long jL = l(fFloatValue * f6, bVarI);
            long jL2 = l(fFloatValue2 * f6, bVarI);
            long jL3 = l(fFloatValue3 * f6, bVarI);
            float f7 = f6 * fFloatValue4;
            d.a aVar2 = d.a.b;
            d dVarH = h.h(j.e(aVar2, 1.0f), 3.0f, 0.0f, 2);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            int i4 = i3;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                j = jL2;
            } else {
                j = jL2;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                }
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar2);
                f160 f160Var = f160.a;
                d dVarB = f160Var.b(f160Var.a(0.6f, aVar2, true), ht.a.l);
                n54.a aVar4 = ht.a.m;
                cVar = kw0.e;
                i78 i78VarA = g78.a(cVar, aVar4, bVarI, 6);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarB);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar2);
                if (z) {
                    jA = rzg.a(bVarI, -800436505, R.color.dlg_color_B2B2B2, bVarI, false);
                } else {
                    jA = rzg.a(bVarI, -800434514, R.color.dlg_fbg_coupon_fb_color, bVarI, false);
                }
                long j2 = jA;
                t9i t9iVar = t9i.E;
                b(null, str, new imf0(j2, jL, t9iVar, null, null, 0L, null, null, 3, jL, null, null, 16613368), bVarI, (i4 >> 6) & 112);
                ty0.a(bVarI, j.i(aVar2, 3.0f));
                b(null, str2, new imf0(c68.a(R.color.dlg_color_B2B2B2, bVarI), j, t9i.B, null, null, 0L, null, null, 3, j, null, null, 16613368), bVarI, (i4 >> 9) & 112);
                bVarI.X(true);
                if (str3 != null || str3.length() == 0) {
                    lVar = cVar;
                } else {
                    lVar = kw0.d;
                }
                ty0.a(bVarI, f160Var.a(0.03f, aVar2, true));
                d dVarJ = h.j(j.c(f160Var.a(0.37f, aVar2, true), 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                i78 i78VarA2 = g78.a(lVar, ht.a.o, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarJ);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar2);
                if (str3 != null || str3.length() == 0) {
                    str5 = str3;
                    z2 = false;
                    bVarI.N(-1392254754);
                } else {
                    bVarI.N(-1356584294);
                    d dVarG = h.g(androidx.compose.foundation.a.b(j.C(aVar2, null, 3), r58.d(4283454559L), j060.c(5.0f)), 8.0f, 3.0f);
                    aiv aivVarC = g75.c(ht.a.f, false);
                    int iHashCode4 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS4 = bVarI.S();
                    d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarG);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC, bVar);
                    hlh0.a(bVarI, ne00VarS4, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                        n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                    }
                    hlh0.a(bVarI, dVarC4, cVar2);
                    str5 = str3;
                    z2 = false;
                    b(null, str5, new imf0(c68.a(R.color.dlg_white, bVarI), l(f7, bVarI), t9iVar, null, null, 0L, null, null, 0, 0L, null, null, 16777208), bVarI, 0);
                    bVarI.X(true);
                }
                bVarI.X(z2);
                ty0.a(bVarI, j.i(aVar2, 8.0f));
                str6 = str4;
                b(null, str6, new imf0(c68.a(R.color.dlg_color_B2B2B2, bVarI), jL3, t9iVar, null, null, 0L, null, null, 3, jL, null, null, 16613368), bVarI, (i4 >> 18) & 112);
                bVarI.X(true);
                bVarI.X(true);
            }
            n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            yka.a.c cVar3 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar3);
            f160 f160Var2 = f160.a;
            d dVarB2 = f160Var2.b(f160Var2.a(0.6f, aVar2, true), ht.a.l);
            n54.a aVar5 = ht.a.m;
            cVar = kw0.e;
            i78 i78VarA3 = g78.a(cVar, aVar5, bVarI, 6);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar3);
            if (z) {
                jA = rzg.a(bVarI, -800436505, R.color.dlg_color_B2B2B2, bVarI, false);
            } else {
                jA = rzg.a(bVarI, -800434514, R.color.dlg_fbg_coupon_fb_color, bVarI, false);
            }
            long j3 = jA;
            t9i t9iVar2 = t9i.E;
            b(null, str, new imf0(j3, jL, t9iVar2, null, null, 0L, null, null, 3, jL, null, null, 16613368), bVarI, (i4 >> 6) & 112);
            ty0.a(bVarI, j.i(aVar2, 3.0f));
            b(null, str2, new imf0(c68.a(R.color.dlg_color_B2B2B2, bVarI), j, t9i.B, null, null, 0L, null, null, 3, j, null, null, 16613368), bVarI, (i4 >> 9) & 112);
            bVarI.X(true);
            if (str3 != null) {
                lVar = cVar;
            } else {
                lVar = cVar;
            }
            ty0.a(bVarI, f160Var2.a(0.03f, aVar2, true));
            d dVarJ2 = h.j(j.c(f160Var2.a(0.37f, aVar2, true), 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            i78 i78VarA4 = g78.a(lVar, ht.a.o, bVarI, 48);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = androidx.compose.ui.c.c(bVarI, dVarJ2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA4, bVar);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar3);
            if (str3 != null) {
                str5 = str3;
                z2 = false;
                bVarI.N(-1392254754);
            } else {
                str5 = str3;
                z2 = false;
                bVarI.N(-1392254754);
            }
            bVarI.X(z2);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            str6 = str4;
            b(null, str6, new imf0(c68.a(R.color.dlg_color_B2B2B2, bVarI), jL3, t9iVar2, null, null, 0L, null, null, 3, jL, null, null, 16613368), bVarI, (i4 >> 18) & 112);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qba
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vca.g(f, i, z, str, str2, h5hVar, str5, str6, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:222:0x0857  */
    /* JADX WARN: Code duplicated, block: B:225:0x0860  */
    /* JADX WARN: Code duplicated, block: B:227:0x0865  */
    /* JADX WARN: Code duplicated, block: B:233:0x087a  */
    /* JADX WARN: Code duplicated, block: B:236:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:237:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:240:0x08db  */
    /* JADX WARN: Code duplicated, block: B:241:0x08df  */
    /* JADX WARN: Code duplicated, block: B:246:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:252:0x0913  */
    /* JADX WARN: Code duplicated, block: B:253:0x0916  */
    /* JADX WARN: Code duplicated, block: B:256:0x092d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0930  */
    /* JADX WARN: Code duplicated, block: B:263:0x0965  */
    /* JADX WARN: Code duplicated, block: B:272:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:275:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:277:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:280:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:284:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:288:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:289:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:292:0x0aad  */
    /* JADX WARN: Code duplicated, block: B:294:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:297:0x0adb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:302:0x0ae8  */
    /* JADX WARN: Code duplicated, block: B:303:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:306:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:307:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:310:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:313:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:314:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:317:0x0b3f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:318:0x0b41  */
    /* JADX WARN: Code duplicated, block: B:321:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:330:0x0b94  */
    /* JADX WARN: Code duplicated, block: B:332:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:335:0x0ba6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:341:0x0c09  */
    /* JADX WARN: Code duplicated, block: B:342:0x0c0d  */
    /* JADX WARN: Code duplicated, block: B:345:0x0c1c  */
    /* JADX WARN: Code duplicated, block: B:347:0x0c2a  */
    /* JADX WARN: Code duplicated, block: B:350:0x0c3c  */
    /* JADX WARN: Code duplicated, block: B:352:0x0c7c  */
    /* JADX WARN: Code duplicated, block: B:355:0x0c94  */
    /* JADX WARN: Code duplicated, block: B:356:0x0c97  */
    /* JADX WARN: Code duplicated, block: B:359:0x0ca3  */
    /* JADX WARN: Code duplicated, block: B:360:0x0ca6  */
    /* JADX WARN: Code duplicated, block: B:363:0x0ccb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:364:0x0ccd  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(final int i, final int i2, final boolean z, final cok cokVar, final h5h h5hVar, final boolean z2, final gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> gajVar, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i3) {
        yka.a.C1350a c1350a;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        final ytw ytwVar;
        final ytw ytwVar2;
        boolean z3;
        int i4;
        boolean z4;
        boolean zM;
        Object objY;
        final cok cokVar2;
        final h5h h5hVar2;
        float f;
        int iHashCode;
        yka.a.C1350a c1350a2;
        dwk dwkVarI;
        dwk dwkVar;
        boolean z5;
        int i5;
        boolean z6;
        boolean zA;
        Object objY2;
        androidx.compose.runtime.b bVar;
        float f2;
        ytw ytwVar3;
        ytw ytwVar4;
        final Function0<Unit> function2;
        boolean z7;
        final ytw ytwVar5;
        androidx.compose.runtime.b bVar2;
        boolean z8;
        int iHashCode2;
        boolean z9;
        yka.a.C1350a c1350a3;
        boolean z10;
        int iHashCode3;
        ytw ytwVar6;
        boolean z11;
        boolean z12;
        float f3;
        Object objY3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a2;
        boolean z13;
        boolean z14;
        Object objY4;
        boolean z15;
        boolean z16;
        boolean zM2;
        Object objY5;
        final ytw ytwVar7;
        ytw ytwVar8;
        ytw ytwVar9;
        h5h h5hVar3;
        int iHashCode4;
        androidx.compose.runtime.b bVar3;
        boolean z17;
        boolean z18;
        boolean zF;
        Object cVar;
        cokVar.getClass();
        final GiftItem giftItem = cokVar.a;
        h5hVar.getClass();
        gajVar.getClass();
        function0.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-999391695);
        int i6 = i3 | (bVarI.d(i) ? 4 : 2) | (bVarI.d(i2) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(cokVar) ? 2048 : 1024) | (bVarI.A(h5hVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z2) ? 131072 : 65536) | (bVarI.A(gajVar) ? 1048576 : 524288) | (bVarI.A(function0) ? 8388608 : 4194304) | (bVarI.A(function1) ? 67108864 : 33554432);
        if (bVarI.q(i6 & 1, (i6 & 38347923) != 38347922)) {
            String strC = cokVar.b;
            CMSRes cMSResD = h5h.d(strC);
            if (cMSResD != null) {
                strC = h5hVar.c(cMSResD, strC, new String[0]);
            }
            String upperCase = strC.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object objY6 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a3 = androidx.compose.runtime.a.C0041a.a;
            if (objY6 == c0042a3) {
                objY6 = m.b(cokVar.l);
                bVarI.r(objY6);
            }
            ytw ytwVar10 = (ytw) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a3) {
                objY7 = m.b(cokVar.n);
                bVarI.r(objY7);
            }
            final ytw ytwVar11 = (ytw) objY7;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a3) {
                objY8 = m.b(Boolean.FALSE);
                bVarI.r(objY8);
            }
            final ytw ytwVar12 = (ytw) objY8;
            Object objY9 = bVarI.y();
            if (objY9 == c0042a3) {
                objY9 = m.b("");
                bVarI.r(objY9);
            }
            ytw ytwVar13 = (ytw) objY9;
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            int i7 = configuration.screenHeightDp;
            float density = configuration.screenWidthDp * ((mmd) bVarI.O(kna.h)).getDensity();
            Map mapA = h5h.a(i, density);
            Float f4 = (Float) mapA.get("availableText");
            float fFloatValue = f4 != null ? f4.floatValue() : 0.0f;
            Float f5 = (Float) mapA.get("currency");
            float fFloatValue2 = f5 != null ? f5.floatValue() : 0.0f;
            Float f6 = (Float) mapA.get("giftAmount");
            float fFloatValue3 = f6 != null ? f6.floatValue() : 0.0f;
            Float f7 = (Float) mapA.get("offOrLeftText");
            float fFloatValue4 = f7 != null ? f7.floatValue() : 0.0f;
            Float f8 = (Float) mapA.get("errorText");
            float fFloatValue5 = f8 != null ? f8.floatValue() : 0.0f;
            Float f9 = (Float) mapA.get("placeholder");
            float f10 = i;
            float fFloatValue6 = f9 != null ? f9.floatValue() : 0.0f;
            long jL = l(fFloatValue * f10, bVarI);
            long jL2 = l(f10 * fFloatValue2, bVarI);
            long jL3 = l(fFloatValue3 * f10, bVarI);
            long jL4 = l(fFloatValue4 * f10, bVarI);
            float f11 = fFloatValue5 * f10;
            float f12 = f10 * fFloatValue6;
            final boolean z19 = cokVar.i;
            double d = cokVar.m;
            double d2 = cokVar.j;
            Boolean boolValueOf = Boolean.valueOf(cokVar.h);
            boolean zA2 = bVarI.A(cokVar);
            Object objY10 = bVarI.y();
            if (zA2 || objY10 == c0042a3) {
                objY10 = new a(cokVar, ytwVar10, null);
                bVarI.r(objY10);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY10);
            String str = cokVar.n;
            boolean zA3 = bVarI.A(cokVar);
            Object objY11 = bVarI.y();
            if (zA3 || objY11 == c0042a3) {
                objY11 = new b(cokVar, ytwVar11, null);
                bVarI.r(objY11);
            }
            xvf.e(bVarI, str, (Function2) objY11);
            d.a aVar2 = d.a.b;
            d dVarF = h.f(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), r58.d(4279506716L), zk40.a), 14.0f);
            kw0.k kVar = kw0.c;
            n54.a aVar3 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 0);
            int iHashCode5 = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar4);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a4 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a4);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d dVarH = h.h(androidx.compose.ui.draw.b.a(ls7.a(androidx.compose.foundation.layout.c.a(j.g(aVar2, 1.0f), 2.0f), j060.c(10.0f)), erz.a(R.drawable.dlg_sg_gift_bg_v2, 0, bVarI), null, d0b.a.g, 0.0f, null, 54), 10.0f, 0.0f, 2);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode6 = Long.hashCode(bVarI.m());
            ne00 ne00VarO = bVarI.o();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar4);
            hlh0.a(bVarI, ne00VarO, dVar);
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a4);
            }
            hlh0.a(bVarI, dVarC2, cVar2);
            d dVarE = j.e(aVar2, 1.0f);
            i78 i78VarA2 = g78.a(kVar, aVar3, bVarI, 0);
            int iHashCode7 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO2 = bVarI.o();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarE);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar4);
            hlh0.a(bVarI, ne00VarO2, dVar);
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a4);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            l78 l78Var = l78.a;
            d dVarH2 = h.h(j.g(l78Var.a(0.63f, aVar2, true), 1.0f), 0.0f, 16.0f, 1);
            i78 i78VarA3 = g78.a(kVar, aVar3, bVarI, 6);
            int iHashCode8 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO3 = bVarI.o();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar4);
            hlh0.a(bVarI, ne00VarO3, dVar);
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode8))) {
                n30.a(iHashCode8, bVarI, iHashCode8, c1350a4);
            }
            hlh0.a(bVarI, dVarC4, cVar2);
            d dVarG = j.g(aVar2, 1.0f);
            kw0.g gVar = kw0.g;
            n54.b bVar5 = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar5, bVarI, 54);
            int iHashCode9 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO4 = bVarI.o();
            d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar4);
            hlh0.a(bVarI, ne00VarO4, dVar);
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode9))) {
                n30.a(iHashCode9, bVarI, iHashCode9, c1350a4);
            }
            hlh0.a(bVarI, dVarC5, cVar2);
            d dVarA = j.A(aVar2, null, 3);
            n54.b bVar6 = ht.a.l;
            f160 f160Var = f160.a;
            d dVarB = f160Var.b(dVarA, bVar6);
            i78 i78VarA4 = g78.a(kw0.e, aVar3, bVarI, 6);
            int iHashCode10 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO5 = bVarI.o();
            d dVarC6 = androidx.compose.ui.c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA4, bVar4);
            hlh0.a(bVarI, ne00VarO5, dVar);
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode10))) {
                n30.a(iHashCode10, bVarI, iHashCode10, c1350a4);
            }
            hlh0.a(bVarI, dVarC6, cVar2);
            long jA = z19 ? dr2.a(747091035, R.color.dlg_color_B2B2B2, bVarI, bVarI) : dr2.a(747093541, R.color.dlg_fbg_coupon_text1_color, bVarI, bVarI);
            String str2 = cokVar.d;
            t9i t9iVar = t9i.E;
            lkf0.b(str2, h.j(aVar2, 0.0f, 0.0f, 0.0f, 4.0f, 7), jA, jL, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196656, 0, 131024);
            d dVarD = g.d(aVar2, 0.0f, 4.0f, 1);
            long j = j58.f;
            lkf0.b(upperCase, dVarD, j, jL2, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 197040, 0, 131024);
            n54.b bVar7 = ht.a.j;
            kw0.j jVar = kw0.a;
            d160 d160VarA2 = b160.a(jVar, bVar7, bVarI, 0);
            int iHashCode11 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO6 = bVarI.o();
            d dVarC7 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar4);
            hlh0.a(bVarI, ne00VarO6, dVar);
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode11))) {
                n30.a(iHashCode11, bVarI, iHashCode11, c1350a4);
            }
            hlh0.a(bVarI, dVarC7, cVar2);
            lkf0.b(cokVar.f, f160Var.d(aVar2), j, jL3, null, t9iVar, null, 0L, null, 0L, 0, false, 1, 0, null, null, bVarI, 196992, 3072, 122832);
            ty0.a(bVarI, j.w(aVar2, 6.0f));
            lkf0.b(cokVar.p, f160Var.d(aVar2), j, jL4, null, t9iVar, null, 0L, null, 0L, 0, false, 1, 0, null, null, bVarI, 196992, 3072, 122832);
            bVarI.s();
            bVarI.s();
            if (z19) {
                bVarI.N(-1200062964);
                d dVarY = j.y(h.g(androidx.compose.foundation.a.c(r58.d(4284111972L), ls7.a(aVar2, j060.c(5.0f))), 10.0f, 3.0f), 0.0f, 100.0f, 1);
                aiv aivVarC2 = g75.c(n54Var, false);
                int iHashCode12 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO7 = bVarI.o();
                d dVarC8 = androidx.compose.ui.c.c(bVarI, dVarY);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar4);
                hlh0.a(bVarI, ne00VarO7, dVar);
                if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode12))) {
                    n30.a(iHashCode12, bVarI, iHashCode12, c1350a4);
                }
                hlh0.a(bVarI, dVarC8, cVar2);
                CMSRes cMSRes = r4h.s.p;
                String string = ((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getString(R.string.dlg_less_than_min_bet);
                string.getClass();
                lkf0.b(h5hVar.c(cMSRes, string, new String[0]), null, r58.d(4294943137L), m(14, bVarI), null, t9i.C, null, 0L, null, 0L, 0, false, 3, 0, null, null, bVarI, 196992, 3072, 122834);
                bVarI.s();
            } else {
                bVarI.N(-1215573411);
            }
            bVarI.H();
            bVarI.s();
            bVarI.s();
            d dVarJ = h.j(j.g(l78Var.a(0.37f, aVar2, true), 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            aiv aivVarC3 = g75.c(ht.a.g, false);
            int iHashCode13 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO8 = bVarI.o();
            d dVarC9 = androidx.compose.ui.c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar4);
            hlh0.a(bVarI, ne00VarO8, dVar);
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode13))) {
                n30.a(iHashCode13, bVarI, iHashCode13, c1350a4);
            }
            hlh0.a(bVarI, dVarC9, cVar2);
            r4h r4hVar = r4h.s;
            CMSRes cMSRes2 = r4hVar.j;
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            String string2 = ((Context) bVarI.O(qyd0Var)).getString(R.string.dlg_fbg_free_gift_text);
            string2.getClass();
            String strC2 = h5hVar.c(cMSRes2, string2, new String[0]);
            CMSRes cMSRes3 = r4hVar.l;
            String string3 = ((Context) bVarI.O(qyd0Var)).getString(R.string.dlg_fbg_stake_return_text);
            string3.getClass();
            String strC3 = h5hVar.c(cMSRes3, string3, new String[0]);
            String str3 = cokVar.e;
            Metadata metadata = giftItem.getMetadata();
            String displayName = metadata != null ? metadata.getDisplayName() : null;
            int i8 = i6 << 3;
            g(density, i, z19, strC2, strC3, h5hVar, displayName, str3, bVarI, (i8 & 112) | 100663296 | (i8 & 458752));
            bVarI.s();
            bVarI.s();
            bVarI.s();
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            d dVarA2 = dw.a(aVar2, z19 ? 0.5f : 1.0f);
            d160 d160VarA3 = b160.a(jVar, bVar5, bVarI, 48);
            int iHashCode14 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO9 = bVarI.o();
            d dVarC10 = androidx.compose.ui.c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar4);
            hlh0.a(bVarI, ne00VarO9, dVar);
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode14))) {
                c1350a = c1350a4;
                n30.a(iHashCode14, bVarI, iHashCode14, c1350a);
            } else {
                c1350a = c1350a4;
            }
            hlh0.a(bVarI, dVarC10, cVar2);
            dwk dwkVarI2 = i(ytwVar10);
            dwk dwkVar2 = dwk.a;
            boolean z20 = dwkVarI2 == dwkVar2;
            boolean zA4 = bVarI.A(cokVar) | bVarI.A(h5hVar) | ((i6 & 234881024) == 67108864);
            Object objY12 = bVarI.y();
            if (zA4) {
                c0042a = c0042a3;
            } else {
                if (objY12 != c0042a) {
                    c0042a = c0042a3;
                    ytwVar = ytwVar10;
                }
                ytwVar2 = ytwVar;
                c(z19, z20, (Function0) objY12, bVarI, 0);
                ty0.a(bVarI, j.w(aVar2, 6.0f));
                CMSRes cMSRes4 = r4hVar.m;
                String string4 = ((Context) bVarI.O(qyd0Var)).getString(R.string.dlg_all_text);
                string4.getClass();
                lkf0.b(h5hVar.c(cMSRes4, string4, new String[0]), null, r58.d(4288454827L), m(18, bVarI), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131026);
                ty0.a(bVarI, f160Var.a(1.0f, aVar2, true));
                lkf0.b(cokVar.c, null, r58.d(4288454827L), m(18, bVarI), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131026);
                ty0.a(bVarI, j.w(aVar2, 16.0f));
                if (i(ytwVar2) == dwkVar2 || z19) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                i4 = i6 & 3670016;
                if (i4 == 1048576) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM = z4 | bVarI.M(giftItem);
                objY = bVarI.y();
                if (zM || objY == c0042a) {
                    objY = new Function0() { // from class: hca
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            GiftItem giftItem2 = giftItem;
                            gajVar.invoke(giftItem2, Double.valueOf(giftItem2.getCurBal()), Boolean.FALSE);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                Function0 function3 = (Function0) objY;
                int i9 = (i6 >> 6) & 896;
                cokVar2 = cokVar;
                k(z19, z3, h5hVar, function3, bVarI, i9);
                h5hVar2 = h5hVar;
                bVarI.s();
                ty0.a(bVarI, j.i(aVar2, 6.0f));
                if (z19) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                d dVarA3 = dw.a(aVar2, f);
                d160 d160VarA4 = b160.a(jVar, bVar5, bVarI, 48);
                iHashCode = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO10 = bVarI.o();
                d dVarC11 = androidx.compose.ui.c.c(bVarI, dVarA3);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA4, bVar4);
                hlh0.a(bVarI, ne00VarO10, dVar);
                if (bVarI.g() && Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    c1350a2 = c1350a;
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode, bVarI, iHashCode, c1350a2);
                }
                hlh0.a(bVarI, dVarC11, cVar2);
                dwkVarI = i(ytwVar2);
                dwkVar = dwk.b;
                if (dwkVarI == dwkVar) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zB = bVarI.b(z19) | bVarI.A(cokVar2);
                i5 = i6 & 29360128;
                boolean z21 = z5;
                if (i5 == 8388608) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zA = zB | z6 | bVarI.A(h5hVar2);
                objY2 = bVarI.y();
                if (!zA || objY2 == c0042a) {
                    bVar = bVarI;
                    f2 = 1.0f;
                    objY2 = new Function0() { // from class: ica
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (z19) {
                                return Unit.a;
                            }
                            dwk dwkVar3 = dwk.b;
                            ytwVar2.setValue(dwkVar3);
                            cok cokVar3 = cokVar2;
                            cokVar3.getClass();
                            cokVar3.l = dwkVar3;
                            ytwVar11.setValue("");
                            ytwVar12.setValue(false);
                            cokVar3.n = "";
                            function0.invoke();
                            h5hVar2.g(true);
                            return Unit.a;
                        }
                    };
                    cokVar2 = cokVar2;
                    ytwVar3 = ytwVar11;
                    ytwVar4 = ytwVar12;
                    function2 = function0;
                    z7 = z19;
                    ytwVar5 = ytwVar2;
                    h5hVar2 = h5hVar2;
                    bVar.r(objY2);
                } else {
                    bVar = bVarI;
                    ytwVar4 = ytwVar12;
                    ytwVar5 = ytwVar2;
                    f2 = 1.0f;
                    function2 = function0;
                    z7 = z19;
                    ytwVar3 = ytwVar11;
                }
                c(z7, z21, (Function0) objY2, bVar, 0);
                ty0.a(bVar, j.w(aVar2, 6.0f));
                CMSRes cMSRes5 = r4hVar.n;
                String string5 = ((Context) bVar.O(qyd0Var)).getString(R.string.dlg_fbg_gift_partial);
                string5.getClass();
                bVar2 = bVar;
                lkf0.b(h5hVar2.c(cMSRes5, string5, new String[0]), null, r58.d(4288454827L), m(18, bVar), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar2, 196992, 0, 131026);
                ty0.a(bVar2, f160Var.a(f2, aVar2, true));
                if (i(ytwVar5) == dwkVar || !z2 || ((String) ytwVar3.getValue()).length() <= 0 || z7) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                i78 i78VarA5 = g78.a(kVar, aVar3, bVar2, 0);
                iHashCode2 = Long.hashCode(l2a.a(bVar2));
                ne00 ne00VarO11 = bVar2.o();
                d dVarC12 = androidx.compose.ui.c.c(bVar2, aVar2);
                bVar2.D();
                if (bVar2.g()) {
                    bVar2.F(aVar4);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, i78VarA5, bVar4);
                hlh0.a(bVar2, ne00VarO11, dVar);
                if (bVar2.g()) {
                    z9 = z8;
                    c1350a3 = c1350a2;
                } else {
                    z9 = z8;
                    c1350a3 = c1350a2;
                    if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode2))) {
                    }
                    hlh0.a(bVar2, dVarC12, cVar2);
                    z10 = z7;
                    d160 d160VarA5 = b160.a(jVar, bVar5, bVar2, 48);
                    iHashCode3 = Long.hashCode(l2a.a(bVar2));
                    ne00 ne00VarO12 = bVar2.o();
                    ytwVar6 = ytwVar3;
                    d dVarC13 = androidx.compose.ui.c.c(bVar2, aVar2);
                    bVar2.D();
                    if (bVar2.g()) {
                        bVar2.F(aVar4);
                    } else {
                        bVar2.p();
                    }
                    hlh0.a(bVar2, d160VarA5, bVar4);
                    hlh0.a(bVar2, ne00VarO12, dVar);
                    if (bVar2.g() || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode3))) {
                        n30.a(iHashCode3, bVar2, iHashCode3, c1350a3);
                    }
                    hlh0.a(bVar2, dVarC13, cVar2);
                    boolean zBooleanValue = ((Boolean) ytwVar4.getValue()).booleanValue();
                    String str4 = (String) ytwVar6.getValue();
                    String str5 = cokVar2.k;
                    if (i(ytwVar5) == dwkVar || z10) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (i(ytwVar5) == dwkVar) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zBooleanValue2 = ((Boolean) ((x5a0) h5hVar2.e).getValue()).booleanValue();
                    d dVarA4 = f.a(aVar2, pzo.a);
                    if (z9) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.5f;
                    }
                    d dVarA5 = dw.a(dVarA4, f3);
                    objY3 = bVar2.y();
                    c0042a2 = c0042a;
                    if (objY3 == c0042a2) {
                        objY3 = new jca();
                        bVar2.r(objY3);
                    }
                    Function1 function4 = (Function1) objY3;
                    boolean zA5 = bVar2.A(cokVar2) | bVar2.A(h5hVar2);
                    if (i5 == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | zA5;
                    objY4 = bVar2.y();
                    if (z14 || objY4 == c0042a2) {
                        objY4 = new Function0() { // from class: eba
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                dwk dwkVar3 = dwk.b;
                                ytwVar5.setValue(dwkVar3);
                                cok cokVar3 = cokVar2;
                                cokVar3.getClass();
                                cokVar3.l = dwkVar3;
                                h5hVar2.g(true);
                                function2.invoke();
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY4);
                    }
                    j(zBooleanValue, f12, i2, upperCase, str4, function4, str5, z11, z12, zBooleanValue2, (Function0) objY4, dVarA5, bVar2, (i8 & 896) | 196608);
                    ty0.a(bVar2, j.w(aVar2, 10.0f));
                    if (i(ytwVar5) == dwkVar || ((String) ytwVar13.getValue()).length() != 0 || ((String) ytwVar6.getValue()).length() <= 0 || z10) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (i4 == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM2 = z16 | bVar2.M(giftItem);
                    objY5 = bVar2.y();
                    if (!zM2 || objY5 == c0042a2) {
                        ytwVar7 = ytwVar6;
                        objY5 = new Function0() { // from class: fba
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Double dH = b.h(kotlin.text.c.p((String) ytwVar7.getValue(), ",", "", false));
                                if (dH != null) {
                                    gajVar.invoke(giftItem, Double.valueOf(dH.doubleValue()), Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY5);
                    } else {
                        ytwVar7 = ytwVar6;
                    }
                    ytwVar8 = ytwVar7;
                    ytwVar9 = ytwVar5;
                    h5hVar3 = h5hVar2;
                    k(z10, z15, h5hVar3, (Function0) objY5, bVar2, i9);
                    bVar2.s();
                    d dVarI = j.i(aVar2, ((mmd) bVar2.O(kna.h)).v1(f11));
                    aiv aivVarC4 = g75.c(ht.a.d, false);
                    iHashCode4 = Long.hashCode(l2a.a(bVar2));
                    ne00 ne00VarO13 = bVar2.o();
                    d dVarC14 = androidx.compose.ui.c.c(bVar2, dVarI);
                    bVar2.D();
                    if (bVar2.g()) {
                        bVar2.F(aVar4);
                    } else {
                        bVar2.p();
                    }
                    hlh0.a(bVar2, aivVarC4, bVar4);
                    hlh0.a(bVar2, ne00VarO13, dVar);
                    if (bVar2.g() || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode4))) {
                        n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                    }
                    hlh0.a(bVar2, dVarC14, cVar2);
                    if (((String) ytwVar13.getValue()).length() > 0) {
                        bVar2.N(-333501565);
                        lkf0.b((String) ytwVar13.getValue(), aVar2, j58.g, l(f11, bVar2), null, null, null, 0L, null, 0L, 0, false, 1, 0, null, null, bVar2, 432, 3072, 122864);
                        bVar3 = bVar2;
                    } else {
                        bVar3 = bVar2;
                        bVar3.N(-356432482);
                    }
                    bVar3.H();
                    bVar3.s();
                    bVar3.s();
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    if ((i6 & 458752) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zB2 = z17 | bVar3.b(z10);
                    if ((i6 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zF = zB2 | z18 | bVar3.f(d) | bVar3.A(h5hVar3) | bVar3.f(d2) | bVar3.M(upperCase) | bVar3.A(cokVar2);
                    Object objY13 = bVar3.y();
                    if (!zF || objY13 == c0042a2) {
                        cVar = new c(z2, z10, i2, d, h5hVar3, d2, upperCase, cokVar2, ytwVar9, ytwVar8, ytwVar4, ytwVar13, null);
                        bVarI = bVar3;
                        bVarI.r(cVar);
                    } else {
                        cVar = objY13;
                        bVarI = bVar3;
                    }
                    xvf.e(bVarI, boolValueOf2, (Function2) cVar);
                    bVarI.s();
                    bVarI.s();
                }
                n30.a(iHashCode2, bVar2, iHashCode2, c1350a3);
                hlh0.a(bVar2, dVarC12, cVar2);
                z10 = z7;
                d160 d160VarA6 = b160.a(jVar, bVar5, bVar2, 48);
                iHashCode3 = Long.hashCode(l2a.a(bVar2));
                ne00 ne00VarO14 = bVar2.o();
                ytwVar6 = ytwVar3;
                d dVarC15 = androidx.compose.ui.c.c(bVar2, aVar2);
                bVar2.D();
                if (bVar2.g()) {
                    bVar2.F(aVar4);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, d160VarA6, bVar4);
                hlh0.a(bVar2, ne00VarO14, dVar);
                if (bVar2.g()) {
                    n30.a(iHashCode3, bVar2, iHashCode3, c1350a3);
                } else {
                    n30.a(iHashCode3, bVar2, iHashCode3, c1350a3);
                }
                hlh0.a(bVar2, dVarC15, cVar2);
                boolean zBooleanValue3 = ((Boolean) ytwVar4.getValue()).booleanValue();
                String str6 = (String) ytwVar6.getValue();
                String str7 = cokVar2.k;
                if (i(ytwVar5) == dwkVar) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (i(ytwVar5) == dwkVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zBooleanValue4 = ((Boolean) ((x5a0) h5hVar2.e).getValue()).booleanValue();
                d dVarA6 = f.a(aVar2, pzo.a);
                if (z9) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.5f;
                }
                d dVarA7 = dw.a(dVarA6, f3);
                objY3 = bVar2.y();
                c0042a2 = c0042a;
                if (objY3 == c0042a2) {
                    objY3 = new jca();
                    bVar2.r(objY3);
                }
                Function1 function5 = (Function1) objY3;
                boolean zA6 = bVar2.A(cokVar2) | bVar2.A(h5hVar2);
                if (i5 == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zA6;
                objY4 = bVar2.y();
                if (z14) {
                    objY4 = new Function0() { // from class: eba
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            dwk dwkVar3 = dwk.b;
                            ytwVar5.setValue(dwkVar3);
                            cok cokVar3 = cokVar2;
                            cokVar3.getClass();
                            cokVar3.l = dwkVar3;
                            h5hVar2.g(true);
                            function2.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY4);
                } else {
                    objY4 = new Function0() { // from class: eba
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            dwk dwkVar3 = dwk.b;
                            ytwVar5.setValue(dwkVar3);
                            cok cokVar3 = cokVar2;
                            cokVar3.getClass();
                            cokVar3.l = dwkVar3;
                            h5hVar2.g(true);
                            function2.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY4);
                }
                j(zBooleanValue3, f12, i2, upperCase, str6, function5, str7, z11, z12, zBooleanValue4, (Function0) objY4, dVarA7, bVar2, (i8 & 896) | 196608);
                ty0.a(bVar2, j.w(aVar2, 10.0f));
                if (i(ytwVar5) == dwkVar) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (i4 == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM2 = z16 | bVar2.M(giftItem);
                objY5 = bVar2.y();
                if (zM2) {
                    ytwVar7 = ytwVar6;
                    objY5 = new Function0() { // from class: fba
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Double dH = b.h(kotlin.text.c.p((String) ytwVar7.getValue(), ",", "", false));
                            if (dH != null) {
                                gajVar.invoke(giftItem, Double.valueOf(dH.doubleValue()), Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY5);
                } else {
                    ytwVar7 = ytwVar6;
                    objY5 = new Function0() { // from class: fba
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Double dH = b.h(kotlin.text.c.p((String) ytwVar7.getValue(), ",", "", false));
                            if (dH != null) {
                                gajVar.invoke(giftItem, Double.valueOf(dH.doubleValue()), Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY5);
                }
                ytwVar8 = ytwVar7;
                ytwVar9 = ytwVar5;
                h5hVar3 = h5hVar2;
                k(z10, z15, h5hVar3, (Function0) objY5, bVar2, i9);
                bVar2.s();
                d dVarI2 = j.i(aVar2, ((mmd) bVar2.O(kna.h)).v1(f11));
                aiv aivVarC5 = g75.c(ht.a.d, false);
                iHashCode4 = Long.hashCode(l2a.a(bVar2));
                ne00 ne00VarO15 = bVar2.o();
                d dVarC16 = androidx.compose.ui.c.c(bVar2, dVarI2);
                bVar2.D();
                if (bVar2.g()) {
                    bVar2.F(aVar4);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, aivVarC5, bVar4);
                hlh0.a(bVar2, ne00VarO15, dVar);
                if (bVar2.g()) {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                } else {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                }
                hlh0.a(bVar2, dVarC16, cVar2);
                if (((String) ytwVar13.getValue()).length() > 0) {
                    bVar2.N(-333501565);
                    lkf0.b((String) ytwVar13.getValue(), aVar2, j58.g, l(f11, bVar2), null, null, null, 0L, null, 0L, 0, false, 1, 0, null, null, bVar2, 432, 3072, 122864);
                    bVar3 = bVar2;
                } else {
                    bVar3 = bVar2;
                    bVar3.N(-356432482);
                }
                bVar3.H();
                bVar3.s();
                bVar3.s();
                Boolean boolValueOf3 = Boolean.valueOf(z);
                if ((i6 & 458752) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zB3 = z17 | bVar3.b(z10);
                if ((i6 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zF = zB3 | z18 | bVar3.f(d) | bVar3.A(h5hVar3) | bVar3.f(d2) | bVar3.M(upperCase) | bVar3.A(cokVar2);
                Object objY14 = bVar3.y();
                if (zF) {
                    cVar = new c(z2, z10, i2, d, h5hVar3, d2, upperCase, cokVar2, ytwVar9, ytwVar8, ytwVar4, ytwVar13, null);
                    bVarI = bVar3;
                    bVarI.r(cVar);
                } else {
                    cVar = new c(z2, z10, i2, d, h5hVar3, d2, upperCase, cokVar2, ytwVar9, ytwVar8, ytwVar4, ytwVar13, null);
                    bVarI = bVar3;
                    bVarI.r(cVar);
                }
                xvf.e(bVarI, boolValueOf3, (Function2) cVar);
                bVarI.s();
                bVarI.s();
            }
            c0042a = c0042a3;
            ytwVar = ytwVar10;
            objY12 = new Function0() { // from class: gca
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    cok cokVar3 = cokVar;
                    if (!cokVar3.h) {
                        h5h h5hVar4 = h5hVar;
                        if (!((Boolean) ((x5a0) h5hVar4.e).getValue()).booleanValue()) {
                            dwk dwkVar3 = dwk.a;
                            ytwVar.setValue(dwkVar3);
                            cokVar3.l = dwkVar3;
                            function1.invoke();
                            h5hVar4.g(false);
                            return Unit.a;
                        }
                    }
                    return Unit.a;
                }
            };
            bVarI.r(objY12);
            ytwVar2 = ytwVar;
            c(z19, z20, (Function0) objY12, bVarI, 0);
            ty0.a(bVarI, j.w(aVar2, 6.0f));
            CMSRes cMSRes6 = r4hVar.m;
            String string6 = ((Context) bVarI.O(qyd0Var)).getString(R.string.dlg_all_text);
            string6.getClass();
            lkf0.b(h5hVar.c(cMSRes6, string6, new String[0]), null, r58.d(4288454827L), m(18, bVarI), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131026);
            ty0.a(bVarI, f160Var.a(1.0f, aVar2, true));
            lkf0.b(cokVar.c, null, r58.d(4288454827L), m(18, bVarI), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131026);
            ty0.a(bVarI, j.w(aVar2, 16.0f));
            if (i(ytwVar2) == dwkVar2) {
                z3 = false;
            } else {
                z3 = false;
            }
            i4 = i6 & 3670016;
            if (i4 == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM = z4 | bVarI.M(giftItem);
            objY = bVarI.y();
            if (zM) {
                objY = new Function0() { // from class: hca
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        GiftItem giftItem2 = giftItem;
                        gajVar.invoke(giftItem2, Double.valueOf(giftItem2.getCurBal()), Boolean.FALSE);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function0() { // from class: hca
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        GiftItem giftItem2 = giftItem;
                        gajVar.invoke(giftItem2, Double.valueOf(giftItem2.getCurBal()), Boolean.FALSE);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            Function0 function6 = (Function0) objY;
            int i10 = (i6 >> 6) & 896;
            cokVar2 = cokVar;
            k(z19, z3, h5hVar, function6, bVarI, i10);
            h5hVar2 = h5hVar;
            bVarI.s();
            ty0.a(bVarI, j.i(aVar2, 6.0f));
            if (z19) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            d dVarA8 = dw.a(aVar2, f);
            d160 d160VarA7 = b160.a(jVar, bVar5, bVarI, 48);
            iHashCode = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO16 = bVarI.o();
            d dVarC17 = androidx.compose.ui.c.c(bVarI, dVarA8);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA7, bVar4);
            hlh0.a(bVarI, ne00VarO16, dVar);
            if (bVarI.g()) {
                c1350a2 = c1350a;
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            } else {
                c1350a2 = c1350a;
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            hlh0.a(bVarI, dVarC17, cVar2);
            dwkVarI = i(ytwVar2);
            dwkVar = dwk.b;
            if (dwkVarI == dwkVar) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean zB4 = bVarI.b(z19) | bVarI.A(cokVar2);
            i5 = i6 & 29360128;
            boolean z22 = z5;
            if (i5 == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            zA = zB4 | z6 | bVarI.A(h5hVar2);
            objY2 = bVarI.y();
            if (zA) {
                bVar = bVarI;
                f2 = 1.0f;
                objY2 = new Function0() { // from class: ica
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z19) {
                            return Unit.a;
                        }
                        dwk dwkVar3 = dwk.b;
                        ytwVar2.setValue(dwkVar3);
                        cok cokVar3 = cokVar2;
                        cokVar3.getClass();
                        cokVar3.l = dwkVar3;
                        ytwVar11.setValue("");
                        ytwVar12.setValue(false);
                        cokVar3.n = "";
                        function0.invoke();
                        h5hVar2.g(true);
                        return Unit.a;
                    }
                };
                cokVar2 = cokVar2;
                ytwVar3 = ytwVar11;
                ytwVar4 = ytwVar12;
                function2 = function0;
                z7 = z19;
                ytwVar5 = ytwVar2;
                h5hVar2 = h5hVar2;
                bVar.r(objY2);
            } else {
                bVar = bVarI;
                f2 = 1.0f;
                objY2 = new Function0() { // from class: ica
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z19) {
                            return Unit.a;
                        }
                        dwk dwkVar3 = dwk.b;
                        ytwVar2.setValue(dwkVar3);
                        cok cokVar3 = cokVar2;
                        cokVar3.getClass();
                        cokVar3.l = dwkVar3;
                        ytwVar11.setValue("");
                        ytwVar12.setValue(false);
                        cokVar3.n = "";
                        function0.invoke();
                        h5hVar2.g(true);
                        return Unit.a;
                    }
                };
                cokVar2 = cokVar2;
                ytwVar3 = ytwVar11;
                ytwVar4 = ytwVar12;
                function2 = function0;
                z7 = z19;
                ytwVar5 = ytwVar2;
                h5hVar2 = h5hVar2;
                bVar.r(objY2);
            }
            c(z7, z22, (Function0) objY2, bVar, 0);
            ty0.a(bVar, j.w(aVar2, 6.0f));
            CMSRes cMSRes7 = r4hVar.n;
            String string7 = ((Context) bVar.O(qyd0Var)).getString(R.string.dlg_fbg_gift_partial);
            string7.getClass();
            bVar2 = bVar;
            lkf0.b(h5hVar2.c(cMSRes7, string7, new String[0]), null, r58.d(4288454827L), m(18, bVar), null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar2, 196992, 0, 131026);
            ty0.a(bVar2, f160Var.a(f2, aVar2, true));
            if (i(ytwVar5) == dwkVar) {
                z8 = false;
            } else {
                z8 = false;
            }
            i78 i78VarA6 = g78.a(kVar, aVar3, bVar2, 0);
            iHashCode2 = Long.hashCode(l2a.a(bVar2));
            ne00 ne00VarO17 = bVar2.o();
            d dVarC18 = androidx.compose.ui.c.c(bVar2, aVar2);
            bVar2.D();
            if (bVar2.g()) {
                bVar2.F(aVar4);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, i78VarA6, bVar4);
            hlh0.a(bVar2, ne00VarO17, dVar);
            if (bVar2.g()) {
                z9 = z8;
                c1350a3 = c1350a2;
                if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode2))) {
                }
                hlh0.a(bVar2, dVarC18, cVar2);
                z10 = z7;
                d160 d160VarA8 = b160.a(jVar, bVar5, bVar2, 48);
                iHashCode3 = Long.hashCode(l2a.a(bVar2));
                ne00 ne00VarO18 = bVar2.o();
                ytwVar6 = ytwVar3;
                d dVarC19 = androidx.compose.ui.c.c(bVar2, aVar2);
                bVar2.D();
                if (bVar2.g()) {
                    bVar2.F(aVar4);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, d160VarA8, bVar4);
                hlh0.a(bVar2, ne00VarO18, dVar);
                if (bVar2.g()) {
                    n30.a(iHashCode3, bVar2, iHashCode3, c1350a3);
                } else {
                    n30.a(iHashCode3, bVar2, iHashCode3, c1350a3);
                }
                hlh0.a(bVar2, dVarC19, cVar2);
                boolean zBooleanValue5 = ((Boolean) ytwVar4.getValue()).booleanValue();
                String str8 = (String) ytwVar6.getValue();
                String str9 = cokVar2.k;
                if (i(ytwVar5) == dwkVar) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (i(ytwVar5) == dwkVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zBooleanValue6 = ((Boolean) ((x5a0) h5hVar2.e).getValue()).booleanValue();
                d dVarA9 = f.a(aVar2, pzo.a);
                if (z9) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.5f;
                }
                d dVarA10 = dw.a(dVarA9, f3);
                objY3 = bVar2.y();
                c0042a2 = c0042a;
                if (objY3 == c0042a2) {
                    objY3 = new jca();
                    bVar2.r(objY3);
                }
                Function1 function7 = (Function1) objY3;
                boolean zA7 = bVar2.A(cokVar2) | bVar2.A(h5hVar2);
                if (i5 == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zA7;
                objY4 = bVar2.y();
                if (z14) {
                    objY4 = new Function0() { // from class: eba
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            dwk dwkVar3 = dwk.b;
                            ytwVar5.setValue(dwkVar3);
                            cok cokVar3 = cokVar2;
                            cokVar3.getClass();
                            cokVar3.l = dwkVar3;
                            h5hVar2.g(true);
                            function2.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY4);
                } else {
                    objY4 = new Function0() { // from class: eba
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            dwk dwkVar3 = dwk.b;
                            ytwVar5.setValue(dwkVar3);
                            cok cokVar3 = cokVar2;
                            cokVar3.getClass();
                            cokVar3.l = dwkVar3;
                            h5hVar2.g(true);
                            function2.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY4);
                }
                j(zBooleanValue5, f12, i2, upperCase, str8, function7, str9, z11, z12, zBooleanValue6, (Function0) objY4, dVarA10, bVar2, (i8 & 896) | 196608);
                ty0.a(bVar2, j.w(aVar2, 10.0f));
                if (i(ytwVar5) == dwkVar) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (i4 == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM2 = z16 | bVar2.M(giftItem);
                objY5 = bVar2.y();
                if (zM2) {
                    ytwVar7 = ytwVar6;
                    objY5 = new Function0() { // from class: fba
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Double dH = b.h(kotlin.text.c.p((String) ytwVar7.getValue(), ",", "", false));
                            if (dH != null) {
                                gajVar.invoke(giftItem, Double.valueOf(dH.doubleValue()), Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY5);
                } else {
                    ytwVar7 = ytwVar6;
                    objY5 = new Function0() { // from class: fba
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Double dH = b.h(kotlin.text.c.p((String) ytwVar7.getValue(), ",", "", false));
                            if (dH != null) {
                                gajVar.invoke(giftItem, Double.valueOf(dH.doubleValue()), Boolean.TRUE);
                            }
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY5);
                }
                ytwVar8 = ytwVar7;
                ytwVar9 = ytwVar5;
                h5hVar3 = h5hVar2;
                k(z10, z15, h5hVar3, (Function0) objY5, bVar2, i10);
                bVar2.s();
                d dVarI3 = j.i(aVar2, ((mmd) bVar2.O(kna.h)).v1(f11));
                aiv aivVarC6 = g75.c(ht.a.d, false);
                iHashCode4 = Long.hashCode(l2a.a(bVar2));
                ne00 ne00VarO19 = bVar2.o();
                d dVarC110 = androidx.compose.ui.c.c(bVar2, dVarI3);
                bVar2.D();
                if (bVar2.g()) {
                    bVar2.F(aVar4);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, aivVarC6, bVar4);
                hlh0.a(bVar2, ne00VarO19, dVar);
                if (bVar2.g()) {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                } else {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
                }
                hlh0.a(bVar2, dVarC110, cVar2);
                if (((String) ytwVar13.getValue()).length() > 0) {
                    bVar2.N(-333501565);
                    lkf0.b((String) ytwVar13.getValue(), aVar2, j58.g, l(f11, bVar2), null, null, null, 0L, null, 0L, 0, false, 1, 0, null, null, bVar2, 432, 3072, 122864);
                    bVar3 = bVar2;
                } else {
                    bVar3 = bVar2;
                    bVar3.N(-356432482);
                }
                bVar3.H();
                bVar3.s();
                bVar3.s();
                Boolean boolValueOf4 = Boolean.valueOf(z);
                if ((i6 & 458752) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zB5 = z17 | bVar3.b(z10);
                if ((i6 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zF = zB5 | z18 | bVar3.f(d) | bVar3.A(h5hVar3) | bVar3.f(d2) | bVar3.M(upperCase) | bVar3.A(cokVar2);
                Object objY15 = bVar3.y();
                if (zF) {
                    cVar = new c(z2, z10, i2, d, h5hVar3, d2, upperCase, cokVar2, ytwVar9, ytwVar8, ytwVar4, ytwVar13, null);
                    bVarI = bVar3;
                    bVarI.r(cVar);
                } else {
                    cVar = new c(z2, z10, i2, d, h5hVar3, d2, upperCase, cokVar2, ytwVar9, ytwVar8, ytwVar4, ytwVar13, null);
                    bVarI = bVar3;
                    bVarI.r(cVar);
                }
                xvf.e(bVarI, boolValueOf4, (Function2) cVar);
                bVarI.s();
                bVarI.s();
            } else {
                z9 = z8;
                c1350a3 = c1350a2;
            }
            n30.a(iHashCode2, bVar2, iHashCode2, c1350a3);
            hlh0.a(bVar2, dVarC18, cVar2);
            z10 = z7;
            d160 d160VarA9 = b160.a(jVar, bVar5, bVar2, 48);
            iHashCode3 = Long.hashCode(l2a.a(bVar2));
            ne00 ne00VarO110 = bVar2.o();
            ytwVar6 = ytwVar3;
            d dVarC111 = androidx.compose.ui.c.c(bVar2, aVar2);
            bVar2.D();
            if (bVar2.g()) {
                bVar2.F(aVar4);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, d160VarA9, bVar4);
            hlh0.a(bVar2, ne00VarO110, dVar);
            if (bVar2.g()) {
                n30.a(iHashCode3, bVar2, iHashCode3, c1350a3);
            } else {
                n30.a(iHashCode3, bVar2, iHashCode3, c1350a3);
            }
            hlh0.a(bVar2, dVarC111, cVar2);
            boolean zBooleanValue7 = ((Boolean) ytwVar4.getValue()).booleanValue();
            String str10 = (String) ytwVar6.getValue();
            String str11 = cokVar2.k;
            if (i(ytwVar5) == dwkVar) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (i(ytwVar5) == dwkVar) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean zBooleanValue8 = ((Boolean) ((x5a0) h5hVar2.e).getValue()).booleanValue();
            d dVarA11 = f.a(aVar2, pzo.a);
            if (z9) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            d dVarA12 = dw.a(dVarA11, f3);
            objY3 = bVar2.y();
            c0042a2 = c0042a;
            if (objY3 == c0042a2) {
                objY3 = new jca();
                bVar2.r(objY3);
            }
            Function1 function8 = (Function1) objY3;
            boolean zA8 = bVar2.A(cokVar2) | bVar2.A(h5hVar2);
            if (i5 == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zA8;
            objY4 = bVar2.y();
            if (z14) {
                objY4 = new Function0() { // from class: eba
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        dwk dwkVar3 = dwk.b;
                        ytwVar5.setValue(dwkVar3);
                        cok cokVar3 = cokVar2;
                        cokVar3.getClass();
                        cokVar3.l = dwkVar3;
                        h5hVar2.g(true);
                        function2.invoke();
                        return Unit.a;
                    }
                };
                bVar2.r(objY4);
            } else {
                objY4 = new Function0() { // from class: eba
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        dwk dwkVar3 = dwk.b;
                        ytwVar5.setValue(dwkVar3);
                        cok cokVar3 = cokVar2;
                        cokVar3.getClass();
                        cokVar3.l = dwkVar3;
                        h5hVar2.g(true);
                        function2.invoke();
                        return Unit.a;
                    }
                };
                bVar2.r(objY4);
            }
            j(zBooleanValue7, f12, i2, upperCase, str10, function8, str11, z11, z12, zBooleanValue8, (Function0) objY4, dVarA12, bVar2, (i8 & 896) | 196608);
            ty0.a(bVar2, j.w(aVar2, 10.0f));
            if (i(ytwVar5) == dwkVar) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (i4 == 1048576) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM2 = z16 | bVar2.M(giftItem);
            objY5 = bVar2.y();
            if (zM2) {
                ytwVar7 = ytwVar6;
                objY5 = new Function0() { // from class: fba
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Double dH = b.h(kotlin.text.c.p((String) ytwVar7.getValue(), ",", "", false));
                        if (dH != null) {
                            gajVar.invoke(giftItem, Double.valueOf(dH.doubleValue()), Boolean.TRUE);
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(objY5);
            } else {
                ytwVar7 = ytwVar6;
                objY5 = new Function0() { // from class: fba
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Double dH = b.h(kotlin.text.c.p((String) ytwVar7.getValue(), ",", "", false));
                        if (dH != null) {
                            gajVar.invoke(giftItem, Double.valueOf(dH.doubleValue()), Boolean.TRUE);
                        }
                        return Unit.a;
                    }
                };
                bVar2.r(objY5);
            }
            ytwVar8 = ytwVar7;
            ytwVar9 = ytwVar5;
            h5hVar3 = h5hVar2;
            k(z10, z15, h5hVar3, (Function0) objY5, bVar2, i10);
            bVar2.s();
            d dVarI4 = j.i(aVar2, ((mmd) bVar2.O(kna.h)).v1(f11));
            aiv aivVarC7 = g75.c(ht.a.d, false);
            iHashCode4 = Long.hashCode(l2a.a(bVar2));
            ne00 ne00VarO111 = bVar2.o();
            d dVarC112 = androidx.compose.ui.c.c(bVar2, dVarI4);
            bVar2.D();
            if (bVar2.g()) {
                bVar2.F(aVar4);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, aivVarC7, bVar4);
            hlh0.a(bVar2, ne00VarO111, dVar);
            if (bVar2.g()) {
                n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
            } else {
                n30.a(iHashCode4, bVar2, iHashCode4, c1350a3);
            }
            hlh0.a(bVar2, dVarC112, cVar2);
            if (((String) ytwVar13.getValue()).length() > 0) {
                bVar2.N(-333501565);
                lkf0.b((String) ytwVar13.getValue(), aVar2, j58.g, l(f11, bVar2), null, null, null, 0L, null, 0L, 0, false, 1, 0, null, null, bVar2, 432, 3072, 122864);
                bVar3 = bVar2;
            } else {
                bVar3 = bVar2;
                bVar3.N(-356432482);
            }
            bVar3.H();
            bVar3.s();
            bVar3.s();
            Boolean boolValueOf5 = Boolean.valueOf(z);
            if ((i6 & 458752) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zB6 = z17 | bVar3.b(z10);
            if ((i6 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            zF = zB6 | z18 | bVar3.f(d) | bVar3.A(h5hVar3) | bVar3.f(d2) | bVar3.M(upperCase) | bVar3.A(cokVar2);
            Object objY16 = bVar3.y();
            if (zF) {
                cVar = new c(z2, z10, i2, d, h5hVar3, d2, upperCase, cokVar2, ytwVar9, ytwVar8, ytwVar4, ytwVar13, null);
                bVarI = bVar3;
                bVarI.r(cVar);
            } else {
                cVar = new c(z2, z10, i2, d, h5hVar3, d2, upperCase, cokVar2, ytwVar9, ytwVar8, ytwVar4, ytwVar13, null);
                bVarI = bVar3;
                bVarI.r(cVar);
            }
            xvf.e(bVarI, boolValueOf5, (Function2) cVar);
            bVarI.s();
            bVarI.s();
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.e(new Function2(i, i2, z, cokVar, h5hVar, z2, gajVar, function0, function1, i3) { // from class: gba
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ cok d;
                public final /* synthetic */ h5h e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ gaj i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vca.h(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            });
        }
    }

    public static final dwk i(ytw<dwk> ytwVar) {
        return ytwVar.getValue();
    }

    public static final void j(final boolean z, final float f, final int i, final String str, final String str2, final Function1 function1, final String str3, final boolean z2, final boolean z3, final boolean z4, Function0 function0, final d dVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        String str4;
        int i4;
        final Function0 function2 = function0;
        str.getClass();
        str2.getClass();
        function1.getClass();
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-702402941);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.M(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            str4 = str2;
            i3 |= bVarI.M(str4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            str4 = str2;
        }
        if ((i2 & 196608) == 0) {
            i3 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= bVarI.M(str3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= bVarI.b(z2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= bVarI.b(z3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= bVarI.b(z4) ? 536870912 : 268435456;
        }
        int i5 = (bVarI.A(function2) ? (char) 4 : (char) 2) | (bVarI.M(dVar) ? ' ' : (char) 16);
        if (bVarI.q(i3 & 1, ((i3 & 306783251) == 306783250 && (i5 & 19) == 18) ? false : true)) {
            long jD = r58.d(4279710039L);
            long jD2 = r58.d(4282006594L);
            r58.d(4288454827L);
            r58.d(4288454827L);
            boolean z5 = z3 && z;
            String str5 = z5 ? str4 : str3;
            if (z5 && str.length() > 0) {
                str5 = str + ' ' + str5;
            }
            int i6 = i3;
            d dVarA = d35.a(j.g(dVar, 0.6f), 2.0f, (z4 && z3) ? jD : jD2, j060.c(6.0f));
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
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
            d dVarH = h.h(j.D(aVar3, null, 3), 8.0f, 0.0f, 2);
            kw0.c cVar2 = kw0.e;
            n54.b bVar2 = ht.a.k;
            String str6 = str5;
            d160 d160VarA = b160.a(cVar2, bVar2, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarH);
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
            d dVarH2 = h.h(j.i(j.g(aVar3, 1.0f), 40.0f), 8.0f, 0.0f, 2);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            d dVarE = j.e(aVar3, 1.0f);
            d160 d160VarA2 = b160.a(cVar2, bVar2, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarE);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            boolean z6 = (i6 & 458752) == 131072;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z6 || objY == c0042a) {
                objY = new jba(function1, 0);
                bVarI.r(objY);
            }
            a(str6, (Function1) objY, null, new imf0(c68.a(R.color.dlg_color_B2B2B2, bVarI), l(f, bVarI), t9i.E, null, null, 0L, null, null, 3, l(f, bVarI), null, null, 16613368), 0L, 0L, bVarI, 0);
            f30.a(bVarI, true, true, true);
            d dVarF = androidx.compose.foundation.layout.d.a.f(aVar3);
            boolean z7 = (i5 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z7 || objY2 == c0042a) {
                function2 = function0;
                i4 = 0;
                objY2 = new kba(function2, 0);
                bVarI.r(objY2);
            } else {
                function2 = function0;
                i4 = 0;
            }
            g75.a(androidx.compose.foundation.d.d(dVarF, z2, null, null, (Function0) objY2, 14), bVarI, i4);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lba
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    vca.j(z, f, i, str, str2, function1, str3, z2, z3, z4, function2, dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(final boolean z, final boolean z2, final h5h h5hVar, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        h5hVar.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-950343923);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(h5hVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            float f = z2 ? 1.0f : 0.5f;
            long jA = z ? rzg.a(bVarI, 1547531794, R.color.dlg_fbg_use_type_tint_color_unselected_v2, bVarI, false) : rzg.a(bVarI, 1547534555, R.color.dlg_use_gift_color, bVarI, false);
            long jA2 = z ? rzg.a(bVarI, 1547537586, R.color.dlg_white, bVarI, false) : rzg.a(bVarI, 1547539346, R.color.dlg_white, bVarI, false);
            i060 i060VarC = j060.c(5.0f);
            long j = jA2;
            long j2 = jA;
            ak5 ak5VarA = ek5.a(j2, j, j2, j, bVarI, 0);
            umz umzVar = new umz(6.0f, 6.0f, 6.0f, 6.0f);
            d dVarA = dw.a(j.b(d.a.b, 0.0f, 1.0f, 1), f);
            boolean z3 = (i2 & 7168) == 2048;
            Object objY = bVarI.y();
            if (z3 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function0() { // from class: mba
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            nk5.a((Function0) objY, dVarA, z2, i060VarC, ak5VarA, null, null, umzVar, null, pp8.b(1297253661, new nba(h5hVar, 0), bVarI), bVarI, ((i2 << 3) & 896) | 817889280, 352);
            bVar = bVarI;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pba
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    vca.k(z, z2, h5hVar, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final long l(float f, androidx.compose.runtime.a aVar) {
        return ((mmd) aVar.O(kna.h)).g0(f);
    }

    public static final long m(int i, androidx.compose.runtime.a aVar) {
        return ((mmd) aVar.O(kna.h)).N(i);
    }
}
