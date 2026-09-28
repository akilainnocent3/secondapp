package com.sportybet.plugin.realsports.data;

import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import defpackage.itf0;
import defpackage.ruw;
import defpackage.sa8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class SocketMarketMessage {
    public String eventId;
    public String favourite;
    public boolean isLive;
    public JSONArray jsonArray;
    public String marketId;
    public String marketSpecifier;
    public String sportIdPostfix;
    public String topic;
    public String tournamentId;

    public static SocketMarketMessage create(String str) {
        try {
            SocketMarketMessage socketMarketMessage = new SocketMarketMessage();
            JSONArray jSONArray = new JSONArray(str);
            socketMarketMessage.jsonArray = jSONArray;
            socketMarketMessage.topic = jSONArray.getString(0);
            socketMarketMessage.favourite = socketMarketMessage.jsonArray.getString(5);
            socketMarketMessage.isLive = TextUtils.equals("1", socketMarketMessage.jsonArray.getString(1));
            String[] strArrSplit = socketMarketMessage.topic.split("\\^");
            socketMarketMessage.sportIdPostfix = strArrSplit[0];
            socketMarketMessage.tournamentId = strArrSplit[2];
            socketMarketMessage.eventId = strArrSplit[3];
            socketMarketMessage.marketId = strArrSplit[5];
            socketMarketMessage.marketSpecifier = strArrSplit[6];
            return socketMarketMessage;
        } catch (Exception unused) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.g("Failed to parse market message: %s", str);
            return null;
        }
    }

    public boolean isSameSport(String str) {
        return TextUtils.equals(sa8.a(str), this.sportIdPostfix);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocketMarketMessage{jsonArray=");
        sb.append(this.jsonArray);
        sb.append(", topic='");
        sb.append(this.topic);
        sb.append("', sportIdPostfix='");
        sb.append(this.sportIdPostfix);
        sb.append("', tournamentId='");
        sb.append(this.tournamentId);
        sb.append("', eventId='");
        sb.append(this.eventId);
        sb.append("', marketId='");
        sb.append(this.marketId);
        sb.append("', marketSpecifier='");
        sb.append(this.marketSpecifier);
        sb.append("', favourite='");
        sb.append(this.favourite);
        sb.append("', isLive=");
        return ruw.a(sb, this.isLive, '}');
    }

    public static List<SocketMarketMessage> create(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            SocketMarketMessage socketMarketMessageCreate = create(it.next());
            if (socketMarketMessageCreate != null) {
                arrayList.add(socketMarketMessageCreate);
            }
        }
        return arrayList;
    }
}
