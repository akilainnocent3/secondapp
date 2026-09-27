package hw;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k.j1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import org.xmlpull.v1.XmlPullParserException;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f88579c = "item";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f88580d = "icon";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f88581e = "title";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f88582f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlResourceParser f88583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f88584b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(x xVar) {
            this();
        }
    }

    public b(@l Context context, @j1 int i10) {
        m0.q(context, "context");
        this.f88584b = context;
        XmlResourceParser xml = context.getResources().getXml(i10);
        m0.h(xml, "context.resources.getXml(res)");
        this.f88583a = xml;
    }

    public final hw.a a(XmlResourceParser xmlResourceParser) throws Throwable {
        int attributeCount = xmlResourceParser.getAttributeCount();
        String attributeValue = null;
        Drawable drawable = null;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            if (attributeName != null) {
                int iHashCode = attributeName.hashCode();
                if (iHashCode != 3226745) {
                    if (iHashCode == 110371416 && attributeName.equals("title")) {
                        try {
                            attributeValue = this.f88584b.getString(xmlResourceParser.getAttributeResourceValue(i10, 0));
                        } catch (Resources.NotFoundException unused) {
                            attributeValue = xmlResourceParser.getAttributeValue(i10);
                        }
                    }
                } else if (attributeName.equals("icon")) {
                    drawable = f1.d.getDrawable(this.f88584b, xmlResourceParser.getAttributeResourceValue(i10, 0));
                }
            }
        }
        if (drawable == null) {
            throw new Throwable("Item icon can not be null!");
        }
        if (attributeValue == null) {
            attributeValue = "";
        }
        return new hw.a(attributeValue, drawable, null, 0, 4, null);
    }

    @l
    public final List<hw.a> b() throws XmlPullParserException, IOException {
        int next;
        ArrayList arrayList = new ArrayList();
        do {
            next = this.f88583a.next();
            if (next == 2 && m0.g(this.f88583a.getName(), "item")) {
                arrayList.add(a(this.f88583a));
            }
        } while (next != 1);
        return arrayList;
    }
}
