package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class seb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ seb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentManager supportFragmentManager;
        Object value;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj2;
                if (((Boolean) obj).booleanValue()) {
                    fgbVar.P1();
                } else {
                    fgbVar.D1 = false;
                    ((x5a0) fgbVar.m1).setValue(Boolean.FALSE);
                }
                e activity = fgbVar.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.a0();
                }
                break;
            case 1:
                OtpSelection otpSelection = (OtpSelection) obj;
                otpSelection.getClass();
                ((Function1) obj2).invoke(otpSelection);
                break;
            default:
                j7z.b bVar = (j7z.b) obj;
                bVar.getClass();
                wwd0 wwd0Var = ((ecf0) obj2).e;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, bVar, null, null, null, null, false, 2015)));
                break;
        }
        return Unit.a;
    }
}
