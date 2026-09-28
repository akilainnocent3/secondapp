package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class h9h0 {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    public static final t9i a(int i) {
        if (i >= 0 && i < 150) {
            t9i t9iVar = t9i.b;
            return t9i.b;
        }
        if (150 <= i && i < 250) {
            t9i t9iVar2 = t9i.b;
            return t9i.c;
        }
        if (250 <= i && i < 350) {
            t9i t9iVar3 = t9i.b;
            return t9i.d;
        }
        if (350 <= i && i < 450) {
            t9i t9iVar4 = t9i.b;
            return t9i.e;
        }
        if (450 <= i && i < 550) {
            t9i t9iVar5 = t9i.b;
            return t9i.f;
        }
        if (550 <= i && i < 650) {
            t9i t9iVar6 = t9i.b;
            return t9i.i;
        }
        if (650 <= i && i < 750) {
            t9i t9iVar7 = t9i.b;
            return t9i.v;
        }
        if (750 <= i && i < 850) {
            t9i t9iVar8 = t9i.b;
            return t9i.w;
        }
        if (850 > i || i >= 1000) {
            t9i t9iVar9 = t9i.b;
            return t9i.e;
        }
        t9i t9iVar10 = t9i.b;
        return t9i.y;
    }

    public static long b(TypedArray typedArray, int i) {
        long j = j58.m;
        if (!typedArray.hasValue(i)) {
            return j;
        }
        if (typedArray.hasValue(i)) {
            return r58.b(typedArray.getColor(i, 0));
        }
        hb5.a("Attribute not defined in set.");
        return 0L;
    }

    public static final l8i c(TypedArray typedArray, int i) {
        p8i p8iVar;
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (typedArray.getValue(i, typedValue2) && typedValue2.type == 3) {
            CharSequence charSequence = typedValue2.string;
            if (Intrinsics.g(charSequence, "sans-serif")) {
                return new l8i(f8i.b);
            }
            if (Intrinsics.g(charSequence, "sans-serif-thin")) {
                return new l8i(f8i.b, t9i.z);
            }
            if (Intrinsics.g(charSequence, "sans-serif-light")) {
                return new l8i(f8i.b, t9i.A);
            }
            if (Intrinsics.g(charSequence, "sans-serif-medium")) {
                return new l8i(f8i.b, t9i.C);
            }
            if (Intrinsics.g(charSequence, "sans-serif-black")) {
                return new l8i(f8i.b, t9i.G);
            }
            if (Intrinsics.g(charSequence, "serif")) {
                return new l8i(f8i.c);
            }
            if (Intrinsics.g(charSequence, "cursive")) {
                return new l8i(f8i.e);
            }
            if (Intrinsics.g(charSequence, "monospace")) {
                return new l8i(f8i.d);
            }
            if (typedValue2.resourceId != 0) {
                CharSequence charSequence2 = typedValue2.string;
                charSequence2.getClass();
                if (StringsKt.i0(charSequence2, "res/font")) {
                    CharSequence charSequence3 = typedValue2.string;
                    charSequence3.getClass();
                    if (!StringsKt.Q(charSequence3, ".xml")) {
                        return new l8i(g8i.a(n8i.a(typedValue2.resourceId, null, 0, 14)));
                    }
                    Resources resources = typedArray.getResources();
                    resources.getClass();
                    XmlResourceParser xml = resources.getXml(typedValue2.resourceId);
                    xml.getClass();
                    try {
                        e9i.a aVarA = e9i.a(xml, resources);
                        if (aVarA instanceof e9i.b) {
                            e9i.c[] cVarArr = ((e9i.b) aVarA).a;
                            cVarArr.getClass();
                            ArrayList arrayList = new ArrayList(cVarArr.length);
                            for (e9i.c cVar : cVarArr) {
                                arrayList.add(n8i.a(cVar.f, a(cVar.b), cVar.c ? 1 : 0, 8));
                            }
                            p8iVar = new p8i(arrayList);
                            xml.close();
                        } else {
                            xml.close();
                            p8iVar = null;
                        }
                        if (p8iVar != null) {
                            return new l8i(p8iVar);
                        }
                    } catch (Throwable th) {
                        xml.close();
                        throw th;
                    }
                }
            }
        }
        return null;
    }
}
