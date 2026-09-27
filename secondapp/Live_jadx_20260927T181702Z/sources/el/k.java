package el;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface k {
    @xj.a
    fl.b a(@NonNull fl.a aVar);

    @NonNull
    Task<p> b(boolean z10);

    @NonNull
    Task<Void> delete();

    @NonNull
    Task<String> getId();
}
