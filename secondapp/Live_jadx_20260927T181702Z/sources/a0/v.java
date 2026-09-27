package a0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Intent f3306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<Uri> f3307b;

    public v(@NonNull Intent intent, @NonNull List<Uri> list) {
        this.f3306a = intent;
        this.f3307b = list;
    }

    @NonNull
    public Intent a() {
        return this.f3306a;
    }

    public final void b(Context context) {
        Iterator<Uri> it = this.f3307b.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.f3306a.getPackage(), it.next(), 1);
        }
    }

    public void c(@NonNull Context context) {
        b(context);
        f1.d.startActivity(context, this.f3306a, null);
    }
}
