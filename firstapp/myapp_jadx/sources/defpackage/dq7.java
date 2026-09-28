package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class dq7 implements ygp<Object>, vp7 {
    public static final a b = new a(null);
    public static final Map<Class<? extends haj<?>>, Integer> c;
    public final Class<?> a;

    static {
        List listK = b.k(Function0.class, Function1.class, Function2.class, gaj.class, iaj.class, jaj.class, kaj.class, laj.class, maj.class, naj.class, r9j.class, s9j.class, t9j.class, u9j.class, v9j.class, w9j.class, x9j.class, y9j.class, z9j.class, aaj.class, caj.class, daj.class, eaj.class);
        ArrayList arrayList = new ArrayList(l48.r(listK, 10));
        int i = 0;
        for (Object obj : listK) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        c = kpu.k(arrayList);
    }

    public dq7(Class<?> cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.vp7
    public final Class<?> d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dq7) && tgp.c(this).equals(tgp.c((ygp) obj));
    }

    @Override // defpackage.ygp
    public final boolean h(Object obj) {
        b.getClass();
        Class<?> clsC = this.a;
        clsC.getClass();
        Map<Class<? extends haj<?>>, Integer> map = c;
        map.getClass();
        Integer num = map.get(clsC);
        if (num != null) {
            return y8h0.e(num.intValue(), obj);
        }
        if (clsC.isPrimitive()) {
            clsC = tgp.c(jq40.a(clsC));
        }
        return clsC.isInstance(obj);
    }

    @Override // defpackage.ygp
    public final int hashCode() {
        return tgp.c(this).hashCode();
    }

    @Override // defpackage.ygp
    public final String i() {
        String strA;
        b.getClass();
        Class<?> cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strA2 = a.a(cls.getName());
            return strA2 == null ? cls.getCanonicalName() : strA2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strA = a.a(componentType.getName())) != null) {
            strConcat = strA.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.ygp
    public final String k() {
        String strB;
        b.getClass();
        Class<?> cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strB2 = a.b(cls.getName());
                return strB2 == null ? cls.getSimpleName() : strB2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strB = a.b(componentType.getName())) != null) {
                strConcat = strB.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return StringsKt.k0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iS = StringsKt.S(simpleName, '$', 0, 6);
            return iS == -1 ? simpleName : simpleName.substring(iS + 1, simpleName.length());
        }
        return StringsKt.k0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
          (r0v0 int) from 0x0004: SWITCH (r0v0 int)
         case -2061550653: goto B:317:0x0342
         case -2056817302: goto B:312:0x0336
         case -2034166429: goto B:307:0x0329
         case -1979556166: goto B:302:0x031d
         case -1571515090: goto B:297:0x0311
         case -1383349348: goto B:292:0x0305
         case -1383343454: goto B:287:0x02f9
         case -1325958191: goto B:282:0x02ed
         case -1182275604: goto B:277:0x02e0
         case -1062240117: goto B:272:0x02d3
         case -688322466: goto B:267:0x02c6
         case -527879800: goto B:262:0x02b9
         case -515992664: goto B:257:0x02ac
         case -246476834: goto B:252:0x029f
         case -207262728: goto B:247:0x0292
         case -165139126: goto B:242:0x0285
         case 104431: goto B:239:0x027b
         case 3039496: goto B:234:0x026e
         case 3052374: goto B:229:0x0261
         case 3327612: goto B:224:0x0254
         case 64711720: goto B:219:0x0247
         case 65821278: goto B:214:0x023a
         case 77230534: goto B:209:0x022c
         case 97526364: goto B:206:0x0222
         case 109413500: goto B:203:0x0218
         case 155276373: goto B:200:0x020e
         case 226173651: goto B:195:0x0201
         case 344809556: goto B:192:0x01f7
         case 398507100: goto B:189:0x01ed
         case 398585941: goto B:184:0x01e0
         case 398795216: goto B:181:0x01d6
         case 482629606: goto B:176:0x01c9
         case 499831342: goto B:171:0x01bc
         case 577341676: goto B:166:0x01af
         case 599019395: goto B:161:0x01a2
         case 761287205: goto B:158:0x0198
         case 1052881309: goto B:153:0x018b
         case 1063877011: goto B:148:0x017e
         case 1195259493: goto B:143:0x0171
         case 1275614662: goto B:138:0x0164
         case 1383693018: goto B:133:0x0157
         case 1630335596: goto B:128:0x014a
         case 1877171123: goto B:123:0x013d
         default: goto B:4:0x0007 A[RegionRef:SW:3] (LINE:7)
          (r0v0 int) from 0x000a: SWITCH (r0v0 int)
         case -1811142685: goto B:68:0x00ae
         case -1811142684: goto B:63:0x00a1
         case -1811142683: goto B:58:0x0094
         default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:13)
          (r0v0 int) from 0x000d: SWITCH (r0v0 int)
         case 80123371: goto B:53:0x0087
         case 80123372: goto B:48:0x007a
         case 80123373: goto B:43:0x006d
         case 80123374: goto B:38:0x0060
         case 80123375: goto B:33:0x0053
         case 80123376: goto B:28:0x0046
         case 80123377: goto B:23:0x0039
         case 80123378: goto B:18:0x002c
         case 80123379: goto B:13:0x001f
         case 80123380: goto B:8:0x0012
         default: goto B:331:? A[RegionRef:SW:6] (LINE:16)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static String a(String str) {
            switch (str.hashCode()) {
                case -2061550653:
                    if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                        return null;
                    }
                    return "kotlin.Double.Companion";
                case -2056817302:
                    if (str.equals("java.lang.Integer")) {
                        return "kotlin.Int";
                    }
                    return null;
                case -2034166429:
                    if (str.equals("java.lang.Cloneable")) {
                        return oLsIjJCWb.qtRoCObyLfRKPcK;
                    }
                    return null;
                case -1979556166:
                    if (str.equals("java.lang.annotation.Annotation")) {
                        return "kotlin.Annotation";
                    }
                    return null;
                case -1571515090:
                    if (str.equals("java.lang.Comparable")) {
                        return "kotlin.Comparable";
                    }
                    return null;
                case -1383349348:
                    if (str.equals("java.util.Map")) {
                        return "kotlin.collections.Map";
                    }
                    return null;
                case -1383343454:
                    if (str.equals("java.util.Set")) {
                        return "kotlin.collections.Set";
                    }
                    return null;
                case -1325958191:
                    if (str.equals("double")) {
                        return "kotlin.Double";
                    }
                    return null;
                case -1182275604:
                    if (str.equals(lobGSRIlnSGJY.IbYOLNgkbmYqr)) {
                        return "kotlin.Byte.Companion";
                    }
                    return null;
                case -1062240117:
                    if (str.equals("java.lang.CharSequence")) {
                        return "kotlin.CharSequence";
                    }
                    return null;
                case -688322466:
                    if (str.equals("java.util.Collection")) {
                        return "kotlin.collections.Collection";
                    }
                    return null;
                case -527879800:
                    if (str.equals("java.lang.Float")) {
                        return "kotlin.Float";
                    }
                    return null;
                case -515992664:
                    if (str.equals("java.lang.Short")) {
                        return "kotlin.Short";
                    }
                    return null;
                case -246476834:
                    if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                        return "kotlin.Char.Companion";
                    }
                    return null;
                case -207262728:
                    if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                        return "kotlin.Long.Companion";
                    }
                    return null;
                case -165139126:
                    if (str.equals("java.util.Map$Entry")) {
                        return "kotlin.collections.Map.Entry";
                    }
                    return null;
                case 104431:
                    if (str.equals("int")) {
                        return "kotlin.Int";
                    }
                    return null;
                case 3039496:
                    if (str.equals("byte")) {
                        return "kotlin.Byte";
                    }
                    return null;
                case 3052374:
                    if (str.equals("char")) {
                        return "kotlin.Char";
                    }
                    return null;
                case 3327612:
                    if (str.equals("long")) {
                        return "kotlin.Long";
                    }
                    return null;
                case 64711720:
                    if (str.equals("boolean")) {
                        return "kotlin.Boolean";
                    }
                    return null;
                case 65821278:
                    if (str.equals("java.util.List")) {
                        return "kotlin.collections.List";
                    }
                    return null;
                case 77230534:
                    if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                        return vZBMKENANSz.fdaFr;
                    }
                    return null;
                case 97526364:
                    if (str.equals("float")) {
                        return "kotlin.Float";
                    }
                    return null;
                case 109413500:
                    if (str.equals("short")) {
                        return "kotlin.Short";
                    }
                    return null;
                case 155276373:
                    if (str.equals("java.lang.Character")) {
                        return "kotlin.Char";
                    }
                    return null;
                case 226173651:
                    if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                        return "kotlin.Enum.Companion";
                    }
                    return null;
                case 344809556:
                    if (str.equals("java.lang.Boolean")) {
                        return "kotlin.Boolean";
                    }
                    return null;
                case 398507100:
                    if (str.equals("java.lang.Byte")) {
                        return "kotlin.Byte";
                    }
                    return null;
                case 398585941:
                    if (str.equals("java.lang.Enum")) {
                        return "kotlin.Enum";
                    }
                    return null;
                case 398795216:
                    if (str.equals("java.lang.Long")) {
                        return "kotlin.Long";
                    }
                    return null;
                case 482629606:
                    if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                        return "kotlin.Float.Companion";
                    }
                    return null;
                case 499831342:
                    if (str.equals("java.util.Iterator")) {
                        return "kotlin.collections.Iterator";
                    }
                    return null;
                case 577341676:
                    if (str.equals("java.util.ListIterator")) {
                        return "kotlin.collections.ListIterator";
                    }
                    return null;
                case 599019395:
                    if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                        return "kotlin.String.Companion";
                    }
                    return null;
                case 761287205:
                    if (str.equals("java.lang.Double")) {
                        return "kotlin.Double";
                    }
                    return null;
                case 1052881309:
                    if (str.equals("java.lang.Number")) {
                        return "kotlin.Number";
                    }
                    return null;
                case 1063877011:
                    if (str.equals("java.lang.Object")) {
                        return "kotlin.Any";
                    }
                    return null;
                case 1195259493:
                    if (str.equals("java.lang.String")) {
                        return "kotlin.String";
                    }
                    return null;
                case 1275614662:
                    if (str.equals("java.lang.Iterable")) {
                        return "kotlin.collections.Iterable";
                    }
                    return null;
                case 1383693018:
                    if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                        return "kotlin.Boolean.Companion";
                    }
                    return null;
                case 1630335596:
                    if (str.equals("java.lang.Throwable")) {
                        return "kotlin.Throwable";
                    }
                    return null;
                case 1877171123:
                    if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                        return "kotlin.Int.Companion";
                    }
                    return null;
                default:
                    switch (str) {
                        case "kotlin.jvm.functions.Function10":
                            return "kotlin.Function10";
                        case "kotlin.jvm.functions.Function11":
                            return "kotlin.Function11";
                        case "kotlin.jvm.functions.Function12":
                            return "kotlin.Function12";
                        case "kotlin.jvm.functions.Function13":
                            return "kotlin.Function13";
                        case "kotlin.jvm.functions.Function14":
                            return "kotlin.Function14";
                        case "kotlin.jvm.functions.Function15":
                            return "kotlin.Function15";
                        case "kotlin.jvm.functions.Function16":
                            return "kotlin.Function16";
                        case "kotlin.jvm.functions.Function17":
                            return "kotlin.Function17";
                        case "kotlin.jvm.functions.Function18":
                            return "kotlin.Function18";
                        case "kotlin.jvm.functions.Function19":
                            return "kotlin.Function19";
                        default:
                            switch (str) {
                                case -1811142685:
                                    if (str.equals("kotlin.jvm.functions.Function20")) {
                                        return "kotlin.Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (str.equals("kotlin.jvm.functions.Function21")) {
                                        return "kotlin.Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (str.equals("kotlin.jvm.functions.Function22")) {
                                        return "kotlin.Function22";
                                    }
                                    return null;
                                default:
                                    switch (str) {
                                        case 80123371:
                                            if (str.equals("kotlin.jvm.functions.Function0")) {
                                                return "kotlin.Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (str.equals("kotlin.jvm.functions.Function1")) {
                                                return "kotlin.Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (str.equals("kotlin.jvm.functions.Function2")) {
                                                return "kotlin.Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (str.equals("kotlin.jvm.functions.Function3")) {
                                                return "kotlin.Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (str.equals("kotlin.jvm.functions.Function4")) {
                                                return "kotlin.Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (str.equals("kotlin.jvm.functions.Function5")) {
                                                return "kotlin.Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (str.equals("kotlin.jvm.functions.Function6")) {
                                                return "kotlin.Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (str.equals("kotlin.jvm.functions.Function7")) {
                                                return "kotlin.Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (str.equals("kotlin.jvm.functions.Function8")) {
                                                return "kotlin.Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (str.equals("kotlin.jvm.functions.Function9")) {
                                                return "kotlin.Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
          (r0v0 int) from 0x0004: SWITCH (r0v0 int)
         case -2061550653: goto B:299:0x0326
         case -2056817302: goto B:294:0x031a
         case -2034166429: goto B:289:0x030e
         case -1979556166: goto B:284:0x0302
         case -1571515090: goto B:279:0x02f6
         case -1383349348: goto B:274:0x02ea
         case -1383343454: goto B:269:0x02de
         case -1325958191: goto B:264:0x02d2
         case -1182275604: goto B:261:0x02c9
         case -1062240117: goto B:256:0x02bc
         case -688322466: goto B:251:0x02af
         case -527879800: goto B:246:0x02a2
         case -515992664: goto B:241:0x0295
         case -246476834: goto B:238:0x028b
         case -207262728: goto B:235:0x0281
         case -165139126: goto B:230:0x0273
         case 104431: goto B:227:0x0269
         case 3039496: goto B:222:0x025c
         case 3052374: goto B:217:0x024f
         case 3327612: goto B:212:0x0242
         case 64711720: goto B:207:0x0235
         case 65821278: goto B:202:0x0228
         case 77230534: goto B:199:0x021e
         case 97526364: goto B:196:0x0214
         case 109413500: goto B:193:0x020a
         case 155276373: goto B:190:0x0200
         case 226173651: goto B:187:0x01f6
         case 344809556: goto B:184:0x01ec
         case 398507100: goto B:181:0x01e2
         case 398585941: goto B:176:0x01d5
         case 398795216: goto B:173:0x01cb
         case 482629606: goto B:170:0x01c1
         case 499831342: goto B:165:0x01b4
         case 577341676: goto B:160:0x01a7
         case 599019395: goto B:157:0x019d
         case 761287205: goto B:154:0x0193
         case 1052881309: goto B:149:0x0186
         case 1063877011: goto B:144:0x0179
         case 1195259493: goto B:139:0x016b
         case 1275614662: goto B:134:0x015e
         case 1383693018: goto B:131:0x0154
         case 1630335596: goto B:126:0x0147
         case 1877171123: goto B:123:0x013d
         default: goto B:4:0x0007 A[RegionRef:SW:3] (LINE:7)
          (r0v0 int) from 0x000a: SWITCH (r0v0 int)
         case -1811142685: goto B:68:0x00ae
         case -1811142684: goto B:63:0x00a1
         case -1811142683: goto B:58:0x0094
         default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:13)
          (r0v0 int) from 0x000d: SWITCH (r0v0 int)
         case 80123371: goto B:53:0x0087
         case 80123372: goto B:48:0x007a
         case 80123373: goto B:43:0x006d
         case 80123374: goto B:38:0x0060
         case 80123375: goto B:33:0x0053
         case 80123376: goto B:28:0x0046
         case 80123377: goto B:23:0x0039
         case 80123378: goto B:18:0x002c
         case 80123379: goto B:13:0x001f
         case 80123380: goto B:8:0x0012
         default: goto B:313:? A[RegionRef:SW:6] (LINE:16)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static String b(String str) {
            switch (str.hashCode()) {
                case -2061550653:
                    if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                case -2056817302:
                    if (str.equals("java.lang.Integer")) {
                        return "Int";
                    }
                    return null;
                case -2034166429:
                    if (str.equals("java.lang.Cloneable")) {
                        return "Cloneable";
                    }
                    return null;
                case -1979556166:
                    if (str.equals("java.lang.annotation.Annotation")) {
                        return "Annotation";
                    }
                    return null;
                case -1571515090:
                    if (str.equals("java.lang.Comparable")) {
                        return "Comparable";
                    }
                    return null;
                case -1383349348:
                    if (str.equals("java.util.Map")) {
                        return "Map";
                    }
                    return null;
                case -1383343454:
                    if (str.equals("java.util.Set")) {
                        return "Set";
                    }
                    return null;
                case -1325958191:
                    if (str.equals("double")) {
                        return "Double";
                    }
                    return null;
                case -1182275604:
                    if (!str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                case -1062240117:
                    if (str.equals("java.lang.CharSequence")) {
                        return "CharSequence";
                    }
                    return null;
                case -688322466:
                    if (str.equals("java.util.Collection")) {
                        return "Collection";
                    }
                    return null;
                case -527879800:
                    if (str.equals("java.lang.Float")) {
                        return "Float";
                    }
                    return null;
                case -515992664:
                    if (str.equals("java.lang.Short")) {
                        return "Short";
                    }
                    return null;
                case -246476834:
                    if (!str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                case -207262728:
                    if (!str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                case -165139126:
                    if (str.equals("java.util.Map$Entry")) {
                        return tYcQsJyaojE.ckYGzxChGCbCCPl;
                    }
                    return null;
                case 104431:
                    if (str.equals("int")) {
                        return "Int";
                    }
                    return null;
                case 3039496:
                    if (str.equals("byte")) {
                        return "Byte";
                    }
                    return null;
                case 3052374:
                    if (str.equals("char")) {
                        return "Char";
                    }
                    return null;
                case 3327612:
                    if (str.equals("long")) {
                        return "Long";
                    }
                    return null;
                case 64711720:
                    if (str.equals("boolean")) {
                        return "Boolean";
                    }
                    return null;
                case 65821278:
                    if (str.equals("java.util.List")) {
                        return "List";
                    }
                    return null;
                case 77230534:
                    if (!str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                case 97526364:
                    if (str.equals("float")) {
                        return "Float";
                    }
                    return null;
                case 109413500:
                    if (str.equals("short")) {
                        return "Short";
                    }
                    return null;
                case 155276373:
                    if (str.equals("java.lang.Character")) {
                        return "Char";
                    }
                    return null;
                case 226173651:
                    if (!str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                case 344809556:
                    if (str.equals("java.lang.Boolean")) {
                        return "Boolean";
                    }
                    return null;
                case 398507100:
                    if (str.equals("java.lang.Byte")) {
                        return "Byte";
                    }
                    return null;
                case 398585941:
                    if (str.equals("java.lang.Enum")) {
                        return "Enum";
                    }
                    return null;
                case 398795216:
                    if (str.equals("java.lang.Long")) {
                        return "Long";
                    }
                    return null;
                case 482629606:
                    if (!str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                case 499831342:
                    if (str.equals("java.util.Iterator")) {
                        return "Iterator";
                    }
                    return null;
                case 577341676:
                    if (str.equals("java.util.ListIterator")) {
                        return "ListIterator";
                    }
                    return null;
                case 599019395:
                    if (!str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                case 761287205:
                    if (str.equals("java.lang.Double")) {
                        return "Double";
                    }
                    return null;
                case 1052881309:
                    if (str.equals("java.lang.Number")) {
                        return "Number";
                    }
                    return null;
                case 1063877011:
                    if (str.equals("java.lang.Object")) {
                        return "Any";
                    }
                    return null;
                case 1195259493:
                    if (str.equals("java.lang.String")) {
                        return lobGSRIlnSGJY.srujUnc;
                    }
                    return null;
                case 1275614662:
                    if (str.equals("java.lang.Iterable")) {
                        return "Iterable";
                    }
                    return null;
                case 1383693018:
                    if (!str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                case 1630335596:
                    if (str.equals("java.lang.Throwable")) {
                        return "Throwable";
                    }
                    return null;
                case 1877171123:
                    if (!str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                        return null;
                    }
                    return "Companion";
                default:
                    switch (str) {
                        case "kotlin.jvm.functions.Function10":
                            return "Function10";
                        case "kotlin.jvm.functions.Function11":
                            return "Function11";
                        case "kotlin.jvm.functions.Function12":
                            return "Function12";
                        case "kotlin.jvm.functions.Function13":
                            return "Function13";
                        case "kotlin.jvm.functions.Function14":
                            return "Function14";
                        case "kotlin.jvm.functions.Function15":
                            return "Function15";
                        case "kotlin.jvm.functions.Function16":
                            return "Function16";
                        case "kotlin.jvm.functions.Function17":
                            return "Function17";
                        case "kotlin.jvm.functions.Function18":
                            return "Function18";
                        case "kotlin.jvm.functions.Function19":
                            return "Function19";
                        default:
                            switch (str) {
                                case -1811142685:
                                    if (str.equals("kotlin.jvm.functions.Function20")) {
                                        return "Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (str.equals("kotlin.jvm.functions.Function21")) {
                                        return "Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (str.equals("kotlin.jvm.functions.Function22")) {
                                        return "Function22";
                                    }
                                    return null;
                                default:
                                    switch (str) {
                                        case 80123371:
                                            if (str.equals("kotlin.jvm.functions.Function0")) {
                                                return "Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (str.equals("kotlin.jvm.functions.Function1")) {
                                                return "Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (str.equals("kotlin.jvm.functions.Function2")) {
                                                return "Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (str.equals("kotlin.jvm.functions.Function3")) {
                                                return "Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (str.equals("kotlin.jvm.functions.Function4")) {
                                                return "Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (str.equals("kotlin.jvm.functions.Function5")) {
                                                return "Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (str.equals("kotlin.jvm.functions.Function6")) {
                                                return "Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (str.equals("kotlin.jvm.functions.Function7")) {
                                                return "Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (str.equals("kotlin.jvm.functions.Function8")) {
                                                return "Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (str.equals("kotlin.jvm.functions.Function9")) {
                                                return "Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }
    }
}
