package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.LobbyItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class muj {
    public final psm a;
    public final ta8 b;
    public final lch c;

    public muj(psm psmVar, ta8 ta8Var, lch lchVar) {
        this.a = psmVar;
        this.b = ta8Var;
        this.c = lchVar;
    }

    public final ArrayList a(JSONArray jSONArray) throws JSONException {
        int i;
        ysm ysmVar = this.c.a;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("launch_rate");
            String string3 = jSONObject.getString("pic_url");
            String string4 = jSONObject.getString("launch_url");
            String string5 = jSONObject.getString("online_num_key");
            try {
                i = Integer.parseInt(string2);
            } catch (Exception unused) {
                i = 0;
            }
            boolean z = i > 0 && (i >= 100 || Math.abs(ysmVar.a().a.hashCode()) % 100 < i);
            boolean zH = TextUtils.isEmpty(string4) ? false : sh8.c().h(false, Uri.parse(string4));
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CONFIG);
            aVar.a(string + ", seed: " + (Math.abs(ysmVar.a().a.hashCode()) % 100) + ", rate: " + i + ", support: " + zH, new Object[0]);
            if (z && zH) {
                arrayList.add(new LobbyItem(string, string3, string4, string5, 0L));
            }
        }
        return arrayList;
    }
}
