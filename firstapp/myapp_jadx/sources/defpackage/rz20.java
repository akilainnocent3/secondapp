package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class rz20 {
    public static final void a(final int i, a aVar, final String str, final Function0 function0, final boolean z) {
        function0.getClass();
        b bVarI = aVar.i(-986738103);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            String strA = cb40.a(R.string.wap_profile__email, new Object[0], bVarI);
            nz20[] nz20VarArr = nz20.a;
            i130.a(null, strA, z, 0L, "email_section", function0, pp8.b(-106347645, new gaj() { // from class: pz20
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i3;
                    int i4;
                    e160 e160Var = (e160) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e160Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(e160Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar3 = d.a.b;
                        d dVarA = e160Var.a(2.0f, aVar3, true);
                        String strA2 = str;
                        int length = strA2.length();
                        boolean z2 = z;
                        if (length == 0 || z2) {
                            aVar2.N(1483287978);
                            strA2 = cb40.a(R.string.wap_profile__verified_now, new Object[0], aVar2);
                            aVar2.H();
                        } else {
                            aVar2.N(879134824);
                            aVar2.H();
                        }
                        imf0 imf0VarL = mla.l(R.style.B1_R, aVar2);
                        if (z2) {
                            i3 = 1483486595;
                            i4 = R.color.text_brand_sub_primary_d_base;
                        } else {
                            i3 = 1483583346;
                            i4 = R.color.text_secondary;
                        }
                        lkf0.d(strA2, dVarA, m7b.a(aVar2, i3, i4, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 2, false, 0, 0, null, imf0VarL, aVar2, 0, 384, 125944);
                        if (z2) {
                            aVar2.N(1484085887);
                            aVar2.H();
                        } else {
                            aVar2.N(1483787016);
                            ty0.a(aVar2, j.w(aVar3, 4.0f));
                            h6n.b(erz.a(R.drawable.ic__successful, 0, aVar2), "verified", null, c68.a(R.color.icon_brand_sub_primary_d_base, aVar2), aVar2, 48, 4);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 << 3) & 896) | 12804096 | ((i2 << 12) & 3670016), 9);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function0, z) { // from class: qz20
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = str;
                    this.b = z;
                    this.c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rz20.a(qj40.a(1), (a) obj, this.a, this.c, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
