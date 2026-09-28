package defpackage;

import defpackage.bel0;
import defpackage.zdl0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zdl0<MessageType extends bel0<MessageType, BuilderType>, BuilderType extends zdl0<MessageType, BuilderType>> implements jkl0 {
    public static void e(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public static void f(Iterable iterable, List list) {
        Charset charset = kil0.a;
        iterable.getClass();
        if (iterable instanceof zil0) {
            List listZza = ((zil0) iterable).zza();
            zil0 zil0Var = (zil0) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = zil0Var.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = zil0Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            bmy.a(string);
                            return;
                        }
                        zil0Var.remove(size3);
                    }
                } else if (obj instanceof lfl0) {
                    zil0Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    lfl0.h(bArr, 0, bArr.length);
                    zil0Var.zzb();
                } else {
                    zil0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof all0) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof ell0) {
                ell0 ell0Var = (ell0) list;
                int i = ell0Var.c + size4;
                int length = ell0Var.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = xdl0.a(length, 3, 2, 1, 10);
                        }
                        ell0Var.b = Arrays.copyOf(ell0Var.b, length);
                    } else {
                        ell0Var.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    e(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                e(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }
}
