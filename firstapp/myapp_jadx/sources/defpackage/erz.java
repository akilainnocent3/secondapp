package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class erz {
    /* JADX WARN: Code duplicated, block: B:130:0x036e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0371  */
    /* JADX WARN: Code duplicated, block: B:133:0x0374  */
    /* JADX WARN: Code duplicated, block: B:134:0x0377  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x03de  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:152:0x0401  */
    /* JADX WARN: Code duplicated, block: B:155:0x0411  */
    /* JADX WARN: Code duplicated, block: B:156:0x0414  */
    /* JADX WARN: Code duplicated, block: B:159:0x041a  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0226  */
    public static final crz a(int i, int i2, a aVar) {
        TypedValue typedValueB;
        int i3;
        long jB;
        int i4;
        int i5;
        char c;
        int i6;
        int i7;
        int iD;
        int i8;
        hn8 hn8VarC;
        int iD2;
        Shader shader;
        ya5 soa0Var;
        Shader shader2;
        ya5 soa0Var2;
        ya5 ya5Var;
        int i9;
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) aVar.O(AndroidCompositionLocals_androidKt.c);
        eh50 eh50Var = (eh50) aVar.O(AndroidCompositionLocals_androidKt.e);
        synchronized (eh50Var) {
            typedValueB = eh50Var.a.b(i);
            i3 = 1;
            if (typedValueB == null) {
                typedValueB = new TypedValue();
                resources.getValue(i, typedValueB, true);
                msw<TypedValue> mswVar = eh50Var.a;
                int iD3 = mswVar.d(i);
                Object[] objArr = mswVar.c;
                Object obj = objArr[iD3];
                mswVar.b[iD3] = i;
                objArr[iD3] = typedValueB;
            }
        }
        CharSequence charSequence = typedValueB.string;
        if (charSequence == null || !StringsKt.Q(charSequence, ".xml")) {
            aVar.N(-1771631096);
            boolean zM = aVar.M(context.getTheme()) | aVar.M(charSequence) | ((((i2 & 14) ^ 6) > 4 && aVar.d(i)) || (i2 & 6) == 4);
            Object objY = aVar.y();
            if (zM || objY == a.C0041a.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    objY = new t70(((BitmapDrawable) drawable).getBitmap());
                    aVar.r(objY);
                } catch (Exception e) {
                    throw new nh50("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            c8n c8nVar = (c8n) objY;
            se4 se4Var = new se4(c8nVar, (((long) c8nVar.b()) & 4294967295L) | (((long) c8nVar.c()) << 32));
            aVar.H();
            return se4Var;
        }
        aVar.N(-1771786530);
        Resources.Theme theme = context.getTheme();
        int i10 = typedValueB.changingConfigurations;
        sbn sbnVar = (sbn) aVar.O(AndroidCompositionLocals_androidKt.d);
        sbn.b bVar = new sbn.b(theme, i);
        WeakReference<sbn.a> weakReference = sbnVar.a.get(bVar);
        sbn.a aVar2 = weakReference != null ? weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.g(xml.getName(), "vector")) {
                hb5.a("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            zc0 zc0Var = new zc0(xml);
            TypedArray typedArrayF = g9h0.f(resources, theme, attributeSetAsAttributeSet, ad0.a);
            zc0Var.b(typedArrayF.getChangingConfigurations());
            boolean z = !g9h0.e(xml, "autoMirrored") ? false : typedArrayF.getBoolean(5, false);
            zc0Var.b(typedArrayF.getChangingConfigurations());
            float fA = zc0Var.a(typedArrayF, "viewportWidth", 7, 0.0f);
            float fA2 = zc0Var.a(typedArrayF, "viewportHeight", 8, 0.0f);
            if (fA <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (fA2 <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArrayF.getDimension(3, 0.0f);
            zc0Var.b(typedArrayF.getChangingConfigurations());
            float dimension2 = typedArrayF.getDimension(2, 0.0f);
            zc0Var.b(typedArrayF.getChangingConfigurations());
            if (typedArrayF.hasValue(1)) {
                TypedValue typedValue = new TypedValue();
                typedArrayF.getValue(1, typedValue);
                if (typedValue.type == 2) {
                    jB = j58.m;
                } else {
                    ColorStateList colorStateListB = g9h0.b(typedArrayF, xml, theme);
                    zc0Var.b(typedArrayF.getChangingConfigurations());
                    jB = colorStateListB != null ? r58.b(colorStateListB.getDefaultColor()) : j58.m;
                }
            } else {
                jB = j58.m;
            }
            long j = jB;
            int i11 = typedArrayF.getInt(6, -1);
            zc0Var.b(typedArrayF.getChangingConfigurations());
            if (i11 == -1) {
                i4 = 5;
            } else if (i11 == 3) {
                i4 = 3;
            } else if (i11 == 5) {
                i4 = 5;
            } else if (i11 != 9) {
                switch (i11) {
                    case 14:
                        i4 = 13;
                        break;
                    case 15:
                        i4 = 14;
                        break;
                    case 16:
                        i4 = 12;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
            } else {
                i4 = 9;
            }
            float f = dimension / resources.getDisplayMetrics().density;
            float f2 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayF.recycle();
            rbn.a aVar3 = new rbn.a(null, f, f2, fA, fA2, j, i4, z, 1);
            int i12 = 0;
            for (int i13 = 3; xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i13); i13 = 3) {
                XmlPullParser xmlPullParser = zc0Var.a;
                int i14 = i3;
                txz txzVar = zc0Var.c;
                XmlResourceParser xmlResourceParser = xml;
                int eventType = xmlPullParser.getEventType();
                int i15 = i10;
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            i5 = i12;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals(EventKeys.EVENT_GROUP)) {
                                    TypedArray typedArrayF2 = g9h0.f(resources, theme, attributeSetAsAttributeSet, ad0.b);
                                    zc0Var.b(typedArrayF2.getChangingConfigurations());
                                    float fA3 = zc0Var.a(typedArrayF2, "rotation", 5, 0.0f);
                                    float f3 = typedArrayF2.getFloat(1, 0.0f);
                                    zc0Var.b(typedArrayF2.getChangingConfigurations());
                                    float f4 = typedArrayF2.getFloat(2, 0.0f);
                                    zc0Var.b(typedArrayF2.getChangingConfigurations());
                                    float fA4 = zc0Var.a(typedArrayF2, "scaleX", 3, 1.0f);
                                    float fA5 = zc0Var.a(typedArrayF2, "scaleY", 4, 1.0f);
                                    float fA6 = zc0Var.a(typedArrayF2, "translateX", 6, 0.0f);
                                    float fA7 = zc0Var.a(typedArrayF2, "translateY", 7, 0.0f);
                                    String string = typedArrayF2.getString(0);
                                    zc0Var.b(typedArrayF2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayF2.recycle();
                                    m2g m2gVar = lwh0.a;
                                    if (aVar3.k) {
                                        wkn.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    aVar3.i.add(new rbn.a.C1046a(str, fA3, f3, f4, fA4, fA5, fA6, fA7, m2gVar, 512));
                                }
                            } else if (name.equals(AnalyticsParam.EVENT_PATH)) {
                                TypedArray typedArrayF3 = g9h0.f(resources, theme, attributeSetAsAttributeSet, ad0.c);
                                zc0Var.b(typedArrayF3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    hb5.a("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayF3.getString(0);
                                zc0Var.b(typedArrayF3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayF3.getString(2);
                                zc0Var.b(typedArrayF3.getChangingConfigurations());
                                List listA = string3 == null ? lwh0.a : txz.a(txzVar, string3);
                                hn8 hn8VarC2 = g9h0.c(typedArrayF3, zc0Var.a, theme, "fillColor", 1);
                                zc0Var.b(typedArrayF3.getChangingConfigurations());
                                float fA8 = zc0Var.a(typedArrayF3, "fillAlpha", 12, 1.0f);
                                int iD4 = g9h0.d(typedArrayF3, zc0Var.a, "strokeLineCap", 8, -1);
                                zc0Var.b(typedArrayF3.getChangingConfigurations());
                                if (iD4 != 0) {
                                    if (iD4 == 1) {
                                        i7 = 1;
                                    } else if (iD4 == 2) {
                                        i7 = 2;
                                    }
                                    iD = g9h0.d(typedArrayF3, zc0Var.a, "strokeLineJoin", 9, -1);
                                    zc0Var.b(typedArrayF3.getChangingConfigurations());
                                    if (iD != 0) {
                                        i8 = 0;
                                    } else if (iD != 1) {
                                        i8 = 2;
                                    } else {
                                        i8 = 1;
                                    }
                                    float fA9 = zc0Var.a(typedArrayF3, "strokeMiterLimit", 10, 1.0f);
                                    hn8VarC = g9h0.c(typedArrayF3, zc0Var.a, theme, "strokeColor", 3);
                                    zc0Var.b(typedArrayF3.getChangingConfigurations());
                                    float fA10 = zc0Var.a(typedArrayF3, "strokeAlpha", 11, 1.0f);
                                    float fA11 = zc0Var.a(typedArrayF3, "strokeWidth", 4, 1.0f);
                                    float fA12 = zc0Var.a(typedArrayF3, "trimPathEnd", 6, 1.0f);
                                    float fA13 = zc0Var.a(typedArrayF3, "trimPathOffset", 7, 0.0f);
                                    float fA14 = zc0Var.a(typedArrayF3, "trimPathStart", 5, 0.0f);
                                    iD2 = g9h0.d(typedArrayF3, zc0Var.a, "fillType", 13, 0);
                                    zc0Var.b(typedArrayF3.getChangingConfigurations());
                                    typedArrayF3.recycle();
                                    shader = hn8VarC2.a;
                                    if (shader == null && hn8VarC2.c == 0) {
                                        soa0Var = null;
                                    } else if (shader != null) {
                                        soa0Var = new za5(shader);
                                    } else {
                                        soa0Var = new soa0(r58.b(hn8VarC2.c));
                                    }
                                    shader2 = hn8VarC.a;
                                    if (shader2 != null && hn8VarC.c == 0) {
                                        ya5Var = null;
                                    } else {
                                        if (shader2 != null) {
                                            soa0Var2 = new za5(shader2);
                                        } else {
                                            soa0Var2 = new soa0(r58.b(hn8VarC.c));
                                        }
                                        ya5Var = soa0Var2;
                                    }
                                    if (iD2 == 0) {
                                        i9 = 0;
                                    } else {
                                        i9 = 1;
                                    }
                                    if (aVar3.k) {
                                        wkn.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((rbn.a.C1046a) rh6.a(1, aVar3.i)).j.add(new owh0(str2, listA, i9, soa0Var, fA8, ya5Var, fA10, fA11, i7, i8, fA9, fA14, fA12, fA13));
                                    c = '\t';
                                }
                                i7 = 0;
                                iD = g9h0.d(typedArrayF3, zc0Var.a, "strokeLineJoin", 9, -1);
                                zc0Var.b(typedArrayF3.getChangingConfigurations());
                                if (iD != 0) {
                                    i8 = 0;
                                } else if (iD != 1) {
                                    i8 = 2;
                                } else {
                                    i8 = 1;
                                }
                                float fA15 = zc0Var.a(typedArrayF3, "strokeMiterLimit", 10, 1.0f);
                                hn8VarC = g9h0.c(typedArrayF3, zc0Var.a, theme, "strokeColor", 3);
                                zc0Var.b(typedArrayF3.getChangingConfigurations());
                                float fA16 = zc0Var.a(typedArrayF3, "strokeAlpha", 11, 1.0f);
                                float fA17 = zc0Var.a(typedArrayF3, "strokeWidth", 4, 1.0f);
                                float fA18 = zc0Var.a(typedArrayF3, "trimPathEnd", 6, 1.0f);
                                float fA19 = zc0Var.a(typedArrayF3, "trimPathOffset", 7, 0.0f);
                                float fA110 = zc0Var.a(typedArrayF3, "trimPathStart", 5, 0.0f);
                                iD2 = g9h0.d(typedArrayF3, zc0Var.a, "fillType", 13, 0);
                                zc0Var.b(typedArrayF3.getChangingConfigurations());
                                typedArrayF3.recycle();
                                shader = hn8VarC2.a;
                                if (shader == null) {
                                    soa0Var = null;
                                } else if (shader != null) {
                                    soa0Var = new za5(shader);
                                } else {
                                    soa0Var = new soa0(r58.b(hn8VarC2.c));
                                }
                                shader2 = hn8VarC.a;
                                if (shader2 != null) {
                                    if (shader2 != null) {
                                        soa0Var2 = new za5(shader2);
                                    } else {
                                        soa0Var2 = new soa0(r58.b(hn8VarC.c));
                                    }
                                    ya5Var = soa0Var2;
                                } else {
                                    ya5Var = null;
                                }
                                if (iD2 == 0) {
                                    i9 = 0;
                                } else {
                                    i9 = 1;
                                }
                                if (aVar3.k) {
                                    wkn.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((rbn.a.C1046a) rh6.a(1, aVar3.i)).j.add(new owh0(str2, listA, i9, soa0Var, fA8, ya5Var, fA16, fA17, i7, i8, fA15, fA110, fA18, fA19));
                                c = '\t';
                            }
                        } else {
                            i5 = i12;
                            c = '\t';
                            if (name.equals("clip-path")) {
                                TypedArray typedArrayF4 = g9h0.f(resources, theme, attributeSetAsAttributeSet, ad0.d);
                                zc0Var.b(typedArrayF4.getChangingConfigurations());
                                String string4 = typedArrayF4.getString(0);
                                zc0Var.b(typedArrayF4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i6 = 1;
                                String string5 = typedArrayF4.getString(1);
                                zc0Var.b(typedArrayF4.getChangingConfigurations());
                                List listA2 = string5 == null ? lwh0.a : txz.a(txzVar, string5);
                                typedArrayF4.recycle();
                                if (aVar3.k) {
                                    wkn.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                aVar3.i.add(new rbn.a.C1046a(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, listA2, 512));
                                i5++;
                            }
                        }
                        i6 = 1;
                    } else {
                        i5 = i12;
                    }
                    i6 = 1;
                    c = '\t';
                } else if (eventType != i13) {
                    i5 = i12;
                    i6 = i14;
                    c = '\t';
                } else if (EventKeys.EVENT_GROUP.equals(xmlPullParser.getName())) {
                    int i16 = i12 + 1;
                    int i17 = 0;
                    while (i17 < i16) {
                        ArrayList<rbn.a.C1046a> arrayList = aVar3.i;
                        if (aVar3.k) {
                            wkn.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                        }
                        rbn.a.C1046a c1046aRemove = arrayList.remove(arrayList.size() - 1);
                        ((rbn.a.C1046a) rh6.a(i14, arrayList)).j.add(new kwh0(c1046aRemove.a, c1046aRemove.b, c1046aRemove.c, c1046aRemove.d, c1046aRemove.e, c1046aRemove.f, c1046aRemove.g, c1046aRemove.h, c1046aRemove.i, c1046aRemove.j));
                        i17++;
                        i14 = 1;
                    }
                    i6 = 1;
                    c = '\t';
                    i5 = 0;
                } else {
                    i5 = i12;
                    i6 = 1;
                    c = '\t';
                }
                xmlResourceParser.next();
                i3 = i6;
                xml = xmlResourceParser;
                i10 = i15;
                i12 = i5;
            }
            aVar2 = new sbn.a(aVar3.b(), i10 | zc0Var.b);
            sbnVar.a.put(bVar, new WeakReference<>(aVar2));
        }
        nwh0 nwh0VarC = ci50.c(aVar2.a, aVar);
        aVar.H();
        return nwh0VarC;
    }
}
