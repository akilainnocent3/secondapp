package yads;

import com.ironsource.C4235d4;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class t01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f155653a = cv.g.f77207g;

    public static final boolean a(Map map, u11 u11Var) {
        String strC = c(map, u11Var);
        if (strC == null) {
            return true;
        }
        return Boolean.parseBoolean(strC);
    }

    public static boolean b(Map map, u11 u11Var) {
        String strC = c(map, u11Var);
        if (strC == null) {
            return false;
        }
        return Boolean.parseBoolean(strC);
    }

    public static final String c(Map map, u11 u11Var) {
        if (map != null) {
            return (String) map.get(u11Var.f156216b);
        }
        return null;
    }

    public static int d(Map map, u11 u11Var) {
        String strC = c(map, u11Var);
        int i10 = tb.f155802b;
        if (strC == null) {
            return 0;
        }
        try {
            return Integer.parseInt(strC);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static final ArrayList e(Map map, u11 u11Var) {
        List listJ;
        ArrayList arrayList = new ArrayList();
        String strC = c(map, u11Var);
        if (strC != null && strC.length() != 0) {
            List<String> listS = new cv.v(",").s(strC, 0);
            if (listS.isEmpty()) {
                listJ = fr.h0.J();
                break;
            }
            ListIterator<String> listIterator = listS.listIterator(listS.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listJ = fr.h0.J();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listJ = fr.r0.O5(listS, listIterator.nextIndex() + 1);
                    break;
                }
            }
            for (String str : (String[]) listJ.toArray(new String[0])) {
                try {
                    dr.i1.a aVar = dr.i1.f79460c;
                    int length = str.length() - 1;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 <= length) {
                        boolean z11 = kotlin.jvm.internal.m0.t(str.charAt(!z10 ? i10 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i10++;
                        } else {
                            z10 = true;
                        }
                    }
                    String strDecode = URLDecoder.decode(str.subSequence(i10, length + 1).toString(), "UTF-8");
                    if (strDecode != null) {
                        arrayList.add(strDecode);
                    } else {
                        strDecode = null;
                    }
                    dr.i1.b(strDecode);
                } catch (Throwable th2) {
                    dr.i1.a aVar2 = dr.i1.f79460c;
                    dr.i1.b(dr.j1.a(th2));
                }
            }
        }
        return arrayList;
    }

    public static final Charset a(Map map) {
        List listJ;
        List listJ2;
        if (map == null) {
            return f155653a;
        }
        String str = (String) map.get("Content-Type");
        if (str != null) {
            List<String> listS = new cv.v(";").s(str, 0);
            if (!listS.isEmpty()) {
                ListIterator<String> listIterator = listS.listIterator(listS.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listJ = fr.r0.O5(listS, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        listJ = fr.h0.J();
                        break;
                    }
                }
            } else {
                listJ = fr.h0.J();
                break;
            }
            String[] strArr = (String[]) listJ.toArray(new String[0]);
            int length = strArr.length;
            for (int i10 = 1; i10 < length; i10++) {
                String str2 = strArr[i10];
                int length2 = str2.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length2) {
                    boolean z11 = kotlin.jvm.internal.m0.t(str2.charAt(!z10 ? i11 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length2--;
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                List<String> listS2 = new cv.v(C4235d4.j.f61456b).s(str2.subSequence(i11, length2 + 1).toString(), 0);
                if (!listS2.isEmpty()) {
                    ListIterator<String> listIterator2 = listS2.listIterator(listS2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            if (listIterator2.previous().length() != 0) {
                                listJ2 = fr.r0.O5(listS2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        } else {
                            listJ2 = fr.h0.J();
                            break;
                        }
                    }
                } else {
                    listJ2 = fr.h0.J();
                    break;
                }
                String[] strArr2 = (String[]) listJ2.toArray(new String[0]);
                if (strArr2.length == 2 && kotlin.jvm.internal.m0.g(strArr2[0], "charset")) {
                    return Charset.forName(strArr2[1]);
                }
            }
        }
        return f155653a;
    }
}
