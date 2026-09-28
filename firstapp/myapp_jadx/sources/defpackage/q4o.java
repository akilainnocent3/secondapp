package defpackage;

import com.google.protobuf.Reader;
import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q4o<T> implements Comparator {
    public final /* synthetic */ LinkedHashMap a;

    public q4o(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String str = ((x4o) t).d;
        LinkedHashMap linkedHashMap = this.a;
        Integer num = (Integer) linkedHashMap.get(str);
        int iIntValue = Reader.READ_DONE;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        Integer num2 = (Integer) linkedHashMap.get(((x4o) t2).d);
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        return numValueOf.compareTo(Integer.valueOf(iIntValue));
    }
}
