package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class od40 {
    public static final void a(final int i, a aVar, d dVar, Function0 function0) {
        final d dVar2;
        final Function0 function1;
        function0.getClass();
        b bVarI = aVar.i(-63707097);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i | (bVarI.M(dVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            dVar2 = dVar;
            function1 = function0;
            c6n.a(function1, c9j.c(j.r(h.j(dVar, 0.0f, 0.0f, 14.0f, 14.0f, 3), 30.0f), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "recap__download_btn"), false, null, null, cl9.a, bVarI, (i2 & 14) | 1572864, 60);
        } else {
            dVar2 = dVar;
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, function1) { // from class: nd40
                public final /* synthetic */ Function0 a;
                public final /* synthetic */ d b;

                {
                    this.a = function1;
                    this.b = dVar2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    od40.a(qj40.a(1), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }
}
