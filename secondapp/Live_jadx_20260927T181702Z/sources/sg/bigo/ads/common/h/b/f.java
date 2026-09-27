package sg.bigo.ads.common.h.b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static f f133111b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HashMap<String, CopyOnWriteArrayList<e>> f133112a = new HashMap<>();

    /* JADX INFO: renamed from: sg.bigo.ads.common.h.b.f$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133113a;

        static {
            int[] iArr = new int[h.a().length];
            f133113a = iArr;
            try {
                iArr[h.f133115a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133113a[h.f133116b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133113a[h.f133117c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f133113a[h.f133118d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f133113a[h.f133119e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f133113a[h.f133120f - 1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f133113a[h.f133121g - 1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static f a() {
        return f133111b;
    }

    public final void b(String str) {
        if (!this.f133112a.containsKey(str) || this.f133112a.get(str) == null) {
            return;
        }
        this.f133112a.get(str).clear();
    }

    public final void a(String str) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        a aVarC;
        if (!this.f133112a.containsKey(str) || (copyOnWriteArrayList = this.f133112a.get(str)) == null || (aVarC = i.c(str)) == null) {
            return;
        }
        a(aVarC, copyOnWriteArrayList);
    }

    private void a(String str, e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        if (this.f133112a.containsKey(str) && (copyOnWriteArrayList = this.f133112a.get(str)) != null && copyOnWriteArrayList.contains(eVar)) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    private void a(a aVar, CopyOnWriteArrayList<e> copyOnWriteArrayList) {
        switch (AnonymousClass1.f133113a[aVar.f133104e - 1]) {
            case 1:
                Iterator<e> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                break;
            case 2:
                Iterator<e> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                break;
            case 3:
                Iterator<e> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().a(aVar.f133100a);
                }
                break;
            case 4:
                for (e eVar : copyOnWriteArrayList) {
                    String str = aVar.f133100a;
                    j.a(aVar.f133103d);
                    eVar.b(str);
                }
                break;
            case 5:
                Iterator<e> it4 = copyOnWriteArrayList.iterator();
                while (it4.hasNext()) {
                    it4.next().c(aVar.f133100a);
                }
                break;
            case 6:
                for (e eVar2 : copyOnWriteArrayList) {
                    eVar2.d(aVar.f133100a);
                    a(aVar.f133100a, eVar2);
                }
                break;
            case 7:
                for (e eVar3 : copyOnWriteArrayList) {
                    eVar3.a(aVar.f133100a, aVar.f133105f, aVar.f133101b.f133063g);
                    a(aVar.f133100a, eVar3);
                }
                break;
        }
    }
}
