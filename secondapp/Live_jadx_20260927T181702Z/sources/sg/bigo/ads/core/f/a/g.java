package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<sg.bigo.ads.core.f.a.a.b> f134833a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final Node f134834b;

    public g(@NonNull Node node) {
        this.f134834b = node;
    }

    @NonNull
    public final List<n> a() {
        ArrayList arrayList = new ArrayList();
        List<Node> listC = sg.bigo.ads.core.f.a.c(this.f134834b, "Error");
        if (listC != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> b() {
        List<Node> listB = sg.bigo.ads.core.f.a.b(this.f134834b, "Impression", null, null);
        ArrayList arrayList = new ArrayList();
        if (listB != null) {
            Iterator<Node> it = listB.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> c() {
        List<Node> listC;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f134834b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (nodeA != null && (listC = sg.bigo.ads.core.f.a.c(nodeA, "Viewable")) != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> d() {
        List<Node> listC;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f134834b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (nodeA != null && (listC = sg.bigo.ads.core.f.a.c(nodeA, "NotViewable")) != null) {
            Iterator<Node> it = listC.iterator();
            while (it.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it.next());
                if (!TextUtils.isEmpty(strA)) {
                    arrayList.add(new n(strA));
                }
            }
        }
        return arrayList;
    }

    public final int e() {
        String strB = sg.bigo.ads.core.f.a.b(this.f134834b, "Expires");
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
            return 0;
        }
        try {
            return Integer.parseInt(strB);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @NonNull
    public final String f() {
        String strB = sg.bigo.ads.core.f.a.b(this.f134834b, "AdTitle");
        return strB == null ? "" : strB;
    }

    @NonNull
    public final String g() {
        String strB = sg.bigo.ads.core.f.a.b(this.f134834b, "Description");
        return strB == null ? "" : strB;
    }

    @NonNull
    public final String h() {
        String strB = sg.bigo.ads.core.f.a.b(this.f134834b, "AdSystem");
        return strB == null ? "" : strB;
    }

    public final int i() {
        List<Node> listB;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f134834b, "Extensions", null, null);
        if (nodeA != null && (listB = sg.bigo.ads.core.f.a.b(nodeA, "Extension", null, null)) != null && !listB.isEmpty()) {
            Iterator<Node> it = listB.iterator();
            while (it.hasNext()) {
                String strB = sg.bigo.ads.core.f.a.b(it.next(), "Mute");
                if (sg.bigo.ads.common.utils.q.b((CharSequence) strB)) {
                    return sg.bigo.ads.common.utils.q.a(strB, -1);
                }
            }
        }
        return -1;
    }

    @Nullable
    public final List<sg.bigo.ads.core.c.a> j() {
        List<Node> listB;
        List<Node> listC;
        Node namedItem;
        NodeList childNodes;
        String strTrim;
        NodeList childNodes2;
        String nodeValue;
        String nodeValue2;
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f134834b, "Extensions", null, null);
        if (nodeA == null || (listB = sg.bigo.ads.core.f.a.b(nodeA, "Extension", null, null)) == null || listB.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Node> it = listB.iterator();
        while (it.hasNext()) {
            Node nodeA2 = sg.bigo.ads.core.f.a.a(it.next(), "AdVerifications");
            if (nodeA2 != null && (listC = sg.bigo.ads.core.f.a.c(nodeA2, "Verification")) != null && !listC.isEmpty()) {
                for (Node node : listC) {
                    NamedNodeMap attributes = node.getAttributes();
                    if (attributes != null && (namedItem = attributes.getNamedItem("vendor")) != null) {
                        sg.bigo.ads.core.c.a aVar = new sg.bigo.ads.core.c.a();
                        aVar.f134594b = namedItem.getNodeValue();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(CampaignEx.KEY_OMID);
                        Node nodeA3 = sg.bigo.ads.core.f.a.a(node, "JavaScriptResource", "apiFramework", arrayList2);
                        if (nodeA3 != null && (childNodes = nodeA3.getChildNodes()) != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= childNodes.getLength()) {
                                    strTrim = "";
                                    break;
                                }
                                Node nodeItem = childNodes.item(i10);
                                if (nodeItem != null && (nodeValue2 = nodeItem.getNodeValue()) != null && nodeValue2.trim().startsWith("http")) {
                                    strTrim = nodeValue2.trim();
                                    break;
                                }
                                i10++;
                            }
                            if (!strTrim.isEmpty()) {
                                aVar.f134593a = strTrim;
                                Node nodeA4 = sg.bigo.ads.core.f.a.a(node, "VerificationParameters");
                                if (nodeA4 != null && (childNodes2 = nodeA4.getChildNodes()) != null) {
                                    for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                                        Node nodeItem2 = childNodes2.item(i11);
                                        if (nodeItem2 != null && (nodeValue = nodeItem2.getNodeValue()) != null && nodeValue.trim().length() > 0) {
                                            aVar.f134595c = nodeValue.trim();
                                            break;
                                        }
                                    }
                                }
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<h> a(String... strArr) {
        List<Node> listC;
        ArrayList arrayList = new ArrayList();
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f134834b, "Creatives");
        if (nodeA != null && (listC = sg.bigo.ads.core.f.a.c(nodeA, "Creative")) != null) {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            linkedHashSet.add("Linear");
            if (!sg.bigo.ads.common.utils.k.a(strArr)) {
                linkedHashSet.addAll(Arrays.asList(strArr));
            }
            for (Node node : listC) {
                for (String str : linkedHashSet) {
                    Node nodeA2 = sg.bigo.ads.core.f.a.a(node, str);
                    if (nodeA2 != null) {
                        str.getClass();
                        if (str.equals("Linear")) {
                            arrayList.add(new h(nodeA2));
                        } else if (str.equals("CompanionAds")) {
                            this.f134833a.add(new sg.bigo.ads.core.f.a.a.a.b(nodeA2));
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
