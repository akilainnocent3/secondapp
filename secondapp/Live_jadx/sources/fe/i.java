package fe;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f83915a = "cct";

    public static i a(Context context, pe.a aVar, pe.a aVar2) {
        return new c(context, aVar, aVar2, "cct");
    }

    public static i b(Context context, pe.a aVar, pe.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context c();

    @NonNull
    public abstract String d();

    public abstract pe.a e();

    public abstract pe.a f();
}
