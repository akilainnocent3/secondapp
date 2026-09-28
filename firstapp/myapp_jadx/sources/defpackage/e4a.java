package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e4a implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                float fC1 = tcfVar.C1(1.5f);
                List listK = b.k(new j58(j58.f), new j58(r58.d(4287466893L)));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 2.0f;
                hfs hfsVar = new hfs(listK, null, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat3))), 0);
                float f = fC1 / 2.0f;
                tcf.n0(tcfVar, r58.d(4280098077L), (yw90.c(tcfVar.d()) / 2.0f) - f, 0L, 0.0f, null, 124);
                tcf.F(tcfVar, hfsVar, (yw90.c(tcfVar.d()) / 2.0f) - f, 0L, new yae0(fC1, 0.0f, 0, 0, null, 30), 108);
                return Unit.a;
            default:
                Context context = (Context) obj;
                context.getClass();
                ListenableSpinner listenableSpinner = new ListenableSpinner(context);
                listenableSpinner.setBackgroundResource(R.drawable.bg_outcome_spinner_title);
                listenableSpinner.setPadding(0, 0, 0, 0);
                return listenableSpinner;
        }
    }
}
