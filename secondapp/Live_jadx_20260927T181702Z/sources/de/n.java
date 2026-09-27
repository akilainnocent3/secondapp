package de;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
@uk.a
public abstract class n {
    @NonNull
    public static n a(@NonNull List<u> list) {
        return new d(list);
    }

    @NonNull
    public static tk.a b() {
        return new wk.e().k(b.f78867b).l(true).j();
    }

    @NonNull
    @uk.a.InterfaceC1443a(name = "logRequest")
    public abstract List<u> c();
}
