package defpackage;

import com.google.protobuf.Reader;
import com.sportybet.plugin.realsports.data.Market;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class xpu<T> implements Comparator {
    public final /* synthetic */ List a;

    public xpu(List list) {
        this.a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String str = ((Market) t).id;
        List list = this.a;
        Integer numValueOf = Integer.valueOf(list.indexOf(str));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        int iIntValue = Reader.READ_DONE;
        Integer numValueOf2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE);
        Integer numValueOf3 = Integer.valueOf(list.indexOf(((Market) t2).id));
        Integer num = numValueOf3.intValue() >= 0 ? numValueOf3 : null;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return numValueOf2.compareTo(Integer.valueOf(iIntValue));
    }
}
