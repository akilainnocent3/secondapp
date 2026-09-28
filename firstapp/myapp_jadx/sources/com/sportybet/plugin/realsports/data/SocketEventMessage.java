package com.sportybet.plugin.realsports.data;

import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import defpackage.b3;
import defpackage.itf0;
import defpackage.ruw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class SocketEventMessage {
    public boolean canLiveBet;
    public String eventId;
    public int eventStatus;
    public JSONObject jsonObject;
    public String sportId;
    public String topic;
    public String tournamentCategoryId;
    public String tournamentCategoryName;
    public String tournamentId;
    public String tournamentName;

    public static SocketEventMessage create(String str) {
        try {
            SocketEventMessage socketEventMessage = new SocketEventMessage();
            JSONObject jSONObject = new JSONObject(str);
            socketEventMessage.jsonObject = jSONObject;
            String strOptString = jSONObject.optString("topic");
            socketEventMessage.topic = strOptString;
            if (!TextUtils.isEmpty(strOptString)) {
                String[] strArrSplit = socketEventMessage.topic.split("\\^");
                socketEventMessage.sportId = strArrSplit[0];
                if ("sr:sport:202120001".equals("sr:sport:" + socketEventMessage.sportId)) {
                    socketEventMessage.tournamentCategoryId = "sv:category:" + strArrSplit[1];
                } else {
                    socketEventMessage.tournamentCategoryId = "sr:category:" + strArrSplit[1];
                }
                socketEventMessage.tournamentId = strArrSplit[2];
                socketEventMessage.eventId = strArrSplit[3];
            }
            socketEventMessage.tournamentName = socketEventMessage.jsonObject.getString("fixtureTournamentName");
            socketEventMessage.tournamentCategoryName = socketEventMessage.jsonObject.getString("fixtureSportCategoryName");
            socketEventMessage.eventStatus = socketEventMessage.jsonObject.getInt("eventStatus");
            socketEventMessage.canLiveBet = b3.I(socketEventMessage.jsonObject.getInt("eventStatus"), socketEventMessage.jsonObject.getLong("fixtureStartTime"));
            return socketEventMessage;
        } catch (Exception unused) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.n("Failed to parse event message: %s", str);
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocketEventMessage{jsonObject=");
        sb.append(this.jsonObject);
        sb.append(", topic='");
        sb.append(this.topic);
        sb.append("', sportId='");
        sb.append(this.sportId);
        sb.append("', eventId='");
        sb.append(this.eventId);
        sb.append("', tournamentCategoryId='");
        sb.append(this.tournamentCategoryId);
        sb.append("', tournamentCategoryName='");
        sb.append(this.tournamentCategoryName);
        sb.append("', tournamentId='");
        sb.append(this.tournamentId);
        sb.append("', tournamentName='");
        sb.append(this.tournamentName);
        sb.append("', eventStatus=");
        sb.append(this.eventStatus);
        sb.append(", canLiveBet=");
        return ruw.a(sb, this.canLiveBet, '}');
    }

    public static List<SocketEventMessage> create(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            SocketEventMessage socketEventMessageCreate = create(it.next());
            if (socketEventMessageCreate != null) {
                arrayList.add(socketEventMessageCreate);
            }
        }
        return arrayList;
    }
}
