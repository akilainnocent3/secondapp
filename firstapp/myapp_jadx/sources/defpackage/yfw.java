package defpackage;

import androidx.recyclerview.widget.n;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yfw extends n.e<MultiMakerItem> {
    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(MultiMakerItem multiMakerItem, MultiMakerItem multiMakerItem2) {
        MultiMakerItem multiMakerItem3 = multiMakerItem;
        MultiMakerItem multiMakerItem4 = multiMakerItem2;
        multiMakerItem3.getClass();
        multiMakerItem4.getClass();
        return Intrinsics.g(multiMakerItem3, multiMakerItem4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(MultiMakerItem multiMakerItem, MultiMakerItem multiMakerItem2) {
        MultiMakerItem multiMakerItem3 = multiMakerItem;
        MultiMakerItem multiMakerItem4 = multiMakerItem2;
        multiMakerItem3.getClass();
        multiMakerItem4.getClass();
        return Intrinsics.g(multiMakerItem3.a.a, multiMakerItem4.a.a);
    }
}
