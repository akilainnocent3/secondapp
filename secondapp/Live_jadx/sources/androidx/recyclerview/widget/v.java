package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface v {
    void onChanged(int i10, int i11, @Nullable Object obj);

    void onInserted(int i10, int i11);

    void onMoved(int i10, int i11);

    void onRemoved(int i10, int i11);
}
