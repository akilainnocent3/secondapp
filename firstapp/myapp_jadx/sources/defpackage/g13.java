package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.Handshake;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g13 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g13(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = BetSlipFooter.j0;
                ((BetSlipFooter) obj).k();
                return Unit.a;
            case 1:
                Function0 function0 = (Function0) obj;
                Handshake.Companion companion = Handshake.INSTANCE;
                try {
                    return (List) function0.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return m2g.a;
                }
            case 2:
                return (mjz) ((nkz) obj).a.invoke();
            case 3:
                fid0 fid0Var = ((mw70) obj).a;
                return new u8z(fid0Var.G, fid0Var.H, new ArrayList(), false);
            default:
                ((Function1) obj).invoke(v9k0.e.a);
                return Unit.a;
        }
    }
}
