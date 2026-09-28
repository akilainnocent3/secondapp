package defpackage;

import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                s9 s9Var = (s9) obj;
                String string = s9Var.O.B.getText() != null ? s9Var.O.B.getText().toString() : "";
                aa aaVar = s9Var.D;
                aaVar.getClass();
                string.getClass();
                ej5.c(o8i0.d(aaVar), null, null, new z9(aaVar, string, null), 3);
                return Unit.a;
            case 1:
                return new mur((Function1) ((ytw) obj).getValue());
            case 2:
                return Integer.valueOf(((ngw) obj).a().getColor(R.color.text_type2_tertiary));
            default:
                return hu40.a((OtpData.Register) ((ew40) obj).B1());
        }
    }
}
