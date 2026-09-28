package defpackage;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class smt implements qot {
    @Override // defpackage.qot
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        smt smtVar = LottieAnimationView.F;
        Matrix matrix = srh0.a;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            lgt.c("Unable to load composition.", th);
        } else {
            rzk.b("Unable to parse composition", th);
        }
    }
}
