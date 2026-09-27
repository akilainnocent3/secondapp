package com.bytedance.sdk.openadsdk.core.ny.hww.hww;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ny.nod;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy {
    public static Set<nod> hww(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        nod nodVarHww;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(hv.vgm, "vendor");
                    String strTq = null;
                    String strTq2 = null;
                    String strTq3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(hv.vgm, "event"))) {
                                            break;
                                        } else {
                                            strTq3 = hv.tq(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(hv.vgm, "apiFramework"))) {
                                            break;
                                        } else {
                                            strTq = hv.tq(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strTq2 = hv.tq(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strTq) && (nodVarHww = nod.hww(strTq, attributeValue, strTq2, strTq3)) != null) {
                            hashSet.add(nodVarHww);
                        }
                    }
                } else {
                    hv.hww(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
