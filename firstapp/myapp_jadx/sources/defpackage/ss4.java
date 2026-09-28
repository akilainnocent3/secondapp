package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class ss4 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final void a(final boolean z, final cnj cnjVar, final nt4 nt4Var, final Function1 function1, final Function1 function2, final Function0 function0, a aVar, final int i) {
        cnjVar.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1486540788);
        int i2 = i | (bVarI.b(z) ? 4 : 2) | (bVarI.d(cnjVar.ordinal()) ? 32 : 16) | (bVarI.M(nt4Var) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function0) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            if (!z || nt4Var == null) {
                bVarI.N(-129232970);
            } else {
                bVarI.N(-128500006);
                Object objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new qs4();
                    bVarI.r(objY);
                }
                Function1 function3 = (Function1) objY;
                int i3 = ((i2 >> 6) & 14) | 196608 | (i2 & 112);
                int i4 = i2 >> 3;
                ps4.a(nt4Var, cnjVar, function1, function2, function0, function3, bVarI, i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, cnjVar, nt4Var, function1, function2, function0, i) { // from class: rs4
                public final /* synthetic */ boolean a;
                public final /* synthetic */ cnj b;
                public final /* synthetic */ nt4 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ss4.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(Function0 function0, a aVar, final int i) {
        final Function0 function1;
        function0.getClass();
        b bVarI = aVar.i(341506491);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            bzg0.b(cb40.a(R.string.bet_history__how_to_play_remix_bet, new Object[0], bVarI), kotlin.collections.b.k(new ezg0(cb40.a(R.string.bet_history__remix_bet_tutorial_img_1, new Object[0], bVarI), cb40.a(R.string.bet_history__remix_bet_hint_text, new Object[0], bVarI)), new ezg0(cb40.a(R.string.bet_history__remix_bet_tutorial_img_2, new Object[0], bVarI), cb40.a(R.string.bet_history__remix_bet_hint_text_2, new Object[0], bVarI))), function1, null, "remix_bet_tutorial", "bet_history__remixbet_feature_hint", 0.0f, bVarI, 1769472 | ((i2 << 6) & 896), 152);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function1) { // from class: v450
                public final /* synthetic */ Function0 a;

                {
                    this.a = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ss4.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
