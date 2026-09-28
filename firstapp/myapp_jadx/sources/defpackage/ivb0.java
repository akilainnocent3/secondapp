package defpackage;

import androidx.fragment.app.Fragment;
import com.sportybet.android.globalpay.kyc.za.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ivb0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ ivb0(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((q1c0) fragment).J1());
            default:
                a aVar = (a) fragment;
                a.InterfaceC0227a interfaceC0227a = aVar.a;
                if (interfaceC0227a != null) {
                    interfaceC0227a.a(wae.HOME);
                }
                aVar.dismiss();
                return Unit.a;
        }
    }
}
