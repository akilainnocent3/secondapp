package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes8.dex */
public final class l21 {
    public static boolean a(List list, Predicate predicate) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!predicate.test(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static Object b(int i, Object obj) {
        if (i != Integer.MAX_VALUE) {
            if (obj instanceof List) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(b(i, it.next()));
                }
                return arrayList;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                return str.length() < i ? obj : str.substring(0, i);
            }
            if (obj instanceof ruh0) {
                return c((ruh0) obj, i);
            }
        }
        return obj;
    }

    public static ruh0<?> c(ruh0<?> ruh0Var, final int i) {
        evh0 type = ruh0Var.getType();
        if (type == evh0.a) {
            String str = (String) ruh0Var.getValue();
            return str.length() <= i ? ruh0Var : new dvh0(str.substring(0, i));
        }
        if (type == evh0.d) {
            ByteBuffer byteBuffer = (ByteBuffer) ruh0Var.getValue();
            if (byteBuffer.remaining() <= i) {
                return ruh0Var;
            }
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return new uuh0(Arrays.copyOf(bArr, i));
        }
        if (type == evh0.b) {
            List list = (List) ruh0Var.getValue();
            if (a(list, new Predicate() { // from class: h21
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return l21.d((ruh0) obj, i);
                }
            })) {
                return ruh0Var;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((ruh0) it.next(), i));
            }
            return new tuh0(Collections.unmodifiableList(arrayList));
        }
        if (type != evh0.c) {
            return ruh0Var;
        }
        List<inp> list2 = (List) ruh0Var.getValue();
        if (a(list2, new Predicate() { // from class: i21
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l21.d(((inp) obj).getValue(), i);
            }
        })) {
            return ruh0Var;
        }
        ArrayList arrayList2 = new ArrayList(list2.size());
        for (inp inpVar : list2) {
            arrayList2.add(new gj1(inpVar.getKey(), c(inpVar.getValue(), i)));
        }
        inp[] inpVarArr = (inp[]) arrayList2.toArray(new inp[0]);
        Objects.requireNonNull(inpVarArr, "value must not be null");
        ArrayList arrayList3 = new ArrayList(inpVarArr.length);
        arrayList3.addAll(Arrays.asList(inpVarArr));
        return new mnp(Collections.unmodifiableList(arrayList3));
    }

    public static boolean d(ruh0<?> ruh0Var, final int i) {
        evh0 type = ruh0Var.getType();
        if (type == evh0.a) {
            return ((String) ruh0Var.getValue()).length() < i;
        }
        if (type == evh0.d) {
            return ((ByteBuffer) ruh0Var.getValue()).remaining() <= i;
        }
        if (type == evh0.b) {
            return a((List) ruh0Var.getValue(), new Predicate() { // from class: j21
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return l21.d((ruh0) obj, i);
                }
            });
        }
        if (type == evh0.c) {
            return a((List) ruh0Var.getValue(), new Predicate() { // from class: k21
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return l21.d(((inp) obj).getValue(), i);
                }
            });
        }
        return true;
    }
}
