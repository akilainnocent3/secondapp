package defpackage;

import android.text.TextUtils;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class ae20 implements Subscriber {
    public static ae20 c;
    public final HashMap b = new HashMap();
    public final ssw<e880> a = new ssw<>();

    public ae20() {
        new ssw();
        new ssw();
        new ssw();
        new ssw();
        new ssw();
        new ssw();
    }

    public final void a(Selection selection) {
        String str;
        String strE = selection.e();
        String strG = selection.g();
        Market market = selection.b;
        boolean zIsEmpty = TextUtils.isEmpty(market.specifier);
        Event event = selection.a;
        if (zIsEmpty) {
            str = event.eventId + "^" + market.id;
        } else {
            str = event.eventId + "^" + market.id + "^" + market.specifier;
        }
        HashMap map = this.b;
        if (map.containsKey(str)) {
            SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic(strE), this);
            SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic(strG), this);
            map.remove(str);
        }
    }

    @Override // com.sportybet.ntespm.socket.Subscriber
    public final void onReceive(String str) {
        HashMap map = this.b;
        try {
            String[] strArrSplit = str.split("\\^");
            if (strArrSplit.length < 5) {
                return;
            }
            for (String str2 : map.keySet()) {
                int length = strArrSplit.length;
                ssw<e880> sswVar = this.a;
                if (length >= 6) {
                    if (str2.equals(strArrSplit[3] + "^" + strArrSplit[5] + "^" + strArrSplit[6])) {
                        JSONArray jSONArray = new JSONArray(str);
                        e880 e880Var = new e880();
                        e880Var.b = jSONArray;
                        e880Var.a = (Selection) map.get(str2);
                        sswVar.m(e880Var);
                        return;
                    }
                }
                if (str2.equals(strArrSplit[3] + "^" + strArrSplit[5])) {
                    JSONArray jSONArray2 = new JSONArray(str);
                    e880 e880Var2 = new e880();
                    e880Var2.b = jSONArray2;
                    e880Var2.a = (Selection) map.get(str2);
                    sswVar.m(e880Var2);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
