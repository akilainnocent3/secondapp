package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1 f146659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl f146660b;

    public /* synthetic */ a5() {
        this(new sh1(), new tl());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    public final String a(Context context) {
        List listJ;
        String str;
        String str2;
        List list;
        List listO5;
        this.f146659a.getClass();
        String str3 = (String) sh1.a(context, th1.f155903f.f155909b);
        if (str3 == null) {
            tl tlVar = this.f146660b;
            e11 e11Var = tlVar.f155940a;
            nt2 nt2VarA = e11Var.f148457a.a(context);
            Object obj = null;
            if (nt2VarA == null || (str2 = nt2VarA.U) == null) {
                listJ = fr.h0.J();
            } else {
                e11Var.f148458b.getClass();
                String str4 = (String) sh1.a(context, th1.f155904g.f155909b);
                if (str4 == null || (listO5 = cv.p0.o5(str4, new String[]{","}, false, 0, 6, null)) == null) {
                    list = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listO5) {
                        if (!cv.p0.O3((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    list = arrayList;
                    if (zIsEmpty) {
                        list = null;
                    }
                }
                if (list == null) {
                    list = nt2VarA.f153195x0;
                }
                listJ = fr.r0.I4(fr.g0.l(str2), list);
            }
            if (listJ.size() > 1) {
                for (Object obj3 : fr.r0.h2(listJ, 1)) {
                    String strA = ya3.a((String) obj3);
                    if (strA != null && (!cv.p0.O3(strA))) {
                        d11 d11Var = tlVar.f155941b;
                        ConcurrentHashMap concurrentHashMap = d11.f147991b;
                        if (d11Var.a(1000, strA)) {
                            obj = obj3;
                            break;
                        }
                    }
                }
                String str5 = (String) obj;
                if (str5 == null) {
                    str = (String) fr.r0.u3(listJ);
                } else {
                    str3 = str5;
                }
                if (str3 == null) {
                    str3 = "yandex.com/ads";
                }
            } else {
                str = (String) fr.r0.L2(listJ);
            }
            str3 = str;
            if (str3 == null) {
                str3 = "yandex.com/ads";
            }
        }
        return a(str3);
    }

    public a5(sh1 sh1Var, tl tlVar) {
        this.f146659a = sh1Var;
        this.f146660b = tlVar;
    }

    public static String a(String str) {
        return "https://" + str;
    }
}
