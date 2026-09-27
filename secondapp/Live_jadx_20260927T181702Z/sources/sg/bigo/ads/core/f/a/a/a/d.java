package sg.bigo.ads.core.f.a.a.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements sg.bigo.ads.core.f.a.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Node f134800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f134801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f134802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f134803d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f134806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sg.bigo.ads.core.f.a.a.a f134807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f134808i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<sg.bigo.ads.core.f.a.a.g> f134804e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f134805f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<sg.bigo.ads.core.f.a.a.c> f134809j = new ArrayList();

    public d(@NonNull Node node) {
        this.f134800a = node;
        this.f134801b = sg.bigo.ads.core.f.a.e(node, "id");
        this.f134802c = sg.bigo.ads.core.f.a.d(node, "width").intValue();
        this.f134803d = sg.bigo.ads.core.f.a.d(node, "height").intValue();
        g();
    }

    private void g() {
        List<Node> listB = sg.bigo.ads.core.f.a.b(this.f134800a, "StaticResource", null, null);
        if (!k.a((Collection) listB)) {
            for (Node node : listB) {
                this.f134804e.add(new g(sg.bigo.ads.core.f.a.e(node, "creativeType"), sg.bigo.ads.core.f.a.a(node)));
            }
        }
        List<Node> listB2 = sg.bigo.ads.core.f.a.b(this.f134800a, "IFrameResource", null, null);
        if (!k.a((Collection) listB2)) {
            Iterator<Node> it = listB2.iterator();
            while (it.hasNext()) {
                this.f134804e.add(new f(sg.bigo.ads.core.f.a.b(it.next())));
            }
        }
        List<Node> listB3 = sg.bigo.ads.core.f.a.b(this.f134800a, "HTMLResource", null, null);
        if (!k.a((Collection) listB3)) {
            Iterator<Node> it2 = listB3.iterator();
            while (it2.hasNext()) {
                this.f134804e.add(new e(sg.bigo.ads.core.f.a.b(it2.next())));
            }
        }
        Node nodeA = sg.bigo.ads.core.f.a.a(this.f134800a, "AltText", null, null);
        if (nodeA != null) {
            this.f134806g = sg.bigo.ads.core.f.a.b(nodeA);
        }
        Node nodeA2 = sg.bigo.ads.core.f.a.a(this.f134800a, "AdParameters", null, null);
        if (nodeA2 != null) {
            this.f134807h = new a(TextUtils.equals(sg.bigo.ads.core.f.a.e(nodeA2, "xmlEncoded"), "true"), sg.bigo.ads.core.f.a.b(nodeA2));
        }
        Node nodeA3 = sg.bigo.ads.core.f.a.a(this.f134800a, "CompanionClickThrough", null, null);
        if (nodeA3 != null) {
            this.f134808i = sg.bigo.ads.core.f.a.a(nodeA3);
        }
        List<Node> listB4 = sg.bigo.ads.core.f.a.b(this.f134800a, "CompanionClickTracking", null, null);
        if (!k.a((Collection) listB4)) {
            for (Node node2 : listB4) {
                this.f134809j.add(new c(sg.bigo.ads.core.f.a.e(node2, "id"), sg.bigo.ads.core.f.a.a(node2)));
            }
        }
        Node nodeA4 = sg.bigo.ads.core.f.a.a(this.f134800a, "TrackingEvents", null, null);
        if (nodeA4 != null) {
            List<Node> listB5 = sg.bigo.ads.core.f.a.b(nodeA4, "Tracking", "event", Arrays.asList("creativeView"));
            if (k.a((Collection) listB5)) {
                return;
            }
            Iterator<Node> it3 = listB5.iterator();
            while (it3.hasNext()) {
                String strA = sg.bigo.ads.core.f.a.a(it3.next());
                if (!TextUtils.isEmpty(strA)) {
                    this.f134805f.add(strA);
                }
            }
        }
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final int a() {
        return this.f134802c;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final int b() {
        return this.f134803d;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<sg.bigo.ads.core.f.a.a.g> c() {
        return this.f134804e;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final String d() {
        return this.f134808i;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<sg.bigo.ads.core.f.a.a.c> e() {
        return this.f134809j;
    }

    @Override // sg.bigo.ads.core.f.a.a.d
    public final List<String> f() {
        return this.f134805f;
    }
}
