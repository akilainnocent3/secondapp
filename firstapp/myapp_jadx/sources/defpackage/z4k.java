package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class z4k implements qtm {
    public final ksm a;

    public z4k(ksm ksmVar) {
        ksmVar.getClass();
        this.a = ksmVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.qtm
    public final Object a(x1b x1bVar) {
        y4k y4kVar;
        g48 g48Var;
        y48 y48Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int size;
        int i2;
        int i3;
        Object obj;
        int i4;
        List<Float> list;
        ArrayList arrayList3;
        int i5;
        int i6;
        float fFloatValue;
        if (x1bVar instanceof y4k) {
            y4kVar = (y4k) x1bVar;
            int i7 = y4kVar.d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                y4kVar.d = i7 - Integer.MIN_VALUE;
            } else {
                y4kVar = new y4k(this, x1bVar);
            }
        } else {
            y4kVar = new y4k(this, x1bVar);
        }
        Object objA = y4kVar.b;
        y5b y5bVar = y5b.a;
        int i8 = y4kVar.d;
        ksm ksmVar = this.a;
        if (i8 == 0) {
            uj50.b(objA);
            y4kVar.d = 1;
            objA = ksmVar.a(y4kVar);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i8 == 1) {
            uj50.b(objA);
        } else {
            if (i8 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g48Var = y4kVar.a;
            uj50.b(objA);
        }
        y48Var = (y48) objA;
        if (g48Var instanceof i48) {
            return new j48(null, ((i48) g48Var).a, 1);
        }
        if (y48Var instanceof x48) {
            return new j48(null, ((x48) y48Var).a, 1);
        }
        g48Var.getClass();
        arrayList = ((h48) g48Var).a;
        i = 10;
        arrayList2 = new ArrayList(l48.r(arrayList, 10));
        size = arrayList.size();
        i2 = 0;
        i3 = 0;
        while (i3 < size) {
            obj = arrayList.get(i3);
            i3++;
            i4 = i2 + 1;
            if (i2 >= 0) {
                b.q();
                throw null;
            }
            List list2 = (List) obj;
            try {
                y48Var.getClass();
                list = ((w48) y48Var).a.get(i2);
            } catch (Exception unused) {
                list = m2g.a;
            }
            arrayList3 = new ArrayList(l48.r(list2, i));
            i5 = 0;
            for (Object obj2 : list2) {
                i6 = i5 + 1;
                if (i5 >= 0) {
                    b.q();
                    throw null;
                }
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                try {
                    fFloatValue = list.get(i5).floatValue();
                } catch (Exception unused2) {
                    fFloatValue = 0.0f;
                }
                arrayList3.add(new voe0(fFloatValue, zBooleanValue));
                i5 = i6;
            }
            arrayList2.add(new nu6(arrayList3));
            i2 = i4;
            i = 10;
        }
        return new j48(arrayList2, null, 2);
        g48 g48Var2 = (g48) objA;
        y4kVar.a = g48Var2;
        y4kVar.d = 2;
        Object objB = ksmVar.b(y4kVar);
        if (objB != y5bVar) {
            objA = objB;
            g48Var = g48Var2;
            y48Var = (y48) objA;
            if (g48Var instanceof i48) {
                return new j48(null, ((i48) g48Var).a, 1);
            }
            if (y48Var instanceof x48) {
                return new j48(null, ((x48) y48Var).a, 1);
            }
            g48Var.getClass();
            arrayList = ((h48) g48Var).a;
            i = 10;
            arrayList2 = new ArrayList(l48.r(arrayList, 10));
            size = arrayList.size();
            i2 = 0;
            i3 = 0;
            while (i3 < size) {
                obj = arrayList.get(i3);
                i3++;
                i4 = i2 + 1;
                if (i2 >= 0) {
                    b.q();
                    throw null;
                }
                List list3 = (List) obj;
                y48Var.getClass();
                list = ((w48) y48Var).a.get(i2);
                arrayList3 = new ArrayList(l48.r(list3, i));
                i5 = 0;
                while (r10.hasNext()) {
                    i6 = i5 + 1;
                    if (i5 >= 0) {
                        b.q();
                        throw null;
                    }
                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                    fFloatValue = list.get(i5).floatValue();
                    arrayList3.add(new voe0(fFloatValue, zBooleanValue2));
                    i5 = i6;
                }
                arrayList2.add(new nu6(arrayList3));
                i2 = i4;
                i = 10;
            }
            return new j48(arrayList2, null, 2);
        }
        return y5bVar;
    }
}
