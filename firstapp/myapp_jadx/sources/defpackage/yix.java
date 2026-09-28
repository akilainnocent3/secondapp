package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.c;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class yix {
    public static final ThreadLocal<TypedValue> c = new ThreadLocal<>();
    public final Context a;
    public final wkx b;

    public static final class a {
        public static djx a(TypedValue typedValue, djx djxVar, djx djxVar2, String str, String str2) throws XmlPullParserException {
            if (djxVar == null || djxVar == djxVar2) {
                return djxVar == null ? djxVar2 : djxVar;
            }
            StringBuilder sbA = ux5.a("Type is ", str, " but found ", str2, ": ");
            sbA.append(typedValue.data);
            throw new XmlPullParserException(sbA.toString());
        }
    }

    public yix(Context context, wkx wkxVar) {
        context.getClass();
        wkxVar.getClass();
        this.a = context;
        this.b = wkxVar;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    public static ffx c(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        djx<Object> djxVarA;
        int iValueOf;
        ffx.a aVar = new ffx.a();
        aVar.b = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        Object objH = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith("java")) {
                try {
                    djxVarA = djx.b.a("j$".concat(string.substring(4)), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                    djxVarA = djx.b.a(string, resourcePackageName);
                }
            } else {
                djxVarA = djx.b.a(string, resourcePackageName);
            }
        } else {
            djxVarA = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            int i2 = typedValue.resourceId;
            djx.a aVar2 = djx.c;
            if (djxVarA == aVar2) {
                if (i2 != 0) {
                    iValueOf = Integer.valueOf(i2);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sb = new StringBuilder("unsupported value '");
                        sb.append((Object) typedValue.string);
                        String strB = djxVarA.b();
                        sb.append("' for ");
                        sb.append(strB);
                        sb.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sb.toString());
                    }
                    iValueOf = 0;
                }
                objH = iValueOf;
            } else if (i2 == 0) {
                djx<Object> djxVar = djx.o;
                if (djxVarA == djxVar) {
                    objH = typedArray.getString(1);
                } else {
                    int i3 = typedValue.type;
                    p15 p15Var = djx.l;
                    djx<Object> djxVar2 = djx.b;
                    dxh dxhVar = djx.i;
                    if (i3 == 3) {
                        String string2 = typedValue.string.toString();
                        if (djxVarA == null) {
                            string2.getClass();
                            try {
                                try {
                                    try {
                                        try {
                                            djxVar2.h(string2);
                                        } catch (IllegalArgumentException unused) {
                                            p15Var.h(string2);
                                            djxVar = p15Var;
                                            djxVar2 = djxVar;
                                            djxVarA = djxVar2;
                                            objH = djxVarA.h(string2);
                                            if (objH != null) {
                                                aVar.c = objH;
                                                aVar.d = true;
                                            }
                                            if (djxVarA != null) {
                                                aVar.a = djxVarA;
                                            }
                                            return aVar.a();
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        dxhVar.h(string2);
                                        djxVar = dxhVar;
                                        djxVar2 = djxVar;
                                        djxVarA = djxVar2;
                                        objH = djxVarA.h(string2);
                                        if (objH != null) {
                                            aVar.c = objH;
                                            aVar.d = true;
                                        }
                                        if (djxVarA != null) {
                                            aVar.a = djxVarA;
                                        }
                                        return aVar.a();
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    djxVar2 = djxVar;
                                }
                            } catch (IllegalArgumentException unused4) {
                                ekt ektVar = djx.f;
                                ektVar.h(string2);
                                djxVar = ektVar;
                                djxVar2 = djxVar;
                                djxVarA = djxVar2;
                                objH = djxVarA.h(string2);
                                if (objH != null) {
                                    aVar.c = objH;
                                    aVar.d = true;
                                }
                                if (djxVarA != null) {
                                    aVar.a = djxVarA;
                                }
                                return aVar.a();
                            }
                            djxVarA = djxVar2;
                        }
                        objH = djxVarA.h(string2);
                    } else if (i3 == 4) {
                        djxVarA = a.a(typedValue, djxVarA, dxhVar, string, "float");
                        objH = Float.valueOf(typedValue.getFloat());
                    } else if (i3 == 5) {
                        djxVarA = a.a(typedValue, djxVarA, djxVar2, string, "dimension");
                        objH = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i3 == 18) {
                        djxVarA = a.a(typedValue, djxVarA, p15Var, string, "boolean");
                        objH = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i3 < 16 || i3 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (djxVarA == dxhVar) {
                            djxVarA = a.a(typedValue, djxVarA, dxhVar, string, "float");
                            objH = Float.valueOf(typedValue.data);
                        } else {
                            djxVarA = a.a(typedValue, djxVarA, djxVar2, string, "integer");
                            objH = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            } else {
                if (djxVarA != null) {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    String strB2 = djxVarA.b();
                    sb2.append("' for ");
                    sb2.append(strB2);
                    sb2.append(". You must use a \"reference\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
                objH = Integer.valueOf(i2);
                djxVarA = aVar2;
            }
        }
        if (objH != null) {
            aVar.c = objH;
            aVar.d = true;
        }
        if (djxVarA != null) {
            aVar.a = djxVarA;
        }
        return aVar.a();
    }

    public final ygx a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        String strP;
        String strP2;
        Context context;
        int i2;
        Object obj;
        int i3 = i;
        String name = xmlResourceParser.getName();
        name.getClass();
        ygx ygxVarA = this.b.b(name).a();
        Context context2 = this.a;
        ygxVarA.k(context2, attributeSet);
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean zEquals = "argument".equals(name2);
                int[] iArr = bk30.b;
                if (zEquals) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    typedArrayObtainAttributes.getClass();
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    ffx ffxVarC = c(typedArrayObtainAttributes, resources, i3);
                    dhx dhxVar = ygxVarA.b;
                    dhxVar.getClass();
                    dhxVar.d.put(string, ffxVarC);
                    Unit unit = Unit.a;
                    typedArrayObtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, bk30.c);
                    typedArrayObtainAttributes2.getClass();
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(i4);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    String strP3 = null;
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        packageName.getClass();
                        strP = c.p(string2, "${applicationId}", packageName, false);
                    } else {
                        strP = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        strP2 = null;
                    } else {
                        String packageName2 = context2.getPackageName();
                        packageName2.getClass();
                        strP2 = c.p(string3, "${applicationId}", packageName2, false);
                        if (strP2.length() <= 0) {
                            hb5.a("The NavDeepLink cannot have an empty action.");
                            return null;
                        }
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        packageName3.getClass();
                        strP3 = c.p(string4, "${applicationId}", packageName3, false);
                    }
                    ygxVarA.b(new pgx(strP, strP2, strP3));
                    Unit unit2 = Unit.a;
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if ("action".equals(name2)) {
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, bk30.a, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        int i5 = i4;
                        afx afxVar = new afx(typedArrayObtainStyledAttributes.getResourceId(i4, 0));
                        afxVar.b = new zix(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                        o2g.a.getClass();
                        Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            context = context2;
                            if (next2 == i5) {
                                i2 = depth2;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            i2 = depth2;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                    typedArrayObtainAttributes3.getClass();
                                    String string5 = typedArrayObtainAttributes3.getString(0);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    ffx ffxVarC2 = c(typedArrayObtainAttributes3, resources, i3);
                                    boolean z = ffxVarC2.c;
                                    if (z && z && (obj = ffxVarC2.e) != null) {
                                        ffxVarC2.a.e(bundleA, string5, obj);
                                    }
                                    Unit unit3 = Unit.a;
                                    typedArrayObtainAttributes3.recycle();
                                }
                                i3 = i;
                            }
                            context2 = context;
                            depth2 = i2;
                            i5 = 1;
                        }
                        if (!bundleA.isEmpty()) {
                            afxVar.c = bundleA;
                        }
                        ygxVarA.l(resourceId, afxVar);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        i2 = depth2;
                        if ("include".equals(name2) && (ygxVarA instanceof fhx)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, ak30.c);
                            typedArrayObtainAttributes4.getClass();
                            ((fhx) ygxVarA).i.a(b(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            Unit unit4 = Unit.a;
                            typedArrayObtainAttributes4.recycle();
                        } else if (ygxVarA instanceof fhx) {
                            ((fhx) ygxVarA).i.a(a(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i3 = i;
                    context2 = context;
                    depth2 = i2;
                    i4 = 1;
                }
            }
        }
        return ygxVarA;
    }

    public final fhx b(int i) {
        int next;
        Resources resources = this.a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        attributeSetAsAttributeSet.getClass();
        ygx ygxVarA = a(resources, xml, attributeSetAsAttributeSet, i);
        if (ygxVarA instanceof fhx) {
            fhx fhxVar = (fhx) ygxVarA;
            xml.close();
            return fhxVar;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
