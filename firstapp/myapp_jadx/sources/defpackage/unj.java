package defpackage;

import android.net.Uri;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.feature.notificationcenter.NotificationCenterActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class unj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ unj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String schemeSpecificPart;
        StringBuilder sb;
        String encodedQuery;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ukf0 ukf0Var = (ukf0) obj;
                ukf0Var.getClass();
                ((ytw) obj2).setValue(ukf0Var);
                return Unit.a;
            default:
                NotificationCenterActivity notificationCenterActivity = (NotificationCenterActivity) obj2;
                Uri uri = (Uri) obj;
                int i2 = NotificationCenterActivity.e;
                uri.getClass();
                f00 f00Var = vgb0.a;
                String scheme = uri.getScheme();
                if (scheme != null) {
                    int iHashCode = scheme.hashCode();
                    if (iHashCode != -969356564) {
                        if (iHashCode != 3213448) {
                            sb = new StringBuilder();
                            String lastPathSegment = uri.getLastPathSegment();
                            sb.append(lastPathSegment != null ? lastPathSegment : "");
                            encodedQuery = uri.getEncodedQuery();
                            if (encodedQuery != null) {
                                if (sb.length() > 0) {
                                    sb.append("?");
                                }
                                sb.append(encodedQuery);
                            }
                            schemeSpecificPart = sb.toString();
                        } else {
                            sb = new StringBuilder();
                            String lastPathSegment2 = uri.getLastPathSegment();
                            sb.append(lastPathSegment2 != null ? lastPathSegment2 : "");
                            encodedQuery = uri.getEncodedQuery();
                            if (encodedQuery != null) {
                                if (sb.length() > 0) {
                                    sb.append("?");
                                }
                                sb.append(encodedQuery);
                            }
                            schemeSpecificPart = sb.toString();
                        }
                    } else if (scheme.equals("sportybet")) {
                        StringBuilder sb2 = new StringBuilder();
                        String host = uri.getHost();
                        sb2.append(host != null ? host : "");
                        String encodedQuery2 = uri.getEncodedQuery();
                        if (encodedQuery2 != null) {
                            if (sb2.length() > 0) {
                                sb2.append("?");
                            }
                            sb2.append(encodedQuery2);
                        }
                        schemeSpecificPart = sb2.toString();
                    } else {
                        schemeSpecificPart = uri.getSchemeSpecificPart();
                    }
                } else {
                    schemeSpecificPart = uri.getSchemeSpecificPart();
                }
                if (schemeSpecificPart.length() == 0) {
                    schemeSpecificPart = null;
                }
                vgb0.c(AnalyticsEvent.NC_REDIRECT, jpu.b(new Pair("data", schemeSpecificPart)), false);
                azm azmVar = notificationCenterActivity.b;
                if (azmVar != null) {
                    azmVar.l(uri, null);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
        }
    }
}
