package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class zqa {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xcj.values().length];
            try {
                xcj xcjVar = xcj.CURRENT;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                xcj xcjVar2 = xcj.CURRENT;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                xcj xcjVar3 = xcj.CURRENT;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                xcj xcjVar4 = xcj.CURRENT;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final void a(final Function2 function2, final xcj xcjVar, final boolean z, final Function0 function0, final Function0 function1, androidx.compose.runtime.a aVar, final int i) {
        hsp hspVar;
        function2.getClass();
        b bVarI = aVar.i(1349966335);
        int i2 = i | (bVarI.A(function2) ? 4 : 2) | (bVarI.d(xcjVar == null ? -1 : xcjVar.ordinal()) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 112) == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                int i3 = xcjVar == null ? -1 : a.a[xcjVar.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    hspVar = new hsp(R.drawable.ic_security, R.string.page_payment__confirm_account_info, R.string.page_payment__confirm_account_info_content, R.string.page_payment__go_to_confirm);
                } else if (i3 == 2) {
                    hspVar = new hsp(R.drawable.img_kyc_unlock_balance, R.string.page_payment__unlock_your_balance, R.string.page_payment__unlock_your_balance_content, R.string.common_functions__unlock_balance);
                } else if (i3 == 3) {
                    hspVar = new hsp(R.drawable.img_kyc_protect_account, R.string.page_payment__protect_your_account, R.string.page_payment__protect_your_account_content, R.string.common_functions__unlock_balance);
                } else {
                    if (i3 != 4) {
                        uhc.a();
                        return;
                    }
                    hspVar = new hsp(R.drawable.img_kyc_start_bet, R.string.page_payment__verify_your_account_to_start_betting, R.string.page_payment__verify_your_account_to_start_betting_content, R.string.common_functions__unlock_balance);
                }
                objY = hspVar;
                bVarI.r(objY);
            }
            final hsp hspVar2 = (hsp) objY;
            Unit unit = Unit.a;
            boolean z3 = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new yqa(function2, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            u60.a(function0, new yle(z, z, 4), pp8.b(1445607574, new Function2() { // from class: uqa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarG = j.g(d.a.b, 1.0f);
                        fg6 fg6VarB = gg6.b(c68.a(R.color.background_general_primary, aVar2), 0L, aVar2, 24576, 14);
                        i060 i060VarC = j060.c(0.0f);
                        final hsp hspVar3 = hspVar2;
                        final Function0 function3 = function1;
                        rg6.a(dVarG, i060VarC, fg6VarB, null, null, pp8.b(-837168888, new gaj() { // from class: wqa
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar4 = d.a.b;
                                    d dVarI = h.i(j.g(aVar4, 1.0f), 30.0f, 36.0f, 30.0f, 32.0f);
                                    i78 i78VarA = g78.a(kw0.e, ht.a.n, aVar3, 54);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarI);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, i78VarA, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC, yka.a.d);
                                    final hsp hspVar4 = hspVar3;
                                    h9n.a(erz.a(hspVar4.a, 0, aVar3), null, null, null, null, 0.0f, null, aVar3, 48, 124);
                                    lkf0.d(cb40.a(hspVar4.b, new Object[0], aVar3), h.j(aVar4, 0.0f, 16.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar3), aVar3, 48, 0, 130040);
                                    lkf0.d(cb40.a(hspVar4.c, new Object[0], aVar3), h.j(aVar4, 0.0f, 24.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), mla.m(21.0f, aVar3), 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar3), aVar3, 48, 0, 127992);
                                    xya.b(j.i(h.j(j.g(aVar4, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13), 40.0f), false, null, null, null, 0.0f, null, function3, pp8.b(165616040, new gaj() { // from class: xqa
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                            a aVar6 = (a) obj7;
                                            int iIntValue3 = ((Integer) obj8).intValue();
                                            ((e160) obj6).getClass();
                                            if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                lkf0.d(cb40.a(hspVar4.d, new Object[0], aVar6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar6), aVar6, 0, 0, 131070);
                                            } else {
                                                aVar6.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar3), aVar3, 100663302, WebSocketProtocol.PAYLOAD_SHORT);
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 196614, 24);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 9) & 14) | 384, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(xcjVar, z, function0, function1, i) { // from class: vqa
                public final /* synthetic */ xcj b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zqa.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
