package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.sportybet.android.gp.tz.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class exd0 {
    public final int a;
    public final rx80 b;
    public final int[][] c;
    public final rx80[] d;
    public final cxd0 e;
    public final cxd0 f;
    public final cxd0 g;
    public final cxd0 h;

    public static final class a {
        public int a;
        public rx80 b;
        public int[][] c;
        public rx80[] d;
        public cxd0 e;
        public cxd0 f;
        public cxd0 g;
        public cxd0 h;

        public a(rx80 rx80Var) {
            b();
            a(StateSet.WILD_CARD, rx80Var);
        }

        public final void a(int[] iArr, rx80 rx80Var) {
            int i = this.a;
            if (i == 0 || iArr.length == 0) {
                this.b = rx80Var;
            }
            int[][] iArr2 = this.c;
            if (i >= iArr2.length) {
                int i2 = i + 10;
                int[][] iArr3 = new int[i2][];
                System.arraycopy(iArr2, 0, iArr3, 0, i);
                this.c = iArr3;
                rx80[] rx80VarArr = new rx80[i2];
                System.arraycopy(this.d, 0, rx80VarArr, 0, i);
                this.d = rx80VarArr;
            }
            int[][] iArr4 = this.c;
            int i3 = this.a;
            iArr4[i3] = iArr;
            this.d[i3] = rx80Var;
            this.a = i3 + 1;
        }

        public final void b() {
            this.b = new rx80();
            this.c = new int[10][];
            this.d = new rx80[10];
        }
    }

    public exd0(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
    }

    public static exd0 a(int i, Context context, TypedArray typedArray) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        a aVar = new a();
        aVar.b();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    d(aVar, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                if (aVar.a == 0) {
                    return null;
                }
                return new exd0(aVar);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            aVar.b();
        }
    }

    public static void d(a aVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = pk30.K;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                rx80 rx80VarA = rx80.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                aVar.a(StateSet.trimStateSet(iArr2, i), rx80VarA);
            }
        }
    }

    public final rx80 b() {
        rx80 rx80Var = this.b;
        cxd0 cxd0Var = this.h;
        cxd0 cxd0Var2 = this.g;
        cxd0 cxd0Var3 = this.f;
        cxd0 cxd0Var4 = this.e;
        if (cxd0Var4 == null && cxd0Var3 == null && cxd0Var2 == null && cxd0Var == null) {
            return rx80Var;
        }
        rx80.a aVarH = rx80Var.h();
        if (cxd0Var4 != null) {
            aVarH.e = cxd0Var4.b;
        }
        if (cxd0Var3 != null) {
            aVarH.f = cxd0Var3.b;
        }
        if (cxd0Var2 != null) {
            aVarH.h = cxd0Var2.b;
        }
        if (cxd0Var != null) {
            aVarH.g = cxd0Var.b;
        }
        return aVarH.a();
    }

    public final boolean c() {
        cxd0 cxd0Var;
        cxd0 cxd0Var2;
        cxd0 cxd0Var3;
        cxd0 cxd0Var4;
        return this.a > 1 || ((cxd0Var = this.e) != null && cxd0Var.a > 1) || (((cxd0Var2 = this.f) != null && cxd0Var2.a > 1) || (((cxd0Var3 = this.g) != null && cxd0Var3.a > 1) || ((cxd0Var4 = this.h) != null && cxd0Var4.a > 1)));
    }
}
