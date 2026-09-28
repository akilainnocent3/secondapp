package com.twilio.voice;

import android.util.Base64;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
class AccessTokenParser {
    private static final Logger logger = Logger.getLogger(AccessTokenParser.class);
    final String twilioVoiceHomeRegionSpecifier = "twr";
    final int numberOfSegmentsInAccessToken = 3;
    final int numberOfSegmentsInridgeToken = 5;
    String rawToken = null;
    String homeRegion = null;

    public AccessTokenParser(String str) throws AccessTokenParseException {
        parse(str);
    }

    public void extractHeader(String str) {
        logger.i("JWT token HEADER: " + str);
        String[] strArrSplit = str.replace("{", "").replace("}", "").split(",");
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(":");
            map.put(strArrSplit2[0].replace("\"", ""), strArrSplit2[1].replace("\"", ""));
        }
        String str3 = (String) map.get("twr");
        this.homeRegion = str3;
        if (str3 == null || !str3.equalsIgnoreCase("null")) {
            return;
        }
        this.homeRegion = null;
    }

    public String getHomeRegion() {
        return this.homeRegion;
    }

    public void parse(String str) throws AccessTokenParseException {
        this.rawToken = str;
        if (str != null) {
            String[] strArrSplit = str.trim().split("\\.");
            if (strArrSplit.length != 3 && strArrSplit.length != 5) {
                throw new AccessTokenParseException("Access token must have 3 or 5 segments");
            }
            for (int i = 0; i < strArrSplit.length; i++) {
                strArrSplit[i] = new String(Base64.decode(strArrSplit[i].getBytes(), 8));
            }
            extractHeader(strArrSplit[0]);
        }
    }
}
