package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mb90 {
    public static final void a(final nb90.c cVar, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1281259197);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(cVar) : bVarI.A(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Integer num = cVar.b;
            Double dValueOf = num != null ? Double.valueOf(num.intValue()) : null;
            Integer num2 = cVar.a;
            ybs ybsVar = new ybs(dValueOf, num2 != null ? Double.valueOf(num2.intValue()) : null, cb40.a(R.string.page_limits__minute_short, new Object[0], bVarI), true, R.string.page_limits__daily_limits);
            Integer num3 = cVar.d;
            Double dValueOf2 = num3 != null ? Double.valueOf(num3.intValue()) : null;
            Integer num4 = cVar.c;
            uf00 uf00VarA = a4h.a(ybsVar, new ybs(dValueOf2, num4 != null ? Double.valueOf(num4.intValue()) : null, cb40.a(R.string.page_limits__minute_short, new Object[0], bVarI), true, R.string.page_limits__weekly_limits));
            Object[] objArr = {Integer.valueOf(cVar.e)};
            StringUiText stringUiText = vch0.a;
            z990.c(uf00VarA, a4h.a(new ResourceUiText(R.string.page_limits__it_is_not_possible_to_set_a_time_limit_below_vnum_minutes_tip, ay0.S(objArr)), new ResourceUiText(R.string.page_limits__any_activity_will_count_towards_your_time_limits_tip), new ResourceUiText(R.string.page_limits__if_you_reach_any_time_limit_tip)), function0, bVarI, (i2 << 3) & 896);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lb90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    mb90.a(cVar, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final qb90 qb90Var, final Function0 function0, a aVar, final int i) {
        function0.getClass();
        b bVarI = aVar.i(-1204542684);
        int i2 = i | 2 | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                qb90Var = (qb90) p8i0.a(jq40.a(qb90.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
            }
            int i3 = i2 & (-15);
            bVarI.Y();
            nb90 nb90Var = (nb90) wyh.c(qb90Var.w, bVarI, 0, 7).getValue();
            if (nb90Var instanceof nb90.b) {
                bVarI.N(2075659257);
                qcs.a(0, bVarI);
                bVarI.X(false);
            } else if (nb90Var instanceof nb90.a) {
                bVarI.N(2075661302);
                cdg.a(0, 1, bVarI, null);
                bVarI.X(false);
            } else {
                if (!(nb90Var instanceof nb90.c)) {
                    throw igf0.a(bVarI, 2075657224, false);
                }
                bVarI.N(2075663418);
                a((nb90.c) nb90Var, function0, bVarI, (i3 & 112) | 8);
                bVarI.X(false);
            }
            boolean zA = bVarI.A(qb90Var);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function0() { // from class: jb90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        qb90 qb90Var2 = qb90Var;
                        jvd0 jvd0Var = qb90Var2.v;
                        if (jvd0Var != null) {
                            jvd0Var.cancel((CancellationException) null);
                        }
                        qb90Var2.v = qb90Var2.y1(new pb90(qb90Var2, null));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            xfa.e((Function0) objY, bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: kb90
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    mb90.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
