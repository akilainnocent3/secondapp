package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class itu implements faj {
    public static String a(StringBuilder sb, Double d, char c) {
        sb.append(d);
        sb.append(c);
        return sb.toString();
    }

    @Override // defpackage.faj
    public Object apply(Object obj) {
        boolean z = QuickBetView.j1;
        return SocketMarketMessage.create((String) obj);
    }
}
