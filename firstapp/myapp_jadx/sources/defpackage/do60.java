package defpackage;

import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class do60 {
    public static final HashMap<String, a> a;
    public static final LinkedHashSet<String> b;
    public static final LinkedHashSet<String> c;

    public static final class a {
        public final boolean a;
        public final int b;
        public final String c;
        public final b d;
        public final b e;

        public a(boolean z, int i, String str, b bVar, b bVar2) {
            this.a = z;
            this.b = i;
            this.c = str;
            this.d = bVar;
            this.e = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e);
        }

        public final int hashCode() {
            int iA = gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31);
            String str = this.c;
            return this.e.hashCode() + ((this.d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = zug0.a("BodyPartNode(hasSide=", ", weight=", ", midCrash=", this.b, this.a);
            sbA.append(this.c);
            sbA.append(", leftSide=");
            sbA.append(this.d);
            sbA.append(", rightSide=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final List<c> c;
        public final String d;

        public b(String str, String str2, String str3, List list) {
            list.getClass();
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && Intrinsics.g(this.c, bVar.c) && this.d.equals(bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ai50.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("BodyPartSide(juggle=", this.a, ", end=", this.b, ", transitions=");
            sbA.append(this.c);
            sbA.append(", sound=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static String a(String str, String str2) {
        b bVar;
        str.getClass();
        str2.getClass();
        if (str2.length() > 0 && str2.equals("Mid_event (Thigh_head)")) {
            return "3_Thigh/3_1_Left_Thigh_end";
        }
        if (str.equals("1_Leg/0_Start")) {
            return "1_Leg/1_1-Left_Leg_end";
        }
        HashMap<String, a> map = a;
        Collection<a> collectionValues = map.values();
        collectionValues.getClass();
        for (a aVar : collectionValues) {
            aVar.getClass();
            a aVar2 = aVar;
            b bVar2 = aVar2.d;
            String str3 = aVar2.c;
            if (str2.length() > 0 && str3 != null && str3.length() != 0) {
                return str3;
            }
            b bVar3 = aVar2.e;
            if (bVar2.a.equals(str)) {
                return bVar2.b;
            }
            if (bVar3.a.equals(str)) {
                return bVar3.b;
            }
            for (c cVar : bVar3.c) {
                if (Intrinsics.g(cVar.c, str)) {
                    if (str2.length() > 0) {
                        String str4 = cVar.e;
                        return str4 == null ? "" : str4;
                    }
                    a aVar3 = map.get(cVar.a);
                    return (aVar3 == null || (bVar = aVar3.e) == null) ? "" : bVar.b;
                }
            }
        }
        return "";
    }

    static {
        b bVar = new b("7-head jugging/7-head jugging", "7-head jugging/7_1head end", "highTap", kotlin.collections.b.k(new c(10, "Thigh", DZsoPoBl.ckRv, "Thigh_head/4-head_Thigh", "Thigh_head/New Thigh_head Mid Crash event", "highTap"), new c(10, "Shoulder", DZsoPoBl.ckRv, "6-Shoulder_head/6-head_Shoulder", "6-Shoulder_head/New Shoulder Head Mid Crash event", "highTap")));
        m2g m2gVar = m2g.a;
        int i = 2;
        Pair pair = new Pair("Leg", new a(true, 4, null, new b("1_Leg/1-Leg jugging Left", "1_Leg/1_1-Left_Leg_end", "normalTap", m2gVar), new b("1_Leg/1-Leg jugging Right", "1_Leg/1_1-Right_Leg_end", "normalTap", kotlin.collections.a.c(new c(i, 16, "Thigh", "2-Leg_Thigh/2-Leg_Thigh", (String) null, "normalTap")))));
        b bVar2 = new b("3_Thigh/3-Thigh Jugging Left", "3_Thigh/3_1_Left_Thigh_end", "normalTap", m2gVar);
        c cVar = new c(2, "Shoulder", DZsoPoBl.ckRv, "4-Thigh_shoulder/4-Thigh_shoulder", "4-Thigh_shoulder/New shoulder_Thigh Mid Crash event", "highTap");
        int i2 = 3;
        c cVar2 = new c(i2, 16, "Leg", "2-Leg_Thigh/2-Thigh_leg", (String) null, "normalTap");
        int i3 = 2;
        a = kpu.d(pair, new Pair("Thigh", new a(true, 2, null, bVar2, new b("3_Thigh/3-Thigh Jugging Right", "3_Thigh/3_1_right_Thigh_end", "normalTap", kotlin.collections.b.k(cVar, cVar2, new c(5, i3, "Head", "Thigh_head/4-Thigh_head", "Thigh_head/New Thigh_head Mid Crash event", "highTap"))))), new Pair("Shoulder", new a(true, 5, "5_Shoulder/New Shoulder Mid Crash event", new b("5_Shoulder/5-Shoulder jugging Left", "5_Shoulder/5_1_Left_Shoulder_end", "highTap", m2gVar), new b("5_Shoulder/5-Shoulder jugging Right", "5_Shoulder/5_1_Right_Shoulder_end", "highTap", kotlin.collections.b.k(new c(10, i3, "Head", "6-Shoulder_head/6-Shoulder_head", "6-Shoulder_head/New Shoulder Head Mid Crash event", "highTap"), new c(10, "Thigh", DZsoPoBl.ckRv, "4-Thigh_shoulder/4-_shoulder_Thigh", "4-Thigh_shoulder/New shoulder_Thigh Mid Crash event", "normalTap"))))), new Pair("Head", new a(false, 2, "7-head jugging/new Head Mid Crash event", bVar, bVar)));
        int iA = jpu.a(8);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(iA);
        ay0.M(new String[]{"7-head jugging/7-head jugging", "Thigh", "6-Shoulder_head/6-head_Shoulder", "4-Thigh_shoulder/4-Thigh_shoulder", "Thigh_head/4-Thigh_head", "5_Shoulder/5-Shoulder jugging Left", "5_Shoulder/5-Shoulder jugging Right", "6-Shoulder_head/6-Shoulder_head"}, linkedHashSet);
        b = linkedHashSet;
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>(iA);
        ay0.M(new String[]{"1_Leg/1-Leg jugging Left", "1_Leg/1-Leg jugging Right", "4-Thigh_shoulder/4-_shoulder_Thigh", "2-Leg_Thigh/2-Thigh_leg", "3_Thigh/3-Thigh Jugging Right", "3_Thigh/3-Thigh Jugging Left", "2-Leg_Thigh/2-Leg_Thigh", "1_Leg/0_Start"}, linkedHashSet2);
        c = linkedHashSet2;
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final int d;
        public final String e;
        public final String f;

        public /* synthetic */ c(int i, int i2, String str, String str2, String str3, String str4) {
            this(i, str, (i2 & 2) != 0 ? null : "Right", str2, (i2 & 16) != 0 ? null : str3, str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && this.d == cVar.d && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iA = gpp.a(this.d, gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31);
            String str2 = this.e;
            return this.f.hashCode() + ((iA + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("BodyPartTransition(to=", this.a, ", side=", this.b, ", transfer=");
            wxa.b(this.d, this.c, ", weight=", ", midCrash=", sbA);
            return kwi.a(sbA, this.e, ", sound=", this.f, ")");
        }

        public c(int i, String str, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = str4;
            this.f = str5;
        }
    }
}
