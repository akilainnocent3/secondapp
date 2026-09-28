package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class anm {
    public static final Map<String, eln> a;
    public static final Regex b;

    public static final class a {
        public final ArrayList a;
        public int b;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final y0p.c a() {
            y0p.b bVar;
            int i = this.b;
            ArrayList arrayList = this.a;
            Object obj = arrayList.get(i);
            obj.getClass();
            String str = ((lzf0.b) obj).a;
            boolean zG = Intrinsics.g(str, "ol");
            this.b++;
            ArrayList arrayList2 = new ArrayList();
            while (this.b < arrayList.size()) {
                lzf0 lzf0Var = (lzf0) arrayList.get(this.b);
                if (lzf0Var instanceof lzf0.b) {
                    if (Intrinsics.g(((lzf0.b) lzf0Var).a, "li")) {
                        str.getClass();
                        this.b++;
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            if (this.b >= arrayList.size()) {
                                bVar = new y0p.b(arrayList3);
                                break;
                            }
                            lzf0 lzf0Var2 = (lzf0) arrayList.get(this.b);
                            if (lzf0Var2 instanceof lzf0.d) {
                                this.b++;
                                String strReplace = anm.b.replace(((lzf0.d) lzf0Var2).a, " ");
                                if (strReplace.length() > 0) {
                                    arrayList3.add(new y0p.f(strReplace));
                                }
                            } else if (lzf0Var2 instanceof lzf0.c) {
                                this.b++;
                                if (Intrinsics.g(((lzf0.c) lzf0Var2).a, "br")) {
                                    arrayList3.add(y0p.a.a);
                                }
                            } else {
                                if (!(lzf0Var2 instanceof lzf0.b)) {
                                    if (!(lzf0Var2 instanceof lzf0.a)) {
                                        uhc.a();
                                        return null;
                                    }
                                    String str2 = ((lzf0.a) lzf0Var2).a;
                                    if (!Intrinsics.g(str2, "li")) {
                                        if (!Intrinsics.g(str2, str)) {
                                            bVar = new y0p.b(arrayList3);
                                            break;
                                        }
                                        bVar = new y0p.b(arrayList3);
                                        break;
                                    }
                                    this.b++;
                                    bVar = new y0p.b(arrayList3);
                                    break;
                                }
                                Map<String, eln> map = anm.a;
                                lzf0.b bVar2 = (lzf0.b) lzf0Var2;
                                Map<String, String> map2 = bVar2.b;
                                String str3 = bVar2.a;
                                eln elnVar = map.get(str3);
                                if (elnVar != null) {
                                    this.b++;
                                    arrayList3.add(new y0p.e(elnVar, b(str3)));
                                } else if (Intrinsics.g(str3, "font") && map2.get("color") != null) {
                                    this.b++;
                                    arrayList3.add(new y0p.e(new eln.b((String) kpu.c("color", map2)), b(str3)));
                                } else if (Intrinsics.g(str3, "a") && map2.get("href") != null) {
                                    this.b++;
                                    arrayList3.add(new y0p.e(new eln.d((String) kpu.c("href", map2)), b(str3)));
                                } else if (Intrinsics.g(str3, "ul") || Intrinsics.g(str3, "ol")) {
                                    arrayList3.add(a());
                                } else {
                                    if (Intrinsics.g(str3, "li")) {
                                        bVar = new y0p.b(arrayList3);
                                        break;
                                    }
                                    this.b++;
                                    p48.w(b(str3), arrayList3);
                                }
                            }
                        }
                        arrayList2.add(bVar);
                    } else {
                        this.b++;
                    }
                } else {
                    if (lzf0Var instanceof lzf0.a) {
                        if (!Intrinsics.g(((lzf0.a) lzf0Var).a, str)) {
                            return new y0p.c(arrayList2, zG);
                        }
                        this.b++;
                        return new y0p.c(arrayList2, zG);
                    }
                    if (lzf0Var instanceof lzf0.d) {
                        this.b++;
                    } else {
                        if (!(lzf0Var instanceof lzf0.c)) {
                            uhc.a();
                            return null;
                        }
                        this.b++;
                    }
                }
            }
            return new y0p.c(arrayList2, zG);
        }

        public final ArrayList b(String str) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i = this.b;
                ArrayList arrayList2 = this.a;
                if (i >= arrayList2.size()) {
                    break;
                }
                lzf0 lzf0Var = (lzf0) arrayList2.get(this.b);
                if (lzf0Var instanceof lzf0.d) {
                    this.b++;
                    String strReplace = anm.b.replace(((lzf0.d) lzf0Var).a, " ");
                    if (strReplace.length() > 0) {
                        arrayList.add(new y0p.f(strReplace));
                    }
                } else if (lzf0Var instanceof lzf0.c) {
                    this.b++;
                    if (Intrinsics.g(((lzf0.c) lzf0Var).a, "br")) {
                        arrayList.add(y0p.a.a);
                    }
                } else {
                    if (!(lzf0Var instanceof lzf0.b)) {
                        if (!(lzf0Var instanceof lzf0.a)) {
                            uhc.a();
                            return null;
                        }
                        if (!Intrinsics.g(((lzf0.a) lzf0Var).a, str)) {
                            break;
                        }
                        this.b++;
                        return arrayList;
                    }
                    Map<String, eln> map = anm.a;
                    lzf0.b bVar = (lzf0.b) lzf0Var;
                    Map<String, String> map2 = bVar.b;
                    String str2 = bVar.a;
                    eln elnVar = map.get(str2);
                    if (elnVar != null) {
                        this.b++;
                        arrayList.add(new y0p.e(elnVar, b(str2)));
                    } else if (Intrinsics.g(str2, "font") && map2.get("color") != null) {
                        this.b++;
                        arrayList.add(new y0p.e(new eln.b((String) kpu.c("color", map2)), b(str2)));
                    } else if (Intrinsics.g(str2, "a") && map2.get("href") != null) {
                        this.b++;
                        arrayList.add(new y0p.e(new eln.d((String) kpu.c("href", map2)), b(str2)));
                    } else if (Intrinsics.g(str2, "ul") || Intrinsics.g(str2, "ol")) {
                        arrayList.add(a());
                    } else {
                        boolean zG = Intrinsics.g(str2, "p");
                        int i2 = this.b;
                        if (zG) {
                            this.b = i2 + 1;
                            arrayList.add(new y0p.d(b("p")));
                        } else {
                            this.b = i2 + 1;
                            p48.w(b(str2), arrayList);
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    static {
        eln.a aVar = eln.a.a;
        Pair pair = new Pair("b", aVar);
        Pair pair2 = new Pair("strong", aVar);
        eln.c cVar = eln.c.a;
        Pair pair3 = new Pair("i", cVar);
        Pair pair4 = new Pair("em", cVar);
        Pair pair5 = new Pair("u", eln.f.a);
        eln.e eVar = eln.e.a;
        a = kpu.f(pair, pair2, pair3, pair4, pair5, new Pair("s", eVar), new Pair("strike", eVar), new Pair("del", eVar));
        b = new Regex("\\s+");
    }
}
