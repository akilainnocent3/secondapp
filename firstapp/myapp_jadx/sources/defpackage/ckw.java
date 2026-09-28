package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ckw implements lrz {
    public final nk0 a;
    public final List<nk0.d<ji10>> b;
    public final ttr c;
    public final ttr d;
    public final ArrayList e;

    /* JADX WARN: Multi-variable type inference failed */
    public ckw(nk0 nk0Var, imf0 imf0Var, List<nk0.d<ji10>> list, mmd mmdVar, f8i.a aVar) {
        nk0 nk0Var2 = nk0Var;
        imf0 imf0Var2 = imf0Var;
        this.a = nk0Var2;
        this.b = list;
        a1s a1sVar = a1s.c;
        int i = 0;
        this.c = hwr.a(a1sVar, new akw(this, i));
        this.d = hwr.a(a1sVar, new Function0() { // from class: bkw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                ArrayList arrayList = this.a.e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj2 = arrayList.get(0);
                    float fC = ((krz) obj2).a.i.c();
                    int i2 = 1;
                    int size = arrayList.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj3 = arrayList.get(i2);
                            float fC2 = ((krz) obj3).a.i.c();
                            if (Float.compare(fC, fC2) < 0) {
                                obj2 = obj3;
                                fC = fC2;
                            }
                            if (i2 == size) {
                                break;
                            }
                            i2++;
                        }
                    }
                    obj = obj2;
                }
                krz krzVar = (krz) obj;
                return Float.valueOf(krzVar != null ? krzVar.a.i.c() : 0.0f);
            }
        });
        qrz qrzVar = imf0Var2.b;
        nk0 nk0Var3 = qk0.a;
        ArrayList arrayList = nk0Var2.d;
        String str = nk0Var2.b;
        List listR0 = (arrayList == null || (listR0 = CollectionsKt.r0(arrayList, new pk0())) == null) ? m2g.a : listR0;
        ArrayList arrayList2 = new ArrayList();
        gx0 gx0Var = new gx0();
        int size = listR0.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            nk0.d dVar = (nk0.d) listR0.get(i2);
            nk0.d dVarA = nk0.d.a(dVar, qrzVar.a((qrz) dVar.a), i, 14);
            T t = dVarA.a;
            int i4 = dVarA.c;
            int i5 = dVarA.b;
            while (i3 < i5 && !gx0Var.isEmpty()) {
                nk0.d dVar2 = (nk0.d) gx0Var.last();
                int i6 = dVar2.c;
                listR0 = listR0;
                T t2 = dVar2.a;
                if (i5 < i6) {
                    arrayList2.add(new nk0.d(i3, i5, t2));
                    i3 = i5;
                } else {
                    int i7 = size;
                    arrayList2.add(new nk0.d(i3, i6, t2));
                    i3 = dVar2.c;
                    while (!gx0Var.isEmpty() && i3 == ((nk0.d) gx0Var.last()).c) {
                        gx0Var.removeLast();
                    }
                    size = i7;
                }
            }
            List list2 = listR0;
            int i8 = size;
            if (i3 < i5) {
                arrayList2.add(new nk0.d(i3, i5, qrzVar));
                i3 = i5;
            }
            nk0.d dVar3 = (nk0.d) gx0Var.i();
            if (dVar3 != null) {
                int i9 = dVar3.c;
                T t3 = dVar3.a;
                int i10 = dVar3.b;
                if (i10 == i5 && i9 == i4) {
                    gx0Var.removeLast();
                    gx0Var.addLast(new nk0.d(i5, i4, ((qrz) t3).a((qrz) t)));
                } else if (i10 == i9) {
                    arrayList2.add(new nk0.d(i10, i9, t3));
                    gx0Var.removeLast();
                    gx0Var.addLast(new nk0.d(i5, i4, t));
                } else {
                    if (i9 < i4) {
                        d580.a();
                        throw null;
                    }
                    gx0Var.addLast(new nk0.d(i5, i4, ((qrz) t3).a((qrz) t)));
                }
            } else {
                gx0Var.addLast(new nk0.d(i5, i4, t));
            }
            i2++;
            listR0 = list2;
            size = i8;
            i = 0;
        }
        while (i3 <= str.length() && !gx0Var.isEmpty()) {
            nk0.d dVar4 = (nk0.d) gx0Var.last();
            T t4 = dVar4.a;
            int i11 = dVar4.c;
            arrayList2.add(new nk0.d(i3, i11, t4));
            while (!gx0Var.isEmpty() && i11 == ((nk0.d) gx0Var.last()).c) {
                gx0Var.removeLast();
            }
            i3 = i11;
        }
        if (i3 < str.length()) {
            arrayList2.add(new nk0.d(i3, str.length(), qrzVar));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new nk0.d(0, 0, qrzVar));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i12 = 0;
        for (int size2 = arrayList2.size(); i12 < size2; size2 = size2) {
            nk0.d dVar5 = (nk0.d) arrayList2.get(i12);
            int i13 = dVar5.b;
            int i14 = dVar5.c;
            String strSubstring = i13 != i14 ? str.substring(i13, i14) : "";
            List listA = qk0.a(nk0Var2, i13, i14, new ok0(0));
            nk0 nk0Var4 = new nk0(strSubstring, (List<? extends nk0.d<? extends nk0.a>>) (listA == null ? m2g.a : listA));
            qrz qrzVar2 = (qrz) dVar5.a;
            if (qrzVar2.b == Integer.MIN_VALUE) {
                qrzVar2 = new qrz(qrzVar2.a, qrzVar.b, qrzVar2.c, qrzVar2.d, qrzVar2.e, qrzVar2.f, qrzVar2.g, qrzVar2.h, qrzVar2.i);
            }
            imf0 imf0Var3 = new imf0(imf0Var2.a, qrzVar.a(qrzVar2));
            List list3 = nk0Var4.a;
            List list4 = list3 == null ? m2g.a : list3;
            List<nk0.d<ji10>> list5 = this.b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i15 = 0;
            while (i15 < size3) {
                nk0.d<ji10> dVar6 = list5.get(i15);
                int i16 = dVar6.b;
                qrz qrzVar3 = qrzVar;
                int i17 = dVar6.c;
                if (qk0.b(i13, i14, i16, i17)) {
                    if (i13 > i16 || i17 > i14) {
                        xkn.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new nk0.d(i16 - i13, i17 - i13, dVar6.a));
                }
                i15++;
                imf0Var3 = imf0Var3;
                qrzVar = qrzVar3;
            }
            arrayList3.add(new krz(new h90(strSubstring, imf0Var3, list4, arrayList4, aVar, mmdVar), i13, i14));
            i12++;
            nk0Var2 = nk0Var;
            imf0Var2 = imf0Var;
            str = str;
        }
        this.e = arrayList3;
    }

    @Override // defpackage.lrz
    public final boolean a() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((krz) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lrz
    public final float b() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // defpackage.lrz
    public final float c() {
        return ((Number) this.c.getValue()).floatValue();
    }
}
