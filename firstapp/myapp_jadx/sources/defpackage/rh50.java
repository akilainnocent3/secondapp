package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class rh50 implements uih {
    public final kmh0 a;
    public final u2z b;

    public static final class a implements uih.a<kmh0> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            kmh0 kmh0Var = (kmh0) obj;
            if (Intrinsics.g(kmh0Var.c, "android.resource")) {
                return new rh50(kmh0Var, u2zVar);
            }
            return null;
        }
    }

    public rh50(kmh0 kmh0Var, u2z u2zVar) {
        this.a = kmh0Var;
        this.b = u2zVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) throws XmlPullParserException, IOException {
        Integer intOrNull;
        String mimeTypeFromExtension;
        Drawable bitmapDrawable;
        kmh0 kmh0Var = this.a;
        String str = kmh0Var.d;
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                String str2 = (String) CollectionsKt.d0(tl9.d(kmh0Var));
                if (str2 == null || (intOrNull = StringsKt.toIntOrNull(str2)) == null) {
                    rcp.a(kmh0Var, "Invalid android.resource URI: ");
                    return null;
                }
                int iIntValue = intOrNull.intValue();
                u2z u2zVar = this.b;
                Context context = u2zVar.a;
                Resources resources = str.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String string = typedValue.string.toString();
                if (StringsKt.U(string)) {
                    mimeTypeFromExtension = null;
                } else {
                    String strQ0 = StringsKt.q0('?', StringsKt.q0('#', string));
                    String strL0 = StringsKt.l0('.', StringsKt.l0('/', strQ0, strQ0), "");
                    if (StringsKt.U(strL0)) {
                        mimeTypeFromExtension = null;
                    } else {
                        String lowerCase = strL0.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        mimeTypeFromExtension = (String) hqv.a.get(lowerCase);
                        if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                if (!Intrinsics.g(mimeTypeFromExtension, "text/xml")) {
                    return new aqa0(new dqa0(new y740(tmy.c(resources.openRawResource(iIntValue, new TypedValue()))), u2zVar.f, new lh50(str, iIntValue)), mimeTypeFromExtension, bqc.c);
                }
                if (str.equals(context.getPackageName())) {
                    bitmapDrawable = r1b.a(context, iIntValue);
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal<TypedValue> threadLocal = th50.a;
                    Drawable drawable = resources.getDrawable(iIntValue, theme);
                    if (drawable == null) {
                        q1b.a(hce0.a(iIntValue, "Invalid resource ID: "));
                        return null;
                    }
                    bitmapDrawable = drawable;
                }
                Bitmap.Config[] configArr = vsh0.a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof hwh0);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), tdf.a(bitmapDrawable, (Bitmap.Config) q4h.b(u2zVar, abn.b), u2zVar.b, u2zVar.c, u2zVar.d == dm20.b));
                }
                return new y8n(zbn.b(bitmapDrawable), z, bqc.c);
            }
        }
        rcp.a(kmh0Var, "Invalid android.resource URI: ");
        return null;
    }
}
