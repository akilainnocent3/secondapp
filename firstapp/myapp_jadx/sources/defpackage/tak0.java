package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ltak0;", "Landroidx/fragment/app/d;", "Lk9j;", "<init>", "()V", "Lwak0;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tak0 extends p8m implements k9j {
    public final q8i0 f;
    public iju i;

    public static final class a extends qlr implements Function0<Fragment> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return tak0.this;
        }
    }

    public static final class b extends qlr implements Function0<w8i0> {
        public final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? tak0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public tak0() {
        ttr ttrVarA = hwr.a(a1s.c, new b(new a()));
        this.f = new q8i0(jq40.a(xak0.class), new c(ttrVarA), new e(ttrVarA), new d(ttrVarA));
    }

    public final void m0(final int i, androidx.compose.runtime.a aVar, androidx.compose.ui.d dVar, final String str) {
        final androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(1885301344);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            androidx.compose.ui.d dVarR = j.r(aVar2, 18.0f);
            crz crzVarA = erz.a(R.drawable.ic_gold_dollar, 0, bVarI);
            qyd0 qyd0Var = oib0.a;
            h6n.b(crzVarA, "deposit to start", dVarR, ((lib0) bVarI.O(qyd0Var)).S, bVarI, 432, 0);
            ty0.a(bVarI, j.w(aVar2, 4.0f));
            lkf0.d(str, null, ((lib0) bVarI.O(qyd0Var)).h, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).k, bVarI, (i2 >> 3) & 14, 0, 130042);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: sak0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    this.a.m0(iA, (a) obj, dVar2, str);
                    return Unit.a;
                }
            };
        }
    }

    public final void n0(final int i, androidx.compose.runtime.a aVar, final String str, final String str2, final String str3, final boolean z) {
        androidx.compose.ui.d.a aVar2;
        yka.a.b bVar;
        int i2;
        yka.a.d dVar;
        tsr.a aVar3;
        boolean z2;
        androidx.compose.runtime.b bVarI = aVar.i(-1269849292);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.A(this) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = h.g(androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), c68.a(R.color.background_type1_secondary, bVarI), zk40.a), 20.0f, 32.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (z) {
                bVarI.N(1785938089);
                aVar2 = aVar4;
                bVar = bVar2;
                i2 = 0;
                aVar3 = aVar5;
                dVar = dVar2;
                h9n.a(erz.a(R.drawable.successful_registration, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 48, 124);
                iib0.a(aVar2, 24.0f, bVarI, false);
            } else {
                aVar2 = aVar4;
                bVar = bVar2;
                i2 = 0;
                dVar = dVar2;
                aVar3 = aVar5;
                bVarI.N(1786179300);
                bVarI.X(false);
            }
            lkf0.d(cb40.a(z ? R.string.page_login__registration_successful : R.string.identity_verification__id_verification_has_failed, new Object[i2], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 0, 0, 130042);
            lkf0.d(str, h.j(aVar2, 0.0f, 24.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), mla.m(20.0f, bVarI), 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, (i3 & 14) | 48, 0, 127992);
            if (StringsKt.U(str2)) {
                bVarI.N(1787301252);
                bVarI.X(false);
            } else {
                bVarI.N(1787145570);
                ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(ejb0.a)).f));
                m0((i3 & 112) | ((i3 >> 6) & 896), bVarI, null, str2);
                bVarI.X(false);
            }
            androidx.compose.ui.d dVarJ = h.j(j.g(c9j.c(aVar2, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "register__ftd_btn"), 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
            boolean zA = bVarI.A(this);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new bxu(this, 2);
                bVarI.r(objY);
            }
            xya.a(dVarJ, false, str3, null, null, null, null, null, null, (Function0) objY, bVarI, i3 & 896, 506);
            androidx.compose.ui.d dVarJ2 = h.j(j.i(j.g(aVar2, 1.0f), 44.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean zA2 = bVarI.A(this);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                z2 = true;
                objY2 = new cxu(this, 1 == true ? 1 : 0);
                bVarI.r(objY2);
            } else {
                z2 = true;
            }
            androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(dVarJ2, false, null, null, (Function0) objY2, 15);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarD);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            lkf0.d(cb40.a(z ? R.string.page_login__explore_sportybet : R.string.page_login__submit_later, new Object[0], bVarI), null, c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130042);
            bVarI = bVarI;
            bVarI.X(z2);
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, z, i) { // from class: qak0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.n0(iA, (a) obj, this.b, this.c, this.d, this.e);
                    return Unit.a;
                }
            };
        }
    }

    public final void o0(final String str, final String str2, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-513714876);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(this) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_type1_secondary, bVarI), zk40.a);
            qyd0 qyd0Var = ejb0.a;
            androidx.compose.ui.d dVarI = h.i(dVarB, ((cjb0) bVarI.O(qyd0Var)).g, ((cjb0) bVarI.O(qyd0Var)).i, ((cjb0) bVarI.O(qyd0Var)).g, ((cjb0) bVarI.O(qyd0Var)).h);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            h9n.a(erz.a(R.drawable.successful_registration, 0, bVarI), null, j.r(aVar2, 120.0f), null, null, 0.0f, null, bVarI, 432, 120);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            String strA = cb40.a(R.string.page_login__registration_successful, new Object[0], bVarI);
            long jA = c68.a(R.color.text_type1_primary, bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(strA, null, jA, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).e, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar2, 20.0f));
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_register_success_content, new Object[]{str}, bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).l, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar2, 20.0f));
            d160 d160VarA = b160.a(new kw0.i(((cjb0) bVarI.O(qyd0Var)).c, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            mw90.a("https://s.sporty.net/cms/lucky_wheel_no_price_0d8b365009.png", null, j.r(aVar2, 16.0f), null, null, null, null, bVarI, 438, 2040);
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_register_success_gift, new Object[]{str}, bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).l, bVarI, 0, 0, 131066);
            szg.a(bVarI, true, aVar2, 20.0f, bVarI);
            if (StringsKt.U(str2)) {
                bVarI.N(2002217320);
                bVarI.X(false);
            } else {
                bVarI.N(2002075092);
                m0((i2 & 112) | ((i2 >> 6) & 896), bVarI, null, str2);
                iib0.a(aVar2, 20.0f, bVarI, false);
            }
            xya.a(c9j.c(j.g(aVar2, 1.0f), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "register__ftd_btn"), false, cb40.a(R.string.world_cup_mission__wc_pass_register_success_primary_cta, new Object[]{str}, bVarI), null, sya.c, null, null, null, null, function0, bVarI, (i2 << 21) & 1879048192, 490);
            ty0.a(bVarI, j.i(aVar2, 16.0f));
            ddd0.a(j.g(aVar2, 1.0f), false, null, null, null, false, null, qdf0.c, function1, i2a.a, bVarI, 805306374 | ((i2 << 15) & 234881024), WebSocketProtocol.PAYLOAD_SHORT);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, function0, function1, i) { // from class: rak0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.o0(this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-1156890724, new oj30(this), true));
        return composeView;
    }
}
