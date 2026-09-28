package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sok<T> implements Comparator {
    public final /* synthetic */ rok a;

    public sok(rok rokVar) {
        this.a = rokVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Integer num = 1;
        String giftId = ((GiftDetails) t).getGiftId();
        rok rokVar = this.a;
        return (Intrinsics.g(giftId, rokVar.D) ? 0 : num).compareTo(Intrinsics.g(((GiftDetails) t2).getGiftId(), rokVar.D) ? 0 : 1);
    }
}
