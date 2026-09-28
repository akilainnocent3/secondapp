package defpackage;

import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class iua implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iua(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ConnectPlan.Companion companion = ConnectPlan.Companion;
                List<Certificate> listPeerCertificates = ((Handshake) obj).peerCertificates();
                ArrayList arrayList = new ArrayList(l48.r(listPeerCertificates, 10));
                for (Certificate certificate : listPeerCertificates) {
                    certificate.getClass();
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                int i2 = PreMatchEventActivity.a2;
                yrh0.k((PreMatchEventActivity) obj);
                return Unit.a;
        }
    }
}
