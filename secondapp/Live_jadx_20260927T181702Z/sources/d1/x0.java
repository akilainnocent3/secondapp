package d1;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Iterable<Intent> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f77693d = "TaskStackBuilder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Intent> f77694b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f77695c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    public x0(Context context) {
        this.f77695c = context;
    }

    @NonNull
    public static x0 g(@NonNull Context context) {
        return new x0(context);
    }

    @Deprecated
    public static x0 i(Context context) {
        return g(context);
    }

    @NonNull
    public x0 a(@NonNull Intent intent) {
        this.f77694b.add(intent);
        return this;
    }

    @NonNull
    public x0 b(@NonNull Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f77695c.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public x0 d(@NonNull Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = y.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f77695c.getPackageManager());
            }
            e(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    @NonNull
    public x0 e(@NonNull ComponentName componentName) {
        int size = this.f77694b.size();
        try {
            Intent intentB = y.b(this.f77695c, componentName);
            while (intentB != null) {
                this.f77694b.add(size, intentB);
                intentB = y.b(this.f77695c, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f77693d, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public x0 f(@NonNull Class<?> cls) {
        return e(new ComponentName(this.f77695c, cls));
    }

    @Nullable
    public Intent h(int i10) {
        return this.f77694b.get(i10);
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f77694b.iterator();
    }

    @Deprecated
    public Intent j(int i10) {
        return h(i10);
    }

    public int l() {
        return this.f77694b.size();
    }

    @NonNull
    public Intent[] m() {
        int size = this.f77694b.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent(this.f77694b.get(0)).addFlags(268484608);
            for (int i10 = 1; i10 < size; i10++) {
                intentArr[i10] = new Intent(this.f77694b.get(i10));
            }
        }
        return intentArr;
    }

    @Nullable
    public PendingIntent n(int i10, int i11) {
        return o(i10, i11, null);
    }

    @Nullable
    public PendingIntent o(int i10, int i11, @Nullable Bundle bundle) {
        if (this.f77694b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f77694b.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f77695c, i10, intentArr, i11, bundle);
    }

    public void p() {
        q(null);
    }

    public void q(@Nullable Bundle bundle) {
        if (this.f77694b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f77694b.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (f1.d.startActivities(this.f77695c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f77695c.startActivity(intent);
    }
}
