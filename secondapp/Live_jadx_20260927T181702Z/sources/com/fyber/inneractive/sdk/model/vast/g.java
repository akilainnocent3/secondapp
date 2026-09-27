package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w1;
import com.ironsource.C4497s;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45189a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f45193e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v f45195g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f45192d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45194f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f45196h = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f45190b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45191c = new ArrayList();

    public final void a(Node node) {
        w wVar;
        Node nodeD = w1.d(node, "AdVerifications");
        if (nodeD != null) {
            for (Node node2 : w1.c(nodeD, "Verification")) {
                com.fyber.inneractive.sdk.measurement.h hVar = null;
                if (node2 != null) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = new com.fyber.inneractive.sdk.measurement.h();
                    hVar2.f45112e = w1.b(node2, "vendor");
                    Node nodeD2 = w1.d(node2, "JavaScriptResource");
                    if (nodeD2 != null) {
                        hVar2.f45114g = true;
                        try {
                            hVar2.f45113f = w1.a(nodeD2);
                            hVar2.f45109b = w1.b(nodeD2, "apiFramework");
                            hVar2.f45108a = new URL(hVar2.f45113f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node nodeD3 = w1.d(node2, "TrackingEvents");
                    if (nodeD3 != null) {
                        for (Node node3 : w1.c(nodeD3, "Tracking")) {
                            if (node3 == null) {
                                wVar = null;
                            } else {
                                wVar = new w();
                                wVar.f45240a = w1.b(node3, "event");
                                wVar.f45241b = w1.a(node3);
                                wVar.f45242c = w1.b(node3, "offset");
                            }
                            if (node3 != null && wVar.f45240a.equalsIgnoreCase("verificationNotExecuted")) {
                                hVar2.a(x.EVENT_VERIFICATION_NOT_EXECUTED, wVar.f45241b);
                            }
                        }
                    }
                    Node nodeD4 = w1.d(node2, "VerificationParameters");
                    if (nodeD4 != null) {
                        hVar2.f45111d = w1.a(nodeD4);
                    }
                    hVar = hVar2;
                }
                if (hVar != null) {
                    IAlog.a("Verification Found - %s", hVar.toString());
                    this.f45192d.add(hVar);
                }
            }
        }
    }

    public void b(Node node) {
        Node nodeD;
        NodeList childNodes;
        NodeList childNodes2;
        m mVar;
        h hVar;
        w wVar;
        w wVar2;
        r rVar;
        g gVar = this;
        Node nodeD2 = w1.d(node, "AdSystem");
        if (nodeD2 != null) {
            w1.b(nodeD2, "version");
            w1.a(nodeD2);
        }
        Node nodeD3 = w1.d(node, "Error");
        if (nodeD3 != null) {
            String strA = w1.a(nodeD3);
            if (!TextUtils.isEmpty(strA)) {
                gVar.f45189a = strA;
            }
        }
        Iterator it = w1.c(node, "Impression").iterator();
        while (it.hasNext()) {
            String strA2 = w1.a((Node) it.next());
            if (!TextUtils.isEmpty(strA2)) {
                gVar.f45190b.add(strA2);
            }
        }
        Node nodeD4 = w1.d(node, "Creatives");
        if (nodeD4 != null) {
            Iterator it2 = w1.c(nodeD4, "Creative").iterator();
            while (it2.hasNext()) {
                Node node2 = (Node) it2.next();
                if (node2 == null) {
                    it2 = it2;
                    mVar = null;
                } else {
                    mVar = new m();
                    if (TextUtils.isEmpty(w1.b(node2, "AdID"))) {
                        w1.b(node2, com.ironsource.sdk.controller.f.b.f63771c);
                    }
                    w1.b(node2, "id");
                    w1.a(node2, "sequence");
                    Node nodeD5 = w1.d(node2, "Linear");
                    if (nodeD5 != null) {
                        q qVar = new q();
                        Node nodeD6 = w1.d(nodeD5, "MediaFiles");
                        if (nodeD6 != null) {
                            ArrayList arrayListC = w1.c(nodeD6, "MediaFile");
                            if (!arrayListC.isEmpty()) {
                                qVar.f45217a = new ArrayList();
                                for (Iterator it3 = arrayListC.iterator(); it3.hasNext(); it3 = it3) {
                                    Node node3 = (Node) it3.next();
                                    if (node3 == null) {
                                        rVar = null;
                                    } else {
                                        rVar = new r();
                                        rVar.f45222a = w1.b(node3, C4497s.f63496g);
                                        rVar.f45223b = w1.a(node3, "width");
                                        rVar.f45224c = w1.a(node3, "height");
                                        rVar.f45225d = w1.b(node3, "type");
                                        w1.b(node3, "id");
                                        rVar.f45227f = w1.b(node3, "apiFramework");
                                        rVar.f45226e = w1.a(node3, "bitrate");
                                        String strB = w1.b(node3, "maintainAspectRatio");
                                        if (!TextUtils.isEmpty(strB)) {
                                            try {
                                                Boolean.valueOf(strB);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        String strB2 = w1.b(node3, "scalable");
                                        if (!TextUtils.isEmpty(strB2)) {
                                            try {
                                                Boolean.valueOf(strB2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        rVar.f45228g = w1.a(node3);
                                    }
                                    if (rVar != null) {
                                        qVar.f45217a.add(rVar);
                                    }
                                }
                            }
                        }
                        Node nodeD7 = w1.d(nodeD5, "VideoClicks");
                        if (nodeD7 != null) {
                            qVar.f45219c = w1.a(w1.d(nodeD7, "ClickThrough"));
                            ArrayList arrayListC2 = w1.c(nodeD7, "ClickTracking");
                            if (!arrayListC2.isEmpty()) {
                                qVar.f45220d = new ArrayList();
                                Iterator it4 = arrayListC2.iterator();
                                while (it4.hasNext()) {
                                    String strA3 = w1.a((Node) it4.next());
                                    if (!TextUtils.isEmpty(strA3)) {
                                        qVar.f45220d.add(strA3);
                                    }
                                }
                            }
                        }
                        Node nodeD8 = w1.d(nodeD5, "TrackingEvents");
                        if (nodeD8 != null) {
                            ArrayList arrayListC3 = w1.c(nodeD8, "Tracking");
                            if (!arrayListC3.isEmpty()) {
                                qVar.f45218b = new ArrayList();
                                for (Iterator it5 = arrayListC3.iterator(); it5.hasNext(); it5 = it5) {
                                    Node node4 = (Node) it5.next();
                                    if (node4 == null) {
                                        wVar2 = null;
                                    } else {
                                        wVar2 = new w();
                                        wVar2.f45240a = w1.b(node4, "event");
                                        wVar2.f45241b = w1.a(node4);
                                        wVar2.f45242c = w1.b(node4, "offset");
                                    }
                                    if (wVar2 != null) {
                                        qVar.f45218b.add(wVar2);
                                    }
                                }
                            }
                        }
                        Node nodeD9 = w1.d(nodeD5, mg.b.e.f107451s);
                        if (nodeD9 != null) {
                            qVar.f45221e = w1.a(nodeD9);
                        }
                        mVar.f45210a = qVar;
                    }
                    Node nodeD10 = w1.d(node2, "CompanionAds");
                    if (nodeD10 != null) {
                        j jVar = new j();
                        String strB3 = w1.b(nodeD10, "required");
                        if (!"all".equalsIgnoreCase(strB3)) {
                            "none".equalsIgnoreCase(strB3);
                        }
                        ArrayList arrayListC4 = w1.c(nodeD10, "Companion");
                        jVar.f45207a.clear();
                        Iterator it6 = arrayListC4.iterator();
                        while (it6.hasNext()) {
                            Node node5 = (Node) it6.next();
                            if (node5 == null) {
                                it6 = it6;
                                hVar = null;
                            } else {
                                hVar = new h();
                                hVar.f45197a = w1.a(node5, "width");
                                hVar.f45198b = w1.a(node5, "height");
                                hVar.f45199c = w1.b(node5, "id");
                                w1.b(node5, "apiFramework");
                                w1.a(node5, "expandedWidth");
                                w1.a(node5, "expandedHeight");
                                Node nodeD11 = w1.d(node5, "StaticResource");
                                if (nodeD11 != null) {
                                    l lVar = new l();
                                    lVar.f45208a = w1.b(nodeD11, "creativeType");
                                    lVar.f45209b = w1.a(nodeD11);
                                    hVar.f45200d = lVar;
                                }
                                Node nodeD12 = w1.d(node5, "HTMLResource");
                                if (nodeD12 != null) {
                                    hVar.f45202f = w1.a(nodeD12);
                                }
                                Node nodeD13 = w1.d(node5, "IFrameResource");
                                if (nodeD13 != null) {
                                    hVar.f45201e = w1.a(nodeD13);
                                }
                                Node nodeD14 = w1.d(node5, "CompanionClickThrough");
                                if (nodeD14 != null) {
                                    hVar.f45203g = w1.a(nodeD14);
                                }
                                hVar.f45204h.clear();
                                ArrayList arrayListC5 = w1.c(node5, "CompanionClickTracking");
                                if (arrayListC5.size() > 0) {
                                    Iterator it7 = arrayListC5.iterator();
                                    while (it7.hasNext()) {
                                        String strA4 = w1.a((Node) it7.next());
                                        if (!TextUtils.isEmpty(strA4)) {
                                            hVar.f45204h.add(strA4);
                                        }
                                    }
                                }
                                hVar.f45206j.clear();
                                Node nodeD15 = w1.d(node5, "TrackingEvents");
                                if (nodeD15 != null) {
                                    ArrayList<Node> arrayListC6 = w1.c(nodeD15, "Tracking");
                                    if (!arrayListC6.isEmpty()) {
                                        for (Node node6 : arrayListC6) {
                                            if (node6 == null) {
                                                wVar = null;
                                            } else {
                                                wVar = new w();
                                                wVar.f45240a = w1.b(node6, "event");
                                                wVar.f45241b = w1.a(node6);
                                                wVar.f45242c = w1.b(node6, "offset");
                                            }
                                            if (wVar != null) {
                                                hVar.f45206j.add(wVar);
                                            }
                                        }
                                    }
                                }
                            }
                            if (hVar != null) {
                                jVar.f45207a.add(hVar);
                            }
                            it6 = it6;
                        }
                        mVar.f45211b = jVar;
                    }
                }
                gVar = this;
                if (mVar != null) {
                    gVar.f45191c.add(mVar);
                }
                it2 = it2;
            }
        }
        Node nodeD16 = w1.d(node, "Extensions");
        if (nodeD16 != null) {
            for (Node node7 : w1.c(nodeD16, "Extension")) {
                if ("AdVerifications".equalsIgnoreCase(w1.b(node7, "type"))) {
                    gVar.a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(w1.b(node7, "type"))) {
                    IAlog.a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node nodeD17 = w1.d(node7, "FMPCompanionAssets");
                    if (nodeD17 != null) {
                        o oVar = new o();
                        String strB4 = w1.b(nodeD17, "enableMultipleCompanions");
                        if ("false".equalsIgnoreCase(strB4) || "0".equals(strB4)) {
                            oVar.f45216d = false;
                        }
                        Node nodeD18 = w1.d(nodeD17, "Name");
                        if (nodeD18 != null) {
                            oVar.f45213a = w1.a(nodeD18);
                        }
                        Node nodeD19 = w1.d(nodeD17, "Description");
                        if (nodeD19 != null) {
                            w1.a(nodeD19);
                        }
                        oVar.f45214b.clear();
                        Node nodeD20 = w1.d(nodeD17, "Icons");
                        if (nodeD20 != null) {
                            Iterator it8 = w1.c(nodeD20, "Icon").iterator();
                            while (it8.hasNext()) {
                                oVar.f45214b.add(w1.a((Node) it8.next()));
                            }
                        }
                        Node nodeD21 = w1.d(nodeD17, "Rating");
                        if (nodeD21 != null) {
                            try {
                                Float.parseFloat(w1.a(nodeD21));
                            } catch (Exception unused3) {
                            }
                        }
                        Node nodeD22 = w1.d(nodeD17, "Screenshots");
                        if (nodeD22 != null) {
                            oVar.f45215c = new ArrayList();
                            Iterator it9 = w1.c(nodeD22, "Screenshot").iterator();
                            while (it9.hasNext()) {
                                String strA5 = w1.a((Node) it9.next());
                                if (!TextUtils.isEmpty(strA5)) {
                                    oVar.f45215c.add(strA5);
                                }
                            }
                        }
                        gVar.f45193e = oVar;
                    }
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(w1.b(node7, "type"))) {
                    Node nodeD23 = w1.d(node7, "DynamicVideoControlsURL");
                    n nVar = new n();
                    if (nodeD23 != null) {
                        nVar.f45212a = w1.a(nodeD23);
                    }
                    if (!TextUtils.isEmpty(nVar.f45212a)) {
                        gVar.f45196h.add(nVar);
                    }
                }
                if ("StorePromoAssets".equalsIgnoreCase(w1.b(node7, "type")) && (nodeD = w1.d(node7, "DTSPR")) != null) {
                    v vVar = new v();
                    Node nodeD24 = w1.d(nodeD, "DTSPNm");
                    if (nodeD24 != null) {
                        vVar.f45232b = w1.a(nodeD24);
                    }
                    Node nodeD25 = w1.d(nodeD, "DTSPTUrl");
                    if (nodeD25 != null) {
                        vVar.f45233c = w1.a(nodeD25);
                    }
                    Node nodeD26 = w1.d(nodeD, "DTSPPNm");
                    if (nodeD26 != null) {
                        vVar.f45239i = w1.a(nodeD26);
                    }
                    Node nodeD27 = w1.d(nodeD, "DTSPIap");
                    if (nodeD27 != null) {
                        vVar.f45234d = w1.a(nodeD27);
                    }
                    Node nodeD28 = w1.d(nodeD, "DTSPCads");
                    if (nodeD28 != null) {
                        vVar.f45235e = w1.a(nodeD28);
                    }
                    Node nodeD29 = w1.d(nodeD, "DTSPMedia");
                    if (nodeD29 != null && (childNodes2 = nodeD29.getChildNodes()) != null && childNodes2.getLength() != 0) {
                        for (int i10 = 0; i10 < childNodes2.getLength(); i10++) {
                            Node nodeItem = childNodes2.item(i10);
                            if (nodeItem != null) {
                                String nodeName = nodeItem.getNodeName();
                                String strA6 = w1.a(nodeItem);
                                if (!TextUtils.isEmpty(strA6)) {
                                    if ("DTSPScrn".equalsIgnoreCase(nodeName)) {
                                        vVar.f45236f.add(strA6);
                                    } else if ("DTSPVid".equalsIgnoreCase(nodeName)) {
                                        vVar.f45237g.add(strA6);
                                    } else if ("DTSPIcon".equalsIgnoreCase(nodeName)) {
                                        vVar.f45231a = strA6;
                                    }
                                }
                            }
                        }
                    }
                    Node nodeD30 = w1.d(nodeD, "DTSPMetadata");
                    if (nodeD30 != null && (childNodes = nodeD30.getChildNodes()) != null && childNodes.getLength() != 0) {
                        String strA7 = null;
                        String strA8 = null;
                        String strA9 = null;
                        for (int i11 = 0; i11 < childNodes.getLength(); i11++) {
                            Node nodeItem2 = childNodes.item(i11);
                            if (nodeItem2 != null) {
                                String nodeName2 = nodeItem2.getNodeName();
                                if ("DTSPLabel".equalsIgnoreCase(nodeName2)) {
                                    strA7 = w1.a(nodeItem2);
                                } else if ("DTSPRating".equalsIgnoreCase(nodeName2)) {
                                    strA8 = w1.a(nodeItem2);
                                } else if ("DTSPSize".equalsIgnoreCase(nodeName2)) {
                                    strA9 = w1.a(nodeItem2);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(strA7) && !TextUtils.isEmpty(strA8) && !TextUtils.isEmpty(strA9)) {
                            vVar.f45238h = new com.fyber.inneractive.sdk.flow.storepromo.model.d(strA8, strA7, strA9);
                        }
                    }
                    gVar.f45195g = vVar;
                }
            }
        }
        a(node);
    }
}
