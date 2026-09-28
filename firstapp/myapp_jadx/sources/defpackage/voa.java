package defpackage;

import com.google.protobuf.Reader;
import com.sporty.android.book.domain.entity.MarketGroup;
import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class voa<T> implements Comparator {
    public final /* synthetic */ LinkedHashMap a;

    public voa(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String id = ((MarketGroup) t).getId();
        LinkedHashMap linkedHashMap = this.a;
        Integer num = (Integer) linkedHashMap.get(id);
        int iIntValue = Reader.READ_DONE;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        Integer num2 = (Integer) linkedHashMap.get(((MarketGroup) t2).getId());
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        return numValueOf.compareTo(Integer.valueOf(iIntValue));
    }
}
